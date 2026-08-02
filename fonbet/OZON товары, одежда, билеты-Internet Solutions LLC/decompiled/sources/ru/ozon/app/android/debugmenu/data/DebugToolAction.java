package ru.ozon.app.android.debugmenu.data;

import G.g;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/debugmenu/data/DebugToolAction;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "paramsName", "", "disclaimerResId", "<init>", "(Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;", "getName", "()Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;", "Ljava/lang/String;", "getValue", "getParamsName", "Ljava/lang/Integer;", "getDisclaimerResId", "()Ljava/lang/Integer;", "ActionName", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DebugToolAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DebugToolAction> CREATOR = new Creator();
    private final Integer disclaimerResId;

    @NotNull
    private final ActionName name;

    @NotNull
    private final String paramsName;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;", "", "<init>", "(Ljava/lang/String;I)V", "DELETE", "APPEND", "REPLACE", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionName[] $VALUES;
        public static final ActionName DELETE = new ActionName("DELETE", 0);
        public static final ActionName APPEND = new ActionName("APPEND", 1);
        public static final ActionName REPLACE = new ActionName("REPLACE", 2);

        private static final /* synthetic */ ActionName[] $values() {
            return new ActionName[]{DELETE, APPEND, REPLACE};
        }

        static {
            ActionName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ActionName(String str, int i11) {
        }

        public static ActionName valueOf(String str) {
            return (ActionName) Enum.valueOf(ActionName.class, str);
        }

        public static ActionName[] values() {
            return (ActionName[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DebugToolAction> {
        @Override // android.os.Parcelable.Creator
        public final DebugToolAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DebugToolAction(ActionName.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DebugToolAction[] newArray(int i11) {
            return new DebugToolAction[i11];
        }
    }

    public DebugToolAction(@NotNull ActionName name, String str, @NotNull String paramsName, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paramsName, "paramsName");
        this.name = name;
        this.value = str;
        this.paramsName = paramsName;
        this.disclaimerResId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugToolAction)) {
            return false;
        }
        DebugToolAction debugToolAction = (DebugToolAction) other;
        return this.name == debugToolAction.name && Intrinsics.d(this.value, debugToolAction.value) && Intrinsics.d(this.paramsName, debugToolAction.paramsName) && Intrinsics.d(this.disclaimerResId, debugToolAction.disclaimerResId);
    }

    public final Integer getDisclaimerResId() {
        return this.disclaimerResId;
    }

    @NotNull
    public final ActionName getName() {
        return this.name;
    }

    @NotNull
    public final String getParamsName() {
        return this.paramsName;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.paramsName);
        Integer num = this.disclaimerResId;
        return a11 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DebugToolAction(name=" + this.name + ", value=" + this.value + ", paramsName=" + this.paramsName + ", disclaimerResId=" + this.disclaimerResId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name.name());
        dest.writeString(this.value);
        dest.writeString(this.paramsName);
        Integer num = this.disclaimerResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
    }

    public /* synthetic */ DebugToolAction(ActionName actionName, String str, String str2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionName, str, str2, (i11 & 8) != 0 ? null : num);
    }
}
