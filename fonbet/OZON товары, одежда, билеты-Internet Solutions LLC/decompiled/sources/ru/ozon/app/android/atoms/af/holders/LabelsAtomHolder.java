package ru.ozon.app.android.atoms.af.holders;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.LabelsAtom;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/LabelsAtomHolder;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/Labels;", "Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;", "Landroid/view/View;", "view", "", "atomContext", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "configuration", "", "onConfigureView", "(Lru/ozon/app/android/atoms/atom2/LabelsAtom$Configuration;)V", "item", "onBind", "(Lru/ozon/app/android/atoms/data/deprecated/Labels;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "defaultConfigurations", "Ljava/util/Map;", "getDefaultConfigurations", "()Ljava/util/Map;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelsAtomHolder extends Atom<Labels, LabelsAtom.Configuration> {

    @NotNull
    private final Map<Atom.ConfCondition, LabelsAtom.Configuration> defaultConfigurations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelsAtomHolder(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Labels.class, null, 2, null), new LabelsAtom.Configuration(0, 0, 0, 0, 0, 0, null, null, null, 511, null)));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, LabelsAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Atom<Labels, LabelsAtom.Configuration> withAction(Function1<? super AtomAction, Unit> onAction) {
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.LabelsAtom");
        ((LabelsAtom) containerView).setOnAction(onAction);
        return super.withAction(onAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Labels item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.LabelsAtom");
        ((LabelsAtom) containerView).bind(item);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull LabelsAtom.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.LabelsAtom");
        ((LabelsAtom) containerView).setConfiguration(configuration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelsAtomHolder(@NotNull Context context, String str) {
        this(new LabelsAtom(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
