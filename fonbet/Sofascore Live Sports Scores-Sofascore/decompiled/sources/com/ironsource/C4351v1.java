package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.b8f;
import defpackage.d6b;
import defpackage.hym;
import defpackage.p6b;
import defpackage.u6b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4351v1 implements N1 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v1$a */
    public static final class a implements p6b {

        @NotNull
        private final InterfaceC4128ia a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1221a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[d6b.values().length];
                try {
                    iArr[d6b.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d6b.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d6b.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d6b.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public a(@NotNull InterfaceC4128ia interfaceC4128ia) {
            interfaceC4128ia.getClass();
            this.a = interfaceC4128ia;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(d6b d6bVar, a aVar) {
            d6bVar.getClass();
            aVar.getClass();
            int i = C1221a.a[d6bVar.ordinal()];
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

        public boolean equals(@Nullable Object obj) {
            InterfaceC4128ia interfaceC4128ia = this.a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.c(interfaceC4128ia, aVar != null ? aVar.a : null);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.p6b
        public void onStateChanged(@NotNull u6b u6bVar, @NotNull d6b d6bVar) {
            u6bVar.getClass();
            d6bVar.getClass();
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new hh(4, d6bVar, this), 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        b8f b8fVar = b8f.i;
        b8f.i.f.a(new a(interfaceC4128ia));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        b8f b8fVar = b8f.i;
        b8f.i.f.d(new a(interfaceC4128ia));
    }

    @Override // com.ironsource.N1
    public void a(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new hym(interfaceC4128ia, 0), 0L, 2, null);
    }

    @Override // com.ironsource.N1
    public void b(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new hym(interfaceC4128ia, 1), 0L, 2, null);
    }
}
