package ru.ozon.app.android.orderdetails.orderTotal.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/LineDTO;", "", "price", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LineDTO {
    public static final int $stable = 0;
    private final String price;

    @NotNull
    private final String title;

    public LineDTO(String str, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.price = str;
        this.title = title;
    }

    public static /* synthetic */ LineDTO copy$default(LineDTO lineDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lineDTO.price;
        }
        if ((i11 & 2) != 0) {
            str2 = lineDTO.title;
        }
        return lineDTO.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final LineDTO copy(String price, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new LineDTO(price, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineDTO)) {
            return false;
        }
        LineDTO lineDTO = (LineDTO) other;
        return Intrinsics.d(this.price, lineDTO.price) && Intrinsics.d(this.title, lineDTO.title);
    }

    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.price;
        return this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return e.a("LineDTO(price=", this.price, ", title=", this.title, ")");
    }
}
