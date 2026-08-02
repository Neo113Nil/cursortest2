package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.Outline;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 .2\u00020\u0001:\u0002./B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014J0\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0007J\u0010\u0010'\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010(J(\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fontScale", "", "height", "", "initHeightSpec", "nameTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getNameTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "nameTextView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "seatTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "setTextColor", "color", "setSeatBackgroundColor", "setSeatTextColor", "setIndicatorAlpha", "alpha", "bindSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "setUpSeatTextView", "textView", "horizontalPadding", "margin", "radius", "Companion", "RoundedOutlineProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2PassengerTabView extends FrameLayout {
    private final float fontScale;
    private final int height;
    private final int initHeightSpec;

    /* renamed from: nameTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate nameTextView;

    @NotNull
    private final AppCompatTextView seatTextView;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSeatsSchemeV2PassengerTabView.class, "nameTextView", "getNameTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView$Companion;", "", "<init>", "()V", "DEFAULT_FONT_SCALE", "", "DEFAULT_TAB_SIZE", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView$RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "radius", "", "<init>", "(F)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public FlightSeatsSchemeV2PassengerTabView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float f7 = Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f);
        this.fontScale = f7;
        int px = UiExtKt.toPx(32 * f7, context);
        this.height = px;
        this.initHeightSpec = View.MeasureSpec.makeMeasureSpec(px, LinearLayoutManager.INVALID_OFFSET);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.nameTextView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSeatsSchemeV2PassengerTabView$special$$inlined$preCreationViewPool$default$1(this), new FlightSeatsSchemeV2PassengerTabView$special$$inlined$preCreationViewPool$default$2());
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.seatTextView = appCompatTextView;
        float pxF = ResourceExtKt.toPxF(10, context);
        setClipToOutline(true);
        setOutlineProvider(new RoundedOutlineProvider(pxF));
        setUpSeatTextView(appCompatTextView, UiExtKt.toPx(4, context), UiExtKt.toPx(4, context), pxF);
        addView(getNameTextView());
        addView(appCompatTextView);
    }

    private final TextAtomV2View getNameTextView() {
        return (TextAtomV2View) this.nameTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final void setUpSeatTextView(AppCompatTextView textView, int horizontalPadding, int margin, float radius) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(margin);
        textView.setLayoutParams(layoutParams);
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new RoundedOutlineProvider(radius));
        textView.setPadding(horizontalPadding, textView.getPaddingTop(), horizontalPadding, textView.getPaddingBottom());
        textView.setTextAppearance(UniTextStyles.BODY_300_X_SMALL.getResId());
        textView.setVisibility(8);
    }

    public final void bind(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setBackgroundColor(item.getBackgroundColor());
        TextAtomV2View nameTextView = getNameTextView();
        TextHolderKt.bind$default(nameTextView, item.getName(), null, 2, null);
        nameTextView.setTextColor(item.getTextColor());
        bindSeat(item.getSelectedSeat());
    }

    public final void bindSeat(FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI item) {
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
        int i11 = bottom - top;
        int measuredHeight = (i11 - getNameTextView().getMeasuredHeight()) / 2;
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getNameTextView().getMeasuredWidth() + getPaddingLeft();
        int measuredHeight2 = (i11 - this.seatTextView.getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams = this.seatTextView.getLayoutParams();
        int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        LayoutExtKt.layoutLeftTop(getNameTextView(), paddingLeft, measuredHeight);
        LayoutExtKt.layoutLeftTop(this.seatTextView, marginStart, measuredHeight2);
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
        getNameTextView().setTextColor(color);
    }
}
