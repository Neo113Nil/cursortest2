package ru.ozon.app.android.tabbar.domain.provider;

import Sc.InterfaceC4008j;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001b\u0010\u001e\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001b\u0010!\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lru/ozon/app/android/tabbar/domain/provider/TabLinkGenerator;", "", "<init>", "()V", "", "cart$delegate", "LSc/j;", "getCart", "()Ljava/lang/String;", "cart", "favorites$delegate", "getFavorites", "favorites", "home$delegate", "getHome", "home", "bankTab$delegate", "getBankTab", "bankTab", "rkoTab$delegate", "getRkoTab", "rkoTab", "express$delegate", "getExpress", "express", "category$delegate", "getCategory", "category", "cabinet$delegate", "getCabinet", "cabinet", "teenSwipes$delegate", "getTeenSwipes", "teenSwipes", "ScreenType", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabLinkGenerator {

    @NotNull
    public static final TabLinkGenerator INSTANCE = new TabLinkGenerator();

    /* renamed from: cart$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j cart = LazyUtilsKt.unsafeLazy(TabLinkGenerator$cart$2.INSTANCE);

    /* renamed from: favorites$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j favorites = LazyUtilsKt.unsafeLazy(TabLinkGenerator$favorites$2.INSTANCE);

    /* renamed from: home$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j home = LazyUtilsKt.unsafeLazy(TabLinkGenerator$home$2.INSTANCE);

    /* renamed from: bankTab$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j bankTab = LazyUtilsKt.unsafeLazy(TabLinkGenerator$bankTab$2.INSTANCE);

    /* renamed from: rkoTab$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j rkoTab = LazyUtilsKt.unsafeLazy(TabLinkGenerator$rkoTab$2.INSTANCE);

    /* renamed from: express$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j express = LazyUtilsKt.unsafeLazy(TabLinkGenerator$express$2.INSTANCE);

    /* renamed from: category$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j category = LazyUtilsKt.unsafeLazy(TabLinkGenerator$category$2.INSTANCE);

    /* renamed from: cabinet$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j cabinet = LazyUtilsKt.unsafeLazy(TabLinkGenerator$cabinet$2.INSTANCE);

    /* renamed from: teenSwipes$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j teenSwipes = LazyUtilsKt.unsafeLazy(TabLinkGenerator$teenSwipes$2.INSTANCE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/tabbar/domain/provider/TabLinkGenerator$ScreenType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "CART", "CABINET", "FAVORITES", "HOME", "BANK_TAB", "RKO_TAB", "CATEGORY", "SWIPES", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScreenType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;

        @NotNull
        private final String type;
        public static final ScreenType CART = new ScreenType("CART", 0, "cart");
        public static final ScreenType CABINET = new ScreenType("CABINET", 1, "my");
        public static final ScreenType FAVORITES = new ScreenType("FAVORITES", 2, "favorites");
        public static final ScreenType HOME = new ScreenType("HOME", 3, "home");
        public static final ScreenType BANK_TAB = new ScreenType("BANK_TAB", 4, "banktab");
        public static final ScreenType RKO_TAB = new ScreenType("RKO_TAB", 5, "rkotab");
        public static final ScreenType CATEGORY = new ScreenType("CATEGORY", 6, "category");
        public static final ScreenType SWIPES = new ScreenType("SWIPES", 7, "matchShopping");

        private static final /* synthetic */ ScreenType[] $values() {
            return new ScreenType[]{CART, CABINET, FAVORITES, HOME, BANK_TAB, RKO_TAB, CATEGORY, SWIPES};
        }

        static {
            ScreenType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ScreenType(String str, int i11, String str2) {
            this.type = str2;
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    private TabLinkGenerator() {
    }

    @NotNull
    public final String getBankTab() {
        return (String) bankTab.getValue();
    }

    @NotNull
    public final String getCabinet() {
        return (String) cabinet.getValue();
    }

    @NotNull
    public final String getCart() {
        return (String) cart.getValue();
    }

    @NotNull
    public final String getCategory() {
        return (String) category.getValue();
    }

    @NotNull
    public final String getExpress() {
        return (String) express.getValue();
    }

    @NotNull
    public final String getFavorites() {
        return (String) favorites.getValue();
    }

    @NotNull
    public final String getHome() {
        return (String) home.getValue();
    }

    @NotNull
    public final String getRkoTab() {
        return (String) rkoTab.getValue();
    }

    @NotNull
    public final String getTeenSwipes() {
        return (String) teenSwipes.getValue();
    }
}
