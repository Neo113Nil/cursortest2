package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import h8.InterfaceC4488a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\f\u0010\u0003J\u0010\u0010\r\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "cleanupExpiredMountingCoordinators", "invalidateNative", "", "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f41666b = new ConcurrentHashMap();

    @InterfaceC4488a
    @NotNull
    private final HybridData mHybridData = initHybrid();

    /* renamed from: com.swmansion.rnscreens.NativeProxy$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, C3834z view) {
            Intrinsics.checkNotNullParameter(view, "view");
            NativeProxy.f41666b.put(Integer.valueOf(i10), new WeakReference(view));
        }

        public final void b() {
            NativeProxy.f41666b.clear();
        }

        public final void c(int i10) {
            NativeProxy.f41666b.remove(Integer.valueOf(i10));
        }

        public Companion() {
        }
    }

    public static final void c(C3834z c3834z) {
        c3834z.D();
    }

    private final native HybridData initHybrid();

    public final native void cleanupExpiredMountingCoordinators();

    public final native void invalidateNative();

    public final native void nativeAddMutationsListener(@NotNull FabricUIManager fabricUIManager);

    @InterfaceC4488a
    public final void notifyScreenRemoved(int screenTag) {
        WeakReference weakReference = (WeakReference) f41666b.get(Integer.valueOf(screenTag));
        if (weakReference == null) {
            return;
        }
        final C3834z c3834z = (C3834z) weakReference.get();
        if (c3834z == null) {
            Log.w("[RNScreens]", "Reference stored in NativeProxy for tag " + screenTag + " no longer points to valid object.");
            return;
        }
        if (c3834z.post(new Runnable() { // from class: com.swmansion.rnscreens.o
            @Override // java.lang.Runnable
            public final void run() {
                NativeProxy.c(C3834z.this);
            }
        })) {
            return;
        }
        Log.w("[RNScreens]", "Failed to schedule removal transition start for screen with tag " + screenTag);
    }
}
