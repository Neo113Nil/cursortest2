package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import xsna.jyg0;
import xsna.tin0;

/* compiled from: DatabaseConfiguration.android.kt */
/* loaded from: classes.dex */
public final class b {
    public final Context a;
    public final String b;
    public final tin0.c c;
    public final RoomDatabase.c d;
    public final List<RoomDatabase.b> e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set<Integer> m;
    public final String n;
    public final File o;
    public final Callable<InputStream> p;
    public final List<Object> q;
    public final List<Object> r;
    public final boolean s;
    public final jyg0 t;
    public final kotlin.coroutines.d u;
    public boolean v = true;

    @SuppressLint({"LambdaLast"})
    public b(Context context, String str, tin0.c cVar, RoomDatabase.c cVar2, List list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, jyg0 jyg0Var, kotlin.coroutines.d dVar) {
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = cVar2;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = z4;
        this.t = jyg0Var;
        this.u = dVar;
    }
}
