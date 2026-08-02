package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;

/* compiled from: NotificationEntity.kt */
/* loaded from: classes18.dex */
public final class NotificationEntity extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final NotificationAction d;
    public UserProfile e;
    public Group f;
    public Photo g;
    public VideoFile h;
    public NotificationImage i;
    public ApiApplication j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NotificationEntity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationEntity a(Serializer serializer) {
            return new NotificationEntity(serializer.H(), serializer.H(), (NotificationAction) serializer.G(NotificationAction.class.getClassLoader()), (UserProfile) serializer.G(UserProfile.class.getClassLoader()), (Group) serializer.G(Group.class.getClassLoader()), (Photo) serializer.G(Photo.class.getClassLoader()), (VideoFile) serializer.G(VideoFile.class.getClassLoader()), (NotificationImage) serializer.G(NotificationImage.class.getClassLoader()), (ApiApplication) serializer.G(ApiApplication.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationEntity[i];
        }
    }

    public NotificationEntity(String str, String str2, NotificationAction notificationAction, UserProfile userProfile, Group group, Photo photo, VideoFile videoFile, NotificationImage notificationImage, ApiApplication apiApplication) {
        this.b = str;
        this.c = str2;
        this.d = notificationAction;
        this.e = userProfile;
        this.f = group;
        this.g = photo;
        this.h = videoFile;
        this.i = notificationImage;
        this.j = apiApplication;
    }

    public final boolean Ab() {
        return "user".equals(this.b);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.i0(this.j);
    }

    public final boolean zb() {
        return "group".equals(this.b);
    }
}
