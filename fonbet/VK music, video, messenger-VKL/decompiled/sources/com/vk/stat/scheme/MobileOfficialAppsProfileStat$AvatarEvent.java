package com.vk.stat.scheme;

import com.google.gson.Gson;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsProfileStat$AvatarEvent {
    public final transient String a;

    @pmi0("avatar_event_type")
    private final AvatarEventType avatarEventType;

    @pmi0("photo_id")
    private final FilteredString filteredPhotoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    /* loaded from: classes5.dex */
    public static final class AvatarEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvatarEventType[] $VALUES;

        @pmi0("change_avatar")
        public static final AvatarEventType CHANGE_AVATAR;

        @pmi0("change_avatar_camera")
        public static final AvatarEventType CHANGE_AVATAR_CAMERA;

        @pmi0("change_avatar_gallery")
        public static final AvatarEventType CHANGE_AVATAR_GALLERY;

        @pmi0("click_to_avatar")
        public static final AvatarEventType CLICK_TO_AVATAR;

        @pmi0("click_to_create_story")
        public static final AvatarEventType CLICK_TO_CREATE_STORY;

        @pmi0("click_to_open_photo")
        public static final AvatarEventType CLICK_TO_OPEN_PHOTO;

        @pmi0("click_to_view_story")
        public static final AvatarEventType CLICK_TO_VIEW_STORY;

        @pmi0("delete_avatar")
        public static final AvatarEventType DELETE_AVATAR;

        @pmi0("save_avatar")
        public static final AvatarEventType SAVE_AVATAR;

        static {
            AvatarEventType avatarEventType = new AvatarEventType("CLICK_TO_AVATAR", 0);
            CLICK_TO_AVATAR = avatarEventType;
            AvatarEventType avatarEventType2 = new AvatarEventType("CLICK_TO_OPEN_PHOTO", 1);
            CLICK_TO_OPEN_PHOTO = avatarEventType2;
            AvatarEventType avatarEventType3 = new AvatarEventType("DELETE_AVATAR", 2);
            DELETE_AVATAR = avatarEventType3;
            AvatarEventType avatarEventType4 = new AvatarEventType("CHANGE_AVATAR", 3);
            CHANGE_AVATAR = avatarEventType4;
            AvatarEventType avatarEventType5 = new AvatarEventType("CHANGE_AVATAR_GALLERY", 4);
            CHANGE_AVATAR_GALLERY = avatarEventType5;
            AvatarEventType avatarEventType6 = new AvatarEventType("CHANGE_AVATAR_CAMERA", 5);
            CHANGE_AVATAR_CAMERA = avatarEventType6;
            AvatarEventType avatarEventType7 = new AvatarEventType("SAVE_AVATAR", 6);
            SAVE_AVATAR = avatarEventType7;
            AvatarEventType avatarEventType8 = new AvatarEventType("CLICK_TO_VIEW_STORY", 7);
            CLICK_TO_VIEW_STORY = avatarEventType8;
            AvatarEventType avatarEventType9 = new AvatarEventType("CLICK_TO_CREATE_STORY", 8);
            CLICK_TO_CREATE_STORY = avatarEventType9;
            AvatarEventType[] avatarEventTypeArr = {avatarEventType, avatarEventType2, avatarEventType3, avatarEventType4, avatarEventType5, avatarEventType6, avatarEventType7, avatarEventType8, avatarEventType9};
            $VALUES = avatarEventTypeArr;
            $ENTRIES = new asp(avatarEventTypeArr);
        }

        private AvatarEventType(String str, int i) {
        }

        public static AvatarEventType valueOf(String str) {
            return (AvatarEventType) Enum.valueOf(AvatarEventType.class, str);
        }

        public static AvatarEventType[] values() {
            return (AvatarEventType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsProfileStat$AvatarEvent>, a9y<MobileOfficialAppsProfileStat$AvatarEvent> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("avatar_event_type");
            return new MobileOfficialAppsProfileStat$AvatarEvent((AvatarEventType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), AvatarEventType.class)), fai.C(x9yVar, "photo_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent = (MobileOfficialAppsProfileStat$AvatarEvent) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("avatar_event_type", tru.a().toJson(mobileOfficialAppsProfileStat$AvatarEvent.a()));
            x9yVar.o("photo_id", mobileOfficialAppsProfileStat$AvatarEvent.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$AvatarEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final AvatarEventType a() {
        return this.avatarEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$AvatarEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent = (MobileOfficialAppsProfileStat$AvatarEvent) obj;
        return this.avatarEventType == mobileOfficialAppsProfileStat$AvatarEvent.avatarEventType && epx.f(this.a, mobileOfficialAppsProfileStat$AvatarEvent.a);
    }

    public final int hashCode() {
        AvatarEventType avatarEventType = this.avatarEventType;
        int hashCode = (avatarEventType == null ? 0 : avatarEventType.hashCode()) * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarEvent(avatarEventType=");
        sb.append(this.avatarEventType);
        sb.append(", photoId=");
        return ho8.a(sb, this.a, ')');
    }

    public MobileOfficialAppsProfileStat$AvatarEvent(AvatarEventType avatarEventType, String str) {
        this.avatarEventType = avatarEventType;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredPhotoId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$AvatarEvent(AvatarEventType avatarEventType, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : avatarEventType, (i & 2) != 0 ? null : str);
    }
}
