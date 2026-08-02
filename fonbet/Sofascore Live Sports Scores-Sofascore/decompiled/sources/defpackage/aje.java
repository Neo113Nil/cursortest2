package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aje {
    public static final aje c = new aje(0, false);
    public final boolean a;
    public final int b;

    public aje() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aje)) {
            return false;
        }
        aje ajeVar = (aje) obj;
        return this.a == ajeVar.a && this.b == ajeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) rl5.a(this.b)) + ')';
    }

    public aje(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
