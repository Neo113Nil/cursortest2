package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import defpackage.cwh;
import defpackage.ogj;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class RequestHandler {
    public static void calculateInSampleSize(int i, int i2, int i3, int i4, BitmapFactory.Options options, Request request) {
        int max;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                max = request.centerInside ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean hasSize = request.hasSize();
        boolean z = request.config != null;
        if (!hasSize && !z && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        boolean z2 = request.purgeable;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    public int getRetryCount() {
        return 0;
    }

    @Nullable
    public abstract Result load(Request request, int i) throws IOException;

    public boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean supportsReplay() {
        return false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final cwh source;

        public Result(@Nullable Bitmap bitmap, @Nullable cwh cwhVar, @NonNull Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) == (cwhVar != null)) {
                ogj.b();
                throw null;
            }
            this.bitmap = bitmap;
            this.source = cwhVar;
            this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
            this.exifOrientation = i;
        }

        @Nullable
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getExifOrientation() {
            return this.exifOrientation;
        }

        @NonNull
        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        @Nullable
        public cwh getSource() {
            return this.source;
        }

        public Result(@NonNull cwh cwhVar, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(null, (cwh) Utils.checkNotNull(cwhVar, "source == null"), loadedFrom, 0);
        }

        public Result(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }
    }

    public static void calculateInSampleSize(int i, int i2, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i, i2, options.outWidth, options.outHeight, options, request);
    }
}
