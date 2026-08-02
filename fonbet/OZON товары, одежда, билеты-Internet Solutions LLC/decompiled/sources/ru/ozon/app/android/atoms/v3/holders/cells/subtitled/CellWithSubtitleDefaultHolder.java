package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.BaseCellWithSubtitleHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCellKt;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitleDefaultHolder;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onRecycle", "", "onBind", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitleDefaultHolder extends BaseCellWithSubtitleHolder<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault, CellWithSubtitleDefaultView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleDefaultHolder(@NotNull CellWithSubtitleDefaultView view, String str) {
        super(view, str, false, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnClickListener(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleDefaultHolder(@NotNull Context context, String str) {
        this(new CellWithSubtitleDefaultView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellWithSubtitleDefaultHolder) item);
        getContainerView().onClickListener(new CellWithSubtitleDefaultHolder$onBind$1(this));
        DisclosureCellKt.updateDisclosureView(getContainerView(), item.getHideDisclosure(), item.getDisclosureTintColor());
    }
}
