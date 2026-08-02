package ru.ozon.app.android.videomolecule.presentation.visibilitydelegate;

import B90.RunnableC2610l;
import B90.k0;
import B90.l0;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u0017J\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\bJ\b\u0010%\u001a\u00020\u0017H\u0002J\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'*\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "", "moleculeView", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;)V", "notAllowedViewIds", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;", "videoMoleculeViewTag", "", "childrenIsVisible", "", "handler", "Landroid/os/Handler;", "isLocked", "showCallback", "Ljava/lang/Runnable;", "hideCallback", "inActivityCallback", "refreshInactivityTimer", "", "switchVisibilityChildren", "hideImediatly", "showImediatly", "lockAutoHide", "unlockAutoHide", "clearPendingActions", "setListener", "visibilityDelegateListener", "hideChildrenWithAnimation", "showChildrenWithAnimation", "hideSpecificView", "viewId", "showSpecificView", "clearCallbacks", "getFilteredChildren", "", "Landroid/view/View;", "Landroid/view/ViewGroup;", "Companion", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeVisibilityDelegate {
    private boolean childrenIsVisible;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Runnable hideCallback;

    @NotNull
    private final Runnable inActivityCallback;
    private boolean isLocked;
    private VideoMoleculeVisibilityDelegateListener listener;

    @NotNull
    private final VideoMoleculeView moleculeView;

    @NotNull
    private final Set<Integer> notAllowedViewIds;

    @NotNull
    private final Runnable showCallback;

    @NotNull
    private final String videoMoleculeViewTag;

    public VideoMoleculeVisibilityDelegate(@NotNull VideoMoleculeView moleculeView) {
        Intrinsics.checkNotNullParameter(moleculeView, "moleculeView");
        this.moleculeView = moleculeView;
        Integer[] elements = {Integer.valueOf(R$id.videoMoleculePlayer), Integer.valueOf(R$id.touchArea), Integer.valueOf(R$id.rewindContainer), Integer.valueOf(R$id.topGradient), Integer.valueOf(R$id.bottomGradient), Integer.valueOf(R$id.replayContainer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.notAllowedViewIds = C7705l.j0(elements);
        this.videoMoleculeViewTag = StringProvider.getString(R$string.video_molecule_view_tag);
        this.handler = new Handler(Looper.getMainLooper());
        int i11 = 2;
        this.showCallback = new k0(this, i11);
        this.hideCallback = new RunnableC2610l(this, i11);
        this.inActivityCallback = new l0(this, 1);
    }

    private final void clearCallbacks() {
        this.handler.removeCallbacks(this.inActivityCallback);
        this.handler.removeCallbacks(this.showCallback);
        this.handler.removeCallbacks(this.hideCallback);
    }

    private final List<View> getFilteredChildren(ViewGroup viewGroup) {
        Iterable<View> children = ViewGroupExtKt.children(viewGroup);
        ArrayList arrayList = new ArrayList();
        for (View view : children) {
            View view2 = view;
            if (!this.notAllowedViewIds.contains(Integer.valueOf(view2.getId())) && Intrinsics.d(view2.getTag(), this.videoMoleculeViewTag)) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideCallback$lambda$3(VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate) {
        VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener = videoMoleculeVisibilityDelegate.listener;
        if (videoMoleculeVisibilityDelegateListener != null) {
            videoMoleculeVisibilityDelegateListener.hideWithAnimation();
        }
        Iterator<T> it = videoMoleculeVisibilityDelegate.getFilteredChildren(videoMoleculeVisibilityDelegate.moleculeView).iterator();
        while (it.hasNext()) {
            VideoMoleculeVisibilityDelegateUtils.INSTANCE.hideWithAnimation((View) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inActivityCallback$lambda$5(VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate) {
        videoMoleculeVisibilityDelegate.childrenIsVisible = false;
        VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener = videoMoleculeVisibilityDelegate.listener;
        if (videoMoleculeVisibilityDelegateListener != null) {
            videoMoleculeVisibilityDelegateListener.hideWithAnimation();
        }
        Iterator<T> it = videoMoleculeVisibilityDelegate.getFilteredChildren(videoMoleculeVisibilityDelegate.moleculeView).iterator();
        while (it.hasNext()) {
            VideoMoleculeVisibilityDelegateUtils.INSTANCE.hideWithAnimation((View) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCallback$lambda$1(VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate) {
        VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener = videoMoleculeVisibilityDelegate.listener;
        if (videoMoleculeVisibilityDelegateListener != null) {
            videoMoleculeVisibilityDelegateListener.showWithAnimation();
        }
        Iterator<T> it = videoMoleculeVisibilityDelegate.getFilteredChildren(videoMoleculeVisibilityDelegate.moleculeView).iterator();
        while (it.hasNext()) {
            VideoMoleculeVisibilityDelegateUtils.INSTANCE.showWithAnimation((View) it.next());
        }
    }

    public final void clearPendingActions() {
        clearCallbacks();
    }

    public final void hideChildrenWithAnimation() {
        clearCallbacks();
        this.childrenIsVisible = false;
        this.handler.postDelayed(this.hideCallback, 300L);
    }

    public final void hideImediatly() {
        clearCallbacks();
        this.childrenIsVisible = false;
        VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener = this.listener;
        if (videoMoleculeVisibilityDelegateListener != null) {
            videoMoleculeVisibilityDelegateListener.hide();
        }
        Iterator<T> it = getFilteredChildren(this.moleculeView).iterator();
        while (it.hasNext()) {
            VideoMoleculeVisibilityDelegateUtils.INSTANCE.hideViewImmediately((View) it.next());
        }
    }

    public final void hideSpecificView(int viewId) {
        View findViewById = this.moleculeView.findViewById(viewId);
        if (findViewById != null) {
            ViewExtKt.gone(findViewById);
        }
    }

    public final void lockAutoHide() {
        clearCallbacks();
        this.isLocked = true;
    }

    public final void refreshInactivityTimer() {
        if (this.isLocked) {
            return;
        }
        clearCallbacks();
        this.handler.postDelayed(this.inActivityCallback, 3000L);
    }

    public final void setListener(@NotNull VideoMoleculeVisibilityDelegateListener visibilityDelegateListener) {
        Intrinsics.checkNotNullParameter(visibilityDelegateListener, "visibilityDelegateListener");
        this.listener = visibilityDelegateListener;
    }

    public final void showChildrenWithAnimation() {
        clearCallbacks();
        this.childrenIsVisible = true;
        this.handler.postDelayed(this.showCallback, 300L);
        this.handler.postDelayed(this.inActivityCallback, 3300L);
    }

    public final void showImediatly() {
        clearCallbacks();
        this.childrenIsVisible = true;
        VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener = this.listener;
        if (videoMoleculeVisibilityDelegateListener != null) {
            videoMoleculeVisibilityDelegateListener.show();
        }
        Iterator<T> it = getFilteredChildren(this.moleculeView).iterator();
        while (it.hasNext()) {
            VideoMoleculeVisibilityDelegateUtils.INSTANCE.show((View) it.next(), false);
        }
        refreshInactivityTimer();
    }

    public final void showSpecificView(int viewId) {
        View findViewById = this.moleculeView.findViewById(viewId);
        if (findViewById != null) {
            ViewExtKt.show(findViewById);
        }
    }

    public final void switchVisibilityChildren() {
        if (this.isLocked) {
            return;
        }
        if (this.childrenIsVisible) {
            hideChildrenWithAnimation();
        } else {
            showChildrenWithAnimation();
        }
    }

    public final void unlockAutoHide() {
        this.isLocked = false;
    }
}
