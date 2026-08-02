package ru.ozon.app.android.pdp.common.ugc.timer;

import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "serverTimestamp", "Lorg/joda/time/DateTime;", "endTimestamp", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getEndTimestamp", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TimerDTO {
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final DateTime endTimestamp;

    @NotNull
    private final DateTime serverTimestamp;

    @NotNull
    private final TextDTO title;

    public TimerDTO(@NotNull TextDTO title, @NotNull DateTime serverTimestamp, @NotNull DateTime endTimestamp, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        this.title = title;
        this.serverTimestamp = serverTimestamp;
        this.endTimestamp = endTimestamp;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, TextDTO textDTO, DateTime dateTime, DateTime dateTime2, String str, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = timerDTO.title;
        }
        if ((i11 & 2) != 0) {
            dateTime = timerDTO.serverTimestamp;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = timerDTO.endTimestamp;
        }
        if ((i11 & 8) != 0) {
            str = timerDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = timerDTO.cornerRadius;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        DateTime dateTime3 = dateTime2;
        return timerDTO.copy(textDTO, dateTime, dateTime3, str, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final TimerDTO copy(@NotNull TextDTO title, @NotNull DateTime serverTimestamp, @NotNull DateTime endTimestamp, String backgroundColor, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        return new TimerDTO(title, serverTimestamp, endTimestamp, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDTO)) {
            return false;
        }
        TimerDTO timerDTO = (TimerDTO) other;
        return Intrinsics.d(this.title, timerDTO.title) && Intrinsics.d(this.serverTimestamp, timerDTO.serverTimestamp) && Intrinsics.d(this.endTimestamp, timerDTO.endTimestamp) && Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor) && this.cornerRadius == timerDTO.cornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final DateTime getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.endTimestamp, b.a(this.serverTimestamp, this.title.hashCode() * 31, 31), 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimerDTO(title=" + this.title + ", serverTimestamp=" + this.serverTimestamp + ", endTimestamp=" + this.endTimestamp + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
