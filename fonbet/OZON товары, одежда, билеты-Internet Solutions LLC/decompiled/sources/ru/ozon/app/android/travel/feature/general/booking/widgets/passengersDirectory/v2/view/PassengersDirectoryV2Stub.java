package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001aR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/view/PassengersDirectoryV2Stub;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "standardOffset", "bottomOffset", "imageSize", "imageIV", "Landroidx/appcompat/widget/AppCompatImageView;", "headerTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "explanationTAV", "buttonResetLB", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV2Stub extends LinearLayout {
    private final int bottomOffset;

    @NotNull
    private final LinkButtonView buttonResetLB;

    @NotNull
    private final TextAtomView explanationTAV;

    @NotNull
    private final TextAtomView headerTAV;

    @NotNull
    private final AppCompatImageView imageIV;
    private final int imageSize;
    private final int standardOffset;

    public /* synthetic */ PassengersDirectoryV2Stub(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull PassengersDirectoryV2VO.StubV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AppCompatImageView appCompatImageView = this.imageIV;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageViewExtKt.load$default(appCompatImageView, ThemeExtKt.isDarkThemeActive(context) ? item.getImage().getDarkImageUrl() : item.getImage().getLightImageUrl(), null, null, null, null, false, null, 126, null);
        TextAtomHolderKt.bind$default(this.headerTAV, item.getHeader(), null, 2, null);
        TextAtomHolderKt.bind$default(this.explanationTAV, item.getExplanation(), null, 2, null);
        this.buttonResetLB.bindOrGone(item.getResetSearch(), actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersDirectoryV2Stub(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12, context);
        this.standardOffset = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.bottomOffset = px2;
        int px3 = ResourceExtKt.toPx(112, context);
        this.imageSize = px3;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        setGravity(1);
        this.imageIV = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setGravity(1);
        textAtomView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.headerTAV = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        textAtomView2.setLayoutParams(layoutParams);
        this.explanationTAV = textAtomView2;
        LinkButtonView linkButtonView = new LinkButtonView(context, null, 0, 0, 14, null);
        linkButtonView.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        linkButtonView.setLayoutParams(layoutParams2);
        this.buttonResetLB = linkButtonView;
        setOrientation(1);
        addView(appCompatImageView, px3, px3);
        addView(textAtomView);
        addView(textAtomView2);
        addView(linkButtonView);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), px2);
    }
}
