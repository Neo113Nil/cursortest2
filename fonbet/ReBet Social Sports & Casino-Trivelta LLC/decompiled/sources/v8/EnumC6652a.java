package v8;

import T7.InterfaceC1668h;
import java.util.Arrays;

/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6652a implements InterfaceC1668h {
    SHARE_CAMERA_EFFECT(20170417);


    /* renamed from: a, reason: collision with root package name */
    public final int f67066a;

    EnumC6652a(int i10) {
        this.f67066a = i10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC6652a[] valuesCustom() {
        EnumC6652a[] valuesCustom = values();
        return (EnumC6652a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // T7.InterfaceC1668h
    public int a() {
        return this.f67066a;
    }

    @Override // T7.InterfaceC1668h
    public String b() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }
}
