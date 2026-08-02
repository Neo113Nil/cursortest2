package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f19268d = new g(null);

    /* renamed from: e, reason: collision with root package name */
    public static final j f19269e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19270a;

    /* renamed from: b, reason: collision with root package name */
    public final f f19271b;

    /* renamed from: c, reason: collision with root package name */
    public final i f19272c;

    static {
        e eVar = f.f19262a;
        eVar.getClass();
        f fVar = f.f19263b;
        h hVar = i.f19264c;
        hVar.getClass();
        i iVar = i.f19265d;
        f19269e = new j(false, fVar, iVar);
        eVar.getClass();
        hVar.getClass();
        new j(true, fVar, iVar);
    }

    public j(boolean z5, f bytes, i number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f19270a = z5;
        this.f19271b = bytes;
        this.f19272c = number;
    }

    public final String toString() {
        StringBuilder b10 = v.f.b("HexFormat(\n    upperCase = ");
        b10.append(this.f19270a);
        b10.append(",\n    bytes = BytesHexFormat(\n");
        this.f19271b.a(b10, "        ");
        b10.append('\n');
        b10.append("    ),");
        b10.append('\n');
        b10.append("    number = NumberHexFormat(");
        b10.append('\n');
        this.f19272c.a(b10, "        ");
        b10.append('\n');
        b10.append("    )");
        b10.append('\n');
        b10.append(")");
        return b10.toString();
    }
}
