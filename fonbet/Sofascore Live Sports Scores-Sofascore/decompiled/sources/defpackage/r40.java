package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r40 {
    public final XmlPullParser a;
    public int b = 0;
    public final p95 c = new p95(1);

    public r40(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (r4a.z(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj;
        return Intrinsics.c(this.a, r40Var.a) && this.b == r40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return wv8.j(sb, this.b, ')');
    }
}
