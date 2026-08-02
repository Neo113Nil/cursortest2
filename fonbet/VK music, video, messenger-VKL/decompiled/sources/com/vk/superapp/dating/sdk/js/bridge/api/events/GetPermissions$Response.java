package com.vk.superapp.dating.sdk.js.bridge.api.events;

import com.ironsource.C4217a2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetPermissions.kt */
/* loaded from: classes6.dex */
public final class GetPermissions$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetPermissions$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetPermissions$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPermissions$Response)) {
            return false;
        }
        GetPermissions$Response getPermissions$Response = (GetPermissions$Response) obj;
        return epx.f(this.type, getPermissions$Response.type) && epx.f(this.data, getPermissions$Response.data) && epx.f(this.requestId, getPermissions$Response.requestId);
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

    public /* synthetic */ GetPermissions$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetPermissionsResult" : str, data, str2);
    }

    /* compiled from: GetPermissions.kt */
    public static final class Data {

        @pmi0("att")
        private final Att att;

        @pmi0(SignalingProtocol.KEY_CAMERA)
        private final Camera camera;

        @pmi0("location")
        private final Location location;

        @pmi0("microphone")
        private final Microphone microphone;

        @pmi0("photo")
        private final Photo photo;

        @pmi0("push_notifications")
        private final PushNotifications pushNotifications;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class Att {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Att[] $VALUES;

            @pmi0(C4217a2.e)
            public static final Att DISABLED;

            @pmi0("disabled_can_ask")
            public static final Att DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final Att GRANTED;

            static {
                Att att = new Att("DISABLED", 0);
                DISABLED = att;
                Att att2 = new Att("GRANTED", 1);
                GRANTED = att2;
                Att att3 = new Att("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = att3;
                Att[] attArr = {att, att2, att3};
                $VALUES = attArr;
                $ENTRIES = new asp(attArr);
            }

            private Att(String str, int i) {
            }

            public static Att valueOf(String str) {
                return (Att) Enum.valueOf(Att.class, str);
            }

            public static Att[] values() {
                return (Att[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class Camera {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Camera[] $VALUES;

            @pmi0(C4217a2.e)
            public static final Camera DISABLED;

            @pmi0("disabled_can_ask")
            public static final Camera DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final Camera GRANTED;

            static {
                Camera camera = new Camera("DISABLED", 0);
                DISABLED = camera;
                Camera camera2 = new Camera("GRANTED", 1);
                GRANTED = camera2;
                Camera camera3 = new Camera("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = camera3;
                Camera[] cameraArr = {camera, camera2, camera3};
                $VALUES = cameraArr;
                $ENTRIES = new asp(cameraArr);
            }

            private Camera(String str, int i) {
            }

            public static Camera valueOf(String str) {
                return (Camera) Enum.valueOf(Camera.class, str);
            }

            public static Camera[] values() {
                return (Camera[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class Location {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Location[] $VALUES;

            @pmi0(C4217a2.e)
            public static final Location DISABLED;

            @pmi0("disabled_can_ask")
            public static final Location DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final Location GRANTED;

            static {
                Location location = new Location("DISABLED", 0);
                DISABLED = location;
                Location location2 = new Location("GRANTED", 1);
                GRANTED = location2;
                Location location3 = new Location("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = location3;
                Location[] locationArr = {location, location2, location3};
                $VALUES = locationArr;
                $ENTRIES = new asp(locationArr);
            }

            private Location(String str, int i) {
            }

            public static Location valueOf(String str) {
                return (Location) Enum.valueOf(Location.class, str);
            }

            public static Location[] values() {
                return (Location[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class Microphone {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Microphone[] $VALUES;

            @pmi0(C4217a2.e)
            public static final Microphone DISABLED;

            @pmi0("disabled_can_ask")
            public static final Microphone DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final Microphone GRANTED;

            static {
                Microphone microphone = new Microphone("DISABLED", 0);
                DISABLED = microphone;
                Microphone microphone2 = new Microphone("GRANTED", 1);
                GRANTED = microphone2;
                Microphone microphone3 = new Microphone("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = microphone3;
                Microphone[] microphoneArr = {microphone, microphone2, microphone3};
                $VALUES = microphoneArr;
                $ENTRIES = new asp(microphoneArr);
            }

            private Microphone(String str, int i) {
            }

            public static Microphone valueOf(String str) {
                return (Microphone) Enum.valueOf(Microphone.class, str);
            }

            public static Microphone[] values() {
                return (Microphone[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class Photo {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Photo[] $VALUES;

            @pmi0(C4217a2.e)
            public static final Photo DISABLED;

            @pmi0("disabled_can_ask")
            public static final Photo DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final Photo GRANTED;

            static {
                Photo photo = new Photo("DISABLED", 0);
                DISABLED = photo;
                Photo photo2 = new Photo("GRANTED", 1);
                GRANTED = photo2;
                Photo photo3 = new Photo("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = photo3;
                Photo[] photoArr = {photo, photo2, photo3};
                $VALUES = photoArr;
                $ENTRIES = new asp(photoArr);
            }

            private Photo(String str, int i) {
            }

            public static Photo valueOf(String str) {
                return (Photo) Enum.valueOf(Photo.class, str);
            }

            public static Photo[] values() {
                return (Photo[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetPermissions.kt */
        public static final class PushNotifications {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PushNotifications[] $VALUES;

            @pmi0(C4217a2.e)
            public static final PushNotifications DISABLED;

            @pmi0("disabled_can_ask")
            public static final PushNotifications DISABLED_CAN_ASK;

            @pmi0("granted")
            public static final PushNotifications GRANTED;

            static {
                PushNotifications pushNotifications = new PushNotifications("DISABLED", 0);
                DISABLED = pushNotifications;
                PushNotifications pushNotifications2 = new PushNotifications("GRANTED", 1);
                GRANTED = pushNotifications2;
                PushNotifications pushNotifications3 = new PushNotifications("DISABLED_CAN_ASK", 2);
                DISABLED_CAN_ASK = pushNotifications3;
                PushNotifications[] pushNotificationsArr = {pushNotifications, pushNotifications2, pushNotifications3};
                $VALUES = pushNotificationsArr;
                $ENTRIES = new asp(pushNotificationsArr);
            }

            private PushNotifications(String str, int i) {
            }

            public static PushNotifications valueOf(String str) {
                return (PushNotifications) Enum.valueOf(PushNotifications.class, str);
            }

            public static PushNotifications[] values() {
                return (PushNotifications[]) $VALUES.clone();
            }
        }

        public Data(Camera camera, Microphone microphone, Photo photo, PushNotifications pushNotifications, Location location, Att att, String str) {
            this.camera = camera;
            this.microphone = microphone;
            this.photo = photo;
            this.pushNotifications = pushNotifications;
            this.location = location;
            this.att = att;
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
            return this.camera == data.camera && this.microphone == data.microphone && this.photo == data.photo && this.pushNotifications == data.pushNotifications && this.location == data.location && this.att == data.att && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = (this.location.hashCode() + ((this.pushNotifications.hashCode() + ((this.photo.hashCode() + ((this.microphone.hashCode() + (this.camera.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            Att att = this.att;
            int hashCode2 = (hashCode + (att == null ? 0 : att.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(camera=");
            sb.append(this.camera);
            sb.append(", microphone=");
            sb.append(this.microphone);
            sb.append(", photo=");
            sb.append(this.photo);
            sb.append(", pushNotifications=");
            sb.append(this.pushNotifications);
            sb.append(", location=");
            sb.append(this.location);
            sb.append(", att=");
            sb.append(this.att);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(Camera camera, Microphone microphone, Photo photo, PushNotifications pushNotifications, Location location, Att att, String str, int i, zcl zclVar) {
            this(camera, microphone, photo, pushNotifications, location, (i & 32) != 0 ? null : att, str);
        }
    }
}
