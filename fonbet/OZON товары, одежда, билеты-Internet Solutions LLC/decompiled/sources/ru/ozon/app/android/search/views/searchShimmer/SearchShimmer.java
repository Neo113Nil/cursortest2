package ru.ozon.app.android.search.views.searchShimmer;

import Qc.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shimmerWidth", "anim", "Landroid/view/animation/Animation;", "shimmerView", "Landroid/widget/ImageView;", "shimmerGlobalListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "currentConfig", "Lru/ozon/app/android/search/views/searchShimmer/ShimmerConfig;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDetachedFromWindow", "configureShimmer", "config", "startAnimation", "stopAnimation", "configureAnimation", "configureShimmerWidth", "configureViewTreeObserver", "getBitmap", "Landroid/graphics/Bitmap;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchShimmer extends FrameLayout {
    private Animation anim;
    private ShimmerConfig currentConfig;
    private ViewTreeObserver.OnGlobalLayoutListener shimmerGlobalListener;

    @NotNull
    private final ImageView shimmerView;
    private int shimmerWidth;
    public static final int $stable = 8;
    private static final int DEFAULT_SHIMMER_WIDTH = UiExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchShimmer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureAnimation(ShimmerConfig config) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), config.getAnimRes());
        this.anim = loadAnimation;
        if (loadAnimation != null) {
            loadAnimation.setAnimationListener(config.getAnimationListener());
        }
    }

    private final void configureShimmerWidth(ShimmerConfig config) {
        if (this.shimmerWidth != config.getShimmerWidth()) {
            this.shimmerWidth = config.getShimmerWidth();
            ImageView imageView = this.shimmerView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.shimmerWidth, -1);
            layoutParams.gravity = 16;
            imageView.setLayoutParams(layoutParams);
        }
    }

    private final void configureViewTreeObserver(final ShimmerConfig config) {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.shimmerGlobalListener);
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.search.views.searchShimmer.SearchShimmer$configureViewTreeObserver$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Bitmap bitmap;
                ImageView imageView;
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                SearchShimmer searchShimmer = (SearchShimmer) this;
                bitmap = searchShimmer.getBitmap(config);
                c.b bVar = new c.b(searchShimmer.getContext());
                bVar.c(1);
                bVar.d();
                c.a a11 = bVar.a(bitmap);
                imageView = searchShimmer.shimmerView;
                a11.a(imageView);
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.shimmerGlobalListener = onGlobalLayoutListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getBitmap(ShimmerConfig config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        Collection<Float> values = config.getAlphaWithPositionGradientMap().values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(androidx.core.graphics.c.f(themeColor, (int) (((Number) it.next()).floatValue() * 255))));
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.shimmerView.getWidth(), 0.0f, C7714v.T0(arrayList), C7714v.R0(config.getAlphaWithPositionGradientMap().keySet()), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        Bitmap createBitmap = Bitmap.createBitmap(this.shimmerWidth, this.shimmerView.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap).drawRect(new RectF(0.0f, 0.0f, this.shimmerWidth, this.shimmerView.getHeight()), paint);
        return createBitmap;
    }

    public final void configureShimmer(@NotNull ShimmerConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.d(this.currentConfig, config)) {
            return;
        }
        this.currentConfig = config;
        configureShimmerWidth(config);
        configureAnimation(config);
        configureViewTreeObserver(config);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.shimmerGlobalListener);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = getHeight();
        for (View view : ViewGroupExtKt.children(this)) {
            if (!Intrinsics.d(view, this.shimmerView)) {
                view.measure(widthMeasureSpec, heightMeasureSpec);
                height = Integer.max(view.getMeasuredHeight(), height);
            }
        }
        MeasureExtKt.measureExactly(this.shimmerView, this.shimmerWidth, height * 2);
        setMeasuredDimension(size, height);
    }

    public final void startAnimation() {
        this.shimmerView.startAnimation(this.anim);
    }

    public final void stopAnimation() {
        this.shimmerView.clearAnimation();
    }

    public /* synthetic */ SearchShimmer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchShimmer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shimmerWidth = DEFAULT_SHIMMER_WIDTH;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.shimmerWidth, -1);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        imageView.setElevation(1.0f);
        addView(imageView);
        this.shimmerView = imageView;
    }
}
