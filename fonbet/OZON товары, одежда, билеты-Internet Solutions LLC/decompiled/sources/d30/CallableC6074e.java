package d30;

import J4.w;
import android.database.Cursor;
import e30.C6290c;
import java.util.concurrent.Callable;

/* renamed from: d30.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC6074e implements Callable<C6290c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f61116a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6072c f61117b;

    CallableC6074e(C6072c c6072c, w wVar) {
        this.f61117b = c6072c;
        this.f61116a = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final C6290c call() throws Exception {
        J4.s sVar = this.f61117b.f61100a;
        w wVar = this.f61116a;
        Cursor b11 = L4.b.b(sVar, wVar, false);
        try {
            return b11.moveToFirst() ? new C6290c(b11.getInt(L4.a.b(b11, "id")), b11.getString(L4.a.b(b11, "userId"))) : null;
        } finally {
            b11.close();
            wVar.release();
        }
    }
}
