package Lg;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class b implements Mg.a {

    /* renamed from: a, reason: collision with root package name */
    public String f7168a;

    /* renamed from: b, reason: collision with root package name */
    public WritableMap f7169b;

    /* renamed from: c, reason: collision with root package name */
    public String f7170c;

    public b(String str, WritableMap writableMap) {
        this.f7168a = str;
        this.f7169b = writableMap;
    }

    @Override // Mg.a
    public WritableMap a() {
        return this.f7169b;
    }

    @Override // Mg.a
    public String getEventName() {
        return this.f7168a;
    }

    public b(String str, WritableMap writableMap, String str2) {
        this.f7168a = str;
        this.f7169b = writableMap;
        this.f7170c = str2;
    }
}
