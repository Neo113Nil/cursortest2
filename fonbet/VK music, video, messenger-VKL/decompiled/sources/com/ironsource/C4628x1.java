package com.ironsource;

import androidx.lifecycle.Lifecycle;
import com.ironsource.C4628x1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.epx;
import xsna.f5z;
import xsna.qc9;
import xsna.tsk;

/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4628x1 implements P1 {

    /* renamed from: com.ironsource.x1$a */
    public static final class a implements androidx.lifecycle.l {
        private final InterfaceC4386ja a;

        /* renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0239a {
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

        public a(InterfaceC4386ja interfaceC4386ja) {
            this.a = interfaceC4386ja;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a aVar) {
            int i = C0239a.a[event.ordinal()];
            if (i == 1) {
                aVar.a.b();
                return;
            }
            if (i == 2) {
                aVar.a.c();
            } else if (i == 3) {
                aVar.a.d();
            } else {
                if (i != 4) {
                    return;
                }
                aVar.a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC4386ja interfaceC4386ja = this.a;
            a aVar = obj instanceof a ? (a) obj : null;
            return epx.f(interfaceC4386ja, aVar != null ? aVar.a : null);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.l
        public void onStateChanged(f5z f5zVar, final Lifecycle.Event event) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.jh
                @Override // java.lang.Runnable
                public final void run() {
                    C4628x1.a.a(Lifecycle.Event.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4386ja interfaceC4386ja) {
        androidx.lifecycle.q qVar = androidx.lifecycle.q.j;
        androidx.lifecycle.q.j.g.addObserver(new a(interfaceC4386ja));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4386ja interfaceC4386ja) {
        androidx.lifecycle.q qVar = androidx.lifecycle.q.j;
        androidx.lifecycle.q.j.g.removeObserver(new a(interfaceC4386ja));
    }

    @Override // com.ironsource.P1
    public void a(InterfaceC4386ja interfaceC4386ja) {
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new tsk(interfaceC4386ja, 15), 0L, 2, null);
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC4386ja interfaceC4386ja) {
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new qc9(interfaceC4386ja, 17), 0L, 2, null);
    }
}
