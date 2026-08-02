package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f19264c = new h(null);

    /* renamed from: d, reason: collision with root package name */
    public static final i f19265d = new i();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19266a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19267b;

    public i() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
        this.f19266a = true;
        this.f19267b = true;
        if (e0.a("")) {
            return;
        }
        e0.a("");
    }

    public final void a(StringBuilder sb2, String indent) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("prefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        r4.k.s(sb2, indent, "suffix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
