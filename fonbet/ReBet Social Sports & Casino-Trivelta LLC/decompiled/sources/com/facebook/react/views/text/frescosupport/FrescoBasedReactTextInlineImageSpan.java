package com.facebook.react.views.text.frescosupport;

import W6.b;
import Z6.a;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import c7.C2892b;
import com.facebook.imagepipeline.request.c;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import n4.u;
import n4.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J9\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(JW\u00100\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R&\u0010\u000e\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00102R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010B\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010G¨\u0006I"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageSpan;", "Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "Landroid/content/res/Resources;", "resources", "", "height", "width", "tintColor", "Landroid/net/Uri;", "uri", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "LW6/b;", "Lcom/facebook/imagepipeline/request/b;", "draweeControllerBuilder", "", "callerContext", "", ViewProps.RESIZE_MODE, "<init>", "(Landroid/content/res/Resources;IIILandroid/net/Uri;Lcom/facebook/react/bridge/ReadableMap;LW6/b;Ljava/lang/Object;Ljava/lang/String;)V", "", "onDetachedFromWindow", "()V", "onStartTemporaryDetach", "onAttachedToWindow", "onFinishTemporaryDetach", "Landroid/graphics/Paint;", "paint", "", "text", ViewProps.START, ViewProps.END, "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/widget/TextView;", "textView", "setTextView", "(Landroid/widget/TextView;)V", "Landroid/graphics/Canvas;", "canvas", "", C5444x.f55808b, ViewProps.TOP, "y", ViewProps.BOTTOM, "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "I", "Lcom/facebook/react/bridge/ReadableMap;", "LW6/b;", "Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/widget/TextView;", "_uri", "Landroid/net/Uri;", "_width", "_height", "Lc7/b;", "LZ6/a;", "draweeHolder", "Lc7/b;", "Landroid/graphics/drawable/Drawable;", EventKeys.VALUE_KEY, "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getWidth", "()I", "getHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrescoBasedReactTextInlineImageSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrescoBasedReactTextInlineImageSpan.kt\ncom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
/* loaded from: classes2.dex */
public final class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {
    private final int _height;

    @NotNull
    private final Uri _uri;
    private final int _width;

    @Nullable
    private final Object callerContext;

    @Nullable
    private Drawable drawable;

    @NotNull
    private final b draweeControllerBuilder;

    @NotNull
    private final C2892b draweeHolder;

    @Nullable
    private final ReadableMap headers;

    @Nullable
    private final String resizeMode;

    @Nullable
    private TextView textView;
    private final int tintColor;

    public FrescoBasedReactTextInlineImageSpan(@NotNull Resources resources, int i10, int i11, int i12, @Nullable Uri EMPTY, @Nullable ReadableMap readableMap, @NotNull b draweeControllerBuilder, @Nullable Object obj, @Nullable String str) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.tintColor = i12;
        this.headers = readableMap;
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.callerContext = obj;
        this.resizeMode = str;
        if (EMPTY == null) {
            EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        this._uri = EMPTY;
        this._width = (int) PixelUtil.toPixelFromDIP(i11);
        this._height = (int) PixelUtil.toPixelFromDIP(i10);
        this.draweeHolder = new C2892b(Z6.b.u(resources).a());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x10, int top, int y10, int bottom, @NotNull Paint paint) {
        BlendMode blendMode;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (getDrawable() == null) {
            c x11 = c.x(this._uri);
            ReactNetworkImageRequest.Companion companion = ReactNetworkImageRequest.INSTANCE;
            Intrinsics.checkNotNull(x11);
            ReactNetworkImageRequest fromBuilderWithHeaders$default = ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(companion, x11, this.headers, null, 4, null);
            ((a) this.draweeHolder.f()).t(ImageResizeMode.toScaleType(this.resizeMode));
            this.draweeControllerBuilder.z();
            this.draweeControllerBuilder.a(this.draweeHolder.e());
            Object obj = this.callerContext;
            if (obj != null) {
                Intrinsics.checkNotNullExpressionValue(this.draweeControllerBuilder.B(obj), "setCallerContext(...)");
            }
            this.draweeControllerBuilder.E(fromBuilderWithHeaders$default);
            W6.a build = this.draweeControllerBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            this.draweeHolder.o(build);
            this.draweeControllerBuilder.z();
            Drawable g10 = this.draweeHolder.g();
            if (g10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            g10.setBounds(0, 0, this._width, this._height);
            if (this.tintColor != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    v.a();
                    int i10 = this.tintColor;
                    blendMode = BlendMode.SRC_IN;
                    g10.setColorFilter(u.a(i10, blendMode));
                } else {
                    g10.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_IN));
                }
            }
            g10.setCallback(this.textView);
            this.drawable = g10;
        }
        canvas.save();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.translate(x10, ((y10 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    @Nullable
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    /* renamed from: getHeight, reason: from getter */
    public int get_height() {
        return this._height;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fm != null) {
            int i10 = -this._height;
            fm.ascent = i10;
            fm.descent = 0;
            fm.top = i10;
            fm.bottom = 0;
        }
        return this._width;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    /* renamed from: getWidth, reason: from getter */
    public int get_width() {
        return this._width;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onAttachedToWindow() {
        this.draweeHolder.j();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onDetachedFromWindow() {
        this.draweeHolder.k();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onFinishTemporaryDetach() {
        this.draweeHolder.j();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onStartTemporaryDetach() {
        this.draweeHolder.k();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void setTextView(@Nullable TextView textView) {
        this.textView = textView;
    }
}
