package ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelHiddenErrorTimeout/presentation/TravelHiddenErrorTimeoutVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "dialogTitle", "dialogMessage", "dialogButton", "deeplink", "Lorg/joda/time/DateTime;", "timeLimit", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getDialogTitle", "getDialogMessage", "getDialogButton", "getDeeplink", "Lorg/joda/time/DateTime;", "getTimeLimit", "()Lorg/joda/time/DateTime;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelHiddenErrorTimeoutVO implements c {

    @NotNull
    private final String deeplink;

    @NotNull
    private final String dialogButton;

    @NotNull
    private final String dialogMessage;

    @NotNull
    private final String dialogTitle;
    private final long id;
    private final DateTime timeLimit;

    public TravelHiddenErrorTimeoutVO(long j11, @NotNull String dialogTitle, @NotNull String dialogMessage, @NotNull String dialogButton, @NotNull String deeplink, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogMessage, "dialogMessage");
        Intrinsics.checkNotNullParameter(dialogButton, "dialogButton");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.id = j11;
        this.dialogTitle = dialogTitle;
        this.dialogMessage = dialogMessage;
        this.dialogButton = dialogButton;
        this.deeplink = deeplink;
        this.timeLimit = dateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelHiddenErrorTimeoutVO)) {
            return false;
        }
        TravelHiddenErrorTimeoutVO travelHiddenErrorTimeoutVO = (TravelHiddenErrorTimeoutVO) other;
        return this.id == travelHiddenErrorTimeoutVO.id && Intrinsics.d(this.dialogTitle, travelHiddenErrorTimeoutVO.dialogTitle) && Intrinsics.d(this.dialogMessage, travelHiddenErrorTimeoutVO.dialogMessage) && Intrinsics.d(this.dialogButton, travelHiddenErrorTimeoutVO.dialogButton) && Intrinsics.d(this.deeplink, travelHiddenErrorTimeoutVO.deeplink) && Intrinsics.d(this.timeLimit, travelHiddenErrorTimeoutVO.timeLimit);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getDialogButton() {
        return this.dialogButton;
    }

    @NotNull
    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    @NotNull
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final DateTime getTimeLimit() {
        return this.timeLimit;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.dialogTitle), 31, this.dialogMessage), 31, this.dialogButton), 31, this.deeplink);
        DateTime dateTime = this.timeLimit;
        return a11 + (dateTime == null ? 0 : dateTime.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.dialogTitle;
        String str2 = this.dialogMessage;
        String str3 = this.dialogButton;
        String str4 = this.deeplink;
        DateTime dateTime = this.timeLimit;
        StringBuilder c11 = C2436a.c(j11, "TravelHiddenErrorTimeoutVO(id=", ", dialogTitle=", str);
        a.h(c11, ", dialogMessage=", str2, ", dialogButton=", str3);
        c11.append(", deeplink=");
        c11.append(str4);
        c11.append(", timeLimit=");
        c11.append(dateTime);
        c11.append(")");
        return c11.toString();
    }
}
