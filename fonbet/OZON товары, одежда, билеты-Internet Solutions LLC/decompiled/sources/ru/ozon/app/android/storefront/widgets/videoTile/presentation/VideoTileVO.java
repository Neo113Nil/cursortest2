package ru.ozon.app.android.storefront.widgets.videoTile.presentation;

import Ak.C2436a;
import B90.C2619v;
import G.g;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.videoTile.data.DesignType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b4\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoTile/presentation/VideoTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "", "imageHeightRatio", "Lru/ozon/uni/atoms/data/badge/Badge;", "timeBadge", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/videoTile/data/DesignType;", "designType", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "<init>", "(JLjava/lang/String;FLru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/storefront/widgets/videoTile/data/DesignType;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "F", "getImageHeightRatio", "()F", "Lru/ozon/uni/atoms/data/badge/Badge;", "getTimeBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/storefront/widgets/videoTile/data/DesignType;", "getDesignType", "()Lru/ozon/app/android/storefront/widgets/videoTile/data/DesignType;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoTileVO implements c {
    private final AtomAction action;
    private final BadgeDTO advBadge;

    @NotNull
    private final DesignType designType;
    private final long id;

    @NotNull
    private final String image;
    private final float imageHeightRatio;
    private final TextAtom subtitle;

    @NotNull
    private final Badge timeBadge;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public VideoTileVO(long j11, @NotNull String image, float f7, @NotNull Badge timeBadge, @NotNull TextAtom title, @NotNull DesignType designType, TextAtom textAtom, AtomAction atomAction, t tVar, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(timeBadge, "timeBadge");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(designType, "designType");
        this.id = j11;
        this.image = image;
        this.imageHeightRatio = f7;
        this.timeBadge = timeBadge;
        this.title = title;
        this.designType = designType;
        this.subtitle = textAtom;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.advBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTileVO)) {
            return false;
        }
        VideoTileVO videoTileVO = (VideoTileVO) other;
        return this.id == videoTileVO.id && Intrinsics.d(this.image, videoTileVO.image) && Float.compare(this.imageHeightRatio, videoTileVO.imageHeightRatio) == 0 && Intrinsics.d(this.timeBadge, videoTileVO.timeBadge) && Intrinsics.d(this.title, videoTileVO.title) && this.designType == videoTileVO.designType && Intrinsics.d(this.subtitle, videoTileVO.subtitle) && Intrinsics.d(this.action, videoTileVO.action) && Intrinsics.d(this.tokenizedEvent, videoTileVO.tokenizedEvent) && Intrinsics.d(this.advBadge, videoTileVO.advBadge);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    @NotNull
    public final DesignType getDesignType() {
        return this.designType;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final float getImageHeightRatio() {
        return this.imageHeightRatio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final Badge getTimeBadge() {
        return this.timeBadge;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.designType.hashCode() + C2619v.b((this.timeBadge.hashCode() + b.a(this.imageHeightRatio, g.a(Long.hashCode(this.id) * 31, 31, this.image), 31)) * 31, 31, this.title)) * 31;
        TextAtom textAtom = this.subtitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        BadgeDTO badgeDTO = this.advBadge;
        return hashCode4 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        float f7 = this.imageHeightRatio;
        Badge badge = this.timeBadge;
        TextAtom textAtom = this.title;
        DesignType designType = this.designType;
        TextAtom textAtom2 = this.subtitle;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        BadgeDTO badgeDTO = this.advBadge;
        StringBuilder c11 = C2436a.c(j11, "VideoTileVO(id=", ", image=", str);
        c11.append(", imageHeightRatio=");
        c11.append(f7);
        c11.append(", timeBadge=");
        c11.append(badge);
        c11.append(", title=");
        c11.append(textAtom);
        c11.append(", designType=");
        c11.append(designType);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", advBadge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
