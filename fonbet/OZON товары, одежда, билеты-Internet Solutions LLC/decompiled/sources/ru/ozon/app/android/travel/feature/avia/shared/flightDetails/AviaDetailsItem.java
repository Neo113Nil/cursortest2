package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import C.o0;
import D3.g;
import D40.d;
import El.C2971a;
import Gl.C3124a;
import Ns.b;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "", "id", "", "getId", "()I", "TitleVO", "SegmentVO", "NoteVO", "AnnotationVO", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$AnnotationVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$NoteVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AviaDetailsItem {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$AnnotationVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "", "id", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "<init>", "(ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnnotationVO implements AviaDetailsItem {

        @NotNull
        private final DisclaimerAtom annotation;
        private final int id;

        public AnnotationVO(int i11, @NotNull DisclaimerAtom annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.id = i11;
            this.annotation = annotation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnnotationVO)) {
                return false;
            }
            AnnotationVO annotationVO = (AnnotationVO) other;
            return this.id == annotationVO.id && Intrinsics.d(this.annotation, annotationVO.annotation);
        }

        @NotNull
        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.annotation.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "AnnotationVO(id=" + this.id + ", annotation=" + this.annotation + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$NoteVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "cell", "", "backgroundColor", "<init>", "(ILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Ljava/lang/String;", "getBackgroundColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoteVO implements AviaDetailsItem {
        private final String backgroundColor;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cell;
        private final int id;

        public NoteVO(int i11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cell, String str) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoteVO)) {
                return false;
            }
            NoteVO noteVO = (NoteVO) other;
            return this.id == noteVO.id && Intrinsics.d(this.cell, noteVO.cell) && Intrinsics.d(this.backgroundColor, noteVO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getCell() {
            return this.cell;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = (this.cell.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = this.cell;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("NoteVO(id=");
            sb2.append(i11);
            sb2.append(", cell=");
            sb2.append(cellWithSubtitle24IconCounter);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b/\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineLogo", "subAirlineLogo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "airline", "segmentDuration", "segmentAirplane", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "segmentBadge", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "segmentDeparture", "segmentArrival", "", "luggageBadges", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubAirlineLogo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAirline", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSegmentDuration", "getSegmentAirplane", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSegmentBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "getSegmentDeparture", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "getSegmentArrival", "Ljava/util/List;", "getLuggageBadges", "()Ljava/util/List;", "SegmentInfoVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentVO implements AviaDetailsItem {

        @NotNull
        private final TextDTO airline;

        @NotNull
        private final IconDTO airlineLogo;
        private final int id;

        @NotNull
        private final List<BadgeDTO> luggageBadges;
        private final TextDTO segmentAirplane;

        @NotNull
        private final SegmentInfoVO segmentArrival;

        @NotNull
        private final BadgeDTO segmentBadge;

        @NotNull
        private final SegmentInfoVO segmentDeparture;

        @NotNull
        private final TextDTO segmentDuration;
        private final IconDTO subAirlineLogo;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "time", "date", "city", "airport", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "getCity", "getAirport", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SegmentInfoVO {

            @NotNull
            private final TextDTO airport;

            @NotNull
            private final TextDTO city;

            @NotNull
            private final TextDTO date;

            @NotNull
            private final TextDTO time;

            public SegmentInfoVO(@NotNull TextDTO time, @NotNull TextDTO date, @NotNull TextDTO city, @NotNull TextDTO airport) {
                Intrinsics.checkNotNullParameter(time, "time");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(airport, "airport");
                this.time = time;
                this.date = date;
                this.city = city;
                this.airport = airport;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SegmentInfoVO)) {
                    return false;
                }
                SegmentInfoVO segmentInfoVO = (SegmentInfoVO) other;
                return Intrinsics.d(this.time, segmentInfoVO.time) && Intrinsics.d(this.date, segmentInfoVO.date) && Intrinsics.d(this.city, segmentInfoVO.city) && Intrinsics.d(this.airport, segmentInfoVO.airport);
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
                StringBuilder g10 = g.g("SegmentInfoVO(time=", textDTO, ", date=", textDTO2, ", city=");
                g10.append(textDTO3);
                g10.append(", airport=");
                g10.append(textDTO4);
                g10.append(")");
                return g10.toString();
            }
        }

        public SegmentVO(int i11, @NotNull IconDTO airlineLogo, IconDTO iconDTO, @NotNull TextDTO airline, @NotNull TextDTO segmentDuration, TextDTO textDTO, @NotNull BadgeDTO segmentBadge, @NotNull SegmentInfoVO segmentDeparture, @NotNull SegmentInfoVO segmentArrival, @NotNull List<BadgeDTO> luggageBadges) {
            Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
            Intrinsics.checkNotNullParameter(airline, "airline");
            Intrinsics.checkNotNullParameter(segmentDuration, "segmentDuration");
            Intrinsics.checkNotNullParameter(segmentBadge, "segmentBadge");
            Intrinsics.checkNotNullParameter(segmentDeparture, "segmentDeparture");
            Intrinsics.checkNotNullParameter(segmentArrival, "segmentArrival");
            Intrinsics.checkNotNullParameter(luggageBadges, "luggageBadges");
            this.id = i11;
            this.airlineLogo = airlineLogo;
            this.subAirlineLogo = iconDTO;
            this.airline = airline;
            this.segmentDuration = segmentDuration;
            this.segmentAirplane = textDTO;
            this.segmentBadge = segmentBadge;
            this.segmentDeparture = segmentDeparture;
            this.segmentArrival = segmentArrival;
            this.luggageBadges = luggageBadges;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentVO)) {
                return false;
            }
            SegmentVO segmentVO = (SegmentVO) other;
            return this.id == segmentVO.id && Intrinsics.d(this.airlineLogo, segmentVO.airlineLogo) && Intrinsics.d(this.subAirlineLogo, segmentVO.subAirlineLogo) && Intrinsics.d(this.airline, segmentVO.airline) && Intrinsics.d(this.segmentDuration, segmentVO.segmentDuration) && Intrinsics.d(this.segmentAirplane, segmentVO.segmentAirplane) && Intrinsics.d(this.segmentBadge, segmentVO.segmentBadge) && Intrinsics.d(this.segmentDeparture, segmentVO.segmentDeparture) && Intrinsics.d(this.segmentArrival, segmentVO.segmentArrival) && Intrinsics.d(this.luggageBadges, segmentVO.luggageBadges);
        }

        @NotNull
        public final TextDTO getAirline() {
            return this.airline;
        }

        @NotNull
        public final IconDTO getAirlineLogo() {
            return this.airlineLogo;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final List<BadgeDTO> getLuggageBadges() {
            return this.luggageBadges;
        }

        public final TextDTO getSegmentAirplane() {
            return this.segmentAirplane;
        }

        @NotNull
        public final SegmentInfoVO getSegmentArrival() {
            return this.segmentArrival;
        }

        @NotNull
        public final BadgeDTO getSegmentBadge() {
            return this.segmentBadge;
        }

        @NotNull
        public final SegmentInfoVO getSegmentDeparture() {
            return this.segmentDeparture;
        }

        @NotNull
        public final TextDTO getSegmentDuration() {
            return this.segmentDuration;
        }

        public final IconDTO getSubAirlineLogo() {
            return this.subAirlineLogo;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.airlineLogo, Integer.hashCode(this.id) * 31, 31);
            IconDTO iconDTO = this.subAirlineLogo;
            int a12 = b.a(this.segmentDuration, b.a(this.airline, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31), 31);
            TextDTO textDTO = this.segmentAirplane;
            return this.luggageBadges.hashCode() + ((this.segmentArrival.hashCode() + ((this.segmentDeparture.hashCode() + C3124a.c(this.segmentBadge, (a12 + (textDTO != null ? textDTO.hashCode() : 0)) * 31, 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            IconDTO iconDTO = this.airlineLogo;
            IconDTO iconDTO2 = this.subAirlineLogo;
            TextDTO textDTO = this.airline;
            TextDTO textDTO2 = this.segmentDuration;
            TextDTO textDTO3 = this.segmentAirplane;
            BadgeDTO badgeDTO = this.segmentBadge;
            SegmentInfoVO segmentInfoVO = this.segmentDeparture;
            SegmentInfoVO segmentInfoVO2 = this.segmentArrival;
            List<BadgeDTO> list = this.luggageBadges;
            StringBuilder sb2 = new StringBuilder("SegmentVO(id=");
            sb2.append(i11);
            sb2.append(", airlineLogo=");
            sb2.append(iconDTO);
            sb2.append(", subAirlineLogo=");
            sb2.append(iconDTO2);
            sb2.append(", airline=");
            sb2.append(textDTO);
            sb2.append(", segmentDuration=");
            d.e(", segmentAirplane=", ", segmentBadge=", sb2, textDTO2, textDTO3);
            sb2.append(badgeDTO);
            sb2.append(", segmentDeparture=");
            sb2.append(segmentInfoVO);
            sb2.append(", segmentArrival=");
            sb2.append(segmentInfoVO2);
            sb2.append(", luggageBadges=");
            sb2.append(list);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "sharingButton", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "favoriteButton", "Lru/ozon/uni/atoms/af/AtomAction;", "favoriteModalAction", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSharingButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "getFavoriteButton", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "Lru/ozon/uni/atoms/af/AtomAction;", "getFavoriteModalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ButtonType", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleVO implements AviaDetailsItem {
        public static final int $stable = AtomAction.$stable | IconButtonV3DTO.$stable;
        private final ButtonType favoriteButton;
        private final AtomAction favoriteModalAction;
        private final int id;
        private final IconButtonV3DTO sharingButton;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "", "FavoriteButton", "IconButton", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType$FavoriteButton;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType$IconButton;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface ButtonType {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType$FavoriteButton;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FavoriteButton implements ButtonType {

                @NotNull
                private final FavoriteProductModel favoriteButton;

                public FavoriteButton(@NotNull FavoriteProductModel favoriteButton) {
                    Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
                    this.favoriteButton = favoriteButton;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof FavoriteButton) && Intrinsics.d(this.favoriteButton, ((FavoriteButton) other).favoriteButton);
                }

                @NotNull
                public final FavoriteProductModel getFavoriteButton() {
                    return this.favoriteButton;
                }

                public int hashCode() {
                    return this.favoriteButton.hashCode();
                }

                @NotNull
                public String toString() {
                    return "FavoriteButton(favoriteButton=" + this.favoriteButton + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType$IconButton;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class IconButton implements ButtonType {
                public static final int $stable = IconButtonV3DTO.$stable;

                @NotNull
                private final IconButtonV3DTO iconButton;

                public IconButton(@NotNull IconButtonV3DTO iconButton) {
                    Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                    this.iconButton = iconButton;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof IconButton) && Intrinsics.d(this.iconButton, ((IconButton) other).iconButton);
                }

                @NotNull
                public final IconButtonV3DTO getIconButton() {
                    return this.iconButton;
                }

                public int hashCode() {
                    return this.iconButton.hashCode();
                }

                @NotNull
                public String toString() {
                    return "IconButton(iconButton=" + this.iconButton + ")";
                }
            }
        }

        public TitleVO(int i11, @NotNull TextDTO title, @NotNull TextDTO subtitle, IconButtonV3DTO iconButtonV3DTO, ButtonType buttonType, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.id = i11;
            this.title = title;
            this.subtitle = subtitle;
            this.sharingButton = iconButtonV3DTO;
            this.favoriteButton = buttonType;
            this.favoriteModalAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleVO)) {
                return false;
            }
            TitleVO titleVO = (TitleVO) other;
            return this.id == titleVO.id && Intrinsics.d(this.title, titleVO.title) && Intrinsics.d(this.subtitle, titleVO.subtitle) && Intrinsics.d(this.sharingButton, titleVO.sharingButton) && Intrinsics.d(this.favoriteButton, titleVO.favoriteButton) && Intrinsics.d(this.favoriteModalAction, titleVO.favoriteModalAction);
        }

        public final ButtonType getFavoriteButton() {
            return this.favoriteButton;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem
        public int getId() {
            return this.id;
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
            int a11 = b.a(this.subtitle, b.a(this.title, Integer.hashCode(this.id) * 31, 31), 31);
            IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
            int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            ButtonType buttonType = this.favoriteButton;
            int hashCode2 = (hashCode + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
            AtomAction atomAction = this.favoriteModalAction;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
            ButtonType buttonType = this.favoriteButton;
            AtomAction atomAction = this.favoriteModalAction;
            StringBuilder b11 = C4055a.b(textDTO, "TitleVO(id=", ", title=", ", subtitle=", i11);
            b11.append(textDTO2);
            b11.append(", sharingButton=");
            b11.append(iconButtonV3DTO);
            b11.append(", favoriteButton=");
            b11.append(buttonType);
            b11.append(", favoriteModalAction=");
            b11.append(atomAction);
            b11.append(")");
            return b11.toString();
        }
    }

    int getId();
}
