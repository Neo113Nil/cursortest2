package ru.ozon.android.messenger.blocks.ratemessenger;

import B90.C2618u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/ratemessenger/RateDTO;", "", "rate", "", "text", "", "reasons", "", "Lru/ozon/android/messenger/blocks/ratemessenger/ReasonDTO;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getRate", "()I", "getText", "()Ljava/lang/String;", "getReasons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateDTO {
    public static final int $stable = 0;
    private final int rate;
    private final List<ReasonDTO> reasons;

    @NotNull
    private final String text;

    public RateDTO(int i11, @NotNull String text, List<ReasonDTO> list) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.rate = i11;
        this.text = text;
        this.reasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RateDTO copy$default(RateDTO rateDTO, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rateDTO.rate;
        }
        if ((i12 & 2) != 0) {
            str = rateDTO.text;
        }
        if ((i12 & 4) != 0) {
            list = rateDTO.reasons;
        }
        return rateDTO.copy(i11, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<ReasonDTO> component3() {
        return this.reasons;
    }

    @NotNull
    public final RateDTO copy(int rate, @NotNull String text, List<ReasonDTO> reasons) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new RateDTO(rate, text, reasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateDTO)) {
            return false;
        }
        RateDTO rateDTO = (RateDTO) other;
        return this.rate == rateDTO.rate && Intrinsics.d(this.text, rateDTO.text) && Intrinsics.d(this.reasons, rateDTO.reasons);
    }

    public final int getRate() {
        return this.rate;
    }

    public final List<ReasonDTO> getReasons() {
        return this.reasons;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = G.g.a(Integer.hashCode(this.rate) * 31, 31, this.text);
        List<ReasonDTO> list = this.reasons;
        return a11 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.rate;
        String str = this.text;
        return C2618u.h(Cm.e.g(i11, "RateDTO(rate=", ", text=", str, ", reasons="), this.reasons, ")");
    }
}
