package ru.ozon.uni.android.ds.compose.modifier;

import S0.B1;
import S0.G0;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0007\u001a#\u0010\n\u001a\u0004\u0018\u00010\u0005*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"+\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/e;", "Lru/ozon/uni/atoms/data/AtomDTO;", "dto", "viewAnalytics", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/AtomDTO;)Landroidx/compose/ui/e;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewAnalyticsInfo", "(Landroidx/compose/ui/e;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)Landroidx/compose/ui/e;", "", "", "getViewAnalyticsInfo", "(Ljava/util/Map;)Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "LS0/G0;", "Lkotlin/Function1;", "", "LocalDSViewAnalyticsProvider", "LS0/G0;", "getLocalDSViewAnalyticsProvider", "()LS0/G0;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnalyticsModifierKt {

    @NotNull
    private static final G0<Function1<TokenizedTrackingInfo, Unit>> LocalDSViewAnalyticsProvider = new B1(AnalyticsModifierKt$LocalDSViewAnalyticsProvider$1.INSTANCE);

    @NotNull
    public static final G0<Function1<TokenizedTrackingInfo, Unit>> getLocalDSViewAnalyticsProvider() {
        return LocalDSViewAnalyticsProvider;
    }

    public static final TokenizedTrackingInfo getViewAnalyticsInfo(Map<String, TokenizedTrackingInfo> map) {
        if (map != null) {
            return map.get("view");
        }
        return null;
    }

    @NotNull
    public static final e viewAnalytics(@NotNull e eVar, @NotNull AtomDTO dto) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        TokenizedTrackingInfo viewAnalyticsInfo = getViewAnalyticsInfo(dto.getTrackingInfo());
        return viewAnalyticsInfo != null ? viewAnalytics(eVar, viewAnalyticsInfo) : eVar;
    }

    private static final e viewAnalytics(e eVar, TokenizedTrackingInfo tokenizedTrackingInfo) {
        return eVar.l0(new DSTrackViewAnalyticsElement(tokenizedTrackingInfo));
    }
}
