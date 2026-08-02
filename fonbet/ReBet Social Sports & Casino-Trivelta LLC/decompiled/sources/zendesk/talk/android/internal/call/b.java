package zendesk.talk.android.internal.call;

import zendesk.talk.android.internal.call.a;

/* loaded from: classes5.dex */
public final class b {
    public final boolean a(a aVar, a aVar2) {
        if (aVar != null && aVar2 != null) {
            if ((aVar instanceof a.AbstractC0988a) && (aVar2 instanceof a.AbstractC0988a)) {
                return true;
            }
            if ((aVar instanceof a.b) && (aVar2 instanceof a.b)) {
                return true;
            }
            if ((aVar instanceof a.c) && (aVar2 instanceof a.c)) {
                a.c cVar = (a.c) aVar;
                a.c cVar2 = (a.c) aVar2;
                return cVar.c() == cVar2.c() && cVar.b() == cVar2.b();
            }
            if (aVar.getClass() == aVar2.getClass()) {
                return true;
            }
        }
        return false;
    }
}
