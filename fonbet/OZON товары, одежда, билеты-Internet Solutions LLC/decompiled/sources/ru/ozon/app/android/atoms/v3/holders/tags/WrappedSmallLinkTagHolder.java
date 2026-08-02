package ru.ozon.app.android.atoms.v3.holders.tags;

import AD.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.view.atoms.tags.SmallLinkTagAtomView;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/tags/WrappedSmallLinkTagHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$SmallLinkTagAtom;", "Lru/ozon/app/android/uikit/view/atoms/tags/SmallLinkTagAtomView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/tags/SmallLinkTagAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WrappedSmallLinkTagHolder extends AtomV3<TagV3Atom.SmallLinkTagAtom, SmallLinkTagAtomView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedSmallLinkTagHolder(@NotNull SmallLinkTagAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        ofText$default.read(getContext(), R$style.SmallLinkTag);
        ofText$default.apply(getContainerView());
        getContainerView().setOnClickListener(new b(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(WrappedSmallLinkTagHolder wrappedSmallLinkTagHolder, View view) {
        AtomAction atomAction;
        TagV3Atom.SmallLinkTagAtom smallLinkTagAtom = (TagV3Atom.SmallLinkTagAtom) wrappedSmallLinkTagHolder.getData();
        AtomActionDTO action = smallLinkTagAtom.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallLinkTagAtom.getTrackingInfo())) == null) {
            return;
        }
        wrappedSmallLinkTagHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TagV3Atom.SmallLinkTagAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedSmallLinkTagHolder) item);
        SmallLinkTagAtomView containerView = getContainerView();
        containerView.setText(item.getText());
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedSmallLinkTagHolder(@NotNull Context context, String str) {
        this(new SmallLinkTagAtomView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
