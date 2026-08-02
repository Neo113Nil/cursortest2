package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.facebook.react.common.assets.ReactFontManager;
import com.plaid.internal.EnumC3631g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    public static final e[][] f19811A;

    /* renamed from: B, reason: collision with root package name */
    public static final Set f19812B;

    /* renamed from: C, reason: collision with root package name */
    public static final HashMap f19813C;

    /* renamed from: D, reason: collision with root package name */
    public static final Charset f19814D;

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f19815E;
    private static final e[] EXIF_POINTER_TAGS;

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f19816F;

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f19817G;

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f19818H;
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final e[] IFD_EXIF_TAGS;
    private static final e[] IFD_GPS_TAGS;
    private static final e[] IFD_INTEROPERABILITY_TAGS;
    private static final e[] IFD_THUMBNAIL_TAGS;
    private static final e[] IFD_TIFF_TAGS;
    private static final e[] ORF_CAMERA_SETTINGS_TAGS;
    private static final e[] ORF_IMAGE_PROCESSING_TAGS;
    private static final e[] ORF_MAKER_NOTE_TAGS;
    private static final e[] PEF_TAGS;
    private static final HashMap<Integer, e>[] sExifTagMapsForReading;
    private static final HashMap<String, e>[] sExifTagMapsForWriting;

    /* renamed from: x, reason: collision with root package name */
    public static final SimpleDateFormat f19822x;

    /* renamed from: y, reason: collision with root package name */
    public static final SimpleDateFormat f19823y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f19824z;

    /* renamed from: a, reason: collision with root package name */
    public String f19825a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f19826b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f19827c;

    /* renamed from: d, reason: collision with root package name */
    public int f19828d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19829e;

    /* renamed from: f, reason: collision with root package name */
    public Set f19830f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f19831g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19832h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19833i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19834j;

    /* renamed from: k, reason: collision with root package name */
    public int f19835k;

    /* renamed from: l, reason: collision with root package name */
    public int f19836l;

    /* renamed from: m, reason: collision with root package name */
    public int f19837m;
    private final HashMap<String, d>[] mAttributes;
    private byte[] mThumbnailBytes;

    /* renamed from: n, reason: collision with root package name */
    public int f19838n;

    /* renamed from: o, reason: collision with root package name */
    public int f19839o;

    /* renamed from: p, reason: collision with root package name */
    public int f19840p;

    /* renamed from: q, reason: collision with root package name */
    public int f19841q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19842r;

    /* renamed from: s, reason: collision with root package name */
    public d f19843s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19844t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f19819u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    public static final List f19820v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w, reason: collision with root package name */
    public static final List f19821w = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    static final byte[] JPEG_SIGNATURE = {-1, -40, -1};
    private static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    private static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, 49};
    private static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    private static final byte[] HEIF_BRAND_AVIF = {97, 118, 105, 102};
    private static final byte[] HEIF_BRAND_AVIS = {97, 118, 105, 115};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] PNG_SIGNATURE = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] PNG_ITXT_XMP_KEYWORD = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] WEBP_SIGNATURE_1 = {82, 73, 70, 70};
    private static final byte[] WEBP_SIGNATURE_2 = {87, 69, 66, 80};
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = {69, 88, 73, 70};
    private static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, 42};
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    public class C0377a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        public long f19845a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f19846b;

        public C0377a(g gVar) {
            this.f19846b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f19845a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f19846b.available()) {
                        return -1;
                    }
                    this.f19846b.w0(j10);
                    this.f19845a = j10;
                }
                if (i11 > this.f19846b.available()) {
                    i11 = this.f19846b.available();
                }
                int read = this.f19846b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f19845a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f19845a = -1L;
            return -1;
        }
    }

    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final DataOutputStream f19852a;

        /* renamed from: b, reason: collision with root package name */
        public ByteOrder f19853b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f19852a = new DataOutputStream(outputStream);
            this.f19853b = byteOrder;
        }

        public void B(short s10) {
            ByteOrder byteOrder = this.f19853b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f19852a.write(s10 & 255);
                this.f19852a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f19852a.write((s10 >>> 8) & 255);
                this.f19852a.write(s10 & 255);
            }
        }

        public void J(long j10) {
            if (j10 > BodyPartID.bodyIdMax) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            r((int) j10);
        }

        public void U(int i10) {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            B((short) i10);
        }

        public void d(ByteOrder byteOrder) {
            this.f19853b = byteOrder;
        }

        public void k(int i10) {
            this.f19852a.write(i10);
        }

        public void r(int i10) {
            ByteOrder byteOrder = this.f19853b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f19852a.write(i10 & 255);
                this.f19852a.write((i10 >>> 8) & 255);
                this.f19852a.write((i10 >>> 16) & 255);
                this.f19852a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f19852a.write((i10 >>> 24) & 255);
                this.f19852a.write((i10 >>> 16) & 255);
                this.f19852a.write((i10 >>> 8) & 255);
                this.f19852a.write(i10 & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f19852a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f19852a.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f19854a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19855b;
        public final byte[] bytes;

        /* renamed from: c, reason: collision with root package name */
        public final long f19856c;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f19814D);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f19861a);
                wrap.putInt((int) fVar.f19862b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f19814D);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f19861a);
                wrap.putInt((int) fVar.f19862b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            }
            if (o10 instanceof long[]) {
                if (((long[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof int[]) {
                if (((int[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o10;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            }
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o10;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(o10 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o10;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f19861a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f19862b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:110:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:119:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v21, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v23, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v25, types: [androidx.exifinterface.media.a$f[]] */
        /* JADX WARN: Type inference failed for: r13v27, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v29, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v31, types: [androidx.exifinterface.media.a$f[]] */
        /* JADX WARN: Type inference failed for: r13v33, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v36, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object o(ByteOrder byteOrder) {
            Throwable th2;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            String str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.bytes);
                    try {
                        bVar.J(byteOrder);
                        int i10 = 0;
                        switch (this.f19854a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.bytes;
                                if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                    str = new String(new char[]{(char) (b10 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f19814D);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f19855b >= a.EXIF_ASCII_PREFIX.length) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= a.EXIF_ASCII_PREFIX.length) {
                                            i10 = a.EXIF_ASCII_PREFIX.length;
                                        } else if (this.bytes[i11] == a.EXIF_ASCII_PREFIX[i11]) {
                                            i11++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (i10 < this.f19855b && (b11 = this.bytes[i10]) != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    i10++;
                                }
                                str = sb2.toString();
                                break;
                            case 3:
                                ?? r13 = new int[this.f19855b];
                                while (true) {
                                    str = r13;
                                    if (i10 < this.f19855b) {
                                        r13[i10] = bVar.readUnsignedShort();
                                        i10++;
                                    }
                                }
                                break;
                            case 4:
                                ?? r132 = new long[this.f19855b];
                                while (true) {
                                    str = r132;
                                    if (i10 < this.f19855b) {
                                        r132[i10] = bVar.B();
                                        i10++;
                                    }
                                }
                                break;
                            case 5:
                                ?? r133 = new f[this.f19855b];
                                while (true) {
                                    str = r133;
                                    if (i10 < this.f19855b) {
                                        r133[i10] = new f(bVar.B(), bVar.B(), null);
                                        i10++;
                                    }
                                }
                                break;
                            case 8:
                                ?? r134 = new int[this.f19855b];
                                while (true) {
                                    str = r134;
                                    if (i10 < this.f19855b) {
                                        r134[i10] = bVar.readShort();
                                        i10++;
                                    }
                                }
                                break;
                            case 9:
                                ?? r135 = new int[this.f19855b];
                                while (true) {
                                    str = r135;
                                    if (i10 < this.f19855b) {
                                        r135[i10] = bVar.readInt();
                                        i10++;
                                    }
                                }
                                break;
                            case 10:
                                ?? r136 = new f[this.f19855b];
                                while (true) {
                                    str = r136;
                                    if (i10 < this.f19855b) {
                                        r136[i10] = new f(bVar.readInt(), bVar.readInt(), null);
                                        i10++;
                                    }
                                }
                                break;
                            case 11:
                                ?? r137 = new double[this.f19855b];
                                while (true) {
                                    str = r137;
                                    if (i10 < this.f19855b) {
                                        r137[i10] = bVar.readFloat();
                                        i10++;
                                    }
                                }
                                break;
                            case 12:
                                ?? r138 = new double[this.f19855b];
                                while (true) {
                                    str = r138;
                                    if (i10 < this.f19855b) {
                                        r138[i10] = bVar.readDouble();
                                        i10++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            return str;
                        }
                    } catch (IOException e13) {
                        iOException = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th2;
                    }
                    try {
                        inputStream2.close();
                        throw th2;
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        throw th2;
                    }
                }
            } catch (IOException e16) {
                iOException = e16;
                bVar = null;
            } catch (Throwable th4) {
                th2 = th4;
                if (inputStream2 != null) {
                }
            }
        }

        public int p() {
            return a.IFD_FORMAT_BYTES_PER_FORMAT[this.f19854a] * this.f19855b;
        }

        public String toString() {
            return "(" + a.IFD_FORMAT_NAMES[this.f19854a] + ", data length:" + this.bytes.length + ")";
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f19854a = i10;
            this.f19855b = i11;
            this.f19856c = j10;
            this.bytes = bArr;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f19861a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19862b;

        public /* synthetic */ f(long j10, long j11, C0377a c0377a) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new f(d10 > 0.0d ? LongCompanionObject.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double abs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = abs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(abs - (j10 / j11)) <= 1.0E-8d * abs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new f(j10, j11);
        }

        public double a() {
            return this.f19861a / this.f19862b;
        }

        public String toString() {
            return this.f19861a + "/" + this.f19862b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f19861a = 0L;
                this.f19862b = 1L;
            } else {
                this.f19861a = j10;
                this.f19862b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new e("BitsPerSample", EnumC3631g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new e("Compression", EnumC3631g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new e("PhotometricInterpretation", EnumC3631g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new e("ImageDescription", 270, 2), new e("Make", EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new e("Model", EnumC3631g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new e("StripOffsets", EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new e("RowsPerStrip", EnumC3631g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new e("StripByteCounts", EnumC3631g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new e("XResolution", EnumC3631g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new e("YResolution", EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new e("PlanarConfiguration", EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new e("ResolutionUnit", EnumC3631g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new e("WhitePoint", EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new e("PrimaryChromaticities", EnumC3631g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", ReactFontManager.TypefaceStyle.BOLD, 1)};
        IFD_TIFF_TAGS = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        IFD_EXIF_TAGS = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        IFD_GPS_TAGS = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        IFD_INTEROPERABILITY_TAGS = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new e("BitsPerSample", EnumC3631g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new e("Compression", EnumC3631g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new e("PhotometricInterpretation", EnumC3631g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new e("ImageDescription", 270, 2), new e("Make", EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new e("Model", EnumC3631g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new e("StripOffsets", EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new e("RowsPerStrip", EnumC3631g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new e("StripByteCounts", EnumC3631g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new e("XResolution", EnumC3631g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new e("YResolution", EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new e("PlanarConfiguration", EnumC3631g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new e("ResolutionUnit", EnumC3631g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new e("WhitePoint", EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new e("PrimaryChromaticities", EnumC3631g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = eVarArr5;
        f19824z = new e("StripOffsets", EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        ORF_MAKER_NOTE_TAGS = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 4), new e("PreviewImageLength", EnumC3631g.SDK_ASSET_HEADER_BOLT_VALUE, 4)};
        ORF_CAMERA_SETTINGS_TAGS = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        PEF_TAGS = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f19811A = eVarArr10;
        EXIF_POINTER_TAGS = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        sExifTagMapsForReading = new HashMap[eVarArr10.length];
        sExifTagMapsForWriting = new HashMap[eVarArr10.length];
        f19812B = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f19813C = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f19814D = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f19822x = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f19823y = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f19811A;
            if (i10 >= eVarArr11.length) {
                HashMap hashMap = f19813C;
                e[] eVarArr12 = EXIF_POINTER_TAGS;
                hashMap.put(Integer.valueOf(eVarArr12[0].f19857a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f19857a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f19857a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f19857a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f19857a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f19857a), 8);
                f19815E = Pattern.compile(".*[1-9].*");
                f19816F = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f19817G = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f19818H = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            sExifTagMapsForReading[i10] = new HashMap<>();
            sExifTagMapsForWriting[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                sExifTagMapsForReading[i10].put(Integer.valueOf(eVar.f19857a), eVar);
                sExifTagMapsForWriting[i10].put(eVar.f19858b, eVar);
            }
            i10++;
        }
    }

    public a(File file) {
        e[][] eVarArr = f19811A;
        this.mAttributes = new HashMap[eVarArr.length];
        this.f19830f = new HashSet(eVarArr.length);
        this.f19831g = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        B(file.getAbsolutePath());
    }

    public static boolean D(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean I(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean K(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    public static boolean c0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static void e0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    public static int x(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    public static Pair y(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair y10 = y(split[0]);
            if (((Integer) y10.first).intValue() == 2) {
                return y10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair y11 = y(split[i10]);
                int intValue = (((Integer) y11.first).equals(y10.first) || ((Integer) y11.second).equals(y10.first)) ? ((Integer) y10.first).intValue() : -1;
                int intValue2 = (((Integer) y10.second).intValue() == -1 || !(((Integer) y11.first).equals(y10.second) || ((Integer) y11.second).equals(y10.second))) ? -1 : ((Integer) y10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    y10 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    y10 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return y10;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void A(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] c10 = androidx.exifinterface.media.b.c(dVar.o(this.f19831g));
        long[] c11 = androidx.exifinterface.media.b.c(dVar2.o(this.f19831g));
        if (c10 == null || c10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c11 == null || c11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c10.length != c11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : c11) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f19834j = true;
        this.f19833i = true;
        this.f19832h = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < c10.length; i13++) {
            int i14 = (int) c10[i13];
            int i15 = (int) c11[i13];
            if (i13 < c10.length - 1 && i14 + i15 != c10[i13 + 1]) {
                this.f19834j = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                return;
            }
            try {
                bVar.U(i16);
                int i17 = i11 + i16;
                byte[] bArr2 = new byte[i15];
                bVar.readFully(bArr2);
                i11 = i17 + i15;
                System.arraycopy(bArr2, 0, bArr, i12, i15);
                i12 += i15;
            } catch (EOFException unused) {
                return;
            }
        }
        this.mThumbnailBytes = bArr;
        if (this.f19834j) {
            this.f19835k = (int) c10[0];
            this.f19836l = i10;
        }
    }

    public final void B(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f19827c = null;
        this.f19825a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (I(fileInputStream.getFD())) {
                this.f19826b = fileInputStream.getFD();
            } else {
                this.f19826b = null;
            }
            N(fileInputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(fileInputStream2);
            throw th;
        }
    }

    public final int C(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, HEIF_TYPE_FTYP)) {
            bVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return 0;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            try {
                bVar.readFully(bArr3);
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, HEIF_BRAND_MIF1)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, HEIF_BRAND_HEIC)) {
                        z11 = true;
                    } else if (Arrays.equals(bArr3, HEIF_BRAND_AVIF) || Arrays.equals(bArr3, HEIF_BRAND_AVIS)) {
                        z12 = true;
                    }
                    if (!z10) {
                        continue;
                    } else {
                        if (z11) {
                            bVar.close();
                            return 12;
                        }
                        if (z12) {
                            bVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused3) {
                bVar.close();
                return 0;
            }
        }
        bVar.close();
        return 0;
    }

    public final boolean E(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q10 = Q(bVar2);
                this.f19831g = Q10;
                bVar2.J(Q10);
                short readShort = bVar2.readShort();
                boolean z10 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = PNG_SIGNATURE;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q10 = Q(bVar2);
                this.f19831g = Q10;
                bVar2.J(Q10);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean J(HashMap hashMap) {
        d dVar;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.o(this.f19831g);
        int[] iArr2 = BITS_PER_SAMPLE_RGB;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f19828d != 3 || (dVar = (d) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int m10 = dVar.m(this.f19831g);
        return (m10 == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (m10 == 6 && Arrays.equals(iArr, iArr2));
    }

    public final boolean L(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f19831g) <= 512 && dVar2.m(this.f19831g) <= 512;
    }

    public final boolean M(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = WEBP_SIGNATURE_1;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = WEBP_SIGNATURE_2;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[WEBP_SIGNATURE_1.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x001c, B:9:0x0020, B:10:0x002e, B:12:0x0036, B:14:0x003f, B:22:0x0071, B:28:0x0050, B:35:0x005e, B:38:0x0066, B:39:0x006a, B:40:0x006e, B:41:0x007b, B:43:0x0085, B:46:0x008d, B:49:0x0095, B:52:0x009d, B:61:0x00ab, B:63:0x00af), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(InputStream inputStream) {
        boolean z10;
        for (int i10 = 0; i10 < f19811A.length; i10++) {
            try {
                try {
                    this.mAttributes[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    e();
                    if (f19819u) {
                        P();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                z10 = f19819u;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z10) {
                    return;
                }
                P();
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z10 = f19819u;
                if (z10) {
                }
                e();
                if (z10) {
                }
            }
        }
        if (!this.f19829e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f19828d = m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (c0(this.f19828d)) {
            g gVar = new g(inputStream);
            if (!this.f19829e) {
                int i11 = this.f19828d;
                if (i11 != 12 && i11 != 15) {
                    if (i11 == 7) {
                        n(gVar);
                    } else if (i11 == 10) {
                        s(gVar);
                    } else {
                        q(gVar);
                    }
                }
                k(gVar, i11);
            } else if (!t(gVar)) {
                e();
                if (f19819u) {
                    P();
                    return;
                }
                return;
            }
            gVar.w0(this.f19838n);
            b0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f19828d;
            if (i12 == 4) {
                l(bVar, 0, 0);
            } else if (i12 == 13) {
                o(bVar);
            } else if (i12 == 9) {
                p(bVar);
            } else if (i12 == 14) {
                w(bVar);
            }
        }
        e();
        if (f19819u) {
            P();
        }
    }

    public final void O(b bVar) {
        ByteOrder Q10 = Q(bVar);
        this.f19831g = Q10;
        bVar.J(Q10);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f19828d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.U(i11);
        }
    }

    public final void P() {
        for (int i10 = 0; i10 < this.mAttributes.length; i10++) {
            this.mAttributes[i10].size();
            for (Map.Entry<String, d> entry : this.mAttributes[i10].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.n(this.f19831g);
            }
        }
    }

    public final ByteOrder Q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void R(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        O(gVar);
        S(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(g gVar, int i10) {
        short s10;
        long j10;
        int i11;
        long j11;
        boolean z10;
        short s11;
        boolean z11;
        int i12;
        int readUnsignedShort;
        long j12;
        int i13 = i10;
        this.f19830f.add(Integer.valueOf(gVar.k()));
        short readShort = gVar.readShort();
        if (readShort <= 0) {
            return;
        }
        short s12 = 0;
        while (s12 < readShort) {
            int readUnsignedShort2 = gVar.readUnsignedShort();
            int readUnsignedShort3 = gVar.readUnsignedShort();
            int readInt = gVar.readInt();
            long k10 = gVar.k() + 4;
            e eVar = sExifTagMapsForReading[i13].get(Integer.valueOf(readUnsignedShort2));
            boolean z12 = f19819u;
            if (z12) {
                j10 = 4;
                i11 = 4;
                s10 = readShort;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i13), Integer.valueOf(readUnsignedShort2), eVar != null ? eVar.f19858b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
            } else {
                s10 = readShort;
                j10 = 4;
                i11 = 4;
            }
            if (eVar != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < IFD_FORMAT_BYTES_PER_FORMAT.length) {
                    if (eVar.a(readUnsignedShort3)) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = eVar.f19859c;
                        }
                        j11 = readInt * r7[readUnsignedShort3];
                        if (j11 >= 0 && j11 <= 2147483647L) {
                            z10 = true;
                            if (z10) {
                                if (j11 > j10) {
                                    int readInt2 = gVar.readInt();
                                    s11 = s12;
                                    if (this.f19828d == 7) {
                                        if ("MakerNote".equals(eVar.f19858b)) {
                                            this.f19839o = readInt2;
                                        } else if (i13 == 6 && "ThumbnailImage".equals(eVar.f19858b)) {
                                            this.f19840p = readInt2;
                                            this.f19841q = readInt;
                                            d j13 = d.j(6, this.f19831g);
                                            z11 = z12;
                                            d f10 = d.f(this.f19840p, this.f19831g);
                                            i12 = readUnsignedShort2;
                                            d f11 = d.f(this.f19841q, this.f19831g);
                                            this.mAttributes[i11].put("Compression", j13);
                                            this.mAttributes[i11].put("JPEGInterchangeFormat", f10);
                                            this.mAttributes[i11].put("JPEGInterchangeFormatLength", f11);
                                            gVar.w0(readInt2);
                                        }
                                    }
                                    z11 = z12;
                                    i12 = readUnsignedShort2;
                                    gVar.w0(readInt2);
                                } else {
                                    s11 = s12;
                                    z11 = z12;
                                    i12 = readUnsignedShort2;
                                }
                                Integer num = (Integer) f19813C.get(Integer.valueOf(i12));
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 == i11) {
                                            j12 = gVar.B();
                                        } else if (readUnsignedShort3 == 8) {
                                            readUnsignedShort = gVar.readShort();
                                        } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                            readUnsignedShort = gVar.readInt();
                                        } else {
                                            j12 = -1;
                                        }
                                        if (z11) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j12), eVar.f19858b);
                                        }
                                        if (j12 > 0 || (gVar.d() != -1 && j12 >= gVar.d())) {
                                            if (z11) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Skip jump into the IFD since its offset is invalid: ");
                                                sb2.append(j12);
                                                if (gVar.d() != -1) {
                                                    gVar.d();
                                                }
                                            }
                                        } else if (!this.f19830f.contains(Integer.valueOf((int) j12))) {
                                            gVar.w0(j12);
                                            S(gVar, num.intValue());
                                        }
                                        gVar.w0(k10);
                                    } else {
                                        readUnsignedShort = gVar.readUnsignedShort();
                                    }
                                    j12 = readUnsignedShort;
                                    if (z11) {
                                    }
                                    if (j12 > 0) {
                                    }
                                    if (z11) {
                                    }
                                    gVar.w0(k10);
                                } else {
                                    int k11 = gVar.k() + this.f19838n;
                                    byte[] bArr = new byte[(int) j11];
                                    gVar.readFully(bArr);
                                    d dVar = new d(readUnsignedShort3, readInt, k11, bArr);
                                    this.mAttributes[i10].put(eVar.f19858b, dVar);
                                    if ("DNGVersion".equals(eVar.f19858b)) {
                                        this.f19828d = 3;
                                    }
                                    if ((("Make".equals(eVar.f19858b) || "Model".equals(eVar.f19858b)) && dVar.n(this.f19831g).contains("PENTAX")) || ("Compression".equals(eVar.f19858b) && dVar.m(this.f19831g) == 65535)) {
                                        this.f19828d = 8;
                                    }
                                    if (gVar.k() != k10) {
                                        gVar.w0(k10);
                                    }
                                }
                            } else {
                                gVar.w0(k10);
                                s11 = s12;
                            }
                            s12 = (short) (s11 + 1);
                            i13 = i10;
                            readShort = s10;
                        }
                        z10 = false;
                        if (z10) {
                        }
                        s12 = (short) (s11 + 1);
                        i13 = i10;
                        readShort = s10;
                    } else if (z12) {
                        String str = IFD_FORMAT_NAMES[readUnsignedShort3];
                    }
                }
            }
            j11 = 0;
            z10 = false;
            if (z10) {
            }
            s12 = (short) (s11 + 1);
            i13 = i10;
            readShort = s10;
        }
        int readInt3 = gVar.readInt();
        if (f19819u) {
            String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
        }
        long j14 = readInt3;
        if (j14 <= 0 || this.f19830f.contains(Integer.valueOf(readInt3))) {
            return;
        }
        gVar.w0(j14);
        if (this.mAttributes[4].isEmpty()) {
            S(gVar, 4);
        } else if (this.mAttributes[5].isEmpty()) {
            S(gVar, 5);
        }
    }

    public final void T(String str) {
        for (int i10 = 0; i10 < f19811A.length; i10++) {
            this.mAttributes[i10].remove(str);
        }
    }

    public final void U(int i10, String str, String str2) {
        if (this.mAttributes[i10].isEmpty() || this.mAttributes[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.mAttributes[i10];
        hashMap.put(str2, hashMap.get(str));
        this.mAttributes[i10].remove(str);
    }

    public final void V(g gVar, int i10) {
        d dVar = this.mAttributes[i10].get("ImageLength");
        d dVar2 = this.mAttributes[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.mAttributes[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.mAttributes[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m10 = dVar3.m(this.f19831g);
            int m11 = dVar3.m(this.f19831g);
            gVar.w0(m10);
            byte[] bArr = new byte[m11];
            gVar.readFully(bArr);
            l(new b(bArr), m10, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W() {
        FileOutputStream fileOutputStream;
        File createTempFile;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream inputStream;
        Exception e10;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream2;
        if (!K(this.f19828d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f19826b == null && this.f19825a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f19832h && this.f19833i && !this.f19834j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f19842r = true;
        this.mThumbnailBytes = u();
        InputStream inputStream2 = null;
        try {
            createTempFile = File.createTempFile("temp", "tmp");
            if (this.f19825a != null) {
                fileInputStream = new FileInputStream(this.f19825a);
            } else {
                Os.lseek(this.f19826b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f19826b);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            androidx.exifinterface.media.b.d(fileInputStream, fileOutputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
            androidx.exifinterface.media.b.b(fileOutputStream);
            try {
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                try {
                    fileInputStream2 = new FileInputStream(createTempFile);
                } catch (Throwable th5) {
                    th = th5;
                    closeable = null;
                    androidx.exifinterface.media.b.b(inputStream2);
                    androidx.exifinterface.media.b.b(closeable);
                    if (0 == 0) {
                        createTempFile.delete();
                    }
                    throw th;
                }
                try {
                    if (this.f19825a != null) {
                        fileOutputStream3 = new FileOutputStream(this.f19825a);
                    } else {
                        Os.lseek(this.f19826b, 0L, OsConstants.SEEK_SET);
                        fileOutputStream3 = new FileOutputStream(this.f19826b);
                    }
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                            try {
                                int i10 = this.f19828d;
                                if (i10 == 4) {
                                    X(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 13) {
                                    Y(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 14) {
                                    Z(bufferedInputStream, bufferedOutputStream);
                                }
                                androidx.exifinterface.media.b.b(bufferedInputStream);
                                androidx.exifinterface.media.b.b(bufferedOutputStream);
                                createTempFile.delete();
                                this.mThumbnailBytes = null;
                            } catch (Exception e13) {
                                exc = e13;
                                inputStream2 = fileInputStream2;
                                try {
                                    inputStream = new FileInputStream(createTempFile);
                                    try {
                                        if (this.f19825a == null) {
                                            fileOutputStream4 = new FileOutputStream(this.f19825a);
                                        } else {
                                            Os.lseek(this.f19826b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream4 = new FileOutputStream(this.f19826b);
                                        }
                                        fileOutputStream3 = fileOutputStream4;
                                        androidx.exifinterface.media.b.d(inputStream, fileOutputStream3);
                                        androidx.exifinterface.media.b.b(inputStream);
                                        androidx.exifinterface.media.b.b(fileOutputStream3);
                                        throw new IOException("Failed to save new file", exc);
                                    } catch (Exception e14) {
                                        e10 = e14;
                                        try {
                                            throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e10);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            inputStream2 = inputStream;
                                            androidx.exifinterface.media.b.b(inputStream2);
                                            androidx.exifinterface.media.b.b(fileOutputStream3);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        inputStream2 = inputStream;
                                        androidx.exifinterface.media.b.b(inputStream2);
                                        androidx.exifinterface.media.b.b(fileOutputStream3);
                                        throw th;
                                    }
                                } catch (Exception e15) {
                                    inputStream = inputStream2;
                                    e10 = e15;
                                } catch (Throwable th8) {
                                    th = th8;
                                    androidx.exifinterface.media.b.b(inputStream2);
                                    androidx.exifinterface.media.b.b(fileOutputStream3);
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            inputStream2 = fileInputStream2;
                            exc = e16;
                        } catch (Throwable th9) {
                            th = th9;
                            closeable = null;
                            inputStream2 = bufferedInputStream;
                            androidx.exifinterface.media.b.b(inputStream2);
                            androidx.exifinterface.media.b.b(closeable);
                            if (0 == 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        inputStream2 = fileInputStream2;
                        exc = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    fileOutputStream2 = null;
                    inputStream2 = fileInputStream2;
                    exc = e;
                    fileOutputStream3 = fileOutputStream2;
                    inputStream = new FileInputStream(createTempFile);
                    if (this.f19825a == null) {
                    }
                    fileOutputStream3 = fileOutputStream4;
                    androidx.exifinterface.media.b.d(inputStream, fileOutputStream3);
                    androidx.exifinterface.media.b.b(inputStream);
                    androidx.exifinterface.media.b.b(fileOutputStream3);
                    throw new IOException("Failed to save new file", exc);
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream2 = null;
            }
        } catch (Exception e20) {
            e = e20;
            inputStream2 = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th10) {
                th = th10;
                androidx.exifinterface.media.b.b(inputStream2);
                androidx.exifinterface.media.b.b(fileOutputStream);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            inputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(inputStream2);
            androidx.exifinterface.media.b.b(fileOutputStream);
            throw th;
        }
    }

    public final void X(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        if (f19819u) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.k(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.k(-40);
        cVar.k(-1);
        cVar.k(-31);
        this.f19838n = h0(cVar);
        if (this.f19843s != null) {
            cVar.write(-1);
            cVar.k(-31);
            byte[] bArr2 = IDENTIFIER_XMP_APP1;
            cVar.U(bArr2.length + 2 + this.f19843s.bytes.length);
            cVar.write(bArr2);
            cVar.write(this.f19843s.bytes);
            this.f19844t = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.k(-1);
                cVar.k(readByte);
                androidx.exifinterface.media.b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.k(-1);
                cVar.k(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.U(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr3, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr3, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i11 = readUnsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = IDENTIFIER_XMP_APP1;
                if (i11 >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = IDENTIFIER_EXIF_APP1;
                    bArr = i11 >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (androidx.exifinterface.media.b.f(bArr, IDENTIFIER_EXIF_APP1) || androidx.exifinterface.media.b.f(bArr, bArr4)) {
                        bVar.U(i11 - bArr.length);
                    }
                }
                cVar.k(-1);
                cVar.k(readByte);
                cVar.U(readUnsignedShort2);
                if (bArr != null) {
                    i11 -= bArr.length;
                    cVar.write(bArr);
                }
                while (i11 > 0) {
                    int read2 = bVar.read(bArr3, 0, Math.min(i11, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr3, 0, read2);
                        i11 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005b -> B:9:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = androidx.exifinterface.media.a.f19819u
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            androidx.exifinterface.media.a$b r0 = new androidx.exifinterface.media.a$b
            r0.<init>(r9)
            androidx.exifinterface.media.a$c r9 = new androidx.exifinterface.media.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = androidx.exifinterface.media.a.PNG_SIGNATURE
            int r10 = r10.length
            androidx.exifinterface.media.b.e(r0, r9, r10)
            androidx.exifinterface.media.a$d r10 = r8.f19843s
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.f19844t
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            androidx.exifinterface.media.b.d(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.r(r3)
            r9.r(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.b.e(r0, r9, r3)
            int r3 = r8.f19838n
            if (r3 != 0) goto L50
            r8.i0(r9)
            r1 = r2
        L50:
            androidx.exifinterface.media.a$d r3 = r8.f19843s
            if (r3 == 0) goto L27
            boolean r3 = r8.f19844t
            if (r3 != 0) goto L27
            r8.j0(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.i0(r9)
            int r3 = r3 + 4
            r0.U(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = androidx.exifinterface.media.a.PNG_ITXT_XMP_KEYWORD
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            androidx.exifinterface.media.a$d r10 = r8.f19843s
            if (r10 == 0) goto L8f
            r8.j0(r9)
        L8f:
            r0.U(r6)
            goto L5b
        L93:
            r9.r(r3)
            r9.r(r4)
            r9.write(r7)
            androidx.exifinterface.media.b.e(r0, r9, r6)
            goto L27
        La0:
            r9.r(r3)
            r9.r(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.b.e(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.Y(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01f6 A[Catch: all -> 0x0061, Exception -> 0x0065, TryCatch #5 {Exception -> 0x0065, all -> 0x0061, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0052, B:14:0x0054, B:17:0x01da, B:19:0x01f6, B:20:0x01ff, B:24:0x0069, B:26:0x0078, B:28:0x0080, B:29:0x0084, B:32:0x0094, B:34:0x009f, B:35:0x00a4, B:37:0x00a6, B:42:0x00b4, B:40:0x00b9, B:45:0x00bd, B:47:0x00c9, B:49:0x00d1, B:53:0x00df, B:55:0x00e7, B:57:0x00ee, B:59:0x00fd, B:61:0x010d, B:62:0x0169, B:64:0x0175, B:65:0x017c, B:67:0x01b6, B:69:0x01d3, B:70:0x01c4, B:72:0x01cc, B:73:0x0121, B:74:0x0128, B:75:0x0129, B:77:0x0133, B:79:0x0139, B:82:0x0152, B:84:0x015a, B:85:0x0161), top: B:8:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int h02;
        boolean z10;
        if (f19819u) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = WEBP_SIGNATURE_1;
        androidx.exifinterface.media.b.e(bVar, cVar, bArr.length);
        int readInt = bVar.readInt();
        byte[] bArr2 = WEBP_SIGNATURE_2;
        bVar.U(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i15 = this.f19838n;
            if (i15 != 0) {
                androidx.exifinterface.media.b.e(bVar, cVar2, (i15 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.U(4);
                int readInt2 = bVar.readInt();
                if (readInt2 % 2 != 0) {
                    readInt2++;
                }
                bVar.U(readInt2);
                h02 = h0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = WEBP_CHUNK_TYPE_VP8X;
                boolean z11 = true;
                if (!Arrays.equals(bArr3, bArr4)) {
                    byte[] bArr5 = WEBP_CHUNK_TYPE_VP8;
                    if (!Arrays.equals(bArr3, bArr5) && !Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                        h02 = -1;
                        i10 = -1;
                        androidx.exifinterface.media.b.e(bVar, cVar2, (readInt + 8) - bVar.k());
                        int size = byteArrayOutputStream.size();
                        byte[] bArr6 = WEBP_SIGNATURE_2;
                        cVar.r(size + bArr6.length);
                        cVar.write(bArr6);
                        if (h02 != i10) {
                            this.f19838n = cVar.f19852a.size() + h02;
                        }
                        byteArrayOutputStream.writeTo(cVar);
                        androidx.exifinterface.media.b.d(bVar, cVar);
                        androidx.exifinterface.media.b.b(byteArrayOutputStream);
                    }
                    int readInt3 = bVar.readInt();
                    int i16 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                    byte[] bArr7 = new byte[3];
                    if (Arrays.equals(bArr3, bArr5)) {
                        bVar.readFully(bArr7);
                        byte[] bArr8 = new byte[3];
                        bVar.readFully(bArr8);
                        if (!Arrays.equals(WEBP_VP8_SIGNATURE, bArr8)) {
                            throw new IOException("Error checking VP8 signature");
                        }
                        i13 = bVar.readInt();
                        i10 = -1;
                        i12 = (i13 >> 16) & 16383;
                        i11 = i16 - 10;
                        i14 = i13 & 16383;
                        z11 = false;
                    } else {
                        i10 = -1;
                        if (!Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                            i11 = i16;
                            i12 = 0;
                            i13 = 0;
                            z11 = false;
                            i14 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i13 = bVar.readInt();
                            int i17 = (i13 & 16383) + 1;
                            int i18 = ((i13 & 268419072) >>> 14) + 1;
                            if ((i13 & 268435456) == 0) {
                                z11 = false;
                            }
                            i11 = i16 - 5;
                            i14 = i17;
                            i12 = i18;
                        }
                    }
                    cVar2.write(bArr4);
                    cVar2.r(10);
                    byte[] bArr9 = new byte[10];
                    if (z11) {
                        bArr9[0] = (byte) (bArr9[0] | Tnaf.POW_2_WIDTH);
                    }
                    bArr9[0] = (byte) (bArr9[0] | 8);
                    int i19 = i14 - 1;
                    int i20 = i12 - 1;
                    bArr9[4] = (byte) i19;
                    bArr9[5] = (byte) (i19 >> 8);
                    bArr9[6] = (byte) (i19 >> 16);
                    bArr9[7] = (byte) i20;
                    bArr9[8] = (byte) (i20 >> 8);
                    bArr9[9] = (byte) (i20 >> 16);
                    cVar2.write(bArr9);
                    cVar2.write(bArr3);
                    cVar2.r(readInt3);
                    if (Arrays.equals(bArr3, bArr5)) {
                        cVar2.write(bArr7);
                        cVar2.write(WEBP_VP8_SIGNATURE);
                        cVar2.r(i13);
                    } else if (Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                        cVar2.write(47);
                        cVar2.r(i13);
                    }
                    androidx.exifinterface.media.b.e(bVar, cVar2, i11);
                    h02 = h0(cVar2);
                    androidx.exifinterface.media.b.e(bVar, cVar2, (readInt + 8) - bVar.k());
                    int size2 = byteArrayOutputStream.size();
                    byte[] bArr62 = WEBP_SIGNATURE_2;
                    cVar.r(size2 + bArr62.length);
                    cVar.write(bArr62);
                    if (h02 != i10) {
                    }
                    byteArrayOutputStream.writeTo(cVar);
                    androidx.exifinterface.media.b.d(bVar, cVar);
                    androidx.exifinterface.media.b.b(byteArrayOutputStream);
                }
                int readInt4 = bVar.readInt();
                byte[] bArr10 = new byte[readInt4 % 2 == 1 ? readInt4 + 1 : readInt4];
                bVar.readFully(bArr10);
                byte b10 = (byte) (bArr10[0] | 8);
                bArr10[0] = b10;
                boolean z12 = ((b10 >> 1) & 1) == 1;
                cVar2.write(bArr4);
                cVar2.r(readInt4);
                cVar2.write(bArr10);
                if (z12) {
                    f(bVar, cVar2, WEBP_CHUNK_TYPE_ANIM, null);
                    while (true) {
                        byte[] bArr11 = new byte[4];
                        try {
                            bVar.readFully(bArr11);
                            z10 = !Arrays.equals(bArr11, WEBP_CHUNK_TYPE_ANMF);
                        } catch (EOFException unused) {
                            z10 = true;
                        }
                        if (z10) {
                            break;
                        } else {
                            g(bVar, cVar2, bArr11);
                        }
                    }
                    h02 = h0(cVar2);
                } else {
                    f(bVar, cVar2, WEBP_CHUNK_TYPE_VP8, WEBP_CHUNK_TYPE_VP8L);
                    h02 = h0(cVar2);
                }
            }
            i10 = -1;
            androidx.exifinterface.media.b.e(bVar, cVar2, (readInt + 8) - bVar.k());
            int size22 = byteArrayOutputStream.size();
            byte[] bArr622 = WEBP_SIGNATURE_2;
            cVar.r(size22 + bArr622.length);
            cVar.write(bArr622);
            if (h02 != i10) {
            }
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.d(bVar, cVar);
            androidx.exifinterface.media.b.b(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    public void a0(String str, String str2) {
        e eVar;
        int i10;
        int i11;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i12 = 1;
        if (str4 != null) {
            if (f19812B.contains(str3) && !str4.contains("/")) {
                try {
                    str4 = f.b(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            } else if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f19816F.matcher(str4);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean find = f19817G.matcher(str4).find();
                boolean find2 = f19818H.matcher(str4).find();
                if (str4.length() != 19 || (!find && !find2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
        }
        if ("Xmp".equals(str3)) {
            boolean z10 = this.mAttributes[0].containsKey("Xmp") || this.mAttributes[5].containsKey("Xmp");
            int x10 = x(this.f19828d);
            if ((x10 == 2 && (this.f19843s != null || !z10)) || (x10 == 3 && !z10)) {
                this.f19843s = str4 != null ? d.a(str4) : null;
                return;
            }
        }
        int i13 = 0;
        while (i13 < f19811A.length) {
            if ((i13 != 4 || this.f19832h) && (eVar = sExifTagMapsForWriting[i13].get(str3)) != null) {
                if (str4 != null) {
                    Pair y10 = y(str4);
                    if (eVar.f19859c == ((Integer) y10.first).intValue() || eVar.f19859c == ((Integer) y10.second).intValue()) {
                        i10 = eVar.f19859c;
                    } else {
                        int i14 = eVar.f19860d;
                        if (i14 == -1 || !(i14 == ((Integer) y10.first).intValue() || eVar.f19860d == ((Integer) y10.second).intValue())) {
                            int i15 = eVar.f19859c;
                            if (i15 == i12 || i15 == 7 || i15 == 2) {
                                i10 = i15;
                            } else if (f19819u) {
                                String[] strArr = IFD_FORMAT_NAMES;
                                String str5 = strArr[eVar.f19859c];
                                if (eVar.f19860d != -1) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(", ");
                                    sb2.append(strArr[eVar.f19860d]);
                                }
                                String str6 = strArr[((Integer) y10.first).intValue()];
                                if (((Integer) y10.second).intValue() != -1) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(", ");
                                    sb3.append(strArr[((Integer) y10.second).intValue()]);
                                }
                            }
                        } else {
                            i10 = eVar.f19860d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i12;
                            this.mAttributes[i13].put(str3, d.a(str4));
                            continue;
                        case 2:
                        case 7:
                            i11 = i12;
                            this.mAttributes[i13].put(str3, d.e(str4));
                            continue;
                        case 3:
                            i11 = i12;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i16 = 0; i16 < split.length; i16++) {
                                iArr[i16] = Integer.parseInt(split[i16]);
                            }
                            this.mAttributes[i13].put(str3, d.k(iArr, this.f19831g));
                            continue;
                        case 4:
                            i11 = i12;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i17 = 0; i17 < split2.length; i17++) {
                                jArr[i17] = Long.parseLong(split2[i17]);
                            }
                            this.mAttributes[i13].put(str3, d.g(jArr, this.f19831g));
                            continue;
                        case 5:
                            i11 = i12;
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            for (int i18 = 0; i18 < split3.length; i18++) {
                                String[] split4 = split3[i18].split("/", -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i11]), null);
                            }
                            this.mAttributes[i13].put(str3, d.i(fVarArr, this.f19831g));
                            continue;
                        case 9:
                            i11 = i12;
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i19 = 0; i19 < split5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split5[i19]);
                            }
                            this.mAttributes[i13].put(str3, d.c(iArr2, this.f19831g));
                            continue;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i20 = 0;
                            while (i20 < split6.length) {
                                String[] split7 = split6[i20].split("/", -1);
                                fVarArr2[i20] = new f((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i12]), null);
                                i20++;
                                i12 = i12;
                                split6 = split6;
                            }
                            i11 = i12;
                            this.mAttributes[i13].put(str3, d.d(fVarArr2, this.f19831g));
                            continue;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i21 = 0; i21 < split8.length; i21++) {
                                dArr[i21] = Double.parseDouble(split8[i21]);
                            }
                            this.mAttributes[i13].put(str3, d.b(dArr, this.f19831g));
                            break;
                    }
                } else {
                    this.mAttributes[i13].remove(str3);
                }
            }
            i11 = i12;
            i13++;
            i12 = i11;
        }
    }

    public final void b0(b bVar) {
        HashMap<String, d> hashMap = this.mAttributes[4];
        d dVar = hashMap.get("Compression");
        if (dVar == null) {
            this.f19837m = 6;
            z(bVar, hashMap);
            return;
        }
        int m10 = dVar.m(this.f19831g);
        this.f19837m = m10;
        if (m10 != 1) {
            if (m10 == 6) {
                z(bVar, hashMap);
                return;
            } else if (m10 != 7) {
                return;
            }
        }
        if (J(hashMap)) {
            A(bVar, hashMap);
        }
    }

    public final void d0(int i10, int i11) {
        if (this.mAttributes[i10].isEmpty() || this.mAttributes[i11].isEmpty()) {
            return;
        }
        d dVar = this.mAttributes[i10].get("ImageLength");
        d dVar2 = this.mAttributes[i10].get("ImageWidth");
        d dVar3 = this.mAttributes[i11].get("ImageLength");
        d dVar4 = this.mAttributes[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int m10 = dVar.m(this.f19831g);
        int m11 = dVar2.m(this.f19831g);
        int m12 = dVar3.m(this.f19831g);
        int m13 = dVar4.m(this.f19831g);
        if (m10 >= m12 || m11 >= m13) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.mAttributes;
        HashMap<String, d> hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    public final void e() {
        String h10 = h("DateTimeOriginal");
        if (h10 != null && h("DateTime") == null) {
            this.mAttributes[0].put("DateTime", d.e(h10));
        }
        if (h("ImageWidth") == null) {
            this.mAttributes[0].put("ImageWidth", d.f(0L, this.f19831g));
        }
        if (h("ImageLength") == null) {
            this.mAttributes[0].put("ImageLength", d.f(0L, this.f19831g));
        }
        if (h("Orientation") == null) {
            this.mAttributes[0].put("Orientation", d.f(0L, this.f19831g));
        }
        if (h("LightSource") == null) {
            this.mAttributes[1].put("LightSource", d.f(0L, this.f19831g));
        }
    }

    public final void f(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            g(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void f0(g gVar, int i10) {
        d j10;
        d j11;
        d dVar = this.mAttributes[i10].get("DefaultCropSize");
        d dVar2 = this.mAttributes[i10].get("SensorTopBorder");
        d dVar3 = this.mAttributes[i10].get("SensorLeftBorder");
        d dVar4 = this.mAttributes[i10].get("SensorBottomBorder");
        d dVar5 = this.mAttributes[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                V(gVar, i10);
                return;
            }
            int m10 = dVar2.m(this.f19831g);
            int m11 = dVar4.m(this.f19831g);
            int m12 = dVar5.m(this.f19831g);
            int m13 = dVar3.m(this.f19831g);
            if (m11 <= m10 || m12 <= m13) {
                return;
            }
            d j12 = d.j(m11 - m10, this.f19831g);
            d j13 = d.j(m12 - m13, this.f19831g);
            this.mAttributes[i10].put("ImageLength", j12);
            this.mAttributes[i10].put("ImageWidth", j13);
            return;
        }
        if (dVar.f19854a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f19831g);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            j10 = d.h(fVarArr[0], this.f19831g);
            j11 = d.h(fVarArr[1], this.f19831g);
        } else {
            int[] iArr = (int[]) dVar.o(this.f19831g);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            j10 = d.j(iArr[0], this.f19831g);
            j11 = d.j(iArr[1], this.f19831g);
        }
        this.mAttributes[i10].put("ImageWidth", j10);
        this.mAttributes[i10].put("ImageLength", j11);
    }

    public final void g(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.r(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.e(bVar, cVar, readInt);
    }

    public final void g0() {
        d0(0, 5);
        d0(0, 4);
        d0(5, 4);
        d dVar = this.mAttributes[1].get("PixelXDimension");
        d dVar2 = this.mAttributes[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.mAttributes[0].put("ImageWidth", dVar);
            this.mAttributes[0].put("ImageLength", dVar2);
        }
        if (this.mAttributes[4].isEmpty() && L(this.mAttributes[5])) {
            HashMap<String, d>[] hashMapArr = this.mAttributes;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        L(this.mAttributes[4]);
        U(0, "ThumbnailOrientation", "Orientation");
        U(0, "ThumbnailImageLength", "ImageLength");
        U(0, "ThumbnailImageWidth", "ImageWidth");
        U(5, "ThumbnailOrientation", "Orientation");
        U(5, "ThumbnailImageLength", "ImageLength");
        U(5, "ThumbnailImageWidth", "ImageWidth");
        U(4, "Orientation", "ThumbnailOrientation");
        U(4, "ImageLength", "ThumbnailImageLength");
        U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public String h(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j10 = j(str);
        if (j10 == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f19812B.contains(str)) {
                return j10.n(this.f19831g);
            }
            try {
                return Double.toString(j10.l(this.f19831g));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = j10.f19854a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j10.f19854a);
            return null;
        }
        f[] fVarArr = (f[]) j10.o(this.f19831g);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer valueOf = Integer.valueOf((int) (fVar.f19861a / fVar.f19862b));
        f fVar2 = fVarArr[1];
        Integer valueOf2 = Integer.valueOf((int) (fVar2.f19861a / fVar2.f19862b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f19861a / fVar3.f19862b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h0(c cVar) {
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        e[][] eVarArr = f19811A;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : EXIF_POINTER_TAGS) {
            T(eVar.f19858b);
        }
        if (this.f19832h) {
            if (this.f19833i) {
                T("StripOffsets");
                T("StripByteCounts");
            } else {
                T("JPEGInterchangeFormat");
                T("JPEGInterchangeFormatLength");
            }
        }
        for (int i14 = 0; i14 < f19811A.length; i14++) {
            Iterator<Map.Entry<String, d>> it = this.mAttributes[i14].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f19858b, d.f(0L, this.f19831g));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].f19858b, d.f(0L, this.f19831g));
        }
        if (this.mAttributes[3].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].f19858b, d.f(0L, this.f19831g));
        }
        if (this.f19832h) {
            if (!this.f19833i) {
                this.mAttributes[4].put("JPEGInterchangeFormat", d.f(0L, this.f19831g));
                c11 = 3;
                this.mAttributes[4].put("JPEGInterchangeFormatLength", d.f(this.f19836l, this.f19831g));
                for (i10 = 0; i10 < f19811A.length; i10++) {
                    Iterator<Map.Entry<String, d>> it2 = this.mAttributes[i10].entrySet().iterator();
                    int i15 = 0;
                    while (it2.hasNext()) {
                        int p10 = it2.next().getValue().p();
                        if (p10 > 4) {
                            i15 += p10;
                        }
                    }
                    iArr2[i10] = iArr2[i10] + i15;
                }
                int i16 = 8;
                for (i11 = 0; i11 < f19811A.length; i11++) {
                    if (!this.mAttributes[i11].isEmpty()) {
                        iArr[i11] = i16;
                        i16 += (this.mAttributes[i11].size() * 12) + 6 + iArr2[i11];
                    }
                }
                if (this.f19832h) {
                    if (this.f19833i) {
                        this.mAttributes[4].put("StripOffsets", d.j(i16, this.f19831g));
                    } else {
                        this.mAttributes[4].put("JPEGInterchangeFormat", d.f(i16, this.f19831g));
                    }
                    this.f19835k = i16;
                    i16 += this.f19836l;
                }
                if (this.f19828d == 4) {
                    i16 += 8;
                }
                if (f19819u) {
                    for (int i17 = 0; i17 < f19811A.length; i17++) {
                        String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i17), Integer.valueOf(iArr[i17]), Integer.valueOf(this.mAttributes[i17].size()), Integer.valueOf(iArr2[i17]), Integer.valueOf(i16));
                    }
                }
                if (!this.mAttributes[1].isEmpty()) {
                    this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f19858b, d.f(iArr[1], this.f19831g));
                }
                if (!this.mAttributes[c10].isEmpty()) {
                    this.mAttributes[0].put(EXIF_POINTER_TAGS[c10].f19858b, d.f(iArr[c10], this.f19831g));
                }
                if (!this.mAttributes[c11].isEmpty()) {
                    this.mAttributes[1].put(EXIF_POINTER_TAGS[c11].f19858b, d.f(iArr[c11], this.f19831g));
                }
                i12 = this.f19828d;
                if (i12 != 4) {
                    if (i16 > 65535) {
                        throw new IllegalStateException("Size of exif data (" + i16 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
                    }
                    cVar.U(i16);
                    cVar.write(IDENTIFIER_EXIF_APP1);
                } else if (i12 == 13) {
                    cVar.r(i16);
                    cVar.r(1700284774);
                } else if (i12 == 14) {
                    cVar.write(WEBP_CHUNK_TYPE_EXIF);
                    cVar.r(i16);
                }
                int size = cVar.f19852a.size();
                cVar.B(this.f19831g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                cVar.d(this.f19831g);
                cVar.U(42);
                cVar.J(8L);
                i13 = 0;
                while (i13 < f19811A.length) {
                    if (this.mAttributes[i13].isEmpty()) {
                        j10 = j11;
                    } else {
                        cVar.U(this.mAttributes[i13].size());
                        int size2 = iArr[i13] + 2 + (this.mAttributes[i13].size() * 12) + 4;
                        for (Map.Entry<String, d> entry : this.mAttributes[i13].entrySet()) {
                            int i18 = sExifTagMapsForWriting[i13].get(entry.getKey()).f19857a;
                            d value = entry.getValue();
                            int p11 = value.p();
                            cVar.U(i18);
                            cVar.U(value.f19854a);
                            cVar.r(value.f19855b);
                            if (p11 > 4) {
                                cVar.J(size2);
                                size2 += p11;
                            } else {
                                cVar.write(value.bytes);
                                if (p11 < 4) {
                                    while (p11 < 4) {
                                        cVar.k(0);
                                        p11++;
                                    }
                                }
                            }
                        }
                        if (i13 != 0 || this.mAttributes[4].isEmpty()) {
                            j10 = 0;
                            cVar.J(0L);
                        } else {
                            cVar.J(iArr[4]);
                            j10 = 0;
                        }
                        Iterator<Map.Entry<String, d>> it3 = this.mAttributes[i13].entrySet().iterator();
                        while (it3.hasNext()) {
                            byte[] bArr = it3.next().getValue().bytes;
                            if (bArr.length > 4) {
                                cVar.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                    i13++;
                    j11 = j10;
                }
                if (this.f19832h) {
                    cVar.write(v());
                }
                if (this.f19828d == 14 && i16 % 2 == 1) {
                    cVar.k(0);
                }
                cVar.d(ByteOrder.BIG_ENDIAN);
                return size;
            }
            this.mAttributes[4].put("StripOffsets", d.j(0, this.f19831g));
            this.mAttributes[4].put("StripByteCounts", d.j(this.f19836l, this.f19831g));
        }
        c11 = 3;
        while (i10 < f19811A.length) {
        }
        int i162 = 8;
        while (i11 < f19811A.length) {
        }
        if (this.f19832h) {
        }
        if (this.f19828d == 4) {
        }
        if (f19819u) {
        }
        if (!this.mAttributes[1].isEmpty()) {
        }
        if (!this.mAttributes[c10].isEmpty()) {
        }
        if (!this.mAttributes[c11].isEmpty()) {
        }
        i12 = this.f19828d;
        if (i12 != 4) {
        }
        int size3 = cVar.f19852a.size();
        cVar.B(this.f19831g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.d(this.f19831g);
        cVar.U(42);
        cVar.J(8L);
        i13 = 0;
        while (i13 < f19811A.length) {
        }
        if (this.f19832h) {
        }
        if (this.f19828d == 14) {
            cVar.k(0);
        }
        cVar.d(ByteOrder.BIG_ENDIAN);
        return size3;
    }

    public int i(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j10 = j(str);
        if (j10 != null) {
            try {
                return j10.m(this.f19831g);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void i0(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f19838n = cVar.f19852a.size() + h0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.r((int) crc32.getValue());
    }

    public final d j(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && x(this.f19828d) == 2 && (dVar2 = this.f19843s) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f19811A.length; i10++) {
            d dVar3 = this.mAttributes[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f19843s) == null) {
            return null;
        }
        return dVar;
    }

    public final void j0(c cVar) {
        cVar.r(this.f19843s.bytes.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.r(1767135348);
        e0(crc32, 1767135348);
        byte[] bArr = PNG_ITXT_XMP_KEYWORD;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f19843s.bytes);
        crc32.update(this.f19843s.bytes);
        cVar.r((int) crc32.getValue());
        this.f19844t = true;
    }

    public final void k(g gVar, int i10) {
        String str;
        String str2;
        String str3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.a.a(mediaMetadataRetriever, new C0377a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.mAttributes[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f19831g));
                }
                if (str3 != null) {
                    this.mAttributes[0].put("ImageLength", d.j(Integer.parseInt(str3), this.f19831g));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    this.mAttributes[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f19831g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.w0(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i12 = parseInt2 + 6;
                    int i13 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i13];
                    gVar.readFully(bArr2);
                    this.f19838n = i12;
                    R(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j10 = parseInt4;
                    gVar.w0(j10);
                    byte[] bArr3 = new byte[parseInt5];
                    gVar.readFully(bArr3);
                    this.f19843s = new d(1, parseInt5, j10, bArr3);
                    this.f19844t = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[LOOP:0: B:9:0x0024->B:32:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(b bVar, int i10, int i11) {
        if (f19819u) {
            Objects.toString(bVar);
        }
        bVar.J(ByteOrder.BIG_ENDIAN);
        byte readByte = bVar.readByte();
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & UByte.MAX_VALUE));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & UByte.MAX_VALUE));
        }
        int i12 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & UByte.MAX_VALUE));
            }
            byte readByte3 = bVar.readByte();
            boolean z10 = f19819u;
            if (z10) {
                Integer.toHexString(readByte3 & UByte.MAX_VALUE);
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i13 = readUnsignedShort - 2;
                int i14 = i12 + 4;
                if (z10) {
                    Integer.toHexString(readByte3 & UByte.MAX_VALUE);
                }
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i13];
                    bVar.readFully(bArr);
                    int i15 = i14 + i13;
                    byte[] bArr2 = IDENTIFIER_EXIF_APP1;
                    if (androidx.exifinterface.media.b.f(bArr, bArr2)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i13);
                        this.f19838n = i10 + i14 + bArr2.length;
                        R(copyOfRange, i11);
                        b0(new b(copyOfRange));
                    } else {
                        byte[] bArr3 = IDENTIFIER_XMP_APP1;
                        if (androidx.exifinterface.media.b.f(bArr, bArr3)) {
                            int length = i14 + bArr3.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i13);
                            this.f19843s = new d(1, copyOfRange2.length, length, copyOfRange2);
                            this.f19844t = true;
                        }
                    }
                    i14 = i15;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            bVar.U(1);
                                            this.mAttributes[i11].put(i11 != 4 ? "ImageLength" : "ThumbnailImageLength", d.f(bVar.readUnsignedShort(), this.f19831g));
                                            this.mAttributes[i11].put(i11 != 4 ? "ImageWidth" : "ThumbnailImageWidth", d.f(bVar.readUnsignedShort(), this.f19831g));
                                            i13 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    if (i13 >= 0) {
                        throw new IOException("Invalid length");
                    }
                    bVar.U(i13);
                    i12 = i14 + i13;
                } else {
                    byte[] bArr4 = new byte[i13];
                    bVar.readFully(bArr4);
                    if (h("UserComment") == null) {
                        this.mAttributes[1].put("UserComment", d.e(new String(bArr4, f19814D)));
                    }
                }
                i13 = 0;
                if (i13 >= 0) {
                }
            }
        }
        bVar.J(this.f19831g);
    }

    public final int m(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (D(bArr)) {
            return 4;
        }
        if (G(bArr)) {
            return 9;
        }
        int C10 = C(bArr);
        if (C10 != 0) {
            return C10;
        }
        if (E(bArr)) {
            return 7;
        }
        if (H(bArr)) {
            return 10;
        }
        if (F(bArr)) {
            return 13;
        }
        return M(bArr) ? 14 : 0;
    }

    public final void n(g gVar) {
        int i10;
        int i11;
        q(gVar);
        d dVar = this.mAttributes[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.bytes);
            gVar2.J(this.f19831g);
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.w0(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.w0(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.w0(12L);
            }
            S(gVar2, 6);
            d dVar2 = this.mAttributes[7].get("PreviewImageStart");
            d dVar3 = this.mAttributes[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.mAttributes[5].put("JPEGInterchangeFormat", dVar2);
                this.mAttributes[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.mAttributes[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f19831g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d j10 = d.j(i14, this.f19831g);
                d j11 = d.j(i15, this.f19831g);
                this.mAttributes[0].put("ImageWidth", j10);
                this.mAttributes[0].put("ImageLength", j11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        r17.f19844t = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(b bVar) {
        if (f19819u) {
            Objects.toString(bVar);
        }
        bVar.J(ByteOrder.BIG_ENDIAN);
        int k10 = bVar.k();
        bVar.U(PNG_SIGNATURE.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int k11 = bVar.k() + readInt + 4;
                if (bVar.k() - k10 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z10) {
                    this.f19838n = bVar.k() - k10;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    e0(crc32, readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    R(bArr, 0);
                    g0();
                    b0(new b(bArr));
                    z10 = true;
                } else if (readInt2 == 1767135348 && !z11) {
                    byte[] bArr2 = PNG_ITXT_XMP_KEYWORD;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int k12 = bVar.k() - k10;
                            int i10 = readInt - length;
                            byte[] bArr4 = new byte[i10];
                            bVar.readFully(bArr4);
                            this.f19843s = new d(1, i10, k12, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.U(k11 - bVar.k());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
    }

    public final void p(b bVar) {
        if (f19819u) {
            Objects.toString(bVar);
        }
        bVar.U(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.U(i10 - bVar.k());
        bVar.readFully(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.U(i12 - bVar.k());
        bVar.J(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f19824z.f19857a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f19831g);
                d j11 = d.j(readShort2, this.f19831g);
                this.mAttributes[0].put("ImageLength", j10);
                this.mAttributes[0].put("ImageWidth", j11);
                return;
            }
            bVar.U(readUnsignedShort2);
        }
    }

    public final void q(g gVar) {
        d dVar;
        O(gVar);
        S(gVar, 0);
        f0(gVar, 0);
        f0(gVar, 5);
        f0(gVar, 4);
        g0();
        if (this.f19828d != 8 || (dVar = this.mAttributes[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.bytes);
        gVar2.J(this.f19831g);
        gVar2.U(6);
        S(gVar2, 9);
        d dVar2 = this.mAttributes[9].get("ColorSpace");
        if (dVar2 != null) {
            this.mAttributes[1].put("ColorSpace", dVar2);
        }
    }

    public int r() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void s(g gVar) {
        if (f19819u) {
            Objects.toString(gVar);
        }
        q(gVar);
        d dVar = this.mAttributes[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.bytes), (int) dVar.f19856c, 5);
        }
        d dVar2 = this.mAttributes[0].get("ISO");
        d dVar3 = this.mAttributes[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.mAttributes[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean t(g gVar) {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] r10 = gVar.r();
        this.f19838n = bArr.length;
        R(r10, 0);
        return true;
    }

    public byte[] u() {
        int i10 = this.f19837m;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] v() {
        Throwable th2;
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        Throwable th3;
        InputStream inputStream2 = null;
        if (!this.f19832h) {
            return null;
        }
        byte[] bArr = this.mThumbnailBytes;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.f19827c;
        } catch (Exception unused) {
            inputStream = null;
            fileDescriptor = null;
        } catch (Throwable th4) {
            th2 = th4;
            fileDescriptor = null;
        }
        try {
            if (inputStream != null) {
                try {
                    if (!inputStream.markSupported()) {
                        androidx.exifinterface.media.b.b(inputStream);
                        return null;
                    }
                    inputStream.reset();
                } catch (Exception unused2) {
                    fileDescriptor = null;
                    androidx.exifinterface.media.b.b(inputStream);
                    if (fileDescriptor != null) {
                    }
                    return null;
                } catch (Throwable th5) {
                    inputStream2 = inputStream;
                    th2 = th5;
                    fileDescriptor = null;
                    androidx.exifinterface.media.b.b(inputStream2);
                    if (fileDescriptor == null) {
                    }
                }
            } else {
                if (this.f19825a == null) {
                    FileDescriptor dup = Os.dup(this.f19826b);
                    try {
                        Os.lseek(dup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = dup;
                        inputStream = new FileInputStream(dup);
                        b bVar = new b(inputStream);
                        bVar.U(this.f19835k + this.f19838n);
                        byte[] bArr2 = new byte[this.f19836l];
                        bVar.readFully(bArr2);
                        this.mThumbnailBytes = bArr2;
                        androidx.exifinterface.media.b.b(inputStream);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.b.a(fileDescriptor);
                        }
                        return bArr2;
                    } catch (Exception unused3) {
                        fileDescriptor = dup;
                        inputStream = null;
                        androidx.exifinterface.media.b.b(inputStream);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.b.a(fileDescriptor);
                        }
                        return null;
                    } catch (Throwable th6) {
                        th3 = th6;
                        fileDescriptor = dup;
                        th2 = th3;
                        androidx.exifinterface.media.b.b(inputStream2);
                        if (fileDescriptor == null) {
                            throw th2;
                        }
                        androidx.exifinterface.media.b.a(fileDescriptor);
                        throw th2;
                    }
                }
                inputStream = new FileInputStream(this.f19825a);
            }
            b bVar2 = new b(inputStream);
            bVar2.U(this.f19835k + this.f19838n);
            byte[] bArr22 = new byte[this.f19836l];
            bVar2.readFully(bArr22);
            this.mThumbnailBytes = bArr22;
            androidx.exifinterface.media.b.b(inputStream);
            if (fileDescriptor != null) {
            }
            return bArr22;
        } catch (Exception unused4) {
            androidx.exifinterface.media.b.b(inputStream);
            if (fileDescriptor != null) {
            }
            return null;
        } catch (Throwable th7) {
            th3 = th7;
            inputStream2 = inputStream;
            th2 = th3;
            androidx.exifinterface.media.b.b(inputStream2);
            if (fileDescriptor == null) {
            }
        }
        fileDescriptor = null;
    }

    public final void w(b bVar) {
        if (f19819u) {
            Objects.toString(bVar);
        }
        bVar.J(ByteOrder.LITTLE_ENDIAN);
        bVar.U(WEBP_SIGNATURE_1.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        bVar.U(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = IDENTIFIER_EXIF_APP1;
                    if (androidx.exifinterface.media.b.f(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f19838n = i10;
                    R(bArr3, 0);
                    b0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.U(readInt2);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m10 = dVar.m(this.f19831g);
        int m11 = dVar2.m(this.f19831g);
        if (this.f19828d == 7) {
            m10 += this.f19839o;
        }
        if (m10 <= 0 || m11 <= 0) {
            return;
        }
        this.f19832h = true;
        if (this.f19825a == null && this.f19827c == null && this.f19826b == null) {
            byte[] bArr = new byte[m11];
            bVar.U(m10);
            bVar.readFully(bArr);
            this.mThumbnailBytes = bArr;
        }
        this.f19835k = m10;
        this.f19836l = m11;
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f19848a;

        /* renamed from: b, reason: collision with root package name */
        public int f19849b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f19850c;

        /* renamed from: d, reason: collision with root package name */
        public int f19851d;
        private byte[] mSkipBuffer;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f19851d = bArr.length;
        }

        public long B() {
            return readInt() & BodyPartID.bodyIdMax;
        }

        public void J(ByteOrder byteOrder) {
            this.f19850c = byteOrder;
        }

        public void U(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f19848a.skip(i12);
                if (skip <= 0) {
                    if (this.mSkipBuffer == null) {
                        this.mSkipBuffer = new byte[8192];
                    }
                    skip = this.f19848a.read(this.mSkipBuffer, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f19849b += i11;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f19848a.available();
        }

        public int d() {
            return this.f19851d;
        }

        public int k() {
            return this.f19849b;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public byte[] r() {
            byte[] bArr = new byte[1024];
            int i10 = 0;
            while (true) {
                if (i10 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
                int read = this.f19848a.read(bArr, i10, bArr.length - i10);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i10);
                }
                i10 += read;
                this.f19849b += read;
            }
        }

        @Override // java.io.InputStream
        public int read() {
            this.f19849b++;
            return this.f19848a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f19849b++;
            return this.f19848a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f19849b++;
            int read = this.f19848a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f19849b += 2;
            return this.f19848a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f19849b += i11;
            this.f19848a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f19849b += 4;
            int read = this.f19848a.read();
            int read2 = this.f19848a.read();
            int read3 = this.f19848a.read();
            int read4 = this.f19848a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19850c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f19850c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f19849b += 8;
            int read = this.f19848a.read();
            int read2 = this.f19848a.read();
            int read3 = this.f19848a.read();
            int read4 = this.f19848a.read();
            int read5 = this.f19848a.read();
            int read6 = this.f19848a.read();
            int read7 = this.f19848a.read();
            int read8 = this.f19848a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19850c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f19850c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f19849b += 2;
            int read = this.f19848a.read();
            int read2 = this.f19848a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19850c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f19850c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f19849b += 2;
            return this.f19848a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f19849b++;
            return this.f19848a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f19849b += 2;
            int read = this.f19848a.read();
            int read2 = this.f19848a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19850c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f19850c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f19848a.read(bArr, i10, i11);
            this.f19849b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f19849b += bArr.length;
            this.f19848a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f19848a = dataInputStream;
            dataInputStream.mark(0);
            this.f19849b = 0;
            this.f19850c = byteOrder;
            this.f19851d = inputStream instanceof b ? ((b) inputStream).d() : -1;
        }
    }

    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f19848a.mark(Integer.MAX_VALUE);
        }

        public void w0(long j10) {
            int i10 = this.f19849b;
            if (i10 > j10) {
                this.f19849b = 0;
                this.f19848a.reset();
            } else {
                j10 -= i10;
            }
            U((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f19848a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f19857a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19858b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19859c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19860d;

        public e(String str, int i10, int i11) {
            this.f19858b = str;
            this.f19857a = i10;
            this.f19859c = i11;
            this.f19860d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f19859c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f19860d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f19858b = str;
            this.f19857a = i10;
            this.f19859c = i11;
            this.f19860d = i12;
        }
    }

    public a(String str) {
        e[][] eVarArr = f19811A;
        this.mAttributes = new HashMap[eVarArr.length];
        this.f19830f = new HashSet(eVarArr.length);
        this.f19831g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            B(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(FileDescriptor fileDescriptor) {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = f19811A;
        this.mAttributes = new HashMap[eVarArr.length];
        this.f19830f = new HashSet(eVarArr.length);
        this.f19831g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f19827c = null;
            this.f19825a = null;
            if (I(fileDescriptor)) {
                this.f19826b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f19826b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    N(fileInputStream);
                    androidx.exifinterface.media.b.b(fileInputStream);
                    if (z10) {
                        androidx.exifinterface.media.b.a(fileDescriptor);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    androidx.exifinterface.media.b.b(fileInputStream);
                    if (z10) {
                        androidx.exifinterface.media.b.a(fileDescriptor);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f19811A;
        this.mAttributes = new HashMap[eVarArr.length];
        this.f19830f = new HashSet(eVarArr.length);
        this.f19831g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f19825a = null;
            boolean z10 = i10 == 1;
            this.f19829e = z10;
            if (z10) {
                this.f19827c = null;
                this.f19826b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f19827c = (AssetManager.AssetInputStream) inputStream;
                this.f19826b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (I(fileInputStream.getFD())) {
                        this.f19827c = null;
                        this.f19826b = fileInputStream.getFD();
                    }
                }
                this.f19827c = null;
                this.f19826b = null;
            }
            N(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
