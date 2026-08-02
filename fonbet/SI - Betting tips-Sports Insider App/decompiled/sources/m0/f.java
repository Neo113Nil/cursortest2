package m0;

import java.util.ArrayList;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements p0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20123b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f20122a = i5;
        this.f20123b = obj;
    }

    @Override // p0.a
    public final void accept(Object obj) {
        switch (this.f20122a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((io.sentry.util.network.b) this.f20123b).k(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f20128c) {
                    try {
                        n nVar = h.f20129d;
                        ArrayList arrayList = (ArrayList) nVar.get((String) this.f20123b);
                        if (arrayList == null) {
                            return;
                        }
                        nVar.remove((String) this.f20123b);
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            ((p0.a) arrayList.get(i5)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
