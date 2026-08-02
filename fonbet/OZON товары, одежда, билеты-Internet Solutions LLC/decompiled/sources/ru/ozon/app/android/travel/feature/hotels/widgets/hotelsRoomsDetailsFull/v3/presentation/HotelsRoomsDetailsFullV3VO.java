package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.iconWithText.v3.IconWithTextV3VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u000e\u0010%R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b\u0011\u0010%R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "titleBadge", "subtitle", "", "", "images", "", "isImagesVisible", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v3/IconWithTextV3VO;", "infoCards", "isInfoCardsVisible", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLjava/util/List;ZLWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Z", "()Z", "getInfoCards", "LWZ/t;", "getViewEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullV3VO implements c {
    private final long id;

    @NotNull
    private final List<String> images;

    @NotNull
    private final List<IconWithTextV3VO> infoCards;
    private final boolean isImagesVisible;
    private final boolean isInfoCardsVisible;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final BadgeDTO titleBadge;
    private final t viewEvent;

    public HotelsRoomsDetailsFullV3VO(long j11, @NotNull TextDTO title, BadgeDTO badgeDTO, TextDTO textDTO, @NotNull List<String> images, boolean z11, @NotNull List<IconWithTextV3VO> infoCards, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(infoCards, "infoCards");
        this.id = j11;
        this.title = title;
        this.titleBadge = badgeDTO;
        this.subtitle = textDTO;
        this.images = images;
        this.isImagesVisible = z11;
        this.infoCards = infoCards;
        this.isInfoCardsVisible = z12;
        this.viewEvent = tVar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final List<IconWithTextV3VO> getInfoCards() {
        return this.infoCards;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    /* renamed from: isImagesVisible, reason: from getter */
    public final boolean getIsImagesVisible() {
        return this.isImagesVisible;
    }

    /* renamed from: isInfoCardsVisible, reason: from getter */
    public final boolean getIsInfoCardsVisible() {
        return this.isInfoCardsVisible;
    }
}
