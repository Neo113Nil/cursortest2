package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowStoryBox.kt */
/* loaded from: classes6.dex */
public final class ShowStoryBox$Parameters implements ad6 {

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final Attachment attachment;

    @pmi0("background_type")
    private final BackgroundType backgroundType;

    @pmi0("blob")
    private final String blob;

    @pmi0("camera_type")
    private final CameraType cameraType;

    @pmi0("locked")
    private final Boolean locked;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("service_info")
    private final ServiceInfo serviceInfo;

    @pmi0("stickers")
    private final List<Object> stickers;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowStoryBox.kt */
    public static final class BackgroundType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BackgroundType[] $VALUES;

        @pmi0("image")
        public static final BackgroundType IMAGE;

        @pmi0("none")
        public static final BackgroundType NONE;

        @pmi0("video")
        public static final BackgroundType VIDEO;

        static {
            BackgroundType backgroundType = new BackgroundType("IMAGE", 0);
            IMAGE = backgroundType;
            BackgroundType backgroundType2 = new BackgroundType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = backgroundType2;
            BackgroundType backgroundType3 = new BackgroundType("NONE", 2);
            NONE = backgroundType3;
            BackgroundType[] backgroundTypeArr = {backgroundType, backgroundType2, backgroundType3};
            $VALUES = backgroundTypeArr;
            $ENTRIES = new asp(backgroundTypeArr);
        }

        private BackgroundType(String str, int i) {
        }

        public static BackgroundType valueOf(String str) {
            return (BackgroundType) Enum.valueOf(BackgroundType.class, str);
        }

        public static BackgroundType[] values() {
            return (BackgroundType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowStoryBox.kt */
    public static final class CameraType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CameraType[] $VALUES;

        @pmi0("back")
        public static final CameraType BACK;

        @pmi0("front")
        public static final CameraType FRONT;

        static {
            CameraType cameraType = new CameraType("BACK", 0);
            BACK = cameraType;
            CameraType cameraType2 = new CameraType("FRONT", 1);
            FRONT = cameraType2;
            CameraType[] cameraTypeArr = {cameraType, cameraType2};
            $VALUES = cameraTypeArr;
            $ENTRIES = new asp(cameraTypeArr);
        }

        private CameraType(String str, int i) {
        }

        public static CameraType valueOf(String str) {
            return (CameraType) Enum.valueOf(CameraType.class, str);
        }

        public static CameraType[] values() {
            return (CameraType[]) $VALUES.clone();
        }
    }

    /* compiled from: ShowStoryBox.kt */
    public static final class ServiceInfo {

        @pmi0("allow_background_editor")
        private final Boolean allowBackgroundEditor;

        @pmi0("allow_camera")
        private final Boolean allowCamera;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("lifetime")
        private final Integer lifetime;

        @pmi0("mask_id")
        private final String maskId;

        @pmi0("open_text_editor")
        private final Boolean openTextEditor;

        @pmi0("situational_suggest_id")
        private final Integer situationalSuggestId;

        public ServiceInfo() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final Boolean a() {
            return this.allowBackgroundEditor;
        }

        public final Boolean b() {
            return this.allowCamera;
        }

        public final Integer c() {
            return this.lifetime;
        }

        public final String d() {
            return this.maskId;
        }

        public final Boolean e() {
            return this.openTextEditor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceInfo)) {
                return false;
            }
            ServiceInfo serviceInfo = (ServiceInfo) obj;
            return epx.f(this.maskId, serviceInfo.maskId) && epx.f(this.openTextEditor, serviceInfo.openTextEditor) && epx.f(this.situationalSuggestId, serviceInfo.situationalSuggestId) && epx.f(this.isFavorite, serviceInfo.isFavorite) && epx.f(this.allowBackgroundEditor, serviceInfo.allowBackgroundEditor) && epx.f(this.lifetime, serviceInfo.lifetime) && epx.f(this.allowCamera, serviceInfo.allowCamera);
        }

        public final Integer f() {
            return this.situationalSuggestId;
        }

        public final Boolean g() {
            return this.isFavorite;
        }

        public final int hashCode() {
            String str = this.maskId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.openTextEditor;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.situationalSuggestId;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool2 = this.isFavorite;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.allowBackgroundEditor;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num2 = this.lifetime;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool4 = this.allowCamera;
            return hashCode6 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceInfo(maskId=");
            sb.append(this.maskId);
            sb.append(", openTextEditor=");
            sb.append(this.openTextEditor);
            sb.append(", situationalSuggestId=");
            sb.append(this.situationalSuggestId);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", allowBackgroundEditor=");
            sb.append(this.allowBackgroundEditor);
            sb.append(", lifetime=");
            sb.append(this.lifetime);
            sb.append(", allowCamera=");
            return tn.a(sb, this.allowCamera, ')');
        }

        public ServiceInfo(String str, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Integer num2, Boolean bool4) {
            this.maskId = str;
            this.openTextEditor = bool;
            this.situationalSuggestId = num;
            this.isFavorite = bool2;
            this.allowBackgroundEditor = bool3;
            this.lifetime = num2;
            this.allowCamera = bool4;
        }

        public /* synthetic */ ServiceInfo(String str, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Integer num2, Boolean bool4, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool4);
        }
    }

    public ShowStoryBox$Parameters(BackgroundType backgroundType, String str, CameraType cameraType, String str2, String str3, Boolean bool, Attachment attachment, List<Object> list, ServiceInfo serviceInfo) {
        this.backgroundType = backgroundType;
        this.requestId = str;
        this.cameraType = cameraType;
        this.url = str2;
        this.blob = str3;
        this.locked = bool;
        this.attachment = attachment;
        this.stickers = list;
        this.serviceInfo = serviceInfo;
    }

    public static final ShowStoryBox$Parameters a(ShowStoryBox$Parameters showStoryBox$Parameters) {
        return showStoryBox$Parameters.requestId == null ? new ShowStoryBox$Parameters(showStoryBox$Parameters.backgroundType, "default_request_id", showStoryBox$Parameters.cameraType, showStoryBox$Parameters.url, showStoryBox$Parameters.blob, showStoryBox$Parameters.locked, showStoryBox$Parameters.attachment, showStoryBox$Parameters.stickers, showStoryBox$Parameters.serviceInfo) : showStoryBox$Parameters;
    }

    public static final void b(ShowStoryBox$Parameters showStoryBox$Parameters) {
        if (showStoryBox$Parameters.backgroundType == null) {
            throw new IllegalArgumentException("Value of non-nullable member backgroundType cannot\n                        be null");
        }
        if (showStoryBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Attachment c() {
        return this.attachment;
    }

    public final BackgroundType d() {
        return this.backgroundType;
    }

    public final String e() {
        return this.blob;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowStoryBox$Parameters)) {
            return false;
        }
        ShowStoryBox$Parameters showStoryBox$Parameters = (ShowStoryBox$Parameters) obj;
        return this.backgroundType == showStoryBox$Parameters.backgroundType && epx.f(this.requestId, showStoryBox$Parameters.requestId) && this.cameraType == showStoryBox$Parameters.cameraType && epx.f(this.url, showStoryBox$Parameters.url) && epx.f(this.blob, showStoryBox$Parameters.blob) && epx.f(this.locked, showStoryBox$Parameters.locked) && epx.f(this.attachment, showStoryBox$Parameters.attachment) && epx.f(this.stickers, showStoryBox$Parameters.stickers) && epx.f(this.serviceInfo, showStoryBox$Parameters.serviceInfo);
    }

    public final CameraType f() {
        return this.cameraType;
    }

    public final Boolean g() {
        return this.locked;
    }

    public final String h() {
        return this.requestId;
    }

    public final int hashCode() {
        int a = urd0.a(this.backgroundType.hashCode() * 31, 31, this.requestId);
        CameraType cameraType = this.cameraType;
        int hashCode = (a + (cameraType == null ? 0 : cameraType.hashCode())) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blob;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.locked;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Attachment attachment = this.attachment;
        int hashCode5 = (hashCode4 + (attachment == null ? 0 : attachment.hashCode())) * 31;
        List<Object> list = this.stickers;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ServiceInfo serviceInfo = this.serviceInfo;
        return hashCode6 + (serviceInfo != null ? serviceInfo.hashCode() : 0);
    }

    public final ServiceInfo i() {
        return this.serviceInfo;
    }

    public final String j() {
        return this.url;
    }

    public final String toString() {
        return "Parameters(backgroundType=" + this.backgroundType + ", requestId=" + this.requestId + ", cameraType=" + this.cameraType + ", url=" + this.url + ", blob=" + this.blob + ", locked=" + this.locked + ", attachment=" + this.attachment + ", stickers=" + this.stickers + ", serviceInfo=" + this.serviceInfo + ')';
    }

    /* compiled from: ShowStoryBox.kt */
    public static final class Attachment {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("id")
        private final Integer id;

        @pmi0("owner_id")
        private final Long ownerId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final Type type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShowStoryBox.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("audio")
            public static final Type AUDIO;

            @pmi0("photo")
            public static final Type PHOTO;

            @pmi0("url")
            public static final Type URL;

            @pmi0("video")
            public static final Type VIDEO;

            static {
                Type type = new Type("URL", 0);
                URL = type;
                Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
                AUDIO = type2;
                Type type3 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 2);
                VIDEO = type3;
                Type type4 = new Type("PHOTO", 3);
                PHOTO = type4;
                Type[] typeArr = {type, type2, type3, type4};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            private Type(String str, int i) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Attachment(String str, Type type, String str2, Long l, Integer num, String str3) {
            this.text = str;
            this.type = type;
            this.url = str2;
            this.ownerId = l;
            this.id = num;
            this.accessKey = str3;
        }

        public final String a() {
            return this.accessKey;
        }

        public final Integer b() {
            return this.id;
        }

        public final Long c() {
            return this.ownerId;
        }

        public final String d() {
            return this.text;
        }

        public final Type e() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            return epx.f(this.text, attachment.text) && this.type == attachment.type && epx.f(this.url, attachment.url) && epx.f(this.ownerId, attachment.ownerId) && epx.f(this.id, attachment.id) && epx.f(this.accessKey, attachment.accessKey);
        }

        public final String f() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + (this.text.hashCode() * 31)) * 31;
            String str = this.url;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.ownerId;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.id;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.accessKey;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Attachment(text=");
            sb.append(this.text);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", accessKey=");
            return ho8.a(sb, this.accessKey, ')');
        }

        public /* synthetic */ Attachment(String str, Type type, String str2, Long l, Integer num, String str3, int i, zcl zclVar) {
            this(str, type, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3);
        }
    }

    public /* synthetic */ ShowStoryBox$Parameters(BackgroundType backgroundType, String str, CameraType cameraType, String str2, String str3, Boolean bool, Attachment attachment, List list, ServiceInfo serviceInfo, int i, zcl zclVar) {
        this(backgroundType, str, (i & 4) != 0 ? null : cameraType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : attachment, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : serviceInfo);
    }
}
