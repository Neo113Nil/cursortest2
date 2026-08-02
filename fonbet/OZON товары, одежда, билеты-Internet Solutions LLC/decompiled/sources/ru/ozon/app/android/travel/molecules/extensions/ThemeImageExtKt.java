package ru.ozon.app.android.travel.molecules.extensions;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getUrlForTheme", "", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "context", "Landroid/content/Context;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeImageExtKt {
    @NotNull
    public static final String getUrlForTheme(@NotNull ThemeImageV1VO themeImageV1VO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(themeImageV1VO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ThemeExtKt.isDarkThemeActive(context) ? themeImageV1VO.getDarkImageUrl() : themeImageV1VO.getLightImageUrl();
    }
}
