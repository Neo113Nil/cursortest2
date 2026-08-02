package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f19287b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f19288c;

    /* renamed from: a, reason: collision with root package name */
    public final int f19289a;

    static {
        r rVar = new r("IGNORE_CASE", 0, 2, 0, 2, null);
        f19287b = rVar;
        r[] rVarArr = {rVar, new r("MULTILINE", 1, 8, 0, 2, null), new r("LITERAL", 2, 16, 0, 2, null), new r("UNIX_LINES", 3, 1, 0, 2, null), new r("COMMENTS", 4, 4, 0, 2, null), new r("DOT_MATCHES_ALL", 5, 32, 0, 2, null), new r("CANON_EQ", 6, 128, 0, 2, null)};
        f19288c = rVarArr;
        com.google.android.play.core.appupdate.b.l(rVarArr);
    }

    public r(String str, int i5, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this.f19289a = i10;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f19288c.clone();
    }
}
