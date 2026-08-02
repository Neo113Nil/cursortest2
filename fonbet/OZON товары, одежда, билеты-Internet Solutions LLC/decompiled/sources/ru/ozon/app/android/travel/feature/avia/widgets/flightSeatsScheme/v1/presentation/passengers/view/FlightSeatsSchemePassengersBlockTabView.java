package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.view;

import android.content.Context;
import android.graphics.Outline;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 +2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0014J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0007J\u0010\u0010#\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\fH\u0002J(\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockTabView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fontScale", "", "height", "", "initHeightSpec", "nameTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "seatTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "setTextColor", "color", "setSeatBackgroundColor", "setSeatTextColor", "setIndicatorAlpha", "alpha", "bindSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "setUpNameTextView", "textView", "setUpSeatTextView", "horizontalPadding", "margin", "radius", "Companion", "RoundedOutlineProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockTabView extends FrameLayout {
    private final float fontScale;
    private final int height;
    private final int initHeightSpec;

    @NotNull
    private final TextAtomView nameTextView;

    @NotNull
    private final AppCompatTextView seatTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockTabView$Companion;", "", "<init>", "()V", "DEFAULT_FONT_SCALE", "", "DEFAULT_TAB_SIZE", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockTabView$RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "radius", "", "<init>", "(F)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RoundedOutlineProvider extends ViewOutlineProvider {
        private final float radius;

        public RoundedOutlineProvider(float f7) {
            this.radius = f7;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemePassengersBlockTabView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float f7 = Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f);
        this.fontScale = f7;
        int px = UiExtKt.toPx(32 * f7, context);
        this.height = px;
        this.initHeightSpec = View.MeasureSpec.makeMeasureSpec(px, LinearLayoutManager.INVALID_OFFSET);
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        this.nameTextView = textAtomView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.seatTextView = appCompatTextView;
        float pxF = ResourceExtKt.toPxF(10, context);
        setClipToOutline(true);
        setOutlineProvider(new RoundedOutlineProvider(pxF));
        setUpNameTextView(textAtomView);
        setUpSeatTextView(appCompatTextView, UiExtKt.toPx(4, context), UiExtKt.toPx(4, context), pxF);
        addView(textAtomView);
        addView(appCompatTextView);
    }

    private final void setUpNameTextView(TextAtomView textView) {
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    private final void setUpSeatTextView(AppCompatTextView textView, int horizontalPadding, int margin, float radius) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(margin);
        textView.setLayoutParams(layoutParams);
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new RoundedOutlineProvider(radius));
        textView.setPadding(horizontalPadding, textView.getPaddingTop(), horizontalPadding, textView.getPaddingBottom());
        textView.setTextAppearance(R$style.TextStyle_Body_M);
        textView.setVisibility(8);
    }

    public final void bind(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setBackgroundColor(item.getBackgroundColor());
        TextAtomView textAtomView = this.nameTextView;
        TextAtomHolderKt.bind$default(textAtomView, item.getName(), null, 2, null);
        textAtomView.setTextColor(item.getTextColor());
        bindSeat(item.getSelectedSeat());
    }

    public final void bindSeat(FlightSeatsSchemePassengersBlockVO.SelectedSeat item) {
        AppCompatTextView appCompatTextView = this.seatTextView;
        appCompatTextView.setVisibility(item != null ? 0 : 8);
        if (item != null) {
            appCompatTextView.setText(item.getNumber());
            appCompatTextView.setTextColor(item.getTextColor());
            appCompatTextView.setBackgroundColor(item.getBackgroundColor());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int measuredWidth = this.nameTextView.getMeasuredWidth() + getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        ViewGroup.LayoutParams layoutParams = this.seatTextView.getLayoutParams();
        int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        LayoutExtKt.layoutLeftTop(this.nameTextView, paddingLeft, paddingTop);
        LayoutExtKt.layoutLeftTop(this.seatTextView, marginStart, paddingTop2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            Intrinsics.f(childAt);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, widthMeasureSpec, this.initHeightSpec);
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                i13 += childAt.getMeasuredWidth();
            }
        }
        if (this.seatTextView.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = this.seatTextView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i13 + i11, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i12, 1073741824));
    }

    public final void setIndicatorAlpha(float alpha) {
        this.seatTextView.setAlpha(alpha);
    }

    public final void setSeatBackgroundColor(int color) {
        this.seatTextView.setBackgroundColor(color);
    }

    public final void setSeatTextColor(int color) {
        this.seatTextView.setTextColor(color);
    }

    public final void setTextColor(int color) {
        this.nameTextView.setTextColor(color);
    }
}
