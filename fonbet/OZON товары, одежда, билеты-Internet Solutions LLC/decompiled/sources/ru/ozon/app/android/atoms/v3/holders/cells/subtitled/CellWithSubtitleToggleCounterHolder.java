package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.BaseCellWithSubtitleHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleCounterView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitleToggleCounterHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleCounterView;", "view", "atomContext", "", "isSelect", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleCounterView;Ljava/lang/String;Z)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindCounter", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitleToggleCounterHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter, CellWithSubtitleToggleCounterView> {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleToggleCounterHolder$1, reason: invalid class name */
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
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter cellWithSubtitleToggleCounter = (CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter) CellWithSubtitleToggleCounterHolder.this.getData();
            Map<String, TokenizedTrackingInfo> trackingInfo = (z11 || cellWithSubtitleToggleCounter.getSelectedTrackingInfo() == null) ? cellWithSubtitleToggleCounter.getTrackingInfo() : cellWithSubtitleToggleCounter.getSelectedTrackingInfo();
            AtomActionDTO action = cellWithSubtitleToggleCounter.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfo)) == null) {
                return;
            }
            CellWithSubtitleToggleCounterHolder.this.handleAction(atomAction);
        }
    }

    public /* synthetic */ CellWithSubtitleToggleCounterHolder(CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellWithSubtitleToggleCounterView, str, (i11 & 4) != 0 ? false : z11);
    }

    private final void bindCounter(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter item) {
        BadgeView counterBadgeView = getContainerView().getCounterBadgeView();
        Badge badge = new Badge(item.getCounter(), item.getCounterIcon(), item.getCounterColor(), null, item.getCounterBackground(), null, null, Badge.StyleType.STYLE_TYPE_SMALL, null, item.getCounterIconPosition(), null, null, null, 7488, null);
        if (item.getCounter() == null) {
            badge = null;
        }
        BadgeHolderKt.bindOrGone$default(counterBadgeView, badge, (Function1) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleToggleCounterHolder(@NotNull CellWithSubtitleToggleCounterView view, String str, boolean z11) {
        super(view, str, z11);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnCheckedChangeListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithSubtitleToggleCounterHolder) item);
        getContainerView().setSelected(item.isSelected());
        bindCounter(item);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CellWithSubtitleToggleCounterHolder(@NotNull Context context, String str) {
        this(r1, str, false, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView = new CellWithSubtitleToggleCounterView(context, null, 0, 6, null);
    }
}
