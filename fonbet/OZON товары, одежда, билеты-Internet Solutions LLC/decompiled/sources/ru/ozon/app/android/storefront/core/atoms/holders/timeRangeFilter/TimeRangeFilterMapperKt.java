package ru.ozon.app.android.storefront.core.atoms.holders.timeRangeFilter;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterViewData;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;", "Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "map", "(Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;)Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "", "fromValue", "toValue", "Lru/ozon/uni/atoms/af/AtomAction;", "extractAction", "(Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;II)Lru/ozon/uni/atoms/af/AtomAction;", "", "", "oldParams", "newParams", "(Ljava/util/Map;II)Ljava/util/Map;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeRangeFilterMapperKt {
    public static final AtomAction extractAction(@NotNull TimeRangeFilter timeRangeFilter, int i11, int i12) {
        String str;
        Intrinsics.checkNotNullParameter(timeRangeFilter, "<this>");
        AtomActionDTO action = timeRangeFilter.getAction();
        if (action != null) {
            AtomActionDTO.Behavior behavior = action.getBehavior() == AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH ? AtomActionDTO.Behavior.CUSTOM : action.getBehavior();
            String link = action.getLink();
            if (link != null) {
                String encode = Uri.encode(i11 + ";" + i12);
                Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                str = h.X(link, "{value}", encode, false);
            } else {
                str = null;
            }
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            AtomActionDTO copy$default = AtomActionDTO.copy$default(action, behavior, str, null, newParams(params, i11, i12), null, 20, null);
            if (copy$default != null) {
                return AtomActionMapperKt.toAtomAction(copy$default, timeRangeFilter.getTrackingInfo());
            }
        }
        return null;
    }

    @NotNull
    public static final TimeRangeFilterViewData map(@NotNull TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "<this>");
        String title = timeRangeFilter.getTitle();
        float minValue = timeRangeFilter.getMinValue();
        float maxValue = timeRangeFilter.getMaxValue();
        Integer fromValue = timeRangeFilter.getFromValue();
        float intValue = fromValue != null ? fromValue.intValue() : timeRangeFilter.getMinValue();
        Integer toValue = timeRangeFilter.getToValue();
        float intValue2 = toValue != null ? toValue.intValue() : timeRangeFilter.getMaxValue();
        String format = timeRangeFilter.getFormat();
        if (format == null) {
            format = "HH:mm";
        }
        String str = format;
        String inputMask = timeRangeFilter.getInputMask();
        if (inputMask == null) {
            inputMask = "##:##";
        }
        return new TimeRangeFilterViewData(title, minValue, maxValue, intValue, intValue2, 1.0f, str, inputMask);
    }

    private static final Map<String, String> newParams(Map<String, String> map, int i11, int i12) {
        return U.m(map, U.l(new Pair("fromValue", String.valueOf(i11)), new Pair("toValue", String.valueOf(i12))));
    }
}
