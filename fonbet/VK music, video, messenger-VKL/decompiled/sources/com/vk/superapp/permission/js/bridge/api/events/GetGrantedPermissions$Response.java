package com.vk.superapp.permission.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetGrantedPermissions.kt */
/* loaded from: classes6.dex */
public final class GetGrantedPermissions$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetGrantedPermissions.kt */
    public static final class Data {

        @pmi0(SignalingProtocol.KEY_PERMISSIONS)
        private final List<Permissions> permissions;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetGrantedPermissions.kt */
        public static final class Permissions {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Permissions[] $VALUES;

            @pmi0(SignalingProtocol.KEY_CAMERA)
            public static final Permissions CAMERA;

            @pmi0("location")
            public static final Permissions LOCATION;

            @pmi0("photo")
            public static final Permissions PHOTO;

            static {
                Permissions permissions = new Permissions("CAMERA", 0);
                CAMERA = permissions;
                Permissions permissions2 = new Permissions("LOCATION", 1);
                LOCATION = permissions2;
                Permissions permissions3 = new Permissions("PHOTO", 2);
                PHOTO = permissions3;
                Permissions[] permissionsArr = {permissions, permissions2, permissions3};
                $VALUES = permissionsArr;
                $ENTRIES = new asp(permissionsArr);
            }

            private Permissions(String str, int i) {
            }

            public static Permissions valueOf(String str) {
                return (Permissions) Enum.valueOf(Permissions.class, str);
            }

            public static Permissions[] values() {
                return (Permissions[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(List<? extends Permissions> list, String str) {
            this.permissions = list;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.permissions, data.permissions) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.permissions.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(permissions=");
            sb.append(this.permissions);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public GetGrantedPermissions$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetGrantedPermissions$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGrantedPermissions$Response)) {
            return false;
        }
        GetGrantedPermissions$Response getGrantedPermissions$Response = (GetGrantedPermissions$Response) obj;
        return epx.f(this.type, getGrantedPermissions$Response.type) && epx.f(this.data, getGrantedPermissions$Response.data) && epx.f(this.requestId, getGrantedPermissions$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetGrantedPermissions$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetGrantedPermissionsResult" : str, data, str2);
    }
}
