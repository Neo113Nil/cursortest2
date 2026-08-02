package com.vk.superapp.base.js.bridge;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkUiPermissionsHandler.kt */
/* loaded from: classes6.dex */
public interface VkUiPermissionsHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkUiPermissionsHandler.kt */
    public static final class Permissions {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Permissions[] $VALUES;
        public static final Permissions EMAIL;
        public static final Permissions GEO;
        public static final Permissions MICROPHONE;
        public static final Permissions PHONE;
        private final String key;

        static {
            Permissions permissions = new Permissions("GEO", 0, "geo_data");
            GEO = permissions;
            Permissions permissions2 = new Permissions("PHONE", 1, "phone_number");
            PHONE = permissions2;
            Permissions permissions3 = new Permissions(CommonConstant.RETKEY.EMAIL, 2, "email");
            EMAIL = permissions3;
            Permissions permissions4 = new Permissions("MICROPHONE", 3, "microphone");
            MICROPHONE = permissions4;
            Permissions[] permissionsArr = {permissions, permissions2, permissions3, permissions4};
            $VALUES = permissionsArr;
            $ENTRIES = new asp(permissionsArr);
        }

        public Permissions(String str, int i, String str2) {
            this.key = str2;
        }

        public static Permissions valueOf(String str) {
            return (Permissions) Enum.valueOf(Permissions.class, str);
        }

        public static Permissions[] values() {
            return (Permissions[]) $VALUES.clone();
        }

        public final String h() {
            return this.key;
        }
    }

    boolean a(Permissions permissions);

    b0 b(Permissions permissions);
}
