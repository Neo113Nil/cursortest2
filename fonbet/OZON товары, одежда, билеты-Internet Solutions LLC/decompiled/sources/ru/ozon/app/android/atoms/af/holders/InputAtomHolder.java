package ru.ozon.app.android.atoms.af.holders;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomGetter$GetTextValue;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/InputAtomHolder;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/Input;", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration;", "Lru/ozon/uni/atoms/af/AtomGetter$GetTextValue;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "textWatcher", "Landroid/text/TextWatcher;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "onConfigureView", "", "configuration", "onBind", "item", "getterCondition", "", "id", "getAtomTextValue", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputAtomHolder extends Atom<Input, InputAtom.Configuration> implements AtomGetter$GetTextValue {

    @NotNull
    private final Map<Atom.ConfCondition, InputAtom.Configuration> defaultConfigurations;

    @NotNull
    private final TextWatcher textWatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAtomHolder(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.textWatcher = new TextWatcher() { // from class: ru.ozon.app.android.atoms.af.holders.InputAtomHolder$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                InputAtomHolder.this.handleAction(new AtomAction.TextChange(InputAtomHolder.this.getData().getId(), String.valueOf(s11)));
                View containerView = InputAtomHolder.this.getContainerView();
                Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.InputAtom");
                ((InputAtom) containerView).clearError();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
            }
        };
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Input.class, null, 2, null), new InputAtom.Configuration(0, 0, 0, 0, null, null, null, 127, null)));
    }

    @Override // ru.ozon.uni.atoms.af.AtomGetter$GetTextValue
    @NotNull
    public String getAtomTextValue() {
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.InputAtom");
        return ((InputAtom) containerView).getAtomTextValue();
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, InputAtom.Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.AtomGetter$GetTextValue
    public boolean getterCondition(String id2) {
        return id2 == null || id2.equals(getData().getId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Input item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.InputAtom");
        InputAtom inputAtom = (InputAtom) containerView;
        inputAtom.removeTextChangedListener(this.textWatcher);
        inputAtom.bind(item);
        inputAtom.addTextChangedListener(this.textWatcher);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull InputAtom.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        View containerView = getContainerView();
        Intrinsics.g(containerView, "null cannot be cast to non-null type ru.ozon.app.android.atoms.atom2.InputAtom");
        ((InputAtom) containerView).setConfiguration(configuration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputAtomHolder(@NotNull Context context, String str) {
        this(new InputAtom(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
