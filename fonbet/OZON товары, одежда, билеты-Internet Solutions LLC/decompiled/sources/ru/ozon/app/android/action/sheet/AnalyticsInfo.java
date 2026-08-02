package ru.ozon.app.android.action.sheet;

import De.C2860c;
import RZ.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "Landroid/os/Parcelable;", "", "widgetId", "", "widgetToken", "LRZ/b;", "Lru/ozon/app/android/analytics/modules/tokenized/PageAnalyticsInfo;", "pageAnalyticsInfo", "<init>", "(Ljava/lang/Long;Ljava/lang/String;LRZ/b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getWidgetToken", "LRZ/b;", "getPageAnalyticsInfo", "()LRZ/b;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AnalyticsInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsInfo> CREATOR = new Creator();
    private final b pageAnalyticsInfo;
    private final Long widgetId;
    private final String widgetToken;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsInfo> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsInfo[] newArray(int i11) {
            return new AnalyticsInfo[i11];
        }
    }

    public AnalyticsInfo(Long l11, String str, b bVar) {
        this.widgetId = l11;
        this.widgetToken = str;
        this.pageAnalyticsInfo = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsInfo)) {
            return false;
        }
        AnalyticsInfo analyticsInfo = (AnalyticsInfo) other;
        return Intrinsics.d(this.widgetId, analyticsInfo.widgetId) && Intrinsics.d(this.widgetToken, analyticsInfo.widgetToken) && Intrinsics.d(this.pageAnalyticsInfo, analyticsInfo.pageAnalyticsInfo);
    }

    public final b getPageAnalyticsInfo() {
        return this.pageAnalyticsInfo;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public final String getWidgetToken() {
        return this.widgetToken;
    }

    public int hashCode() {
        Long l11 = this.widgetId;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.widgetToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.pageAnalyticsInfo;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticsInfo(widgetId=" + this.widgetId + ", widgetToken=" + this.widgetToken + ", pageAnalyticsInfo=" + this.pageAnalyticsInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.widgetId;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        dest.writeString(this.widgetToken);
        dest.writeSerializable(this.pageAnalyticsInfo);
    }

    public /* synthetic */ AnalyticsInfo(Long l11, String str, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bVar);
    }
}
