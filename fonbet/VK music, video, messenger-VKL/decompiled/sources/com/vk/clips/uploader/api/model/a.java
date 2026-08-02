package com.vk.clips.uploader.api.model;

import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import xsna.epx;

/* compiled from: ClipUploadRequestParams.kt */
/* loaded from: classes17.dex */
public final class a {
    public final ClipUploaderData.Author a;
    public final ClipUploaderParams b;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem c;

    public a(ClipUploaderData.Author author, ClipUploaderParams clipUploaderParams, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem) {
        this.a = author;
        this.b = clipUploaderParams;
        this.c = mobileOfficialAppsClipsStat$TypeClipUploadItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ClipUploaderParams clipUploaderParams = this.b;
        int hashCode2 = (hashCode + (clipUploaderParams == null ? 0 : clipUploaderParams.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = this.c;
        return hashCode2 + (mobileOfficialAppsClipsStat$TypeClipUploadItem != null ? mobileOfficialAppsClipsStat$TypeClipUploadItem.hashCode() : 0);
    }

    public final String toString() {
        return "ClipUploadRequestParams(author=" + this.a + ", uploadingParams=" + this.b + ", analyticsData=" + this.c + ')';
    }
}
