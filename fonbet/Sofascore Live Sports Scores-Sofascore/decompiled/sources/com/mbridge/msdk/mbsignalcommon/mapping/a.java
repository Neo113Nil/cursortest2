package com.mbridge.msdk.mbsignalcommon.mapping;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends Throwable {
    private Class<?> a;
    private String b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public void a(String str) {
        this.b = str;
    }

    public a(Exception exc) {
        super(exc);
    }
}
