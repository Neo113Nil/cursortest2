package ru.ozon.android.messenger.blocks.alert;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/android/messenger/blocks/alert/AlertDTO;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "ttl", "", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/lang/Integer;)V", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTtl", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/alert/AlertDTO;", "equals", "", "other", "hashCode", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AlertDTO {
    public static final int $stable = DisclaimerDTO.$stable;

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final Integer ttl;

    public AlertDTO(@NotNull DisclaimerDTO disclaimer, Integer num) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.disclaimer = disclaimer;
        this.ttl = num;
    }

    public static /* synthetic */ AlertDTO copy$default(AlertDTO alertDTO, DisclaimerDTO disclaimerDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerDTO = alertDTO.disclaimer;
        }
        if ((i11 & 2) != 0) {
            num = alertDTO.ttl;
        }
        return alertDTO.copy(disclaimerDTO, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTtl() {
        return this.ttl;
    }

    @NotNull
    public final AlertDTO copy(@NotNull DisclaimerDTO disclaimer, Integer ttl) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new AlertDTO(disclaimer, ttl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertDTO)) {
            return false;
        }
        AlertDTO alertDTO = (AlertDTO) other;
        return Intrinsics.d(this.disclaimer, alertDTO.disclaimer) && Intrinsics.d(this.ttl, alertDTO.ttl);
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final Integer getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        int hashCode = this.disclaimer.hashCode() * 31;
        Integer num = this.ttl;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlertDTO(disclaimer=" + this.disclaimer + ", ttl=" + this.ttl + ")";
    }
}
