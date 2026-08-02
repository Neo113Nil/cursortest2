package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qb3 implements mqg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mqg
    public final Bundle a() {
        fp8 k;
        Pair[] pairArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ComponentActivity.e((ComponentActivity) obj);
            case 1:
                Map e = ((tpg) obj).e();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : e.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i2 = FragmentActivity.g;
                do {
                    k = fragmentActivity.k();
                    e6b e6bVar = e6b.a;
                } while (FragmentActivity.l(k));
                fragmentActivity.c.g(d6b.ON_STOP);
                return new Bundle();
            case 3:
                return ((s) obj).d0();
            case 4:
                Bundle f = ((k7d) obj).f();
                if (f != null) {
                    return f;
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            case 5:
                int i3 = ((NavHostFragment) obj).c;
                if (i3 != 0) {
                    return hz8.E(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i3)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                bundle3.getClass();
                return bundle3;
            default:
                p03 p03Var = (p03) obj;
                for (Map.Entry entry2 : tub.p((LinkedHashMap) p03Var.e).entrySet()) {
                    p03Var.y(((fdi) ((f1d) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : tub.p((LinkedHashMap) p03Var.c).entrySet()) {
                    p03Var.y(((mqg) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) p03Var.b;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return hz8.E((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
