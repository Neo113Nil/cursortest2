package ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.data;

import T00.a;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.R$string;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation.PointsInputVO;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/data/PointsInputMapper;", "Lkotlin/Function2;", "", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "isPointTypeTo", "", "getTitle", "(Z)Ljava/lang/String;", "tripKind", "getHint", "(Ljava/lang/String;Z)Ljava/lang/String;", "pointType", "getIsPointTypeTo", "(Ljava/lang/String;)Z", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lkotlin/Unit;Ll20/d;)Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointsInputMapper implements Function2<Unit, d, List<? extends PointsInputVO>> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String getHint(String tripKind, boolean isPointTypeTo) {
        String str;
        int i11;
        if (tripKind != null) {
            str = tripKind.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 2021389:
                    if (str.equals("AVIA")) {
                        i11 = R$string.travel_point_search_bar_avia_hint;
                        break;
                    }
                    break;
                case 2581080:
                    if (str.equals("TOUR")) {
                        if (!isPointTypeTo) {
                            i11 = R$string.point_search_bar_tours_hint_from;
                            break;
                        } else {
                            i11 = R$string.point_search_bar_tours_hint_to;
                            break;
                        }
                    }
                    break;
                case 68929940:
                    if (str.equals("HOTEL")) {
                        i11 = R$string.travel_point_search_bar_hotels_hint_2;
                        break;
                    }
                    break;
                case 1691519485:
                    if (str.equals("RAILWAY")) {
                        i11 = R$string.travel_point_search_bar_railway_hint;
                        break;
                    }
                    break;
            }
            return StringProvider.getString(i11);
        }
        i11 = R$string.travel_point_search_bar_avia_hint;
        return StringProvider.getString(i11);
    }

    private final boolean getIsPointTypeTo(String pointType) {
        String str;
        if (pointType != null) {
            str = pointType.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return Intrinsics.d(str, "to");
    }

    private final String getTitle(boolean isPointTypeTo) {
        return StringProvider.getString(isPointTypeTo ? R$string.travel_point_search_to : R$string.travel_point_search_from);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PointsInputVO> invoke(@NotNull Unit state, @NotNull d widgetInfo) {
        String c11;
        Uri parse;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        if (b11 == null || (c11 = b11.c()) == null || (parse = Uri.parse(c11)) == null) {
            return K.f71697a;
        }
        String queryParameter = parse.getQueryParameter(SearchIntents.EXTRA_QUERY);
        String queryParameter2 = parse.getQueryParameter("pointType");
        String queryParameter3 = parse.getQueryParameter("tripKind");
        boolean isPointTypeTo = getIsPointTypeTo(queryParameter2);
        long hashCode = widgetInfo.d().hashCode();
        String title = getTitle(isPointTypeTo);
        String hint = getHint(queryParameter3, isPointTypeTo);
        if (queryParameter == null) {
            queryParameter = "";
        }
        String uri = parse.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return C7714v.a0(new PointsInputVO(hashCode, title, hint, queryParameter, SearchIntents.EXTRA_QUERY, uri));
    }
}
