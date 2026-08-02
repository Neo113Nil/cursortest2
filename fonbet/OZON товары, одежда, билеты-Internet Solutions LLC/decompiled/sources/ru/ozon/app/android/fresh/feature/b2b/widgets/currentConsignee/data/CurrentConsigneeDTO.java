package ru.ozon.app.android.fresh.feature.b2b.widgets.currentConsignee.data;

import Lc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/data/CurrentConsigneeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "consignee", "Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/data/CurrentConsigneeDTO$Consignee;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/data/CurrentConsigneeDTO$Consignee;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getConsignee", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/data/CurrentConsigneeDTO$Consignee;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Consignee", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CurrentConsigneeDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final Consignee consignee;
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/data/CurrentConsigneeDTO$Consignee;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "requisites", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRequisites", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Consignee {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final TextDTO requisites;

        public Consignee(@NotNull TextDTO name, @NotNull TextDTO requisites) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(requisites, "requisites");
            this.name = name;
            this.requisites = requisites;
        }

        public static /* synthetic */ Consignee copy$default(Consignee consignee, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = consignee.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = consignee.requisites;
            }
            return consignee.copy(textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getRequisites() {
            return this.requisites;
        }

        @NotNull
        public final Consignee copy(@NotNull TextDTO name, @NotNull TextDTO requisites) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(requisites, "requisites");
            return new Consignee(name, requisites);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Consignee)) {
                return false;
            }
            Consignee consignee = (Consignee) other;
            return Intrinsics.d(this.name, consignee.name) && Intrinsics.d(this.requisites, consignee.requisites);
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
            return this.requisites.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.b("Consignee(name=", this.name, ", requisites=", this.requisites, ")");
        }
    }

    public CurrentConsigneeDTO(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, @NotNull Consignee consignee, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(consignee, "consignee");
        Intrinsics.checkNotNullParameter(button, "button");
        this.title = title;
        this.iconButton = iconButtonV3DTO;
        this.consignee = consignee;
        this.button = button;
    }

    public static /* synthetic */ CurrentConsigneeDTO copy$default(CurrentConsigneeDTO currentConsigneeDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, Consignee consignee, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = currentConsigneeDTO.title;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = currentConsigneeDTO.iconButton;
        }
        if ((i11 & 4) != 0) {
            consignee = currentConsigneeDTO.consignee;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = currentConsigneeDTO.button;
        }
        return currentConsigneeDTO.copy(textDTO, iconButtonV3DTO, consignee, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Consignee getConsignee() {
        return this.consignee;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CurrentConsigneeDTO copy(@NotNull TextDTO title, IconButtonV3DTO iconButton, @NotNull Consignee consignee, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(consignee, "consignee");
        Intrinsics.checkNotNullParameter(button, "button");
        return new CurrentConsigneeDTO(title, iconButton, consignee, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentConsigneeDTO)) {
            return false;
        }
        CurrentConsigneeDTO currentConsigneeDTO = (CurrentConsigneeDTO) other;
        return Intrinsics.d(this.title, currentConsigneeDTO.title) && Intrinsics.d(this.iconButton, currentConsigneeDTO.iconButton) && Intrinsics.d(this.consignee, currentConsigneeDTO.consignee) && Intrinsics.d(this.button, currentConsigneeDTO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final Consignee getConsignee() {
        return this.consignee;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        return this.button.hashCode() + ((this.consignee.hashCode() + ((hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CurrentConsigneeDTO(title=" + this.title + ", iconButton=" + this.iconButton + ", consignee=" + this.consignee + ", button=" + this.button + ")";
    }
}
