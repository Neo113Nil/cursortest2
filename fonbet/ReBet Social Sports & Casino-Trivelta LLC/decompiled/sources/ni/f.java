package ni;

import oi.v;

/* loaded from: classes5.dex */
public class f extends d {
    private static final long serialVersionUID = -4975173343610190782L;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f58574d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f58575e;

    /* renamed from: f, reason: collision with root package name */
    public final transient v f58576f;

    /* renamed from: g, reason: collision with root package name */
    public final transient v f58577g;

    public f(String str, Class cls, int i10, int i11, char c10) {
        super(str, cls, c10, str.startsWith("DAY_OF_"));
        this.f58574d = i10;
        this.f58575e = i11;
        this.f58576f = null;
        this.f58577g = null;
    }

    @Override // oi.p
    public Class getType() {
        return Integer.class;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return Integer.valueOf(this.f58575e);
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return Integer.valueOf(this.f58574d);
    }

    public f(String str, Class cls, int i10, int i11, char c10, v vVar, v vVar2) {
        super(str, cls, c10, false);
        this.f58574d = i10;
        this.f58575e = i11;
        this.f58576f = vVar;
        this.f58577g = vVar2;
    }
}
