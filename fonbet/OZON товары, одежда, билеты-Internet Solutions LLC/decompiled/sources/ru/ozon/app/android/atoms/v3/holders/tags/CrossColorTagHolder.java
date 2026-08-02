package ru.ozon.app.android.atoms.v3.holders.tags;

import Bs.ViewOnClickListenerC2671b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.tags.CrossColorTagAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/tags/CrossColorTagHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossColorTagAtom;", "Lru/ozon/app/android/uikit/view/atoms/tags/CrossColorTagAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/tags/CrossColorTagAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CrossColorTagHolder extends AtomV3<TagV3Atom.CrossColorTagAtom, CrossColorTagAtomView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossColorTagHolder(@NotNull CrossColorTagAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new ViewOnClickListenerC2671b(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(CrossColorTagHolder crossColorTagHolder, View view) {
        AtomAction atomAction;
        TagV3Atom.CrossColorTagAtom crossColorTagAtom = (TagV3Atom.CrossColorTagAtom) crossColorTagHolder.getData();
        AtomActionDTO action = crossColorTagAtom.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, crossColorTagAtom.getTrackingInfo())) == null) {
            return;
        }
        crossColorTagHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TagV3Atom.CrossColorTagAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CrossColorTagHolder) item);
        CrossColorTagAtomView containerView = getContainerView();
        containerView.setColor(item.getHexColor());
        containerView.setEnabled(item.getAction() != null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrossColorTagHolder(@NotNull Context context, String str) {
        this(new CrossColorTagAtomView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
