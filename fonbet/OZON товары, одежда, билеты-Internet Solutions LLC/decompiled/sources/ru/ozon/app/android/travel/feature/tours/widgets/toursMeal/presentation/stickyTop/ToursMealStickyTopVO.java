package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop;

import B90.C2619v;
import Bl.C2639a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010*R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "filterTabs", "", "isFilterTabsVisible", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "fixedComposerHeight", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLWZ/t;Ljava/lang/Integer;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLWZ/t;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getFilterTabs", "()Ljava/util/List;", "Z", "()Z", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getFixedComposerHeight", "()Ljava/lang/Integer;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursMealStickyTopVO implements c {

    @NotNull
    private final List<TravelTabVO> filterTabs;
    private final Integer fixedComposerHeight;
    private final long id;
    private final boolean isFilterTabsVisible;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public ToursMealStickyTopVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull List<TravelTabVO> filterTabs, boolean z11, t tVar, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filterTabs, "filterTabs");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.filterTabs = filterTabs;
        this.isFilterTabsVisible = z11;
        this.viewEvent = tVar;
        this.fixedComposerHeight = num;
    }

    public static /* synthetic */ ToursMealStickyTopVO copy$default(ToursMealStickyTopVO toursMealStickyTopVO, long j11, TextAtom textAtom, TextAtom textAtom2, List list, boolean z11, t tVar, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = toursMealStickyTopVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textAtom = toursMealStickyTopVO.title;
        }
        TextAtom textAtom3 = textAtom;
        if ((i11 & 4) != 0) {
            textAtom2 = toursMealStickyTopVO.subtitle;
        }
        TextAtom textAtom4 = textAtom2;
        if ((i11 & 8) != 0) {
            list = toursMealStickyTopVO.filterTabs;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            z11 = toursMealStickyTopVO.isFilterTabsVisible;
        }
        return toursMealStickyTopVO.copy(j12, textAtom3, textAtom4, list2, z11, (i11 & 32) != 0 ? toursMealStickyTopVO.viewEvent : tVar, (i11 & 64) != 0 ? toursMealStickyTopVO.fixedComposerHeight : num);
    }

    @NotNull
    public final ToursMealStickyTopVO copy(long id2, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull List<TravelTabVO> filterTabs, boolean isFilterTabsVisible, t viewEvent, Integer fixedComposerHeight) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filterTabs, "filterTabs");
        return new ToursMealStickyTopVO(id2, title, subtitle, filterTabs, isFilterTabsVisible, viewEvent, fixedComposerHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealStickyTopVO)) {
            return false;
        }
        ToursMealStickyTopVO toursMealStickyTopVO = (ToursMealStickyTopVO) other;
        return this.id == toursMealStickyTopVO.id && Intrinsics.d(this.title, toursMealStickyTopVO.title) && Intrinsics.d(this.subtitle, toursMealStickyTopVO.subtitle) && Intrinsics.d(this.filterTabs, toursMealStickyTopVO.filterTabs) && this.isFilterTabsVisible == toursMealStickyTopVO.isFilterTabsVisible && Intrinsics.d(this.viewEvent, toursMealStickyTopVO.viewEvent) && Intrinsics.d(this.fixedComposerHeight, toursMealStickyTopVO.fixedComposerHeight);
    }

    @NotNull
    public final List<TravelTabVO> getFilterTabs() {
        return this.filterTabs;
    }

    public final Integer getFixedComposerHeight() {
        return this.fixedComposerHeight;
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
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31, this.filterTabs), 31, this.isFilterTabsVisible);
        t tVar = this.viewEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.fixedComposerHeight;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isFilterTabsVisible, reason: from getter */
    public final boolean getIsFilterTabsVisible() {
        return this.isFilterTabsVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<TravelTabVO> list = this.filterTabs;
        boolean z11 = this.isFilterTabsVisible;
        t tVar = this.viewEvent;
        Integer num = this.fixedComposerHeight;
        StringBuilder c11 = C2639a.c("ToursMealStickyTopVO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", filterTabs=");
        c11.append(list);
        C2971a.d(c11, ", isFilterTabsVisible=", z11, ", viewEvent=", tVar);
        c11.append(", fixedComposerHeight=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ ToursMealStickyTopVO(long j11, TextAtom textAtom, TextAtom textAtom2, List list, boolean z11, t tVar, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textAtom, textAtom2, list, z11, tVar, (i11 & 64) != 0 ? null : num);
    }
}
