package ru.ozon.app.android.marketing.widgets.couponList.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/data/ConditionsDTO;", "", "color", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConditionsDTO {
    public static final int $stable = 0;

    @NotNull
    private final String color;

    @NotNull
    private final String text;

    public ConditionsDTO(@NotNull String color, @NotNull String text) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(text, "text");
        this.color = color;
        this.text = text;
    }

    public static /* synthetic */ ConditionsDTO copy$default(ConditionsDTO conditionsDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = conditionsDTO.color;
        }
        if ((i11 & 2) != 0) {
            str2 = conditionsDTO.text;
        }
        return conditionsDTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final ConditionsDTO copy(@NotNull String color, @NotNull String text) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ConditionsDTO(color, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConditionsDTO)) {
            return false;
        }
        ConditionsDTO conditionsDTO = (ConditionsDTO) other;
        return Intrinsics.d(this.color, conditionsDTO.color) && Intrinsics.d(this.text, conditionsDTO.text);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.color.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ConditionsDTO(color=", this.color, ", text=", this.text, ")");
    }
}
