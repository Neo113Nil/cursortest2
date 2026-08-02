package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ow7 implements pw7 {
    public final MediaType a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;

    public ow7(MediaType mediaType, String str, String str2, boolean z, String str3, ArrayList arrayList) {
        mediaType.getClass();
        str.getClass();
        str2.getClass();
        this.a = mediaType;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow7)) {
            return false;
        }
        ow7 ow7Var = (ow7) obj;
        return this.a == ow7Var.a && Intrinsics.c(this.b, ow7Var.b) && Intrinsics.c(this.c, ow7Var.c) && this.d == ow7Var.d && Intrinsics.c(this.e, ow7Var.e) && this.f.equals(ow7Var.f);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoHighlightClickAction(postType=");
        sb.append(this.a);
        sb.append(", highlightUrl=");
        sb.append(this.b);
        sb.append(", highlightTitle=");
        dmi.w(sb, this.c, ", highlightEmbeddable=", this.d, ", screenTitle=");
        sb.append(this.e);
        sb.append(", groupPostIds=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
