package com.vk.id.captcha.c.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sensors.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    private static final /* synthetic */ b[] d;

    static {
        b bVar = new b("ACCELEROMETER", 0);
        a = bVar;
        b bVar2 = new b("GYROSCOPE", 1);
        b = bVar2;
        b bVar3 = new b("MOTION", 2);
        c = bVar3;
        d = new b[]{bVar, bVar2, bVar3};
    }

    public b() {
        throw null;
    }

    public static b[] h() {
        return (b[]) d.clone();
    }
}
