package com.vk.im.engine.models.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FolderType.kt */
/* loaded from: classes2.dex */
public final class FolderType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FolderType[] $VALUES;
    public static final FolderType BUSINESS;
    public static final FolderType CHANNELS;
    public static final Parcelable.Creator<FolderType> CREATOR;
    public static final b Companion;
    public static final FolderType DEFAULT;
    public static final FolderType MANAGED_GROUPS;
    public static final FolderType PERSONAL;
    public static final FolderType UNKNOWN;
    public static final FolderType UNREAD;
    private final String rawType;
    private final int typeId;

    /* compiled from: FolderType.kt */
    public static final class a implements Parcelable.Creator<FolderType> {
        @Override // android.os.Parcelable.Creator
        public final FolderType createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            FolderType.Companion.getClass();
            return b.b(readInt);
        }

        @Override // android.os.Parcelable.Creator
        public final FolderType[] newArray(int i) {
            return new FolderType[i];
        }
    }

    /* compiled from: FolderType.kt */
    public static final class b {
        public static FolderType a(String str) {
            Object obj;
            Iterator<E> it = FolderType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((FolderType) obj).j(), str)) {
                    break;
                }
            }
            FolderType folderType = (FolderType) obj;
            return folderType == null ? FolderType.UNKNOWN : folderType;
        }

        public static FolderType b(int i) {
            Object obj;
            Iterator<E> it = FolderType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((FolderType) obj).k() == i) {
                    break;
                }
            }
            FolderType folderType = (FolderType) obj;
            return folderType == null ? FolderType.UNKNOWN : folderType;
        }
    }

    static {
        FolderType folderType = new FolderType("DEFAULT", 0, BuildConfig.FLAVOR, 0);
        DEFAULT = folderType;
        FolderType folderType2 = new FolderType("BUSINESS", 1, "business", 1);
        BUSINESS = folderType2;
        FolderType folderType3 = new FolderType("CHANNELS", 2, RTCStatsConstants.KEY_CHANNELS, 2);
        CHANNELS = folderType3;
        FolderType folderType4 = new FolderType("UNREAD", 3, "unread", 3);
        UNREAD = folderType4;
        FolderType folderType5 = new FolderType("PERSONAL", 4, "personal", 4);
        PERSONAL = folderType5;
        FolderType folderType6 = new FolderType("MANAGED_GROUPS", 5, "managed_groups", 5);
        MANAGED_GROUPS = folderType6;
        FolderType folderType7 = new FolderType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, "", -1);
        UNKNOWN = folderType7;
        FolderType[] folderTypeArr = {folderType, folderType2, folderType3, folderType4, folderType5, folderType6, folderType7};
        $VALUES = folderTypeArr;
        $ENTRIES = new asp(folderTypeArr);
        Companion = new b();
        CREATOR = new a();
    }

    public FolderType(String str, int i, String str2, int i2) {
        this.rawType = str2;
        this.typeId = i2;
    }

    public static zrp<FolderType> i() {
        return $ENTRIES;
    }

    public static FolderType valueOf(String str) {
        return (FolderType) Enum.valueOf(FolderType.class, str);
    }

    public static FolderType[] values() {
        return (FolderType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.rawType;
    }

    public final int k() {
        return this.typeId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.typeId);
    }
}
