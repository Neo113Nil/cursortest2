package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qjm implements Callable {
    public final /* synthetic */ r6g a;
    public final /* synthetic */ dnm b;

    public qjm(dnm dnmVar, r6g r6gVar) {
        this.b = dnmVar;
        this.a = r6gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        k6g k6gVar = this.b.a;
        r6g r6gVar = this.a;
        Cursor V = gz8.V(k6gVar, r6gVar);
        try {
            int valueOf = V.moveToFirst() ? Integer.valueOf(V.getInt(0)) : 0;
            V.close();
            r6gVar.release();
            return valueOf;
        } catch (Throwable th) {
            V.close();
            r6gVar.release();
            throw th;
        }
    }
}
