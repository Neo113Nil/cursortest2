package com.vk.push.core.masterhost;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/masterhost/MasterHost;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MasterHost implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f60710a;

    /* renamed from: com.vk.push.core.masterhost.MasterHost$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<MasterHost> {
        @Override // android.os.Parcelable.Creator
        public final MasterHost createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new MasterHost(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final MasterHost[] newArray(int i11) {
            return new MasterHost[i11];
        }
    }

    public MasterHost(@NotNull String master) {
        Intrinsics.checkNotNullParameter(master, "master");
        this.f60710a = master;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final String getF60710a() {
        return this.f60710a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f60710a);
    }
}
