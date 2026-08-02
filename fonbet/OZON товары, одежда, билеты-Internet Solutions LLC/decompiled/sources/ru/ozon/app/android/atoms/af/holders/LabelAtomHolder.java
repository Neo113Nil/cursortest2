package ru.ozon.app.android.atoms.af.holders;

import JG.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002H\u0014R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/LabelAtomHolder;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "onConfigureView", "", "configuration", "onRecycle", "onBind", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelAtomHolder extends Atom<Label, LabelAtom.Configuration> {

    @NotNull
    private final Map<Atom.ConfCondition, LabelAtom.Configuration> defaultConfigurations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LabelAtomHolder(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Label.class, null, 2, 0 == true ? 1 : 0), new LabelAtom.Configuration(0, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, 8191, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$3$lambda$2(LabelAtomHolder labelAtomHolder, View view) {
        AtomAction atomAction;
        Label data = labelAtomHolder.getData();
        AtomActionDTO action = data.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, data.getTrackingInfo())) == null) {
            return;
        }
        labelAtomHolder.handleAction(atomAction);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, LabelAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Label item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.LabelAtom");
        LabelAtom labelAtom = (LabelAtom) containerView;
        labelAtom.setOnClickListener(new b(this, 4));
        labelAtom.bind(item);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull LabelAtom.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.LabelAtom");
        ((LabelAtom) containerView).setConfiguration(configuration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelAtomHolder(@NotNull Context context, String str) {
        this(new LabelAtom(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
