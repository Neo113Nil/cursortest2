package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import android.graphics.Color;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"toColorIntOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "addCouponIdParam", "Lru/ozon/uni/atoms/af/AtomAction;", "id", "", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;)Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListUtilsKt {
    @NotNull
    public static final AtomAction addCouponIdParam(@NotNull AtomAction atomAction, Long l11) {
        String str;
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        if (!(atomAction instanceof AtomAction.ComposerAction)) {
            return atomAction;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction;
        Map<String, String> params = composerAction.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        if (l11 == null || (str = l11.toString()) == null) {
            str = "";
        }
        u11.put("COUPON_ID_PARAM", str);
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    public static final Integer toColorIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
