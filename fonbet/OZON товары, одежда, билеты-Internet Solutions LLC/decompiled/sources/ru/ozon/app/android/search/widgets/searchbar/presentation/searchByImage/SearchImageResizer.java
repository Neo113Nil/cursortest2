package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import K1.G;
import Vd0.b;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.webkit.MimeTypeMap;
import androidx.exifinterface.media.a;
import bd.C5652b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.search.flags.ImageResizeByBytesInSearchByPhotoFlag;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchImageResizer;
import ru.ozon.app.android.storage.utils.FileExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0003J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0002J(\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\f\u0010\u001d\u001a\u00020\u001e*\u00020\u000bH\u0002J\u001c\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!H\u0002J\u0014\u0010\"\u001a\u00020#*\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J \u0010'\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010(\u001a\u0004\u0018\u00010\t*\u00020\u000bH\u0002J\u000e\u0010)\u001a\u0004\u0018\u00010\t*\u00020\u000bH\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010\t*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchImageResizer;", "Lru/ozon/app/android/platform/image/ImageResizer;", "appContext", "Landroid/content/Context;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "resize", "", "sourceFileUri", "Landroid/net/Uri;", "sizeLimit", "", "rotateBitmap", "Landroid/graphics/Bitmap;", "bitmap", "degrees", "getRotation", "decodeSampledBitmap", "", "decodeBitmapNewWay", "decodeBitmapOldWay", "decodeBitmapOldWayBytes", "calculateInSampleSize", "rawHeight", "rawWidth", "reqWidth", "reqHeight", "isInUnresizableTypes", "", "containedInWithIgnoreCase", "collection", "", "compressWhileBiggerThanMaxFileSize", "", "tempFile", "Ljava/io/File;", "isNewDevices", "compressWithSaveRotation", "toFileUriString", "getFileExtensionFromGallery", "getFileExtensionFromExternalApp", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchImageResizer implements ImageResizer {

    @NotNull
    private static final Set<String> UNRESIZABLE_TYPES;

    @NotNull
    private final Context appContext;

    @NotNull
    private final FeatureChecker featureChecker;
    public static final int $stable = 8;

    static {
        String[] elements = {"heic", "heif", "webp"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        UNRESIZABLE_TYPES = C7705l.j0(elements);
    }

    public SearchImageResizer(@NotNull Context appContext, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appContext = appContext;
        this.featureChecker = featureChecker;
    }

    private final int calculateInSampleSize(int rawHeight, int rawWidth, int reqWidth, int reqHeight) {
        int i11 = 1;
        if (rawHeight <= reqHeight && rawWidth <= reqWidth) {
            return 1;
        }
        int i12 = rawHeight / 2;
        int i13 = rawWidth / 2;
        while (i12 / i11 >= reqHeight && i13 / i11 >= reqWidth) {
            i11 *= 2;
        }
        return i11;
    }

    private final void compressWhileBiggerThanMaxFileSize(Bitmap bitmap, File file) {
        int i11 = 100;
        do {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i11, new FileOutputStream(file));
            i11--;
        } while (file.length() > 4000000);
    }

    private final void compressWithSaveRotation(Bitmap bitmap, float degrees, File tempFile) {
        Bitmap rotateBitmap = rotateBitmap(bitmap, -degrees);
        compressWhileBiggerThanMaxFileSize(rotateBitmap, tempFile);
        FileExtKt.writeBitmap$default(tempFile, rotateBitmap(rotateBitmap, degrees), Bitmap.CompressFormat.JPEG, 0, 4, null);
    }

    private final boolean containedInWithIgnoreCase(String str, Collection<String> collection) {
        Collection<String> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (h.D((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [SI.b] */
    private final Bitmap decodeBitmapNewWay(Uri sourceFileUri, final int sizeLimit) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(this.appContext.getContentResolver(), sourceFileUri);
        decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder$OnHeaderDecodedListener() { // from class: SI.b
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                SearchImageResizer.decodeBitmapNewWay$lambda$1(SearchImageResizer.this, sizeLimit, imageDecoder, imageInfo, source);
            }
        });
        Intrinsics.checkNotNullExpressionValue(decodeBitmap, "decodeBitmap(...)");
        return decodeBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decodeBitmapNewWay$lambda$1(SearchImageResizer searchImageResizer, int i11, ImageDecoder decoder, ImageDecoder.ImageInfo info, ImageDecoder.Source source) {
        Size size;
        Size size2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(source, "<unused var>");
        size = info.getSize();
        int width = size.getWidth();
        size2 = info.getSize();
        decoder.setTargetSampleSize(searchImageResizer.calculateInSampleSize(width, size2.getHeight(), i11, i11));
    }

    private final Bitmap decodeBitmapOldWay(Uri sourceFileUri, int sizeLimit) {
        ContentResolver contentResolver = this.appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        InputStream openInputStream = contentResolver.openInputStream(sourceFileUri);
        if (openInputStream == null) {
            throw new IOException(G.b(sourceFileUri, "Can't open "));
        }
        try {
            BufferedInputStream bufferedInputStream = openInputStream instanceof BufferedInputStream ? (BufferedInputStream) openInputStream : new BufferedInputStream(openInputStream, 8192);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int available = bufferedInputStream.available();
                if (!isNewDevices() && isInUnresizableTypes(sourceFileUri)) {
                    available++;
                }
                bufferedInputStream.mark(available);
                BitmapFactory.decodeStream(bufferedInputStream, null, options);
                options.inSampleSize = calculateInSampleSize(options.outWidth, options.outHeight, sizeLimit, sizeLimit);
                options.inJustDecodeBounds = false;
                options.inDensity = Math.max(options.outWidth, options.outHeight);
                options.inTargetDensity = sizeLimit * options.inSampleSize;
                bufferedInputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                if (decodeStream == null) {
                    throw new IllegalStateException("Can't decode bitmap.");
                }
                bufferedInputStream.close();
                openInputStream.close();
                return decodeStream;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(openInputStream, th2);
                throw th3;
            }
        }
    }

    private final Bitmap decodeBitmapOldWayBytes(Uri sourceFileUri, int sizeLimit) {
        ContentResolver contentResolver = this.appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        InputStream openInputStream = contentResolver.openInputStream(sourceFileUri);
        try {
            if (openInputStream == null) {
                throw new IOException(G.b(sourceFileUri, "Can't open "));
            }
            try {
                byte[] c11 = C5652b.c(openInputStream);
                openInputStream.close();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(c11, 0, c11.length, options);
                options.inSampleSize = calculateInSampleSize(options.outWidth, options.outHeight, sizeLimit, sizeLimit);
                options.inJustDecodeBounds = false;
                options.inDensity = Math.max(options.outWidth, options.outHeight);
                options.inTargetDensity = sizeLimit * options.inSampleSize;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c11, 0, c11.length, options);
                if (decodeByteArray == null) {
                    throw new IllegalStateException("Can't decode bitmap.");
                }
                openInputStream.close();
                return decodeByteArray;
            } finally {
            }
        } finally {
        }
    }

    private final Bitmap decodeSampledBitmap(Uri sourceFileUri, int sizeLimit) {
        return (isNewDevices() && isInUnresizableTypes(sourceFileUri)) ? decodeBitmapNewWay(sourceFileUri, sizeLimit) : this.featureChecker.isEnabled(ImageResizeByBytesInSearchByPhotoFlag.INSTANCE) ? decodeBitmapOldWayBytes(sourceFileUri, sizeLimit) : decodeBitmapOldWay(sourceFileUri, sizeLimit);
    }

    private final String getFileExtensionFromExternalApp(Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(this.appContext.getContentResolver().getType(uri));
    }

    private final String getFileExtensionFromGallery(Uri uri) {
        String fileUriString = toFileUriString(uri);
        if (fileUriString != null) {
            return MimeTypeMap.getFileExtensionFromUrl(fileUriString);
        }
        return null;
    }

    private final float getRotation(Uri sourceFileUri) {
        ContentResolver contentResolver = this.appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        InputStream openInputStream = contentResolver.openInputStream(sourceFileUri);
        if (openInputStream == null) {
            throw new IOException(G.b(sourceFileUri, "Can't open "));
        }
        try {
            int f7 = new a(openInputStream).f(1, "Orientation");
            float f11 = f7 != 3 ? f7 != 6 ? f7 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
            openInputStream.close();
            return f11;
        } finally {
        }
    }

    private final boolean isInUnresizableTypes(Uri uri) {
        String fileExtensionFromGallery = getFileExtensionFromGallery(uri);
        if (fileExtensionFromGallery == null) {
            fileExtensionFromGallery = getFileExtensionFromExternalApp(uri);
        }
        return containedInWithIgnoreCase(fileExtensionFromGallery, UNRESIZABLE_TYPES);
    }

    private final boolean isNewDevices() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private final Bitmap rotateBitmap(Bitmap bitmap, float degrees) {
        if (degrees == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final String toFileUriString(Uri uri) {
        if (!Intrinsics.d(uri.getScheme(), "content")) {
            return uri.toString();
        }
        Cursor query = this.appContext.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex == -1) {
                query.close();
                return null;
            }
            query.moveToFirst();
            String string = query.getString(columnIndex);
            if (string == null) {
                query.close();
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file://");
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < string.length(); i11++) {
                char charAt = string.charAt(i11);
                if (!CharsKt.c(charAt)) {
                    sb3.append(charAt);
                }
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            sb2.append(sb4);
            String sb5 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
            query.close();
            return sb5;
        } finally {
        }
    }

    @Override // ru.ozon.app.android.platform.image.ImageResizer
    @NotNull
    public String resize(@NotNull Uri sourceFileUri, float sizeLimit) {
        Intrinsics.checkNotNullParameter(sourceFileUri, "sourceFileUri");
        Bitmap decodeSampledBitmap = decodeSampledBitmap(sourceFileUri, (int) sizeLimit);
        float rotation = getRotation(sourceFileUri);
        File createTempFile = File.createTempFile("ozon_tmp_", ".jpeg", this.appContext.getCacheDir());
        if (isInUnresizableTypes(sourceFileUri)) {
            Intrinsics.f(createTempFile);
            compressWithSaveRotation(decodeSampledBitmap, rotation, createTempFile);
        } else {
            Bitmap rotateBitmap = rotateBitmap(decodeSampledBitmap, rotation);
            Intrinsics.f(createTempFile);
            compressWhileBiggerThanMaxFileSize(rotateBitmap, createTempFile);
        }
        String path = createTempFile.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }
}
