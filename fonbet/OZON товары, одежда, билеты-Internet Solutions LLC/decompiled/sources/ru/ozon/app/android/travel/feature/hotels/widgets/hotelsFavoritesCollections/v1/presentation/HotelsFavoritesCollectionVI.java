package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation;

import D3.g;
import Kk.C3532b;
import Ns.b;
import Pk0.a;
import WZ.t;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Model;", "model", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;", "placement", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Model;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Model;", "getModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Model;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;", "getPlacement", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;", "Model", "ImagesLinks", "Placement", "Position", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsFavoritesCollectionVI implements c {
    private final long id;
    private final Model model;

    @NotNull
    private final Placement placement;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$ImagesLinks;", "", "", "", "linksList", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/List;)I", "hashCode", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImagesLinks {
        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<? extends String> m1352constructorimpl(@NotNull List<String> linksList) {
            Intrinsics.checkNotNullParameter(linksList, "linksList");
            return linksList;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1353equalsimpl0(List<? extends String> list, List<? extends String> list2) {
            return Intrinsics.d(list, list2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1354hashCodeimpl(List<? extends String> list) {
            return list.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1355toStringimpl(List<? extends String> list) {
            return H3.c.a("ImagesLinks(linksList=", ")", list);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Model;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$ImagesLinks;", "imagesLinks", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "viewEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getImagesLinks-CR9ho0c", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Model {
        private final AtomAction clickAction;

        @NotNull
        private final List<? extends String> imagesLinks;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t viewEvent;

        public /* synthetic */ Model(TextDTO textDTO, TextDTO textDTO2, List list, AtomAction atomAction, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, list, atomAction, tVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.d(this.title, model.title) && Intrinsics.d(this.subtitle, model.subtitle) && ImagesLinks.m1353equalsimpl0(this.imagesLinks, model.imagesLinks) && Intrinsics.d(this.clickAction, model.clickAction) && Intrinsics.d(this.viewEvent, model.viewEvent);
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        @NotNull
        /* renamed from: getImagesLinks-CR9ho0c, reason: not valid java name */
        public final List<? extends String> m1356getImagesLinksCR9ho0c() {
            return this.imagesLinks;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getViewEvent() {
            return this.viewEvent;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int m1354hashCodeimpl = (ImagesLinks.m1354hashCodeimpl(this.imagesLinks) + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            AtomAction atomAction = this.clickAction;
            int hashCode2 = (m1354hashCodeimpl + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.viewEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String m1355toStringimpl = ImagesLinks.m1355toStringimpl(this.imagesLinks);
            AtomAction atomAction = this.clickAction;
            t tVar = this.viewEvent;
            StringBuilder g10 = g.g("Model(title=", textDTO, ", subtitle=", textDTO2, ", imagesLinks=");
            b.d(m1355toStringimpl, ", clickAction=", ", viewEvent=", g10, atomAction);
            return Tl.b.d(g10, tVar, ")");
        }

        private Model(TextDTO title, TextDTO textDTO, List<? extends String> imagesLinks, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imagesLinks, "imagesLinks");
            this.title = title;
            this.subtitle = textDTO;
            this.imagesLinks = imagesLinks;
            this.clickAction = atomAction;
            this.viewEvent = tVar;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Position;", "position", "", "isFirstRow", "isLastRow", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Position;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Position;", "getPosition", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Position;", "Z", "()Z", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Placement {
        private final boolean isFirstRow;
        private final boolean isLastRow;

        @NotNull
        private final Position position;

        public Placement(@NotNull Position position, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(position, "position");
            this.position = position;
            this.isFirstRow = z11;
            this.isLastRow = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Placement)) {
                return false;
            }
            Placement placement = (Placement) other;
            return this.position == placement.position && this.isFirstRow == placement.isFirstRow && this.isLastRow == placement.isLastRow;
        }

        @NotNull
        public final Position getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLastRow) + C3532b.a(this.position.hashCode() * 31, 31, this.isFirstRow);
        }

        /* renamed from: isFirstRow, reason: from getter */
        public final boolean getIsFirstRow() {
            return this.isFirstRow;
        }

        /* renamed from: isLastRow, reason: from getter */
        public final boolean getIsLastRow() {
            return this.isLastRow;
        }

        @NotNull
        public String toString() {
            Position position = this.position;
            boolean z11 = this.isFirstRow;
            boolean z12 = this.isLastRow;
            StringBuilder sb2 = new StringBuilder("Placement(position=");
            sb2.append(position);
            sb2.append(", isFirstRow=");
            sb2.append(z11);
            sb2.append(", isLastRow=");
            return a.a(")", sb2, z12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Position;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position LEFT = new Position("LEFT", 0);
        public static final Position RIGHT = new Position("RIGHT", 1);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{LEFT, RIGHT};
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Position(String str, int i11) {
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public HotelsFavoritesCollectionVI(long j11, Model model, @NotNull Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.id = j11;
        this.model = model;
        this.placement = placement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsFavoritesCollectionVI)) {
            return false;
        }
        HotelsFavoritesCollectionVI hotelsFavoritesCollectionVI = (HotelsFavoritesCollectionVI) other;
        return this.id == hotelsFavoritesCollectionVI.id && Intrinsics.d(this.model, hotelsFavoritesCollectionVI.model) && Intrinsics.d(this.placement, hotelsFavoritesCollectionVI.placement);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Model getModel() {
        return this.model;
    }

    @NotNull
    public final Placement getPlacement() {
        return this.placement;
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
        int hashCode = Long.hashCode(this.id) * 31;
        Model model = this.model;
        return this.placement.hashCode() + ((hashCode + (model == null ? 0 : model.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "HotelsFavoritesCollectionVI(id=" + this.id + ", model=" + this.model + ", placement=" + this.placement + ")";
    }
}
