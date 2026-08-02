package m3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.tasks.Task;
import com.google.gson.reflect.TypeToken;
import com.sports.insider.MyApp;
import e3.k0;
import eg.c0;
import eg.m0;
import eg.y;
import id.x;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import la.c1;
import la.s0;
import la.w;
import nh.d0;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class f implements androidx.customview.widget.d, t1.b, io.sentry.hints.i, io.sentry.util.runtime.b, w7.a {

    /* renamed from: b, reason: collision with root package name */
    public static f f20310b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f20311c = new f(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20312a;

    public /* synthetic */ f(int i5) {
        this.f20312a = i5;
    }

    public static final Map c(f fVar, String str) {
        try {
            if (str.length() == 0) {
                return n0.c();
            }
            List P = StringsKt.P(str, new String[]{"&"}, true, 0);
            if (P.isEmpty()) {
                return n0.c();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = P.iterator();
            while (it.hasNext()) {
                List P2 = StringsKt.P((String) it.next(), new String[]{"="}, true, 0);
                if (!P2.isEmpty() && P2.size() >= 2 && ((CharSequence) P2.get(0)).length() > 0 && ((CharSequence) P2.get(1)).length() > 0) {
                    linkedHashMap.put(P2.get(0), P2.get(1));
                }
            }
            return n0.i(linkedHashMap);
        } catch (Exception unused) {
            return n0.c();
        }
    }

    public static final hc.h d(ia.a aVar) {
        int i5 = aVar.f11034a;
        int i10 = aVar.f11035b;
        String str = aVar.f11036c;
        String str2 = aVar.f11037d;
        String str3 = aVar.f11038e;
        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE;
        Intrinsics.checkNotNullExpressionValue(format, "ISO_LOCAL_DATE");
        Intrinsics.checkNotNullParameter(format, "format");
        String format2 = LocalDateTime.ofInstant(Instant.ofEpochSecond(i10), ZoneId.systemDefault()).format(format);
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return new hc.h(i5, i10, str, str2, str3, format2);
    }

    public static String h(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static y k() {
        return new y("Metrics");
    }

    public static w l() {
        return (w) y3.m(w.class, null, 6);
    }

    public static void q(Context context, String str) {
        x1.b.a(context).b(new Intent("Bonus").putExtra("existBonus", str != null).putExtra("bonus", str));
    }

    public static final CharSequence v(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // io.sentry.util.runtime.b
    public void a(com.logrocket.core.l lVar) {
        lVar.run();
    }

    @Override // io.sentry.util.runtime.b
    public Object b(io.sentry.util.runtime.a aVar) {
        return aVar.run();
    }

    @Override // w7.a
    public /* synthetic */ Object f(Task task) {
        return null;
    }

    public void g(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        c0.t(MyApp.f6830c, k(), null, new cd.e(this, name, str, null, 0), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:13:0x003b, B:14:0x0122, B:16:0x0126, B:17:0x0158, B:20:0x012c, B:22:0x0139, B:23:0x0153, B:27:0x004e, B:29:0x00de, B:35:0x00f0, B:37:0x00f9, B:39:0x0104, B:44:0x005a, B:46:0x009b, B:48:0x009f, B:50:0x00ac, B:51:0x00c7, B:59:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:13:0x003b, B:14:0x0122, B:16:0x0126, B:17:0x0158, B:20:0x012c, B:22:0x0139, B:23:0x0153, B:27:0x004e, B:29:0x00de, B:35:0x00f0, B:37:0x00f9, B:39:0x0104, B:44:0x005a, B:46:0x009b, B:48:0x009f, B:50:0x00ac, B:51:0x00c7, B:59:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:13:0x003b, B:14:0x0122, B:16:0x0126, B:17:0x0158, B:20:0x012c, B:22:0x0139, B:23:0x0153, B:27:0x004e, B:29:0x00de, B:35:0x00f0, B:37:0x00f9, B:39:0x0104, B:44:0x005a, B:46:0x009b, B:48:0x009f, B:50:0x00ac, B:51:0x00c7, B:59:0x0078), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Context context, e3.j jVar, mf.c cVar) {
        id.y yVar;
        Object obj;
        lf.a aVar;
        int i5;
        int a7;
        Context context2;
        x xVar;
        ja.c cVar2;
        x xVar2;
        Object uVar;
        int intValue;
        int i10;
        Context context3;
        ja.c cVar3;
        try {
            if (cVar instanceof id.y) {
                yVar = (id.y) cVar;
                int i11 = yVar.f11231f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    yVar.f11231f = i11 - Integer.MIN_VALUE;
                    obj = yVar.f11229d;
                    aVar = lf.a.f20034a;
                    i5 = yVar.f11231f;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        a7 = jVar.a("idPrediction", -1);
                        if (a7 < 1) {
                            e3.s sVar = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                            return sVar;
                        }
                        x xVar3 = new x();
                        context2 = context;
                        yVar.f11226a = context2;
                        yVar.f11227b = xVar3;
                        yVar.f11228c = a7;
                        yVar.f11231f = 1;
                        x.d().getClass();
                        Object h10 = s0.h(a7, yVar);
                        if (h10 == aVar) {
                            return aVar;
                        }
                        xVar = xVar3;
                        obj = h10;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i10 = yVar.f11228c;
                                context3 = yVar.f11226a;
                                h8.b.B(obj);
                                cVar3 = (ja.c) obj;
                                if (cVar3 != null) {
                                    uVar = new e3.s();
                                } else if (io.sentry.config.a.C(new Integer(cVar3.j))) {
                                    int i12 = cVar3.f18391d;
                                    x1.b a10 = x1.b.a(context3);
                                    Intent intent = new Intent("OpenPrediction");
                                    intent.putExtra("idPrediction", i10);
                                    intent.putExtra("typePrediction", i12);
                                    a10.b(intent);
                                    uVar = new e3.u();
                                } else {
                                    uVar = new e3.t();
                                }
                                Intrinsics.checkNotNull(uVar);
                                return uVar;
                            }
                            a7 = yVar.f11228c;
                            xVar2 = yVar.f11227b;
                            Context context4 = yVar.f11226a;
                            h8.b.B(obj);
                            context2 = context4;
                            intValue = ((Number) obj).intValue();
                            if (intValue == 200) {
                                if (intValue == 429 || intValue == 502) {
                                    e3.t tVar = new e3.t();
                                    Intrinsics.checkNotNullExpressionValue(tVar, "retry(...)");
                                    return tVar;
                                }
                                e3.s sVar2 = new e3.s();
                                Intrinsics.checkNotNullExpressionValue(sVar2, "failure(...)");
                                return sVar2;
                            }
                            e3.j jVar2 = e3.j.f8531b;
                            yVar.f11226a = context2;
                            yVar.f11227b = null;
                            yVar.f11228c = a7;
                            yVar.f11231f = 3;
                            xVar2.getClass();
                            x.d().getClass();
                            obj = s0.h(a7, yVar);
                            if (obj != aVar) {
                                i10 = a7;
                                context3 = context2;
                                cVar3 = (ja.c) obj;
                                if (cVar3 != null) {
                                }
                                Intrinsics.checkNotNull(uVar);
                                return uVar;
                            }
                            return aVar;
                        }
                        a7 = yVar.f11228c;
                        x xVar4 = yVar.f11227b;
                        Context context5 = yVar.f11226a;
                        h8.b.B(obj);
                        xVar = xVar4;
                        context2 = context5;
                    }
                    cVar2 = (ja.c) obj;
                    if (cVar2 == null && io.sentry.config.a.C(new Integer(cVar2.j))) {
                        int i13 = cVar2.f18391d;
                        x1.b a11 = x1.b.a(context2);
                        Intent intent2 = new Intent("OpenPrediction");
                        intent2.putExtra("idPrediction", a7);
                        intent2.putExtra("typePrediction", i13);
                        a11.b(intent2);
                        uVar = new e3.u();
                        Intrinsics.checkNotNull(uVar);
                        return uVar;
                    }
                    yVar.f11226a = context2;
                    yVar.f11227b = xVar;
                    yVar.f11228c = a7;
                    yVar.f11231f = 2;
                    xVar.getClass();
                    obj = x.d().f(a7, yVar);
                    if (obj != aVar) {
                        return aVar;
                    }
                    xVar2 = xVar;
                    intValue = ((Number) obj).intValue();
                    if (intValue == 200) {
                    }
                }
            }
            if (i5 != 0) {
            }
            cVar2 = (ja.c) obj;
            if (cVar2 == null) {
            }
            yVar.f11226a = context2;
            yVar.f11227b = xVar;
            yVar.f11228c = a7;
            yVar.f11231f = 2;
            xVar.getClass();
            obj = x.d().f(a7, yVar);
            if (obj != aVar) {
            }
        } catch (Exception unused) {
            e3.s sVar3 = new e3.s();
            Intrinsics.checkNotNull(sVar3);
            return sVar3;
        }
        yVar = new id.y(this, cVar);
        obj = yVar.f11229d;
        aVar = lf.a.f20034a;
        i5 = yVar.f11231f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (com.google.gson.internal.e.h(r0[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.gson.internal.l j(TypeToken typeToken, boolean z5) {
        String str;
        com.google.gson.internal.l qVar;
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = Collections.EMPTY_MAP;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        final int i5 = 1;
        final int i10 = 0;
        com.google.firebase.messaging.k kVar = null;
        com.google.gson.internal.l lVar = EnumSet.class.isAssignableFrom(rawType) ? new com.google.gson.internal.l() { // from class: com.google.gson.internal.a
            @Override // com.google.gson.internal.l
            public final Object d() {
                switch (i10) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new com.google.gson.m("Invalid EnumSet type: " + type2.toString());
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new com.google.gson.m("Invalid EnumSet type: " + type2.toString());
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new com.google.gson.m("Invalid EnumMap type: " + type4.toString());
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new com.google.gson.m("Invalid EnumMap type: " + type4.toString());
                }
            }
        } : rawType == EnumMap.class ? new com.google.gson.internal.l() { // from class: com.google.gson.internal.a
            @Override // com.google.gson.internal.l
            public final Object d() {
                switch (i5) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new com.google.gson.m("Invalid EnumSet type: " + type2.toString());
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new com.google.gson.m("Invalid EnumSet type: " + type2.toString());
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new com.google.gson.m("Invalid EnumMap type: " + type4.toString());
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new com.google.gson.m("Invalid EnumMap type: " + type4.toString());
                }
            }
        } : null;
        if (lVar != null) {
            return lVar;
        }
        List list = Collections.EMPTY_LIST;
        com.google.gson.internal.e.f();
        int i11 = 10;
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                rh.g gVar = q9.c.f22069a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e7) {
                    str = "Failed making constructor '" + q9.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage() + q9.c.e(e7);
                }
                qVar = str != null ? new com.google.firebase.messaging.q(str, 3) : new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(i11, declaredConstructor);
            } catch (NoSuchMethodException unused) {
            }
            if (qVar == null) {
                return qVar;
            }
            int i12 = 4;
            int i13 = 11;
            if (Collection.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(ArrayList.class)) {
                    kVar = new com.google.firebase.messaging.k(8);
                } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                    kVar = new com.google.firebase.messaging.k(9);
                } else if (rawType.isAssignableFrom(TreeSet.class)) {
                    kVar = new com.google.firebase.messaging.k(i11);
                } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                    kVar = new com.google.firebase.messaging.k(i13);
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(com.google.gson.internal.k.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    kVar = new com.google.firebase.messaging.k(12);
                }
                if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                    kVar = new com.google.firebase.messaging.k(i12);
                } else if (rawType.isAssignableFrom(TreeMap.class)) {
                    kVar = new com.google.firebase.messaging.k(5);
                } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                    kVar = new com.google.firebase.messaging.k(6);
                } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    kVar = new com.google.firebase.messaging.k(7);
                }
            }
            if (kVar != null) {
                return kVar;
            }
            String h10 = h(rawType);
            if (h10 != null) {
                return new com.google.firebase.messaging.q(h10, 2);
            }
            if (z5) {
                return new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(i13, rawType);
            }
            return new com.google.firebase.messaging.q("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.", i12);
        }
        qVar = null;
        if (qVar == null) {
        }
    }

    public SparseIntArray[] m() {
        return null;
    }

    public void n(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        c0.t(MyApp.f6830c, k(), null, new cd.e(this, name, str, null, 1), 2);
    }

    public SparseIntArray[] o(Activity activity) {
        return null;
    }

    public SparseIntArray[] p() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(mf.c cVar) {
        dd.b bVar;
        int i5;
        int intValue;
        try {
            if (cVar instanceof dd.b) {
                bVar = (dd.b) cVar;
                int i10 = bVar.f8368c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f8368c = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.f8366a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = bVar.f8368c;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        new WeakReference(new b0());
                        bVar.f8368c = 1;
                        w wVar = (w) y3.m(w.class, null, 6);
                        wVar.getClass();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new la.u(wVar, continuation, 0), bVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    if (401 <= intValue && intValue < 406) {
                        ((k0) y3.m(k0.class, null, 6)).a("WorkerMetricLiveViewEvent");
                    }
                    Object sVar = (200 <= intValue || intValue >= 300) ? new e3.s() : new e3.u();
                    Intrinsics.checkNotNull(sVar);
                    return sVar;
                }
            }
            if (i5 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (401 <= intValue) {
                ((k0) y3.m(k0.class, null, 6)).a("WorkerMetricLiveViewEvent");
            }
            if (200 <= intValue) {
            }
            Intrinsics.checkNotNull(sVar);
            return sVar;
        } catch (CancellationException unused) {
            e3.s sVar2 = new e3.s();
            Intrinsics.checkNotNull(sVar2);
            return sVar2;
        } catch (Exception e7) {
            if (!(e7 instanceof CancellationException) && !(e7 instanceof nh.a) && !(e7 instanceof d0) && !(e7 instanceof ConnectException) && !(e7 instanceof SocketException) && !(e7 instanceof SSLPeerUnverifiedException) && !(e7 instanceof SSLHandshakeException) && !(e7 instanceof SSLException) && !(e7 instanceof TimeoutException) && !(e7 instanceof SocketTimeoutException) && !(e7 instanceof UnknownHostException) && !(e7 instanceof IOException)) {
                zc.d.b(6, null, e7);
            }
            e3.s sVar3 = new e3.s();
            Intrinsics.checkNotNull(sVar3);
            return sVar3;
        }
        bVar = new dd.b(this, cVar);
        Object obj2 = bVar.f8366a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = bVar.f8368c;
        Continuation continuation2 = null;
    }

    public SparseIntArray[] s() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:11:0x0026, B:12:0x0058, B:16:0x006a, B:17:0x0085, B:21:0x0070, B:22:0x0079, B:29:0x0044), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Context context, int i5, mf.c cVar) {
        ld.d dVar;
        int i10;
        int intValue;
        Object uVar;
        try {
            if (cVar instanceof ld.d) {
                dVar = (ld.d) cVar;
                int i11 = dVar.f19690d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f19690d = i11 - Integer.MIN_VALUE;
                    Object obj = dVar.f19688b;
                    lf.a aVar = lf.a.f20034a;
                    i10 = dVar.f19690d;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        if (i5 > 10) {
                            e3.s sVar = new e3.s();
                            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                            return sVar;
                        }
                        dVar.f19687a = context;
                        dVar.f19690d = 1;
                        obj = ((c1) y3.m(c1.class, null, 6)).e(dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = dVar.f19687a;
                        h8.b.B(obj);
                    }
                    Pair pair = (Pair) obj;
                    intValue = ((Number) pair.f19192a).intValue();
                    if (intValue != 200) {
                        q(context, (String) pair.f19193b);
                        uVar = new e3.u();
                    } else if (intValue != 404) {
                        uVar = new e3.s();
                    } else {
                        q(context, null);
                        uVar = new e3.u();
                    }
                    Intrinsics.checkNotNull(uVar);
                    return uVar;
                }
            }
            if (i10 != 0) {
            }
            Pair pair2 = (Pair) obj;
            intValue = ((Number) pair2.f19192a).intValue();
            if (intValue != 200) {
            }
            Intrinsics.checkNotNull(uVar);
            return uVar;
        } catch (Exception unused) {
            e3.t tVar = new e3.t();
            Intrinsics.checkNotNull(tVar);
            return tVar;
        }
        dVar = new ld.d(this, cVar);
        Object obj2 = dVar.f19688b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = dVar.f19690d;
    }

    public String toString() {
        switch (this.f20312a) {
            case 9:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(mf.c cVar) {
        ad.b bVar;
        int i5;
        ed.a aVar;
        int i10;
        Continuation continuation = null;
        switch (this.f20312a) {
            case 1:
                try {
                    if (cVar instanceof ad.b) {
                        bVar = (ad.b) cVar;
                        int i11 = bVar.f131c;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            bVar.f131c = i11 - Integer.MIN_VALUE;
                            Object obj = bVar.f129a;
                            lf.a aVar2 = lf.a.f20034a;
                            i5 = bVar.f131c;
                            if (i5 != 0) {
                                h8.b.B(obj);
                                bVar.f131c = 1;
                                w wVar = (w) y3.m(w.class, null, 6);
                                wVar.getClass();
                                lg.e eVar = m0.f9201a;
                                obj = c0.A(lg.d.f20063c, new bd.i(wVar, null), bVar);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                            } else {
                                if (i5 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                            }
                            int intValue = ((Number) obj).intValue();
                            Object sVar = (200 <= intValue || intValue >= 400) ? new e3.s() : new e3.u();
                            Intrinsics.checkNotNull(sVar);
                            return sVar;
                        }
                    }
                    if (i5 != 0) {
                    }
                    int intValue2 = ((Number) obj).intValue();
                    Object sVar2 = (200 <= intValue2 || intValue2 >= 400) ? new e3.s() : new e3.u();
                    Intrinsics.checkNotNull(sVar2);
                    return sVar2;
                } catch (Exception unused) {
                    e3.s sVar3 = new e3.s();
                    Intrinsics.checkNotNull(sVar3);
                    return sVar3;
                }
                bVar = new ad.b(this, cVar);
                Object obj2 = bVar.f129a;
                lf.a aVar22 = lf.a.f20034a;
                i5 = bVar.f131c;
            default:
                if (cVar instanceof ed.a) {
                    aVar = (ed.a) cVar;
                    int i12 = aVar.f9098c;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        aVar.f9098c = i12 - Integer.MIN_VALUE;
                        Object obj3 = aVar.f9096a;
                        lf.a aVar3 = lf.a.f20034a;
                        i10 = aVar.f9098c;
                        if (i10 != 0) {
                            h8.b.B(obj3);
                            lg.e eVar2 = m0.f9201a;
                            lg.d dVar = lg.d.f20063c;
                            androidx.lifecycle.b bVar2 = new androidx.lifecycle.b(this, continuation, 2);
                            aVar.f9098c = 1;
                            obj3 = c0.A(dVar, bVar2, aVar);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj3);
                        }
                        Intrinsics.checkNotNullExpressionValue(obj3, "withContext(...)");
                        return obj3;
                    }
                }
                aVar = new ed.a(this, cVar);
                Object obj32 = aVar.f9096a;
                lf.a aVar32 = lf.a.f20034a;
                i10 = aVar.f9098c;
                if (i10 != 0) {
                }
                Intrinsics.checkNotNullExpressionValue(obj32, "withContext(...)");
                return obj32;
        }
    }

    public void e(Activity activity) {
    }
}
