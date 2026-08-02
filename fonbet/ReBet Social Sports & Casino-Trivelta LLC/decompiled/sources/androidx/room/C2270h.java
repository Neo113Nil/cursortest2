package androidx.room;

import E2.h;
import android.content.Context;
import android.content.Intent;
import androidx.room.w;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.room.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2270h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23358b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f23359c;

    /* renamed from: d, reason: collision with root package name */
    public final w.e f23360d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23362f;

    /* renamed from: g, reason: collision with root package name */
    public final w.d f23363g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f23364h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f23365i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f23366j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23367k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23368l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f23369m;

    /* renamed from: n, reason: collision with root package name */
    public final String f23370n;

    /* renamed from: o, reason: collision with root package name */
    public final File f23371o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f23372p;

    /* renamed from: q, reason: collision with root package name */
    public final List f23373q;

    /* renamed from: r, reason: collision with root package name */
    public final List f23374r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f23375s;

    public C2270h(Context context, String str, h.c sqliteOpenHelperFactory, w.e migrationContainer, List list, boolean z10, w.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, w.f fVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f23357a = context;
        this.f23358b = str;
        this.f23359c = sqliteOpenHelperFactory;
        this.f23360d = migrationContainer;
        this.f23361e = list;
        this.f23362f = z10;
        this.f23363g = journalMode;
        this.f23364h = queryExecutor;
        this.f23365i = transactionExecutor;
        this.f23366j = intent;
        this.f23367k = z11;
        this.f23368l = z12;
        this.f23369m = set;
        this.f23370n = str2;
        this.f23371o = file;
        this.f23372p = callable;
        this.f23373q = typeConverters;
        this.f23374r = autoMigrationSpecs;
        this.f23375s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f23368l) && this.f23367k && ((set = this.f23369m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
