package ru.ozon.app.android.orderdetails.orderstatus;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/orderstatus/OrderStatusDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBackgroundColor", "getTextColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderStatusDTO {
    public static final int $stable = 0;

    @NotNull
    private final String backgroundColor;
    private final String textColor;

    @NotNull
    private final String title;

    public OrderStatusDTO(@NotNull String title, @NotNull String backgroundColor, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.backgroundColor = backgroundColor;
        this.textColor = str;
    }

    public static /* synthetic */ OrderStatusDTO copy$default(OrderStatusDTO orderStatusDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStatusDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = orderStatusDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str3 = orderStatusDTO.textColor;
        }
        return orderStatusDTO.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final OrderStatusDTO copy(@NotNull String title, @NotNull String backgroundColor, String textColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new OrderStatusDTO(title, backgroundColor, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusDTO)) {
            return false;
        }
        OrderStatusDTO orderStatusDTO = (OrderStatusDTO) other;
        return Intrinsics.d(this.title, orderStatusDTO.title) && Intrinsics.d(this.backgroundColor, orderStatusDTO.backgroundColor) && Intrinsics.d(this.textColor, orderStatusDTO.textColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.backgroundColor);
        String str = this.textColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.backgroundColor;
        return o0.c(C3660k.d("OrderStatusDTO(title=", str, ", backgroundColor=", str2, ", textColor="), this.textColor, ")");
    }
}
