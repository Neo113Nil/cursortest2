package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO;", "items", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "PassengersMatcherItemVO", "LayoutModel", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersMatcherV2VO implements c {
    private final long id;

    @NotNull
    private final List<PassengersMatcherItemVO> items;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "", "", "topCornerRadius", "bottomCornerRadius", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel$Position;", "position", "<init>", "(FFLru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel$Position;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel$Position;", "getPosition", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel$Position;", "Position", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;

        @NotNull
        private final Position position;
        private final float topCornerRadius;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel$Position;", "", "<init>", "(Ljava/lang/String;I)V", "START", "MIDDLE", "END", "SINGLE", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Position {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            public static final Position START = new Position("START", 0);
            public static final Position MIDDLE = new Position("MIDDLE", 1);
            public static final Position END = new Position("END", 2);
            public static final Position SINGLE = new Position("SINGLE", 3);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{START, MIDDLE, END, SINGLE};
            }

            static {
                Position[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
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

        public LayoutModel(float f7, float f11, @NotNull Position position) {
            Intrinsics.checkNotNullParameter(position, "position");
            this.topCornerRadius = f7;
            this.bottomCornerRadius = f11;
            this.position = position;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0 && this.position == layoutModel.position;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        @NotNull
        public final Position getPosition() {
            return this.position;
        }

        public final float getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            return this.position.hashCode() + Pk0.b.a(this.bottomCornerRadius, Float.hashCode(this.topCornerRadius) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "LayoutModel(topCornerRadius=" + this.topCornerRadius + ", bottomCornerRadius=" + this.bottomCornerRadius + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO;", "", "<init>", "()V", "id", "", "getId", "()I", "CategoryVO", "PassengerCellVO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$CategoryVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$PassengerCellVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PassengersMatcherItemVO {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$CategoryVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "categoryTitle", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCategoryTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CategoryVO extends PassengersMatcherItemVO {

            @NotNull
            private final TextAtom categoryTitle;
            private final int id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CategoryVO(int i11, @NotNull TextAtom categoryTitle) {
                super(null);
                Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
                this.id = i11;
                this.categoryTitle = categoryTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CategoryVO)) {
                    return false;
                }
                CategoryVO categoryVO = (CategoryVO) other;
                return this.id == categoryVO.id && Intrinsics.d(this.categoryTitle, categoryVO.categoryTitle);
            }

            @NotNull
            public final TextAtom getCategoryTitle() {
                return this.categoryTitle;
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2VO.PassengersMatcherItemVO
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return this.categoryTitle.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "CategoryVO(id=" + this.id + ", categoryTitle=" + this.categoryTitle + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$PassengerCellVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cell", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "layoutModel", "<init>", "(ILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$LayoutModel;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PassengerCellVO extends PassengersMatcherItemVO {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;
            private final int id;

            @NotNull
            private final LayoutModel layoutModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PassengerCellVO(int i11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell, @NotNull LayoutModel layoutModel) {
                super(null);
                Intrinsics.checkNotNullParameter(cell, "cell");
                Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
                this.id = i11;
                this.cell = cell;
                this.layoutModel = layoutModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PassengerCellVO)) {
                    return false;
                }
                PassengerCellVO passengerCellVO = (PassengerCellVO) other;
                return this.id == passengerCellVO.id && Intrinsics.d(this.cell, passengerCellVO.cell) && Intrinsics.d(this.layoutModel, passengerCellVO.layoutModel);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault getCell() {
                return this.cell;
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2VO.PassengersMatcherItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final LayoutModel getLayoutModel() {
                return this.layoutModel;
            }

            public int hashCode() {
                return this.layoutModel.hashCode() + ((this.cell.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "PassengerCellVO(id=" + this.id + ", cell=" + this.cell + ", layoutModel=" + this.layoutModel + ")";
            }
        }

        public /* synthetic */ PassengersMatcherItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getId();

        private PassengersMatcherItemVO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassengersMatcherV2VO(long j11, @NotNull TextAtom title, TextAtom textAtom, @NotNull List<? extends PassengersMatcherItemVO> items, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.title = title;
        this.subtitle = textAtom;
        this.items = items;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersMatcherV2VO)) {
            return false;
        }
        PassengersMatcherV2VO passengersMatcherV2VO = (PassengersMatcherV2VO) other;
        return this.id == passengersMatcherV2VO.id && Intrinsics.d(this.title, passengersMatcherV2VO.title) && Intrinsics.d(this.subtitle, passengersMatcherV2VO.subtitle) && Intrinsics.d(this.items, passengersMatcherV2VO.items) && Intrinsics.d(this.viewEvent, passengersMatcherV2VO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PassengersMatcherItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

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
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int b12 = g.b((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.items);
        t tVar = this.viewEvent;
        return b12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<PassengersMatcherItemVO> list = this.items;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("PassengersMatcherV2VO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", items=");
        c11.append(list);
        return Lh.a.b(c11, ", viewEvent=", tVar, ")");
    }
}
