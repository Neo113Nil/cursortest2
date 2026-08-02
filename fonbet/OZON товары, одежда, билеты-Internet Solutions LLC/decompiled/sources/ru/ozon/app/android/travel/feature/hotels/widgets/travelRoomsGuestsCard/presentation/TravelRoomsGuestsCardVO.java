package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation;

import Ak.b;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "infoBadge", "", "areDetailsVisible", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "details", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;ZLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "getInfoBadge", "()Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "Z", "getAreDetailsVisible", "()Z", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRoomsGuestsCardVO implements c {
    private final boolean areDetailsVisible;

    @NotNull
    private final List<TravelRoomAndGuestsVO> details;
    private final long id;
    private final InfoBadgeVO infoBadge;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public TravelRoomsGuestsCardVO(long j11, @NotNull TextAtom title, InfoBadgeVO infoBadgeVO, boolean z11, @NotNull List<TravelRoomAndGuestsVO> details, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.id = j11;
        this.title = title;
        this.infoBadge = infoBadgeVO;
        this.areDetailsVisible = z11;
        this.details = details;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRoomsGuestsCardVO)) {
            return false;
        }
        TravelRoomsGuestsCardVO travelRoomsGuestsCardVO = (TravelRoomsGuestsCardVO) other;
        return this.id == travelRoomsGuestsCardVO.id && Intrinsics.d(this.title, travelRoomsGuestsCardVO.title) && Intrinsics.d(this.infoBadge, travelRoomsGuestsCardVO.infoBadge) && this.areDetailsVisible == travelRoomsGuestsCardVO.areDetailsVisible && Intrinsics.d(this.details, travelRoomsGuestsCardVO.details) && Intrinsics.d(this.viewEvent, travelRoomsGuestsCardVO.viewEvent);
    }

    public final boolean getAreDetailsVisible() {
        return this.areDetailsVisible;
    }

    @NotNull
    public final List<TravelRoomAndGuestsVO> getDetails() {
        return this.details;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InfoBadgeVO getInfoBadge() {
        return this.infoBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        InfoBadgeVO infoBadgeVO = this.infoBadge;
        int b12 = g.b(C3532b.a((b11 + (infoBadgeVO == null ? 0 : infoBadgeVO.hashCode())) * 31, 31, this.areDetailsVisible), 31, this.details);
        t tVar = this.viewEvent;
        return b12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        InfoBadgeVO infoBadgeVO = this.infoBadge;
        boolean z11 = this.areDetailsVisible;
        List<TravelRoomAndGuestsVO> list = this.details;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("TravelRoomsGuestsCardVO(id=", j11, ", title=", textAtom);
        c11.append(", infoBadge=");
        c11.append(infoBadgeVO);
        c11.append(", areDetailsVisible=");
        c11.append(z11);
        b.h(c11, ", details=", list, ", viewEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
