package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import db.c;
import f3.d;
import gf.k;
import gf.t;
import j1.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k2.i;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m3.e;
import m3.l;
import m3.m;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l, reason: collision with root package name */
    public final t f2924l;

    /* renamed from: m, reason: collision with root package name */
    public final t f2925m;

    /* renamed from: n, reason: collision with root package name */
    public final t f2926n;

    /* renamed from: o, reason: collision with root package name */
    public final t f2927o;

    /* renamed from: p, reason: collision with root package name */
    public final t f2928p;
    public final t q;

    /* renamed from: r, reason: collision with root package name */
    public final t f2929r;

    public WorkDatabase_Impl() {
        final int i5 = 0;
        this.f2924l = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i10 = 1;
        this.f2925m = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i11 = 2;
        this.f2926n = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i12 = 3;
        this.f2927o = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i13 = 4;
        this.f2928p = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i14 = 5;
        this.q = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i15 = 6;
        this.f2929r = k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
        final int i16 = 7;
        k.b(new Function0(this) { // from class: f3.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkDatabase_Impl f9422b;

            {
                this.f9422b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new m3.s(this.f9422b);
                    case 1:
                        return new m3.c(this.f9422b);
                    case 2:
                        return new m3.u(this.f9422b);
                    case 3:
                        return new m3.i(this.f9422b);
                    case 4:
                        return new m3.l(this.f9422b);
                    case 5:
                        return new m3.m(this.f9422b);
                    case 6:
                        return new m3.e(this.f9422b);
                    default:
                        WorkDatabase_Impl __db = this.f9422b;
                        Intrinsics.checkNotNullParameter(__db, "__db");
                        return new m3.f(0);
                }
            }
        });
    }

    @Override // k2.w
    public final List c(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(13, 14, 10));
        arrayList.add(new f3.t(0));
        arrayList.add(new d(16, 17, 11));
        arrayList.add(new d(17, 18, 12));
        arrayList.add(new d(18, 19, 13));
        arrayList.add(new f3.t(1));
        arrayList.add(new d(20, 21, 14));
        arrayList.add(new d(22, 23, 15));
        arrayList.add(new d(23, 24, 16));
        return arrayList;
    }

    @Override // k2.w
    public final i d() {
        return new i(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // k2.w
    public final f e() {
        return new c(this);
    }

    @Override // k2.w
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // k2.w
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(s.class);
        e0 e0Var = e0.f19204a;
        linkedHashMap.put(orCreateKotlinClass, e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(m3.c.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(u.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(m3.i.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(l.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(m.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(e.class), e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(m3.f.class), e0Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m3.c t() {
        return (m3.c) this.f2925m.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e u() {
        return (e) this.f2929r.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m3.i v() {
        return (m3.i) this.f2927o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l w() {
        return (l) this.f2928p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m x() {
        return (m) this.q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s y() {
        return (s) this.f2924l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u z() {
        return (u) this.f2926n.getValue();
    }
}
