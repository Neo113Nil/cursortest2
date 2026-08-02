package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dw7 implements pw7 {
    public final MediaType a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ArrayList e;
    public final boolean f;

    public dw7(MediaType mediaType, String str, String str2, boolean z, ArrayList arrayList, boolean z2) {
        mediaType.getClass();
        this.a = mediaType;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = arrayList;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw7)) {
            return false;
        }
        dw7 dw7Var = (dw7) obj;
        return this.a == dw7Var.a && Intrinsics.c(this.b, dw7Var.b) && Intrinsics.c(this.c, dw7Var.c) && this.d == dw7Var.d && this.e.equals(dw7Var.e) && this.f == dw7Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.f) + vxd.d(this.e, dmi.e((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalVideoClickAction(postType=");
        sb.append(this.a);
        sb.append(", highlightUrl=");
        sb.append(this.b);
        sb.append(", highlightTitle=");
        dmi.w(sb, this.c, ", highlightEmbeddable=", this.d, ", groupPostIds=");
        sb.append(this.e);
        sb.append(", screenTitle=null, isInfluencerVideoPost=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
