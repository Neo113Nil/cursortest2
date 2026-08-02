package com.android.billingclient.api;

import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.r5;
import com.google.android.gms.internal.play_billing.s5;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u5;
import io.sentry.ILogger;
import io.sentry.b5;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4043a;

    /* renamed from: b, reason: collision with root package name */
    public int f4044b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4045c;

    public /* synthetic */ l0(int i5, int i10, Object obj) {
        this.f4043a = i10;
        this.f4045c = obj;
        this.f4044b = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l0 l0Var, gf.b bVar, mf.a aVar) {
        ug.q frame;
        int i5;
        LinkedHashMap linkedHashMap;
        gf.b bVar2;
        byte b10;
        ug.u uVar;
        l0 l0Var2;
        ug.u uVar2 = (ug.u) l0Var.f4045c;
        if (aVar instanceof ug.q) {
            frame = (ug.q) aVar;
            int i10 = frame.f24298h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f24298h = i10 - Integer.MIN_VALUE;
                Object obj = frame.f24296f;
                lf.a aVar2 = lf.a.f20034a;
                i5 = frame.f24298h;
                int i11 = 0;
                if (i5 != 0) {
                    h8.b.B(obj);
                    byte f6 = uVar2.f((byte) 6);
                    if (uVar2.p() == 4) {
                        ug.u.m(uVar2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    bVar2 = bVar;
                    b10 = f6;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = frame.f24295e;
                    String str = frame.f24294d;
                    linkedHashMap = frame.f24293c;
                    l0Var2 = frame.f24292b;
                    bVar2 = frame.f24291a;
                    h8.b.B(obj);
                    linkedHashMap.put(str, (tg.m) obj);
                    b10 = ((ug.u) l0Var2.f4045c).e();
                    if (b10 != 4) {
                        if (b10 != 7) {
                            ug.u.m((ug.u) l0Var2.f4045c, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        ug.u uVar3 = (ug.u) l0Var2.f4045c;
                        if (b10 != 6) {
                            uVar3.f((byte) 7);
                        } else if (b10 == 4) {
                            ug.j.n(uVar3, "object");
                            throw null;
                        }
                        return new tg.y(linkedHashMap);
                    }
                    i11 = i12;
                    l0Var = l0Var2;
                }
                uVar = (ug.u) l0Var.f4045c;
                if (uVar.b()) {
                    l0Var2 = l0Var;
                    ug.u uVar32 = (ug.u) l0Var2.f4045c;
                    if (b10 != 6) {
                    }
                    return new tg.y(linkedHashMap);
                }
                String i13 = uVar.i();
                uVar.f((byte) 5);
                Unit unit = Unit.f19194a;
                frame.f24291a = bVar2;
                frame.f24292b = l0Var;
                frame.f24293c = linkedHashMap;
                frame.f24294d = i13;
                frame.f24295e = i11;
                frame.f24298h = 1;
                gf.c cVar = (gf.c) bVar2;
                cVar.getClass();
                Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                cVar.f10015c = frame;
                cVar.f10014b = unit;
                Intrinsics.checkNotNullParameter(frame, "frame");
                return aVar2;
            }
        }
        frame = new ug.q(l0Var, aVar);
        Object obj2 = frame.f24296f;
        lf.a aVar22 = lf.a.f20034a;
        i5 = frame.f24298h;
        int i112 = 0;
        if (i5 != 0) {
        }
        uVar = (ug.u) l0Var.f4045c;
        if (uVar.b()) {
        }
    }

    public static void c(String str) {
        if (kotlin.text.z.j(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean z7 = Intrinsics.compare((int) str.charAt(!z5 ? i5 : length), 32) <= 0;
            if (z5) {
                if (!z7) {
                    break;
                } else {
                    length--;
                }
            } else if (z7) {
                i5++;
            } else {
                z5 = true;
            }
        }
        if (str.subSequence(i5, length + 1).toString().length() == 0) {
            return;
        }
        io.sentry.android.core.w0.m("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e7) {
            io.sentry.android.core.w0.n("SupportSQLite", "delete failed: ", e7);
        }
    }

    public void b() {
        WeakReference weakReference;
        int i5 = this.f4044b;
        this.f4044b = i5 + 1;
        if (i5 >= 10) {
            this.f4044b = 0;
            Iterator it = ((LinkedHashMap) this.f4045c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    l4.f fVar = (l4.f) CollectionsKt.firstOrNull(arrayList);
                    if (((fVar == null || (weakReference = fVar.f19362a) == null) ? null : (c4.m) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        int i12 = i11 - i10;
                        if (((l4.f) arrayList.get(i12)).f19362a.get() == null) {
                            arrayList.remove(i12);
                            i10++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void d(int i5, int i10) {
        int i11 = i10 + i5;
        char[] cArr = (char[]) this.f4045c;
        if (cArr.length <= i11) {
            int i12 = i5 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f4045c = copyOf;
        }
    }

    public HashMap e(Map map, ILogger iLogger) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), k(iLogger, obj2));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public void f(u2.c db2, int i5, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        ((k2.r) this.f4045c).k(new v2.a(db2), i5, i10);
    }

    public tg.m g() {
        tg.m yVar;
        Object obj;
        Object invoke;
        Object cVar;
        ug.u uVar = (ug.u) this.f4045c;
        byte p10 = uVar.p();
        if (p10 == 1) {
            return i(true);
        }
        if (p10 == 0) {
            return i(false);
        }
        if (p10 != 6) {
            if (p10 == 8) {
                return h();
            }
            ug.u.m(uVar, "Cannot read Json element because of unexpected ".concat(ug.j.t(p10)), 0, null, 6);
            throw null;
        }
        int i5 = this.f4044b + 1;
        this.f4044b = i5;
        if (i5 == 200) {
            ug.p block = new ug.p(this, null);
            Intrinsics.checkNotNullParameter(block, "block");
            y8.d dVar = new y8.d();
            Unit unit = Unit.f19194a;
            lf.a aVar = gf.a.f10009a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            gf.c cVar2 = new gf.c(null);
            cVar2.f10013a = block;
            cVar2.f10014b = unit;
            Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            cVar2.f10015c = cVar2;
            lf.a aVar2 = gf.a.f10009a;
            cVar2.f10016d = aVar2;
            while (true) {
                obj = cVar2.f10016d;
                Continuation completion = cVar2.f10015c;
                if (completion == null) {
                    break;
                }
                gf.o oVar = gf.q.f10031a;
                if (Intrinsics.areEqual(aVar2, obj)) {
                    try {
                        ug.p pVar = cVar2.f10013a;
                        Unit unit2 = cVar2.f10014b;
                        if (c1.v(pVar)) {
                            invoke = ((vf.a) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 3)).invoke(cVar2, unit2, completion);
                        } else {
                            Intrinsics.checkNotNullParameter(pVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            if (context == kotlin.coroutines.g.f19227a) {
                                Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                                cVar = new lf.b(completion);
                            } else {
                                Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                                cVar = new lf.c(completion, context);
                            }
                            invoke = ((vf.a) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 3)).invoke(cVar2, unit2, cVar);
                        }
                        if (invoke != lf.a.f20034a) {
                            completion.resumeWith(invoke);
                        }
                    } catch (Throwable th2) {
                        gf.o oVar2 = gf.q.f10031a;
                        completion.resumeWith(h8.b.h(th2));
                    }
                } else {
                    cVar2.f10016d = aVar2;
                    completion.resumeWith(obj);
                }
            }
            h8.b.B(obj);
            yVar = (tg.m) obj;
        } else {
            byte f6 = uVar.f((byte) 6);
            if (uVar.p() == 4) {
                ug.u.m(uVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!uVar.b()) {
                    break;
                }
                String i10 = uVar.i();
                uVar.f((byte) 5);
                linkedHashMap.put(i10, g());
                f6 = uVar.e();
                if (f6 != 4) {
                    if (f6 != 7) {
                        ug.u.m(uVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f6 == 6) {
                uVar.f((byte) 7);
            } else if (f6 == 4) {
                ug.j.n(uVar, "object");
                throw null;
            }
            yVar = new tg.y(linkedHashMap);
        }
        this.f4044b--;
        return yVar;
    }

    public tg.e h() {
        ug.u uVar = (ug.u) this.f4045c;
        byte e7 = uVar.e();
        if (uVar.p() == 4) {
            ug.u.m(uVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (uVar.b()) {
            arrayList.add(g());
            e7 = uVar.e();
            if (e7 != 4) {
                boolean z5 = e7 == 9;
                int i5 = uVar.f24316a;
                if (!z5) {
                    ug.u.m(uVar, "Expected end of the array or comma", i5, null, 4);
                    throw null;
                }
            }
        }
        if (e7 == 8) {
            uVar.f((byte) 9);
        } else if (e7 == 4) {
            ug.j.n(uVar, "array");
            throw null;
        }
        return new tg.e(arrayList);
    }

    public tg.c0 i(boolean z5) {
        ug.u uVar = (ug.u) this.f4045c;
        String j = !z5 ? uVar.j() : uVar.i();
        return (z5 || !Intrinsics.areEqual(j, "null")) ? new tg.s(j, z5) : tg.v.INSTANCE;
    }

    public void j() {
        ug.c cVar = ug.c.f24266c;
        char[] array = (char[]) this.f4045c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (cVar) {
            try {
                int i5 = cVar.f1649a;
                if (array.length + i5 < ug.b.f24265a) {
                    cVar.f1649a = i5 + array.length;
                    ((kotlin.collections.l) cVar.f1650b).addLast(array);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public Object k(ILogger iLogger, Object obj) {
        Object l6;
        HashSet hashSet = (HashSet) this.f4045c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i5 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.d.f17158a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i5 < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i5)));
                i5++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.d.b((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (hashSet.contains(obj)) {
            iLogger.h(b5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f4044b) {
                hashSet.remove(obj);
                iLogger.h(b5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    l6 = new ArrayList();
                    int length2 = objArr.length;
                    while (i5 < length2) {
                        l6.add(k(iLogger, objArr[i5]));
                        i5++;
                    }
                } else if (obj instanceof Collection) {
                    l6 = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        l6.add(k(iLogger, it.next()));
                    }
                } else if (obj instanceof Map) {
                    l6 = e((Map) obj, iLogger);
                } else {
                    l6 = l(iLogger, obj);
                    if (l6.isEmpty()) {
                        l6 = obj.toString();
                    }
                }
                hashSet.remove(obj);
                return l6;
            } catch (Exception e7) {
                iLogger.e(b5.INFO, "Not serializing object due to throwing sub-path.", e7);
                hashSet.remove(obj);
                return null;
            }
        } catch (Throwable th2) {
            hashSet.remove(obj);
            throw th2;
        }
    }

    public HashMap l(ILogger iLogger, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, k(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.h(b5.INFO, c1.n("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return hashMap;
    }

    public void m(l4.a aVar, c4.m mVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4045c;
        Object obj = linkedHashMap.get(aVar);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(aVar, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        l4.f fVar = new l4.f(new WeakReference(mVar), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                l4.f fVar2 = (l4.f) arrayList.get(i5);
                if (j < fVar2.f19364c) {
                    i5++;
                } else if (fVar2.f19362a.get() == mVar) {
                    arrayList.set(i5, fVar);
                } else {
                    arrayList.add(i5, fVar);
                }
            }
        } else {
            arrayList.add(fVar);
        }
        b();
    }

    public void n(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        d(this.f4044b, length);
        text.getChars(0, text.length(), (char[]) this.f4045c, this.f4044b);
        this.f4044b += length;
    }

    public void o(s5 s5Var) {
        String str;
        o0 o0Var = (o0) this.f4045c;
        int i5 = this.f4044b;
        try {
            if (o0Var.I == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.i iVar = o0Var.I;
            String packageName = o0Var.G.getPackageName();
            switch (i5) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            m0 m0Var = new m0(s5Var);
            com.google.android.gms.internal.play_billing.g gVar = (com.google.android.gms.internal.play_billing.g) iVar;
            Parcel R = gVar.R();
            R.writeString(packageName);
            R.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.f.f5442a;
            R.writeStrongBinder(m0Var);
            try {
                gVar.f5343f.transact(1, R, null, 1);
                R.recycle();
            } catch (Throwable th2) {
                R.recycle();
                throw th2;
            }
        } catch (Exception e7) {
            o0Var.T(107, 28, t0.F);
            p1.h("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            s5Var.f5586d = true;
            u5 u5Var = s5Var.f5584b;
            if (u5Var != null) {
                t5 t5Var = u5Var.f5601b;
                t5Var.getClass();
                if (r5.f5561f.w(t5Var, null, 0)) {
                    r5.d(t5Var);
                    s5Var.f5583a = null;
                    s5Var.f5584b = null;
                    s5Var.f5585c = null;
                }
            }
        }
    }

    public String toString() {
        switch (this.f4043a) {
            case 6:
                return new String((char[]) this.f4045c, 0, this.f4044b);
            default:
                return super.toString();
        }
    }

    public l0(androidx.appcompat.widget.y configuration, ug.u lexer) {
        this.f4043a = 7;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f4045c = lexer;
    }

    public l0(int i5, int i10) {
        this.f4043a = i10;
        switch (i10) {
            case 3:
                this.f4044b = i5;
                break;
            default:
                this.f4045c = new HashSet();
                this.f4044b = i5;
                break;
        }
    }

    public l0(byte b10, int i5) {
        this.f4043a = i5;
        switch (i5) {
            case 6:
                break;
            default:
                this.f4045c = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(k2.r rVar, int i5) {
        this(i5, 3);
        this.f4043a = 3;
        this.f4045c = rVar;
    }

    public l0(ArrayList routes) {
        this.f4043a = 4;
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f4045c = routes;
    }
}
