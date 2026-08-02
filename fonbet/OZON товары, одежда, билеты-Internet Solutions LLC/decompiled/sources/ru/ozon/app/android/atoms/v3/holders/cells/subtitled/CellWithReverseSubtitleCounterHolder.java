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
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithReverseSubtitleCounterView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithReverseSubtitleCounterHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithReverseSubtitleCounterView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithReverseSubtitleCounterView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithReverseSubtitleCounterHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter, CellWithReverseSubtitleCounterView> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithReverseSubtitleCounterHolder$1, reason: invalid class name */
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
            CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter = (CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) CellWithReverseSubtitleCounterHolder.this.getData();
            AtomActionDTO action = cellWithReverseSubtitleCounter.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cellWithReverseSubtitleCounter.getTrackingInfo())) == null) {
                return;
            }
            CellWithReverseSubtitleCounterHolder.this.handleAction(atomAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithReverseSubtitleCounterHolder(@NotNull CellWithReverseSubtitleCounterView view, String str) {
        super(view, str, false, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithReverseSubtitleCounterHolder) item);
        CellWithReverseSubtitleCounterView containerView = getContainerView();
        containerView.setCounter(item.getCounter());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setCounterTextColor(styleParser.parseColor(context, item.getCounterColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY));
        Context context2 = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setCounterBackgroundColor(Integer.valueOf(styleParser.parseColor(context2, item.getCounterBackground(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY)));
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView.setDisclosureColor(Integer.valueOf(styleParser.parseColor(context3, item.getDisclosureTintColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY)));
        containerView.hideDisclosure(item.getHideDisclosure());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithReverseSubtitleCounterHolder(@NotNull Context context, String str) {
        this(new CellWithReverseSubtitleCounterView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
