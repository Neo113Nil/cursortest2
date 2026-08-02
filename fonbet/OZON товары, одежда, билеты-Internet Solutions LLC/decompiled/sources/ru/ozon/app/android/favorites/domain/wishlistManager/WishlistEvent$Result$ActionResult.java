package ru.ozon.app.android.favorites.domain.wishlistManager;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult", "", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent$Result$ActionResult;", "<init>", "(Ljava/lang/String;I)V", "SUCCEED", "FAILED", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistEvent$Result$ActionResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WishlistEvent$Result$ActionResult[] $VALUES;
    public static final WishlistEvent$Result$ActionResult SUCCEED = new WishlistEvent$Result$ActionResult("SUCCEED", 0);
    public static final WishlistEvent$Result$ActionResult FAILED = new WishlistEvent$Result$ActionResult("FAILED", 1);

    private static final /* synthetic */ WishlistEvent$Result$ActionResult[] $values() {
        return new WishlistEvent$Result$ActionResult[]{SUCCEED, FAILED};
    }

    static {
        WishlistEvent$Result$ActionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private WishlistEvent$Result$ActionResult(String str, int i11) {
    }

    public static WishlistEvent$Result$ActionResult valueOf(String str) {
        return (WishlistEvent$Result$ActionResult) Enum.valueOf(WishlistEvent$Result$ActionResult.class, str);
    }

    public static WishlistEvent$Result$ActionResult[] values() {
        return (WishlistEvent$Result$ActionResult[]) $VALUES.clone();
    }
}
