package com.ironsource;

import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4372id implements K7, K7.a {
    private final E3 a;
    private final N4 b;

    /* renamed from: com.ironsource.id$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4372id() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.K7
    public synchronized G3 a(String str, LevelPlay.AdFormat adFormat) {
        String a2 = new C4479od(str, adFormat).a();
        G3 a3 = this.b.a(a2);
        if (a3.d()) {
            return a3;
        }
        return this.a.a(a2);
    }

    @Override // com.ironsource.K7.a
    public synchronized void b(String str, LevelPlay.AdFormat adFormat) {
        String a2 = new C4479od(str, adFormat).a();
        if (!this.b.a(a2).d()) {
            this.a.b(a2);
        }
    }

    public C4372id(E3 e3, N4 n4) {
        this.a = e3;
        this.b = n4;
    }

    public /* synthetic */ C4372id(E3 e3, N4 n4, int i, zcl zclVar) {
        this((i & 1) != 0 ? new E3(null, null, null, 7, null) : e3, (i & 2) != 0 ? new N4() : n4);
    }

    @Override // com.ironsource.K7.a
    public synchronized Object a(String str, LevelPlay.AdFormat adFormat, I3 i3, InterfaceC4473o7 interfaceC4473o7) {
        Object a2;
        try {
            String a3 = new C4479od(str, adFormat).a();
            int i = a.a[i3.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = this.a.a(a3, i3, interfaceC4473o7);
            } else {
                a2 = this.b.a(a3, i3, interfaceC4473o7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }
}
