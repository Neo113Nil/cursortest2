package com.vk.libvideo.donut.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: Donut.kt */
/* loaded from: classes14.dex */
public final class Donut {
    public final boolean a;
    public final DonutStatus b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Donut.kt */
    public static final class DonutStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DonutStatus[] $VALUES;
        public static final DonutStatus ACTIVE;
        public static final DonutStatus EXPIRING;

        static {
            DonutStatus donutStatus = new DonutStatus(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = donutStatus;
            DonutStatus donutStatus2 = new DonutStatus("EXPIRING", 1);
            EXPIRING = donutStatus2;
            DonutStatus[] donutStatusArr = {donutStatus, donutStatus2};
            $VALUES = donutStatusArr;
            $ENTRIES = new asp(donutStatusArr);
        }

        public DonutStatus() {
            throw null;
        }

        public static DonutStatus valueOf(String str) {
            return (DonutStatus) Enum.valueOf(DonutStatus.class, str);
        }

        public static DonutStatus[] values() {
            return (DonutStatus[]) $VALUES.clone();
        }
    }

    public Donut(boolean z, DonutStatus donutStatus, String str, String str2, String str3) {
        this.a = z;
        this.b = donutStatus;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Donut)) {
            return false;
        }
        Donut donut = (Donut) obj;
        return this.a == donut.a && this.b == donut.b && epx.f(this.c, donut.c) && epx.f(this.d, donut.d) && epx.f(this.e, donut.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        DonutStatus donutStatus = this.b;
        int hashCode2 = (hashCode + (donutStatus == null ? 0 : donutStatus.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Donut(isDon=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", actionUrl=");
        sb.append(this.d);
        sb.append(", paymentLinkUrl=");
        return ho8.a(sb, this.e, ')');
    }
}
