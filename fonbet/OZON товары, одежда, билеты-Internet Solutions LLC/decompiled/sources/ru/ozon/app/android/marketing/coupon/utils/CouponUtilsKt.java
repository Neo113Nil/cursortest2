package ru.ozon.app.android.marketing.coupon.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0007"}, d2 = {"findCouponCode", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "findCodeParameter", "id", "link", "coupon_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponUtilsKt {
    private static final String findCodeParameter(String str, String str2) {
        if (!Intrinsics.d(str, "applyPromocode")) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return Uri.parse(str2).getQueryParameter("code");
    }

    public static final String findCouponCode(AtomActionDTO atomActionDTO) {
        return findCodeParameter(atomActionDTO != null ? atomActionDTO.getId() : null, atomActionDTO != null ? atomActionDTO.getLink() : null);
    }

    public static final String findCouponCode(AtomAction.ComposerAction composerAction) {
        return findCodeParameter(composerAction != null ? composerAction.getId() : null, composerAction != null ? composerAction.getActionName() : null);
    }
}
