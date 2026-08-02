package d30;

import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import e30.C6289b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ozon.fintech.analytic.db.MobileHealthDatabase_Impl;

/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final MobileHealthDatabase_Impl f61120a;

    final class a implements Callable<List<C6289b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f61121a;

        a(w wVar) {
            this.f61121a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<C6289b> call() throws Exception {
            J4.s sVar = m.this.f61120a;
            w wVar = this.f61121a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, "id");
                int b13 = L4.a.b(b11, "event_json");
                int b14 = L4.a.b(b11, "created_at");
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    arrayList.add(new C6289b(b11.getString(b13), b11.getLong(b12), b11.getLong(b14)));
                }
                return arrayList;
            } finally {
                b11.close();
                wVar.release();
            }
        }
    }

    final class b implements Callable<List<C6289b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f61123a;

        b(w wVar) {
            this.f61123a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<C6289b> call() throws Exception {
            J4.s sVar = m.this.f61120a;
            w wVar = this.f61123a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, "id");
                int b13 = L4.a.b(b11, "event_json");
                int b14 = L4.a.b(b11, "created_at");
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    arrayList.add(new C6289b(b11.getString(b13), b11.getLong(b12), b11.getLong(b14)));
                }
                return arrayList;
            } finally {
                b11.close();
                wVar.release();
            }
        }
    }

    final class c implements Callable<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f61125a;

        c(w wVar) {
            this.f61125a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Integer call() throws Exception {
            J4.s sVar = m.this.f61120a;
            w wVar = this.f61125a;
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

    public m(@NonNull MobileHealthDatabase_Impl mobileHealthDatabase_Impl) {
        this.f61120a = mobileHealthDatabase_Impl;
        new o(mobileHealthDatabase_Impl);
        new p(mobileHealthDatabase_Impl);
        new q(mobileHealthDatabase_Impl);
        new r(mobileHealthDatabase_Impl);
        new s(mobileHealthDatabase_Impl);
    }

    @Override // d30.l
    public final Object a(int i11, kotlin.coroutines.d<? super List<C6289b>> dVar) {
        w j11 = w.j(1, "SELECT * FROM mobile_health_events ORDER BY created_at ASC LIMIT ?");
        j11.m0(1, i11);
        return J4.f.b(this.f61120a, new CancellationSignal(), new a(j11), dVar);
    }

    @Override // d30.l
    public final Object b(kotlin.coroutines.d<? super Integer> dVar) {
        w j11 = w.j(0, "SELECT COUNT(*) FROM mobile_health_events");
        return J4.f.b(this.f61120a, new CancellationSignal(), new c(j11), dVar);
    }

    @Override // d30.l
    public final Object c(kotlin.coroutines.d<? super List<C6289b>> dVar) {
        w j11 = w.j(0, "SELECT * FROM mobile_health_events ORDER BY created_at ASC");
        return J4.f.b(this.f61120a, new CancellationSignal(), new b(j11), dVar);
    }

    @Override // d30.l
    public final Object d(ArrayList arrayList, kotlin.coroutines.d dVar) {
        return J4.f.c(this.f61120a, new n(this, arrayList), dVar);
    }
}
