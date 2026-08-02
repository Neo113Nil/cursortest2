package k2;

import eg.h1;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final w f18676a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f18677b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18678c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f18679d;

    /* renamed from: e, reason: collision with root package name */
    public final h f18680e;

    /* renamed from: f, reason: collision with root package name */
    public final id.a f18681f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18682g;

    /* JADX WARN: Type inference failed for: r2v4, types: [k2.h] */
    public i(w database, LinkedHashMap shadowTablesMap, LinkedHashMap viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f18676a = database;
        o0 o0Var = new o0(database, shadowTablesMap, viewTables, tableNames, database.f18788k, new h1(1, this, i.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 1));
        this.f18677b = o0Var;
        this.f18678c = new LinkedHashMap();
        this.f18679d = new ReentrantLock();
        final int i5 = 0;
        this.f18680e = new Function0(this) { // from class: k2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f18670b;

            {
                this.f18670b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        this.f18670b.getClass();
                        return Unit.f19194a;
                    default:
                        i iVar = this.f18670b;
                        return Boolean.valueOf(!iVar.f18676a.k() || iVar.f18676a.n());
                }
            }
        };
        this.f18681f = new id.a(this);
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f18682g = new Object();
        final int i10 = 1;
        Function0 function0 = new Function0(this) { // from class: k2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f18670b;

            {
                this.f18670b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        this.f18670b.getClass();
                        return Unit.f19194a;
                    default:
                        i iVar = this.f18670b;
                        return Boolean.valueOf(!iVar.f18676a.k() || iVar.f18676a.n());
                }
            }
        };
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        o0Var.f18746k = function0;
    }
}
