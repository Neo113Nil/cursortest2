package ru.ozon.app.android.favorites.domain.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002¨\u0006\b"}, d2 = {"extractSkuFromFavoriteAction", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/lang/Long;", "extractListIdFromFavoriteAction", "extractGiftIdFromFavoriteAction", "extractUniqIdFromFavoriteAction", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionHandlersUtilsKt {
    public static final Long extractGiftIdFromFavoriteAction(@NotNull AtomAction.ComposerAction composerAction) {
        String str;
        Intrinsics.checkNotNullParameter(composerAction, "<this>");
        Map<String, String> params = composerAction.getParams();
        if (params == null || (str = params.get("giftId")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public static final Long extractListIdFromFavoriteAction(@NotNull AtomAction.ComposerAction composerAction) {
        String str;
        Intrinsics.checkNotNullParameter(composerAction, "<this>");
        Map<String, String> params = composerAction.getParams();
        if (params == null || (str = params.get("id")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public static final Long extractSkuFromFavoriteAction(@NotNull AtomAction.ComposerAction composerAction) {
        String str;
        Intrinsics.checkNotNullParameter(composerAction, "<this>");
        Map<String, String> params = composerAction.getParams();
        if (params == null || (str = params.get("sku")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public static final String extractUniqIdFromFavoriteAction(@NotNull AtomAction.ComposerAction composerAction) {
        Intrinsics.checkNotNullParameter(composerAction, "<this>");
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            return params.get("uniqId");
        }
        return null;
    }
}
