package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation;

import Ak.C2436a;
import C.o0;
import G.g;
import HY.b;
import I0.C3173b;
import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "Ll20/c;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "state", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "State", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalReturnServiceCellV2VI implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bR \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "", "viewEvent", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewEvent", "()Ljava/util/Map;", "Loading", "Skeletons", "BookingSkeletons", "Content", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$BookingSkeletons;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Content;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Loading;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Skeletons;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$BookingSkeletons;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "backgroundColor", "borderColor", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BookingSkeletons implements State {
            private final String backgroundColor;
            private final String borderColor;

            @NotNull
            private final List<CellDTO> cells;
            private final Map<String, TokenizedTrackingInfo> viewEvent;

            public BookingSkeletons(Map<String, TokenizedTrackingInfo> map, @NotNull List<CellDTO> cells, String str, String str2) {
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.viewEvent = map;
                this.cells = cells;
                this.backgroundColor = str;
                this.borderColor = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BookingSkeletons)) {
                    return false;
                }
                BookingSkeletons bookingSkeletons = (BookingSkeletons) other;
                return Intrinsics.d(this.viewEvent, bookingSkeletons.viewEvent) && Intrinsics.d(this.cells, bookingSkeletons.cells) && Intrinsics.d(this.backgroundColor, bookingSkeletons.backgroundColor) && Intrinsics.d(this.borderColor, bookingSkeletons.borderColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final List<CellDTO> getCells() {
                return this.cells;
            }

            @Override // ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI.State
            public Map<String, TokenizedTrackingInfo> getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                int b11 = g.b((map == null ? 0 : map.hashCode()) * 31, 31, this.cells);
                String str = this.backgroundColor;
                int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.borderColor;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                List<CellDTO> list = this.cells;
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                StringBuilder sb2 = new StringBuilder("BookingSkeletons(viewEvent=");
                sb2.append(map);
                sb2.append(", cells=");
                sb2.append(list);
                sb2.append(", backgroundColor=");
                return C3173b.c(sb2, str, ", borderColor=", str2, ")");
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Content;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "backgroundColor", "borderColor", "<init>", "(Ljava/util/Map;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content implements State {
            private final String backgroundColor;
            private final BadgeDTO badge;
            private final String borderColor;

            @NotNull
            private final List<CellDTO> cells;
            private final Map<String, TokenizedTrackingInfo> viewEvent;

            public Content(Map<String, TokenizedTrackingInfo> map, @NotNull List<CellDTO> cells, BadgeDTO badgeDTO, String str, String str2) {
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.viewEvent = map;
                this.cells = cells;
                this.badge = badgeDTO;
                this.backgroundColor = str;
                this.borderColor = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return Intrinsics.d(this.viewEvent, content.viewEvent) && Intrinsics.d(this.cells, content.cells) && Intrinsics.d(this.badge, content.badge) && Intrinsics.d(this.backgroundColor, content.backgroundColor) && Intrinsics.d(this.borderColor, content.borderColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final List<CellDTO> getCells() {
                return this.cells;
            }

            @Override // ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI.State
            public Map<String, TokenizedTrackingInfo> getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                int b11 = g.b((map == null ? 0 : map.hashCode()) * 31, 31, this.cells);
                BadgeDTO badgeDTO = this.badge;
                int hashCode = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.borderColor;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                List<CellDTO> list = this.cells;
                BadgeDTO badgeDTO = this.badge;
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                StringBuilder sb2 = new StringBuilder("Content(viewEvent=");
                sb2.append(map);
                sb2.append(", cells=");
                sb2.append(list);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", borderColor=");
                return o0.c(sb2, str2, ")");
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Loading;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "asyncParams", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "", "showBookingSkeleton", "backgroundColor", "borderColor", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "getAsyncParams", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Z", "getShowBookingSkeleton", "()Z", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {
            private final Map<String, String> asyncParams;
            private final String backgroundColor;
            private final String borderColor;

            @NotNull
            private final List<CellDTO> cells;
            private final boolean showBookingSkeleton;
            private final Map<String, TokenizedTrackingInfo> viewEvent;

            public Loading(Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, @NotNull List<CellDTO> cells, boolean z11, String str, String str2) {
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.viewEvent = map;
                this.asyncParams = map2;
                this.cells = cells;
                this.showBookingSkeleton = z11;
                this.backgroundColor = str;
                this.borderColor = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return Intrinsics.d(this.viewEvent, loading.viewEvent) && Intrinsics.d(this.asyncParams, loading.asyncParams) && Intrinsics.d(this.cells, loading.cells) && this.showBookingSkeleton == loading.showBookingSkeleton && Intrinsics.d(this.backgroundColor, loading.backgroundColor) && Intrinsics.d(this.borderColor, loading.borderColor);
            }

            public final Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final List<CellDTO> getCells() {
                return this.cells;
            }

            public final boolean getShowBookingSkeleton() {
                return this.showBookingSkeleton;
            }

            @Override // ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI.State
            public Map<String, TokenizedTrackingInfo> getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                Map<String, String> map2 = this.asyncParams;
                int a11 = C3532b.a(g.b((hashCode + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.cells), 31, this.showBookingSkeleton);
                String str = this.backgroundColor;
                int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.borderColor;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                Map<String, String> map2 = this.asyncParams;
                List<CellDTO> list = this.cells;
                boolean z11 = this.showBookingSkeleton;
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                StringBuilder sb2 = new StringBuilder("Loading(viewEvent=");
                sb2.append(map);
                sb2.append(", asyncParams=");
                sb2.append(map2);
                sb2.append(", cells=");
                sb2.append(list);
                sb2.append(", showBookingSkeleton=");
                sb2.append(z11);
                sb2.append(", backgroundColor=");
                return C3173b.c(sb2, str, ", borderColor=", str2, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Skeletons;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Skeletons implements State {
            private final Map<String, TokenizedTrackingInfo> viewEvent;

            public Skeletons(Map<String, TokenizedTrackingInfo> map) {
                this.viewEvent = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Skeletons) && Intrinsics.d(this.viewEvent, ((Skeletons) other).viewEvent);
            }

            @Override // ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI.State
            public Map<String, TokenizedTrackingInfo> getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("Skeletons(viewEvent=", ")", this.viewEvent);
            }
        }

        Map<String, TokenizedTrackingInfo> getViewEvent();
    }

    public AdditionalReturnServiceCellV2VI(long j11, String str, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.asyncData = str;
        this.state = state;
    }

    public static /* synthetic */ AdditionalReturnServiceCellV2VI copy$default(AdditionalReturnServiceCellV2VI additionalReturnServiceCellV2VI, long j11, String str, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalReturnServiceCellV2VI.id;
        }
        if ((i11 & 2) != 0) {
            str = additionalReturnServiceCellV2VI.asyncData;
        }
        if ((i11 & 4) != 0) {
            state = additionalReturnServiceCellV2VI.state;
        }
        return additionalReturnServiceCellV2VI.copy(j11, str, state);
    }

    @NotNull
    public final AdditionalReturnServiceCellV2VI copy(long id2, String asyncData, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdditionalReturnServiceCellV2VI(id2, asyncData, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReturnServiceCellV2VI)) {
            return false;
        }
        AdditionalReturnServiceCellV2VI additionalReturnServiceCellV2VI = (AdditionalReturnServiceCellV2VI) other;
        return this.id == additionalReturnServiceCellV2VI.id && Intrinsics.d(this.asyncData, additionalReturnServiceCellV2VI.asyncData) && Intrinsics.d(this.state, additionalReturnServiceCellV2VI.state);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.state.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        State state = this.state;
        StringBuilder c11 = C2436a.c(j11, "AdditionalReturnServiceCellV2VI(id=", ", asyncData=", str);
        c11.append(", state=");
        c11.append(state);
        c11.append(")");
        return c11.toString();
    }
}
