package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import D40.d;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003456Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "segments", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "areTopCornersRounded", "", "areBottomCornersRounded", "sharingButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "favoriteButton", "favoriteModalAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;ZZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Object;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSegments", "()Ljava/util/List;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAreTopCornersRounded", "()Z", "getAreBottomCornersRounded", "getSharingButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getFavoriteButton", "()Ljava/lang/Object;", "getFavoriteModalAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "SegmentDTO", "SegmentInfoDTO", "NoteDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FlightDetailsDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final boolean areBottomCornersRounded;
    private final boolean areTopCornersRounded;
    private final Object favoriteButton;
    private final CommonControlSettings favoriteModalAction;

    @NotNull
    private final List<SegmentDTO> segments;
    private final IconButtonV3DTO sharingButton;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;Ljava/lang/String;)V", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoteDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cell;

        public NoteDTO(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cell, String str) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.backgroundColor = str;
        }

        public static /* synthetic */ NoteDTO copy$default(NoteDTO noteDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellWithSubtitle24IconCounter = noteDTO.cell;
            }
            if ((i11 & 2) != 0) {
                str = noteDTO.backgroundColor;
            }
            return noteDTO.copy(cellWithSubtitle24IconCounter, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final NoteDTO copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cell, String backgroundColor) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new NoteDTO(cell, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoteDTO)) {
                return false;
            }
            NoteDTO noteDTO = (NoteDTO) other;
            return Intrinsics.d(this.cell, noteDTO.cell) && Intrinsics.d(this.backgroundColor, noteDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getCell() {
            return this.cell;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "NoteDTO(cell=" + this.cell + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jy\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;", "", "airlineLogo", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subAirlineLogo", "airline", "Lru/ozon/uni/atoms/data/text/TextDTO;", "segmentDuration", "segmentAirplane", "segmentBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "segmentDeparture", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;", "segmentArrival", "luggageBadges", "", "segmentNote", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;)V", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubAirlineLogo", "getAirline", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSegmentDuration", "getSegmentAirplane", "getSegmentBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSegmentDeparture", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;", "getSegmentArrival", "getLuggageBadges", "()Ljava/util/List;", "getSegmentNote", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO airline;

        @NotNull
        private final IconDTO airlineLogo;

        @NotNull
        private final List<BadgeDTO> luggageBadges;
        private final TextDTO segmentAirplane;

        @NotNull
        private final SegmentInfoDTO segmentArrival;

        @NotNull
        private final BadgeDTO segmentBadge;

        @NotNull
        private final SegmentInfoDTO segmentDeparture;

        @NotNull
        private final TextDTO segmentDuration;
        private final NoteDTO segmentNote;
        private final IconDTO subAirlineLogo;

        public SegmentDTO(@NotNull IconDTO airlineLogo, IconDTO iconDTO, @NotNull TextDTO airline, @NotNull TextDTO segmentDuration, TextDTO textDTO, @NotNull BadgeDTO segmentBadge, @NotNull SegmentInfoDTO segmentDeparture, @NotNull SegmentInfoDTO segmentArrival, @NotNull List<BadgeDTO> luggageBadges, NoteDTO noteDTO) {
            Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
            Intrinsics.checkNotNullParameter(airline, "airline");
            Intrinsics.checkNotNullParameter(segmentDuration, "segmentDuration");
            Intrinsics.checkNotNullParameter(segmentBadge, "segmentBadge");
            Intrinsics.checkNotNullParameter(segmentDeparture, "segmentDeparture");
            Intrinsics.checkNotNullParameter(segmentArrival, "segmentArrival");
            Intrinsics.checkNotNullParameter(luggageBadges, "luggageBadges");
            this.airlineLogo = airlineLogo;
            this.subAirlineLogo = iconDTO;
            this.airline = airline;
            this.segmentDuration = segmentDuration;
            this.segmentAirplane = textDTO;
            this.segmentBadge = segmentBadge;
            this.segmentDeparture = segmentDeparture;
            this.segmentArrival = segmentArrival;
            this.luggageBadges = luggageBadges;
            this.segmentNote = noteDTO;
        }

        public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, IconDTO iconDTO, IconDTO iconDTO2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, BadgeDTO badgeDTO, SegmentInfoDTO segmentInfoDTO, SegmentInfoDTO segmentInfoDTO2, List list, NoteDTO noteDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = segmentDTO.airlineLogo;
            }
            if ((i11 & 2) != 0) {
                iconDTO2 = segmentDTO.subAirlineLogo;
            }
            if ((i11 & 4) != 0) {
                textDTO = segmentDTO.airline;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = segmentDTO.segmentDuration;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = segmentDTO.segmentAirplane;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = segmentDTO.segmentBadge;
            }
            if ((i11 & 64) != 0) {
                segmentInfoDTO = segmentDTO.segmentDeparture;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                segmentInfoDTO2 = segmentDTO.segmentArrival;
            }
            if ((i11 & 256) != 0) {
                list = segmentDTO.luggageBadges;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                noteDTO = segmentDTO.segmentNote;
            }
            List list2 = list;
            NoteDTO noteDTO2 = noteDTO;
            SegmentInfoDTO segmentInfoDTO3 = segmentInfoDTO;
            SegmentInfoDTO segmentInfoDTO4 = segmentInfoDTO2;
            TextDTO textDTO4 = textDTO3;
            BadgeDTO badgeDTO2 = badgeDTO;
            return segmentDTO.copy(iconDTO, iconDTO2, textDTO, textDTO2, textDTO4, badgeDTO2, segmentInfoDTO3, segmentInfoDTO4, list2, noteDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getAirlineLogo() {
            return this.airlineLogo;
        }

        /* renamed from: component10, reason: from getter */
        public final NoteDTO getSegmentNote() {
            return this.segmentNote;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getSubAirlineLogo() {
            return this.subAirlineLogo;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getAirline() {
            return this.airline;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getSegmentDuration() {
            return this.segmentDuration;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getSegmentAirplane() {
            return this.segmentAirplane;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getSegmentBadge() {
            return this.segmentBadge;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final SegmentInfoDTO getSegmentDeparture() {
            return this.segmentDeparture;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final SegmentInfoDTO getSegmentArrival() {
            return this.segmentArrival;
        }

        @NotNull
        public final List<BadgeDTO> component9() {
            return this.luggageBadges;
        }

        @NotNull
        public final SegmentDTO copy(@NotNull IconDTO airlineLogo, IconDTO subAirlineLogo, @NotNull TextDTO airline, @NotNull TextDTO segmentDuration, TextDTO segmentAirplane, @NotNull BadgeDTO segmentBadge, @NotNull SegmentInfoDTO segmentDeparture, @NotNull SegmentInfoDTO segmentArrival, @NotNull List<BadgeDTO> luggageBadges, NoteDTO segmentNote) {
            Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
            Intrinsics.checkNotNullParameter(airline, "airline");
            Intrinsics.checkNotNullParameter(segmentDuration, "segmentDuration");
            Intrinsics.checkNotNullParameter(segmentBadge, "segmentBadge");
            Intrinsics.checkNotNullParameter(segmentDeparture, "segmentDeparture");
            Intrinsics.checkNotNullParameter(segmentArrival, "segmentArrival");
            Intrinsics.checkNotNullParameter(luggageBadges, "luggageBadges");
            return new SegmentDTO(airlineLogo, subAirlineLogo, airline, segmentDuration, segmentAirplane, segmentBadge, segmentDeparture, segmentArrival, luggageBadges, segmentNote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentDTO)) {
                return false;
            }
            SegmentDTO segmentDTO = (SegmentDTO) other;
            return Intrinsics.d(this.airlineLogo, segmentDTO.airlineLogo) && Intrinsics.d(this.subAirlineLogo, segmentDTO.subAirlineLogo) && Intrinsics.d(this.airline, segmentDTO.airline) && Intrinsics.d(this.segmentDuration, segmentDTO.segmentDuration) && Intrinsics.d(this.segmentAirplane, segmentDTO.segmentAirplane) && Intrinsics.d(this.segmentBadge, segmentDTO.segmentBadge) && Intrinsics.d(this.segmentDeparture, segmentDTO.segmentDeparture) && Intrinsics.d(this.segmentArrival, segmentDTO.segmentArrival) && Intrinsics.d(this.luggageBadges, segmentDTO.luggageBadges) && Intrinsics.d(this.segmentNote, segmentDTO.segmentNote);
        }

        @NotNull
        public final TextDTO getAirline() {
            return this.airline;
        }

        @NotNull
        public final IconDTO getAirlineLogo() {
            return this.airlineLogo;
        }

        @NotNull
        public final List<BadgeDTO> getLuggageBadges() {
            return this.luggageBadges;
        }

        public final TextDTO getSegmentAirplane() {
            return this.segmentAirplane;
        }

        @NotNull
        public final SegmentInfoDTO getSegmentArrival() {
            return this.segmentArrival;
        }

        @NotNull
        public final BadgeDTO getSegmentBadge() {
            return this.segmentBadge;
        }

        @NotNull
        public final SegmentInfoDTO getSegmentDeparture() {
            return this.segmentDeparture;
        }

        @NotNull
        public final TextDTO getSegmentDuration() {
            return this.segmentDuration;
        }

        public final NoteDTO getSegmentNote() {
            return this.segmentNote;
        }

        public final IconDTO getSubAirlineLogo() {
            return this.subAirlineLogo;
        }

        public int hashCode() {
            int hashCode = this.airlineLogo.hashCode() * 31;
            IconDTO iconDTO = this.subAirlineLogo;
            int a11 = b.a(this.segmentDuration, b.a(this.airline, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31), 31);
            TextDTO textDTO = this.segmentAirplane;
            int b11 = g.b((this.segmentArrival.hashCode() + ((this.segmentDeparture.hashCode() + C3124a.c(this.segmentBadge, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31)) * 31)) * 31, 31, this.luggageBadges);
            NoteDTO noteDTO = this.segmentNote;
            return b11 + (noteDTO != null ? noteDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.airlineLogo;
            IconDTO iconDTO2 = this.subAirlineLogo;
            TextDTO textDTO = this.airline;
            TextDTO textDTO2 = this.segmentDuration;
            TextDTO textDTO3 = this.segmentAirplane;
            BadgeDTO badgeDTO = this.segmentBadge;
            SegmentInfoDTO segmentInfoDTO = this.segmentDeparture;
            SegmentInfoDTO segmentInfoDTO2 = this.segmentArrival;
            List<BadgeDTO> list = this.luggageBadges;
            NoteDTO noteDTO = this.segmentNote;
            StringBuilder sb2 = new StringBuilder("SegmentDTO(airlineLogo=");
            sb2.append(iconDTO);
            sb2.append(", subAirlineLogo=");
            sb2.append(iconDTO2);
            sb2.append(", airline=");
            d.e(", segmentDuration=", ", segmentAirplane=", sb2, textDTO, textDTO2);
            sb2.append(textDTO3);
            sb2.append(", segmentBadge=");
            sb2.append(badgeDTO);
            sb2.append(", segmentDeparture=");
            sb2.append(segmentInfoDTO);
            sb2.append(", segmentArrival=");
            sb2.append(segmentInfoDTO2);
            sb2.append(", luggageBadges=");
            sb2.append(list);
            sb2.append(", segmentNote=");
            sb2.append(noteDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;", "", "time", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "city", "airport", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "getCity", "getAirport", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentInfoDTO {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO airport;

        @NotNull
        private final TextDTO city;

        @NotNull
        private final TextDTO date;

        @NotNull
        private final TextDTO time;

        public SegmentInfoDTO(@NotNull TextDTO time, @NotNull TextDTO date, @NotNull TextDTO city, @NotNull TextDTO airport) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(airport, "airport");
            this.time = time;
            this.date = date;
            this.city = city;
            this.airport = airport;
        }

        public static /* synthetic */ SegmentInfoDTO copy$default(SegmentInfoDTO segmentInfoDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = segmentInfoDTO.time;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = segmentInfoDTO.date;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = segmentInfoDTO.city;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = segmentInfoDTO.airport;
            }
            return segmentInfoDTO.copy(textDTO, textDTO2, textDTO3, textDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTime() {
            return this.time;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getAirport() {
            return this.airport;
        }

        @NotNull
        public final SegmentInfoDTO copy(@NotNull TextDTO time, @NotNull TextDTO date, @NotNull TextDTO city, @NotNull TextDTO airport) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(airport, "airport");
            return new SegmentInfoDTO(time, date, city, airport);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentInfoDTO)) {
                return false;
            }
            SegmentInfoDTO segmentInfoDTO = (SegmentInfoDTO) other;
            return Intrinsics.d(this.time, segmentInfoDTO.time) && Intrinsics.d(this.date, segmentInfoDTO.date) && Intrinsics.d(this.city, segmentInfoDTO.city) && Intrinsics.d(this.airport, segmentInfoDTO.airport);
        }

        @NotNull
        public final TextDTO getAirport() {
            return this.airport;
        }

        @NotNull
        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        public final TextDTO getTime() {
            return this.time;
        }

        public int hashCode() {
            return this.airport.hashCode() + b.a(this.city, b.a(this.date, this.time.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.time;
            TextDTO textDTO2 = this.date;
            TextDTO textDTO3 = this.city;
            TextDTO textDTO4 = this.airport;
            StringBuilder g10 = D3.g.g("SegmentInfoDTO(time=", textDTO, ", date=", textDTO2, ", city=");
            g10.append(textDTO3);
            g10.append(", airport=");
            g10.append(textDTO4);
            g10.append(")");
            return g10.toString();
        }
    }

    public FlightDetailsDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<SegmentDTO> segments, DisclaimerAtom disclaimerAtom, boolean z11, boolean z12, IconButtonV3DTO iconButtonV3DTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteButton", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") Object obj, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.title = title;
        this.subtitle = subtitle;
        this.segments = segments;
        this.annotation = disclaimerAtom;
        this.areTopCornersRounded = z11;
        this.areBottomCornersRounded = z12;
        this.sharingButton = iconButtonV3DTO;
        this.favoriteButton = obj;
        this.favoriteModalAction = commonControlSettings;
    }

    public static /* synthetic */ FlightDetailsDTO copy$default(FlightDetailsDTO flightDetailsDTO, TextDTO textDTO, TextDTO textDTO2, List list, DisclaimerAtom disclaimerAtom, boolean z11, boolean z12, IconButtonV3DTO iconButtonV3DTO, Object obj, CommonControlSettings commonControlSettings, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            textDTO = flightDetailsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = flightDetailsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = flightDetailsDTO.segments;
        }
        if ((i11 & 8) != 0) {
            disclaimerAtom = flightDetailsDTO.annotation;
        }
        if ((i11 & 16) != 0) {
            z11 = flightDetailsDTO.areTopCornersRounded;
        }
        if ((i11 & 32) != 0) {
            z12 = flightDetailsDTO.areBottomCornersRounded;
        }
        if ((i11 & 64) != 0) {
            iconButtonV3DTO = flightDetailsDTO.sharingButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            obj = flightDetailsDTO.favoriteButton;
        }
        if ((i11 & 256) != 0) {
            commonControlSettings = flightDetailsDTO.favoriteModalAction;
        }
        Object obj3 = obj;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        boolean z13 = z12;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        boolean z14 = z11;
        List list2 = list;
        return flightDetailsDTO.copy(textDTO, textDTO2, list2, disclaimerAtom, z14, z13, iconButtonV3DTO2, obj3, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<SegmentDTO> component3() {
        return this.segments;
    }

    /* renamed from: component4, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAreTopCornersRounded() {
        return this.areTopCornersRounded;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAreBottomCornersRounded() {
        return this.areBottomCornersRounded;
    }

    /* renamed from: component7, reason: from getter */
    public final IconButtonV3DTO getSharingButton() {
        return this.sharingButton;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getFavoriteButton() {
        return this.favoriteButton;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonControlSettings getFavoriteModalAction() {
        return this.favoriteModalAction;
    }

    @NotNull
    public final FlightDetailsDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<SegmentDTO> segments, DisclaimerAtom annotation, boolean areTopCornersRounded, boolean areBottomCornersRounded, IconButtonV3DTO sharingButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteButton", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") Object favoriteButton, CommonControlSettings favoriteModalAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new FlightDetailsDTO(title, subtitle, segments, annotation, areTopCornersRounded, areBottomCornersRounded, sharingButton, favoriteButton, favoriteModalAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightDetailsDTO)) {
            return false;
        }
        FlightDetailsDTO flightDetailsDTO = (FlightDetailsDTO) other;
        return Intrinsics.d(this.title, flightDetailsDTO.title) && Intrinsics.d(this.subtitle, flightDetailsDTO.subtitle) && Intrinsics.d(this.segments, flightDetailsDTO.segments) && Intrinsics.d(this.annotation, flightDetailsDTO.annotation) && this.areTopCornersRounded == flightDetailsDTO.areTopCornersRounded && this.areBottomCornersRounded == flightDetailsDTO.areBottomCornersRounded && Intrinsics.d(this.sharingButton, flightDetailsDTO.sharingButton) && Intrinsics.d(this.favoriteButton, flightDetailsDTO.favoriteButton) && Intrinsics.d(this.favoriteModalAction, flightDetailsDTO.favoriteModalAction);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final boolean getAreBottomCornersRounded() {
        return this.areBottomCornersRounded;
    }

    public final boolean getAreTopCornersRounded() {
        return this.areTopCornersRounded;
    }

    public final Object getFavoriteButton() {
        return this.favoriteButton;
    }

    public final CommonControlSettings getFavoriteModalAction() {
        return this.favoriteModalAction;
    }

    @NotNull
    public final List<SegmentDTO> getSegments() {
        return this.segments;
    }

    public final IconButtonV3DTO getSharingButton() {
        return this.sharingButton;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.segments);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int a11 = C3532b.a(C3532b.a((b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31, this.areTopCornersRounded), 31, this.areBottomCornersRounded);
        IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
        int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Object obj = this.favoriteButton;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.favoriteModalAction;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<SegmentDTO> list = this.segments;
        DisclaimerAtom disclaimerAtom = this.annotation;
        boolean z11 = this.areTopCornersRounded;
        boolean z12 = this.areBottomCornersRounded;
        IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
        Object obj = this.favoriteButton;
        CommonControlSettings commonControlSettings = this.favoriteModalAction;
        StringBuilder g10 = D3.g.g("FlightDetailsDTO(title=", textDTO, ", subtitle=", textDTO2, ", segments=");
        g10.append(list);
        g10.append(", annotation=");
        g10.append(disclaimerAtom);
        g10.append(", areTopCornersRounded=");
        f.c(", areBottomCornersRounded=", ", sharingButton=", g10, z11, z12);
        g10.append(iconButtonV3DTO);
        g10.append(", favoriteButton=");
        g10.append(obj);
        g10.append(", favoriteModalAction=");
        return Ak.b.g(g10, commonControlSettings, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FlightDetailsDTO(TextDTO textDTO, TextDTO textDTO2, List list, DisclaimerAtom disclaimerAtom, boolean z11, boolean z12, IconButtonV3DTO iconButtonV3DTO, Object obj, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, list, disclaimerAtom, z11, r8, r9, r10, r11);
        CommonControlSettings commonControlSettings2;
        Object obj2;
        IconButtonV3DTO iconButtonV3DTO2;
        boolean z13;
        z11 = (i11 & 16) != 0 ? false : z11;
        if ((i11 & 32) != 0) {
            commonControlSettings2 = commonControlSettings;
            obj2 = obj;
            iconButtonV3DTO2 = iconButtonV3DTO;
            z13 = false;
        } else {
            commonControlSettings2 = commonControlSettings;
            obj2 = obj;
            iconButtonV3DTO2 = iconButtonV3DTO;
            z13 = z12;
        }
    }
}
