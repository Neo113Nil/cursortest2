package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import Sc.o;
import Vg.c;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetUserLegalEntitiesV2LayoutBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation.LegalsItemVOV2;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u000e2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b)\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000e018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/UserLegalEntitiesWidgetViewHolderV2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesV2LayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesV2LayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "bindRemove", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "payprops", "bindPayprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "bindAddress", "idText", "copyBtn", "bindCompanyId", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "bottomControl", "bindBottomControl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "items", "setTestIds", "(Ljava/util/List;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesV2LayoutBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/c;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "containerColor", "I", "", "containerCornerRadius", "F", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesWidgetViewHolderV2 extends k<LegalsItemVOV2> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetUserLegalEntitiesV2LayoutBinding binding;
    private final int containerColor;
    private final float containerCornerRadius;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final ComposerReferences references;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserLegalEntitiesV2Payload.values().length];
            try {
                iArr[UserLegalEntitiesV2Payload.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserLegalEntitiesV2Payload.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserLegalEntitiesV2Payload.PAYPROPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserLegalEntitiesV2Payload.ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserLegalEntitiesV2Payload.COMPANYID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserLegalEntitiesV2Payload.CELLBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserLegalEntitiesWidgetViewHolderV2(@NotNull WidgetUserLegalEntitiesV2LayoutBinding binding, @NotNull ComposerReferences references, @NotNull c customActionHandlersStore) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.customActionHandlersStore = customActionHandlersStore;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new UserLegalEntitiesWidgetViewHolderV2$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.containerColor = themeColor;
        float dpf_16 = Dimens.INSTANCE.getDPF_16();
        this.containerCornerRadius = dpf_16;
        atomsAdapter.setOnAction(buildHandler);
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(themeColor);
        paintDrawable.setCornerRadius(dpf_16);
        constraintLayout2.setBackground(paintDrawable);
        binding.controlsAtom.setAdapter(atomsAdapter);
    }

    private final void bindAddress(TextDTO address) {
        TextAtomV2View address2 = this.binding.address;
        Intrinsics.checkNotNullExpressionValue(address2, "address");
        TextHolderKt.bindOrGone$default(address2, address, null, 2, null);
    }

    private final void bindBottomControl(CellDTO bottomControl) {
        CellView cellButton = this.binding.cellButton;
        Intrinsics.checkNotNullExpressionValue(cellButton, "cellButton");
        CellHolderKt.bindOrGone(cellButton, bottomControl, this.actionHandler);
    }

    private final void bindCompanyId(TextDTO idText, IconButtonV3DTO copyBtn) {
        TextAtomV2View companyId = this.binding.companyId;
        Intrinsics.checkNotNullExpressionValue(companyId, "companyId");
        TextHolderKt.bindOrGone$default(companyId, idText, null, 2, null);
        IconButtonV3View copyCompanyIdIbv = this.binding.copyCompanyIdIbv;
        Intrinsics.checkNotNullExpressionValue(copyCompanyIdIbv, "copyCompanyIdIbv");
        IconButtonV3HolderKt.bindOrGone(copyCompanyIdIbv, copyBtn, this.actionHandler);
    }

    private final void bindPayprops(TextDTO payprops) {
        TextAtomV2View payprops2 = this.binding.payprops;
        Intrinsics.checkNotNullExpressionValue(payprops2, "payprops");
        TextHolderKt.bindOrGone$default(payprops2, payprops, null, 2, null);
    }

    private final void bindRemove(IconButtonV3DTO button) {
        IconButtonV3View remove = this.binding.remove;
        Intrinsics.checkNotNullExpressionValue(remove, "remove");
        IconButtonV3HolderKt.bindOrGone(remove, button, this.actionHandler);
    }

    private final void bindTitle(TextDTO title) {
        TextAtomV2View title2 = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        TextHolderKt.bind$default(title2, title, null, 2, null);
    }

    private final void setTestIds(List<? extends AtomDTO> items) {
        if (items == null) {
            return;
        }
        HorizontalFlexAtomsLayout controlsAtom = this.binding.controlsAtom;
        Intrinsics.checkNotNullExpressionValue(controlsAtom, "controlsAtom");
        int childCount = controlsAtom.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = controlsAtom.getChildAt(i11);
            AtomDTO atomDTO = items.get(i11);
            if (atomDTO instanceof BadgeDTO) {
                childAt.setId(R$id.statusBadge);
                childAt.setContentDescription(StringProvider.getString(R$string.locator_pattern, atomDTO.getType().getValue(), ((BadgeDTO) atomDTO).getText()));
            } else if (atomDTO instanceof ButtonV3DTO) {
                childAt.setId(R$id.statusButton);
                childAt.setContentDescription(StringProvider.getString(R$string.locator_pattern, atomDTO.getType().getValue(), ((ButtonV3DTO) atomDTO).getTitle()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalsItemVOV2 item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalsItemVOV2 item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        AtomsAdapter adapter = this.binding.controlsAtom.getAdapter();
        if (adapter != null) {
            Context context = getContext();
            List<AtomDTO> controls = item.getControls();
            if (controls == null) {
                controls = K.f71697a;
            }
            adapter.bind(context, controls);
        }
        setTestIds(item.getControls());
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            bindTitle(item.getTitle());
            LegalsItemVOV2.ActionButton actionButton = item.getActionButton();
            bindRemove(actionButton != null ? actionButton.getButton() : null);
            bindPayprops(item.getPayprops());
            bindAddress(item.getAddress());
            LegalsItemVOV2.CompanyId companyId = item.getCompanyId();
            TextDTO text = companyId != null ? companyId.getText() : null;
            LegalsItemVOV2.CompanyId companyId2 = item.getCompanyId();
            bindCompanyId(text, companyId2 != null ? companyId2.getButton() : null);
            bindBottomControl(item.getBottomControl());
            return;
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof UserLegalEntitiesV2Payload) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                switch (WhenMappings.$EnumSwitchMapping$0[((UserLegalEntitiesV2Payload) it.next()).ordinal()]) {
                    case 1:
                        bindTitle(item.getTitle());
                        break;
                    case 2:
                        LegalsItemVOV2.ActionButton actionButton2 = item.getActionButton();
                        bindRemove(actionButton2 != null ? actionButton2.getButton() : null);
                        break;
                    case 3:
                        bindPayprops(item.getPayprops());
                        break;
                    case 4:
                        bindAddress(item.getAddress());
                        break;
                    case 5:
                        LegalsItemVOV2.CompanyId companyId3 = item.getCompanyId();
                        TextDTO text2 = companyId3 != null ? companyId3.getText() : null;
                        LegalsItemVOV2.CompanyId companyId4 = item.getCompanyId();
                        bindCompanyId(text2, companyId4 != null ? companyId4.getButton() : null);
                        break;
                    case 6:
                        bindBottomControl(item.getBottomControl());
                        break;
                    default:
                        throw new o();
                }
            }
        }
    }
}
