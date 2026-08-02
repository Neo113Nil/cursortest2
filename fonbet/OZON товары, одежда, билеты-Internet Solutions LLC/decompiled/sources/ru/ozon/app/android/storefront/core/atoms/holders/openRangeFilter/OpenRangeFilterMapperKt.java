package ru.ozon.app.android.storefront.core.atoms.holders.openRangeFilter;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterViewData;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "map", "(Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;)Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "data", "Lru/ozon/uni/atoms/af/AtomAction;", "extractAction", "(Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;)Lru/ozon/uni/atoms/af/AtomAction;", "", "getToValue", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;)I", "", "", "oldParams", "fromValue", "toValue", "", "shouldUpdateMaxValue", "newParams", "(Ljava/util/Map;IIZ)Ljava/util/Map;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterMapperKt {
    public static final AtomAction extractAction(@NotNull OpenRangeFilter openRangeFilter, @NotNull OpenRangeFilterViewData data) {
        String str;
        Intrinsics.checkNotNullParameter(openRangeFilter, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        AtomActionDTO action = openRangeFilter.getAction();
        if (action != null) {
            AtomActionDTO.Behavior behavior = action.getBehavior() == AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH ? AtomActionDTO.Behavior.CUSTOM : action.getBehavior();
            String link = action.getLink();
            if (link != null) {
                String encode = Uri.encode(data.getFromValue() + ";" + getToValue(data));
                Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                str = h.X(link, "{value}", encode, false);
            } else {
                str = null;
            }
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            AtomActionDTO copy$default = AtomActionDTO.copy$default(action, behavior, str, null, newParams(params, data.getFromValue(), data.getToValue(), data.getShouldUpdateMaxValue()), null, 20, null);
            if (copy$default != null) {
                return AtomActionMapperKt.toAtomAction(copy$default, openRangeFilter.getTrackingInfo());
            }
        }
        return null;
    }

    private static final int getToValue(OpenRangeFilterViewData openRangeFilterViewData) {
        if (openRangeFilterViewData.getShouldUpdateMaxValue()) {
            return openRangeFilterViewData.getToValue();
        }
        if (openRangeFilterViewData.getMaxValueSign() == null || openRangeFilterViewData.getToValue() != openRangeFilterViewData.getMaxValue()) {
            return openRangeFilterViewData.getToValue();
        }
        return 0;
    }

    @NotNull
    public static final OpenRangeFilterViewData map(@NotNull OpenRangeFilter openRangeFilter) {
        Intrinsics.checkNotNullParameter(openRangeFilter, "<this>");
        String title = openRangeFilter.getTitle();
        int minValue = openRangeFilter.getMinValue();
        int maxValue = openRangeFilter.getMaxValue();
        Integer stepPower = openRangeFilter.getStepPower();
        int intValue = stepPower != null ? stepPower.intValue() : 1;
        String symbol = openRangeFilter.getSymbol();
        return new OpenRangeFilterViewData(title, minValue, maxValue, intValue, symbol != null ? h.z0(symbol).toString() : null, openRangeFilter.getMaxValueSign(), openRangeFilter.getFromValue(), openRangeFilter.getToValue(), openRangeFilter.getHideSeparator(), false, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    private static final Map<String, String> newParams(Map<String, String> map, int i11, int i12, boolean z11) {
        return U.m(map, U.j(new Pair("fromValue", String.valueOf(i11)), new Pair("toValue", String.valueOf(i12)), new Pair("shouldUpdateMaxValue", String.valueOf(z11))));
    }
}
