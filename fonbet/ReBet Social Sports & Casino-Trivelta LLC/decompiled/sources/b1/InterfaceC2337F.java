package b1;

import android.util.Pair;

/* renamed from: b1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2337F {

    /* renamed from: a, reason: collision with root package name */
    public static final Pair f24298a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pair f24299b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pair f24300c;

    static {
        Float valueOf = Float.valueOf(0.0f);
        f24298a = Pair.create(valueOf, valueOf);
        f24299b = Pair.create(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        f24300c = Pair.create(valueOf2, valueOf2);
    }

    default float a() {
        return 1.0f;
    }

    default Pair b() {
        return f24300c;
    }

    default Pair c() {
        return f24298a;
    }

    default float d() {
        return 0.0f;
    }

    default Pair e() {
        return f24299b;
    }
}
