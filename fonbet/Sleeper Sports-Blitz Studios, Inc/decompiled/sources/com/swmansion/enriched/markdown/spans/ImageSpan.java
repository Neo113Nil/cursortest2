package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.enriched.markdown.EnrichedMarkdownText;
import com.swmansion.enriched.markdown.styles.ImageStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import com.swmansion.enriched.markdown.utils.AsyncDrawable;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ImageSpan.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001bJ\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0015H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u0011H\u0016J4\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u000102H\u0016J<\u00103\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u000102H\u0016JR\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00152\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/ImageSpan;", "Landroid/text/style/ImageSpan;", "Landroid/text/style/LineHeightSpan;", "context", "Landroid/content/Context;", "imageUrl", "", "styleConfig", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "isInline", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/swmansion/enriched/markdown/styles/StyleConfig;Z)V", "getImageUrl", "()Ljava/lang/String;", "()Z", "loadedDrawable", "Landroid/graphics/drawable/Drawable;", "imageStyle", "Lcom/swmansion/enriched/markdown/styles/ImageStyle;", "height", "", "borderRadiusPx", "cachedWidth", "initialDrawable", "viewRef", "Ljava/lang/ref/WeakReference;", "Lcom/swmansion/enriched/markdown/EnrichedMarkdownText;", "setupLoadingLogic", "", "handleImageLoaded", "asyncDrawable", "Lcom/swmansion/enriched/markdown/utils/AsyncDrawable;", "wrapAndAssignDrawable", "base", "requestReflow", "registerTextView", ViewHierarchyConstants.VIEW_KEY, "updateWidthAndRecreate", "newWidth", "getAvailableWidth", "getDrawable", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "chooseHeight", "spanstartv", ViewProps.LINE_HEIGHT, "draw", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "ScaledImageDrawable", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageSpan extends android.text.style.ImageSpan implements android.text.style.LineHeightSpan {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MINIMUM_VALID_DIMENSION = 0;
    private final int borderRadiusPx;
    private int cachedWidth;
    private final int height;
    private final ImageStyle imageStyle;
    private final String imageUrl;
    private final Drawable initialDrawable;
    private final boolean isInline;
    private Drawable loadedDrawable;
    private WeakReference<EnrichedMarkdownText> viewRef;

    public /* synthetic */ ImageSpan(Context context, String str, StyleConfig styleConfig, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, styleConfig, (i & 8) != 0 ? false : z);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: isInline, reason: from getter */
    public final boolean getIsInline() {
        return this.isInline;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageSpan(Context context, String imageUrl, StyleConfig styleConfig, boolean z) {
        super(r0.createInitialDrawable(styleConfig, imageUrl, z), imageUrl, Build.VERSION.SDK_INT >= 29 ? 2 : 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(styleConfig, "styleConfig");
        Companion companion = INSTANCE;
        this.imageUrl = imageUrl;
        this.isInline = z;
        ImageStyle imageStyle = styleConfig.getImageStyle();
        this.imageStyle = imageStyle;
        this.height = z ? companion.calculateInlineImageSize(styleConfig) : (int) imageStyle.getHeight();
        this.borderRadiusPx = (int) (imageStyle.getBorderRadius() * context.getResources().getDisplayMetrics().density);
        Drawable drawable = super.getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        this.initialDrawable = drawable;
        setupLoadingLogic();
    }

    private final void setupLoadingLogic() {
        final Drawable drawable = this.initialDrawable;
        if (drawable instanceof AsyncDrawable) {
            AsyncDrawable asyncDrawable = (AsyncDrawable) drawable;
            asyncDrawable.setOnLoaded(new Function0() { // from class: com.swmansion.enriched.markdown.spans.ImageSpan$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = ImageSpan.setupLoadingLogic$lambda$0(ImageSpan.this, drawable);
                    return unit;
                }
            });
            if (asyncDrawable.getIsLoaded()) {
                handleImageLoaded(asyncDrawable);
                return;
            }
            return;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            wrapAndAssignDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupLoadingLogic$lambda$0(ImageSpan imageSpan, Drawable drawable) {
        imageSpan.handleImageLoaded((AsyncDrawable) drawable);
        return Unit.INSTANCE;
    }

    private final void handleImageLoaded(AsyncDrawable asyncDrawable) {
        wrapAndAssignDrawable(asyncDrawable.getInternalDrawable());
    }

    private final void wrapAndAssignDrawable(Drawable base) {
        int coerceAtLeast;
        WeakReference<EnrichedMarkdownText> weakReference = this.viewRef;
        EnrichedMarkdownText enrichedMarkdownText = weakReference != null ? weakReference.get() : null;
        if (this.isInline) {
            coerceAtLeast = this.height;
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(enrichedMarkdownText != null ? getAvailableWidth(enrichedMarkdownText) : this.cachedWidth, 0);
        }
        this.loadedDrawable = new ScaledImageDrawable(base, coerceAtLeast, this.height, this.borderRadiusPx, !this.isInline);
        requestReflow();
    }

    private final void requestReflow() {
        EnrichedMarkdownText enrichedMarkdownText;
        WeakReference<EnrichedMarkdownText> weakReference = this.viewRef;
        if (weakReference == null || (enrichedMarkdownText = weakReference.get()) == null) {
            return;
        }
        CharSequence text = enrichedMarkdownText.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            int spanStart = spannable.getSpanStart(this);
            int spanEnd = spannable.getSpanEnd(this);
            if (spanStart == -1 || spanEnd == -1) {
                return;
            }
            spannable.setSpan(this, spanStart, spanEnd, 33);
            return;
        }
        enrichedMarkdownText.invalidate();
        enrichedMarkdownText.requestLayout();
    }

    public final void registerTextView(final EnrichedMarkdownText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewRef = new WeakReference<>(view);
        if (this.isInline) {
            return;
        }
        int availableWidth = getAvailableWidth(view);
        if (availableWidth > 0) {
            updateWidthAndRecreate(availableWidth);
        }
        view.post(new Runnable() { // from class: com.swmansion.enriched.markdown.spans.ImageSpan$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ImageSpan.registerTextView$lambda$2(ImageSpan.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerTextView$lambda$2(ImageSpan imageSpan, EnrichedMarkdownText enrichedMarkdownText) {
        int availableWidth = imageSpan.getAvailableWidth(enrichedMarkdownText);
        if (availableWidth != imageSpan.cachedWidth) {
            imageSpan.updateWidthAndRecreate(availableWidth);
        }
    }

    private final void updateWidthAndRecreate(int newWidth) {
        Drawable drawable;
        if (newWidth <= 0 || this.cachedWidth == newWidth) {
            return;
        }
        this.cachedWidth = newWidth;
        Drawable drawable2 = this.initialDrawable;
        AsyncDrawable asyncDrawable = drawable2 instanceof AsyncDrawable ? (AsyncDrawable) drawable2 : null;
        if (asyncDrawable == null || (drawable = asyncDrawable.getInternalDrawable()) == null) {
            drawable = this.initialDrawable;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            wrapAndAssignDrawable(drawable);
        }
    }

    private final int getAvailableWidth(EnrichedMarkdownText view) {
        Layout layout = view.getLayout();
        return layout != null ? layout.getWidth() : view.getWidth();
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        int intValue;
        Drawable drawable = this.loadedDrawable;
        if (drawable == null) {
            drawable = this.initialDrawable;
        }
        if (!(drawable instanceof ScaledImageDrawable)) {
            if (this.isInline) {
                intValue = this.height;
            } else {
                Integer valueOf = Integer.valueOf(this.cachedWidth);
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : drawable.getIntrinsicWidth();
            }
            boolean z = this.isInline;
            drawable.setBounds(0, 0, RangesKt.coerceAtLeast(intValue, 0), RangesKt.coerceAtLeast(this.height, 0));
        }
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        return getDrawable().getBounds().right;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fm) {
        int i;
        int i2;
        if (fm == null || this.isInline || (i2 = this.height) <= (i = fm.descent - fm.ascent)) {
            return;
        }
        int i3 = i2 - i;
        fm.descent += i3;
        fm.bottom += i3;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Drawable drawable = getDrawable();
        int save = canvas.save();
        try {
            if (this.isInline) {
                canvas.translate(x, (y - r4) + (drawable.getBounds().height() * 0.1f));
            } else {
                canvas.translate(x, top);
            }
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* compiled from: ImageSpan.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0017J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/ImageSpan$ScaledImageDrawable;", "Landroid/graphics/drawable/Drawable;", "imageDrawable", "targetWidth", "", "targetHeight", ViewProps.BORDER_RADIUS, "isBlockImage", "", "<init>", "(Landroid/graphics/drawable/Drawable;IIIZ)V", "clipPath", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ScaledImageDrawable extends Drawable {
        private final int borderRadius;
        private final Path clipPath;
        private final Drawable imageDrawable;
        private final int targetHeight;
        private final int targetWidth;

        public ScaledImageDrawable(Drawable imageDrawable, int i, int i2, int i3, boolean z) {
            Path path;
            Pair pair;
            Intrinsics.checkNotNullParameter(imageDrawable, "imageDrawable");
            this.imageDrawable = imageDrawable;
            this.targetWidth = i;
            this.targetHeight = i2;
            this.borderRadius = i3;
            if (i3 > 0) {
                path = new Path();
                path.addRoundRect(0.0f, 0.0f, i, i2, i3, i3, Path.Direction.CW);
            } else {
                path = null;
            }
            this.clipPath = path;
            setBounds(0, 0, i, i2);
            int intrinsicWidth = imageDrawable.getIntrinsicWidth();
            int intrinsicHeight = imageDrawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                pair = TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2));
            } else if (z) {
                pair = TuplesKt.to(Integer.valueOf(i), Integer.valueOf((int) (intrinsicHeight * (i / intrinsicWidth))));
            } else {
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float min = Math.min(i / f, i2 / f2);
                pair = TuplesKt.to(Integer.valueOf((int) (f * min)), Integer.valueOf((int) (f2 * min)));
            }
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            int i4 = (i - intValue) / 2;
            int i5 = (i2 - intValue2) / 2;
            imageDrawable.setBounds(i4, i5, intValue + i4, intValue2 + i5);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (this.clipPath == null) {
                this.imageDrawable.draw(canvas);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipPath(this.clipPath);
                this.imageDrawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
            this.imageDrawable.setAlpha(alpha);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter cf) {
            this.imageDrawable.setColorFilter(cf);
        }

        @Override // android.graphics.drawable.Drawable
        @Deprecated(message = "Deprecated in Java")
        public int getOpacity() {
            return this.imageDrawable.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.targetWidth;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.targetHeight;
        }
    }

    /* compiled from: ImageSpan.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/ImageSpan$Companion;", "", "<init>", "()V", "MINIMUM_VALID_DIMENSION", "", "calculateInlineImageSize", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "createInitialDrawable", "Landroid/graphics/drawable/Drawable;", "url", "", "isInline", "", "prepareDrawable", "src", "tw", "th", "PlaceholderDrawable", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateInlineImageSize(StyleConfig style) {
            return (int) style.getInlineImageStyle().getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable createInitialDrawable(StyleConfig style, String url, boolean isInline) {
            int calculateInlineImageSize = isInline ? calculateInlineImageSize(style) : (int) style.getImageStyle().getHeight();
            Drawable prepareDrawable = prepareDrawable(url, calculateInlineImageSize, calculateInlineImageSize);
            return prepareDrawable == null ? new PlaceholderDrawable(calculateInlineImageSize, calculateInlineImageSize) : prepareDrawable;
        }

        private final Drawable prepareDrawable(String src, int tw, int th) {
            BitmapDrawable bitmapDrawable;
            if (StringsKt.startsWith$default(src, "http", false, 2, (Object) null)) {
                AsyncDrawable asyncDrawable = new AsyncDrawable(src);
                asyncDrawable.setBounds(0, 0, tw, th);
                return asyncDrawable;
            }
            String removePrefix = StringsKt.removePrefix(src, (CharSequence) "file://");
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(removePrefix);
                if (decodeFile != null) {
                    Resources system = Resources.getSystem();
                    Intrinsics.checkNotNullExpressionValue(system, "getSystem(...)");
                    bitmapDrawable = new BitmapDrawable(system, decodeFile);
                    bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                } else {
                    bitmapDrawable = null;
                }
                return bitmapDrawable;
            } catch (Exception e) {
                Log.w("ImageSpan", "Failed to load local image: " + removePrefix, e);
                return null;
            }
        }

        /* compiled from: ImageSpan.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0017J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/ImageSpan$Companion$PlaceholderDrawable;", "Landroid/graphics/drawable/Drawable;", "w", "", CmcdData.STREAMING_FORMAT_HLS, "<init>", "(II)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class PlaceholderDrawable extends Drawable {
            private final int h;
            private final int w;

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
            }

            @Override // android.graphics.drawable.Drawable
            @Deprecated(message = "Deprecated in Java")
            public int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int alpha) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter cf) {
            }

            public PlaceholderDrawable(int i, int i2) {
                this.w = i;
                this.h = i2;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicWidth() {
                return this.w;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicHeight() {
                return this.h;
            }
        }
    }
}
