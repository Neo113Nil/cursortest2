package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RemoteViewsAction;
import com.squareup.picasso.Request;
import defpackage.a70;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class RequestCreator {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    public RequestCreator(Picasso picasso, Uri uri, int i) {
        this.setPlaceholder = true;
        if (picasso.shutdown) {
            a70.r("Picasso instance already shut down. Cannot submit new requests.");
            throw null;
        }
        this.picasso = picasso;
        this.data = new Request.Builder(uri, i, picasso.defaultBitmapConfig);
    }

    private Request createRequest(long j) {
        int andIncrement = nextId.getAndIncrement();
        Request build = this.data.build();
        build.id = andIncrement;
        build.started = j;
        boolean z = this.picasso.loggingEnabled;
        if (z) {
            Utils.log("Main", "created", build.plainId(), build.toString());
        }
        Request transformRequest = this.picasso.transformRequest(build);
        if (transformRequest != build) {
            transformRequest.id = andIncrement;
            transformRequest.started = j;
            if (z) {
                Utils.log("Main", "changed", transformRequest.logId(), "into " + transformRequest);
            }
        }
        return transformRequest;
    }

    private Drawable getPlaceholderDrawable() {
        int i = this.placeholderResId;
        return i != 0 ? this.picasso.context.getDrawable(i) : this.placeholderDrawable;
    }

    private void performRemoteViewInto(RemoteViewsAction remoteViewsAction) {
        Bitmap quickMemoryCacheCheck;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(remoteViewsAction.getKey())) != null) {
            remoteViewsAction.complete(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i = this.placeholderResId;
        if (i != 0) {
            remoteViewsAction.setImageResource(i);
        }
        this.picasso.enqueueAndSubmit(remoteViewsAction);
    }

    public RequestCreator centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public RequestCreator centerInside() {
        this.data.centerInside();
        return this;
    }

    public RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    public RequestCreator config(@NonNull Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public RequestCreator error(int i) {
        if (i == 0) {
            a70.p("Error image resource invalid.");
            return null;
        }
        if (this.errorDrawable == null) {
            this.errorResId = i;
            return this;
        }
        a70.r("Error image already set.");
        return null;
    }

    public void fetch(@Nullable Callback callback) {
        long nanoTime = System.nanoTime();
        if (this.deferred) {
            a70.r("Fit cannot be used with fetch.");
            return;
        }
        if (this.data.hasImage()) {
            if (!this.data.hasPriority()) {
                this.data.priority(Picasso.Priority.LOW);
            }
            Request createRequest = createRequest(nanoTime);
            String createKey = Utils.createKey(createRequest, new StringBuilder());
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || this.picasso.quickMemoryCacheCheck(createKey) == null) {
                this.picasso.submit(new FetchAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, createKey, callback));
                return;
            }
            if (this.picasso.loggingEnabled) {
                Utils.log("Main", "completed", createRequest.plainId(), "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
            }
        }
    }

    public RequestCreator fit() {
        this.deferred = true;
        return this;
    }

    public Bitmap get() throws IOException {
        long nanoTime = System.nanoTime();
        Utils.checkNotMain();
        if (this.deferred) {
            a70.r("Fit cannot be used with get.");
            return null;
        }
        if (!this.data.hasImage()) {
            return null;
        }
        Request createRequest = createRequest(nanoTime);
        GetAction getAction = new GetAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, Utils.createKey(createRequest, new StringBuilder()));
        Picasso picasso = this.picasso;
        return BitmapHunter.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, getAction).hunt();
    }

    public Object getTag() {
        return this.tag;
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        Utils.checkMain();
        if (imageView == null) {
            a70.p("Target must not be null.");
            return;
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(imageView);
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                return;
            }
            return;
        }
        if (this.deferred) {
            if (this.data.hasSize()) {
                a70.r("Fit cannot be used with resize.");
                return;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.setPlaceholder) {
                    PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                }
                this.picasso.defer(imageView, new DeferredRequestCreator(this, imageView, callback));
                return;
            }
            this.data.resize(width, height);
        }
        Request createRequest = createRequest(nanoTime);
        String createKey = Utils.createKey(createRequest);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) == null) {
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
            }
            this.picasso.enqueueAndSubmit(new ImageViewAction(this.picasso, imageView, createRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, createKey, this.tag, callback, this.noFade));
            return;
        }
        this.picasso.cancelRequest(imageView);
        Picasso picasso = this.picasso;
        Context context = picasso.context;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        PicassoDrawable.setBitmap(imageView, context, quickMemoryCacheCheck, loadedFrom, this.noFade, picasso.indicatorsEnabled);
        if (this.picasso.loggingEnabled) {
            Utils.log("Main", "completed", createRequest.plainId(), "from " + loadedFrom);
        }
        if (callback != null) {
            callback.onSuccess();
        }
    }

    public RequestCreator memoryPolicy(@NonNull MemoryPolicy memoryPolicy, @NonNull MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            a70.p("Memory policy cannot be null.");
            return null;
        }
        this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
        if (memoryPolicyArr == null) {
            a70.p("Memory policy cannot be null.");
            return null;
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    a70.p("Memory policy cannot be null.");
                    return null;
                }
                this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
            }
        }
        return this;
    }

    public RequestCreator networkPolicy(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            a70.p("Network policy cannot be null.");
            return null;
        }
        this.networkPolicy = networkPolicy.index | this.networkPolicy;
        if (networkPolicyArr == null) {
            a70.p("Network policy cannot be null.");
            return null;
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    a70.p("Network policy cannot be null.");
                    return null;
                }
                this.networkPolicy = networkPolicy2.index | this.networkPolicy;
            }
        }
        return this;
    }

    public RequestCreator noFade() {
        this.noFade = true;
        return this;
    }

    public RequestCreator noPlaceholder() {
        if (this.placeholderResId != 0) {
            a70.r("Placeholder resource already set.");
            return null;
        }
        if (this.placeholderDrawable == null) {
            this.setPlaceholder = false;
            return this;
        }
        a70.r("Placeholder image already set.");
        return null;
    }

    public RequestCreator onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(int i) {
        if (!this.setPlaceholder) {
            a70.r("Already explicitly declared as no placeholder.");
            return null;
        }
        if (i == 0) {
            a70.p("Placeholder image resource invalid.");
            return null;
        }
        if (this.placeholderDrawable == null) {
            this.placeholderResId = i;
            return this;
        }
        a70.r("Placeholder image already set.");
        return null;
    }

    public RequestCreator priority(@NonNull Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public RequestCreator purgeable() {
        this.data.purgeable();
        return this;
    }

    public RequestCreator resize(int i, int i2) {
        this.data.resize(i, i2);
        return this;
    }

    public RequestCreator resizeDimen(int i, int i2) {
        Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2));
    }

    public RequestCreator rotate(float f) {
        this.data.rotate(f);
        return this;
    }

    public RequestCreator stableKey(@NonNull String str) {
        this.data.stableKey(str);
        return this;
    }

    public RequestCreator tag(@NonNull Object obj) {
        if (obj == null) {
            a70.p("Tag invalid.");
            return null;
        }
        if (this.tag == null) {
            this.tag = obj;
            return this;
        }
        a70.r("Tag already set.");
        return null;
    }

    public RequestCreator transform(@NonNull Transformation transformation) {
        this.data.transform(transformation);
        return this;
    }

    public RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    public RequestCreator rotate(float f, float f2, float f3) {
        this.data.rotate(f, f2, f3);
        return this;
    }

    public RequestCreator transform(@NonNull List<? extends Transformation> list) {
        this.data.transform(list);
        return this;
    }

    public RequestCreator centerCrop(int i) {
        this.data.centerCrop(i);
        return this;
    }

    public RequestCreator error(@NonNull Drawable drawable) {
        if (drawable != null) {
            if (this.errorResId == 0) {
                this.errorDrawable = drawable;
                return this;
            }
            a70.r("Error image already set.");
            return null;
        }
        a70.p("Error image may not be null.");
        return null;
    }

    public RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new Request.Builder(null, 0, null);
    }

    public RequestCreator placeholder(@NonNull Drawable drawable) {
        if (this.setPlaceholder) {
            if (this.placeholderResId == 0) {
                this.placeholderDrawable = drawable;
                return this;
            }
            a70.r("Placeholder image already set.");
            return null;
        }
        a70.r("Already explicitly declared as no placeholder.");
        return null;
    }

    public void fetch() {
        fetch(null);
    }

    public void into(@NonNull RemoteViews remoteViews, int i, int i2, @NonNull Notification notification) {
        into(remoteViews, i, i2, notification, null);
    }

    public void into(@NonNull RemoteViews remoteViews, int i, int i2, @NonNull Notification notification, @Nullable String str) {
        into(remoteViews, i, i2, notification, str, null);
    }

    public void into(@NonNull RemoteViews remoteViews, int i, int i2, @NonNull Notification notification, @Nullable String str, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            a70.p("RemoteViews must not be null.");
            return;
        }
        if (notification != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request createRequest = createRequest(nanoTime);
                    performRemoteViewInto(new RemoteViewsAction.NotificationAction(this.picasso, createRequest, remoteViews, i, i2, notification, str, this.memoryPolicy, this.networkPolicy, Utils.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                a70.p("Cannot use placeholder or error drawables with remote views.");
                return;
            }
            a70.r("Fit cannot be used with RemoteViews.");
            return;
        }
        a70.p("Notification must not be null.");
    }

    public void into(@NonNull RemoteViews remoteViews, int i, @NonNull int[] iArr) {
        into(remoteViews, i, iArr, (Callback) null);
    }

    public void into(@NonNull RemoteViews remoteViews, int i, @NonNull int[] iArr, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            a70.p("remoteViews must not be null.");
            return;
        }
        if (iArr != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request createRequest = createRequest(nanoTime);
                    performRemoteViewInto(new RemoteViewsAction.AppWidgetAction(this.picasso, createRequest, remoteViews, i, iArr, this.memoryPolicy, this.networkPolicy, Utils.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                a70.p("Cannot use placeholder or error drawables with remote views.");
                return;
            }
            a70.r("Fit cannot be used with remote views.");
            return;
        }
        a70.p("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(@NonNull Target target) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        Utils.checkMain();
        if (target != null) {
            if (!this.deferred) {
                if (!this.data.hasImage()) {
                    this.picasso.cancelRequest(target);
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    return;
                }
                Request createRequest = createRequest(nanoTime);
                String createKey = Utils.createKey(createRequest);
                if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
                    this.picasso.cancelRequest(target);
                    target.onBitmapLoaded(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
                    return;
                } else {
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    this.picasso.enqueueAndSubmit(new TargetAction(this.picasso, target, createRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, createKey, this.tag, this.errorResId));
                    return;
                }
            }
            a70.r("Fit cannot be used with a Target.");
            return;
        }
        a70.p("Target must not be null.");
    }
}
