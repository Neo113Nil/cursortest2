package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter;

import N3.C3660k;
import T7.E;
import Tl.b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupButtonVo;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionsAdapter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "", "viewType", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "<init>", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;)V", "getViewType", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter$ViewType;", "Separator", "VerticalSpace", "CellSingleAtom", "CellDefault", "SectionHeader", "Pickup", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellDefault;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellSingleAtom;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$Pickup;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$Separator;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$VerticalSpace;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DeliveryV6SectionItem {

    @NotNull
    private final DeliveryV6SectionsAdapter.ViewType viewType;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellDefault;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cell", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellDefault extends DeliveryV6SectionItem {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;
        private final t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefault(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell, t tVar) {
            super(DeliveryV6SectionsAdapter.ViewType.CellDefault.INSTANCE, null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellDefault)) {
                return false;
            }
            CellDefault cellDefault = (CellDefault) other;
            return Intrinsics.d(this.cell, cellDefault.cell) && Intrinsics.d(this.tokenizedEvent, cellDefault.tokenizedEvent);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault getCell() {
            return this.cell;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "CellDefault(cell=" + this.cell + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellSingleAtom;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellSingleAtom extends DeliveryV6SectionItem {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO cell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellSingleAtom(@NotNull AtomDTO cell) {
            super(DeliveryV6SectionsAdapter.ViewType.CellWithIcon.INSTANCE, null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellSingleAtom) && Intrinsics.d(this.cell, ((CellSingleAtom) other).cell);
        }

        @NotNull
        public final AtomDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellSingleAtom(cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$Pickup;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "pickupButtonVo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "getPickupButtonVo", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pickup extends DeliveryV6SectionItem {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final PickupButtonVo pickupButtonVo;
        private final t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pickup(@NotNull PickupButtonVo pickupButtonVo, @NotNull AtomAction action, t tVar) {
            super(DeliveryV6SectionsAdapter.ViewType.Pickup.INSTANCE, null);
            Intrinsics.checkNotNullParameter(pickupButtonVo, "pickupButtonVo");
            Intrinsics.checkNotNullParameter(action, "action");
            this.pickupButtonVo = pickupButtonVo;
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pickup)) {
                return false;
            }
            Pickup pickup = (Pickup) other;
            return Intrinsics.d(this.pickupButtonVo, pickup.pickupButtonVo) && Intrinsics.d(this.action, pickup.action) && Intrinsics.d(this.tokenizedEvent, pickup.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final PickupButtonVo getPickupButtonVo() {
            return this.pickupButtonVo;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.pickupButtonVo.hashCode() * 31, 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            PickupButtonVo pickupButtonVo = this.pickupButtonVo;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("Pickup(pickupButtonVo=");
            sb2.append(pickupButtonVo);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "", "icon", "iconTint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIconTint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionHeader extends DeliveryV6SectionItem {
        private final String icon;
        private final String iconTint;
        private final TextDTO text;

        public SectionHeader(String str, String str2, TextDTO textDTO) {
            super(DeliveryV6SectionsAdapter.ViewType.SectionHeader.INSTANCE, null);
            this.icon = str;
            this.iconTint = str2;
            this.text = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) other;
            return Intrinsics.d(this.icon, sectionHeader.icon) && Intrinsics.d(this.iconTint, sectionHeader.iconTint) && Intrinsics.d(this.text, sectionHeader.text);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTint() {
            return this.iconTint;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconTint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextDTO textDTO = this.text;
            return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconTint;
            return b.e(C3660k.d("SectionHeader(icon=", str, ", iconTint=", str2, ", text="), this.text, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$Separator;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator extends DeliveryV6SectionItem {

        @NotNull
        public static final Separator INSTANCE = new Separator();

        private Separator() {
            super(DeliveryV6SectionsAdapter.ViewType.Separator.INSTANCE, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Separator);
        }

        public int hashCode() {
            return 2027982988;
        }

        @NotNull
        public String toString() {
            return "Separator";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$VerticalSpace;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "", "heightPx", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeightPx", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpace extends DeliveryV6SectionItem {
        private final int heightPx;

        public VerticalSpace(int i11) {
            super(DeliveryV6SectionsAdapter.ViewType.VerticalSpace.INSTANCE, null);
            this.heightPx = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpace) && this.heightPx == ((VerticalSpace) other).heightPx;
        }

        public final int getHeightPx() {
            return this.heightPx;
        }

        public int hashCode() {
            return Integer.hashCode(this.heightPx);
        }

        @NotNull
        public String toString() {
            return E.a(this.heightPx, "VerticalSpace(heightPx=", ")");
        }
    }

    public /* synthetic */ DeliveryV6SectionItem(DeliveryV6SectionsAdapter.ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType);
    }

    @NotNull
    public final DeliveryV6SectionsAdapter.ViewType getViewType() {
        return this.viewType;
    }

    private DeliveryV6SectionItem(DeliveryV6SectionsAdapter.ViewType viewType) {
        this.viewType = viewType;
    }
}
