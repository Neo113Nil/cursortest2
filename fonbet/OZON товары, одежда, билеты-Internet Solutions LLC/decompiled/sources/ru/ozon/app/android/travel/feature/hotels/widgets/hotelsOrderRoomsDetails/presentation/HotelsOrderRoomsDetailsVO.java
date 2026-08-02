package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import D3.h;
import Ek.a;
import Pk0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "cellBlocks", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getCellBlocks", "()Ljava/util/List;", "CellListVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsOrderRoomsDetailsVO implements c {
    private final BadgeDTO badge;

    @NotNull
    private final List<CellListVO> cellBlocks;
    private final long id;
    private final ImageDTO image;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "layoutModel", "<init>", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "LayoutModel", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellListVO implements c {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO atom;
        private final long id;

        @NotNull
        private final LayoutModel layoutModel;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "", "", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel$Background;", "blockBackground", "<init>", "(IIIILru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel$Background;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeftMargin", "getTopMargin", "getRightMargin", "getBottomMargin", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel$Background;", "getBlockBackground", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel$Background;", "Background", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LayoutModel {
            private final Background blockBackground;
            private final int bottomMargin;
            private final int leftMargin;
            private final int rightMargin;
            private final int topMargin;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel$Background;", "", "", "backgroundColor", "", "topCornersRadius", "bottomCornersRadius", "<init>", "(Ljava/lang/String;FF)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopCornersRadius", "()F", "getBottomCornersRadius", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Background {

                @NotNull
                private final String backgroundColor;
                private final float bottomCornersRadius;
                private final float topCornersRadius;

                public Background(@NotNull String backgroundColor, float f7, float f11) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    this.backgroundColor = backgroundColor;
                    this.topCornersRadius = f7;
                    this.bottomCornersRadius = f11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) other;
                    return Intrinsics.d(this.backgroundColor, background.backgroundColor) && Float.compare(this.topCornersRadius, background.topCornersRadius) == 0 && Float.compare(this.bottomCornersRadius, background.bottomCornersRadius) == 0;
                }

                @NotNull
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final float getBottomCornersRadius() {
                    return this.bottomCornersRadius;
                }

                public final float getTopCornersRadius() {
                    return this.topCornersRadius;
                }

                public int hashCode() {
                    return Float.hashCode(this.bottomCornersRadius) + b.a(this.topCornersRadius, this.backgroundColor.hashCode() * 31, 31);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    float f7 = this.topCornersRadius;
                    float f11 = this.bottomCornersRadius;
                    StringBuilder sb2 = new StringBuilder("Background(backgroundColor=");
                    sb2.append(str);
                    sb2.append(", topCornersRadius=");
                    sb2.append(f7);
                    sb2.append(", bottomCornersRadius=");
                    return V.b(f11, ")", sb2);
                }
            }

            public LayoutModel(int i11, int i12, int i13, int i14, Background background) {
                this.leftMargin = i11;
                this.topMargin = i12;
                this.rightMargin = i13;
                this.bottomMargin = i14;
                this.blockBackground = background;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LayoutModel)) {
                    return false;
                }
                LayoutModel layoutModel = (LayoutModel) other;
                return this.leftMargin == layoutModel.leftMargin && this.topMargin == layoutModel.topMargin && this.rightMargin == layoutModel.rightMargin && this.bottomMargin == layoutModel.bottomMargin && Intrinsics.d(this.blockBackground, layoutModel.blockBackground);
            }

            public final Background getBlockBackground() {
                return this.blockBackground;
            }

            public final int getBottomMargin() {
                return this.bottomMargin;
            }

            public final int getLeftMargin() {
                return this.leftMargin;
            }

            public final int getRightMargin() {
                return this.rightMargin;
            }

            public final int getTopMargin() {
                return this.topMargin;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.bottomMargin, C2454a.a(this.rightMargin, C2454a.a(this.topMargin, Integer.hashCode(this.leftMargin) * 31, 31), 31), 31);
                Background background = this.blockBackground;
                return a11 + (background == null ? 0 : background.hashCode());
            }

            @NotNull
            public String toString() {
                int i11 = this.leftMargin;
                int i12 = this.topMargin;
                int i13 = this.rightMargin;
                int i14 = this.bottomMargin;
                Background background = this.blockBackground;
                StringBuilder a11 = C2438a.a("LayoutModel(leftMargin=", i11, ", topMargin=", ", rightMargin=", i12);
                a.f(i13, i14, ", bottomMargin=", ", blockBackground=", a11);
                a11.append(background);
                a11.append(")");
                return a11.toString();
            }
        }

        public CellListVO(long j11, @NotNull AtomDTO atom, @NotNull LayoutModel layoutModel) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
            this.id = j11;
            this.atom = atom;
            this.layoutModel = layoutModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellListVO)) {
                return false;
            }
            CellListVO cellListVO = (CellListVO) other;
            return this.id == cellListVO.id && Intrinsics.d(this.atom, cellListVO.atom) && Intrinsics.d(this.layoutModel, cellListVO.layoutModel);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final LayoutModel getLayoutModel() {
            return this.layoutModel;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            return this.layoutModel.hashCode() + ((this.atom.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "CellListVO(id=" + this.id + ", atom=" + this.atom + ", layoutModel=" + this.layoutModel + ")";
        }
    }

    public HotelsOrderRoomsDetailsVO(long j11, ImageDTO imageDTO, @NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull List<CellListVO> cellBlocks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        this.id = j11;
        this.image = imageDTO;
        this.title = title;
        this.badge = badgeDTO;
        this.cellBlocks = cellBlocks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsOrderRoomsDetailsVO)) {
            return false;
        }
        HotelsOrderRoomsDetailsVO hotelsOrderRoomsDetailsVO = (HotelsOrderRoomsDetailsVO) other;
        return this.id == hotelsOrderRoomsDetailsVO.id && Intrinsics.d(this.image, hotelsOrderRoomsDetailsVO.image) && Intrinsics.d(this.title, hotelsOrderRoomsDetailsVO.title) && Intrinsics.d(this.badge, hotelsOrderRoomsDetailsVO.badge) && Intrinsics.d(this.cellBlocks, hotelsOrderRoomsDetailsVO.cellBlocks);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<CellListVO> getCellBlocks() {
        return this.cellBlocks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = Ns.b.a(this.title, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        return this.cellBlocks.hashCode() + ((a11 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        List<CellListVO> list = this.cellBlocks;
        StringBuilder c11 = Nh.b.c("HotelsOrderRoomsDetailsVO(id=", j11, ", image=", imageDTO);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", badge=");
        c11.append(badgeDTO);
        return h.c(c11, ", cellBlocks=", list, ")");
    }
}
