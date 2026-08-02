package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Nk.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "IconChooserWidgetFactory", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "getCurrentAppIcon", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconChooserWidgetKt {
    @NotNull
    public static final i IconChooserWidgetFactory(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("travel", "iconChooser", IconChooserConfig.INSTANCE.getSupportedVersions(), new IconChooserWidgetKt$IconChooserWidgetFactory$1(jsonDeserializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconChooserVI.IconEnum getCurrentAppIcon(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String[] strArr = {"OzonTravelActivityDefault", "OzonTravelActivityPremium1", "OzonTravelActivityPremium2", "OzonTravelActivityPremium3"};
        for (int i11 = 0; i11 < 4; i11++) {
            String str = strArr[i11];
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (packageManager.getComponentEnabledSetting(new ComponentName(context, a.b("ru.ozon.app.android.travel.feature.entry.", str))) == 1) {
                return IconChooserMapperKt.mapToIconEnum(str);
            }
            continue;
        }
        return IconChooserVI.IconEnum.DEFAULT;
    }
}
