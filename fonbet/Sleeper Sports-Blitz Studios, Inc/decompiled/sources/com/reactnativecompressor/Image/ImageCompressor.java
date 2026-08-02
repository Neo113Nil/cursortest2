package com.reactnativecompressor.Image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativecompressor.Image.ImageCompressorOptions;
import com.reactnativecompressor.Utils.MediaCache;
import com.reactnativecompressor.Utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ImageCompressor.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J6\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u001e\u001a\u00020\u00172\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019J$\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020&2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005J$\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020&2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001e\u0010,\u001a\u00020\f2\u0006\u0010%\u001a\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fJ\u001c\u00100\u001a\u0004\u0018\u00010\n2\b\u00101\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¨\u00062"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressor;", "", "<init>", "()V", "getRNFileUrl", "", "filePath", "findActualSize", "Lcom/reactnativecompressor/Image/ImageSize;", "image", "Landroid/graphics/Bitmap;", ViewProps.MAX_WIDTH, "", ViewProps.MAX_HEIGHT, "decodeImage", "value", "loadImage", "copyExifInfo", "", "imagePath", "outputUri", "encodeImage", "imageDataByteArrayOutputStream", "Ljava/io/ByteArrayOutputStream;", "isBase64", "", "outputExtension", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "resize", "compress", AgentOptions.OUTPUT, "Lcom/reactnativecompressor/Image/ImageCompressorOptions$OutputType;", "quality", "", "disablePngTransparency", "manualCompressImage", "options", "Lcom/reactnativecompressor/Image/ImageCompressorOptions;", "isCompressedSizeLessThanActualFile", "sourceFileUrl", "compressedFileUrl", "autoCompressImage", "compressorOptions", "calculateInSampleSize", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "correctImageOrientation", "bitmap", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageCompressor {
    public static final ImageCompressor INSTANCE = new ImageCompressor();

    private ImageCompressor() {
    }

    public final String getRNFileUrl(String filePath) {
        try {
            return new File(filePath).toURL().toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return filePath;
        }
    }

    public final ImageSize findActualSize(Bitmap image, int maxWidth, int maxHeight) {
        Intrinsics.checkNotNullParameter(image, "image");
        float width = image.getWidth();
        float height = image.getHeight();
        if (width > height) {
            int round = Math.round(height / (width / maxWidth));
            return new ImageSize(maxWidth, round, round / height);
        }
        int round2 = Math.round(width / (height / maxHeight));
        return new ImageSize(round2, maxHeight, round2 / width);
    }

    public final Bitmap decodeImage(String value) {
        byte[] decode = Base64.decode(value, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(...)");
        return decodeByteArray;
    }

    public final Bitmap loadImage(String value) {
        Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse(value).getPath());
        Intrinsics.checkNotNullExpressionValue(decodeFile, "decodeFile(...)");
        return decodeFile;
    }

    public final void copyExifInfo(String imagePath, String outputUri) {
        String attribute;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(outputUri, "outputUri");
        try {
            ExifInterface exifInterface = new ExifInterface(imagePath);
            ExifInterface exifInterface2 = new ExifInterface(outputUri);
            for (String str : Utils.INSTANCE.getExifAttributes()) {
                if (exifInterface2.getAttribute(str) == null && (attribute = exifInterface.getAttribute(str)) != null) {
                    exifInterface2.setAttribute(str, attribute);
                }
            }
            exifInterface2.saveAttributes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String encodeImage(ByteArrayOutputStream imageDataByteArrayOutputStream, boolean isBase64, String outputExtension, String imagePath, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(imageDataByteArrayOutputStream, "imageDataByteArrayOutputStream");
        if (isBase64) {
            return Base64.encodeToString(imageDataByteArrayOutputStream.toByteArray(), 0);
        }
        Intrinsics.checkNotNull(outputExtension);
        Intrinsics.checkNotNull(reactContext);
        String generateCacheFilePath = Utils.generateCacheFilePath(outputExtension, reactContext);
        try {
            imageDataByteArrayOutputStream.writeTo(new FileOutputStream(generateCacheFilePath));
            Intrinsics.checkNotNull(imagePath);
            copyExifInfo(imagePath, generateCacheFilePath);
            return getRNFileUrl(generateCacheFilePath);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final Bitmap resize(Bitmap image, int maxWidth, int maxHeight) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageSize findActualSize = findActualSize(image, maxWidth, maxHeight);
        Bitmap createBitmap = Bitmap.createBitmap(findActualSize.width, findActualSize.height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Matrix matrix = new Matrix();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(2);
        matrix.setScale(findActualSize.scale, findActualSize.scale, 0.0f, 0.0f);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(image, matrix, paint);
        return createBitmap;
    }

    public final ByteArrayOutputStream compress(Bitmap image, ImageCompressorOptions.OutputType output, float quality, boolean disablePngTransparency) {
        Intrinsics.checkNotNullParameter(output, "output");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (output == ImageCompressorOptions.OutputType.jpg) {
            Intrinsics.checkNotNull(image);
            image.compress(Bitmap.CompressFormat.JPEG, Math.round(100 * quality), byteArrayOutputStream);
            return byteArrayOutputStream;
        }
        if (disablePngTransparency) {
            Intrinsics.checkNotNull(image);
            image.compress(Bitmap.CompressFormat.JPEG, Math.round(100 * quality), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            byteArrayOutputStream = new ByteArrayOutputStream();
            image = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        Intrinsics.checkNotNull(image);
        image.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    public final String manualCompressImage(String imagePath, ImageCompressorOptions options, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(options, "options");
        return encodeImage(compress(resize(options.getInput() == ImageCompressorOptions.InputType.base64 ? decodeImage(imagePath) : loadImage(imagePath), options.getMaxWidth(), options.getMaxHeight()), options.getOutput(), options.getQuality(), options.getDisablePngTransparency()), options.getReturnableOutputType() == ImageCompressorOptions.ReturnableOutputType.base64, options.getOutput().toString(), imagePath, reactContext);
    }

    public final boolean isCompressedSizeLessThanActualFile(String sourceFileUrl, String compressedFileUrl) {
        Intrinsics.checkNotNullParameter(sourceFileUrl, "sourceFileUrl");
        try {
            return ((float) new File(Uri.parse(compressedFileUrl).getPath()).length()) <= ((float) new File(Uri.parse(sourceFileUrl).getPath()).length());
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return true;
        }
    }

    public final String autoCompressImage(String imagePath, ImageCompressorOptions compressorOptions, ReactApplicationContext reactContext) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(compressorOptions, "compressorOptions");
        float maxHeight = compressorOptions.getMaxHeight();
        float maxWidth = compressorOptions.getMaxWidth();
        boolean z = compressorOptions.getReturnableOutputType() == ImageCompressorOptions.ReturnableOutputType.base64;
        String path = Uri.parse(imagePath).getPath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
        int i = options.outHeight;
        int i2 = options.outWidth;
        float f = i2;
        float f2 = i;
        float f3 = f / f2;
        float f4 = maxWidth / maxHeight;
        if (f2 > maxHeight || f > maxWidth) {
            if (f3 < f4) {
                i2 = (int) ((maxHeight / f2) * f);
                i = (int) maxHeight;
            } else {
                if (f3 > f4) {
                    maxHeight = (maxWidth / f) * f2;
                }
                i = (int) maxHeight;
                i2 = (int) maxWidth;
            }
        }
        options.inSampleSize = calculateInSampleSize(options, i2, i);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(path, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
        }
        float f5 = i2;
        float f6 = f5 / options.outWidth;
        float f7 = i;
        float f8 = f7 / options.outHeight;
        float f9 = f5 / 2.0f;
        float f10 = f7 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f6, f8, f9, f10);
        Intrinsics.checkNotNull(bitmap);
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(matrix);
        Intrinsics.checkNotNull(decodeFile);
        canvas.drawBitmap(decodeFile, f9 - (decodeFile.getWidth() / 2), f10 - (decodeFile.getHeight() / 2), new Paint(2));
        decodeFile.recycle();
        String encodeImage = encodeImage(compress(correctImageOrientation(bitmap, path), compressorOptions.getOutput(), compressorOptions.getQuality(), compressorOptions.getDisablePngTransparency()), z, compressorOptions.getOutput().toString(), path, reactContext);
        Intrinsics.checkNotNull(path);
        if (isCompressedSizeLessThanActualFile(path, encodeImage)) {
            return encodeImage;
        }
        MediaCache mediaCache = MediaCache.INSTANCE;
        Intrinsics.checkNotNull(encodeImage);
        mediaCache.deleteFile(encodeImage);
        return Utils.INSTANCE.slashifyFilePath(path);
    }

    public final int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int round;
        Intrinsics.checkNotNullParameter(options, "options");
        int i = options.outHeight;
        int i2 = options.outWidth;
        if (i > reqHeight || i2 > reqWidth) {
            round = Math.round(i / reqHeight);
            int round2 = Math.round(i2 / reqWidth);
            if (round >= round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        while ((i2 * i) / (round * round) > reqWidth * reqHeight * 2) {
            round++;
        }
        return round;
    }

    public final Bitmap correctImageOrientation(Bitmap bitmap, String imagePath) {
        Bitmap bitmap2;
        IOException iOException;
        Matrix matrix;
        try {
            Intrinsics.checkNotNull(imagePath);
            int attributeInt = new ExifInterface(imagePath).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            matrix = new Matrix();
            if (attributeInt == 3) {
                matrix.postRotate(180.0f);
            } else {
                try {
                    if (attributeInt == 6) {
                        matrix.postRotate(90.0f);
                    } else {
                        if (attributeInt != 8) {
                            return bitmap;
                        }
                        matrix.postRotate(270.0f);
                    }
                } catch (IOException e) {
                    iOException = e;
                    bitmap2 = bitmap;
                    iOException.printStackTrace();
                    return bitmap2;
                }
            }
            Intrinsics.checkNotNull(bitmap);
            bitmap2 = bitmap;
        } catch (IOException e2) {
            e = e2;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (IOException e3) {
            e = e3;
            iOException = e;
            iOException.printStackTrace();
            return bitmap2;
        }
    }
}
