package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import B0.C2454a;
import Cm.e;
import Ek.a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "", "", "backgroundColor", "", "icon", "iconColor", "textColor", "Lorg/joda/time/DateTime;", "endTime", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(ILjava/lang/String;IILorg/joda/time/DateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "Ljava/lang/String;", "getIcon", "getIconColor", "getTextColor", "Lorg/joda/time/DateTime;", "getEndTime", "()Lorg/joda/time/DateTime;", "getTitle", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TimerVO {
    private final int backgroundColor;
    private final DateTime endTime;

    @NotNull
    private final String icon;
    private final int iconColor;
    private final int textColor;

    @NotNull
    private final String title;

    public TimerVO(int i11, @NotNull String icon, int i12, int i13, DateTime dateTime, @NotNull String title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.backgroundColor = i11;
        this.icon = icon;
        this.iconColor = i12;
        this.textColor = i13;
        this.endTime = dateTime;
        this.title = title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVO)) {
            return false;
        }
        TimerVO timerVO = (TimerVO) other;
        return this.backgroundColor == timerVO.backgroundColor && Intrinsics.d(this.icon, timerVO.icon) && this.iconColor == timerVO.iconColor && this.textColor == timerVO.textColor && Intrinsics.d(this.endTime, timerVO.endTime) && Intrinsics.d(this.title, timerVO.title);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final DateTime getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.textColor, C2454a.a(this.iconColor, g.a(Integer.hashCode(this.backgroundColor) * 31, 31, this.icon), 31), 31);
        DateTime dateTime = this.endTime;
        return this.title.hashCode() + ((a11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.backgroundColor;
        String str = this.icon;
        int i12 = this.iconColor;
        int i13 = this.textColor;
        DateTime dateTime = this.endTime;
        String str2 = this.title;
        StringBuilder g10 = e.g(i11, "TimerVO(backgroundColor=", ", icon=", str, ", iconColor=");
        a.f(i12, i13, ", textColor=", ", endTime=", g10);
        g10.append(dateTime);
        g10.append(", title=");
        g10.append(str2);
        g10.append(")");
        return g10.toString();
    }
}
