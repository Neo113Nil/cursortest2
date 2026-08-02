package ru.ozon.app.android.tabbar.data;

import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;
import ru.ozon.app.android.tabbar.R$raw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigAnimations;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "FRESH_HOT_FOOD", "FRESH", "SERVICES_DISCOUNT", "SERVICES", "SOCIAL", "TRAVEL", "FASHION", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigAnimations {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ TabConfigAnimations[] $VALUES;
    private final int resId;

    @i(name = "animation_fresh_hot_food")
    public static final TabConfigAnimations FRESH_HOT_FOOD = new TabConfigAnimations("FRESH_HOT_FOOD", 0, R$raw.animation_fresh_hot_food);

    @i(name = "animation_fresh_apple")
    public static final TabConfigAnimations FRESH = new TabConfigAnimations("FRESH", 1, R$raw.animation_fresh_apple);

    @i(name = "animation_services_discount")
    public static final TabConfigAnimations SERVICES_DISCOUNT = new TabConfigAnimations("SERVICES_DISCOUNT", 2, R$raw.animation_services_discount);

    @i(name = "animation_services")
    public static final TabConfigAnimations SERVICES = new TabConfigAnimations("SERVICES", 3, R$raw.animation_services);

    @i(name = "animation_social_play")
    public static final TabConfigAnimations SOCIAL = new TabConfigAnimations("SOCIAL", 4, R$raw.animation_social_play);

    @i(name = "animation_travel_plane")
    public static final TabConfigAnimations TRAVEL = new TabConfigAnimations("TRAVEL", 5, R$raw.animation_travel_plane);

    @i(name = "animation_fashion_hanger")
    public static final TabConfigAnimations FASHION = new TabConfigAnimations("FASHION", 6, R$raw.animation_fashion_hanger);

    private static final /* synthetic */ TabConfigAnimations[] $values() {
        return new TabConfigAnimations[]{FRESH_HOT_FOOD, FRESH, SERVICES_DISCOUNT, SERVICES, SOCIAL, TRAVEL, FASHION};
    }

    static {
        TabConfigAnimations[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TabConfigAnimations(String str, int i11, int i12) {
        this.resId = i12;
    }

    public static TabConfigAnimations valueOf(String str) {
        return (TabConfigAnimations) Enum.valueOf(TabConfigAnimations.class, str);
    }

    public static TabConfigAnimations[] values() {
        return (TabConfigAnimations[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }
}
