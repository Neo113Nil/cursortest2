package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.BaseCellWithSubtitleHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.CheckboxRadioCell;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitle24IconCheckboxRadioCounterHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCheckboxRadioCounterView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCheckboxRadioCounterView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindCounter", "loadImage", "icon", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitle24IconCheckboxRadioCounterHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter, CellWithSubtitle24IconCheckboxRadioCounterView> {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(boolean z11) {
            AtomAction atomAction;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter = (CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) CellWithSubtitle24IconCheckboxRadioCounterHolder.this.getData();
            Map<String, TokenizedTrackingInfo> trackingInfo = (z11 || cellWithSubtitle24IconCheckboxRadioCounter.getSelectedTrackingInfo() == null) ? cellWithSubtitle24IconCheckboxRadioCounter.getTrackingInfo() : cellWithSubtitle24IconCheckboxRadioCounter.getSelectedTrackingInfo();
            AtomActionDTO action = cellWithSubtitle24IconCheckboxRadioCounter.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfo)) == null) {
                return;
            }
            CellWithSubtitle24IconCheckboxRadioCounterHolder.this.handleAction(atomAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle24IconCheckboxRadioCounterHolder(@NotNull CellWithSubtitle24IconCheckboxRadioCounterView view, String str) {
        super(view, str, false, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnCheckedChangeListener(new AnonymousClass1());
    }

    private final void bindCounter(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter item) {
        BadgeView counterBadgeView = getContainerView().getCounterBadgeView();
        Badge badge = new Badge(item.getCounter(), item.getCounterIcon(), item.getCounterColor(), null, item.getCounterBackground(), null, null, Badge.StyleType.STYLE_TYPE_SMALL, null, item.getCounterIconPosition(), null, null, null, 7488, null);
        if (item.getCounter() == null) {
            badge = null;
        }
        BadgeHolderKt.bindOrGone$default(counterBadgeView, badge, (Function1) null, 2, (Object) null);
    }

    private final void loadImage(String icon) {
        AtomConfig.INSTANCE.getImageLoader().load(getContainerView().getIcon(), icon);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithSubtitle24IconCheckboxRadioCounterHolder) item);
        CellWithSubtitle24IconCheckboxRadioCounterView containerView = getContainerView();
        containerView.setSelected(item.isSelected());
        containerView.setSelectorStyle(item.isRadio() ? CheckboxRadioCell.SelectorStyle.RADIO : CheckboxRadioCell.SelectorStyle.CHECKBOX);
        loadImage(item.getIcon());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTintColor(styleParser.parseColor(context, item.getIconTintColor()));
        bindCounter(item);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle24IconCheckboxRadioCounterHolder(@NotNull Context context, String str) {
        this(new CellWithSubtitle24IconCheckboxRadioCounterView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
