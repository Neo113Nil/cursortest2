package ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation;

import Ak.C2436a;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import D3.h;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001@B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b\u0011\u0010.R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b:\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b>\u0010.R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b?\u0010=¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isDescriptionVisible", "", "shortDescription", "Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;", "shortClickableSpan", "fullDescription", "fullClickableSpan", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "descriptionInfo", "isExpanded", "areFeaturesVisible", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "hotelFeatures", "areCellsVisible", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "cells", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/lang/CharSequence;Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;Ljava/lang/CharSequence;Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;ZZLjava/util/List;ZLjava/util/List;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/lang/CharSequence;Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;Ljava/lang/CharSequence;Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;ZZLjava/util/List;ZLjava/util/List;)Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "Ljava/lang/CharSequence;", "getShortDescription", "()Ljava/lang/CharSequence;", "Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;", "getShortClickableSpan", "()Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;", "getFullDescription", "getFullClickableSpan", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "getDescriptionInfo", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "getAreFeaturesVisible", "Ljava/util/List;", "getHotelFeatures", "()Ljava/util/List;", "getAreCellsVisible", "getCells", "DescriptionInfo", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursHotelInfoCardVO implements c {
    private final boolean areCellsVisible;
    private final boolean areFeaturesVisible;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells;
    private final DescriptionInfo descriptionInfo;
    private final OzonClickableSpan fullClickableSpan;
    private final CharSequence fullDescription;

    @NotNull
    private final List<Badge> hotelFeatures;
    private final long id;
    private final boolean isDescriptionVisible;
    private final boolean isExpanded;
    private final OzonClickableSpan shortClickableSpan;
    private final CharSequence shortDescription;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u000eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "", "", "description", "", "shortTextCount", "expandButtonText", "collapseButtonText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "showFullButtonTrackingInfo", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "I", "getShortTextCount", "getExpandButtonText", "getCollapseButtonText", "LWZ/t;", "getShowFullButtonTrackingInfo", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DescriptionInfo {

        @NotNull
        private final String collapseButtonText;

        @NotNull
        private final String description;

        @NotNull
        private final String expandButtonText;
        private final int shortTextCount;
        private final t showFullButtonTrackingInfo;

        public DescriptionInfo(@NotNull String description, int i11, @NotNull String expandButtonText, @NotNull String collapseButtonText, t tVar) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(expandButtonText, "expandButtonText");
            Intrinsics.checkNotNullParameter(collapseButtonText, "collapseButtonText");
            this.description = description;
            this.shortTextCount = i11;
            this.expandButtonText = expandButtonText;
            this.collapseButtonText = collapseButtonText;
            this.showFullButtonTrackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescriptionInfo)) {
                return false;
            }
            DescriptionInfo descriptionInfo = (DescriptionInfo) other;
            return Intrinsics.d(this.description, descriptionInfo.description) && this.shortTextCount == descriptionInfo.shortTextCount && Intrinsics.d(this.expandButtonText, descriptionInfo.expandButtonText) && Intrinsics.d(this.collapseButtonText, descriptionInfo.collapseButtonText) && Intrinsics.d(this.showFullButtonTrackingInfo, descriptionInfo.showFullButtonTrackingInfo);
        }

        public final t getShowFullButtonTrackingInfo() {
            return this.showFullButtonTrackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a(C2454a.a(this.shortTextCount, this.description.hashCode() * 31, 31), 31, this.expandButtonText), 31, this.collapseButtonText);
            t tVar = this.showFullButtonTrackingInfo;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.description;
            int i11 = this.shortTextCount;
            String str2 = this.expandButtonText;
            String str3 = this.collapseButtonText;
            t tVar = this.showFullButtonTrackingInfo;
            StringBuilder c11 = C3660k.c(i11, "DescriptionInfo(description=", str, ", shortTextCount=", ", expandButtonText=");
            a.h(c11, str2, ", collapseButtonText=", str3, ", showFullButtonTrackingInfo=");
            return b.d(c11, tVar, ")");
        }
    }

    public ToursHotelInfoCardVO(long j11, @NotNull TextAtom title, boolean z11, CharSequence charSequence, OzonClickableSpan ozonClickableSpan, CharSequence charSequence2, OzonClickableSpan ozonClickableSpan2, DescriptionInfo descriptionInfo, boolean z12, boolean z13, @NotNull List<Badge> hotelFeatures, boolean z14, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hotelFeatures, "hotelFeatures");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = title;
        this.isDescriptionVisible = z11;
        this.shortDescription = charSequence;
        this.shortClickableSpan = ozonClickableSpan;
        this.fullDescription = charSequence2;
        this.fullClickableSpan = ozonClickableSpan2;
        this.descriptionInfo = descriptionInfo;
        this.isExpanded = z12;
        this.areFeaturesVisible = z13;
        this.hotelFeatures = hotelFeatures;
        this.areCellsVisible = z14;
        this.cells = cells;
    }

    @NotNull
    public final ToursHotelInfoCardVO copy(long id2, @NotNull TextAtom title, boolean isDescriptionVisible, CharSequence shortDescription, OzonClickableSpan shortClickableSpan, CharSequence fullDescription, OzonClickableSpan fullClickableSpan, DescriptionInfo descriptionInfo, boolean isExpanded, boolean areFeaturesVisible, @NotNull List<Badge> hotelFeatures, boolean areCellsVisible, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hotelFeatures, "hotelFeatures");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new ToursHotelInfoCardVO(id2, title, isDescriptionVisible, shortDescription, shortClickableSpan, fullDescription, fullClickableSpan, descriptionInfo, isExpanded, areFeaturesVisible, hotelFeatures, areCellsVisible, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursHotelInfoCardVO)) {
            return false;
        }
        ToursHotelInfoCardVO toursHotelInfoCardVO = (ToursHotelInfoCardVO) other;
        return this.id == toursHotelInfoCardVO.id && Intrinsics.d(this.title, toursHotelInfoCardVO.title) && this.isDescriptionVisible == toursHotelInfoCardVO.isDescriptionVisible && Intrinsics.d(this.shortDescription, toursHotelInfoCardVO.shortDescription) && Intrinsics.d(this.shortClickableSpan, toursHotelInfoCardVO.shortClickableSpan) && Intrinsics.d(this.fullDescription, toursHotelInfoCardVO.fullDescription) && Intrinsics.d(this.fullClickableSpan, toursHotelInfoCardVO.fullClickableSpan) && Intrinsics.d(this.descriptionInfo, toursHotelInfoCardVO.descriptionInfo) && this.isExpanded == toursHotelInfoCardVO.isExpanded && this.areFeaturesVisible == toursHotelInfoCardVO.areFeaturesVisible && Intrinsics.d(this.hotelFeatures, toursHotelInfoCardVO.hotelFeatures) && this.areCellsVisible == toursHotelInfoCardVO.areCellsVisible && Intrinsics.d(this.cells, toursHotelInfoCardVO.cells);
    }

    public final boolean getAreCellsVisible() {
        return this.areCellsVisible;
    }

    public final boolean getAreFeaturesVisible() {
        return this.areFeaturesVisible;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> getCells() {
        return this.cells;
    }

    public final DescriptionInfo getDescriptionInfo() {
        return this.descriptionInfo;
    }

    public final OzonClickableSpan getFullClickableSpan() {
        return this.fullClickableSpan;
    }

    public final CharSequence getFullDescription() {
        return this.fullDescription;
    }

    @NotNull
    public final List<Badge> getHotelFeatures() {
        return this.hotelFeatures;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final OzonClickableSpan getShortClickableSpan() {
        return this.shortClickableSpan;
    }

    public final CharSequence getShortDescription() {
        return this.shortDescription;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.isDescriptionVisible);
        CharSequence charSequence = this.shortDescription;
        int hashCode = (a11 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        OzonClickableSpan ozonClickableSpan = this.shortClickableSpan;
        int hashCode2 = (hashCode + (ozonClickableSpan == null ? 0 : ozonClickableSpan.hashCode())) * 31;
        CharSequence charSequence2 = this.fullDescription;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        OzonClickableSpan ozonClickableSpan2 = this.fullClickableSpan;
        int hashCode4 = (hashCode3 + (ozonClickableSpan2 == null ? 0 : ozonClickableSpan2.hashCode())) * 31;
        DescriptionInfo descriptionInfo = this.descriptionInfo;
        return this.cells.hashCode() + C3532b.a(g.b(C3532b.a(C3532b.a((hashCode4 + (descriptionInfo != null ? descriptionInfo.hashCode() : 0)) * 31, 31, this.isExpanded), 31, this.areFeaturesVisible), 31, this.hotelFeatures), 31, this.areCellsVisible);
    }

    /* renamed from: isDescriptionVisible, reason: from getter */
    public final boolean getIsDescriptionVisible() {
        return this.isDescriptionVisible;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        boolean z11 = this.isDescriptionVisible;
        CharSequence charSequence = this.shortDescription;
        OzonClickableSpan ozonClickableSpan = this.shortClickableSpan;
        CharSequence charSequence2 = this.fullDescription;
        OzonClickableSpan ozonClickableSpan2 = this.fullClickableSpan;
        DescriptionInfo descriptionInfo = this.descriptionInfo;
        boolean z12 = this.isExpanded;
        boolean z13 = this.areFeaturesVisible;
        List<Badge> list = this.hotelFeatures;
        boolean z14 = this.areCellsVisible;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> list2 = this.cells;
        StringBuilder c11 = C2639a.c("ToursHotelInfoCardVO(id=", j11, ", title=", textAtom);
        c11.append(", isDescriptionVisible=");
        c11.append(z11);
        c11.append(", shortDescription=");
        c11.append((Object) charSequence);
        c11.append(", shortClickableSpan=");
        c11.append(ozonClickableSpan);
        c11.append(", fullDescription=");
        c11.append((Object) charSequence2);
        c11.append(", fullClickableSpan=");
        c11.append(ozonClickableSpan2);
        c11.append(", descriptionInfo=");
        c11.append(descriptionInfo);
        C2436a.e(", isExpanded=", ", areFeaturesVisible=", c11, z12, z13);
        AZ.c.c(c11, ", hotelFeatures=", list, ", areCellsVisible=", z14);
        return h.c(c11, ", cells=", list2, ")");
    }
}
