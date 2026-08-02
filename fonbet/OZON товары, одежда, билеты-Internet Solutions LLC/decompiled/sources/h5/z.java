package h5;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import i5.C7009b;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class z implements androidx.work.i {

    /* renamed from: a, reason: collision with root package name */
    private final C7009b f65018a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.p f65019b;

    /* renamed from: c, reason: collision with root package name */
    final g5.C f65020c;

    static {
        androidx.work.o.i("WMFgUpdater");
    }

    public z(@NonNull WorkDatabase workDatabase, @NonNull androidx.work.impl.p pVar, @NonNull C7009b c7009b) {
        this.f65019b = pVar;
        this.f65018a = c7009b;
        this.f65020c = workDatabase.f();
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c a(@NonNull Context context, @NonNull UUID uuid, @NonNull androidx.work.h hVar) {
        androidx.work.impl.utils.futures.c k11 = androidx.work.impl.utils.futures.c.k();
        this.f65018a.a(new y(this, k11, uuid, hVar, context));
        return k11;
    }
}
