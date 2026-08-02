package ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.presentation;

import Gl.C3124a;
import Ns.b;
import TY.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/presentation/ConsigneeItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "requisites", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "needBottomSeparator", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRequisites", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "getNeedBottomSeparator", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConsigneeItemVO implements c {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final BadgeDTO badge;
    private final IconButtonV3DTO iconButton;
    private final long id;

    @NotNull
    private final TextDTO name;
    private final boolean needBottomSeparator;

    @NotNull
    private final TextDTO requisites;

    public ConsigneeItemVO(long j11, @NotNull TextDTO name, IconButtonV3DTO iconButtonV3DTO, @NotNull TextDTO requisites, @NotNull BadgeDTO badge, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(requisites, "requisites");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.id = j11;
        this.name = name;
        this.iconButton = iconButtonV3DTO;
        this.requisites = requisites;
        this.badge = badge;
        this.needBottomSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsigneeItemVO)) {
            return false;
        }
        ConsigneeItemVO consigneeItemVO = (ConsigneeItemVO) other;
        return this.id == consigneeItemVO.id && Intrinsics.d(this.name, consigneeItemVO.name) && Intrinsics.d(this.iconButton, consigneeItemVO.iconButton) && Intrinsics.d(this.requisites, consigneeItemVO.requisites) && Intrinsics.d(this.badge, consigneeItemVO.badge) && this.needBottomSeparator == consigneeItemVO.needBottomSeparator;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final boolean getNeedBottomSeparator() {
        return this.needBottomSeparator;
    }

    @NotNull
    public final TextDTO getRequisites() {
        return this.requisites;
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
        int a11 = b.a(this.name, Long.hashCode(this.id) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        return Boolean.hashCode(this.needBottomSeparator) + C3124a.c(this.badge, b.a(this.requisites, (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.name;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        TextDTO textDTO2 = this.requisites;
        BadgeDTO badgeDTO = this.badge;
        boolean z11 = this.needBottomSeparator;
        StringBuilder b11 = a.b("ConsigneeItemVO(id=", j11, ", name=", textDTO);
        b11.append(", iconButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", requisites=");
        b11.append(textDTO2);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", needBottomSeparator=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }
}
