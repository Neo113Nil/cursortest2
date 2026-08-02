package a2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase;
import e3.x;
import f3.v;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import nh.c0;
import nh.y;
import sg.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46c;

    public /* synthetic */ l(int i5, Object obj, Object obj2) {
        this.f44a = i5;
        this.f45b = obj;
        this.f46c = obj2;
    }

    private final Object a() {
        j3.b bVar = (j3.b) this.f45b;
        j3.a listener = (j3.a) this.f46c;
        k3.f fVar = bVar.f18250a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (fVar.f18799c) {
            if (fVar.f18800d.remove(listener) && fVar.f18800d.isEmpty()) {
                fVar.d();
            }
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, nh.c0] */
    private final Object b() {
        long a7;
        int i5;
        y[] yVarArr;
        nh.p pVar = (nh.p) this.f45b;
        c0 settings = (c0) this.f46c;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        nh.q qVar = pVar.f20979b;
        synchronized (qVar.f21001w) {
            synchronized (qVar) {
                try {
                    c0 c0Var = qVar.f20996r;
                    ?? c0Var2 = new c0();
                    c0Var2.b(c0Var);
                    c0Var2.b(settings);
                    objectRef.element = c0Var2;
                    a7 = c0Var2.a() - c0Var.a();
                    if (a7 != 0 && !qVar.f20982b.isEmpty()) {
                        yVarArr = (y[]) qVar.f20982b.values().toArray(new y[0]);
                        c0 c0Var3 = (c0) objectRef.element;
                        Intrinsics.checkNotNullParameter(c0Var3, "<set-?>");
                        qVar.f20996r = c0Var3;
                        jh.c.c(qVar.j, qVar.f20983c + " onSettings", new l(12, qVar, objectRef));
                        Unit unit = Unit.f19194a;
                    }
                    yVarArr = null;
                    c0 c0Var32 = (c0) objectRef.element;
                    Intrinsics.checkNotNullParameter(c0Var32, "<set-?>");
                    qVar.f20996r = c0Var32;
                    jh.c.c(qVar.j, qVar.f20983c + " onSettings", new l(12, qVar, objectRef));
                    Unit unit2 = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                qVar.f21001w.c((c0) objectRef.element);
            } catch (IOException e7) {
                nh.b bVar = nh.b.f20917d;
                qVar.c(bVar, bVar, e7);
            }
            Unit unit3 = Unit.f19194a;
        }
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                synchronized (yVar) {
                    yVar.f21037e += a7;
                    if (a7 > 0) {
                        Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type java.lang.Object");
                        yVar.notifyAll();
                    }
                    Unit unit4 = Unit.f19194a;
                }
            }
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] names;
        int i5 = 1;
        switch (this.f44a) {
            case 0:
                y1.p pVar = (y1.p) this.f45b;
                Fragment fragment = (Fragment) this.f46c;
                for (y1.l lVar : (Iterable) pVar.f25605f.f10742a.getValue()) {
                    if (m.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + fragment + " viewmodel being cleared");
                    }
                    pVar.c(lVar);
                }
                return Unit.f19194a;
            case 1:
                return t.c(new Pair((f4.g) this.f45b, (ag.c) this.f46c));
            case 2:
                ci.d dVar = (ci.d) this.f45b;
                a0 a0Var = (a0) this.f46c;
                if (dVar.f3947b == null) {
                    dVar.f3947b = dVar.a(a0Var);
                }
                return Unit.f19194a;
            case 3:
                SharedPreferences sharedPreferences = ((Context) this.f45b).getSharedPreferences((String) this.f46c, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
            case 4:
                Context context = (Context) this.f45b;
                f1.b bVar = (f1.b) this.f46c;
                Intrinsics.checkNotNull(context);
                String name = bVar.f9307a;
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                String fileName = name + ".preferences_pb";
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), c1.m("datastore/", fileName));
            case 5:
                return g4.e.b((g4.e) this.f45b, (Ref.BooleanRef) this.f46c);
            case 6:
                fg.d dVar2 = (fg.d) this.f45b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f46c;
                synchronized (i3.h.f10913b) {
                    LinkedHashMap linkedHashMap = i3.h.f10914c;
                    linkedHashMap.remove(dVar2);
                    if (linkedHashMap.isEmpty()) {
                        x.e().a(i3.k.f10922a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(i3.h.f10912a);
                        i3.h.f10915d = null;
                        i3.h.f10916e = false;
                    }
                }
                return Unit.f19194a;
            case 7:
                return a();
            case 8:
                v vVar = (v) this.f45b;
                UUID uuid = (UUID) this.f46c;
                WorkDatabase workDatabase = vVar.f9428c;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                workDatabase.q(new io.sentry.android.replay.util.c(12, vVar, uuid));
                f3.j.b(vVar.f9427b, vVar.f9428c, vVar.f9430e);
                return Unit.f19194a;
            case 9:
                v vVar2 = (v) this.f45b;
                String str = (String) this.f46c;
                WorkDatabase workDatabase2 = vVar2.f9428c;
                Intrinsics.checkNotNullExpressionValue(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.q(new n3.b(workDatabase2, str, vVar2, i5));
                f3.j.b(vVar2.f9427b, workDatabase2, vVar2.f9430e);
                return Unit.f19194a;
            case 10:
                nh.q qVar = (nh.q) this.f45b;
                y yVar = (y) this.f46c;
                try {
                    qVar.f20981a.b(yVar);
                } catch (IOException e7) {
                    qh.e eVar = qh.e.f22190a;
                    qh.e.f22190a.j(4, "Http2Connection.Listener failure for " + qVar.f20983c, e7);
                    try {
                        yVar.c(nh.b.f20917d, e7);
                    } catch (IOException unused) {
                    }
                }
                return Unit.f19194a;
            case 11:
                return b();
            case 12:
                nh.q qVar2 = (nh.q) this.f45b;
                qVar2.f20981a.a(qVar2, (c0) ((Ref.ObjectRef) this.f46c).element);
                return Unit.f19194a;
            case 13:
                sg.v vVar3 = (sg.v) this.f45b;
                String str2 = (String) this.f46c;
                Enum[] enumArr = vVar3.f23710a;
                u uVar = new u(str2, enumArr.length);
                for (Enum r02 : enumArr) {
                    uVar.k(r02.name());
                }
                return uVar;
            default:
                qg.g gVar = (qg.g) this.f45b;
                tg.c cVar = (tg.c) this.f46c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                androidx.appcompat.widget.y yVar2 = cVar.f23937a;
                ug.j.p(gVar, cVar);
                int f6 = gVar.f();
                for (int i10 = 0; i10 < f6; i10++) {
                    List h10 = gVar.h(i10);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : h10) {
                        if (obj instanceof tg.u) {
                            arrayList.add(obj);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    tg.u uVar2 = (tg.u) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (uVar2 != null && (names = uVar2.names()) != null) {
                        for (String str3 : names) {
                            String str4 = Intrinsics.areEqual(gVar.e(), qg.j.f22177e) ? "enum value" : "property";
                            if (linkedHashMap2.containsKey(str3)) {
                                throw new og.g("The suggested name '" + str3 + "' for " + str4 + ' ' + gVar.g(i10) + " is already one of the names for " + str4 + ' ' + gVar.g(((Number) n0.d(linkedHashMap2, str3)).intValue()) + " in " + gVar);
                            }
                            linkedHashMap2.put(str3, Integer.valueOf(i10));
                        }
                    }
                }
                return linkedHashMap2.isEmpty() ? n0.c() : linkedHashMap2;
        }
    }

    public /* synthetic */ l(y1.l lVar, y1.p pVar, m mVar, Fragment fragment) {
        this.f44a = 0;
        this.f45b = pVar;
        this.f46c = fragment;
    }
}
