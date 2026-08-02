package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.C2732x1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2732x1 implements P1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.x1$a */
    static final class a implements LifecycleEventObserver {
        private final InterfaceC2473ia a;

        /* renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0228a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public a(InterfaceC2473ia listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = C0228a.a[event.ordinal()];
            if (i == 1) {
                this$0.a.b();
                return;
            }
            if (i == 2) {
                this$0.a.c();
            } else if (i == 3) {
                this$0.a.d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC2473ia interfaceC2473ia = this.a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.areEqual(interfaceC2473ia, aVar != null ? aVar.a : null);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, final Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2732x1.a.a(Lifecycle.Event.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.P1
    public void a(final InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2732x1.c(InterfaceC2473ia.this);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.P1
    public void b(final InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2732x1.d(InterfaceC2473ia.this);
            }
        }, 0L, 2, null);
    }
}
