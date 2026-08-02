package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f22617a;

    static {
        a[] aVarArr = {new a("PurchaseToken", 0), new a("PriceCurrencyCode", 1), new a("PriceAmountMicros", 2), new a("ProductId", 3), new a("SubscriptionId", 4)};
        f22617a = aVarArr;
        com.google.android.play.core.appupdate.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22617a.clone();
    }
}
