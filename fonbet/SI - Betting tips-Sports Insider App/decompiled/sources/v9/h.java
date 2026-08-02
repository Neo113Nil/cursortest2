package v9;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24493a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f24494b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f24495c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f24496d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f24497e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f24498f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f24499g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f24500h;

    static {
        f fVar = new f();
        fVar.add(j.f24505d);
        f24493a = fVar;
        f fVar2 = new f();
        fVar2.add(j.f24502a);
        fVar2.add(j.f24503b);
        fVar2.add(j.f24504c);
        fVar2.add(j.f24506e);
        fVar2.add(j.f24507f);
        f24494b = fVar2;
        f fVar3 = new f();
        fVar3.add(j.f24509h);
        fVar3.add(j.f24508g);
        f24495c = fVar3;
        f fVar4 = new f();
        fVar4.add(j.f24510i);
        fVar4.add(j.j);
        fVar4.add(j.f24511k);
        fVar4.add(j.f24512l);
        fVar4.add(j.f24513m);
        f24496d = fVar4;
        f fVar5 = new f();
        fVar5.add(j.f24514n);
        fVar5.add(j.f24515o);
        f24497e = fVar5;
        f fVar6 = new f();
        fVar6.add(j.f24516p);
        f24498f = fVar6;
        f fVar7 = new f();
        fVar7.add(j.q);
        f24499g = fVar7;
        f fVar8 = new f();
        fVar8.add(j.f24517r);
        f24500h = fVar8;
    }

    public static boolean a(String str, List list, int i5) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (io.sentry.config.a.A(i5, str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
