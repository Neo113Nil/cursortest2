package ru.ozon.app.android.atoms.af.holders;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.databinding.AtomButtonSecondaryBinding;
import ru.ozon.uni.atoms.af.Atom;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ButtonSecondaryAtom;", "Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonSecondary;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomButtonSecondaryBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/app/android/atoms/af/holders/ButtonBaseAtom$Configuration;", "getDefaultConfigurations", "()Ljava/util/Map;", "onLayoutParamsChanged", "", "lp", "Landroid/view/ViewGroup$MarginLayoutParams;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonSecondaryAtom extends ButtonBaseAtom<CommonButton.ButtonSecondary> {

    @NotNull
    private final AtomButtonSecondaryBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, ButtonBaseAtom.Configuration> defaultConfigurations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSecondaryAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomButtonSecondaryBinding bind = AtomButtonSecondaryBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(CommonButton.ButtonSecondary.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, false, 0, null, 127, null)));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, ButtonBaseAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onLayoutParamsChanged(@NotNull ViewGroup.MarginLayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (lp.width != -2) {
            this.binding.buttonTv.getLayoutParams().width = -1;
        } else {
            this.binding.buttonTv.getLayoutParams().width = -2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ButtonSecondaryAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_button_secondary, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
    }
}
