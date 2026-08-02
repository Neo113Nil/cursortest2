package ru.ozon.app.android.account.orders.barcodePopover.v1.data;

import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/data/BarcodePopoverDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "code", "", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCode", "()Ljava/lang/String;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodePopoverDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final String code;

    @NotNull
    private final TextDTO title;

    public BarcodePopoverDTO(@NotNull TextDTO title, @NotNull String code, @NotNull IconButtonV3DTO closeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.title = title;
        this.code = code;
        this.closeButton = closeButton;
    }

    public static /* synthetic */ BarcodePopoverDTO copy$default(BarcodePopoverDTO barcodePopoverDTO, TextDTO textDTO, String str, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = barcodePopoverDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = barcodePopoverDTO.code;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = barcodePopoverDTO.closeButton;
        }
        return barcodePopoverDTO.copy(textDTO, str, iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final BarcodePopoverDTO copy(@NotNull TextDTO title, @NotNull String code, @NotNull IconButtonV3DTO closeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new BarcodePopoverDTO(title, code, closeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePopoverDTO)) {
            return false;
        }
        BarcodePopoverDTO barcodePopoverDTO = (BarcodePopoverDTO) other;
        return Intrinsics.d(this.title, barcodePopoverDTO.title) && Intrinsics.d(this.code, barcodePopoverDTO.code) && Intrinsics.d(this.closeButton, barcodePopoverDTO.closeButton);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.closeButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.code);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        String str = this.code;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        StringBuilder f7 = D3.g.f("BarcodePopoverDTO(title=", textDTO, ", code=", str, ", closeButton=");
        f7.append(iconButtonV3DTO);
        f7.append(")");
        return f7.toString();
    }
}
