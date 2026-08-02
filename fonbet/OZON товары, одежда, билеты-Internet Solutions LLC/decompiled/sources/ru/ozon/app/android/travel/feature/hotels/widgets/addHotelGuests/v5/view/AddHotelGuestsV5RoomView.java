package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view;

import Bi.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J7\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5RoomView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "addHotelGuestsV5VO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTO", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "bindSubtitle", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "button", "", "isButtonVisible", "bindButton", "(Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;ZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "disclaimerAtom", "bindDisclaimer", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "position", "getFormYByPosition", "(I)I", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "Landroidx/recyclerview/widget/RecyclerView;", "formsRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "addGuestLbv", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "disclaimerDc", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5RoomView extends LinearLayout {

    @NotNull
    private final LinkButtonView addGuestLbv;

    @NotNull
    private final DisclaimerContainer disclaimerDc;

    @NotNull
    private final RecyclerView formsRv;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    public /* synthetic */ AddHotelGuestsV5RoomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTav);
        addView(this.subtitleTav);
        addView(this.formsRv);
        addView(this.addGuestLbv);
        addView(this.disclaimerDc);
    }

    public final void bind(@NotNull AddHotelGuestsV5VO addHotelGuestsV5VO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(addHotelGuestsV5VO, "addHotelGuestsV5VO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindTitle(addHotelGuestsV5VO.getTitle());
        bindSubtitle(addHotelGuestsV5VO.getSubtitle());
        bindButton(addHotelGuestsV5VO.getAddGuestButton(), addHotelGuestsV5VO.getIsAddGuestButtonVisible(), actionHandler);
        bindDisclaimer(addHotelGuestsV5VO.getDisclaimer());
    }

    public final void bindButton(LinkButtonVO button, boolean isButtonVisible, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (isButtonVisible) {
            this.addGuestLbv.bindOrGone(button, actionHandler);
        } else {
            ViewExtKt.gone(this.addGuestLbv);
        }
    }

    public final void bindDisclaimer(DisclaimerAtom disclaimerAtom) {
        DisclaimerHolderKt.bindOrGone$default(this.disclaimerDc, disclaimerAtom, null, 2, null);
    }

    public final void bindSubtitle(@NotNull TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        TextHolderKt.bind$default(this.subtitleTav, textDTO, null, 2, null);
    }

    public final void bindTitle(@NotNull TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        TextHolderKt.bind$default(this.titleTav, textDTO, null, 2, null);
    }

    public final int getFormYByPosition(int position) {
        View findViewByPosition;
        RecyclerView.o layoutManager = this.formsRv.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(position)) == null) {
            return 0;
        }
        return (int) findViewByPosition.getY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddHotelGuestsV5RoomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        a.d(-1, -2, textAtomV2View);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View2;
        a.d(-1, -2, textAtomV2View2);
        this.subtitleTav = textAtomV2View2;
        RecyclerView recyclerView = new RecyclerView(context2);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.formsRv = recyclerView;
        int i13 = 0;
        AttributeSet attributeSet2 = null;
        LinkButtonView linkButtonView = new LinkButtonView(context2, attributeSet2, i13, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(8, context2);
        linkButtonView.setLayoutParams(layoutParams);
        this.addGuestLbv = linkButtonView;
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(context2, attributeSet2, i13, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ResourceExtKt.toPx(12, context2);
        disclaimerContainer.setLayoutParams(layoutParams2);
        disclaimerContainer.setVisibility(8);
        this.disclaimerDc = disclaimerContainer;
        setOrientation(1);
        addViews();
    }
}
