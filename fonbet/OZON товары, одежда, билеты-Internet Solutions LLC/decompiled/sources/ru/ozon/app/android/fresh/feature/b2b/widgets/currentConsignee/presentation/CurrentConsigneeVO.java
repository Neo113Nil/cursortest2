package ru.ozon.app.android.fresh.feature.b2b.widgets.currentConsignee.presentation;

import Lc.a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO$Consignee;", "consignee", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO$Consignee;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO$Consignee;", "getConsignee", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO$Consignee;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Consignee", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CurrentConsigneeVO implements c {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final Consignee consignee;
    private final IconButtonV3DTO iconButton;
    private final long id;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/currentConsignee/presentation/CurrentConsigneeVO$Consignee;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "requisites", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRequisites", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Consignee {

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

    public CurrentConsigneeVO(long j11, @NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, @NotNull Consignee consignee, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(consignee, "consignee");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = title;
        this.iconButton = iconButtonV3DTO;
        this.consignee = consignee;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentConsigneeVO)) {
            return false;
        }
        CurrentConsigneeVO currentConsigneeVO = (CurrentConsigneeVO) other;
        return this.id == currentConsigneeVO.id && Intrinsics.d(this.title, currentConsigneeVO.title) && Intrinsics.d(this.iconButton, currentConsigneeVO.iconButton) && Intrinsics.d(this.consignee, currentConsigneeVO.consignee) && Intrinsics.d(this.button, currentConsigneeVO.button);
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

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        return this.button.hashCode() + ((this.consignee.hashCode() + ((a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        Consignee consignee = this.consignee;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder b11 = TY.a.b("CurrentConsigneeVO(id=", j11, ", title=", textDTO);
        b11.append(", iconButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", consignee=");
        b11.append(consignee);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
