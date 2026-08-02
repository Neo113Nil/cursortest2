package h5;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import i5.C7009b;
import java.util.UUID;

/* renamed from: h5.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6801B implements androidx.work.u {

    /* renamed from: c, reason: collision with root package name */
    static final String f64957c = androidx.work.o.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f64958a;

    /* renamed from: b, reason: collision with root package name */
    final C7009b f64959b;

    public C6801B(@NonNull WorkDatabase workDatabase, @NonNull C7009b c7009b) {
        this.f64958a = workDatabase;
        this.f64959b = c7009b;
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c a(@NonNull UUID uuid, @NonNull androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c k11 = androidx.work.impl.utils.futures.c.k();
        this.f64959b.a(new RunnableC6800A(this, uuid, eVar, k11));
        return k11;
    }
}
