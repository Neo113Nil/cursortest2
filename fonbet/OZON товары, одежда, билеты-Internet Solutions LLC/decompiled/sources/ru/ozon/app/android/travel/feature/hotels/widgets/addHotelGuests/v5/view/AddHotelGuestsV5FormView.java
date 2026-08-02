package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view;

import Am.C2438a;
import F3.G;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u0013¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5FormView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "placeViews", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "guestFormVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTO", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "buttonVO", "bindRemoveButton", "(Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonDTO", "bindSelectEmployeeButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "dp8", "I", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "removeGuestLbv", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "Landroidx/recyclerview/widget/RecyclerView;", "inputsRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "selectEmployeeBv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getSelectEmployeeBv", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "selectEmployeeBv", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5FormView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AddHotelGuestsV5FormView.class, "selectEmployeeBv", "getSelectEmployeeBv()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;
    private final int dp8;

    @NotNull
    private final RecyclerView inputsRv;

    @NotNull
    private final LinkButtonView removeGuestLbv;

    /* renamed from: selectEmployeeBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate selectEmployeeBv;

    @NotNull
    private final TextAtomV2View titleTav;

    public /* synthetic */ AddHotelGuestsV5FormView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTav);
        addView(this.removeGuestLbv);
        addView(this.inputsRv);
        addView(getSelectEmployeeBv());
    }

    private final ButtonV3View getSelectEmployeeBv() {
        return (ButtonV3View) this.selectEmployeeBv.getValue(this, $$delegatedProperties[0]);
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.titleTav.getId(), this.removeGuestLbv.getId(), this.dp8);
        dVar.c0(0.0f, this.titleTav.getId());
        dVar.C(this.titleTav.getId(), true);
        dVar.Z(this.titleTav.getId(), 7, 0);
        ConstraintSetExtKt.topToTop$default(dVar, this.removeGuestLbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.removeGuestLbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.inputsRv.getId(), this.titleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.inputsRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.inputsRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, getSelectEmployeeBv().getId(), this.inputsRv.getId(), this.dp8);
        ConstraintSetExtKt.startToStart$default(dVar, getSelectEmployeeBv().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, getSelectEmployeeBv().getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    public final void bind(@NotNull AddHotelGuestsV5VO.GuestFormVO guestFormVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(guestFormVO, "guestFormVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindTitle(guestFormVO.getResultTitle());
        bindRemoveButton(guestFormVO.getRemoveOptionalGuestButton(), actionHandler);
        bindSelectEmployeeButton(guestFormVO.getSelectEmployeeButton(), actionHandler);
    }

    public final void bindRemoveButton(LinkButtonVO buttonVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.removeGuestLbv.bindOrGone(buttonVO, actionHandler);
    }

    public final void bindSelectEmployeeButton(ButtonV3DTO buttonDTO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bindOrGone(getSelectEmployeeBv(), buttonDTO, actionHandler);
    }

    public final void bindTitle(TextDTO textDTO) {
        TextHolderKt.bindOrGone$default(this.titleTav, textDTO, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddHotelGuestsV5FormView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(Paddings.PADDING_300.getPx(), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        G.g(textAtomV2View, R$id.addHotelGuestsV5FormTitleTav, -2, -2);
        this.titleTav = textAtomV2View;
        Context context3 = context2;
        LinkButtonView linkButtonView = new LinkButtonView(context3, null, 0, 0, 14, null);
        linkButtonView.setId(R$id.addHotelGuestsV5FormRemoveGuestLbv);
        linkButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.removeGuestLbv = linkButtonView;
        RecyclerView recyclerView = new RecyclerView(context3);
        recyclerView.setId(R$id.addHotelGuestsV5FormInputsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.inputsRv = recyclerView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.selectEmployeeBv = new PreCreationViewPoolDelegate(context4, N.b(ButtonV3View.class), new AddHotelGuestsV5FormView$special$$inlined$preCreationViewPool$default$1(this), new AddHotelGuestsV5FormView$special$$inlined$preCreationViewPool$default$2());
        addViews();
        placeViews();
    }
}
