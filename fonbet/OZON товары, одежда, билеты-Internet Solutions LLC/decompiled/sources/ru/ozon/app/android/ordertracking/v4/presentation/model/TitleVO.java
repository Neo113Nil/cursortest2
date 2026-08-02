package ru.ozon.app.android.ordertracking.v4.presentation.model;

import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", "", "", "text", "color", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lorg/joda/time/DateTime;", "timeLeft", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lorg/joda/time/DateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lorg/joda/time/DateTime;", "getTimeLeft", "()Lorg/joda/time/DateTime;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TitleVO {
    private final String color;
    private final IconDTO icon;

    @NotNull
    private final String text;
    private final DateTime timeLeft;

    public TitleVO(@NotNull String text, String str, IconDTO iconDTO, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.color = str;
        this.icon = iconDTO;
        this.timeLeft = dateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleVO)) {
            return false;
        }
        TitleVO titleVO = (TitleVO) other;
        return Intrinsics.d(this.text, titleVO.text) && Intrinsics.d(this.color, titleVO.color) && Intrinsics.d(this.icon, titleVO.icon) && Intrinsics.d(this.timeLeft, titleVO.timeLeft);
    }

    public final String getColor() {
        return this.color;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final DateTime getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        DateTime dateTime = this.timeLeft;
        return hashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.color;
        IconDTO iconDTO = this.icon;
        DateTime dateTime = this.timeLeft;
        StringBuilder d11 = C3660k.d("TitleVO(text=", str, ", color=", str2, ", icon=");
        d11.append(iconDTO);
        d11.append(", timeLeft=");
        d11.append(dateTime);
        d11.append(")");
        return d11.toString();
    }
}
