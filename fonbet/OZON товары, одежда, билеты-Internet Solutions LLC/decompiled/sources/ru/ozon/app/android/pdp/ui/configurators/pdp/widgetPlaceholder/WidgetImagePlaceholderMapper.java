package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BadgeListDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BadgeListV2DTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BrandDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.SellerV7DTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderMapper;", "", "<init>", "()V", "", "key", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "map$configurators_prodGoogleAllVendorsRelease", "(Ljava/lang/String;)Ljava/lang/Class;", "map", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WidgetImagePlaceholderMapper {

    @NotNull
    public static final WidgetImagePlaceholderMapper INSTANCE = new WidgetImagePlaceholderMapper();

    private WidgetImagePlaceholderMapper() {
    }

    public final Class<? extends BasePlaceholderWidgetObject> map$configurators_prodGoogleAllVendorsRelease(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (key.hashCode()) {
            case -1983869101:
                if (key.equals("SellerV7HeaderCellWidget")) {
                    return SellerV7DTO.class;
                }
                return null;
            case -1619076614:
                if (key.equals("OriginalBrandWidget")) {
                    return BrandDTO.class;
                }
                return null;
            case -1469209735:
                if (key.equals("SimpleBrandWidget")) {
                    return BrandDTO.class;
                }
                return null;
            case -940709595:
                if (key.equals("SellerV7SimpleHeaderCellWidget")) {
                    return SellerV7DTO.class;
                }
                return null;
            case -314884615:
                if (key.equals("ButtonBrandWidget")) {
                    return BrandDTO.class;
                }
                return null;
            case 221967416:
                if (key.equals("SellerV7SimpleCellWidget")) {
                    return SellerV7DTO.class;
                }
                return null;
            case 547879276:
                if (key.equals("UgcCountersWidget")) {
                    return UgcCountersDTO.class;
                }
                return null;
            case 1046525568:
                if (key.equals("BadgeListV1Widget")) {
                    return BadgeListDTO.class;
                }
                return null;
            case 1594744027:
                if (key.equals("SellerV7IslandCellWidget")) {
                    return SellerV7DTO.class;
                }
                return null;
            case 1934029249:
                if (key.equals("BadgeListV2Widget")) {
                    return BadgeListV2DTO.class;
                }
                return null;
            default:
                return null;
        }
    }
}
