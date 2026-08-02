package jk0;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001e\u0010\u0017J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u001f¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\nH\u0017¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\nH\u0017¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u00020\nH\u0017¢\u0006\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\b008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Ljk0/j;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/lifecycle/J;", "Ljk0/n;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Llk0/b;", "callback", "", "addChild", "(Llk0/b;)V", "removeChild", "Landroidx/lifecycle/v$b;", "state", "setLifecycleState", "(Landroidx/lifecycle/v$b;)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onViewInOverlapBounds", "()V", "onViewInVisibleBounds", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "onViewOutOfVisibleBounds", "onViewOutOfOverlapBounds", "", "isInOverlapBounds", "()Z", "isInVisibleBounds", "isNotifiedAboutCloseToVisibleBounds", "onAttach", "onDetach", "onRecycle", "viewHolderPositionInfo", "Ljk0/q;", "getViewHolderPositionInfo", "()Ljk0/q;", "Ljk0/p;", "registry", "Ljk0/p;", "closeToVisibleBoundsCalled", "Z", "", "childCallbacks", "Ljava/util/Set;", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "lifecycle", "uikit-recycler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class j extends RecyclerView.C implements J, n {

    @NotNull
    private Set<lk0.b> childCallbacks;
    private boolean closeToVisibleBoundsCalled;

    @NotNull
    private p registry;

    @NotNull
    private final q viewHolderPositionInfo;

    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j.this.onAttach();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j.this.onDetach();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j jVar = j.this;
            jVar.onVisibleAreaChanged(jVar.getViewHolderPositionInfo());
            jVar.onViewOutOfVisibleBounds();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j.this.onViewInVisibleBounds();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j jVar = j.this;
            jVar.onOffscreenPositionChanged(0.0f);
            jVar.onViewInOverlapBounds();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            j.this.onViewOutOfOverlapBounds();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.viewHolderPositionInfo = new q();
        this.registry = new p(this);
        this.childCallbacks = new LinkedHashSet();
        this.registry.a(new a());
    }

    @Override // lk0.d
    public void addChild(@NotNull lk0.b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.childCallbacks.add(callback);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        return this.registry;
    }

    @Override // jk0.n
    @NotNull
    public q getViewHolderPositionInfo() {
        return this.viewHolderPositionInfo;
    }

    public final boolean isInOverlapBounds() {
        return this.registry.b() == AbstractC5434v.b.STARTED;
    }

    @Override // lk0.d
    public final boolean isInVisibleBounds() {
        return this.registry.b() == AbstractC5434v.b.RESUMED;
    }

    /* renamed from: isNotifiedAboutCloseToVisibleBounds, reason: from getter */
    public final boolean getCloseToVisibleBoundsCalled() {
        return this.closeToVisibleBoundsCalled;
    }

    public void onAttach() {
    }

    public void onDetach() {
        this.registry = new p(this.registry, this);
        this.closeToVisibleBoundsCalled = false;
    }

    @Override // lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        if (this.closeToVisibleBoundsCalled) {
            return;
        }
        this.closeToVisibleBoundsCalled = true;
        Iterator<T> it = this.childCallbacks.iterator();
        while (it.hasNext()) {
            ((lk0.b) it.next()).onOffscreenPositionChanged(offscreenOffsetPercent);
        }
    }

    public void onRecycle() {
        this.childCallbacks.clear();
    }

    @Override // lk0.b
    public void onViewInOverlapBounds() {
        Iterator<T> it = this.childCallbacks.iterator();
        while (it.hasNext()) {
            ((lk0.b) it.next()).onViewInOverlapBounds();
        }
    }

    @Override // lk0.b
    public void onViewInVisibleBounds() {
        Iterator<T> it = this.childCallbacks.iterator();
        while (it.hasNext()) {
            ((lk0.b) it.next()).onViewInVisibleBounds();
        }
    }

    @Override // lk0.b
    public void onViewOutOfOverlapBounds() {
        Iterator<T> it = this.childCallbacks.iterator();
        while (it.hasNext()) {
            ((lk0.b) it.next()).onViewOutOfOverlapBounds();
        }
    }

    @Override // lk0.b
    public void onViewOutOfVisibleBounds() {
        Iterator<T> it = this.childCallbacks.iterator();
        while (it.hasNext()) {
            ((lk0.b) it.next()).onViewOutOfVisibleBounds();
        }
    }

    @Override // jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // lk0.d
    public void removeChild(@NotNull lk0.b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.childCallbacks.remove(callback);
    }

    @Override // jk0.n
    public void setLifecycleState(@NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.registry.b() == AbstractC5434v.b.INITIALIZED && state == AbstractC5434v.b.DESTROYED) {
            return;
        }
        this.registry.j(state);
    }
}
