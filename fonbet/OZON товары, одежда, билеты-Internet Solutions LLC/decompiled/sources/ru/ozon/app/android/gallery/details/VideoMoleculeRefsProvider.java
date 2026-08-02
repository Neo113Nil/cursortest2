package ru.ozon.app.android.gallery.details;

import android.app.Activity;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/gallery/details/VideoMoleculeRefsProvider;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "getViewLifecycleOwner", "Landroidx/fragment/app/m;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class VideoMoleculeRefsProvider implements VideoMoleculeUiReferences {

    @NotNull
    private final ComponentCallbacksC5392m fragment;

    public VideoMoleculeRefsProvider(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public Activity getActivity() {
        r requireActivity = this.fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return requireActivity;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public J getLifecycleOwner() {
        return this.fragment;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public J getViewLifecycleOwner() {
        J viewLifecycleOwner = this.fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }
}
