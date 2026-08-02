package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {

    @NotNull
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charsets f19238a = new Charsets();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f19239b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f19240c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f19241d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f19242e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile Charset f19243f;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(...)");
        Charset forName2 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        f19239b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        f19240c = forName3;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("US-ASCII"), "forName(...)");
        Charset forName4 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        f19241d = forName4;
    }
}
