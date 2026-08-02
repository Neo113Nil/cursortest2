package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import Cm.e;
import G.g;
import Nh.a;
import Nh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000656789:B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "topImage", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "items", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "", "backgroundImage", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTopImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/lang/String;", "getBackgroundImage", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "TopTravelItem", "Button", "Badge", "Text", "Cell", "ItemSpacer", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TopTravelModalVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final IconButtonV3DTO closeButton;
    private final long id;

    @NotNull
    private final List<TopTravelItem> items;
    private final ImageDTO topImage;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Badge;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(ILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge implements TopTravelItem {

        @NotNull
        private final BadgeDTO badge;
        private final int id;

        public Badge(int i11, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.id = i11;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return this.id == badge.id && Intrinsics.d(this.badge, badge.badge);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO.TopTravelItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.badge.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Badge(id=" + this.id + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Button;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(ILru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements TopTravelItem {

        @NotNull
        private final ButtonV3DTO button;
        private final int id;

        public Button(int i11, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = i11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return this.id == button.id && Intrinsics.d(this.button, button.button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO.TopTravelItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.button.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Button(id=" + this.id + ", button=" + this.button + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Cell;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell implements TopTravelItem {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final int id;

        public Cell(int i11, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return this.id == cell.id && Intrinsics.d(this.cell, cell.cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        @Override // ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO.TopTravelItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.cell.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Cell(id=" + this.id + ", cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$ItemSpacer;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "height", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getHeight", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemSpacer implements TopTravelItem {
        private final int height;
        private final int id;

        public ItemSpacer(int i11, int i12) {
            this.id = i11;
            this.height = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemSpacer)) {
                return false;
            }
            ItemSpacer itemSpacer = (ItemSpacer) other;
            return this.id == itemSpacer.id && this.height == itemSpacer.height;
        }

        public final int getHeight() {
            return this.height;
        }

        @Override // ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO.TopTravelItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("ItemSpacer(id=", this.id, ", height=", ")", this.height);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Text;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Text implements TopTravelItem {
        private final int id;

        @NotNull
        private final TextDTO text;

        public Text(int i11, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return this.id == text.id && Intrinsics.d(this.text, text.text);
        }

        @Override // ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO.TopTravelItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "Text(id=" + this.id + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Badge;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Button;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Cell;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$ItemSpacer;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$Text;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TopTravelItem {
        int getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopTravelModalVO(long j11, ImageDTO imageDTO, @NotNull List<? extends TopTravelItem> items, IconButtonV3DTO iconButtonV3DTO, String str, @NotNull String backgroundColor, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.topImage = imageDTO;
        this.items = items;
        this.closeButton = iconButtonV3DTO;
        this.backgroundImage = str;
        this.backgroundColor = backgroundColor;
        this.action = atomAction;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopTravelModalVO)) {
            return false;
        }
        TopTravelModalVO topTravelModalVO = (TopTravelModalVO) other;
        return this.id == topTravelModalVO.id && Intrinsics.d(this.topImage, topTravelModalVO.topImage) && Intrinsics.d(this.items, topTravelModalVO.items) && Intrinsics.d(this.closeButton, topTravelModalVO.closeButton) && Intrinsics.d(this.backgroundImage, topTravelModalVO.backgroundImage) && Intrinsics.d(this.backgroundColor, topTravelModalVO.backgroundColor) && Intrinsics.d(this.action, topTravelModalVO.action) && Intrinsics.d(this.viewEvent, topTravelModalVO.viewEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TopTravelItem> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ImageDTO getTopImage() {
        return this.topImage;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.topImage;
        int b11 = g.b((hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31, this.items);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode2 = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        String str = this.backgroundImage;
        int a11 = g.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundColor);
        AtomAction atomAction = this.action;
        int hashCode3 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.topImage;
        List<TopTravelItem> list = this.items;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        String str = this.backgroundImage;
        String str2 = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.viewEvent;
        StringBuilder c11 = b.c("TopTravelModalVO(id=", j11, ", topImage=", imageDTO);
        c11.append(", items=");
        c11.append(list);
        c11.append(", closeButton=");
        c11.append(iconButtonV3DTO);
        a.h(c11, ", backgroundImage=", str, ", backgroundColor=", str2);
        Fj.c.e(tVar, ", action=", ", viewEvent=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}
