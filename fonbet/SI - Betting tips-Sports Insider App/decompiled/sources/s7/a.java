package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f22635d;

    public /* synthetic */ a(r rVar, String str, long j, int i5) {
        this.f22632a = i5;
        this.f22633b = str;
        this.f22634c = j;
        this.f22635d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22632a) {
            case 0:
                r rVar = (r) this.f22635d;
                String str = (String) this.f22633b;
                rVar.j();
                g6.v.e(str);
                s.e eVar = rVar.f22972c;
                boolean isEmpty = eVar.isEmpty();
                long j = this.f22634c;
                if (isEmpty) {
                    rVar.f22973d = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num == null) {
                    if (eVar.f22575c < 100) {
                        eVar.put(str, 1);
                        rVar.f22971b.put(str, Long.valueOf(j));
                        break;
                    } else {
                        n0 n0Var = ((f1) rVar.f3328a).f22745f;
                        f1.m(n0Var);
                        n0Var.f22906i.a("Too many ads visible");
                        break;
                    }
                } else {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            case 1:
                r rVar2 = (r) this.f22635d;
                String str2 = (String) this.f22633b;
                f1 f1Var = (f1) rVar2.f3328a;
                rVar2.j();
                g6.v.e(str2);
                s.e eVar2 = rVar2.f22972c;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    o2 o2Var = f1Var.f22750l;
                    n0 n0Var3 = f1Var.f22745f;
                    f1.l(o2Var);
                    l2 p10 = o2Var.p(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        eVar2.put(str2, Integer.valueOf(intValue));
                        break;
                    } else {
                        eVar2.remove(str2);
                        s.e eVar3 = rVar2.f22971b;
                        Long l6 = (Long) eVar3.get(str2);
                        long j6 = this.f22634c;
                        if (l6 == null) {
                            f1.m(n0Var3);
                            n0Var3.f22903f.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j6 - l6.longValue();
                            eVar3.remove(str2);
                            rVar2.o(str2, longValue, p10);
                        }
                        if (eVar2.isEmpty()) {
                            long j10 = rVar2.f22973d;
                            if (j10 != 0) {
                                rVar2.n(j6 - j10, p10);
                                rVar2.f22973d = 0L;
                                break;
                            } else {
                                f1.m(n0Var3);
                                n0Var3.f22903f.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                o2 o2Var2 = (o2) this.f22635d;
                o2Var2.n((l2) this.f22633b, false, this.f22634c);
                o2Var2.f22931e = null;
                y2 p11 = ((f1) o2Var2.f3328a).p();
                p11.j();
                p11.k();
                p11.x(new w0(p11, (l2) null));
                break;
        }
    }

    public a(o2 o2Var, l2 l2Var, long j) {
        this.f22632a = 2;
        this.f22633b = l2Var;
        this.f22634c = j;
        Objects.requireNonNull(o2Var);
        this.f22635d = o2Var;
    }
}
