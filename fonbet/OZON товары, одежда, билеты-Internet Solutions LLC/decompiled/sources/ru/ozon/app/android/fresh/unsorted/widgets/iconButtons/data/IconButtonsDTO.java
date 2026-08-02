package ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.data;

import Bi.b;
import G.g;
import Ih.a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO;", "", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO$IconButton;", "backgroundTintColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getBackgroundTintColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IconButton", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IconButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundTintColor;

    @NotNull
    private final List<IconButton> items;

    public IconButtonsDTO(@NotNull List<IconButton> items, @NotNull String backgroundTintColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundTintColor, "backgroundTintColor");
        this.items = items;
        this.backgroundTintColor = backgroundTintColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IconButtonsDTO copy$default(IconButtonsDTO iconButtonsDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = iconButtonsDTO.items;
        }
        if ((i11 & 2) != 0) {
            str = iconButtonsDTO.backgroundTintColor;
        }
        return iconButtonsDTO.copy(list, str);
    }

    @NotNull
    public final List<IconButton> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    @NotNull
    public final IconButtonsDTO copy(@NotNull List<IconButton> items, @NotNull String backgroundTintColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundTintColor, "backgroundTintColor");
        return new IconButtonsDTO(items, backgroundTintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonsDTO)) {
            return false;
        }
        IconButtonsDTO iconButtonsDTO = (IconButtonsDTO) other;
        return Intrinsics.d(this.items, iconButtonsDTO.items) && Intrinsics.d(this.backgroundTintColor, iconButtonsDTO.backgroundTintColor);
    }

    @NotNull
    public final String getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    @NotNull
    public final List<IconButton> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.backgroundTintColor.hashCode() + (this.items.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.e("IconButtonsDTO(items=", ", backgroundTintColor=", this.backgroundTintColor, ")", this.items);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO$IconButton;", "", "icon", "", "tintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconButton {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String icon;

        @NotNull
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public IconButton(@NotNull String icon, @NotNull String tintColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.tintColor = tintColor;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconButton copy$default(IconButton iconButton, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = iconButton.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = iconButton.tintColor;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = iconButton.action;
            }
            if ((i11 & 8) != 0) {
                map = iconButton.trackingInfo;
            }
            return iconButton.copy(str, str2, atomActionDTO, map);
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
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final IconButton copy(@NotNull String icon, @NotNull String tintColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            Intrinsics.checkNotNullParameter(action, "action");
            return new IconButton(icon, tintColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconButton)) {
                return false;
            }
            IconButton iconButton = (IconButton) other;
            return Intrinsics.d(this.icon, iconButton.icon) && Intrinsics.d(this.tintColor, iconButton.tintColor) && Intrinsics.d(this.action, iconButton.action) && Intrinsics.d(this.trackingInfo, iconButton.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, g.a(this.icon.hashCode() * 31, 31, this.tintColor), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.tintColor;
            return D40.a.d(C3660k.d("IconButton(icon=", str, ", tintColor=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }

        public /* synthetic */ IconButton(String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomActionDTO, (i11 & 8) != 0 ? null : map);
        }
    }
}
