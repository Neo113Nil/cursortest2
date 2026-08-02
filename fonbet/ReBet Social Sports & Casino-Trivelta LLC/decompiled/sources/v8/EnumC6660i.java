package v8;

import T7.InterfaceC1668h;
import java.util.Arrays;

/* renamed from: v8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6660i implements InterfaceC1668h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);


    /* renamed from: a, reason: collision with root package name */
    public final int f67090a;

    EnumC6660i(int i10) {
        this.f67090a = i10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC6660i[] valuesCustom() {
        EnumC6660i[] valuesCustom = values();
        return (EnumC6660i[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // T7.InterfaceC1668h
    public int a() {
        return this.f67090a;
    }

    @Override // T7.InterfaceC1668h
    public String b() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
