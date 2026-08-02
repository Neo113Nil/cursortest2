package com.vk.catalog.mvi.section.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogSearchStatInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogSearchStatInfo implements Parcelable {
    public static final Parcelable.Creator<CatalogSearchStatInfo> CREATOR = new a();
    public final boolean b;
    public final Mode c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSearchStatInfo.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Disabled;
        public static final Mode Enabled;
        public static final Mode EnabledOnlyForLocal;

        static {
            Mode mode = new Mode(PeerConnectionFactory.TRIAL_ENABLED, 0);
            Enabled = mode;
            Mode mode2 = new Mode("EnabledOnlyForLocal", 1);
            EnabledOnlyForLocal = mode2;
            Mode mode3 = new Mode("Disabled", 2);
            Disabled = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: CatalogSearchStatInfo.kt */
    public static final class a implements Parcelable.Creator<CatalogSearchStatInfo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSearchStatInfo createFromParcel(Parcel parcel) {
            return new CatalogSearchStatInfo(parcel.readInt() != 0, Mode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSearchStatInfo[] newArray(int i) {
            return new CatalogSearchStatInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSearchStatInfo() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchStatInfo)) {
            return false;
        }
        CatalogSearchStatInfo catalogSearchStatInfo = (CatalogSearchStatInfo) obj;
        return this.b == catalogSearchStatInfo.b && this.c == catalogSearchStatInfo.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "CatalogSearchStatInfo(isDeepScreen=" + this.b + ", mode=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
    }

    public CatalogSearchStatInfo(boolean z, Mode mode) {
        this.b = z;
        this.c = mode;
    }

    public /* synthetic */ CatalogSearchStatInfo(boolean z, Mode mode, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Mode.Enabled : mode);
    }
}
