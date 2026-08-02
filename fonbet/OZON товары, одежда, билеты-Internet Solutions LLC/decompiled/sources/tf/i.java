package tf;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import sf.AbstractC9688n;
import sf.D;
import sf.O;
import sf.x;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function0<List<? extends Pair<? extends AbstractC9688n, ? extends D>>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ClassLoader f99502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ClassLoader classLoader) {
        super(0);
        this.f99502b = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Pair<? extends AbstractC9688n, ? extends D>> invoke() {
        int f7;
        D d11;
        Pair pair;
        int i11 = h.f99500e;
        ClassLoader classLoader = this.f99502b;
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(\"\")");
        ArrayList list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            URL it2 = (URL) it.next();
            int i12 = h.f99500e;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            Intrinsics.checkNotNullParameter(it2, "<this>");
            if (Intrinsics.d(it2.getProtocol(), "file")) {
                x xVar = AbstractC9688n.f98744a;
                String str = D.f98654b;
                pair2 = new Pair(xVar, D.a.b(new File(it2.toURI())));
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL it3 : list2) {
            int i13 = h.f99500e;
            Intrinsics.checkNotNullExpressionValue(it3, "it");
            Intrinsics.checkNotNullParameter(it3, "<this>");
            String url = it3.toString();
            Intrinsics.checkNotNullExpressionValue(url, "toString()");
            if (kotlin.text.h.e0(url, "jar:file:", false) && (f7 = kotlin.text.h.f(url, "!", 0, 6)) != -1) {
                String str2 = D.f98654b;
                String substring = url.substring(4, f7);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                O c11 = n.c(D.a.b(new File(URI.create(substring))), AbstractC9688n.f98744a, g.f99497b);
                d11 = h.f99499d;
                pair = new Pair(c11, d11);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        return C7714v.p0(arrayList2, arrayList);
    }
}
