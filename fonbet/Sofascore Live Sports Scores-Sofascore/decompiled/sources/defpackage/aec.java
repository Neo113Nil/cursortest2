package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aec {
    public static final aec b = new aec("text/*");
    public static final aec c = new aec("*/*");
    public final String a;

    public aec(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        return this.a.equals(((aec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mz1.o(new StringBuilder("MediaType(representation='"), this.a, "')");
    }
}
