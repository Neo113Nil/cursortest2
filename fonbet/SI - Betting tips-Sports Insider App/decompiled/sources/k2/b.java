package k2;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18631b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.c f18632c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.i f18633d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18634e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18635f;

    /* renamed from: g, reason: collision with root package name */
    public final t f18636g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f18637h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f18638i;
    public final Intent j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18639k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18640l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f18641m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18642n;

    /* renamed from: o, reason: collision with root package name */
    public final File f18643o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f18644p;
    public final List q;

    /* renamed from: r, reason: collision with root package name */
    public final List f18645r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18646s;

    /* renamed from: t, reason: collision with root package name */
    public final s2.b f18647t;

    /* renamed from: u, reason: collision with root package name */
    public final CoroutineContext f18648u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18649v;

    public b(Context context, String str, t2.c cVar, e3.i migrationContainer, List list, boolean z5, t journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z7, boolean z10, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z11, s2.b bVar, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f18630a = context;
        this.f18631b = str;
        this.f18632c = cVar;
        this.f18633d = migrationContainer;
        this.f18634e = list;
        this.f18635f = z5;
        this.f18636g = journalMode;
        this.f18637h = queryExecutor;
        this.f18638i = transactionExecutor;
        this.j = intent;
        this.f18639k = z7;
        this.f18640l = z10;
        this.f18641m = set;
        this.f18642n = str2;
        this.f18643o = file;
        this.f18644p = callable;
        this.q = typeConverters;
        this.f18645r = autoMigrationSpecs;
        this.f18646s = z11;
        this.f18647t = bVar;
        this.f18648u = coroutineContext;
        this.f18649v = true;
    }
}
