package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data;

import B0.C2454a;
import Bi.b;
import Bl.C2639a;
import C.o0;
import El.C2971a;
import G.g;
import T7.P;
import Tz.C4055a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$Tab;", "tabBackgroundColor", "", "activeTabBackgroundColor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getTabBackgroundColor", "()Ljava/lang/String;", "getActiveTabBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tab", "AviaDetailsContent", "LuggageContent", "ReturnPolicyContent", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaDetailedInfoV3DTO {
    public static final int $stable = 8;
    private final String activeTabBackgroundColor;

    @NotNull
    private final List<Tab> items;
    private final String tabBackgroundColor;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent;", "", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent$LuggageItem;", "noticeLuggage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getItems", "()Ljava/util/List;", "getNoticeLuggage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LuggageItem", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LuggageContent {
        public static final int $stable = 8;

        @NotNull
        private final List<LuggageItem> items;

        @NotNull
        private final TextDTO noticeLuggage;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent$LuggageItem;", "", "route", "Lru/ozon/uni/atoms/data/text/TextDTO;", "airlineLogo", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subAirlineLogo", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "backgroundColor", "", "viewTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getRoute", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubAirlineLogo", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getViewTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LuggageItem {
            public static final int $stable = 8;

            @NotNull
            private final IconDTO airlineLogo;
            private final String backgroundColor;

            @NotNull
            private final List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells;

            @NotNull
            private final TextDTO route;
            private final IconDTO subAirlineLogo;
            private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

            public LuggageItem(@NotNull TextDTO route, @NotNull IconDTO airlineLogo, IconDTO iconDTO, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells, String str, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.route = route;
                this.airlineLogo = airlineLogo;
                this.subAirlineLogo = iconDTO;
                this.cells = cells;
                this.backgroundColor = str;
                this.viewTrackingInfo = map;
            }

            public static /* synthetic */ LuggageItem copy$default(LuggageItem luggageItem, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, List list, String str, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = luggageItem.route;
                }
                if ((i11 & 2) != 0) {
                    iconDTO = luggageItem.airlineLogo;
                }
                if ((i11 & 4) != 0) {
                    iconDTO2 = luggageItem.subAirlineLogo;
                }
                if ((i11 & 8) != 0) {
                    list = luggageItem.cells;
                }
                if ((i11 & 16) != 0) {
                    str = luggageItem.backgroundColor;
                }
                if ((i11 & 32) != 0) {
                    map = luggageItem.viewTrackingInfo;
                }
                String str2 = str;
                Map map2 = map;
                return luggageItem.copy(textDTO, iconDTO, iconDTO2, list, str2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getRoute() {
                return this.route;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            /* renamed from: component3, reason: from getter */
            public final IconDTO getSubAirlineLogo() {
                return this.subAirlineLogo;
            }

            @NotNull
            public final List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> component4() {
                return this.cells;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.viewTrackingInfo;
            }

            @NotNull
            public final LuggageItem copy(@NotNull TextDTO route, @NotNull IconDTO airlineLogo, IconDTO subAirlineLogo, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells, String backgroundColor, Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(cells, "cells");
                return new LuggageItem(route, airlineLogo, subAirlineLogo, cells, backgroundColor, viewTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuggageItem)) {
                    return false;
                }
                LuggageItem luggageItem = (LuggageItem) other;
                return Intrinsics.d(this.route, luggageItem.route) && Intrinsics.d(this.airlineLogo, luggageItem.airlineLogo) && Intrinsics.d(this.subAirlineLogo, luggageItem.subAirlineLogo) && Intrinsics.d(this.cells, luggageItem.cells) && Intrinsics.d(this.backgroundColor, luggageItem.backgroundColor) && Intrinsics.d(this.viewTrackingInfo, luggageItem.viewTrackingInfo);
            }

            @NotNull
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> getCells() {
                return this.cells;
            }

            @NotNull
            public final TextDTO getRoute() {
                return this.route;
            }

            public final IconDTO getSubAirlineLogo() {
                return this.subAirlineLogo;
            }

            public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public int hashCode() {
                int a11 = C2971a.a(this.airlineLogo, this.route.hashCode() * 31, 31);
                IconDTO iconDTO = this.subAirlineLogo;
                int b11 = g.b((a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.cells);
                String str = this.backgroundColor;
                int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.route;
                IconDTO iconDTO = this.airlineLogo;
                IconDTO iconDTO2 = this.subAirlineLogo;
                List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> list = this.cells;
                String str = this.backgroundColor;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                StringBuilder d11 = C2639a.d("LuggageItem(route=", ", airlineLogo=", ", subAirlineLogo=", iconDTO, textDTO);
                d11.append(iconDTO2);
                d11.append(", cells=");
                d11.append(list);
                d11.append(", backgroundColor=");
                return C4070a.a(d11, str, ", viewTrackingInfo=", map, ")");
            }
        }

        public LuggageContent(@NotNull List<LuggageItem> items, @NotNull TextDTO noticeLuggage) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(noticeLuggage, "noticeLuggage");
            this.items = items;
            this.noticeLuggage = noticeLuggage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LuggageContent copy$default(LuggageContent luggageContent, List list, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = luggageContent.items;
            }
            if ((i11 & 2) != 0) {
                textDTO = luggageContent.noticeLuggage;
            }
            return luggageContent.copy(list, textDTO);
        }

        @NotNull
        public final List<LuggageItem> component1() {
            return this.items;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getNoticeLuggage() {
            return this.noticeLuggage;
        }

        @NotNull
        public final LuggageContent copy(@NotNull List<LuggageItem> items, @NotNull TextDTO noticeLuggage) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(noticeLuggage, "noticeLuggage");
            return new LuggageContent(items, noticeLuggage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageContent)) {
                return false;
            }
            LuggageContent luggageContent = (LuggageContent) other;
            return Intrinsics.d(this.items, luggageContent.items) && Intrinsics.d(this.noticeLuggage, luggageContent.noticeLuggage);
        }

        @NotNull
        public final List<LuggageItem> getItems() {
            return this.items;
        }

        @NotNull
        public final TextDTO getNoticeLuggage() {
            return this.noticeLuggage;
        }

        public int hashCode() {
            return this.noticeLuggage.hashCode() + (this.items.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageContent(items=" + this.items + ", noticeLuggage=" + this.noticeLuggage + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$Disclaimer;", "routeBlocks", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$RouteBlockReturnPolicy;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$Disclaimer;Ljava/util/List;)V", "getDisclaimer", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$Disclaimer;", "getRouteBlocks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Disclaimer", "RouteBlockReturnPolicy", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ReturnPolicyContent {
        public static final int $stable = 8;
        private final Disclaimer disclaimer;

        @NotNull
        private final List<RouteBlockReturnPolicy> routeBlocks;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$Disclaimer;", "", "texts", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTexts", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Disclaimer {
            public static final int $stable = 8;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final List<TextDTO> texts;

            public Disclaimer(@NotNull List<TextDTO> texts, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(texts, "texts");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.texts = texts;
                this.backgroundColor = backgroundColor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Disclaimer copy$default(Disclaimer disclaimer, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = disclaimer.texts;
                }
                if ((i11 & 2) != 0) {
                    str = disclaimer.backgroundColor;
                }
                return disclaimer.copy(list, str);
            }

            @NotNull
            public final List<TextDTO> component1() {
                return this.texts;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final Disclaimer copy(@NotNull List<TextDTO> texts, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(texts, "texts");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new Disclaimer(texts, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disclaimer)) {
                    return false;
                }
                Disclaimer disclaimer = (Disclaimer) other;
                return Intrinsics.d(this.texts, disclaimer.texts) && Intrinsics.d(this.backgroundColor, disclaimer.backgroundColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final List<TextDTO> getTexts() {
                return this.texts;
            }

            public int hashCode() {
                return this.backgroundColor.hashCode() + (this.texts.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return b.e("Disclaimer(texts=", ", backgroundColor=", this.backgroundColor, ")", this.texts);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$RouteBlockReturnPolicy;", "", "airlineLogo", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "route", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRoute", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RouteBlockReturnPolicy {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO airlineLogo;

            @NotNull
            private final TextDTO route;

            @NotNull
            private final TextDTO text;

            public RouteBlockReturnPolicy(@NotNull IconDTO airlineLogo, @NotNull TextDTO route, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(text, "text");
                this.airlineLogo = airlineLogo;
                this.route = route;
                this.text = text;
            }

            public static /* synthetic */ RouteBlockReturnPolicy copy$default(RouteBlockReturnPolicy routeBlockReturnPolicy, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = routeBlockReturnPolicy.airlineLogo;
                }
                if ((i11 & 2) != 0) {
                    textDTO = routeBlockReturnPolicy.route;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = routeBlockReturnPolicy.text;
                }
                return routeBlockReturnPolicy.copy(iconDTO, textDTO, textDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getRoute() {
                return this.route;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            public final RouteBlockReturnPolicy copy(@NotNull IconDTO airlineLogo, @NotNull TextDTO route, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(text, "text");
                return new RouteBlockReturnPolicy(airlineLogo, route, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RouteBlockReturnPolicy)) {
                    return false;
                }
                RouteBlockReturnPolicy routeBlockReturnPolicy = (RouteBlockReturnPolicy) other;
                return Intrinsics.d(this.airlineLogo, routeBlockReturnPolicy.airlineLogo) && Intrinsics.d(this.route, routeBlockReturnPolicy.route) && Intrinsics.d(this.text, routeBlockReturnPolicy.text);
            }

            @NotNull
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            @NotNull
            public final TextDTO getRoute() {
                return this.route;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + Ns.b.a(this.route, this.airlineLogo.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.airlineLogo;
                TextDTO textDTO = this.route;
                return Tl.b.e(b.i("RouteBlockReturnPolicy(airlineLogo=", ", route=", ", text=", iconDTO, textDTO), this.text, ")");
            }
        }

        public ReturnPolicyContent(Disclaimer disclaimer, @NotNull List<RouteBlockReturnPolicy> routeBlocks) {
            Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
            this.disclaimer = disclaimer;
            this.routeBlocks = routeBlocks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReturnPolicyContent copy$default(ReturnPolicyContent returnPolicyContent, Disclaimer disclaimer, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                disclaimer = returnPolicyContent.disclaimer;
            }
            if ((i11 & 2) != 0) {
                list = returnPolicyContent.routeBlocks;
            }
            return returnPolicyContent.copy(disclaimer, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<RouteBlockReturnPolicy> component2() {
            return this.routeBlocks;
        }

        @NotNull
        public final ReturnPolicyContent copy(Disclaimer disclaimer, @NotNull List<RouteBlockReturnPolicy> routeBlocks) {
            Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
            return new ReturnPolicyContent(disclaimer, routeBlocks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReturnPolicyContent)) {
                return false;
            }
            ReturnPolicyContent returnPolicyContent = (ReturnPolicyContent) other;
            return Intrinsics.d(this.disclaimer, returnPolicyContent.disclaimer) && Intrinsics.d(this.routeBlocks, returnPolicyContent.routeBlocks);
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<RouteBlockReturnPolicy> getRouteBlocks() {
            return this.routeBlocks;
        }

        public int hashCode() {
            Disclaimer disclaimer = this.disclaimer;
            return this.routeBlocks.hashCode() + ((disclaimer == null ? 0 : disclaimer.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ReturnPolicyContent(disclaimer=" + this.disclaimer + ", routeBlocks=" + this.routeBlocks + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$Tab;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "content", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getContent", "()Ljava/lang/Object;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = 8;
        private final Object content;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Tab(@NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "aviaDetails", type = AviaDetailsContent.class), @ProtoOneOfSignature(name = "luggage", type = LuggageContent.class), @ProtoOneOfSignature(name = "returnPolicy", type = ReturnPolicyContent.class)}) @ProtoOneOf(label = "type") Object obj, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.content = obj;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tab copy$default(Tab tab, TextDTO textDTO, Object obj, Map map, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                textDTO = tab.title;
            }
            if ((i11 & 2) != 0) {
                obj = tab.content;
            }
            if ((i11 & 4) != 0) {
                map = tab.trackingInfo;
            }
            return tab.copy(textDTO, obj, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getContent() {
            return this.content;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Tab copy(@NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "aviaDetails", type = AviaDetailsContent.class), @ProtoOneOfSignature(name = "luggage", type = LuggageContent.class), @ProtoOneOfSignature(name = "returnPolicy", type = ReturnPolicyContent.class)}) @ProtoOneOf(label = "type") Object content, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Tab(title, content, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.title, tab.title) && Intrinsics.d(this.content, tab.content) && Intrinsics.d(this.trackingInfo, tab.trackingInfo);
        }

        public final Object getContent() {
            return this.content;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Object obj = this.content;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            Object obj = this.content;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Tab(title=");
            sb2.append(textDTO);
            sb2.append(", content=");
            sb2.append(obj);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public AviaDetailedInfoV3DTO(@NotNull List<Tab> items, String str, String str2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.tabBackgroundColor = str;
        this.activeTabBackgroundColor = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AviaDetailedInfoV3DTO copy$default(AviaDetailedInfoV3DTO aviaDetailedInfoV3DTO, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aviaDetailedInfoV3DTO.items;
        }
        if ((i11 & 2) != 0) {
            str = aviaDetailedInfoV3DTO.tabBackgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = aviaDetailedInfoV3DTO.activeTabBackgroundColor;
        }
        return aviaDetailedInfoV3DTO.copy(list, str, str2);
    }

    @NotNull
    public final List<Tab> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTabBackgroundColor() {
        return this.tabBackgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveTabBackgroundColor() {
        return this.activeTabBackgroundColor;
    }

    @NotNull
    public final AviaDetailedInfoV3DTO copy(@NotNull List<Tab> items, String tabBackgroundColor, String activeTabBackgroundColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AviaDetailedInfoV3DTO(items, tabBackgroundColor, activeTabBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaDetailedInfoV3DTO)) {
            return false;
        }
        AviaDetailedInfoV3DTO aviaDetailedInfoV3DTO = (AviaDetailedInfoV3DTO) other;
        return Intrinsics.d(this.items, aviaDetailedInfoV3DTO.items) && Intrinsics.d(this.tabBackgroundColor, aviaDetailedInfoV3DTO.tabBackgroundColor) && Intrinsics.d(this.activeTabBackgroundColor, aviaDetailedInfoV3DTO.activeTabBackgroundColor);
    }

    public final String getActiveTabBackgroundColor() {
        return this.activeTabBackgroundColor;
    }

    @NotNull
    public final List<Tab> getItems() {
        return this.items;
    }

    public final String getTabBackgroundColor() {
        return this.tabBackgroundColor;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.tabBackgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activeTabBackgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Tab> list = this.items;
        String str = this.tabBackgroundColor;
        return o0.c(C4055a.a("AviaDetailedInfoV3DTO(items=", ", tabBackgroundColor=", str, ", activeTabBackgroundColor=", list), this.activeTabBackgroundColor, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$AviaDetailsContent;", "", "flights", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO;", "noticeTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "noticeLuggage", "marginBetweenFlights", "", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/Map;)V", "getFlights", "()Ljava/util/List;", "getNoticeTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getNoticeLuggage", "getMarginBetweenFlights", "()I", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getViewTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AviaDetailsContent {
        public static final int $stable = 8;
        private final DisclaimerAtom annotation;

        @NotNull
        private final List<FlightDetailsDTO> flights;
        private final int marginBetweenFlights;
        private final TextDTO noticeLuggage;
        private final TextDTO noticeTime;
        private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

        public AviaDetailsContent(@NotNull List<FlightDetailsDTO> flights, TextDTO textDTO, TextDTO textDTO2, int i11, DisclaimerAtom disclaimerAtom, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(flights, "flights");
            this.flights = flights;
            this.noticeTime = textDTO;
            this.noticeLuggage = textDTO2;
            this.marginBetweenFlights = i11;
            this.annotation = disclaimerAtom;
            this.viewTrackingInfo = map;
        }

        public static /* synthetic */ AviaDetailsContent copy$default(AviaDetailsContent aviaDetailsContent, List list, TextDTO textDTO, TextDTO textDTO2, int i11, DisclaimerAtom disclaimerAtom, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = aviaDetailsContent.flights;
            }
            if ((i12 & 2) != 0) {
                textDTO = aviaDetailsContent.noticeTime;
            }
            if ((i12 & 4) != 0) {
                textDTO2 = aviaDetailsContent.noticeLuggage;
            }
            if ((i12 & 8) != 0) {
                i11 = aviaDetailsContent.marginBetweenFlights;
            }
            if ((i12 & 16) != 0) {
                disclaimerAtom = aviaDetailsContent.annotation;
            }
            if ((i12 & 32) != 0) {
                map = aviaDetailsContent.viewTrackingInfo;
            }
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            Map map2 = map;
            return aviaDetailsContent.copy(list, textDTO, textDTO2, i11, disclaimerAtom2, map2);
        }

        @NotNull
        public final List<FlightDetailsDTO> component1() {
            return this.flights;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getNoticeTime() {
            return this.noticeTime;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getNoticeLuggage() {
            return this.noticeLuggage;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMarginBetweenFlights() {
            return this.marginBetweenFlights;
        }

        /* renamed from: component5, reason: from getter */
        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.viewTrackingInfo;
        }

        @NotNull
        public final AviaDetailsContent copy(@NotNull List<FlightDetailsDTO> flights, TextDTO noticeTime, TextDTO noticeLuggage, int marginBetweenFlights, DisclaimerAtom annotation, Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
            Intrinsics.checkNotNullParameter(flights, "flights");
            return new AviaDetailsContent(flights, noticeTime, noticeLuggage, marginBetweenFlights, annotation, viewTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AviaDetailsContent)) {
                return false;
            }
            AviaDetailsContent aviaDetailsContent = (AviaDetailsContent) other;
            return Intrinsics.d(this.flights, aviaDetailsContent.flights) && Intrinsics.d(this.noticeTime, aviaDetailsContent.noticeTime) && Intrinsics.d(this.noticeLuggage, aviaDetailsContent.noticeLuggage) && this.marginBetweenFlights == aviaDetailsContent.marginBetweenFlights && Intrinsics.d(this.annotation, aviaDetailsContent.annotation) && Intrinsics.d(this.viewTrackingInfo, aviaDetailsContent.viewTrackingInfo);
        }

        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @NotNull
        public final List<FlightDetailsDTO> getFlights() {
            return this.flights;
        }

        public final int getMarginBetweenFlights() {
            return this.marginBetweenFlights;
        }

        public final TextDTO getNoticeLuggage() {
            return this.noticeLuggage;
        }

        public final TextDTO getNoticeTime() {
            return this.noticeTime;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.flights.hashCode() * 31;
            TextDTO textDTO = this.noticeTime;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.noticeLuggage;
            int a11 = C2454a.a(this.marginBetweenFlights, (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31);
            DisclaimerAtom disclaimerAtom = this.annotation;
            int hashCode3 = (a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AviaDetailsContent(flights=" + this.flights + ", noticeTime=" + this.noticeTime + ", noticeLuggage=" + this.noticeLuggage + ", marginBetweenFlights=" + this.marginBetweenFlights + ", annotation=" + this.annotation + ", viewTrackingInfo=" + this.viewTrackingInfo + ")";
        }

        public /* synthetic */ AviaDetailsContent(List list, TextDTO textDTO, TextDTO textDTO2, int i11, DisclaimerAtom disclaimerAtom, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, textDTO, textDTO2, (i12 & 8) != 0 ? 0 : i11, disclaimerAtom, map);
        }
    }
}
