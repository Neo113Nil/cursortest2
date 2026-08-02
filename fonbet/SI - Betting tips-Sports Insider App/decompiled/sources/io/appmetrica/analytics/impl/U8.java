package io.appmetrica.analytics.impl;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class U8 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f12959h;

    /* renamed from: i, reason: collision with root package name */
    public static final U8 f12960i;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0605xd f12961a;

    /* renamed from: b, reason: collision with root package name */
    public final to f12962b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0625y8 f12963c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0501t9 f12964d;

    /* renamed from: e, reason: collision with root package name */
    public final Vb f12965e;

    /* renamed from: f, reason: collision with root package name */
    public final Ud f12966f;

    /* renamed from: g, reason: collision with root package name */
    public final N9 f12967g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0098da.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0098da.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0098da.UNKNOWN, -1);
        f12959h = DesugarCollections.unmodifiableMap(hashMap);
        f12960i = new U8(new Ri(), new Zm(), new C0076ce(), new Qi(), new C0252ja(), new C0278ka(), new C0227ia());
    }

    public U8(T8 t82) {
        this(t82.f12907a, t82.f12908b, t82.f12909c, t82.f12910d, t82.f12911e, t82.f12912f, t82.f12913g);
    }

    public final C0122e9 a(N8 n82, C0285kh c0285kh) {
        C0122e9 c0122e9 = new C0122e9();
        C0097d9 a7 = this.f12966f.a(n82.f12640l, n82.f12641m);
        Z8 a10 = this.f12965e.a(n82.f12636g);
        if (a7 != null) {
            c0122e9.f13667g = a7;
        }
        if (a10 != null) {
            c0122e9.f13666f = a10;
        }
        String a11 = this.f12961a.a(n82.f12630a);
        if (a11 != null) {
            c0122e9.f13664d = a11;
        }
        c0122e9.f13665e = this.f12962b.a(n82, c0285kh);
        String str = n82.j;
        if (str != null) {
            c0122e9.f13668h = str;
        }
        Integer a12 = this.f12964d.a(n82);
        if (a12 != null) {
            c0122e9.f13663c = a12.intValue();
        }
        Long l6 = n82.f12632c;
        if (l6 != null) {
            c0122e9.f13661a = l6.longValue();
        }
        Long l10 = n82.f12633d;
        if (l10 != null) {
            c0122e9.f13673n = l10.longValue();
        }
        Long l11 = n82.f12634e;
        if (l11 != null) {
            c0122e9.f13674o = l11.longValue();
        }
        Long l12 = n82.f12635f;
        if (l12 != null) {
            c0122e9.f13662b = l12.longValue();
        }
        Integer num = n82.f12639k;
        if (num != null) {
            c0122e9.f13669i = num.intValue();
        }
        c0122e9.j = this.f12963c.a(n82.f12643o);
        C0224i7 c0224i7 = n82.f12636g;
        c0122e9.f13670k = c0224i7 != null ? new C0197h6().a(c0224i7.f13922a) : -1;
        String str2 = n82.f12642n;
        if (str2 != null) {
            c0122e9.f13671l = str2.getBytes();
        }
        EnumC0098da enumC0098da = n82.f12644p;
        Integer num2 = enumC0098da != null ? (Integer) f12959h.get(enumC0098da) : null;
        if (num2 != null) {
            c0122e9.f13672m = num2.intValue();
        }
        EnumC0327m9 enumC0327m9 = n82.q;
        if (enumC0327m9 != null) {
            int ordinal = enumC0327m9.ordinal();
            if (ordinal == 0) {
                c0122e9.f13675p = 0;
            } else if (ordinal == 1) {
                c0122e9.f13675p = 1;
            } else if (ordinal == 2) {
                c0122e9.f13675p = 2;
            }
        }
        Boolean bool = n82.f12645r;
        if (bool != null) {
            c0122e9.q = bool.booleanValue();
        }
        if (n82.f12646s != null) {
            c0122e9.f13676r = r6.intValue();
        }
        c0122e9.f13677s = ((C0227ia) this.f12967g).a(n82.f12647t);
        return c0122e9;
    }

    public U8(InterfaceC0605xd interfaceC0605xd, to toVar, InterfaceC0625y8 interfaceC0625y8, InterfaceC0501t9 interfaceC0501t9, Vb vb2, Ud ud2, N9 n9) {
        this.f12961a = interfaceC0605xd;
        this.f12962b = toVar;
        this.f12963c = interfaceC0625y8;
        this.f12964d = interfaceC0501t9;
        this.f12965e = vb2;
        this.f12966f = ud2;
        this.f12967g = n9;
    }

    public static T8 a() {
        return new T8(f12960i);
    }
}
