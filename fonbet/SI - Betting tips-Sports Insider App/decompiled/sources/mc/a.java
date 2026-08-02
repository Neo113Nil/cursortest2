package mc;

import com.google.android.play.core.appupdate.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20526a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f20527b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f20528c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f20529d;

    static {
        a aVar = new a("SortPriceDescending", 0);
        f20526a = aVar;
        a aVar2 = new a("SortFreePriority", 1);
        f20527b = aVar2;
        a aVar3 = new a("SortTimeDescending", 2);
        f20528c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3, new a("TabsDescending", 3)};
        f20529d = aVarArr;
        b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20529d.clone();
    }
}
