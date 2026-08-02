package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final p f19284c = new p(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f19285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19286b;

    public q(String pattern, int i5) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f19285a = pattern;
        this.f19286b = i5;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.f19285a, this.f19286b);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return new Regex(compile);
    }
}
