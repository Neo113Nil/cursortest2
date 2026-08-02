package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.compose.runtime.d;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ktm {
    public static ThreadPoolExecutor a;
    public static ThreadPoolExecutor b;
    public static final tc3 c = new tc3(-1620049665, new ed3(23), false);
    public static final tc3 d = new tc3(1261870744, new pd3(21), false);
    public static final tc3 e = new tc3(1197069724, new pd3(22), false);
    public static final Integer[] f = {17, 804};
    public static final Integer[] g = {24, 816};
    public static final Integer[] h = {52, 808};
    public static final Integer[] i = {47, 968};
    public static final Integer[] j = {1443, 513};
    public static final Integer[] k = {1349, Integer.valueOf(PglCryptUtils.COMPRESS_FAILED)};
    public static final Integer[] l = {Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)};
    public static final Integer[] m = {Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)};
    public static final Integer[] n = {19};
    public static final Integer[] o = {20};
    public static final Integer[] p = {21};
    public static final Integer[] q = {3};
    public static final Integer[] r = {45};
    public static final Integer[] s = {18};
    public static final kc t = new kc("android.widget.extra.CHECKED");
    public static final Type[] u = new Type[0];
    public static final /* synthetic */ int v = 0;
    public static final /* synthetic */ int w = 0;
    public static final /* synthetic */ int x = 0;

    public static ImageHeaderParser$ImageType A(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType e2 = ((ds9) arrayList.get(i2)).e(byteBuffer);
                AtomicReference atomicReference = ha2.a;
                if (e2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return e2;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = ha2.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static String B(jl9 jl9Var) {
        jl9Var.getClass();
        gc2 gc2Var = gc2.d;
        return q1f.o(jl9Var.i).g(SameMD5.TAG).i();
    }

    public static void C(ArrayList arrayList, LinkedHashMap linkedHashMap, Integer[] numArr, int i2) {
        LinkedHashSet d0 = CollectionsKt.d0(arrayList, ph0.a0(numArr));
        if (d0.isEmpty()) {
            return;
        }
        int intValue = ((Number) CollectionsKt.X(d0)).intValue();
        linkedHashMap.put(Integer.valueOf(intValue), Integer.valueOf(i2));
        arrayList.remove(Integer.valueOf(intValue));
    }

    public static LinkedHashMap D(Set set) {
        Object obj;
        set.getClass();
        ArrayList arrayList = new ArrayList(set);
        Set set2 = set;
        int c2 = sub.c(k13.r(set2, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        for (Object obj2 : set2) {
            ((Number) obj2).intValue();
            linkedHashMap.put(obj2, 0);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        C(arrayList, linkedHashMap2, f, 1);
        C(arrayList, linkedHashMap2, g, 2);
        C(arrayList, linkedHashMap2, l, 3);
        C(arrayList, linkedHashMap2, m, 4);
        C(arrayList, linkedHashMap2, h, 3);
        C(arrayList, linkedHashMap2, i, 4);
        C(arrayList, linkedHashMap2, j, 5);
        C(arrayList, linkedHashMap2, k, 6);
        C(arrayList, linkedHashMap2, n, 1);
        C(arrayList, linkedHashMap2, o, 2);
        C(arrayList, linkedHashMap2, p, 3);
        C(arrayList, linkedHashMap2, r, 8);
        C(arrayList, linkedHashMap2, s, 8);
        C(arrayList, linkedHashMap2, q, 9);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            List subList = CollectionsKt.U0(linkedHashMap2.values()).subList(0, CollectionsKt.b0(set2, Integer.valueOf(intValue)));
            ListIterator listIterator = subList.listIterator(subList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Number) obj).intValue() != 0) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            linkedHashMap2.put(Integer.valueOf(intValue), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        return linkedHashMap2;
    }

    public static q89 E(Map map) {
        String[] strArr = new String[map.size() * 2];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String obj = StringsKt.l0(str).toString();
            String obj2 = StringsKt.l0(str2).toString();
            vha.x(obj);
            vha.y(obj2, obj);
            strArr[i2] = obj;
            strArr[i2 + 1] = obj2;
            i2 += 2;
        }
        return new q89(strArr);
    }

    public static q89 F(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            a70.p("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                a70.p("Headers cannot be null");
                return null;
            }
            strArr3[i3] = StringsKt.l0(strArr2[i3]).toString();
        }
        int v2 = vha.v(0, strArr3.length - 1, 2);
        if (v2 >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                vha.x(str);
                vha.y(str2, str);
                if (i2 == v2) {
                    break;
                }
                i2 += 2;
            }
        }
        return new q89(strArr3);
    }

    public static ExecutorService G() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = a;
        if (threadPoolExecutor2 != null) {
            return threadPoolExecutor2;
        }
        synchronized (ktm.class) {
            try {
                threadPoolExecutor = a;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ct4(2));
                    a = threadPoolExecutor3;
                    threadPoolExecutor = threadPoolExecutor3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return threadPoolExecutor;
    }

    public static final Double H(Integer num, FootballTeamSeasonStatistics footballTeamSeasonStatistics) {
        return td4.n0(num, footballTeamSeasonStatistics != null ? Integer.valueOf(footballTeamSeasonStatistics.getMatches()) : null);
    }

    public static final Object I(aee aeeVar, d dVar) {
        dVar.getClass();
        Object obj = aeeVar.get(dVar);
        if (obj == null) {
            obj = dVar.b();
        }
        return ((jkk) obj).a(aeeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r6 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        r0 = java.lang.Integer.toString(r10, kotlin.text.CharsKt.checkRadix(16));
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int J(lof lofVar) {
        try {
            x52 x52Var = lofVar.b;
            lofVar.o(1L);
            long j2 = 0;
            while (true) {
                long j3 = j2 + 1;
                if (!lofVar.request(j3)) {
                    break;
                }
                byte t2 = x52Var.t(j2);
                if ((t2 < 48 || t2 > 57) && (j2 != 0 || t2 != 45)) {
                    break;
                }
                j2 = j3;
            }
            long n0 = x52Var.n0();
            String n2 = lofVar.n(Long.MAX_VALUE);
            if (n0 >= 0 && n0 <= 2147483647L && n2.length() <= 0) {
                return (int) n0;
            }
            throw new IOException("expected an int but was \"" + n0 + n2 + '\"');
        } catch (NumberFormatException e2) {
            is8.e(e2.getMessage());
            return 0;
        }
    }

    public static final aee K(gb0[] gb0VarArr, aee aeeVar, aee aeeVar2) {
        aee aeeVar3 = aee.g;
        zde zdeVar = new zde(aeeVar3);
        zdeVar.g = aeeVar3;
        for (gb0 gb0Var : gb0VarArr) {
            d dVar = (d) gb0Var.f;
            if (gb0Var.e || !aeeVar.containsKey(dVar)) {
                zdeVar.put(dVar, dVar.c(gb0Var, (jkk) aeeVar2.get(dVar)));
            }
        }
        return zdeVar.f();
    }

    public static Set L(q89 q89Var) {
        int size = q89Var.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(vha.j(q89Var, i2))) {
                String l2 = vha.l(q89Var, i2);
                if (treeSet == null) {
                    phi.a.getClass();
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = StringsKt.Y(l2, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.l0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? rm5.a : treeSet;
    }

    public static Type M(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(2, M(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments(), 1);
        }
        if (type instanceof GenericArrayType) {
            return new a(2, ((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 1);
    }

    public static Class N(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) N(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return N(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        String valueOf = String.valueOf(type);
        a70.p(fc6.o(new StringBuilder(valueOf.length() + 76 + name.length()), "Expected a Class, ParameterizedType, or GenericArrayType, but <", valueOf, "> is of type ", name));
        return null;
    }

    public static boolean O(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return O(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String P(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void Q(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            a70.p("Primitive type is not allowed");
        }
    }

    public static Type R(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return R(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return R(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type S(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return T(type, cls, R(type, cls, cls2), new HashMap());
        }
        String valueOf = String.valueOf(cls);
        String obj = cls2.toString();
        a70.p(wt3.m(valueOf, " is not the same as or a subtype of ", new StringBuilder(valueOf.length() + 36 + obj.length()), obj));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013e, code lost:
    
        if (r1 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0143, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e A[EDGE_INSN: B:24:0x013e->B:25:0x013e BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [a] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [c] */
    /* JADX WARN: Type inference failed for: r12v4, types: [c] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [b] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v8, types: [a] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type T(Type type, Class cls, Type type2, HashMap hashMap) {
        Type T;
        TypeVariable typeVariable = null;
        while (true) {
            int i2 = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type R = R(type, cls, cls3);
                    if (R instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i2 < length) {
                            if (typeVariable2.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) R).getActualTypeArguments()[i2];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i2++;
                            }
                        }
                        yhk.d();
                        return null;
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type T2 = T(type, cls, componentType, hashMap);
                        type2 = Objects.equals(componentType, T2) ? cls4 : new a(2, T2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type T3 = T(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, T3)) {
                        type2 = new a(2, T3);
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type T4 = T(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(T4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i2 < length2) {
                        Type T5 = T(type, cls, typeArr[i2], hashMap);
                        if (!Objects.equals(T5, typeArr[i2])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                            }
                            typeArr[i2] = T5;
                            z = true;
                        }
                        i2++;
                    }
                    if (!equals || z) {
                        type2 = new b(T4, (Class) type2.getRawType(), typeArr, 1);
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type T6 = T(type, cls, lowerBounds[0], hashMap);
                        if (T6 != lowerBounds[0]) {
                            type2 = new c(new Type[]{Object.class}, T6 instanceof WildcardType ? ((WildcardType) T6).getLowerBounds() : new Type[]{T6}, 1);
                        }
                    } else if (upperBounds.length == 1 && (T = T(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new c(T instanceof WildcardType ? ((WildcardType) T).getUpperBounds() : new Type[]{T}, u, 1);
                    }
                }
            }
        }
    }

    public static final void a(boolean z, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            tol.a(i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, av8Var, function0, z);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new xx0(z, function0, i2, i4);
        }
    }

    public static final void b(int i2, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1721650596);
        if (av8Var2.T(i2 & 1, i2 != 0)) {
            g28 g28Var = bkh.c;
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            wkn.k(haa.t(R.drawable.basketball_lines, 0, av8Var2), null, u6h.C(g28Var, 0.3f), null, mp3.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.neutral_default, av8Var2), 5), av8Var2, 25016, 40);
            kq9.b(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var2), null, u6h.C(n12.a.a(bkh.m(l98.b0(utc.a, 8.0f), 80.0f, 12.0f), uxf.k), 0.3f), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new js1(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if ((r50 & 64) != 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, dfj dfjVar, Function0 function0, xtc xtcVar, v8j v8jVar, long j2, long j3, of3 of3Var, int i2, int i3) {
        int i4;
        dfj dfjVar2;
        xtc xtcVar2;
        int i5;
        v8j v8jVar2;
        long j4;
        long j5;
        av8 av8Var;
        xtc xtcVar3;
        v8j v8jVar3;
        long j6;
        long j7;
        eqf u2;
        int i6;
        int i7;
        str.getClass();
        dfjVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1374120185);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            dfjVar2 = dfjVar;
            i4 |= av8Var2.g(dfjVar2) ? 32 : 16;
        } else {
            dfjVar2 = dfjVar;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                v8jVar2 = v8jVar;
                i4 |= av8Var2.g(v8jVar2) ? 16384 : 8192;
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        j4 = j2;
                        if (av8Var2.f(j4)) {
                            i7 = 131072;
                            i4 |= i7;
                        }
                    } else {
                        j4 = j2;
                    }
                    i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i7;
                } else {
                    j4 = j2;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        j5 = j3;
                        if (av8Var2.f(j5)) {
                            i6 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i4 |= i6;
                        }
                    } else {
                        j5 = j3;
                    }
                    i6 = 524288;
                    i4 |= i6;
                } else {
                    j5 = j3;
                }
                if (av8Var2.T(i4 & 1, (i4 & 599187) != 599186)) {
                    av8Var2.Y();
                    rq3 rq3Var = null;
                    if ((i2 & 1) == 0 || av8Var2.B()) {
                        if (i8 != 0) {
                            xtcVar2 = utc.a;
                        }
                        if (i5 != 0) {
                            v8jVar2 = null;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = lz.D(R.color.primary_default, av8Var2);
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = lz.D(R.color.primary_default_40, av8Var2);
                            i4 &= -3670017;
                        }
                        v8j v8jVar4 = v8jVar2;
                        long j8 = j5;
                        xtc xtcVar4 = xtcVar2;
                        long j9 = j4;
                        av8Var2.t();
                        Object O = av8Var2.O();
                        a99 a99Var = nf3.a;
                        if (O == a99Var) {
                            O = mz1.e(av8Var2);
                        }
                        wzc wzcVar = (wzc) O;
                        Object O2 = av8Var2.O();
                        if (O2 == a99Var) {
                            O2 = e.f(Boolean.FALSE);
                            av8Var2.n0(O2);
                        }
                        e1d e1dVar = (e1d) O2;
                        Object O3 = av8Var2.O();
                        if (O3 == a99Var) {
                            O3 = new e85(wzcVar, e1dVar, rq3Var, 2);
                            av8Var2.n0(O3);
                        }
                        hz8.o(av8Var2, wzcVar, (Function2) O3);
                        long j10 = ((r13) e.g(new r13(((Boolean) e1dVar.getValue()).booleanValue() ? j8 : j9), av8Var2).getValue()).a;
                        int i9 = i4 << 15;
                        long D = lz.D(R.color.n_lv_4, av8Var2);
                        Object O4 = av8Var2.O();
                        if (O4 == a99Var) {
                            O4 = mz1.e(av8Var2);
                        }
                        wzc wzcVar2 = (wzc) O4;
                        Object[] objArr = new Object[0];
                        Object O5 = av8Var2.O();
                        if (O5 == a99Var) {
                            O5 = fi.p;
                            av8Var2.n0(O5);
                        }
                        xtc y = tol.y(xtcVar4, true, true, false, D, wzcVar2, new gm(function0, (boh) o3a.N(objArr, (Function0) O5, av8Var2, 48), 4), av8Var2, 0);
                        xtcVar3 = xtcVar4;
                        av8Var = av8Var2;
                        udj.c(str, y, j10, null, 0L, null, 0L, v8jVar4, new p7j(3), 0L, 2, false, 1, 0, null, dfjVar2, av8Var, (i4 & 14) | (i9 & 1879048192), ((i4 << 18) & 29360128) | 24960, 109048);
                        j6 = j9;
                        v8jVar3 = v8jVar4;
                        j7 = j8;
                    } else {
                        av8Var2.W();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                    }
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    v8jVar3 = v8jVar2;
                    j6 = j4;
                    j7 = j5;
                }
                u2 = av8Var.u();
                if (u2 != null) {
                    u2.d = new tw2(str, dfjVar, function0, xtcVar3, v8jVar3, j6, j7, i2, i3);
                    return;
                }
                return;
            }
            v8jVar2 = v8jVar;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (av8Var2.T(i4 & 1, (i4 & 599187) != 599186)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        v8jVar2 = v8jVar;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 599187) != 599186)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x044b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i2, final int i3, final or5 or5Var, final boolean z, final boolean z2, final xtc xtcVar, of3 of3Var, final int i4) {
        int i5;
        zg3 zg3Var;
        utc utcVar;
        f50 f50Var;
        ry ryVar;
        lv1 lv1Var;
        f50 f50Var2;
        boolean z3;
        ff3 ff3Var;
        f50 f50Var3;
        f50 f50Var4;
        lv1 lv1Var2 = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1626573616);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.e(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.e(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.e(R.drawable.ic_tv_channel_checkmark) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= av8Var.g(or5Var) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i4) == 0) {
            i5 |= av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i6 = i5;
        if (av8Var.T(i6 & 1, (i6 & 599187) != 599186)) {
            boolean z4 = (or5Var != null ? or5Var.b : null) == null;
            xtc d0 = l98.d0(bkh.d(xtcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var, a2, f50Var5);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var, valueOf, f50Var6);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var7 = hf3.d;
            waa.K(av8Var, C, f50Var7);
            utc utcVar2 = utc.a;
            if (or5Var != null) {
                av8Var.d0(1626248830);
                String v2 = oea.v(z2 ? R.string.ai_forecast_win_probability : R.string.baseball_win_probability, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v2, l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                xtc f0 = l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                l8g a3 = k8g.a(z4 ? ww9.f : ww9.i, lv1Var2, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                av8Var.h0();
                lv1Var = lv1Var2;
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var5);
                waa.K(av8Var, m3, ff3Var2);
                bf3.s(hashCode2, av8Var, f50Var6, av8Var, ryVar2);
                waa.K(av8Var, C2, f50Var7);
                if (z4) {
                    av8Var.d0(-1692887231);
                    td4.J(i2, (i6 & 14) | 48, av8Var, bkh.l(utcVar2, 24.0f));
                    bf3.u(utcVar2, 16.0f, av8Var, false);
                    zg3Var = zg3Var2;
                    utcVar = utcVar2;
                    ff3Var = ff3Var2;
                    f50Var = f50Var5;
                    ryVar = ryVar2;
                    f50Var2 = f50Var7;
                    z3 = false;
                    av8Var = av8Var;
                    f50Var4 = f50Var6;
                } else {
                    av8Var.d0(-1692654917);
                    zg3Var = zg3Var2;
                    ryVar = ryVar2;
                    f50Var2 = f50Var7;
                    utcVar = utcVar2;
                    f50Var = f50Var5;
                    z3 = false;
                    av8Var = av8Var;
                    f50Var4 = f50Var6;
                    ff3Var = ff3Var2;
                    td4.G(i2, bkh.l(utcVar2, 24.0f), false, 0L, av8Var, (i6 & 14) | 48, 12);
                    av8Var.s(false);
                }
                f50 f50Var8 = f50Var4;
                udj.c(yid.r(or5Var.a), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                if (z4) {
                    ljg.r(16.0f, -1692244818, av8Var, av8Var, utcVar);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, bkh.e(utcVar, 24.0f));
                    bf3.u(utcVar, 16.0f, av8Var, z3);
                } else {
                    av8Var.d0(-1691951434);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, bkh.e(utcVar, 24.0f));
                    udj.c(yid.r(or5Var.b.intValue()), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, bkh.e(utcVar, 24.0f));
                    av8Var.s(z3);
                }
                udj.c(yid.r(or5Var.c), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                if (z4) {
                    ljg.r(16.0f, -1691168095, av8Var, av8Var, utcVar);
                    td4.J(i3, ((i6 >> 3) & 14) | 48, av8Var, bkh.l(utcVar, 24.0f));
                    av8Var.s(z3);
                    f50Var3 = f50Var8;
                } else {
                    av8Var.d0(-1690935781);
                    f50Var3 = f50Var8;
                    td4.G(i3, bkh.l(utcVar, 24.0f), false, 0L, av8Var, ((i6 >> 3) & 14) | 48, 12);
                    av8Var.s(z3);
                }
                av8Var.s(true);
                av8Var.s(z3);
            } else {
                zg3Var = zg3Var2;
                utcVar = utcVar2;
                f50Var = f50Var5;
                ryVar = ryVar2;
                lv1Var = lv1Var2;
                f50Var2 = f50Var7;
                z3 = false;
                ff3Var = ff3Var2;
                f50Var3 = f50Var6;
                av8Var.d0(1628995368);
                av8Var.s(false);
            }
            if (z) {
                if ((or5Var != null ? or5Var.d : null) != null) {
                    av8Var.d0(1629087190);
                    xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
                    l8g a4 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, d02);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a4, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var2);
                    kq9.a(haa.t(R.drawable.ic_tv_channel_checkmark, (i6 >> 6) & 14, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.success, av8Var), av8Var, 440, 0);
                    String a5 = or5Var.d.a(av8Var);
                    yf8 yf8Var2 = xth.a;
                    udj.c(a5, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    av8Var.s(true);
                    av8Var.s(z3);
                    if (or5Var == null) {
                        bf3.r(8.0f, 1629792936, av8Var, av8Var, utcVar);
                        av8Var.s(z3);
                    } else {
                        av8Var.d0(1629854440);
                        av8Var.s(z3);
                    }
                    av8Var.s(true);
                }
            }
            av8Var.d0(1629750280);
            av8Var.s(z3);
            if (or5Var == null) {
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: zs5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ktm.d(i2, i3, or5Var, z, z2, xtcVar, (of3) obj, aba.K(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final mte mteVar, final mte mteVar2, final Function1 function1, final Function0 function0, final Integer num, final long j2, final Long l2, final boolean z, final xtc xtcVar, final boolean z2, of3 of3Var, final int i2, final int i3) {
        int i4;
        Long l3;
        boolean z3;
        int i5;
        utc utcVar;
        boolean z4;
        mteVar.getClass();
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-760515100);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(mteVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(mteVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(num) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var.f(j2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            l3 = l2;
            i4 |= av8Var.g(l3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            l3 = l2;
        }
        if ((12582912 & i2) == 0) {
            z3 = z;
            i4 |= av8Var.h(z3) ? 8388608 : 4194304;
        } else {
            z3 = z;
        }
        if ((100663296 & i2) == 0) {
            i4 |= av8Var.g(xtcVar) ? 67108864 : 33554432;
        }
        int i6 = i4 | 805306368;
        if ((i3 & 6) == 0) {
            i5 = i3 | (av8Var.h(z2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (av8Var.T(i6 & 1, ((i6 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            xtc Y = fz8.Y(xtcVar, n9a.a);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            av8Var.d0(2010231384);
            utc utcVar2 = utc.a;
            xtc z5 = n9e.q(bkh.g(bkh.d(utcVar2, 1.0f), 172.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), oyn.e).z(yso.o(utcVar2, 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(8.0f)));
            av8Var.s(false);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, z5);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            p8g p8gVar = p8g.a;
            int i7 = i6 >> 15;
            int i8 = i7 & 896;
            int i9 = i6 >> 3;
            int i10 = i9 & 7168;
            int i11 = (i6 << 6) & 57344;
            int i12 = i9 & 458752;
            int i13 = (i6 << 3) & 3670016;
            int i14 = (i5 << 24) & 234881024;
            tol.d(mteVar, false, z3, num, function1, l3, j2, bkh.c(p8gVar.a(1.0f, utcVar2, true), 1.0f), z2, av8Var, (i6 & 14) | 48 | i8 | i10 | i11 | i12 | i13 | i14);
            if (mteVar2 != null) {
                av8Var.d0(94618201);
                utcVar = utcVar2;
                z4 = true;
                tol.d(mteVar2, true, z, num, function1, l2, j2, bkh.c(p8gVar.a(1.0f, utcVar2, true), 1.0f), z2, av8Var, (i9 & 14) | 48 | i8 | i10 | i11 | i12 | i13 | i14);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                z4 = true;
                av8Var.d0(95186679);
                xw3.e(j2, num != null, function0, l2, bkh.c(p8gVar.a(1.0f, utcVar, true), 1.0f), z2, av8Var, (i7 & 14) | (i9 & 896) | ((i6 >> 9) & 7168) | ((i5 << 15) & 458752));
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(z4);
            kq9.b(s6a.N(R.drawable.ic_bolt, 6, av8Var), null, bkh.p(bkh.c(n12.a.a(utcVar, uxf.g), 1.0f), 26.0f), lz.D(R.color.surface_1, av8Var), av8Var, 48, 0);
            av8Var.s(z4);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: e56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i2 | 1);
                    int K2 = aba.K(i3);
                    ktm.e(mte.this, mteVar2, function1, function0, num, j2, l2, z, xtcVar, z2, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(gv9 gv9Var, rn6 rn6Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2036854973);
        int i3 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.g(rn6Var) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_2, av8Var2), o7g.a(8.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String v2 = oea.v(R.string.fantasy_age_confirmation, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, l98.d0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var2, 48, 384, 126968);
            av8Var2.d0(-1518395303);
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                rn6 rn6Var2 = (rn6) it.next();
                arrayList.add(new vt2(rn6Var2, rn6Var2.b.a(av8Var2), false, null, null, null, null, 252));
            }
            av8Var2.s(false);
            trh.a(l6g.W(arrayList), rn6Var, function1, null, null, new t3e(16.0f, 8.0f, 16.0f, 8.0f), jrh.m, false, false, false, null, null, av8Var2, (i3 & 112) | 1769472 | (i3 & 896), 3992);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 16, gv9Var, rn6Var, function1, xtcVar);
        }
    }

    public static final void g(int i2, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        av8 av8Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-832350766);
        int i3 = i2 | (av8Var2.h(z) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            xtc q2 = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_P, av8Var2), oyn.e);
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new ve7(0, function0);
                av8Var2.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 16.0f, 8.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String v2 = oea.v(z ? R.string.show_less : R.string.show_more, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
            av8Var = av8Var2;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            kq9.a(haa.t(R.drawable.ic_chevron_down, 0, av8Var), null, haa.v(bkh.l(utcVar, 16.0f), z ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), lz.D(R.color.primary_default, av8Var), av8Var, 56, 0);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new s27(i2, 1, xtcVar, function0, z);
        }
    }

    public static final void h(f27 f27Var, Function1 function1, of3 of3Var, int i2) {
        Function1 function12;
        int i3;
        String str;
        e1d e1dVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2083952218);
        int i4 = 2;
        int i5 = i2 | (av8Var.g(f27Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        int i6 = 0;
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            n29 a2 = r29.a(av8Var);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            Object obj2 = (ku3) O;
            Object O2 = av8Var.O();
            rq3 rq3Var = null;
            if (O2 == obj) {
                O2 = e.f(null);
                av8Var.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar3 = (e1d) O3;
            Unit unit = Unit.a;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = new fw6(i4, e1dVar2);
                av8Var.n0(O4);
            }
            hz8.d(unit, (Function1) O4, av8Var);
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = new c27(e1dVar3, rq3Var, i6);
                av8Var.n0(O5);
            }
            hz8.o(av8Var, unit, (Function2) O5);
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str2 = f27Var.b;
            ev6 ev6Var = f27Var.d;
            j67 j67Var = f27Var.c;
            boolean z = f27Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = j67Var.b;
            String str4 = str2;
            boolean booleanValue = ((Boolean) e1dVar3.getValue()).booleanValue();
            boolean i7 = av8Var.i(obj2) | av8Var.i(a2);
            Object O6 = av8Var.O();
            if (i7 || O6 == obj) {
                str = str3;
                O6 = new mi(26, obj2, a2, e1dVar2);
                av8Var.n0(O6);
            } else {
                str = str3;
            }
            xtc b0 = k53.b0(utcVar, a2, (Function0) O6, booleanValue, 4);
            Object O7 = av8Var.O();
            if (O7 == obj) {
                O7 = new au6(17);
                av8Var.n0(O7);
            }
            dy0.e(str4, str, ev6Var, false, false, (Function0) O7, b0, av8Var, 224256, 0);
            String str5 = f27Var.b;
            if (str5 == null) {
                str5 = "";
            }
            boolean z2 = z || !((Boolean) e1dVar3.getValue()).booleanValue();
            String str6 = j67Var.b;
            int i8 = i5 & 112;
            boolean z3 = i8 == 32;
            Object O8 = av8Var.O();
            if (z3 || O8 == obj) {
                O8 = new rt6(10, function1);
                av8Var.n0(O8);
            }
            dy0.e(str5, str6, ev6Var, z2, true, (Function0) O8, null, av8Var, 24576, 64);
            bf3.t(av8Var, true, utcVar, 32.0f, av8Var);
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            p8g p8gVar = p8g.a;
            xtc a5 = p8gVar.a(1.0f, utcVar, true);
            String v2 = oea.v(R.string.fantasy_share, av8Var);
            ImageVector N = s6a.N(R.drawable.ic_menu_list_share, 6, av8Var);
            boolean z4 = false;
            long D = lz.D(R.color.primary_default, av8Var);
            boolean z5 = (z || ((Bitmap) e1dVar2.getValue()) == null) ? false : true;
            boolean z6 = ((i5 & 14) == 4) | (i8 == 32);
            Object O9 = av8Var.O();
            if (z6 || O9 == obj) {
                function12 = function1;
                e1dVar = e1dVar2;
                O9 = new mi(27, function12, f27Var, e1dVar);
                av8Var.n0(O9);
            } else {
                function12 = function1;
                e1dVar = e1dVar2;
            }
            s02.a(v2, N, (Function0) O9, D, a5, z5, av8Var, 0);
            xtc a6 = p8gVar.a(1.0f, utcVar, true);
            String v3 = oea.v(R.string.fantasy_download_image, av8Var);
            ImageVector N2 = s6a.N(R.drawable.ic_download, 6, av8Var);
            long D2 = lz.D(R.color.primary_default, av8Var);
            boolean z7 = (z || ((Bitmap) e1dVar.getValue()) == null) ? false : true;
            boolean z8 = i8 == 32;
            Object O10 = av8Var.O();
            if (z8 || O10 == obj) {
                O10 = new s91(function12, e1dVar, 4);
                av8Var.n0(O10);
            }
            s02.a(v3, N2, (Function0) O10, D2, a6, z7, av8Var, 0);
            xtc a7 = p8gVar.a(1.0f, utcVar, true);
            String v4 = oea.v(R.string.fantasy_copy_code, av8Var);
            ImageVector N3 = s6a.N(R.drawable.ic_content_copy_16, 6, av8Var);
            long D3 = lz.D(R.color.primary_default, av8Var);
            boolean z9 = !z;
            if (i8 == 32) {
                z4 = true;
            }
            Object O11 = av8Var.O();
            if (z4 || O11 == obj) {
                O11 = new rt6(11, function12);
                av8Var.n0(O11);
            }
            s02.a(v4, N3, (Function0) O11, D3, a7, z9, av8Var, 0);
            i3 = 1;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            function12 = function1;
            i3 = 1;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new kz6(f27Var, function12, i2, i3);
        }
    }

    public static final void i(h27 h27Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1085838656);
        int i3 = 4;
        int i4 = (av8Var.i(h27Var) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            f27 f27Var = (f27) ((eoh) h27Var.f).getValue();
            boolean i5 = av8Var.i(h27Var) | av8Var.i(context) | av8Var.i(ku3Var);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new dr6(h27Var, ku3Var, context, i3);
                av8Var.n0(O2);
            }
            h(f27Var, (Function1) O2, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new jo6(h27Var, i2, 18);
        }
    }

    public static final void j(j67 j67Var, ev6 ev6Var, c47 c47Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(757978592);
        int i3 = i2 | (av8Var.g(j67Var) ? 4 : 2) | (av8Var.g(ev6Var) ? 32 : 16) | (av8Var.g(c47Var) ? 256 : 128) | (av8Var.i(function1) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            g28 g28Var = bkh.c;
            t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 48.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new l50(13, c47Var, j67Var, ev6Var, function1);
                av8Var.n0(O);
            }
            v8a.a(g28Var, null, t3eVar, ng0Var, null, null, false, null, (Function1) O, av8Var, 24582, 490);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 21, j67Var, ev6Var, c47Var, function1);
        }
    }

    public static final void k(final d47 d47Var, j37 j37Var, of3 of3Var, int i2) {
        e1d e1dVar = d47Var.h;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1907069090);
        int i3 = 4;
        int i4 = (av8Var.i(d47Var) ? 4 : 2) | i2 | (av8Var.i(j37Var) ? 32 : 16);
        final int i5 = 0;
        final int i6 = 1;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            final Context context = (Context) av8Var.k(nz.b);
            e1d x2 = rfo.x(j37Var.k, av8Var, 0);
            nn2 nn2Var = d47Var.j;
            boolean i7 = av8Var.i(context) | av8Var.i(d47Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i7 || O == a99Var) {
                O = new Function1() { // from class: a47
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i5) {
                            case 0:
                                w37 w37Var = (w37) obj;
                                w37Var.getClass();
                                if (!w37Var.equals(w37.a)) {
                                    zzl.b();
                                    break;
                                } else {
                                    FragmentActivity O2 = hkg.O(context);
                                    if (O2 != null) {
                                        Intent intent = new Intent();
                                        intent.putExtra("FANTASY_LEAGUE_ID_EXTRA", d47Var.g.a);
                                        Unit unit = Unit.a;
                                        z8e.C(O2, 111, intent);
                                    }
                                    break;
                                }
                            default:
                                v37 v37Var = (v37) obj;
                                v37Var.getClass();
                                boolean equals = v37Var.equals(u37.a);
                                Context context2 = context;
                                d47 d47Var2 = d47Var;
                                if (!equals) {
                                    if (!v37Var.equals(t37.a)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        zic.P(context2, R.string.fantasy_leave_league_title, R.string.fantasy_leave_league_text, R.string.fantasy_leave_league_button, new av6(0, d47Var2, d47.class, "leaveLeague", "leaveLeague()V", 0, 9), 32);
                                    }
                                } else {
                                    FragmentActivity O3 = hkg.O(context2);
                                    if (O3 != null) {
                                        j67 j67Var = d47Var2.g;
                                        int i8 = d47Var2.f.c;
                                        j67Var.getClass();
                                        FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = new FantasyLeagueTeamsFullScreenDialog();
                                        fantasyLeagueTeamsFullScreenDialog.setArguments(fz8.C(fz8.G("FANTASY_LEAGUE_EXTRA", j67Var), fz8.D(i8, "competitionId")));
                                        fantasyLeagueTeamsFullScreenDialog.p(O3.k(), "TeamsModal");
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O);
            }
            w1a.c(nn2Var, null, (Function1) O, av8Var, 0, 14);
            k53.N(((c47) ((eoh) e1dVar).getValue()).b, null, av8Var, 0);
            j67 j67Var = (j67) x2.getValue();
            ev6 ev6Var = d47Var.f;
            c47 c47Var = (c47) ((eoh) e1dVar).getValue();
            boolean i8 = av8Var.i(context) | av8Var.i(d47Var);
            Object O2 = av8Var.O();
            if (i8 || O2 == a99Var) {
                O2 = new Function1() { // from class: a47
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i6) {
                            case 0:
                                w37 w37Var = (w37) obj;
                                w37Var.getClass();
                                if (!w37Var.equals(w37.a)) {
                                    zzl.b();
                                    break;
                                } else {
                                    FragmentActivity O22 = hkg.O(context);
                                    if (O22 != null) {
                                        Intent intent = new Intent();
                                        intent.putExtra("FANTASY_LEAGUE_ID_EXTRA", d47Var.g.a);
                                        Unit unit = Unit.a;
                                        z8e.C(O22, 111, intent);
                                    }
                                    break;
                                }
                            default:
                                v37 v37Var = (v37) obj;
                                v37Var.getClass();
                                boolean equals = v37Var.equals(u37.a);
                                Context context2 = context;
                                d47 d47Var2 = d47Var;
                                if (!equals) {
                                    if (!v37Var.equals(t37.a)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        zic.P(context2, R.string.fantasy_leave_league_title, R.string.fantasy_leave_league_text, R.string.fantasy_leave_league_button, new av6(0, d47Var2, d47.class, "leaveLeague", "leaveLeague()V", 0, 9), 32);
                                    }
                                } else {
                                    FragmentActivity O3 = hkg.O(context2);
                                    if (O3 != null) {
                                        j67 j67Var2 = d47Var2.g;
                                        int i82 = d47Var2.f.c;
                                        j67Var2.getClass();
                                        FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = new FantasyLeagueTeamsFullScreenDialog();
                                        fantasyLeagueTeamsFullScreenDialog.setArguments(fz8.C(fz8.G("FANTASY_LEAGUE_EXTRA", j67Var2), fz8.D(i82, "competitionId")));
                                        fantasyLeagueTeamsFullScreenDialog.p(O3.k(), "TeamsModal");
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O2);
            }
            j(j67Var, ev6Var, c47Var, (Function1) O2, av8Var, 0);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new kz6(d47Var, j37Var, i2, i3);
        }
    }

    public static final void l(gv9 gv9Var, gv9 gv9Var2, Function0 function0, Function0 function02, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1592621576);
        int i3 = i2 | (av8Var.i(gv9Var) ? 4 : 2) | (av8Var.i(gv9Var2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(22214010, av8Var, new o87(gv9Var2, function0, gv9Var, z, function02, function1)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new rc7(gv9Var, gv9Var2, function0, function02, function1, z, xtcVar, i2);
        }
    }

    public static final void m(String str, d7e d7eVar, xtc xtcVar, of3 of3Var, int i2) {
        str.getClass();
        d7eVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(595930761);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.i(d7eVar) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_P, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            long j2 = r13.i;
            utc utcVar = utc.a;
            kq9.a(d7eVar, null, bkh.l(utcVar, 96.0f), j2, av8Var, 3512 | ((i3 >> 3) & 14), 0);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, i3 & 14, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(str, d7eVar, xtcVar, i2, 14);
        }
    }

    public static final void n(int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(110253666);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i2 | (av8Var.g(xtcVar2) ? 4 : 2);
        }
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc xtcVar3 = i5 != 0 ? utcVar : xtcVar2;
            kg0 kg0Var = ww9.f;
            xtc c0 = l98.c0(bkh.d(xtcVar3, 1.0f), 16.0f, 4.0f);
            l8g a2 = k8g.a(kg0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc xtcVar4 = xtcVar3;
            goa goaVar = new goa(1.0f, true);
            String v2 = oea.v(R.string.statistics, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, goaVar, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            udj.c(oea.v(R.string.value_short, av8Var), bkh.p(utcVar, 40.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 109560);
            nq8.h(av8Var, bkh.p(utcVar, 24.0f));
            udj.c("Pts", bkh.p(utcVar, 32.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 54, 24960, 109560);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new xz(xtcVar2, i2, i3, 7);
        }
    }

    public static final void o(final int i2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function0 function0, xtc xtcVar, of3 of3Var, final int i3, final int i4) {
        xtc xtcVar2;
        int i5;
        final xtc xtcVar3;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1953125171);
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z3) ? a.o : 1024) | (av8Var.h(z4) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i7 = i4 & 64;
        if (i7 != 0) {
            i5 = i6 | 1572864;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var.k(nz.b);
            kg0 kg0Var = ww9.h;
            lv1 lv1Var = uxf.m;
            xtc q2 = n9e.q(wnn.A(bkh.d(xtcVar4, 1.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.h;
                av8Var.n0(O2);
            }
            boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var, 48);
            xtc xtcVar5 = xtcVar4;
            xtc c0 = l98.c0(tol.y(q2, true, true, true, D, wzcVar, new gm(function0, bohVar, 25), av8Var, 0), 8.0f, 16.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String v2 = oea.v(R.string.total_points, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            av8 av8Var2 = av8Var;
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
            av8Var2.s(true);
            if (z) {
                av8Var2.d0(2066207068);
                udj.c(oea.v(z2 ? R.string.fantasy_captain_x3 : R.string.fantasy_captain_x2, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            } else {
                av8Var2.d0(2066619337);
                av8Var2.s(false);
            }
            av8Var2.s(true);
            context.getClass();
            String valueOf2 = String.valueOf(i2);
            valueOf2.getClass();
            String string = context.getString(R.string.n_points, valueOf2);
            string.getClass();
            av8 av8Var3 = av8Var2;
            udj.c(string, null, z3 ? ljg.f(av8Var2, 983061848, R.color.live, av8Var2, false) : ljg.f(av8Var2, 983062328, R.color.n_lv_1, av8Var2, false), null, 0L, null, 0L, z4 ? v8j.d : v8j.b, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var3, 0, 24960, 110074);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, z, z2, z3, z4, function0, xtcVar3, i3, i4) { // from class: ue7
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ xtc g;
                public final /* synthetic */ int h;

                {
                    this.h = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    ktm.o(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K, this.h);
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(ao7 ao7Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ao7Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(574606895);
        int i3 = 4;
        int i4 = i2 | (av8Var.i(ao7Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            e1d x2 = rfo.x(ao7Var.o, av8Var, 0);
            boolean z = ((vn7) x2.getValue()).n != null;
            boolean i6 = av8Var.i(ao7Var);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new sn7(ao7Var, i5);
                av8Var.n0(O);
            }
            un0.f(z, (Function0) O, false, false, yqo.H(808328030, av8Var, new kz6(20, x2, ao7Var)), av8Var, 24576, 12);
            long j2 = r13.h;
            tc3 H = yqo.H(957341172, av8Var, new uu6(function0, x2, ao7Var));
            tc3 H2 = yqo.H(-26146626, av8Var, new hl6(i3, ao7Var, x2));
            xtcVar2 = utc.a;
            q5a.p(xtcVar2, null, H, null, null, 0, j2, 0L, null, H2, av8Var, 806879622, 442);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(ao7Var, function0, xtcVar2, i2, 19);
        }
    }

    public static final void q(o68 o68Var, xtc xtcVar, of3 of3Var, int i2) {
        long j2;
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1916410025);
        int i3 = (av8Var.e(o68Var == null ? -1 : o68Var.ordinal()) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            mv1 mv1Var = uxf.g;
            n7g n7gVar = o7g.a;
            r13 r13Var = null;
            Integer valueOf = o68Var != null ? Integer.valueOf(o68Var.a) : null;
            if (valueOf == null) {
                av8Var.d0(1229461713);
                av8Var.s(false);
            } else {
                r13Var = new r13(wv8.b(av8Var, 1229461714, valueOf, av8Var, false));
            }
            if (r13Var == null) {
                j2 = ljg.f(av8Var, 870944964, R.color.rating_00, av8Var, false);
            } else {
                av8Var.d0(870943600);
                av8Var.s(false);
                j2 = r13Var.a;
            }
            utc utcVar = utc.a;
            xtc l2 = bkh.l(n9e.q(utcVar, j2, n7gVar), 24.0f);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, l2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (o68Var == null || (str = String.valueOf(o68Var.ordinal() + 1)) == null) {
                str = "-";
            }
            String str2 = str;
            yf8 yf8Var = xth.a;
            fqj.a(str2, xth.l(), lz.D(R.color.surface_1, av8Var), null, null, av8Var, 0, 24);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new kz6(o68Var, xtcVar, i2, 22);
        }
    }

    public static final void r(qnb qnbVar, boolean z, of3 of3Var, int i2) {
        av8 av8Var;
        xtc u0;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1673682403);
        int i3 = (av8Var2.g(qnbVar) ? 4 : 2) | i2 | (av8Var2.h(z) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            if (z) {
                av8Var2.d0(397265624);
                av8Var2.s(false);
                u0 = bkh.d(utcVar, 1.0f);
            } else {
                av8Var2.d0(397312217);
                u0 = hkg.u0(bkh.c, hkg.o0(av8Var2), false, 14);
                av8Var2.s(false);
            }
            xtc xtcVar = u0;
            if (Intrinsics.c(qnbVar, nnb.a)) {
                av8Var2.d0(397484670);
                av8Var = av8Var2;
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 62, 0L, 0L, av8Var, xtcVar);
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                if (Intrinsics.c(qnbVar, onb.a)) {
                    av8Var.d0(397594007);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C = fqj.C(av8Var, xtcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, hf3.g);
                    waa.K(av8Var, m2, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    gz8.j(n12.a.a(utcVar, uxf.d), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, av8Var, 0, 30);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    if (!Intrinsics.c(qnbVar, pnb.a)) {
                        throw dmi.h(av8Var, 2091030430, false);
                    }
                    av8Var.d0(397833451);
                    e12.a(0, av8Var, xtcVar);
                    av8Var.s(false);
                }
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new m81(i2, 10, qnbVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final vnb vnbVar, final Function0 function0, final boolean z, xtc xtcVar, xhf xhfVar, float f2, qnb qnbVar, ct8 ct8Var, final tc3 tc3Var, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        float f3;
        int i6;
        int i7;
        final ct8 ct8Var2;
        final qnb qnbVar2;
        final xtc xtcVar3;
        av8 av8Var;
        final float f4;
        final xhf xhfVar2;
        eqf u2;
        qnb qnbVar3;
        int i8;
        xtc xtcVar4;
        xhf xhfVar3;
        float f5;
        ct8 H;
        qnb qnbVar4 = qnbVar;
        vnbVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(157913501);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(vnbVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            if ((i2 & 24576) == 0) {
                i4 |= 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                f3 = f2;
                i4 |= av8Var2.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i6 = i3 & 64;
                int i10 = 1572864;
                if (i6 == 0) {
                    if ((1572864 & i2) == 0) {
                        i10 = (2097152 & i2) == 0 ? av8Var2.g(qnbVar4) : av8Var2.i(qnbVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i7 = i4 | 12582912;
                    if ((100663296 & i2) == 0) {
                        i7 |= av8Var2.i(tc3Var) ? 67108864 : 33554432;
                    }
                    int i11 = 1;
                    if (av8Var2.T(i7 & 1, (38347923 & i7) == 38347922)) {
                        av8Var2.W();
                        ct8Var2 = ct8Var;
                        qnbVar2 = qnbVar4;
                        xtcVar3 = xtcVar2;
                        av8Var = av8Var2;
                        f4 = f3;
                        xhfVar2 = xhfVar;
                    } else {
                        av8Var2.Y();
                        if ((i2 & 1) == 0 || av8Var2.B()) {
                            xtc xtcVar5 = i9 != 0 ? utc.a : xtcVar2;
                            xhf J = x2a.J(av8Var2);
                            int i12 = i7 & (-57345);
                            float f6 = i5 != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f3;
                            if (i6 != 0) {
                                qnbVar4 = nnb.a;
                            }
                            qnbVar3 = qnbVar4;
                            i8 = i12;
                            xtcVar4 = xtcVar5;
                            xhfVar3 = J;
                            f5 = f6;
                            H = yqo.H(-2114866762, av8Var2, new j30(i11, function0, z));
                        } else {
                            av8Var2.W();
                            H = ct8Var;
                            qnbVar3 = qnbVar4;
                            i8 = i7 & (-57345);
                            f5 = f3;
                            xhfVar3 = xhfVar;
                            xtcVar4 = xtcVar2;
                        }
                        av8Var2.t();
                        b0a.s(z, function0, kda.O(kda.w(xtcVar4), "refresh_layout", av8Var2), xhfVar3, f5, yqo.H(-1948478080, av8Var2, new er6(vnbVar, qnbVar3, H, tc3Var, 20)), av8Var2, ((i8 >> 3) & 57344) | ((i8 >> 6) & 14) | 196608 | (i8 & 112), 0);
                        xhfVar2 = xhfVar3;
                        av8Var = av8Var2;
                        qnbVar2 = qnbVar3;
                        ct8Var2 = H;
                        f4 = f5;
                        xtcVar3 = xtcVar4;
                    }
                    u2 = av8Var.u();
                    if (u2 == null) {
                        u2.d = new Function2() { // from class: rnb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ktm.s(vnb.this, function0, z, xtcVar3, xhfVar2, f4, qnbVar2, ct8Var2, tc3Var, (of3) obj, aba.K(i2 | 1), i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i4 |= i10;
                i7 = i4 | 12582912;
                if ((100663296 & i2) == 0) {
                }
                int i112 = 1;
                if (av8Var2.T(i7 & 1, (38347923 & i7) == 38347922)) {
                }
                u2 = av8Var.u();
                if (u2 == null) {
                }
            }
            f3 = f2;
            i6 = i3 & 64;
            int i102 = 1572864;
            if (i6 == 0) {
            }
            i4 |= i102;
            i7 = i4 | 12582912;
            if ((100663296 & i2) == 0) {
            }
            int i1122 = 1;
            if (av8Var2.T(i7 & 1, (38347923 & i7) == 38347922)) {
            }
            u2 = av8Var.u();
            if (u2 == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i2 & 24576) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i3 & 64;
        int i1022 = 1572864;
        if (i6 == 0) {
        }
        i4 |= i1022;
        i7 = i4 | 12582912;
        if ((100663296 & i2) == 0) {
        }
        int i11222 = 1;
        if (av8Var2.T(i7 & 1, (38347923 & i7) == 38347922)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(vnb vnbVar, xtc xtcVar, boolean z, qnb qnbVar, ct8 ct8Var, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ct8 ct8Var2;
        tc3 tc3Var2;
        xtc xtcVar3;
        boolean z3;
        ct8 ct8Var3;
        eqf u2;
        qnb qnbVar2 = qnbVar;
        vnbVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2063416396);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(vnbVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= (i2 & 4096) == 0 ? av8Var.g(qnbVar2) : av8Var.i(qnbVar2) ? a.o : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    ct8Var2 = ct8Var;
                    i4 |= av8Var.i(ct8Var2) ? 16384 : 8192;
                    if ((196608 & i2) != 0) {
                        tc3Var2 = tc3Var;
                        i4 |= av8Var.i(tc3Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    } else {
                        tc3Var2 = tc3Var;
                    }
                    if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        z3 = z2;
                        ct8Var3 = ct8Var2;
                    } else {
                        utc utcVar = utc.a;
                        if (i8 != 0) {
                            xtcVar2 = utcVar;
                        }
                        boolean z4 = i5 == 0 ? z2 : false;
                        if (i6 != 0) {
                            qnbVar2 = nnb.a;
                        }
                        ct8 H = i7 != 0 ? yqo.H(951208699, av8Var, new cv5(z4, 6)) : ct8Var2;
                        xtc w2 = kda.w(xtcVar2);
                        if (z4) {
                            w2 = w2.z(gz8.x(utcVar, null, null, 3));
                        }
                        xtc xtcVar4 = w2;
                        Object O = av8Var.O();
                        int i9 = 14;
                        if (O == nf3.a) {
                            O = new abb(i9);
                            av8Var.n0(O);
                        }
                        boolean z5 = z4;
                        wkn.a(vnbVar, xtcVar4, null, (Function1) O, yqo.H(-721913806, av8Var, new a93(qnbVar2, z5, H, tc3Var2, 5)), av8Var, (i4 & 14) | 27648, 4);
                        xtcVar3 = xtcVar2;
                        z3 = z5;
                        ct8Var3 = H;
                    }
                    qnb qnbVar3 = qnbVar2;
                    u2 = av8Var.u();
                    if (u2 == null) {
                        u2.d = new vr5(vnbVar, xtcVar3, z3, qnbVar3, ct8Var3, tc3Var, i2, i3, 4);
                        return;
                    }
                    return;
                }
                ct8Var2 = ct8Var;
                if ((196608 & i2) != 0) {
                }
                if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                }
                qnb qnbVar32 = qnbVar2;
                u2 = av8Var.u();
                if (u2 == null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            ct8Var2 = ct8Var;
            if ((196608 & i2) != 0) {
            }
            if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
            }
            qnb qnbVar322 = qnbVar2;
            u2 = av8Var.u();
            if (u2 == null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        ct8Var2 = ct8Var;
        if ((196608 & i2) != 0) {
        }
        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        qnb qnbVar3222 = qnbVar2;
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final double u(int i2, int i3, int i4, int i5, int i6) {
        double d2 = i4 / i2;
        double d3 = i5 / i3;
        int C = wt3.C(i6);
        if (C == 0) {
            return Math.max(d2, d3);
        }
        if (C == 1) {
            return Math.min(d2, d3);
        }
        zzl.b();
        return 0.0d;
    }

    public static final FootballTeamSeasonStatistics v(c73 c73Var) {
        d73 d73Var = c73Var.c;
        TeamSeasonStatistics teamSeasonStatistics = d73Var != null ? d73Var.g : null;
        if (teamSeasonStatistics instanceof FootballTeamSeasonStatistics) {
            return (FootballTeamSeasonStatistics) teamSeasonStatistics;
        }
        return null;
    }

    public static boolean w() {
        try {
            if (xy.N0 == null) {
                xy.N0 = Class.forName("android.os.SystemProperties");
            }
            Method method = xy.O0;
            if (method == null) {
                Class cls = xy.N0;
                method = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                xy.O0 = method;
            }
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.c(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static vnj x(Context context, String str, String str2, TopPlayersStatisticsItem topPlayersStatisticsItem, boolean z) {
        znj znjVar;
        if (!topPlayersStatisticsItem.getPlayedEnough()) {
            return null;
        }
        int id = topPlayersStatisticsItem.getPlayer().getId();
        String t2 = tba.t(topPlayersStatisticsItem.getPlayer());
        String position = topPlayersStatisticsItem.getPlayer().getPosition();
        Gender gender = topPlayersStatisticsItem.getPlayer().getGender();
        umj umjVar = new umj(str, str2);
        Team team = topPlayersStatisticsItem.getTeam();
        if (team != null) {
            if (!z) {
                team = null;
            }
            if (team != null) {
                int id2 = team.getId();
                String p2 = tba.p(context, team);
                Country country = team.getCountry();
                znjVar = new znj(id2, null, Integer.valueOf(team.getType()), p2, country != null ? country.getAlpha2() : null);
                return new vnj(new unj(id, t2, position, gender, umjVar, znjVar, topPlayersStatisticsItem.getPlayedEnough(), null));
            }
        }
        znjVar = null;
        return new vnj(new unj(id, t2, position, gender, umjVar, znjVar, topPlayersStatisticsItem.getPlayedEnough(), null));
    }

    public static int y(ArrayList arrayList, InputStream inputStream, kn4 kn4Var) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new uqf(inputStream, kn4Var);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    int b2 = ((ds9) arrayList.get(i2)).b(inputStream, kn4Var);
                    if (b2 != -1) {
                        return b2;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType z(ArrayList arrayList, InputStream inputStream, kn4 kn4Var) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new uqf(inputStream, kn4Var);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType f2 = ((ds9) arrayList.get(i2)).f(inputStream);
                inputStream.reset();
                if (f2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return f2;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
