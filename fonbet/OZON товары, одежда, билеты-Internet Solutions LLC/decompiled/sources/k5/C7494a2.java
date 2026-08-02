package k5;

import androidx.annotation.NonNull;

/* renamed from: k5.a2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7494a2 {

    /* renamed from: a, reason: collision with root package name */
    private static C7508e0 f70702a;

    /* renamed from: b, reason: collision with root package name */
    private static C7537l1 f70703b;

    private C7494a2() {
    }

    @NonNull
    public static InterfaceC7517g1 a() {
        if (f70703b == null) {
            synchronized (C7494a2.class) {
                f70703b = new C7537l1();
            }
        }
        return f70703b;
    }

    @NonNull
    public static void b() {
        if (f70702a == null) {
            synchronized (C7494a2.class) {
                f70702a = new C7508e0();
            }
        }
    }
}
