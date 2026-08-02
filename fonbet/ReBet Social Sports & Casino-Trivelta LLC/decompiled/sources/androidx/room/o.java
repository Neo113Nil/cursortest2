package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final w f23382a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f23383b;

    public o(w database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f23382a = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f23383b = newSetFromMap;
    }

    public final LiveData a(String[] tableNames, boolean z10, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new D(this.f23382a, this, z10, computeFunction, tableNames);
    }

    public final void b(LiveData liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f23383b.add(liveData);
    }

    public final void c(LiveData liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f23383b.remove(liveData);
    }
}
