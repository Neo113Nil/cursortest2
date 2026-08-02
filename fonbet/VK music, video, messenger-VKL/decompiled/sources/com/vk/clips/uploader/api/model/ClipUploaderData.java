package com.vk.clips.uploader.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import xsna.epx;
import xsna.fkq0;
import xsna.gp;
import xsna.i5s;
import xsna.zcl;

/* compiled from: ClipUploaderData.kt */
/* loaded from: classes17.dex */
public final class ClipUploaderData {
    public final ClipsEncoderParameters a;
    public final ClipUploaderParams b;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem c;
    public final Author d;
    public final String e;

    /* compiled from: ClipUploaderData.kt */
    public static abstract class Author implements Parcelable {

        /* compiled from: ClipUploaderData.kt */
        public static final class ExternalGroup extends Author {
            public static final Parcelable.Creator<ExternalGroup> CREATOR = new a();
            public final UserId b;
            public final UserId c;

            /* compiled from: ClipUploaderData.kt */
            public static final class a implements Parcelable.Creator<ExternalGroup> {
                @Override // android.os.Parcelable.Creator
                public final ExternalGroup createFromParcel(Parcel parcel) {
                    return new ExternalGroup((UserId) parcel.readParcelable(ExternalGroup.class.getClassLoader()), (UserId) parcel.readParcelable(ExternalGroup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExternalGroup[] newArray(int i) {
                    return new ExternalGroup[i];
                }
            }

            public ExternalGroup(UserId userId, UserId userId2) {
                super(null);
                this.b = userId;
                this.c = userId2;
            }

            @Override // com.vk.clips.uploader.api.model.ClipUploaderData.Author
            public final UserId d() {
                return this.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExternalGroup)) {
                    return false;
                }
                ExternalGroup externalGroup = (ExternalGroup) obj;
                return epx.f(this.b, externalGroup.b) && epx.f(this.c, externalGroup.c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b) + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ExternalGroup(id=");
                sb.append(this.b);
                sb.append(", vkUserId=");
                return gp.b(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
            }
        }

        /* compiled from: ClipUploaderData.kt */
        public static final class VkGroup extends Author {
            public static final Parcelable.Creator<VkGroup> CREATOR = new a();
            public final UserId b;

            /* compiled from: ClipUploaderData.kt */
            public static final class a implements Parcelable.Creator<VkGroup> {
                @Override // android.os.Parcelable.Creator
                public final VkGroup createFromParcel(Parcel parcel) {
                    return new VkGroup((UserId) parcel.readParcelable(VkGroup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final VkGroup[] newArray(int i) {
                    return new VkGroup[i];
                }
            }

            public VkGroup(UserId userId) {
                super(null);
                this.b = userId;
            }

            @Override // com.vk.clips.uploader.api.model.ClipUploaderData.Author
            public final UserId d() {
                return this.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VkGroup) && epx.f(this.b, ((VkGroup) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("VkGroup(id="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: ClipUploaderData.kt */
        public static final class VkUser extends Author {
            public static final Parcelable.Creator<VkUser> CREATOR = new a();
            public final UserId b;

            /* compiled from: ClipUploaderData.kt */
            public static final class a implements Parcelable.Creator<VkUser> {
                @Override // android.os.Parcelable.Creator
                public final VkUser createFromParcel(Parcel parcel) {
                    return new VkUser((UserId) parcel.readParcelable(VkUser.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final VkUser[] newArray(int i) {
                    return new VkUser[i];
                }
            }

            public VkUser(UserId userId) {
                super(null);
                this.b = userId;
            }

            @Override // com.vk.clips.uploader.api.model.ClipUploaderData.Author
            public final UserId d() {
                return this.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VkUser) && epx.f(this.b, ((VkUser) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("VkUser(id="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        public /* synthetic */ Author(zcl zclVar) {
            this();
        }

        public abstract UserId d();

        public final UserId e() {
            return this instanceof VkGroup ? fkq0.e(((VkGroup) this).b) : d();
        }

        public Author() {
        }
    }

    public ClipUploaderData(ClipsEncoderParameters clipsEncoderParameters, ClipUploaderParams clipUploaderParams, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, Author author, String str) {
        this.a = clipsEncoderParameters;
        this.b = clipUploaderParams;
        this.c = mobileOfficialAppsClipsStat$TypeClipUploadItem;
        this.d = author;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploaderData)) {
            return false;
        }
        ClipUploaderData clipUploaderData = (ClipUploaderData) obj;
        return epx.f(this.a, clipUploaderData.a) && this.b.equals(clipUploaderData.b) && this.c.equals(clipUploaderData.c) && this.d.equals(clipUploaderData.d) && epx.f(this.e, clipUploaderData.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return (hashCode + (str == null ? 0 : str.hashCode())) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploaderData(encoderParams=");
        sb.append(this.a);
        sb.append(", uploaderParams=");
        sb.append(this.b);
        sb.append(", analyticsData=");
        sb.append(this.c);
        sb.append(", author=");
        sb.append(this.d);
        sb.append(", draftId=");
        return i5s.a(sb, this.e, ", extraSerializableData=null, extraParcelableData=null)");
    }
}
