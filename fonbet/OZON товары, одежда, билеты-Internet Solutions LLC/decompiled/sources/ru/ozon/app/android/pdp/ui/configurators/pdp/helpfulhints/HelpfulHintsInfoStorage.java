package ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints;

import Sc.o;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0003R0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsInfoStorage;", "", "<init>", "()V", "", "sku", "", "time", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "behavior", "", "addToSetOfSku", "(Ljava/lang/String;ILru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;)V", "getTime", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;)Ljava/lang/Integer;", "clearOrderDoneLiteInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mapOfSku", "Ljava/util/HashMap;", "mapOfSkuFav", "mapOfSkuCart", "mapOfOrderDoneLite", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpfulHintsInfoStorage {

    @NotNull
    public static final HelpfulHintsInfoStorage INSTANCE = new HelpfulHintsInfoStorage();

    @NotNull
    private static final HashMap<String, Integer> mapOfSku = new HashMap<>();

    @NotNull
    private static final HashMap<String, Integer> mapOfSkuFav = new HashMap<>();

    @NotNull
    private static final HashMap<String, Integer> mapOfSkuCart = new HashMap<>();

    @NotNull
    private static final HashMap<String, Integer> mapOfOrderDoneLite = new HashMap<>();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HelpfulHintsVO.NotificationBehavior.values().length];
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ADD_TO_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ADD_TO_FAV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ORDER_DONE_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HelpfulHintsInfoStorage() {
    }

    public final void addToSetOfSku(@NotNull String sku, int time, @NotNull HelpfulHintsVO.NotificationBehavior behavior) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        int i11 = WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()];
        if (i11 == 1) {
            mapOfSkuCart.put(sku, Integer.valueOf(time));
            return;
        }
        if (i11 == 2) {
            mapOfSkuFav.put(sku, Integer.valueOf(time));
        } else if (i11 == 3) {
            mapOfOrderDoneLite.put(sku, Integer.valueOf(time));
        } else {
            if (i11 != 4) {
                throw new o();
            }
            mapOfSku.put(sku, Integer.valueOf(time));
        }
    }

    public final void clearOrderDoneLiteInfo() {
        mapOfOrderDoneLite.clear();
    }

    public final Integer getTime(@NotNull String sku, @NotNull HelpfulHintsVO.NotificationBehavior behavior) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        int i11 = WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()];
        if (i11 == 1) {
            return mapOfSkuCart.get(sku);
        }
        if (i11 == 2) {
            return mapOfSkuFav.get(sku);
        }
        if (i11 == 3) {
            return mapOfOrderDoneLite.get(sku);
        }
        if (i11 == 4) {
            return mapOfSku.get(sku);
        }
        throw new o();
    }
}
