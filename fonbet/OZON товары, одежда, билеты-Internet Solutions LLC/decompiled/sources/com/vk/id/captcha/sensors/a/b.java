package com.vk.id.captcha.sensors.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f60545a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f60546b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f60547c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f60548d;

    static {
        b bVar = new b("ACCELEROMETER", 0);
        f60545a = bVar;
        b bVar2 = new b("GYROSCOPE", 1);
        f60546b = bVar2;
        b bVar3 = new b("MOTION", 2);
        f60547c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f60548d = bVarArr;
        Xc.b.a(bVarArr);
    }

    private b(String str, int i11) {
    }

    public static b[] a() {
        return (b[]) f60548d.clone();
    }
}
