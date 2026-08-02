package com.vk.im.engine.models.account;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.lhg;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NameChangeRequestInfo.kt */
/* loaded from: classes2.dex */
public final class NameChangeRequestInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NameChangeRequestInfo> CREATOR = new a();
    public final int b;
    public final Status c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NameChangeRequestInfo.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final a Companion;
        public static final Status DECLINED;
        public static final Status PROCESSING;
        public static final Status UNKNOWN;
        private static final Status[] VALUES;
        private final int id;

        /* compiled from: NameChangeRequestInfo.kt */
        public static final class a {
        }

        static {
            Status status = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = status;
            Status status2 = new Status("PROCESSING", 1, 1);
            PROCESSING = status2;
            Status status3 = new Status("DECLINED", 2, 2);
            DECLINED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            Companion = new a();
            VALUES = values();
        }

        public Status(String str, int i, int i2) {
            this.id = i2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NameChangeRequestInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NameChangeRequestInfo a(Serializer serializer) {
            return new NameChangeRequestInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NameChangeRequestInfo[i];
        }
    }

    public NameChangeRequestInfo() {
        this(0, null, null, null, 15, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.i());
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public /* synthetic */ NameChangeRequestInfo(int i, Status status, String str, String str2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? Status.UNKNOWN : status, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2);
    }

    public NameChangeRequestInfo(int i, Status status, String str, String str2) {
        this.b = i;
        this.c = status;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NameChangeRequestInfo(Serializer serializer, zcl zclVar) {
        this(r8, r4, serializer.H(), serializer.H());
        Status status;
        int u = serializer.u();
        Status.a aVar = Status.Companion;
        int u2 = serializer.u();
        aVar.getClass();
        Status[] statusArr = Status.VALUES;
        int length = statusArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                status = null;
                break;
            }
            status = statusArr[i];
            if (status.i() == u2) {
                break;
            } else {
                i++;
            }
        }
        if (status != null) {
            return;
        }
        throw new IllegalArgumentException(lhg.a(u2, "Unknown id: "));
    }
}
