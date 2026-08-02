package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.epx;
import xsna.vu5;

/* compiled from: TagConfirmation.kt */
/* loaded from: classes18.dex */
public final class TagConfirmation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<TagConfirmation> CREATOR = new a();
    public final PhotoAttachment b;
    public final UserProfile c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TagConfirmation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TagConfirmation a(Serializer serializer) {
            return new TagConfirmation((PhotoAttachment) serializer.G(PhotoAttachment.class.getClassLoader()), (UserProfile) serializer.G(UserProfile.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagConfirmation[i];
        }
    }

    public TagConfirmation(PhotoAttachment photoAttachment, UserProfile userProfile, int i) {
        this.b = photoAttachment;
        this.c = userProfile;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagConfirmation)) {
            return false;
        }
        TagConfirmation tagConfirmation = (TagConfirmation) obj;
        return epx.f(this.b, tagConfirmation.b) && epx.f(this.c, tagConfirmation.c) && this.d == tagConfirmation.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        UserProfile userProfile = this.c;
        return Integer.hashCode(this.d) + ((hashCode + (userProfile == null ? 0 : userProfile.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagConfirmation(photo=");
        sb.append(this.b);
        sb.append(", placer=");
        sb.append(this.c);
        sb.append(", tagId=");
        return vu5.b(sb, this.d, ')');
    }
}
