package com.yalantis.ucrop.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(Charset.forName("UTF-8"));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    private static int calcTagOffset(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean handles(int i) {
        return (i & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i == MOTOROLA_TIFF_MAGIC_NUMBER || i == INTEL_TIFF_MAGIC_NUMBER;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    public int getOrientation() throws IOException {
        int uInt16 = this.reader.getUInt16();
        if (!handles(uInt16)) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Parser doesn't handle magic number: " + uInt16);
            }
            return -1;
        }
        int moveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength();
        if (moveToExifSegmentAndGetLength == -1) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        return parseExifSegment(new byte[moveToExifSegmentAndGetLength], moveToExifSegmentAndGetLength);
    }

    private int parseExifSegment(byte[] bArr, int i) throws IOException {
        int read = this.reader.read(bArr, i);
        if (read != i) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Unable to read exif segment data, length: " + i + ", actually read: " + read);
            }
            return -1;
        }
        if (hasJpegExifPreamble(bArr, i)) {
            return parseExifSegment(new RandomAccessReader(bArr, i));
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Missing jpeg exif preamble");
        }
        return -1;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i) {
        boolean z = bArr != null && i > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int moveToExifSegmentAndGetLength() throws IOException {
        short uInt8;
        int uInt16;
        long j;
        long skip;
        do {
            short uInt82 = this.reader.getUInt8();
            if (uInt82 != 255) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Unknown segmentId=" + ((int) uInt82));
                }
                return -1;
            }
            uInt8 = this.reader.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j = uInt16;
            skip = this.reader.skip(j);
        } while (skip == j);
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Unable to skip enough data, type: " + ((int) uInt8) + ", wanted to skip: " + uInt16 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16 = randomAccessReader.getInt16(6);
        if (int16 == MOTOROLA_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (int16 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Unknown endianness = " + ((int) int16));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int162 = randomAccessReader.getInt16(int32);
        for (int i = 0; i < int162; i++) {
            int calcTagOffset = calcTagOffset(int32, i);
            short int163 = randomAccessReader.getInt16(calcTagOffset);
            if (int163 == 274) {
                short int164 = randomAccessReader.getInt16(calcTagOffset + 2);
                if (int164 < 1 || int164 > 12) {
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "Got invalid format code = " + ((int) int164));
                    }
                } else {
                    int int322 = randomAccessReader.getInt32(calcTagOffset + 4);
                    if (int322 < 0) {
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Got tagIndex=" + i + " tagType=" + ((int) int163) + " formatCode=" + ((int) int164) + " componentCount=" + int322);
                        }
                        int i2 = int322 + BYTES_PER_FORMAT[int164];
                        if (i2 > 4) {
                            if (Log.isLoggable(TAG, 3)) {
                                Log.d(TAG, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) int164));
                            }
                        } else {
                            int i3 = calcTagOffset + 8;
                            if (i3 < 0 || i3 > randomAccessReader.length()) {
                                if (Log.isLoggable(TAG, 3)) {
                                    Log.d(TAG, "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) int163));
                                }
                            } else if (i2 < 0 || i2 + i3 > randomAccessReader.length()) {
                                if (Log.isLoggable(TAG, 3)) {
                                    Log.d(TAG, "Illegal number of bytes for TI tag data tagType=" + ((int) int163));
                                }
                            } else {
                                return randomAccessReader.getInt16(i3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private static class RandomAccessReader {
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }

        public int length() {
            return this.data.remaining();
        }

        public int getInt32(int i) {
            return this.data.getInt(i);
        }

        public short getInt16(int i) {
            return this.data.getShort(i);
        }
    }

    private static class StreamReader implements Reader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return ((this.is.read() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            return (short) (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.is.skip(j2);
                if (skip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.is.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    public static void copyExif(ExifInterface exifInterface, int i, int i2, String str) {
        try {
            copyExifAttributes(exifInterface, new ExifInterface(str), i, i2);
        } catch (IOException e) {
            Log.d(TAG, e.getMessage());
        }
    }

    public static void copyExif(Context context, int i, int i2, Uri uri, String str) {
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new ExifInterface(inputStream), new ExifInterface(str), i, i2);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d(TAG, e.getMessage(), e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e2) {
                Log.d(TAG, e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d(TAG, e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copyExif(Context context, int i, int i2, Uri uri, Uri uri2) {
        ParcelFileDescriptor parcelFileDescriptor;
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        InputStream inputStream = null;
        r1 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        inputStream = null;
        try {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    ExifInterface exifInterface = new ExifInterface(openInputStream);
                    parcelFileDescriptor2 = context.getContentResolver().openFileDescriptor(uri2, "rw");
                    copyExifAttributes(exifInterface, new ExifInterface(parcelFileDescriptor2.getFileDescriptor()), i, i2);
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.d(TAG, e.getMessage(), e);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    inputStream = openInputStream;
                    try {
                        Log.d(TAG, e.getMessage(), e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                Log.d(TAG, e3.getMessage(), e3);
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                Log.d(TAG, e4.getMessage(), e4);
                            }
                        }
                        if (parcelFileDescriptor == null) {
                            try {
                                parcelFileDescriptor.close();
                                throw th;
                            } catch (IOException e5) {
                                Log.d(TAG, e5.getMessage(), e5);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                    }
                    if (parcelFileDescriptor == null) {
                    }
                }
            } catch (IOException e6) {
                Log.d(TAG, e6.getMessage(), e6);
                return;
            }
        } catch (IOException e7) {
            e = e7;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor2 != null) {
            parcelFileDescriptor2.close();
        }
    }

    public static void copyExif(Context context, ExifInterface exifInterface, int i, int i2, Uri uri) {
        if (context == null) {
            Log.d(TAG, "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    copyExifAttributes(exifInterface, new ExifInterface(parcelFileDescriptor.getFileDescriptor()), i, i2);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                } catch (IOException e) {
                    Log.d(TAG, e.getMessage());
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                }
            } catch (IOException e2) {
                Log.d(TAG, e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e3) {
                    Log.d(TAG, e3.getMessage(), e3);
                }
            }
            throw th;
        }
    }

    private static void copyExifAttributes(ExifInterface exifInterface, ExifInterface exifInterface2, int i, int i2) throws IOException {
        String[] strArr = {ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_WHITE_BALANCE};
        for (int i3 = 0; i3 < 22; i3++) {
            String str = strArr[i3];
            String attribute = exifInterface.getAttribute(str);
            if (!TextUtils.isEmpty(attribute)) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
        exifInterface2.setAttribute(ExifInterface.TAG_ORIENTATION, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        exifInterface2.saveAttributes();
    }
}
