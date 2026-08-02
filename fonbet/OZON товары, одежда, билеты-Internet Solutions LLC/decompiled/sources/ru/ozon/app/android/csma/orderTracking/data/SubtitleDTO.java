package ru.ozon.app.android.csma.orderTracking.data;

import Ep.a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", "", "text", "", "color", "breakPosition", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getColor", "getBreakPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", "equals", "", "other", "hashCode", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SubtitleDTO {
    private final Integer breakPosition;
    private final String color;

    @NotNull
    private final String text;

    public SubtitleDTO(@NotNull String text, String str, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.color = str;
        this.breakPosition = num;
    }

    public static /* synthetic */ SubtitleDTO copy$default(SubtitleDTO subtitleDTO, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = subtitleDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = subtitleDTO.color;
        }
        if ((i11 & 4) != 0) {
            num = subtitleDTO.breakPosition;
        }
        return subtitleDTO.copy(str, str2, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getBreakPosition() {
        return this.breakPosition;
    }

    @NotNull
    public final SubtitleDTO copy(@NotNull String text, String color, Integer breakPosition) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new SubtitleDTO(text, color, breakPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleDTO)) {
            return false;
        }
        SubtitleDTO subtitleDTO = (SubtitleDTO) other;
        return Intrinsics.d(this.text, subtitleDTO.text) && Intrinsics.d(this.color, subtitleDTO.color) && Intrinsics.d(this.breakPosition, subtitleDTO.breakPosition);
    }

    public final Integer getBreakPosition() {
        return this.breakPosition;
    }

    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.breakPosition;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.color;
        return a.c(C3660k.d("SubtitleDTO(text=", str, ", color=", str2, ", breakPosition="), this.breakPosition, ")");
    }
}
