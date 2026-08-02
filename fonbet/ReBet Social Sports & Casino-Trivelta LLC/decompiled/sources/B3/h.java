package B3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f641a;

    /* renamed from: b, reason: collision with root package name */
    public final List f642b;

    /* renamed from: c, reason: collision with root package name */
    public final List f643c;

    public h(List list) {
        this.f643c = list;
        this.f641a = new ArrayList(list.size());
        this.f642b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f641a.add(((com.airbnb.lottie.model.content.i) list.get(i10)).b().a());
            this.f642b.add(((com.airbnb.lottie.model.content.i) list.get(i10)).c().a());
        }
    }

    public List a() {
        return this.f641a;
    }

    public List b() {
        return this.f643c;
    }

    public List c() {
        return this.f642b;
    }
}
