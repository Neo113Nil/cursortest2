package com.vk.clips.uploader.impl.model;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploadStatus;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import java.io.Serializable;
import xsna.epx;

/* compiled from: ClipUploadJobInternal.kt */
/* loaded from: classes17.dex */
public final class ClipUploadJobInternal extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClipUploadJobInternal> CREATOR = new a();
    public final ClipUploadJob b;
    public final ClipsEncoderParameters c;
    public final ClipUploaderParams d;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem e;
    public final ClipUploadStatus f;
    public final DraftRef g;
    public final String h;
    public final Serializable i;
    public final Parcelable j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipUploadJobInternal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipUploadJobInternal a(Serializer serializer) {
            return new ClipUploadJobInternal((ClipUploadJob) serializer.A(ClipUploadJob.class.getClassLoader()), (ClipsEncoderParameters) serializer.A(ClipsEncoderParameters.class.getClassLoader()), (ClipUploaderParams) serializer.A(ClipUploaderParams.class.getClassLoader()), (MobileOfficialAppsClipsStat$TypeClipUploadItem) new Gson().fromJson(serializer.H(), MobileOfficialAppsClipsStat$TypeClipUploadItem.class), (ClipUploadStatus) serializer.A(ClipUploadStatus.class.getClassLoader()), (DraftRef) serializer.G(DraftRef.class.getClassLoader()), serializer.H(), serializer.C(), serializer.A(Parcelable.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipUploadJobInternal[i];
        }
    }

    public ClipUploadJobInternal(ClipUploadJob clipUploadJob, ClipsEncoderParameters clipsEncoderParameters, ClipUploaderParams clipUploaderParams, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, ClipUploadStatus clipUploadStatus, DraftRef draftRef, String str, Serializable serializable, Parcelable parcelable) {
        this.b = clipUploadJob;
        this.c = clipsEncoderParameters;
        this.d = clipUploaderParams;
        this.e = mobileOfficialAppsClipsStat$TypeClipUploadItem;
        this.f = clipUploadStatus;
        this.g = draftRef;
        this.h = str;
        this.i = serializable;
        this.j = parcelable;
    }

    public static ClipUploadJobInternal zb(ClipUploadJobInternal clipUploadJobInternal, ClipUploadJob clipUploadJob, ClipsEncoderParameters clipsEncoderParameters, ClipUploaderParams clipUploaderParams, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, ClipUploadStatus clipUploadStatus, DraftRef draftRef, String str, int i) {
        if ((i & 1) != 0) {
            clipUploadJob = clipUploadJobInternal.b;
        }
        ClipUploadJob clipUploadJob2 = clipUploadJob;
        if ((i & 2) != 0) {
            clipsEncoderParameters = clipUploadJobInternal.c;
        }
        ClipsEncoderParameters clipsEncoderParameters2 = clipsEncoderParameters;
        if ((i & 4) != 0) {
            clipUploaderParams = clipUploadJobInternal.d;
        }
        ClipUploaderParams clipUploaderParams2 = clipUploaderParams;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem2 = (i & 8) != 0 ? clipUploadJobInternal.e : mobileOfficialAppsClipsStat$TypeClipUploadItem;
        ClipUploadStatus clipUploadStatus2 = (i & 16) != 0 ? clipUploadJobInternal.f : clipUploadStatus;
        DraftRef draftRef2 = (i & 32) != 0 ? clipUploadJobInternal.g : draftRef;
        String str2 = (i & 64) != 0 ? clipUploadJobInternal.h : str;
        Serializable serializable = (i & 128) != 0 ? clipUploadJobInternal.i : null;
        Parcelable parcelable = (i & 256) != 0 ? clipUploadJobInternal.j : null;
        clipUploadJobInternal.getClass();
        return new ClipUploadJobInternal(clipUploadJob2, clipsEncoderParameters2, clipUploaderParams2, mobileOfficialAppsClipsStat$TypeClipUploadItem2, clipUploadStatus2, draftRef2, str2, serializable, parcelable);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
        serializer.e0(this.d);
        serializer.j0(new Gson().toJson(this.e).toString());
        serializer.e0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.g0(this.i);
        serializer.e0(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploadJobInternal)) {
            return false;
        }
        ClipUploadJobInternal clipUploadJobInternal = (ClipUploadJobInternal) obj;
        return epx.f(this.b, clipUploadJobInternal.b) && epx.f(this.c, clipUploadJobInternal.c) && epx.f(this.d, clipUploadJobInternal.d) && epx.f(this.e, clipUploadJobInternal.e) && epx.f(this.f, clipUploadJobInternal.f) && epx.f(this.g, clipUploadJobInternal.g) && epx.f(this.h, clipUploadJobInternal.h) && epx.f(this.i, clipUploadJobInternal.i) && epx.f(this.j, clipUploadJobInternal.j);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        ClipUploaderParams clipUploaderParams = this.d;
        int hashCode2 = (hashCode + (clipUploaderParams == null ? 0 : clipUploaderParams.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (mobileOfficialAppsClipsStat$TypeClipUploadItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipUploadItem.hashCode())) * 31)) * 31;
        DraftRef draftRef = this.g;
        int hashCode4 = (hashCode3 + (draftRef == null ? 0 : draftRef.hashCode())) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Serializable serializable = this.i;
        int hashCode6 = (hashCode5 + (serializable == null ? 0 : serializable.hashCode())) * 31;
        Parcelable parcelable = this.j;
        return hashCode6 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        return "ClipUploadJobInternal(upload=" + this.b + ", encodingParams=" + this.c + ", uploadingParams=" + this.d + ", analyticsData=" + this.e + ", lastStatus=" + this.f + ", draftRef=" + this.g + ", uploadLinkId=" + this.h + ", extraSerializableData=" + this.i + ", extraParcelableData=" + this.j + ')';
    }
}
