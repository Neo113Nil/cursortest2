package jc0;

import Tc.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jc0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7339b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final j f69674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final j f69675b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final j f69676c;

    /* renamed from: d, reason: collision with root package name */
    private static String f69677d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f69678e = 0;

    static {
        Xc.a<Fb0.e> f7 = Fb0.e.f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f7) {
            if (((Fb0.e) obj).n()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        j builder = new j();
        List list3 = list2;
        ArrayList arrayList3 = new ArrayList(C7714v.z(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fb0.e) it.next()).j());
        }
        builder.addAll(arrayList3);
        builder.add("ozon.kz");
        builder.add("ozon.by");
        builder.add("ozon.com");
        builder.add("ozon.uz");
        Intrinsics.checkNotNullParameter(builder, "builder");
        f69674a = builder.b();
        j builder2 = new j();
        List list4 = list;
        ArrayList arrayList4 = new ArrayList(C7714v.z(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Fb0.e) it2.next()).j());
        }
        builder2.addAll(arrayList4);
        builder2.add("ozoncom.me");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        j b11 = builder2.b();
        f69675b = b11;
        j builder3 = new j();
        builder3.addAll(f69674a);
        builder3.addAll(b11);
        builder3.add("ozone.ru");
        builder3.add("ozonpartners.ru");
        builder3.add("finance.ozon.ru");
        builder3.add("finance.ozonru.me");
        Intrinsics.checkNotNullParameter(builder3, "builder");
        f69676c = builder3.b();
    }

    @NotNull
    public static j a() {
        return f69676c;
    }

    @NotNull
    public static j b() {
        return f69674a;
    }

    @NotNull
    public static j c() {
        return f69675b;
    }

    public static String d() {
        return f69677d;
    }

    public static void e(String str) {
        f69677d = str;
    }
}
