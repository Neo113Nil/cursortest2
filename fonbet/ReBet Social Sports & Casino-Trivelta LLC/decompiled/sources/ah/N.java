package ah;

import ch.AbstractC2922B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class N {

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f15973d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = (String) it.getFirst();
            if (it.getSecond() == null) {
                return str;
            }
            return str + '=' + String.valueOf(it.getSecond());
        }
    }

    public static final F a(P url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return h(new F(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final F b(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return K.j(new F(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final P c(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return b(urlString).b();
    }

    public static final void d(Appendable appendable, String encodedPath, InterfaceC2006A encodedQueryParameters, boolean z10) {
        List list;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.isBlank(encodedPath) && !StringsKt.startsWith$default(encodedPath, "/", false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z10) {
            appendable.append("?");
        }
        Set<Map.Entry> a10 = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a10) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = CollectionsKt.listOf(TuplesKt.to(str, null));
            } else {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(TuplesKt.to(str, (String) it.next()));
                }
                list = arrayList2;
            }
            CollectionsKt.addAll(arrayList, list);
        }
        CollectionsKt.joinTo$default(arrayList, appendable, "&", null, null, 0, null, a.f15973d, 60, null);
    }

    public static final void e(StringBuilder sb2, String str, String str2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(':');
            sb2.append(str2);
        }
        sb2.append("@");
    }

    public static final String f(P p10) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        return p10.g() + ':' + p10.j();
    }

    public static final F g(F f10, F url) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        f10.y(url.o());
        f10.w(url.j());
        f10.x(url.n());
        f10.u(url.g());
        f10.v(url.h());
        f10.t(url.f());
        InterfaceC2006A b10 = D.b(0, 1, null);
        AbstractC2922B.c(b10, url.e());
        f10.s(b10);
        f10.r(url.d());
        f10.z(url.p());
        return f10;
    }

    public static final F h(F f10, P url) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        f10.y(url.k());
        f10.w(url.g());
        f10.x(url.j());
        H.i(f10, url.d());
        f10.v(url.f());
        f10.t(url.c());
        InterfaceC2006A b10 = D.b(0, 1, null);
        b10.d(E.d(url.e(), 0, 0, false, 6, null));
        f10.s(b10);
        f10.r(url.b());
        f10.z(url.m());
        return f10;
    }
}
