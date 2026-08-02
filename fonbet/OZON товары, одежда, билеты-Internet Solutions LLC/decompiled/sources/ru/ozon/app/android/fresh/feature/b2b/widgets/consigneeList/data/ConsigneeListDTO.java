package ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.data;

import H3.c;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListDTO;", "", "consignees", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListDTO$Consignee;", "<init>", "(Ljava/util/List;)V", "getConsignees", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Consignee", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConsigneeListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Consignee> consignees;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListDTO$Consignee;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "requisites", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRequisites", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Consignee {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final BadgeDTO badge;
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final TextDTO requisites;

        public Consignee(@NotNull TextDTO name, IconButtonV3DTO iconButtonV3DTO, @NotNull TextDTO requisites, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(requisites, "requisites");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.name = name;
            this.iconButton = iconButtonV3DTO;
            this.requisites = requisites;
            this.badge = badge;
        }

        public static /* synthetic */ Consignee copy$default(Consignee consignee, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO2, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = consignee.name;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = consignee.iconButton;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = consignee.requisites;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = consignee.badge;
            }
            return consignee.copy(textDTO, iconButtonV3DTO, textDTO2, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getRequisites() {
            return this.requisites;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final Consignee copy(@NotNull TextDTO name, IconButtonV3DTO iconButton, @NotNull TextDTO requisites, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(requisites, "requisites");
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new Consignee(name, iconButton, requisites, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Consignee)) {
                return false;
            }
            Consignee consignee = (Consignee) other;
            return Intrinsics.d(this.name, consignee.name) && Intrinsics.d(this.iconButton, consignee.iconButton) && Intrinsics.d(this.requisites, consignee.requisites) && Intrinsics.d(this.badge, consignee.badge);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final TextDTO getRequisites() {
            return this.requisites;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            return this.badge.hashCode() + b.a(this.requisites, (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "Consignee(name=" + this.name + ", iconButton=" + this.iconButton + ", requisites=" + this.requisites + ", badge=" + this.badge + ")";
        }
    }

    public ConsigneeListDTO(@NotNull List<Consignee> consignees) {
        Intrinsics.checkNotNullParameter(consignees, "consignees");
        this.consignees = consignees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsigneeListDTO copy$default(ConsigneeListDTO consigneeListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = consigneeListDTO.consignees;
        }
        return consigneeListDTO.copy(list);
    }

    @NotNull
    public final List<Consignee> component1() {
        return this.consignees;
    }

    @NotNull
    public final ConsigneeListDTO copy(@NotNull List<Consignee> consignees) {
        Intrinsics.checkNotNullParameter(consignees, "consignees");
        return new ConsigneeListDTO(consignees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsigneeListDTO) && Intrinsics.d(this.consignees, ((ConsigneeListDTO) other).consignees);
    }

    @NotNull
    public final List<Consignee> getConsignees() {
        return this.consignees;
    }

    public int hashCode() {
        return this.consignees.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ConsigneeListDTO(consignees=", ")", this.consignees);
    }
}
