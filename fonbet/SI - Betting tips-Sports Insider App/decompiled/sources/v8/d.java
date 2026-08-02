package v8;

import java.util.Date;
import java.util.HashMap;
import t8.f;
import t8.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements u8.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f24455f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f24456g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24458a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24459b;

    /* renamed from: c, reason: collision with root package name */
    public final a f24460c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24461d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f24454e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f24457h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [v8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v8.b] */
    static {
        final int i5 = 0;
        f24455f = new f() { // from class: v8.b
            @Override // t8.a
            public final void a(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f24456g = new f() { // from class: v8.b
            @Override // t8.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f24458a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f24459b = hashMap2;
        this.f24460c = f24454e;
        this.f24461d = false;
        hashMap2.put(String.class, f24455f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f24456g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f24457h);
        hashMap.remove(Date.class);
    }

    public final u8.a a(Class cls, t8.d dVar) {
        this.f24458a.put(cls, dVar);
        this.f24459b.remove(cls);
        return this;
    }
}
