package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import A00.a;
import B0.C2454a;
import Pk0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001=B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b#\u0010$J%\u0010*\u001a\f\u0012\u0004\u0012\u00020\u00020(j\u0002`)2\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b*\u0010+R,\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterDO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "<init>", "()V", "", "selected", "", "actionId", "switchActionState", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "", "position", "", "switchControlState", "(Ljava/util/List;ILjava/lang/Boolean;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;)Ljava/lang/Object;", "state", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterStateUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterMapper;", "mapper", "ActionFooterButtonPayload", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionsFooterViewMapper extends WidgetViewMapper2<ActionsFooterComponent, ActionsFooterDO, ActionsFooterVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ActionsFooterVH> holderProducer = new ActionsFooterViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<ActionsFooterStateUpdateKey>> supportedUpdates = C7714v.a0(ActionsFooterStateUpdateKey.class);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewMapper$ActionFooterButtonPayload;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "button", "", "index", "", "isRight", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "getButton", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "I", "getIndex", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ActionFooterButtonPayload {
        public static final int $stable = SingleReviewDTO.FooterControlDTO.$stable;

        @NotNull
        private final SingleReviewDTO.FooterControlDTO button;
        private final int index;
        private final boolean isRight;

        public ActionFooterButtonPayload(@NotNull SingleReviewDTO.FooterControlDTO button, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.index = i11;
            this.isRight = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionFooterButtonPayload)) {
                return false;
            }
            ActionFooterButtonPayload actionFooterButtonPayload = (ActionFooterButtonPayload) other;
            return Intrinsics.d(this.button, actionFooterButtonPayload.button) && this.index == actionFooterButtonPayload.index && this.isRight == actionFooterButtonPayload.isRight;
        }

        @NotNull
        public final SingleReviewDTO.FooterControlDTO getButton() {
            return this.button;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRight) + C2454a.a(this.index, this.button.hashCode() * 31, 31);
        }

        /* renamed from: isRight, reason: from getter */
        public final boolean getIsRight() {
            return this.isRight;
        }

        @NotNull
        public String toString() {
            SingleReviewDTO.FooterControlDTO footerControlDTO = this.button;
            int i11 = this.index;
            boolean z11 = this.isRight;
            StringBuilder sb2 = new StringBuilder("ActionFooterButtonPayload(button=");
            sb2.append(footerControlDTO);
            sb2.append(", index=");
            sb2.append(i11);
            sb2.append(", isRight=");
            return a.a(")", sb2, z11);
        }
    }

    private final ActionsFooterVO switchActionState(ActionsFooterVO actionsFooterVO, Boolean bool, String str) {
        AtomActionDTO action;
        String id2;
        List[] elements = {actionsFooterVO.getLeftButtons(), actionsFooterVO.getRightButtons()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = C7705l.B(elements).iterator();
        while (it.hasNext()) {
            List<SingleReviewDTO.FooterControlDTO> list = (List) it.next();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                CommonControlSettings common = ((SingleReviewDTO.FooterControlDTO) obj).getNormal().getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    Map<String, String> params = action.getParams();
                    if (params == null || (id2 = params.get("reaction")) == null) {
                        id2 = action.getId();
                    }
                    if (id2 != null) {
                        if (id2.equals(str)) {
                            return ActionsFooterVO.copy$default(actionsFooterVO, 0L, null, false, list == actionsFooterVO.getLeftButtons() ? switchControlState(actionsFooterVO.getLeftButtons(), i11, bool) : actionsFooterVO.getLeftButtons(), list == actionsFooterVO.getRightButtons() ? switchControlState(actionsFooterVO.getRightButtons(), i11, bool) : actionsFooterVO.getRightButtons(), false, 39, null);
                        }
                        i11 = i12;
                    }
                }
                i11 = i12;
            }
        }
        return actionsFooterVO;
    }

    private final List<SingleReviewDTO.FooterControlDTO> switchControlState(List<SingleReviewDTO.FooterControlDTO> list, int i11, Boolean bool) {
        ArrayList W02 = C7714v.W0(list);
        SingleReviewDTO.FooterControlDTO footerControlDTO = (SingleReviewDTO.FooterControlDTO) W02.get(i11);
        W02.set(i11, SingleReviewDTO.FooterControlDTO.copy$default(footerControlDTO, bool != null ? bool.booleanValue() : !footerControlDTO.isSelected(), null, null, 6, null));
        return W02;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ActionsFooterDO) && ((ActionsFooterDO) state).getActionsFooter() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ActionsFooterView actionsFooterView = new ActionsFooterView(context);
        actionsFooterView.setId(R$id.reviewActionsFooter);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        actionsFooterView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), dimens.getDP_16());
        actionsFooterView.setLayoutParams(marginLayoutParams);
        return actionsFooterView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ActionsFooterVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<ActionsFooterStateUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ActionsFooterComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ActionsFooterComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ActionsFooterMapper getMapper() {
        return component().getActionsFooterMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull ActionsFooterVO oldItem, @NotNull ActionsFooterVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        List<SingleReviewDTO.FooterControlDTO> rightButtons = oldItem.getRightButtons();
        Integer valueOf = rightButtons != null ? Integer.valueOf(rightButtons.size()) : null;
        List<SingleReviewDTO.FooterControlDTO> rightButtons2 = newItem.getRightButtons();
        if (Intrinsics.d(valueOf, rightButtons2 != null ? Integer.valueOf(rightButtons2.size()) : null)) {
            List<SingleReviewDTO.FooterControlDTO> leftButtons = oldItem.getLeftButtons();
            Integer valueOf2 = leftButtons != null ? Integer.valueOf(leftButtons.size()) : null;
            List<SingleReviewDTO.FooterControlDTO> leftButtons2 = newItem.getLeftButtons();
            if (Intrinsics.d(valueOf2, leftButtons2 != null ? Integer.valueOf(leftButtons2.size()) : null)) {
                ArrayList arrayList = new ArrayList();
                List<SingleReviewDTO.FooterControlDTO> rightButtons3 = oldItem.getRightButtons();
                if (rightButtons3 != null) {
                    int i11 = 0;
                    for (Object obj : rightButtons3) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        SingleReviewDTO.FooterControlDTO footerControlDTO = (SingleReviewDTO.FooterControlDTO) obj;
                        List<SingleReviewDTO.FooterControlDTO> rightButtons4 = newItem.getRightButtons();
                        if ((rightButtons4 != null ? rightButtons4.get(i11) : null) != null && !Intrinsics.d(newItem.getRightButtons().get(i11), footerControlDTO)) {
                            arrayList.add(new ActionFooterButtonPayload(newItem.getRightButtons().get(i11), i11, true));
                        }
                        i11 = i12;
                    }
                }
                List<SingleReviewDTO.FooterControlDTO> leftButtons3 = oldItem.getLeftButtons();
                if (leftButtons3 != null) {
                    int i13 = 0;
                    for (Object obj2 : leftButtons3) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        SingleReviewDTO.FooterControlDTO footerControlDTO2 = (SingleReviewDTO.FooterControlDTO) obj2;
                        List<SingleReviewDTO.FooterControlDTO> leftButtons4 = newItem.getLeftButtons();
                        if ((leftButtons4 != null ? leftButtons4.get(i13) : null) != null && !Intrinsics.d(newItem.getLeftButtons().get(i13), footerControlDTO2)) {
                            arrayList.add(new ActionFooterButtonPayload(newItem.getLeftButtons().get(i13), i13, false));
                        }
                        i13 = i14;
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                WidgetViewHolderKt.getEMPTY_PAYLOAD();
                return Unit.f71690a;
            }
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public ActionsFooterVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ActionsFooterVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ActionsFooterStateUpdateKey) {
            ActionsFooterStateUpdateKey actionsFooterStateUpdateKey = (ActionsFooterStateUpdateKey) update;
            if (Intrinsics.d(oldItem.getReviewUuid(), actionsFooterStateUpdateKey.getReviewUuid())) {
                return switchActionState(oldItem, Boolean.valueOf(actionsFooterStateUpdateKey.getIsSelected()), actionsFooterStateUpdateKey.getActionId());
            }
        }
        return oldItem;
    }
}
