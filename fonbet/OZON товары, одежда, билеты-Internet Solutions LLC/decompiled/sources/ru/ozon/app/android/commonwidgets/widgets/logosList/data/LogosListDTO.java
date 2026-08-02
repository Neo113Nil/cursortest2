package ru.ozon.app.android.commonwidgets.widgets.logosList.data;

import B3.p;
import G.g;
import H3.c;
import Ih.a;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO;", "", "items", "", "Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LogosListDTO {

    @NotNull
    private final List<Item> items;

    public LogosListDTO(@NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogosListDTO copy$default(LogosListDTO logosListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = logosListDTO.items;
        }
        return logosListDTO.copy(list);
    }

    @NotNull
    public final List<Item> component1() {
        return this.items;
    }

    @NotNull
    public final LogosListDTO copy(@NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new LogosListDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LogosListDTO) && Intrinsics.d(this.items, ((LogosListDTO) other).items);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("LogosListDTO(items=", ")", this.items);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;", "", "isSelected", "", "text", "", "subtext", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tooltipWithOnboardingAction", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;)V", "()Z", "getText", "()Ljava/lang/String;", "getSubtext", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTooltipWithOnboardingAction", "()Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final AtomActionDTO action;
        private final boolean isSelected;

        @NotNull
        private final String subtext;

        @NotNull
        private final String text;
        private final TooltipWithOnboardingActionDTO tooltipWithOnboardingAction;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Item(boolean z11, @NotNull String text, @NotNull String subtext, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subtext, "subtext");
            Intrinsics.checkNotNullParameter(action, "action");
            this.isSelected = z11;
            this.text = text;
            this.subtext = subtext;
            this.action = action;
            this.trackingInfo = map;
            this.tooltipWithOnboardingAction = tooltipWithOnboardingActionDTO;
        }

        public static /* synthetic */ Item copy$default(Item item, boolean z11, String str, String str2, AtomActionDTO atomActionDTO, Map map, TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = item.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = item.text;
            }
            if ((i11 & 4) != 0) {
                str2 = item.subtext;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & 16) != 0) {
                map = item.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                tooltipWithOnboardingActionDTO = item.tooltipWithOnboardingAction;
            }
            Map map2 = map;
            TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO2 = tooltipWithOnboardingActionDTO;
            return item.copy(z11, str, str2, atomActionDTO, map2, tooltipWithOnboardingActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubtext() {
            return this.subtext;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final TooltipWithOnboardingActionDTO getTooltipWithOnboardingAction() {
            return this.tooltipWithOnboardingAction;
        }

        @NotNull
        public final Item copy(boolean isSelected, @NotNull String text, @NotNull String subtext, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TooltipWithOnboardingActionDTO tooltipWithOnboardingAction) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subtext, "subtext");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Item(isSelected, text, subtext, action, trackingInfo, tooltipWithOnboardingAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.isSelected == item.isSelected && Intrinsics.d(this.text, item.text) && Intrinsics.d(this.subtext, item.subtext) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.trackingInfo, item.trackingInfo) && Intrinsics.d(this.tooltipWithOnboardingAction, item.tooltipWithOnboardingAction);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getSubtext() {
            return this.subtext;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final TooltipWithOnboardingActionDTO getTooltipWithOnboardingAction() {
            return this.tooltipWithOnboardingAction;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, g.a(g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.text), 31, this.subtext), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = this.tooltipWithOnboardingAction;
            return hashCode + (tooltipWithOnboardingActionDTO != null ? tooltipWithOnboardingActionDTO.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.text;
            String str2 = this.subtext;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = this.tooltipWithOnboardingAction;
            StringBuilder d11 = G.d("Item(isSelected=", ", text=", str, ", subtext=", z11);
            p.c(str2, ", action=", ", trackingInfo=", d11, atomActionDTO);
            d11.append(map);
            d11.append(", tooltipWithOnboardingAction=");
            d11.append(tooltipWithOnboardingActionDTO);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Item(boolean z11, String str, String str2, AtomActionDTO atomActionDTO, Map map, TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, str, str2, atomActionDTO, (i11 & 16) != 0 ? null : map, tooltipWithOnboardingActionDTO);
        }
    }
}
