package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u7b implements og8 {
    public final float a;

    public u7b(float f) {
        this.a = f;
    }

    @Override // defpackage.og8
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.og8
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7b) && Float.compare(this.a, ((u7b) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wt3.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
