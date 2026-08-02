package com.vk.superapp.api.dto.restore;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: VkRestoreInstantAuth.kt */
/* loaded from: classes6.dex */
public final class VkRestoreInstantAuth {
    public final String a;
    public final Long b;
    public final String c;
    public final Status d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRestoreInstantAuth.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ALREADY_ALLOWED;
        public static final Status ALREADY_DENIED;
        public static final a Companion;
        public static final Status WAIT_CONFIRMATION;
        private final int code;

        /* compiled from: VkRestoreInstantAuth.kt */
        public static final class a {
        }

        static {
            Status status = new Status("WAIT_CONFIRMATION", 0, 1);
            WAIT_CONFIRMATION = status;
            Status status2 = new Status("ALREADY_ALLOWED", 1, 2);
            ALREADY_ALLOWED = status2;
            Status status3 = new Status("ALREADY_DENIED", 2, 3);
            ALREADY_DENIED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            Companion = new a();
        }

        public Status(String str, int i, int i2) {
            this.code = i2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    public VkRestoreInstantAuth(String str, Long l, String str2, Status status, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = status;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRestoreInstantAuth)) {
            return false;
        }
        VkRestoreInstantAuth vkRestoreInstantAuth = (VkRestoreInstantAuth) obj;
        return epx.f(this.a, vkRestoreInstantAuth.a) && epx.f(this.b, vkRestoreInstantAuth.b) && epx.f(this.c, vkRestoreInstantAuth.c) && this.d == vkRestoreInstantAuth.d && epx.f(this.e, vkRestoreInstantAuth.e) && epx.f(this.f, vkRestoreInstantAuth.f) && epx.f(this.g, vkRestoreInstantAuth.g) && epx.f(this.h, vkRestoreInstantAuth.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return this.h.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRestoreInstantAuth(deviceName=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", place=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", firstName=");
        sb.append(this.e);
        sb.append(", lastName=");
        sb.append(this.f);
        sb.append(", photo=");
        sb.append(this.g);
        sb.append(", city=");
        return ho8.a(sb, this.h, ')');
    }
}
