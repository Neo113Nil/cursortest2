package com.vk.clips.uploader.api.model;

import android.os.Parcelable;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import java.io.File;
import java.io.Serializable;
import xsna.epx;
import xsna.qoy;

/* compiled from: ClipUploadTaskParams.kt */
/* loaded from: classes17.dex */
public final class b {
    public final int a;
    public final ClipUploaderData.Author b;
    public final ClipsEncoderParameters c;
    public final ClipUploaderParams d;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem e;
    public final boolean f;
    public final File g;
    public final Serializable h;
    public final Parcelable i;

    public b(int i, ClipUploaderData.Author author, ClipsEncoderParameters clipsEncoderParameters, ClipUploaderParams clipUploaderParams, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, boolean z, File file, Serializable serializable, Parcelable parcelable) {
        this.a = i;
        this.b = author;
        this.c = clipsEncoderParameters;
        this.d = clipUploaderParams;
        this.e = mobileOfficialAppsClipsStat$TypeClipUploadItem;
        this.f = z;
        this.g = file;
        this.h = serializable;
        this.i = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        ClipUploaderData.Author author = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (author == null ? 0 : author.hashCode())) * 31)) * 31;
        ClipUploaderParams clipUploaderParams = this.d;
        int hashCode3 = (hashCode2 + (clipUploaderParams == null ? 0 : clipUploaderParams.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = this.e;
        int b = qoy.b((hashCode3 + (mobileOfficialAppsClipsStat$TypeClipUploadItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipUploadItem.hashCode())) * 31, 31, this.f);
        File file = this.g;
        int hashCode4 = (b + (file == null ? 0 : file.hashCode())) * 31;
        Serializable serializable = this.h;
        int hashCode5 = (hashCode4 + (serializable == null ? 0 : serializable.hashCode())) * 31;
        Parcelable parcelable = this.i;
        return hashCode5 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        return "ClipUploadTaskParams(id=" + this.a + ", author=" + this.b + ", encodingParams=" + this.c + ", uploadingParams=" + this.d + ", analyticsData=" + this.e + ", unlockedForUpload=" + this.f + ", clientProcessorOutput=" + this.g + ", extraSerializableData=" + this.h + ", extraParcelableData=" + this.i + ')';
    }
}
