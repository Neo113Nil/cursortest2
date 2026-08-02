package ru.ozon.app.android.timerMolecule.presentation;

import GR.b;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lorg/joda/time/DateTime;", "serverTimestamp", "endTimestamp", "", "timeDelta", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lorg/joda/time/DateTime;", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getEndTimestamp", "J", "getTimeDelta", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerVO {
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final DateTime endTimestamp;

    @NotNull
    private final DateTime serverTimestamp;
    private final long timeDelta;

    @NotNull
    private final TextDTO title;

    public TimerVO(@NotNull TextDTO title, @NotNull DateTime serverTimestamp, @NotNull DateTime endTimestamp, long j11, String str, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        this.title = title;
        this.serverTimestamp = serverTimestamp;
        this.endTimestamp = endTimestamp;
        this.timeDelta = j11;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ TimerVO copy$default(TimerVO timerVO, TextDTO textDTO, DateTime dateTime, DateTime dateTime2, long j11, String str, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = timerVO.title;
        }
        if ((i11 & 2) != 0) {
            dateTime = timerVO.serverTimestamp;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = timerVO.endTimestamp;
        }
        if ((i11 & 8) != 0) {
            j11 = timerVO.timeDelta;
        }
        if ((i11 & 16) != 0) {
            str = timerVO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            cornerRadius = timerVO.cornerRadius;
        }
        long j12 = j11;
        DateTime dateTime3 = dateTime2;
        return timerVO.copy(textDTO, dateTime, dateTime3, j12, str, cornerRadius);
    }

    @NotNull
    public final TimerVO copy(@NotNull TextDTO title, @NotNull DateTime serverTimestamp, @NotNull DateTime endTimestamp, long timeDelta, String backgroundColor, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        return new TimerVO(title, serverTimestamp, endTimestamp, timeDelta, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVO)) {
            return false;
        }
        TimerVO timerVO = (TimerVO) other;
        return Intrinsics.d(this.title, timerVO.title) && Intrinsics.d(this.serverTimestamp, timerVO.serverTimestamp) && Intrinsics.d(this.endTimestamp, timerVO.endTimestamp) && this.timeDelta == timerVO.timeDelta && Intrinsics.d(this.backgroundColor, timerVO.backgroundColor) && this.cornerRadius == timerVO.cornerRadius;
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

    public final long getTimeDelta() {
        return this.timeDelta;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = c.a(b.a(this.endTimestamp, b.a(this.serverTimestamp, this.title.hashCode() * 31, 31), 31), 31, this.timeDelta);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimerVO(title=" + this.title + ", serverTimestamp=" + this.serverTimestamp + ", endTimestamp=" + this.endTimestamp + ", timeDelta=" + this.timeDelta + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
