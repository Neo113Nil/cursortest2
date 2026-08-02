package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Pk0.i;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "", "id", "", "tabGroupId", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "expandButton", "", "isExpanded", "", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "items", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;ZLjava/util/List;LWZ/t;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;ZLjava/util/List;LWZ/t;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "getExpandButton", "()Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "Z", "()Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichContentVO implements TabEmbeddedViewObject {
    private final ExpandableWidget$ExpandButton expandButton;
    private final long id;
    private final boolean isExpanded;

    @NotNull
    private final List<Item> items;
    private final String tabGroupId;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "", "<init>", "()V", "Billboard", "DoubleTile", "ListItem", "Spacer", "Text", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Billboard;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Text;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Item {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b\u000e\u0010)R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\u000f\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Billboard;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "", "image", "", "height", "width", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "imagePosition", "", "isParandja", "isOriginalSize", "<init>", "(Ljava/lang/String;IILru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "I", "getHeight", "getWidth", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Billboard extends Item {
            private final AtomAction action;
            private final int height;

            @NotNull
            private final String image;

            @NotNull
            private final ImagePositionVO imagePosition;
            private final boolean isOriginalSize;
            private final boolean isParandja;
            private final t tokenizedEvent;
            private final int width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Billboard(@NotNull String image, int i11, int i12, AtomAction atomAction, t tVar, @NotNull ImagePositionVO imagePosition, boolean z11, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
                this.image = image;
                this.height = i11;
                this.width = i12;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
                this.imagePosition = imagePosition;
                this.isParandja = z11;
                this.isOriginalSize = z12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Billboard)) {
                    return false;
                }
                Billboard billboard = (Billboard) other;
                return Intrinsics.d(this.image, billboard.image) && this.height == billboard.height && this.width == billboard.width && Intrinsics.d(this.action, billboard.action) && Intrinsics.d(this.tokenizedEvent, billboard.tokenizedEvent) && this.imagePosition == billboard.imagePosition && this.isParandja == billboard.isParandja && this.isOriginalSize == billboard.isOriginalSize;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final int getHeight() {
                return this.height;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final ImagePositionVO getImagePosition() {
                return this.imagePosition;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.width, C2454a.a(this.height, this.image.hashCode() * 31, 31), 31);
                AtomAction atomAction = this.action;
                int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return Boolean.hashCode(this.isOriginalSize) + C3532b.a((this.imagePosition.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31, 31, this.isParandja);
            }

            /* renamed from: isOriginalSize, reason: from getter */
            public final boolean getIsOriginalSize() {
                return this.isOriginalSize;
            }

            /* renamed from: isParandja, reason: from getter */
            public final boolean getIsParandja() {
                return this.isParandja;
            }

            @NotNull
            public String toString() {
                String str = this.image;
                int i11 = this.height;
                int i12 = this.width;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                ImagePositionVO imagePositionVO = this.imagePosition;
                boolean z11 = this.isParandja;
                boolean z12 = this.isOriginalSize;
                StringBuilder c11 = C3660k.c(i11, "Billboard(image=", str, ", height=", ", width=");
                c11.append(i12);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(", tokenizedEvent=");
                c11.append(tVar);
                c11.append(", imagePosition=");
                c11.append(imagePositionVO);
                c11.append(", isParandja=");
                c11.append(z11);
                c11.append(", isOriginalSize=");
                c11.append(z12);
                c11.append(")");
                return c11.toString();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;", "left", "right", "<init>", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;", "getLeft", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;", "getRight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DoubleTile extends Item {

            @NotNull
            private final TileVO left;
            private final TileVO right;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleTile(@NotNull TileVO left, TileVO tileVO) {
                super(null);
                Intrinsics.checkNotNullParameter(left, "left");
                this.left = left;
                this.right = tileVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleTile)) {
                    return false;
                }
                DoubleTile doubleTile = (DoubleTile) other;
                return Intrinsics.d(this.left, doubleTile.left) && Intrinsics.d(this.right, doubleTile.right);
            }

            @NotNull
            public final TileVO getLeft() {
                return this.left;
            }

            public final TileVO getRight() {
                return this.right;
            }

            public int hashCode() {
                int hashCode = this.left.hashCode() * 31;
                TileVO tileVO = this.right;
                return hashCode + (tileVO == null ? 0 : tileVO.hashCode());
            }

            @NotNull
            public String toString() {
                return "DoubleTile(left=" + this.left + ", right=" + this.right + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "<init>", "()V", "NumberList", "BulletList", "ImageList", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$BulletList;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$ImageList;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ListItem extends Item {

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$BulletList;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "", "bulletSize", "", "bulletColor", "bulletMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "I", "getBulletSize", "Ljava/lang/String;", "getBulletColor", "getBulletMargin", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BulletList extends ListItem {

                @NotNull
                private final String bulletColor;
                private final int bulletMargin;
                private final int bulletSize;
                private final TextDTO text;
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BulletList(TextDTO textDTO, TextDTO textDTO2, int i11, @NotNull String bulletColor, int i12) {
                    super(null);
                    Intrinsics.checkNotNullParameter(bulletColor, "bulletColor");
                    this.title = textDTO;
                    this.text = textDTO2;
                    this.bulletSize = i11;
                    this.bulletColor = bulletColor;
                    this.bulletMargin = i12;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BulletList)) {
                        return false;
                    }
                    BulletList bulletList = (BulletList) other;
                    return Intrinsics.d(this.title, bulletList.title) && Intrinsics.d(this.text, bulletList.text) && this.bulletSize == bulletList.bulletSize && Intrinsics.d(this.bulletColor, bulletList.bulletColor) && this.bulletMargin == bulletList.bulletMargin;
                }

                @NotNull
                public final String getBulletColor() {
                    return this.bulletColor;
                }

                public final int getBulletMargin() {
                    return this.bulletMargin;
                }

                public final int getBulletSize() {
                    return this.bulletSize;
                }

                public TextDTO getText() {
                    return this.text;
                }

                public TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    TextDTO textDTO = this.title;
                    int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                    TextDTO textDTO2 = this.text;
                    return Integer.hashCode(this.bulletMargin) + g.a(C2454a.a(this.bulletSize, (hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31, 31), 31, this.bulletColor);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.text;
                    int i11 = this.bulletSize;
                    String str = this.bulletColor;
                    int i12 = this.bulletMargin;
                    StringBuilder g10 = D3.g.g("BulletList(title=", textDTO, ", text=", textDTO2, ", bulletSize=");
                    i.c(i11, ", bulletColor=", str, ", bulletMargin=", g10);
                    return b.e(i12, ")", g10);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$ImageList;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "", "image", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "imagePosition", "", "isParandja", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "Ljava/lang/String;", "getImage", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ImageList extends ListItem {
                private final String image;

                @NotNull
                private final ImagePositionVO imagePosition;
                private final boolean isParandja;
                private final TextDTO text;
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ImageList(TextDTO textDTO, TextDTO textDTO2, String str, @NotNull ImagePositionVO imagePosition, boolean z11) {
                    super(null);
                    Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
                    this.title = textDTO;
                    this.text = textDTO2;
                    this.image = str;
                    this.imagePosition = imagePosition;
                    this.isParandja = z11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ImageList)) {
                        return false;
                    }
                    ImageList imageList = (ImageList) other;
                    return Intrinsics.d(this.title, imageList.title) && Intrinsics.d(this.text, imageList.text) && Intrinsics.d(this.image, imageList.image) && this.imagePosition == imageList.imagePosition && this.isParandja == imageList.isParandja;
                }

                public final String getImage() {
                    return this.image;
                }

                @NotNull
                public final ImagePositionVO getImagePosition() {
                    return this.imagePosition;
                }

                public TextDTO getText() {
                    return this.text;
                }

                public TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    TextDTO textDTO = this.title;
                    int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                    TextDTO textDTO2 = this.text;
                    int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
                    String str = this.image;
                    return Boolean.hashCode(this.isParandja) + ((this.imagePosition.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
                }

                /* renamed from: isParandja, reason: from getter */
                public final boolean getIsParandja() {
                    return this.isParandja;
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.text;
                    String str = this.image;
                    ImagePositionVO imagePositionVO = this.imagePosition;
                    boolean z11 = this.isParandja;
                    StringBuilder g10 = D3.g.g("ImageList(title=", textDTO, ", text=", textDTO2, ", image=");
                    g10.append(str);
                    g10.append(", imagePosition=");
                    g10.append(imagePositionVO);
                    g10.append(", isParandja=");
                    return a.a(")", g10, z11);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$NumberList;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "numberAtom", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "getNumberAtom", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class NumberList extends ListItem {

                @NotNull
                private final TextDTO numberAtom;
                private final TextDTO text;
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NumberList(TextDTO textDTO, TextDTO textDTO2, @NotNull TextDTO numberAtom) {
                    super(null);
                    Intrinsics.checkNotNullParameter(numberAtom, "numberAtom");
                    this.title = textDTO;
                    this.text = textDTO2;
                    this.numberAtom = numberAtom;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NumberList)) {
                        return false;
                    }
                    NumberList numberList = (NumberList) other;
                    return Intrinsics.d(this.title, numberList.title) && Intrinsics.d(this.text, numberList.text) && Intrinsics.d(this.numberAtom, numberList.numberAtom);
                }

                @NotNull
                public final TextDTO getNumberAtom() {
                    return this.numberAtom;
                }

                public TextDTO getText() {
                    return this.text;
                }

                public TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    TextDTO textDTO = this.title;
                    int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                    TextDTO textDTO2 = this.text;
                    return this.numberAtom.hashCode() + ((hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.text;
                    return Tl.b.e(D3.g.g("NumberList(title=", textDTO, ", text=", textDTO2, ", numberAtom="), this.numberAtom, ")");
                }
            }

            public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ListItem() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "", "height", "", "backgroundColor", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "Ljava/lang/String;", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacer extends Item {
            private final String backgroundColor;
            private final int height;

            public Spacer(int i11, String str) {
                super(null);
                this.height = i11;
                this.backgroundColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacer)) {
                    return false;
                }
                Spacer spacer = (Spacer) other;
                return this.height == spacer.height && Intrinsics.d(this.backgroundColor, spacer.backgroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getHeight() {
                return this.height;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.height) * 31;
                String str = this.backgroundColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return Nh.a.c(this.height, "Spacer(height=", ", backgroundColor=", this.backgroundColor, ")");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Text;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "backgroundColor", "", "horizontalPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "I", "getHorizontalPadding", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text extends Item {

            @NotNull
            private final String backgroundColor;
            private final int horizontalPadding;

            @NotNull
            private final TextDTO text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(@NotNull TextDTO text, @NotNull String backgroundColor, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.text = text;
                this.backgroundColor = backgroundColor;
                this.horizontalPadding = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.text, text.text) && Intrinsics.d(this.backgroundColor, text.backgroundColor) && this.horizontalPadding == text.horizontalPadding;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getHorizontalPadding() {
                return this.horizontalPadding;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return Integer.hashCode(this.horizontalPadding) + g.a(this.text.hashCode() * 31, 31, this.backgroundColor);
            }

            @NotNull
            public String toString() {
                return b.e(this.horizontalPadding, ")", D3.g.f("Text(text=", this.text, ", backgroundColor=", this.backgroundColor, ", horizontalPadding="));
            }
        }

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Item() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RichContentVO(long j11, String str, ExpandableWidget$ExpandButton expandableWidget$ExpandButton, boolean z11, @NotNull List<? extends Item> items, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.tabGroupId = str;
        this.expandButton = expandableWidget$ExpandButton;
        this.isExpanded = z11;
        this.items = items;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ RichContentVO copy$default(RichContentVO richContentVO, long j11, String str, ExpandableWidget$ExpandButton expandableWidget$ExpandButton, boolean z11, List list, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = richContentVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = richContentVO.tabGroupId;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            expandableWidget$ExpandButton = richContentVO.expandButton;
        }
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton2 = expandableWidget$ExpandButton;
        if ((i11 & 8) != 0) {
            z11 = richContentVO.isExpanded;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            list = richContentVO.items;
        }
        List list2 = list;
        if ((i11 & 32) != 0) {
            tVar = richContentVO.tokenizedEvent;
        }
        return richContentVO.copy(j12, str2, expandableWidget$ExpandButton2, z12, list2, tVar);
    }

    @NotNull
    public final RichContentVO copy(long id2, String tabGroupId, ExpandableWidget$ExpandButton expandButton, boolean isExpanded, @NotNull List<? extends Item> items, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new RichContentVO(id2, tabGroupId, expandButton, isExpanded, items, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichContentVO)) {
            return false;
        }
        RichContentVO richContentVO = (RichContentVO) other;
        return this.id == richContentVO.id && Intrinsics.d(this.tabGroupId, richContentVO.tabGroupId) && Intrinsics.d(this.expandButton, richContentVO.expandButton) && this.isExpanded == richContentVO.isExpanded && Intrinsics.d(this.items, richContentVO.items) && Intrinsics.d(this.tokenizedEvent, richContentVO.tokenizedEvent);
    }

    public ExpandableWidget$ExpandButton getExpandButton() {
        return this.expandButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton = this.expandButton;
        int b11 = g.b(C3532b.a((hashCode2 + (expandableWidget$ExpandButton == null ? 0 : expandableWidget$ExpandButton.hashCode())) * 31, 31, this.isExpanded), 31, this.items);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isExpanded, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        ExpandableWidget$ExpandButton expandableWidget$ExpandButton = this.expandButton;
        boolean z11 = this.isExpanded;
        List<Item> list = this.items;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "RichContentVO(id=", ", tabGroupId=", str);
        c11.append(", expandButton=");
        c11.append(expandableWidget$ExpandButton);
        c11.append(", isExpanded=");
        c11.append(z11);
        Ak.b.h(c11, ", items=", list, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
