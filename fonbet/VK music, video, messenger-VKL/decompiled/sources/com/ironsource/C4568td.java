package com.ironsource;

import com.ironsource.F0;
import com.ironsource.Fd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mnh0;

/* renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4568td implements InterfaceC4586ud {
    private final LevelPlay.AdFormat a;

    /* renamed from: com.ironsource.td$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public C4568td(LevelPlay.AdFormat adFormat) {
        this.a = adFormat;
    }

    private final C4532rd a(Fd.c cVar, int i, Va va) {
        String c = cVar.c();
        if (c == null) {
            IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        List<String> d = cVar.d();
        if (d == null) {
            IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        C4341h0 c4341h0 = new C4341h0(com.unity3d.mediation.a.a(this.a), C4616w7.a.a(), c, null, null, null, 56, null);
        AbstractC4627x0 a2 = a(c4341h0, va);
        if (a2 == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a a3 = com.unity3d.mediation.a.a(this.a);
        F0.b bVar = F0.b.MEDIATION;
        V0 v0 = new V0(new C4484p0(a3, bVar), a2, bVar);
        v0.d().a(new D0(v0, c4341h0, null, 4, null));
        return new C4532rd(c, d, i, new C4640xd(v0, a2, null, 4, null), v0);
    }

    private final AbstractC4627x0 a(C4341h0 c4341h0, Va va) {
        try {
            int i = a.a[this.a.ordinal()];
            if (i == 1) {
                return C9.z.a(c4341h0, va, false);
            }
            if (i == 2) {
                return C4265ce.z.a(c4341h0, va, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.a + ": " + e.getMessage() + "\n" + mnh0.A(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4586ud
    public List<InterfaceC4550sd> a(List<Fd.c> list, int i, Va va) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C4532rd a2 = a((Fd.c) it.next(), i, va);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
