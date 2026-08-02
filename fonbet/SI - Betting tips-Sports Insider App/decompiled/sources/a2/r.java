package a2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import hg.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import y1.f0;
import y1.t0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements q2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62b;

    public /* synthetic */ r(int i5, Object obj) {
        this.f61a = i5;
        this.f62b = obj;
    }

    @Override // q2.c
    public final Bundle a() {
        Bundle source;
        Pair[] pairArr;
        int i5 = this.f61a;
        Object obj = this.f62b;
        switch (i5) {
            case 0:
                f0 f0Var = (f0) obj;
                b2.j jVar = f0Var.f25625b;
                LinkedHashMap linkedHashMap = jVar.f2996l;
                kotlin.collections.l lVar = jVar.f2991f;
                LinkedHashMap linkedHashMap2 = jVar.f2995k;
                ArrayList arrayList = new ArrayList();
                n0.c().getClass();
                Bundle source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source2, "source");
                for (Map.Entry entry : n0.i(jVar.f3001r.f25639a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle h10 = ((t0) entry.getValue()).h();
                    if (h10 != null) {
                        arrayList.add(str);
                        Intrinsics.checkNotNullParameter(source2, "source");
                        h8.b.x(source2, str, h10);
                    }
                }
                if (arrayList.isEmpty()) {
                    source = null;
                } else {
                    n0.c().getClass();
                    source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(source2, "source");
                    h8.b.y(source2, "android-support-nav:controller:navigatorState:names", arrayList);
                    h8.b.x(source, "android-support-nav:controller:navigatorState", source2);
                }
                if (!lVar.isEmpty()) {
                    if (source == null) {
                        n0.c().getClass();
                        source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    ArrayList<? extends Parcelable> value = new ArrayList<>();
                    Iterator<E> it = lVar.iterator();
                    while (it.hasNext()) {
                        value.add(new y1.m((y1.l) it.next()).b());
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(value, "<this>");
                    source.putParcelableArrayList("android-support-nav:controller:backStack", value);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (source == null) {
                        n0.c().getClass();
                        source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    int[] value2 = new int[linkedHashMap2.size()];
                    ArrayList arrayList2 = new ArrayList();
                    int i10 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i11 = i10 + 1;
                        value2[i10] = intValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList2.add(str2);
                        i10 = i11;
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    source.putIntArray("android-support-nav:controller:backStackDestIds", value2);
                    h8.b.y(source, "android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (source == null) {
                        n0.c().getClass();
                        source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        kotlin.collections.l lVar2 = (kotlin.collections.l) entry3.getValue();
                        arrayList3.add(str3);
                        ArrayList<? extends Parcelable> value3 = new ArrayList<>();
                        Iterator it2 = lVar2.iterator();
                        while (it2.hasNext()) {
                            value3.add(((y1.m) it2.next()).b());
                        }
                        Intrinsics.checkNotNullParameter(source, "source");
                        String key = "android-support-nav:controller:backStackStates:" + str3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        Intrinsics.checkNotNullParameter(value3, "<this>");
                        source.putParcelableArrayList(key, value3);
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    h8.b.y(source, "android-support-nav:controller:backStackStates", arrayList3);
                }
                if (f0Var.f25628e) {
                    if (source == null) {
                        n0.c().getClass();
                        source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    boolean z5 = f0Var.f25628e;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkHandled", "key");
                    source.putBoolean("android-support-nav:controller:deepLinkHandled", z5);
                }
                if (source != null) {
                    return source;
                }
                Bundle EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                return EMPTY;
            case 1:
                int i12 = ((NavHostFragment) obj).f2266c;
                if (i12 != 0) {
                    return a.a.b(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i12)));
                }
                Bundle bundle = Bundle.EMPTY;
                Intrinsics.checkNotNull(bundle);
                return bundle;
            case 2:
                Bundle outState = new Bundle();
                e.i iVar = ((e.j) obj).f8424i;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(outState, "outState");
                LinkedHashMap linkedHashMap3 = iVar.f9641b;
                outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap3.values()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap3.keySet()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f9643d));
                outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f9646g));
                return outState;
            default:
                c4.d dVar = (c4.d) obj;
                for (Map.Entry entry4 : n0.i((LinkedHashMap) dVar.f3580e).entrySet()) {
                    dVar.p(((d1) ((hg.n0) entry4.getValue())).getValue(), (String) entry4.getKey());
                }
                for (Map.Entry entry5 : n0.i((LinkedHashMap) dVar.f3578c).entrySet()) {
                    dVar.p(((q2.c) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) dVar.f3577b;
                if (linkedHashMap4.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                        arrayList4.add(new Pair((String) entry6.getKey(), entry6.getValue()));
                    }
                    pairArr = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                Bundle source3 = a.a.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source3, "source");
                return source3;
        }
    }
}
