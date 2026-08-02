package com.swmansion.enriched.markdown.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.mp4parser.boxes.apple.TrackLoadSettingsAtom;

/* compiled from: AsyncDrawable.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0017J(\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/AsyncDrawable;", "Landroid/graphics/drawable/Drawable;", "url", "", "<init>", "(Ljava/lang/String;)V", "internalDrawable", "getInternalDrawable", "()Landroid/graphics/drawable/Drawable;", "setInternalDrawable", "(Landroid/graphics/drawable/Drawable;)V", "value", "", "isLoaded", "()Z", "onLoaded", "Lkotlin/Function0;", "", "getOnLoaded", "()Lkotlin/jvm/functions/Function0;", "setOnLoaded", "(Lkotlin/jvm/functions/Function0;)V", TrackLoadSettingsAtom.TYPE, "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "setBounds", "left", "top", "right", "bottom", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AsyncDrawable extends Drawable {
    private Drawable internalDrawable;
    private boolean isLoaded;
    private Function0<Unit> onLoaded;
    private final String url;
    private static final ExecutorService sharedExecutor = Executors.newFixedThreadPool(4);
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    public AsyncDrawable(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.internalDrawable = new ColorDrawable(0);
        load();
    }

    public final Drawable getInternalDrawable() {
        return this.internalDrawable;
    }

    public final void setInternalDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<set-?>");
        this.internalDrawable = drawable;
    }

    /* renamed from: isLoaded, reason: from getter */
    public final boolean getIsLoaded() {
        return this.isLoaded;
    }

    public final Function0<Unit> getOnLoaded() {
        return this.onLoaded;
    }

    public final void setOnLoaded(Function0<Unit> function0) {
        this.onLoaded = function0;
    }

    private final void load() {
        sharedExecutor.execute(new Runnable() { // from class: com.swmansion.enriched.markdown.utils.AsyncDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AsyncDrawable.load$lambda$4(AsyncDrawable.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$4(final AsyncDrawable asyncDrawable) {
        try {
            InputStream openStream = new URL(asyncDrawable.url).openStream();
            try {
                final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                CloseableKt.closeFinally(openStream, null);
                mainHandler.post(new Runnable() { // from class: com.swmansion.enriched.markdown.utils.AsyncDrawable$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncDrawable.load$lambda$4$lambda$2(decodeStream, asyncDrawable);
                    }
                });
            } finally {
            }
        } catch (Exception e) {
            Log.e("AsyncDrawable", "Failed to load image from: " + asyncDrawable.url, e);
            mainHandler.post(new Runnable() { // from class: com.swmansion.enriched.markdown.utils.AsyncDrawable$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncDrawable.load$lambda$4$lambda$3(AsyncDrawable.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$4$lambda$2(Bitmap bitmap, AsyncDrawable asyncDrawable) {
        if (bitmap != null) {
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "getSystem(...)");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(system, bitmap);
            bitmapDrawable.setBounds(asyncDrawable.getBounds());
            asyncDrawable.internalDrawable = bitmapDrawable;
        }
        asyncDrawable.isLoaded = true;
        Function0<Unit> function0 = asyncDrawable.onLoaded;
        if (function0 != null) {
            function0.invoke();
        }
        asyncDrawable.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$4$lambda$3(AsyncDrawable asyncDrawable) {
        asyncDrawable.isLoaded = true;
        Function0<Unit> function0 = asyncDrawable.onLoaded;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.internalDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.internalDrawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.internalDrawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return this.internalDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        this.internalDrawable.setBounds(left, top, right, bottom);
    }
}
