package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d7p extends f7p {
    @Override // defpackage.f7p
    public final /* synthetic */ void q(Object obj) {
        m((ddb) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c A[RETURN] */
    @Override // defpackage.f7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj, Object obj2) {
        ddb ddbVar;
        xjn xjnVar = (xjn) obj;
        xjnVar.getClass();
        boolean equals = ((Integer) obj2).equals(1);
        r1c r1cVar = xjnVar.c;
        Uri.Builder builder = xjnVar.a;
        if (equals) {
            b2p b2pVar = xjnVar.b;
            if (b2pVar.d()) {
                try {
                    ddbVar = r1cVar.e(builder.build(), (InputEvent) b2pVar.g());
                } catch (RuntimeException e) {
                    d8p d8pVar = new d8p();
                    d8pVar.e(e);
                    ddbVar = d8pVar;
                }
                if (ddbVar == null) {
                    return ddbVar;
                }
                yhk.s(wca.O("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xjnVar));
                return null;
            }
        }
        ddbVar = e8p.b;
        if (ddbVar == null) {
        }
    }
}
