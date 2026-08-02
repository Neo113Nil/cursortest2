package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data;

import Ih.a;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;", "", "items", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MenuItemDTO;", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "MenuItemDTO", "MorkovskMenuTextDTO", "MorkovskMenuIconDTO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskMenuDTO {
    public static final int $stable = 8;

    @NotNull
    private final MorkovskShadowButtonDTO button;

    @NotNull
    private final List<MenuItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MenuItemDTO;", "", "icon", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuIconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;", "info", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuIconDTO;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuIconDTO;", "getTitle", "()Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;", "getInfo", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MenuItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final MorkovskMenuIconDTO icon;
        private final MorkovskMenuTextDTO info;

        @NotNull
        private final MorkovskMenuTextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public MenuItemDTO(@NotNull MorkovskMenuIconDTO icon, @NotNull MorkovskMenuTextDTO title, MorkovskMenuTextDTO morkovskMenuTextDTO, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.title = title;
            this.info = morkovskMenuTextDTO;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ MenuItemDTO copy$default(MenuItemDTO menuItemDTO, MorkovskMenuIconDTO morkovskMenuIconDTO, MorkovskMenuTextDTO morkovskMenuTextDTO, MorkovskMenuTextDTO morkovskMenuTextDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                morkovskMenuIconDTO = menuItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                morkovskMenuTextDTO = menuItemDTO.title;
            }
            if ((i11 & 4) != 0) {
                morkovskMenuTextDTO2 = menuItemDTO.info;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = menuItemDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = menuItemDTO.trackingInfo;
            }
            Map map2 = map;
            MorkovskMenuTextDTO morkovskMenuTextDTO3 = morkovskMenuTextDTO2;
            return menuItemDTO.copy(morkovskMenuIconDTO, morkovskMenuTextDTO, morkovskMenuTextDTO3, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MorkovskMenuIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final MorkovskMenuTextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final MorkovskMenuTextDTO getInfo() {
            return this.info;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final MenuItemDTO copy(@NotNull MorkovskMenuIconDTO icon, @NotNull MorkovskMenuTextDTO title, MorkovskMenuTextDTO info, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new MenuItemDTO(icon, title, info, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenuItemDTO)) {
                return false;
            }
            MenuItemDTO menuItemDTO = (MenuItemDTO) other;
            return Intrinsics.d(this.icon, menuItemDTO.icon) && Intrinsics.d(this.title, menuItemDTO.title) && Intrinsics.d(this.info, menuItemDTO.info) && Intrinsics.d(this.action, menuItemDTO.action) && Intrinsics.d(this.trackingInfo, menuItemDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final MorkovskMenuIconDTO getIcon() {
            return this.icon;
        }

        public final MorkovskMenuTextDTO getInfo() {
            return this.info;
        }

        @NotNull
        public final MorkovskMenuTextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.title.hashCode() + (this.icon.hashCode() * 31)) * 31;
            MorkovskMenuTextDTO morkovskMenuTextDTO = this.info;
            int b11 = a.b(this.action, (hashCode + (morkovskMenuTextDTO == null ? 0 : morkovskMenuTextDTO.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            MorkovskMenuIconDTO morkovskMenuIconDTO = this.icon;
            MorkovskMenuTextDTO morkovskMenuTextDTO = this.title;
            MorkovskMenuTextDTO morkovskMenuTextDTO2 = this.info;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("MenuItemDTO(icon=");
            sb2.append(morkovskMenuIconDTO);
            sb2.append(", title=");
            sb2.append(morkovskMenuTextDTO);
            sb2.append(", info=");
            sb2.append(morkovskMenuTextDTO2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuIconDTO;", "", "icon", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MorkovskMenuIconDTO {
        public static final int $stable = 0;

        @NotNull
        private final String icon;

        @NotNull
        private final String tintColor;

        public MorkovskMenuIconDTO(@NotNull String icon, @NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            this.icon = icon;
            this.tintColor = tintColor;
        }

        public static /* synthetic */ MorkovskMenuIconDTO copy$default(MorkovskMenuIconDTO morkovskMenuIconDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = morkovskMenuIconDTO.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = morkovskMenuIconDTO.tintColor;
            }
            return morkovskMenuIconDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final MorkovskMenuIconDTO copy(@NotNull String icon, @NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            return new MorkovskMenuIconDTO(icon, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MorkovskMenuIconDTO)) {
                return false;
            }
            MorkovskMenuIconDTO morkovskMenuIconDTO = (MorkovskMenuIconDTO) other;
            return Intrinsics.d(this.icon, morkovskMenuIconDTO.icon) && Intrinsics.d(this.tintColor, morkovskMenuIconDTO.tintColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return this.tintColor.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("MorkovskMenuIconDTO(icon=", this.icon, ", tintColor=", this.tintColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO$MorkovskMenuTextDTO;", "", "text", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MorkovskMenuTextDTO {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        @NotNull
        private final String tintColor;

        public MorkovskMenuTextDTO(@NotNull String text, @NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            this.text = text;
            this.tintColor = tintColor;
        }

        public static /* synthetic */ MorkovskMenuTextDTO copy$default(MorkovskMenuTextDTO morkovskMenuTextDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = morkovskMenuTextDTO.text;
            }
            if ((i11 & 2) != 0) {
                str2 = morkovskMenuTextDTO.tintColor;
            }
            return morkovskMenuTextDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final MorkovskMenuTextDTO copy(@NotNull String text, @NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            return new MorkovskMenuTextDTO(text, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MorkovskMenuTextDTO)) {
                return false;
            }
            MorkovskMenuTextDTO morkovskMenuTextDTO = (MorkovskMenuTextDTO) other;
            return Intrinsics.d(this.text, morkovskMenuTextDTO.text) && Intrinsics.d(this.tintColor, morkovskMenuTextDTO.tintColor);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return this.tintColor.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("MorkovskMenuTextDTO(text=", this.text, ", tintColor=", this.tintColor, ")");
        }
    }

    public MorkovskMenuDTO(@NotNull List<MenuItemDTO> items, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.items = items;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MorkovskMenuDTO copy$default(MorkovskMenuDTO morkovskMenuDTO, List list, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = morkovskMenuDTO.items;
        }
        if ((i11 & 2) != 0) {
            morkovskShadowButtonDTO = morkovskMenuDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = morkovskMenuDTO.trackingInfo;
        }
        return morkovskMenuDTO.copy(list, morkovskShadowButtonDTO, map);
    }

    @NotNull
    public final List<MenuItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final MorkovskMenuDTO copy(@NotNull List<MenuItemDTO> items, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        return new MorkovskMenuDTO(items, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskMenuDTO)) {
            return false;
        }
        MorkovskMenuDTO morkovskMenuDTO = (MorkovskMenuDTO) other;
        return Intrinsics.d(this.items, morkovskMenuDTO.items) && Intrinsics.d(this.button, morkovskMenuDTO.button) && Intrinsics.d(this.trackingInfo, morkovskMenuDTO.trackingInfo);
    }

    @NotNull
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<MenuItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + (this.items.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<MenuItemDTO> list = this.items;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MorkovskMenuDTO(items=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(morkovskShadowButtonDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
