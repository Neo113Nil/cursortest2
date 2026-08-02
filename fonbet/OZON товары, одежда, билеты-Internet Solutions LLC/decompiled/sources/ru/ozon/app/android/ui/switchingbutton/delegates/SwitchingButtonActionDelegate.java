package ru.ozon.app.android.ui.switchingbutton.delegates;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0002\b\u00030\u000bj\u0006\u0012\u0002\b\u0003`\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\r\u001a\u000e\u0012\u0002\b\u00030\u000bj\u0006\u0012\u0002\b\u0003`\f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "", "<init>", "()V", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "switchingButtonAction", "", "canHandle", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)Z", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "setRefs", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/composer/ui/widget/k;", "getVh", "()Lru/ozon/composer/ui/widget/k;", "setVh", "(Lru/ozon/composer/ui/widget/k;)V", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SwitchingButtonActionDelegate {
    protected ComposerReferences refs;
    protected k<?> vh;

    public abstract boolean canHandle(@NotNull SwitchingButtonAction switchingButtonAction);

    @NotNull
    protected final ComposerReferences getRefs() {
        ComposerReferences composerReferences = this.refs;
        if (composerReferences != null) {
            return composerReferences;
        }
        Intrinsics.n("refs");
        throw null;
    }

    public final void init(@NotNull ComposerReferences refs, @NotNull k<?> vh2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        setRefs(refs);
        setVh(vh2);
    }

    protected final void setRefs(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "<set-?>");
        this.refs = composerReferences;
    }

    protected final void setVh(@NotNull k<?> kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.vh = kVar;
    }
}
