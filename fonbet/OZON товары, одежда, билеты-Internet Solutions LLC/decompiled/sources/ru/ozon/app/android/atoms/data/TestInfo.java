package ru.ozon.app.android.atoms.data;

import B0.A0;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/atoms/data/TestInfo;", "Landroid/os/Parcelable;", "automatizationId", "", "<init>", "(Ljava/lang/String;)V", "getAutomatizationId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TestInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TestInfo> CREATOR = new Creator();

    @NotNull
    private final String automatizationId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TestInfo> {
        @Override // android.os.Parcelable.Creator
        public final TestInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TestInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TestInfo[] newArray(int i11) {
            return new TestInfo[i11];
        }
    }

    public TestInfo(@NotNull String automatizationId) {
        Intrinsics.checkNotNullParameter(automatizationId, "automatizationId");
        this.automatizationId = automatizationId;
    }

    public static /* synthetic */ TestInfo copy$default(TestInfo testInfo, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = testInfo.automatizationId;
        }
        return testInfo.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAutomatizationId() {
        return this.automatizationId;
    }

    @NotNull
    public final TestInfo copy(@NotNull String automatizationId) {
        Intrinsics.checkNotNullParameter(automatizationId, "automatizationId");
        return new TestInfo(automatizationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TestInfo) && Intrinsics.d(this.automatizationId, ((TestInfo) other).automatizationId);
    }

    @NotNull
    public final String getAutomatizationId() {
        return this.automatizationId;
    }

    public int hashCode() {
        return this.automatizationId.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("TestInfo(automatizationId=", this.automatizationId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.automatizationId);
    }
}
