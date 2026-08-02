package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.BaseCellWithSubtitleHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCellKt;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle32IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitle32IconHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle32Icon;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle32IconView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle32IconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitle32IconHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon, CellWithSubtitle32IconView> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle32IconHolder$1, reason: invalid class name */
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
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon cellWithSubtitle32Icon = (CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon) CellWithSubtitle32IconHolder.this.getData();
            AtomActionDTO action = cellWithSubtitle32Icon.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cellWithSubtitle32Icon.getTrackingInfo())) == null) {
                return;
            }
            CellWithSubtitle32IconHolder.this.handleAction(atomAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle32IconHolder(@NotNull CellWithSubtitle32IconView view, String str) {
        super(view, str, false, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithSubtitle32IconHolder) item);
        CellWithSubtitle32IconView containerView = getContainerView();
        DisclosureCellKt.updateDisclosureView(containerView, item.getHideDisclosure(), item.getDisclosureTintColor());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTintColor(styleParser.parseColor(context, item.getIconTintColor()));
        AtomConfig.INSTANCE.getImageLoader().load(getContainerView().getIcon(), item.getIcon());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle32IconHolder(@NotNull Context context, String str) {
        this(new CellWithSubtitle32IconView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
