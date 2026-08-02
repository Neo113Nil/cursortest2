package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeUiReferences;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/VideoMoleculeRefsProvider;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "Landroidx/lifecycle/J;", "getViewLifecycleOwner", "()Landroidx/lifecycle/J;", "Ll10/i;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeRefsProvider implements VideoMoleculeUiReferences {

    @NotNull
    private final i container;

    public VideoMoleculeRefsProvider(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public Activity getActivity() {
        return this.container.Q().i();
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeUiReferences
    public ViewGroup getRootView() {
        return ContextExtKt.getRootView(this.container.Q().j());
    }

    @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeUiReferences
    @NotNull
    public J getViewLifecycleOwner() {
        J viewLifecycleOwner = this.container.Q().j().getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }
}
