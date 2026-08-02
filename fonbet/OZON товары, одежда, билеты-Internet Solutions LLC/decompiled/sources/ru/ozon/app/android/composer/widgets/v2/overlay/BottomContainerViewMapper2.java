package ru.ozon.app.android.composer.widgets.v2.overlay;

import Sc.InterfaceC3999a;
import android.view.View;
import android.view.ViewGroup;
import hi.InterfaceC6958a;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.base.ComposerInflaterImpl;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\u0010\b\u0001\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004*\n\b\u0002\u0010\b*\u0004\u0018\u00010\u0007*\b\b\u0003\u0010\t*\u00020\u00052\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u001fJ%\u0010 \u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001dJ'\u0010!\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Holder", "", "S", "I", "Lru/ozon/app/android/composer/widgets/v2/overlay/MultiplyNoUIViewMapper2;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "composerRootView", "", "addView", "(Landroid/view/View;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)V", "viewItemHelper", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "removeView", "onViewRemoved", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BottomContainerViewMapper2<C extends InterfaceC6958a, Holder extends k<? extends c>, S, I extends c> extends MultiplyNoUIViewMapper2<C, Holder, S, I> {
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public final void addView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView).addView(view);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    @NotNull
    public final Holder createHolder(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        return createHolder(new ComposerInflaterImpl(ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView)), references, viewItemHelper);
    }

    @NotNull
    public abstract Holder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper);

    public void onViewRemoved(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public final void removeView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView).removeView(view);
        onViewRemoved(view, composerRootView, references);
    }
}
