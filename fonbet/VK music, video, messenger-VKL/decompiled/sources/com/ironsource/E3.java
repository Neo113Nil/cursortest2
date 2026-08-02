package com.ironsource;

import com.ironsource.InterfaceC4488p4;
import com.ironsource.InterfaceC4509q7;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class E3 implements InterfaceC4509q7, InterfaceC4509q7.a {
    private final Xc a;
    private final C4624wf b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC4509q7
    public synchronized G3 a(String str) {
        G3 a2 = this.a.a(str);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public synchronized void b(String str) {
        this.a.b(str);
        this.b.b(str);
    }

    public E3(InterfaceC4488p4 interfaceC4488p4, J7 j7, Q8 q8) {
        this.a = new Xc(interfaceC4488p4, j7);
        this.b = new C4624wf(interfaceC4488p4, q8);
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public synchronized Object a(String str, I3 i3, InterfaceC4473o7 interfaceC4473o7) {
        Object a2;
        try {
            int i = a.a[i3.ordinal()];
            if (i == 1) {
                a2 = this.a.a(str, i3, interfaceC4473o7);
            } else if (i == 2) {
                a2 = this.b.a(str, i3, interfaceC4473o7);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = s3q0.a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public /* synthetic */ E3(InterfaceC4488p4 interfaceC4488p4, J7 j7, Q8 q8, int i, zcl zclVar) {
        this((i & 1) != 0 ? new InterfaceC4488p4.a() : interfaceC4488p4, (i & 2) != 0 ? new Zc(new C4534rf(ContextProvider.getInstance().getApplicationContext(), "pacing_service", null, 4, null)) : j7, (i & 4) != 0 ? new C4588uf(new C4534rf(ContextProvider.getInstance().getApplicationContext(), "capping_service", null, 4, null)) : q8);
    }
}
