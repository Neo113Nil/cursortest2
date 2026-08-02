package qg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22145a;

    /* renamed from: b, reason: collision with root package name */
    public List f22146b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22147c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f22148d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22149e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22150f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22151g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f22145a = serialName;
        this.f22146b = e0.f19204a;
        this.f22147c = new ArrayList();
        this.f22148d = new HashSet();
        this.f22149e = new ArrayList();
        this.f22150f = new ArrayList();
        this.f22151g = new ArrayList();
    }

    public static void a(a aVar, String elementName, g descriptor) {
        e0 annotations = e0.f19204a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!aVar.f22148d.add(elementName)) {
            StringBuilder p10 = d9.e.p("Element with name '", elementName, "' is already registered in ");
            p10.append(aVar.f22145a);
            throw new IllegalArgumentException(p10.toString().toString());
        }
        aVar.f22147c.add(elementName);
        aVar.f22149e.add(descriptor);
        aVar.f22150f.add(annotations);
        aVar.f22151g.add(false);
    }
}
