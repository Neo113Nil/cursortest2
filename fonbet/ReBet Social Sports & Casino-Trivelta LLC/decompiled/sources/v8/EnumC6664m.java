package v8;

import T7.InterfaceC1668h;
import java.util.Arrays;

/* renamed from: v8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6664m implements InterfaceC1668h {
    SHARE_STORY_ASSET(20170417);


    /* renamed from: a, reason: collision with root package name */
    public final int f67097a;

    EnumC6664m(int i10) {
        this.f67097a = i10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC6664m[] valuesCustom() {
        EnumC6664m[] valuesCustom = values();
        return (EnumC6664m[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // T7.InterfaceC1668h
    public int a() {
        return this.f67097a;
    }

    @Override // T7.InterfaceC1668h
    public String b() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }
}
