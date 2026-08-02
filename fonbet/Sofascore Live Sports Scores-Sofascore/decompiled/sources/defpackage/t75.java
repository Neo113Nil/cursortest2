package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t75 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t75) && p75.b(10.0f, 10.0f) && p75.b(40.0f, 40.0f) && p75.b(10.0f, 10.0f) && p75.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fc6.a(40.0f, fc6.a(10.0f, fc6.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) p75.c(10.0f)) + ", top=" + ((Object) p75.c(40.0f)) + ", end=" + ((Object) p75.c(10.0f)) + ", bottom=" + ((Object) p75.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
