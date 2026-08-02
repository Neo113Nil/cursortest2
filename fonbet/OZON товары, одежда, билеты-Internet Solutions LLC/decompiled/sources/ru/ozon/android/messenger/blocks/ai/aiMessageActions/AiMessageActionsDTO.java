package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import D3.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO;", "", "sourcesBadge", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge;", "iconButtons", "", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;", "<init>", "(Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge;Ljava/util/List;)V", "getSourcesBadge", "()Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge;", "getIconButtons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SourcesBadge", "IconButtonsWithStyle", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiMessageActionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<IconButtonsWithStyle> iconButtons;
    private final SourcesBadge sourcesBadge;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "menuInfo", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMenuInfo", "()Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MenuInfo", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SourcesBadge {
        public static final int $stable = 8;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final MenuInfo menuInfo;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "menuItems", "", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo$MenuItem;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMenuItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MenuItem", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class MenuInfo {
            public static final int $stable = 8;

            @NotNull
            private final List<MenuItem> menuItems;

            @NotNull
            private final TextDTO title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$SourcesBadge$MenuInfo$MenuItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class MenuItem {
                public static final int $stable = 8;

                @NotNull
                private final AtomActionDTO action;
                private final TextDTO subtitle;
                private final TestInfo testInfo;

                @NotNull
                private final TextDTO title;
                private final Map<String, MessengerTrackingInfo> trackingInfo;

                public MenuItem(@NotNull TextDTO title, TextDTO textDTO, @NotNull AtomActionDTO action, TestInfo testInfo, Map<String, MessengerTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.title = title;
                    this.subtitle = textDTO;
                    this.action = action;
                    this.testInfo = testInfo;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ MenuItem copy$default(MenuItem menuItem, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, TestInfo testInfo, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = menuItem.title;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = menuItem.subtitle;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = menuItem.action;
                    }
                    if ((i11 & 8) != 0) {
                        testInfo = menuItem.testInfo;
                    }
                    if ((i11 & 16) != 0) {
                        map = menuItem.trackingInfo;
                    }
                    Map map2 = map;
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    return menuItem.copy(textDTO, textDTO2, atomActionDTO2, testInfo, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                /* renamed from: component4, reason: from getter */
                public final TestInfo getTestInfo() {
                    return this.testInfo;
                }

                public final Map<String, MessengerTrackingInfo> component5() {
                    return this.trackingInfo;
                }

                @NotNull
                public final MenuItem copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull AtomActionDTO action, TestInfo testInfo, Map<String, MessengerTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(action, "action");
                    return new MenuItem(title, subtitle, action, testInfo, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MenuItem)) {
                        return false;
                    }
                    MenuItem menuItem = (MenuItem) other;
                    return Intrinsics.d(this.title, menuItem.title) && Intrinsics.d(this.subtitle, menuItem.subtitle) && Intrinsics.d(this.action, menuItem.action) && Intrinsics.d(this.testInfo, menuItem.testInfo) && Intrinsics.d(this.trackingInfo, menuItem.trackingInfo);
                }

                @NotNull
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                public final TestInfo getTestInfo() {
                    return this.testInfo;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    TextDTO textDTO = this.subtitle;
                    int b11 = Ih.a.b(this.action, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
                    TestInfo testInfo = this.testInfo;
                    int hashCode2 = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                    Map<String, MessengerTrackingInfo> map = this.trackingInfo;
                    return hashCode2 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.subtitle;
                    AtomActionDTO atomActionDTO = this.action;
                    TestInfo testInfo = this.testInfo;
                    Map<String, MessengerTrackingInfo> map = this.trackingInfo;
                    StringBuilder g10 = g.g("MenuItem(title=", textDTO, ", subtitle=", textDTO2, ", action=");
                    g10.append(atomActionDTO);
                    g10.append(", testInfo=");
                    g10.append(testInfo);
                    g10.append(", trackingInfo=");
                    return P.f(g10, map, ")");
                }
            }

            public MenuInfo(@NotNull TextDTO title, @NotNull List<MenuItem> menuItems) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                this.title = title;
                this.menuItems = menuItems;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MenuInfo copy$default(MenuInfo menuInfo, TextDTO textDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = menuInfo.title;
                }
                if ((i11 & 2) != 0) {
                    list = menuInfo.menuItems;
                }
                return menuInfo.copy(textDTO, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            public final List<MenuItem> component2() {
                return this.menuItems;
            }

            @NotNull
            public final MenuInfo copy(@NotNull TextDTO title, @NotNull List<MenuItem> menuItems) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                return new MenuInfo(title, menuItems);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MenuInfo)) {
                    return false;
                }
                MenuInfo menuInfo = (MenuInfo) other;
                return Intrinsics.d(this.title, menuInfo.title) && Intrinsics.d(this.menuItems, menuInfo.menuItems);
            }

            @NotNull
            public final List<MenuItem> getMenuItems() {
                return this.menuItems;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.menuItems.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "MenuInfo(title=" + this.title + ", menuItems=" + this.menuItems + ")";
            }
        }

        public SourcesBadge(@NotNull BadgeDTO badge, @NotNull MenuInfo menuInfo) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(menuInfo, "menuInfo");
            this.badge = badge;
            this.menuInfo = menuInfo;
        }

        public static /* synthetic */ SourcesBadge copy$default(SourcesBadge sourcesBadge, BadgeDTO badgeDTO, MenuInfo menuInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = sourcesBadge.badge;
            }
            if ((i11 & 2) != 0) {
                menuInfo = sourcesBadge.menuInfo;
            }
            return sourcesBadge.copy(badgeDTO, menuInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final MenuInfo getMenuInfo() {
            return this.menuInfo;
        }

        @NotNull
        public final SourcesBadge copy(@NotNull BadgeDTO badge, @NotNull MenuInfo menuInfo) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(menuInfo, "menuInfo");
            return new SourcesBadge(badge, menuInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SourcesBadge)) {
                return false;
            }
            SourcesBadge sourcesBadge = (SourcesBadge) other;
            return Intrinsics.d(this.badge, sourcesBadge.badge) && Intrinsics.d(this.menuInfo, sourcesBadge.menuInfo);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final MenuInfo getMenuInfo() {
            return this.menuInfo;
        }

        public int hashCode() {
            return this.menuInfo.hashCode() + (this.badge.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SourcesBadge(badge=" + this.badge + ", menuInfo=" + this.menuInfo + ")";
        }
    }

    public AiMessageActionsDTO(SourcesBadge sourcesBadge, @NotNull List<IconButtonsWithStyle> iconButtons) {
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        this.sourcesBadge = sourcesBadge;
        this.iconButtons = iconButtons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiMessageActionsDTO copy$default(AiMessageActionsDTO aiMessageActionsDTO, SourcesBadge sourcesBadge, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sourcesBadge = aiMessageActionsDTO.sourcesBadge;
        }
        if ((i11 & 2) != 0) {
            list = aiMessageActionsDTO.iconButtons;
        }
        return aiMessageActionsDTO.copy(sourcesBadge, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SourcesBadge getSourcesBadge() {
        return this.sourcesBadge;
    }

    @NotNull
    public final List<IconButtonsWithStyle> component2() {
        return this.iconButtons;
    }

    @NotNull
    public final AiMessageActionsDTO copy(SourcesBadge sourcesBadge, @NotNull List<IconButtonsWithStyle> iconButtons) {
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        return new AiMessageActionsDTO(sourcesBadge, iconButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiMessageActionsDTO)) {
            return false;
        }
        AiMessageActionsDTO aiMessageActionsDTO = (AiMessageActionsDTO) other;
        return Intrinsics.d(this.sourcesBadge, aiMessageActionsDTO.sourcesBadge) && Intrinsics.d(this.iconButtons, aiMessageActionsDTO.iconButtons);
    }

    @NotNull
    public final List<IconButtonsWithStyle> getIconButtons() {
        return this.iconButtons;
    }

    public final SourcesBadge getSourcesBadge() {
        return this.sourcesBadge;
    }

    public int hashCode() {
        SourcesBadge sourcesBadge = this.sourcesBadge;
        return this.iconButtons.hashCode() + ((sourcesBadge == null ? 0 : sourcesBadge.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AiMessageActionsDTO(sourcesBadge=" + this.sourcesBadge + ", iconButtons=" + this.iconButtons + ")";
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;", "", "default", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "clicked", "ttl", "", "<init>", "(Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;Ljava/lang/Integer;)V", "getDefault", "()Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "getClicked", "getTtl", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;", "equals", "", "other", "hashCode", "toString", "", "IconButtonWithSelected", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class IconButtonsWithStyle {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonWithSelected clicked;

        @NotNull
        private final IconButtonWithSelected default;
        private final Integer ttl;

        public IconButtonsWithStyle(@NotNull IconButtonWithSelected iconButtonWithSelected, IconButtonWithSelected iconButtonWithSelected2, Integer num) {
            Intrinsics.checkNotNullParameter(iconButtonWithSelected, "default");
            this.default = iconButtonWithSelected;
            this.clicked = iconButtonWithSelected2;
            this.ttl = num;
        }

        public static /* synthetic */ IconButtonsWithStyle copy$default(IconButtonsWithStyle iconButtonsWithStyle, IconButtonWithSelected iconButtonWithSelected, IconButtonWithSelected iconButtonWithSelected2, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonWithSelected = iconButtonsWithStyle.default;
            }
            if ((i11 & 2) != 0) {
                iconButtonWithSelected2 = iconButtonsWithStyle.clicked;
            }
            if ((i11 & 4) != 0) {
                num = iconButtonsWithStyle.ttl;
            }
            return iconButtonsWithStyle.copy(iconButtonWithSelected, iconButtonWithSelected2, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonWithSelected getDefault() {
            return this.default;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonWithSelected getClicked() {
            return this.clicked;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getTtl() {
            return this.ttl;
        }

        @NotNull
        public final IconButtonsWithStyle copy(@NotNull IconButtonWithSelected r22, IconButtonWithSelected clicked, Integer ttl) {
            Intrinsics.checkNotNullParameter(r22, "default");
            return new IconButtonsWithStyle(r22, clicked, ttl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconButtonsWithStyle)) {
                return false;
            }
            IconButtonsWithStyle iconButtonsWithStyle = (IconButtonsWithStyle) other;
            return Intrinsics.d(this.default, iconButtonsWithStyle.default) && Intrinsics.d(this.clicked, iconButtonsWithStyle.clicked) && Intrinsics.d(this.ttl, iconButtonsWithStyle.ttl);
        }

        public final IconButtonWithSelected getClicked() {
            return this.clicked;
        }

        @NotNull
        public final IconButtonWithSelected getDefault() {
            return this.default;
        }

        public final Integer getTtl() {
            return this.ttl;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            IconButtonWithSelected iconButtonWithSelected = this.clicked;
            int hashCode2 = (hashCode + (iconButtonWithSelected == null ? 0 : iconButtonWithSelected.hashCode())) * 31;
            Integer num = this.ttl;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconButtonWithSelected iconButtonWithSelected = this.default;
            IconButtonWithSelected iconButtonWithSelected2 = this.clicked;
            Integer num = this.ttl;
            StringBuilder sb2 = new StringBuilder("IconButtonsWithStyle(default=");
            sb2.append(iconButtonWithSelected);
            sb2.append(", clicked=");
            sb2.append(iconButtonWithSelected2);
            sb2.append(", ttl=");
            return Ep.a.c(sb2, num, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "", "icon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "isSelected", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)V", "getIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "equals", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconButtonWithSelected {
            public static final int $stable = IconButtonV3DTO.$stable;

            @NotNull
            private final IconButtonV3DTO icon;
            private final Boolean isSelected;

            public IconButtonWithSelected(@NotNull IconButtonV3DTO icon, Boolean bool) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.isSelected = bool;
            }

            public static /* synthetic */ IconButtonWithSelected copy$default(IconButtonWithSelected iconButtonWithSelected, IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconButtonV3DTO = iconButtonWithSelected.icon;
                }
                if ((i11 & 2) != 0) {
                    bool = iconButtonWithSelected.isSelected;
                }
                return iconButtonWithSelected.copy(iconButtonV3DTO, bool);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconButtonV3DTO getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public final IconButtonWithSelected copy(@NotNull IconButtonV3DTO icon, Boolean isSelected) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new IconButtonWithSelected(icon, isSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconButtonWithSelected)) {
                    return false;
                }
                IconButtonWithSelected iconButtonWithSelected = (IconButtonWithSelected) other;
                return Intrinsics.d(this.icon, iconButtonWithSelected.icon) && Intrinsics.d(this.isSelected, iconButtonWithSelected.isSelected);
            }

            @NotNull
            public final IconButtonV3DTO getIcon() {
                return this.icon;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                Boolean bool = this.isSelected;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            public final Boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "IconButtonWithSelected(icon=" + this.icon + ", isSelected=" + this.isSelected + ")";
            }

            public /* synthetic */ IconButtonWithSelected(IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(iconButtonV3DTO, (i11 & 2) != 0 ? Boolean.FALSE : bool);
            }
        }
    }
}
