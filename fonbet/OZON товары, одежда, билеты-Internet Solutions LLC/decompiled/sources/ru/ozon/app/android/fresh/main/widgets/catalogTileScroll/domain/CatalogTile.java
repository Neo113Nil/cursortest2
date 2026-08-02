package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain;

import Ak.C2436a;
import G.g;
import Sh.b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.AnimationType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "<init>", "(J)V", "J", "getId", "()J", "TileItemVO", "SeparatorVO", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$SeparatorVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CatalogTile implements c {
    private final long id;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$SeparatorVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorVO extends CatalogTile {
        private final long id;

        public SeparatorVO(long j11) {
            super(j11, null);
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeparatorVO) && this.id == ((SeparatorVO) other).id;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile, l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return b.b(this.id, "SeparatorVO(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "", "id", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "badge", "backgroundColor", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "animationType", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "getBadge", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "getBackgroundColor", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "getAnimationType", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileItemVO extends CatalogTile {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final AnimationType animationType;
        private final String backgroundColor;
        private final FavoriteBadgeVO badge;
        private final long id;

        @NotNull
        private final String image;
        private final TextDTO title;
        private final t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileItemVO(long j11, @NotNull String image, TextDTO textDTO, @NotNull AtomAction action, FavoriteBadgeVO favoriteBadgeVO, String str, @NotNull AnimationType animationType, t tVar) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            this.id = j11;
            this.image = image;
            this.title = textDTO;
            this.action = action;
            this.badge = favoriteBadgeVO;
            this.backgroundColor = str;
            this.animationType = animationType;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItemVO)) {
                return false;
            }
            TileItemVO tileItemVO = (TileItemVO) other;
            return this.id == tileItemVO.id && Intrinsics.d(this.image, tileItemVO.image) && Intrinsics.d(this.title, tileItemVO.title) && Intrinsics.d(this.action, tileItemVO.action) && Intrinsics.d(this.badge, tileItemVO.badge) && Intrinsics.d(this.backgroundColor, tileItemVO.backgroundColor) && this.animationType == tileItemVO.animationType && Intrinsics.d(this.tokenizedEvent, tileItemVO.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final AnimationType getAnimationType() {
            return this.animationType;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final FavoriteBadgeVO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile, l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.image);
            TextDTO textDTO = this.title;
            int a12 = C4598rp.a(this.action, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
            FavoriteBadgeVO favoriteBadgeVO = this.badge;
            int hashCode = (a12 + (favoriteBadgeVO == null ? 0 : favoriteBadgeVO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (this.animationType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.image;
            TextDTO textDTO = this.title;
            AtomAction atomAction = this.action;
            FavoriteBadgeVO favoriteBadgeVO = this.badge;
            String str2 = this.backgroundColor;
            AnimationType animationType = this.animationType;
            t tVar = this.tokenizedEvent;
            StringBuilder c11 = C2436a.c(j11, "TileItemVO(id=", ", image=", str);
            c11.append(", title=");
            c11.append(textDTO);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", badge=");
            c11.append(favoriteBadgeVO);
            c11.append(", backgroundColor=");
            c11.append(str2);
            c11.append(", animationType=");
            c11.append(animationType);
            c11.append(", tokenizedEvent=");
            c11.append(tVar);
            c11.append(")");
            return c11.toString();
        }
    }

    public /* synthetic */ CatalogTile(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private CatalogTile(long j11) {
        this.id = j11;
    }
}
