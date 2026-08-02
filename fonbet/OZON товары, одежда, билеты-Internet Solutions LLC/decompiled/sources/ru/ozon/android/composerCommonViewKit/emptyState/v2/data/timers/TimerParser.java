package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerTextTemplate;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers.TemplateParseResult;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TimerParser;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isTitle", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "parseTimerTemplate$common_view_kit_release", "(Ljava/lang/String;Z)Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "parseTimerTemplate", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimerParser {

    @NotNull
    public static final TimerParser INSTANCE = new TimerParser();

    private TimerParser() {
    }

    @NotNull
    public final TemplateParseResult parseTimerTemplate$common_view_kit_release(String value, boolean isTitle) {
        if (value == null || h.K(value)) {
            return TemplateParseResult.NoPlaceholder.INSTANCE;
        }
        String obj = h.z0(value).toString();
        if (!h.e0(obj, "[", false) || !h.A(obj, "]", false)) {
            return TemplateParseResult.NoPlaceholder.INSTANCE;
        }
        List m11 = h.m(h.U(h.S(obj, "["), "]"), new String[]{"|"}, 3, 2);
        int size = m11.size();
        if (2 > size || size >= 4) {
            return TemplateParseResult.Invalid.INSTANCE;
        }
        Integer w02 = h.w0(h.z0((String) m11.get(0)).toString());
        if (w02 != null) {
            if (w02.intValue() < 0) {
                w02 = null;
            }
            if (w02 != null) {
                int intValue = w02.intValue();
                String obj2 = h.z0((String) m11.get(1)).toString();
                String str = (String) C7714v.Q(2, m11);
                String obj3 = str != null ? h.z0(str).toString() : null;
                if (obj3 == null) {
                    obj3 = "";
                }
                if (h.K(obj2) || !h.t(obj2, "$timer", false)) {
                    return TemplateParseResult.Invalid.INSTANCE;
                }
                if (isTitle && h.K(obj3)) {
                    return TemplateParseResult.Invalid.INSTANCE;
                }
                return new TemplateParseResult.Parsed(new TimerTextTemplate(intValue, obj2, h.K(obj3) ? null : obj3));
            }
        }
        return TemplateParseResult.Invalid.INSTANCE;
    }
}
