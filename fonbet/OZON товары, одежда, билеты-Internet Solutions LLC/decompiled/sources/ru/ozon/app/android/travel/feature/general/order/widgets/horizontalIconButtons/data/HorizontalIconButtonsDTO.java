package ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.data;

import B3.p;
import Ih.a;
import Kk.c;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO;", "", "buttons", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO$IconButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IconButtonDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HorizontalIconButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<IconButtonDTO> buttons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/data/HorizontalIconButtonsDTO$IconButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconButtonDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public IconButtonDTO(@NotNull IconDTO icon, @NotNull TextDTO title, String str, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.title = title;
            this.backgroundColor = str;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ IconButtonDTO copy$default(IconButtonDTO iconButtonDTO, IconDTO iconDTO, TextDTO textDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = iconButtonDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = iconButtonDTO.title;
            }
            if ((i11 & 4) != 0) {
                str = iconButtonDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = iconButtonDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = iconButtonDTO.trackingInfo;
            }
            Map map2 = map;
            String str2 = str;
            return iconButtonDTO.copy(iconDTO, textDTO, str2, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
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
        public final IconButtonDTO copy(@NotNull IconDTO icon, @NotNull TextDTO title, String backgroundColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new IconButtonDTO(icon, title, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconButtonDTO)) {
                return false;
            }
            IconButtonDTO iconButtonDTO = (IconButtonDTO) other;
            return Intrinsics.d(this.icon, iconButtonDTO.icon) && Intrinsics.d(this.title, iconButtonDTO.title) && Intrinsics.d(this.backgroundColor, iconButtonDTO.backgroundColor) && Intrinsics.d(this.action, iconButtonDTO.action) && Intrinsics.d(this.trackingInfo, iconButtonDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int b11 = a.b(this.action, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("IconButtonDTO(icon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
            p.c(str, ", action=", ", trackingInfo=", i11, atomActionDTO);
            return P.f(i11, map, ")");
        }
    }

    public HorizontalIconButtonsDTO(@NotNull List<IconButtonDTO> buttons, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalIconButtonsDTO copy$default(HorizontalIconButtonsDTO horizontalIconButtonsDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = horizontalIconButtonsDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            map = horizontalIconButtonsDTO.trackingInfo;
        }
        return horizontalIconButtonsDTO.copy(list, map);
    }

    @NotNull
    public final List<IconButtonDTO> component1() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final HorizontalIconButtonsDTO copy(@NotNull List<IconButtonDTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new HorizontalIconButtonsDTO(buttons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalIconButtonsDTO)) {
            return false;
        }
        HorizontalIconButtonsDTO horizontalIconButtonsDTO = (HorizontalIconButtonsDTO) other;
        return Intrinsics.d(this.buttons, horizontalIconButtonsDTO.buttons) && Intrinsics.d(this.trackingInfo, horizontalIconButtonsDTO.trackingInfo);
    }

    @NotNull
    public final List<IconButtonDTO> getButtons() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("HorizontalIconButtonsDTO(buttons=", ", trackingInfo=", ")", this.buttons, this.trackingInfo);
    }

    public HorizontalIconButtonsDTO(List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, map);
    }
}
