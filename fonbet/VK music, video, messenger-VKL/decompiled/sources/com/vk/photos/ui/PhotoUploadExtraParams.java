package com.vk.photos.ui;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: PhotoUploadExtraParams.kt */
/* loaded from: classes3.dex */
public final class PhotoUploadExtraParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PhotoUploadExtraParams> CREATOR = new a();
    public final int b;
    public final UserId c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PhotoUploadExtraParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoUploadExtraParams a(Serializer serializer) {
            return new PhotoUploadExtraParams(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoUploadExtraParams[i];
        }
    }

    public PhotoUploadExtraParams(int i, UserId userId) {
        this.b = i;
        this.c = userId;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
    }

    public PhotoUploadExtraParams(PhotoAlbum photoAlbum) {
        this(photoAlbum.b, photoAlbum.c);
    }
}
