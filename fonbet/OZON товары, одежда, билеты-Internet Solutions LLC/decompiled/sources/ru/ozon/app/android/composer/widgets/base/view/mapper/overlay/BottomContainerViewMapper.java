package ru.ozon.app.android.composer.widgets.base.view.mapper.overlay;

import Sc.InterfaceC3999a;
import android.view.View;
import android.view.ViewGroup;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\n\b\u0001\u0010\u0005*\u0004\u0018\u00010\u0004*\b\b\u0002\u0010\u0006*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u001aJ%\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/BottomContainerViewMapper;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Holder", "", "S", "I", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/MultiplyNoUIViewMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "viewItemHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "composerRootView", "", "addView", "(Landroid/view/View;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)V", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/composer/ui/widget/k;", "removeView", "onViewRemoved", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BottomContainerViewMapper<Holder extends k<? extends c>, S, I extends c> extends MultiplyNoUIViewMapper<Holder, S, I> {
    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public final void addView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView).addView(view);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    @NotNull
    public final Holder createHolder(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        return createHolder(new ComposerInflaterImpl(ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView)), references, viewItemHelper);
    }

    @NotNull
    public abstract Holder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper);

    public void onViewRemoved(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public final void removeView(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        ComposerViewExtensionKt.internalComposerBottomContainer(composerRootView).removeView(view);
        onViewRemoved(view, composerRootView, references);
    }
}
