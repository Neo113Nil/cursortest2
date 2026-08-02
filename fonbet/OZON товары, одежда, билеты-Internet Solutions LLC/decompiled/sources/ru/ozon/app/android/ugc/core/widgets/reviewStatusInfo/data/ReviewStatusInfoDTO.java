package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.data;

import B3.p;
import G.g;
import GR.b;
import Kk.c;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image.CommonImageDTO;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO;", "", "items", "", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "DateTextDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewStatusInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> items;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "timestamp", "", "dateFormat", "backgroundColor", "paddings", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimestamp", "()Ljava/lang/String;", "getDateFormat", "getBackgroundColor", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class DateTextDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String dateFormat;
        private final PaddingsDTO paddings;

        @NotNull
        private final TextDTO text;

        @NotNull
        private final String timestamp;
        private final Map<String, TokenizedTrackingInfo> tracking;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PaddingsDTO {
            public static final int $stable = 0;
            private final Paddings bottomPadding;
            private final Paddings leftPadding;
            private final Paddings rightPadding;
            private final Paddings topPadding;

            public PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
                this.topPadding = paddings;
                this.bottomPadding = paddings2;
                this.leftPadding = paddings3;
                this.rightPadding = paddings4;
            }

            public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = paddingsDTO.topPadding;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = paddingsDTO.bottomPadding;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = paddingsDTO.leftPadding;
                }
                if ((i11 & 8) != 0) {
                    paddings4 = paddingsDTO.rightPadding;
                }
                return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
            }

            /* renamed from: component1, reason: from getter */
            public final Paddings getTopPadding() {
                return this.topPadding;
            }

            /* renamed from: component2, reason: from getter */
            public final Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            /* renamed from: component3, reason: from getter */
            public final Paddings getLeftPadding() {
                return this.leftPadding;
            }

            /* renamed from: component4, reason: from getter */
            public final Paddings getRightPadding() {
                return this.rightPadding;
            }

            @NotNull
            public final PaddingsDTO copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
                return new PaddingsDTO(topPadding, bottomPadding, leftPadding, rightPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaddingsDTO)) {
                    return false;
                }
                PaddingsDTO paddingsDTO = (PaddingsDTO) other;
                return this.topPadding == paddingsDTO.topPadding && this.bottomPadding == paddingsDTO.bottomPadding && this.leftPadding == paddingsDTO.leftPadding && this.rightPadding == paddingsDTO.rightPadding;
            }

            public final Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            public final Paddings getLeftPadding() {
                return this.leftPadding;
            }

            public final Paddings getRightPadding() {
                return this.rightPadding;
            }

            public final Paddings getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                Paddings paddings = this.topPadding;
                int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
                Paddings paddings2 = this.bottomPadding;
                int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
                Paddings paddings3 = this.leftPadding;
                int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
                Paddings paddings4 = this.rightPadding;
                return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.topPadding;
                Paddings paddings2 = this.bottomPadding;
                return b.e(p.b("PaddingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
            }
        }

        public DateTextDTO(@NotNull TextDTO text, @NotNull String timestamp, String str, String str2, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.text = text;
            this.timestamp = timestamp;
            this.dateFormat = str;
            this.backgroundColor = str2;
            this.paddings = paddingsDTO;
            this.action = atomActionDTO;
            this.tracking = map;
        }

        public static /* synthetic */ DateTextDTO copy$default(DateTextDTO dateTextDTO, TextDTO textDTO, String str, String str2, String str3, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = dateTextDTO.text;
            }
            if ((i11 & 2) != 0) {
                str = dateTextDTO.timestamp;
            }
            if ((i11 & 4) != 0) {
                str2 = dateTextDTO.dateFormat;
            }
            if ((i11 & 8) != 0) {
                str3 = dateTextDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                paddingsDTO = dateTextDTO.paddings;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = dateTextDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = dateTextDTO.tracking;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            PaddingsDTO paddingsDTO2 = paddingsDTO;
            String str4 = str2;
            return dateTextDTO.copy(textDTO, str, str4, str3, paddingsDTO2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDateFormat() {
            return this.dateFormat;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final PaddingsDTO getPaddings() {
            return this.paddings;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.tracking;
        }

        @NotNull
        public final DateTextDTO copy(@NotNull TextDTO text, @NotNull String timestamp, String dateFormat, String backgroundColor, PaddingsDTO paddings, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DateTextDTO(text, timestamp, dateFormat, backgroundColor, paddings, action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTextDTO)) {
                return false;
            }
            DateTextDTO dateTextDTO = (DateTextDTO) other;
            return Intrinsics.d(this.text, dateTextDTO.text) && Intrinsics.d(this.timestamp, dateTextDTO.timestamp) && Intrinsics.d(this.dateFormat, dateTextDTO.dateFormat) && Intrinsics.d(this.backgroundColor, dateTextDTO.backgroundColor) && Intrinsics.d(this.paddings, dateTextDTO.paddings) && Intrinsics.d(this.action, dateTextDTO.action) && Intrinsics.d(this.tracking, dateTextDTO.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getDateFormat() {
            return this.dateFormat;
        }

        public final PaddingsDTO getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int a11 = g.a(this.text.hashCode() * 31, 31, this.timestamp);
            String str = this.dateFormat;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PaddingsDTO paddingsDTO = this.paddings;
            int hashCode3 = (hashCode2 + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.timestamp;
            String str2 = this.dateFormat;
            String str3 = this.backgroundColor;
            PaddingsDTO paddingsDTO = this.paddings;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder f7 = D3.g.f("DateTextDTO(text=", textDTO, ", timestamp=", str, ", dateFormat=");
            a.h(f7, str2, ", backgroundColor=", str3, ", paddings=");
            f7.append(paddingsDTO);
            f7.append(", action=");
            f7.append(atomActionDTO);
            f7.append(", tracking=");
            return P.f(f7, map, ")");
        }
    }

    public ReviewStatusInfoDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "image", name = "IMAGE", type = CommonImageDTO.class), @ProtoOneOfSignature(fieldName = "plainText", name = "PLAIN_TEXT", type = PlainTextDTO.class), @ProtoOneOfSignature(fieldName = "dateText", name = "DATE_TEXT", type = DateTextDTO.class), @ProtoOneOfSignature(fieldName = "cellList", name = "CELL_LIST", type = CellListV2DTO.class), @ProtoOneOfSignature(fieldName = "separator", name = "SEPARATOR", type = SeparatorDTO.class), @ProtoOneOfSignature(fieldName = "buttonWidget", name = "BUTTON_WIDGET", type = ButtonWidgetDTO.class), @ProtoOneOfSignature(fieldName = "islandSeparator", name = "ISLAND_SEPARATOR", type = IslandSeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.tracking = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewStatusInfoDTO copy$default(ReviewStatusInfoDTO reviewStatusInfoDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewStatusInfoDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = reviewStatusInfoDTO.tracking;
        }
        return reviewStatusInfoDTO.copy(list, map);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.tracking;
    }

    @NotNull
    public final ReviewStatusInfoDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "image", name = "IMAGE", type = CommonImageDTO.class), @ProtoOneOfSignature(fieldName = "plainText", name = "PLAIN_TEXT", type = PlainTextDTO.class), @ProtoOneOfSignature(fieldName = "dateText", name = "DATE_TEXT", type = DateTextDTO.class), @ProtoOneOfSignature(fieldName = "cellList", name = "CELL_LIST", type = CellListV2DTO.class), @ProtoOneOfSignature(fieldName = "separator", name = "SEPARATOR", type = SeparatorDTO.class), @ProtoOneOfSignature(fieldName = "buttonWidget", name = "BUTTON_WIDGET", type = ButtonWidgetDTO.class), @ProtoOneOfSignature(fieldName = "islandSeparator", name = "ISLAND_SEPARATOR", type = IslandSeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReviewStatusInfoDTO(items, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewStatusInfoDTO)) {
            return false;
        }
        ReviewStatusInfoDTO reviewStatusInfoDTO = (ReviewStatusInfoDTO) other;
        return Intrinsics.d(this.items, reviewStatusInfoDTO.items) && Intrinsics.d(this.tracking, reviewStatusInfoDTO.tracking);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("ReviewStatusInfoDTO(items=", ", tracking=", ")", this.items, this.tracking);
    }
}
