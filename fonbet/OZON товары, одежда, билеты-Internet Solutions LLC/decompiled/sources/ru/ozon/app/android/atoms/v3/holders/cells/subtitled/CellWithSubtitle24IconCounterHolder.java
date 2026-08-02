package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.BaseCellWithSubtitleHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCellKt;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitle24IconCounterHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindIcon", ImagesContract.URL, "tintColor", "bindCounter", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitle24IconCounterHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter, CellWithSubtitle24IconCounterView> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCounterHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AtomAction atomAction;
            DTO data = CellWithSubtitle24IconCounterHolder.this.getData();
            CellWithSubtitle24IconCounterHolder cellWithSubtitle24IconCounterHolder = CellWithSubtitle24IconCounterHolder.this;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = (CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter) data;
            AtomActionDTO action = cellWithSubtitle24IconCounter.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cellWithSubtitle24IconCounter.getTrackingInfo())) == null) {
                return;
            }
            cellWithSubtitle24IconCounterHolder.handleAction(atomAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle24IconCounterHolder(@NotNull CellWithSubtitle24IconCounterView view, String str) {
        super(view, str, false, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new AnonymousClass1());
    }

    private final void bindCounter(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter item) {
        String counter = item.getCounter();
        BadgeHolderKt.bindOrGone$default(getContainerView().getCounterBadgeView(), counter != null ? new Badge(counter, item.getCounterIcon(), item.getCounterColor(), item.getIconTintColor(), item.getCounterBackground(), null, null, Badge.StyleType.STYLE_TYPE_SMALL, null, item.getCounterIconPosition(), null, null, null, 7488, null) : null, (Function1) null, 2, (Object) null);
    }

    private final void bindIcon(String url, String tintColor) {
        getContainerView().setTintColor(StyleParser.INSTANCE.parseColor(getContext(), tintColor));
        AtomConfig.INSTANCE.getImageLoader().load(getContainerView().getIcon(), url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithSubtitle24IconCounterHolder) item);
        DisclosureCellKt.updateDisclosureView(getContainerView(), item.getHideDisclosure(), item.getDisclosureTintColor());
        bindIcon(item.getIcon(), item.getIconTintColor());
        bindCounter(item);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle24IconCounterHolder(@NotNull Context context, String str) {
        this(new CellWithSubtitle24IconCounterView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
