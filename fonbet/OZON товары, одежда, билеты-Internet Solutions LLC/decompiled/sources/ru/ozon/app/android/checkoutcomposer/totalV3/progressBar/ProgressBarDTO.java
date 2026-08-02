package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import TY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "", "duration", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "isInfinite", "", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)V", "getDuration", "()J", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressBarDTO {
    public static final int $stable = 0;
    private final long duration;
    private final Boolean isInfinite;
    private final TextDTO title;

    public ProgressBarDTO(long j11, TextDTO textDTO, Boolean bool) {
        this.duration = j11;
        this.title = textDTO;
        this.isInfinite = bool;
    }

    public static /* synthetic */ ProgressBarDTO copy$default(ProgressBarDTO progressBarDTO, long j11, TextDTO textDTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = progressBarDTO.duration;
        }
        if ((i11 & 2) != 0) {
            textDTO = progressBarDTO.title;
        }
        if ((i11 & 4) != 0) {
            bool = progressBarDTO.isInfinite;
        }
        return progressBarDTO.copy(j11, textDTO, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsInfinite() {
        return this.isInfinite;
    }

    @NotNull
    public final ProgressBarDTO copy(long duration, TextDTO title, Boolean isInfinite) {
        return new ProgressBarDTO(duration, title, isInfinite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarDTO)) {
            return false;
        }
        ProgressBarDTO progressBarDTO = (ProgressBarDTO) other;
        return this.duration == progressBarDTO.duration && Intrinsics.d(this.title, progressBarDTO.title) && Intrinsics.d(this.isInfinite, progressBarDTO.isInfinite);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.duration) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Boolean bool = this.isInfinite;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isInfinite() {
        return this.isInfinite;
    }

    @NotNull
    public String toString() {
        long j11 = this.duration;
        TextDTO textDTO = this.title;
        Boolean bool = this.isInfinite;
        StringBuilder b11 = a.b("ProgressBarDTO(duration=", j11, ", title=", textDTO);
        b11.append(", isInfinite=");
        b11.append(bool);
        b11.append(")");
        return b11.toString();
    }
}
