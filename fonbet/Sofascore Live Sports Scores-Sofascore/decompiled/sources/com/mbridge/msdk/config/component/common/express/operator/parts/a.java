package com.mbridge.msdk.config.component.common.express.operator.parts;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private final boolean a;
    private final Object b;

    private a(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public static a c() {
        return new a(false, null);
    }

    public Object a() {
        Object obj = this.b;
        return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Integer ? String.valueOf(obj) : obj;
    }

    public boolean b() {
        return this.a;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }
}
