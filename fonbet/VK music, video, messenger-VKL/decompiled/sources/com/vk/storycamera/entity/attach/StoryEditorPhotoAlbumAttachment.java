package com.vk.storycamera.entity.attach;

import com.vk.core.serialize.Serializer;
import com.vk.dto.photo.Photo;

/* compiled from: StoryEditorPhotoAlbumAttachment.kt */
/* loaded from: classes6.dex */
public final class StoryEditorPhotoAlbumAttachment extends StoryEditorAttach<Photo> {
    public static final Serializer.c<StoryEditorPhotoAlbumAttachment> CREATOR = new a();
    public final String e;
    public final int f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryEditorPhotoAlbumAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEditorPhotoAlbumAttachment a(Serializer serializer) {
            return new StoryEditorPhotoAlbumAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEditorPhotoAlbumAttachment[i];
        }
    }

    public StoryEditorPhotoAlbumAttachment(Photo photo, StoryEditorAttachPosition storyEditorAttachPosition, boolean z, String str, int i) {
        super(photo, storyEditorAttachPosition, z);
        this.e = str;
        this.f = i;
    }

    @Override // com.vk.storycamera.entity.attach.StoryEditorAttach, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.e);
        serializer.S(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryEditorPhotoAlbumAttachment(Serializer serializer) {
        this(r2, r3, r4, r0 == null ? "" : r0, serializer.u());
        Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
        StoryEditorAttachPosition storyEditorAttachPosition = (StoryEditorAttachPosition) serializer.G(StoryEditorAttachPosition.class.getClassLoader());
        boolean m = serializer.m();
        String H = serializer.H();
    }
}
