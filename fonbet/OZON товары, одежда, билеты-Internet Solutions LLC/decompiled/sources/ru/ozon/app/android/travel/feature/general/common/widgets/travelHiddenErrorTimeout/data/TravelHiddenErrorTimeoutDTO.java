package ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/data/TravelHiddenErrorTimeoutDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "timeLimit", "Lorg/joda/time/DateTime;", "timerDurationMs", "", "dialogButtonText", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getTimeLimit", "()Lorg/joda/time/DateTime;", "getTimerDurationMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDialogButtonText", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/data/TravelHiddenErrorTimeoutDTO;", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelHiddenErrorTimeoutDTO {
    public static final int $stable = 8;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String description;

    @NotNull
    private final String dialogButtonText;
    private final DateTime timeLimit;
    private final Integer timerDurationMs;

    @NotNull
    private final String title;

    public TravelHiddenErrorTimeoutDTO(@NotNull String title, @NotNull String description, DateTime dateTime, Integer num, @NotNull String dialogButtonText, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dialogButtonText, "dialogButtonText");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.title = title;
        this.description = description;
        this.timeLimit = dateTime;
        this.timerDurationMs = num;
        this.dialogButtonText = dialogButtonText;
        this.deeplink = deeplink;
    }

    public static /* synthetic */ TravelHiddenErrorTimeoutDTO copy$default(TravelHiddenErrorTimeoutDTO travelHiddenErrorTimeoutDTO, String str, String str2, DateTime dateTime, Integer num, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelHiddenErrorTimeoutDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = travelHiddenErrorTimeoutDTO.description;
        }
        if ((i11 & 4) != 0) {
            dateTime = travelHiddenErrorTimeoutDTO.timeLimit;
        }
        if ((i11 & 8) != 0) {
            num = travelHiddenErrorTimeoutDTO.timerDurationMs;
        }
        if ((i11 & 16) != 0) {
            str3 = travelHiddenErrorTimeoutDTO.dialogButtonText;
        }
        if ((i11 & 32) != 0) {
            str4 = travelHiddenErrorTimeoutDTO.deeplink;
        }
        String str5 = str3;
        String str6 = str4;
        return travelHiddenErrorTimeoutDTO.copy(str, str2, dateTime, num, str5, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final DateTime getTimeLimit() {
        return this.timeLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTimerDurationMs() {
        return this.timerDurationMs;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDialogButtonText() {
        return this.dialogButtonText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final TravelHiddenErrorTimeoutDTO copy(@NotNull String title, @NotNull String description, DateTime timeLimit, Integer timerDurationMs, @NotNull String dialogButtonText, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dialogButtonText, "dialogButtonText");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new TravelHiddenErrorTimeoutDTO(title, description, timeLimit, timerDurationMs, dialogButtonText, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelHiddenErrorTimeoutDTO)) {
            return false;
        }
        TravelHiddenErrorTimeoutDTO travelHiddenErrorTimeoutDTO = (TravelHiddenErrorTimeoutDTO) other;
        return Intrinsics.d(this.title, travelHiddenErrorTimeoutDTO.title) && Intrinsics.d(this.description, travelHiddenErrorTimeoutDTO.description) && Intrinsics.d(this.timeLimit, travelHiddenErrorTimeoutDTO.timeLimit) && Intrinsics.d(this.timerDurationMs, travelHiddenErrorTimeoutDTO.timerDurationMs) && Intrinsics.d(this.dialogButtonText, travelHiddenErrorTimeoutDTO.dialogButtonText) && Intrinsics.d(this.deeplink, travelHiddenErrorTimeoutDTO.deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDialogButtonText() {
        return this.dialogButtonText;
    }

    public final DateTime getTimeLimit() {
        return this.timeLimit;
    }

    public final Integer getTimerDurationMs() {
        return this.timerDurationMs;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.description);
        DateTime dateTime = this.timeLimit;
        int hashCode = (a11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.timerDurationMs;
        return this.deeplink.hashCode() + g.a((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.dialogButtonText);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        DateTime dateTime = this.timeLimit;
        Integer num = this.timerDurationMs;
        String str3 = this.dialogButtonText;
        String str4 = this.deeplink;
        StringBuilder d11 = C3660k.d("TravelHiddenErrorTimeoutDTO(title=", str, ", description=", str2, ", timeLimit=");
        d11.append(dateTime);
        d11.append(", timerDurationMs=");
        d11.append(num);
        d11.append(", dialogButtonText=");
        return C3173b.c(d11, str3, ", deeplink=", str4, ")");
    }
}
