package ru.ozon.app.android.travel.molecules.view.shimmer;

import I1.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import id.c;
import id.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rR+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "updateBackground", "()V", "resolveAttributes", "addShimmerView", "configureAndSetShimmer", "", "<set-?>", "cornerRadius$delegate", "Lid/f;", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "shimmerBackgroundColor$delegate", "getShimmerBackgroundColor", "()I", "setShimmerBackgroundColor", "(I)V", "shimmerBackgroundColor", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedShimmerView extends ShimmerFrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(RoundedShimmerView.class, "cornerRadius", "getCornerRadius()F", 0), w.c(RoundedShimmerView.class, "shimmerBackgroundColor", "getShimmerBackgroundColor()I", 0)};
    public static final int $stable = 8;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final f cornerRadius;

    /* renamed from: shimmerBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final f shimmerBackgroundColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedShimmerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addShimmerView() {
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(this.backgroundDrawable);
        addView(view);
        updateBackground();
    }

    private final void configureAndSetShimmer() {
        setShimmer(new Shimmer.AlphaHighlightBuilder().setDuration(800L).setRepeatDelay(800L).setBaseAlpha(1.0f).setHighlightAlpha(0.0f).setDropoff(0.34f).setIntensity(0.0f).setTilt(0.0f).setRepeatMode(1).setShape(Shimmer.Shape.LINEAR).build());
    }

    private final void resolveAttributes(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R$styleable.RoundedShimmerView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setCornerRadius(obtainStyledAttributes.getDimension(R$styleable.RoundedShimmerView_rsvCornersRadius, getCornerRadius()));
        setShimmerBackgroundColor(obtainStyledAttributes.getColor(R$styleable.RoundedShimmerView_rsvBackgroundTint, getShimmerBackgroundColor()));
        Unit unit = Unit.f71690a;
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackground() {
        this.backgroundDrawable.setCornerRadius(getCornerRadius());
        this.backgroundDrawable.setColor(getShimmerBackgroundColor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getCornerRadius() {
        return ((Number) this.cornerRadius.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getShimmerBackgroundColor() {
        return ((Number) this.shimmerBackgroundColor.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final void setCornerRadius(float f7) {
        this.cornerRadius.setValue(this, $$delegatedProperties[0], Float.valueOf(f7));
    }

    public final void setShimmerBackgroundColor(int i11) {
        this.shimmerBackgroundColor.setValue(this, $$delegatedProperties[1], Integer.valueOf(i11));
    }

    public /* synthetic */ RoundedShimmerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedShimmerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        final Float valueOf = Float.valueOf(ResourceExtKt.toPxF(8, context));
        this.cornerRadius = new c<Float>(valueOf) { // from class: ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Float oldValue, Float newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.floatValue();
                oldValue.floatValue();
                this.updateBackground();
            }
        };
        final Integer valueOf2 = Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.layerSurface));
        this.shimmerBackgroundColor = new c<Integer>(valueOf2) { // from class: ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView$special$$inlined$observable$2
            @Override // id.c
            protected void afterChange(m<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                this.updateBackground();
            }
        };
        this.backgroundDrawable = new GradientDrawable();
        resolveAttributes(context, attributeSet, i11, i12);
        addShimmerView();
        configureAndSetShimmer();
    }
}
