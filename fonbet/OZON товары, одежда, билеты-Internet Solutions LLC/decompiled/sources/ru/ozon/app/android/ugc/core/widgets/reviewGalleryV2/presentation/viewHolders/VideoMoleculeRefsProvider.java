package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import android.app.Activity;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/VideoMoleculeRefsProvider;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "getViewLifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeRefsProvider implements VideoMoleculeUiReferences {

    @NotNull
    private final ComposerReferences composerRefs;

    public VideoMoleculeRefsProvider(@NotNull ComposerReferences composerRefs) {
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        this.composerRefs = composerRefs;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public Activity getActivity() {
        return this.composerRefs.getContainer().i();
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public J getLifecycleOwner() {
        return this.composerRefs.getContainer().j();
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public J getViewLifecycleOwner() {
        J viewLifecycleOwner = this.composerRefs.getContainer().j().getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }
}
