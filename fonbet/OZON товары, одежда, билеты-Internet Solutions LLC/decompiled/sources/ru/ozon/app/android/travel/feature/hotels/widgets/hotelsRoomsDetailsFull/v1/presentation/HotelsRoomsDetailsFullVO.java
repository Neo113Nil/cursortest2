package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "", "images", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/InfoCardVO;", "infoCards", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", ResultDTO.CONTENT_TYPE_SERVICES, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getInfoCards", "getServices", "LWZ/t;", "getViewEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullVO implements c {
    private final long id;
    private final List<String> images;
    private final List<InfoCardVO> infoCards;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public HotelsRoomsDetailsFullVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, List<String> list, List<InfoCardVO> list2, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list3, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.images = list;
        this.infoCards = list2;
        this.services = list3;
        this.viewEvent = tVar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final List<InfoCardVO> getInfoCards() {
        return this.infoCards;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getServices() {
        return this.services;
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
}
