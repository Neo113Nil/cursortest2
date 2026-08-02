package d30;

import J4.w;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* renamed from: d30.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC6073d implements Callable<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f61114a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6072c f61115b;

    CallableC6073d(C6072c c6072c, w wVar) {
        this.f61115b = c6072c;
        this.f61114a = wVar;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Integer call() throws Exception {
        J4.s sVar = this.f61115b.f61100a;
        w wVar = this.f61114a;
        Cursor b11 = L4.b.b(sVar, wVar, false);
        try {
            int valueOf = b11.moveToFirst() ? Integer.valueOf(b11.getInt(0)) : 0;
            b11.close();
            wVar.release();
            return valueOf;
        } catch (Throwable th2) {
            b11.close();
            wVar.release();
            throw th2;
        }
    }
}
