package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteServiceButton", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteServiceButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupV4StickyVO implements c {

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final IconButtonV3DTO deleteServiceButton;
    private final long id;

    public InfoPopupV4StickyVO(long j11, @NotNull List<ButtonV3DTO> buttons, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.buttons = buttons;
        this.deleteServiceButton = iconButtonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupV4StickyVO)) {
            return false;
        }
        InfoPopupV4StickyVO infoPopupV4StickyVO = (InfoPopupV4StickyVO) other;
        return this.id == infoPopupV4StickyVO.id && Intrinsics.d(this.buttons, infoPopupV4StickyVO.buttons) && Intrinsics.d(this.deleteServiceButton, infoPopupV4StickyVO.deleteServiceButton);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final IconButtonV3DTO getDeleteServiceButton() {
        return this.deleteServiceButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.buttons);
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        return b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ButtonV3DTO> list = this.buttons;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        StringBuilder b11 = b.b(j11, "InfoPopupV4StickyVO(id=", ", buttons=", list);
        b11.append(", deleteServiceButton=");
        b11.append(iconButtonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
