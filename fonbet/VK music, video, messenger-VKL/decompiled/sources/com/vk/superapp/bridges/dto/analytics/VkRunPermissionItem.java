package com.vk.superapp.bridges.dto.analytics;

import defpackage.q0;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkRunPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkRunPermissionItem {
    public final VkRunPermission a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunPermissionItem.kt */
    public static final class VkRunPermission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkRunPermission[] $VALUES;
        public static final VkRunPermission ACTIVITY_RECOGNITION;
        public static final a Companion;
        public static final VkRunPermission GOOGLE_FIT;
        public static final VkRunPermission LOCATION;
        public static final VkRunPermission PERMISSION_NOTIFICATION;

        /* compiled from: VkRunPermissionItem.kt */
        public static final class a {
        }

        static {
            VkRunPermission vkRunPermission = new VkRunPermission("LOCATION", 0);
            LOCATION = vkRunPermission;
            VkRunPermission vkRunPermission2 = new VkRunPermission("GOOGLE_FIT", 1);
            GOOGLE_FIT = vkRunPermission2;
            VkRunPermission vkRunPermission3 = new VkRunPermission("ACTIVITY_RECOGNITION", 2);
            ACTIVITY_RECOGNITION = vkRunPermission3;
            VkRunPermission vkRunPermission4 = new VkRunPermission("PERMISSION_NOTIFICATION", 3);
            PERMISSION_NOTIFICATION = vkRunPermission4;
            VkRunPermission[] vkRunPermissionArr = {vkRunPermission, vkRunPermission2, vkRunPermission3, vkRunPermission4};
            $VALUES = vkRunPermissionArr;
            $ENTRIES = new asp(vkRunPermissionArr);
            Companion = new a();
        }

        public VkRunPermission() {
            throw null;
        }

        public static VkRunPermission valueOf(String str) {
            return (VkRunPermission) Enum.valueOf(VkRunPermission.class, str);
        }

        public static VkRunPermission[] values() {
            return (VkRunPermission[]) $VALUES.clone();
        }
    }

    public VkRunPermissionItem(VkRunPermission vkRunPermission, boolean z) {
        this.a = vkRunPermission;
        this.b = z;
    }

    public final VkRunPermission a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunPermissionItem)) {
            return false;
        }
        VkRunPermissionItem vkRunPermissionItem = (VkRunPermissionItem) obj;
        return this.a == vkRunPermissionItem.a && this.b == vkRunPermissionItem.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunPermissionItem(permission=");
        sb.append(this.a);
        sb.append(", isGranted=");
        return q0.a(sb, this.b, ')');
    }
}
