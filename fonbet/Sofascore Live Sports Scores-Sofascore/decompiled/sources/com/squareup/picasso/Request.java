package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fn0;
import defpackage.lnb;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class Request {
    private static final long TOO_LONG_LOG = 5000000000L;
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;
    int id;
    int networkPolicy;
    public final boolean onlyScaleDown;
    public final Picasso.Priority priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final List<Transformation> transformations;
    public final Uri uri;

    private Request(Uri uri, int i, String str, List<Transformation> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority) {
        this.uri = uri;
        this.resourceId = i;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = Collections.unmodifiableList(list);
        }
        this.targetWidth = i2;
        this.targetHeight = i3;
        this.centerCrop = z;
        this.centerInside = z2;
        this.centerCropGravity = i4;
        this.onlyScaleDown = z3;
        this.rotationDegrees = f;
        this.rotationPivotX = f2;
        this.rotationPivotY = f3;
        this.hasRotationPivot = z4;
        this.purgeable = z5;
        this.config = config;
        this.priority = priority;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public String getName() {
        Uri uri = this.uri;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.resourceId);
    }

    public boolean hasCustomTransformations() {
        return this.transformations != null;
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    public String logId() {
        long nanoTime = System.nanoTime() - this.started;
        if (nanoTime > TOO_LONG_LOG) {
            StringBuilder sb = new StringBuilder();
            sb.append(plainId());
            sb.append('+');
            return fn0.n(sb, nanoTime / 1000000000, 's');
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(plainId());
        sb2.append('+');
        return lnb.l(nanoTime / 1000000, "ms", sb2);
    }

    public boolean needsMatrixTransform() {
        return hasSize() || this.rotationDegrees != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean needsTransformation() {
        return needsMatrixTransform() || hasCustomTransformations();
    }

    public String plainId() {
        return wv8.j(new StringBuilder("[R"), this.id, ']');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.resourceId;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.uri);
        }
        List<Transformation> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            for (Transformation transformation : this.transformations) {
                sb.append(' ');
                sb.append(transformation.key());
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(',');
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(',');
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.purgeable) {
            sb.append(" purgeable");
        }
        if (this.config != null) {
            sb.append(' ');
            sb.append(this.config);
        }
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        private boolean centerCrop;
        private int centerCropGravity;
        private boolean centerInside;
        private Bitmap.Config config;
        private boolean hasRotationPivot;
        private boolean onlyScaleDown;
        private Picasso.Priority priority;
        private boolean purgeable;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
        private String stableKey;
        private int targetHeight;
        private int targetWidth;
        private List<Transformation> transformations;
        private Uri uri;

        private Builder(Request request) {
            this.uri = request.uri;
            this.resourceId = request.resourceId;
            this.stableKey = request.stableKey;
            this.targetWidth = request.targetWidth;
            this.targetHeight = request.targetHeight;
            this.centerCrop = request.centerCrop;
            this.centerInside = request.centerInside;
            this.centerCropGravity = request.centerCropGravity;
            this.rotationDegrees = request.rotationDegrees;
            this.rotationPivotX = request.rotationPivotX;
            this.rotationPivotY = request.rotationPivotY;
            this.hasRotationPivot = request.hasRotationPivot;
            this.purgeable = request.purgeable;
            this.onlyScaleDown = request.onlyScaleDown;
            if (request.transformations != null) {
                this.transformations = new ArrayList(request.transformations);
            }
            this.config = request.config;
            this.priority = request.priority;
        }

        public Request build() {
            boolean z = this.centerInside;
            if (z && this.centerCrop) {
                a70.r("Center crop and center inside can not be used together.");
                return null;
            }
            boolean z2 = this.centerCrop;
            if (z2 && this.targetWidth == 0 && this.targetHeight == 0) {
                a70.r("Center crop requires calling resize with positive width and height.");
                return null;
            }
            if (z && this.targetWidth == 0 && this.targetHeight == 0) {
                a70.r("Center inside requires calling resize with positive width and height.");
                return null;
            }
            Picasso.Priority priority = this.priority;
            if (priority == null) {
                priority = Picasso.Priority.NORMAL;
                this.priority = priority;
            }
            return new Request(this.uri, this.resourceId, this.stableKey, this.transformations, this.targetWidth, this.targetHeight, z2, z, this.centerCropGravity, this.onlyScaleDown, this.rotationDegrees, this.rotationPivotX, this.rotationPivotY, this.hasRotationPivot, this.purgeable, this.config, priority);
        }

        public Builder centerCrop(int i) {
            if (this.centerInside) {
                a70.r("Center crop can not be used after calling centerInside");
                return null;
            }
            this.centerCrop = true;
            this.centerCropGravity = i;
            return this;
        }

        public Builder centerInside() {
            if (this.centerCrop) {
                a70.r("Center inside can not be used after calling centerCrop");
                return null;
            }
            this.centerInside = true;
            return this;
        }

        public Builder clearCenterCrop() {
            this.centerCrop = false;
            this.centerCropGravity = 17;
            return this;
        }

        public Builder clearCenterInside() {
            this.centerInside = false;
            return this;
        }

        public Builder clearOnlyScaleDown() {
            this.onlyScaleDown = false;
            return this;
        }

        public Builder clearResize() {
            this.targetWidth = 0;
            this.targetHeight = 0;
            this.centerCrop = false;
            this.centerInside = false;
            return this;
        }

        public Builder clearRotation() {
            this.rotationDegrees = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rotationPivotX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rotationPivotY = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.hasRotationPivot = false;
            return this;
        }

        public Builder config(@NonNull Bitmap.Config config) {
            if (config != null) {
                this.config = config;
                return this;
            }
            a70.p("config == null");
            return null;
        }

        public boolean hasImage() {
            return (this.uri == null && this.resourceId == 0) ? false : true;
        }

        public boolean hasPriority() {
            return this.priority != null;
        }

        public boolean hasSize() {
            return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
        }

        public Builder onlyScaleDown() {
            if (this.targetHeight == 0 && this.targetWidth == 0) {
                a70.r("onlyScaleDown can not be applied without resize");
                return null;
            }
            this.onlyScaleDown = true;
            return this;
        }

        public Builder priority(@NonNull Picasso.Priority priority) {
            if (priority == null) {
                a70.p("Priority invalid.");
                return null;
            }
            if (this.priority == null) {
                this.priority = priority;
                return this;
            }
            a70.r("Priority already set.");
            return null;
        }

        public Builder purgeable() {
            this.purgeable = true;
            return this;
        }

        public Builder resize(int i, int i2) {
            if (i < 0) {
                a70.p("Width must be positive number or 0.");
                return null;
            }
            if (i2 < 0) {
                a70.p("Height must be positive number or 0.");
                return null;
            }
            if (i2 == 0 && i == 0) {
                a70.p("At least one dimension has to be positive number.");
                return null;
            }
            this.targetWidth = i;
            this.targetHeight = i2;
            return this;
        }

        public Builder rotate(float f, float f2, float f3) {
            this.rotationDegrees = f;
            this.rotationPivotX = f2;
            this.rotationPivotY = f3;
            this.hasRotationPivot = true;
            return this;
        }

        public Builder setResourceId(int i) {
            if (i == 0) {
                a70.p("Image resource ID may not be 0.");
                return null;
            }
            this.resourceId = i;
            this.uri = null;
            return this;
        }

        public Builder setUri(@NonNull Uri uri) {
            if (uri == null) {
                a70.p("Image URI may not be null.");
                return null;
            }
            this.uri = uri;
            this.resourceId = 0;
            return this;
        }

        public Builder stableKey(@Nullable String str) {
            this.stableKey = str;
            return this;
        }

        public Builder transform(@NonNull Transformation transformation) {
            if (transformation == null) {
                a70.p("Transformation must not be null.");
                return null;
            }
            if (transformation.key() == null) {
                a70.p("Transformation key must not be null.");
                return null;
            }
            List list = this.transformations;
            if (list == null) {
                list = new ArrayList(2);
                this.transformations = list;
            }
            list.add(transformation);
            return this;
        }

        public Builder rotate(float f) {
            this.rotationDegrees = f;
            return this;
        }

        public Builder centerCrop() {
            return centerCrop(17);
        }

        public Builder transform(@NonNull List<? extends Transformation> list) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    transform(list.get(i));
                }
                return this;
            }
            a70.p("Transformation list must not be null.");
            return null;
        }

        public Builder(@NonNull Uri uri) {
            setUri(uri);
        }

        public Builder(int i) {
            setResourceId(i);
        }

        public Builder(Uri uri, int i, Bitmap.Config config) {
            this.uri = uri;
            this.resourceId = i;
            this.config = config;
        }
    }
}
