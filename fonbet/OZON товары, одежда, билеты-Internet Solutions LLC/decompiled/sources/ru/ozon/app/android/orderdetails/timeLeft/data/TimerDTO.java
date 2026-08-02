package ru.ozon.app.android.orderdetails.timeLeft.data;

import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;", "", "backgroundColor", "", "icon", "iconColor", "textColor", "timeLeft", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "getIconColor", "getTextColor", "getTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;", "equals", "", "other", "hashCode", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TimerDTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String icon;
    private final String iconColor;
    private final String textColor;
    private final Integer timeLeft;

    @NotNull
    private final String title;

    public TimerDTO(String str, String str2, String str3, String str4, Integer num, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.backgroundColor = str;
        this.icon = str2;
        this.iconColor = str3;
        this.textColor = str4;
        this.timeLeft = num;
        this.title = title;
    }

    public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, String str4, Integer num, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timerDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = timerDTO.icon;
        }
        if ((i11 & 4) != 0) {
            str3 = timerDTO.iconColor;
        }
        if ((i11 & 8) != 0) {
            str4 = timerDTO.textColor;
        }
        if ((i11 & 16) != 0) {
            num = timerDTO.timeLeft;
        }
        if ((i11 & 32) != 0) {
            str5 = timerDTO.title;
        }
        Integer num2 = num;
        String str6 = str5;
        return timerDTO.copy(str, str2, str3, str4, num2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TimerDTO copy(String backgroundColor, String icon, String iconColor, String textColor, Integer timeLeft, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TimerDTO(backgroundColor, icon, iconColor, textColor, timeLeft, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDTO)) {
            return false;
        }
        TimerDTO timerDTO = (TimerDTO) other;
        return Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor) && Intrinsics.d(this.icon, timerDTO.icon) && Intrinsics.d(this.iconColor, timerDTO.iconColor) && Intrinsics.d(this.textColor, timerDTO.textColor) && Intrinsics.d(this.timeLeft, timerDTO.timeLeft) && Intrinsics.d(this.title, timerDTO.title);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.timeLeft;
        return this.title.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.icon;
        String str3 = this.iconColor;
        String str4 = this.textColor;
        Integer num = this.timeLeft;
        String str5 = this.title;
        StringBuilder d11 = C3660k.d("TimerDTO(backgroundColor=", str, ", icon=", str2, ", iconColor=");
        a.h(d11, str3, ", textColor=", str4, ", timeLeft=");
        d11.append(num);
        d11.append(", title=");
        d11.append(str5);
        d11.append(")");
        return d11.toString();
    }
}
