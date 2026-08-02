package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.internal.api.GsonHolder;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aha0;
import xsna.bwi;
import xsna.c5g;
import xsna.dz2;
import xsna.e43;
import xsna.f9t;
import xsna.fkq0;
import xsna.hhj0;
import xsna.j5g;
import xsna.mmw0;
import xsna.ncq0;
import xsna.ny90;
import xsna.o3u;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.yfb;
import xsna.zga0;

/* compiled from: WallPhotoUploadTaskGU.kt */
/* loaded from: classes11.dex */
public final class x extends oda0<PhotoAttachment> {
    public final UserId m;
    public final aha0 n;
    public String o;

    /* compiled from: WallPhotoUploadTaskGU.kt */
    public static final class a extends k.a<x> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            x xVar = new x(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            xVar.d = ny90Var.c("task_id");
            return xVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            x xVar = (x) instantJob;
            super.b(xVar, ny90Var);
            ny90Var.n("owner_id", xVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(x xVar, ny90 ny90Var) {
            x xVar2 = xVar;
            super.b(xVar2, ny90Var);
            ny90Var.n("owner_id", xVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "WallPhotoUploadTask";
        }
    }

    public x(String str, UserId userId) {
        super(str, "file1", 2);
        this.m = userId;
        this.n = f9t.d();
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo;
        PhotoAttachment photoAttachment = (PhotoAttachment) parcelable;
        ozg0.a().p((photoAttachment == null || (photo = photoAttachment.l) == null) ? null : Integer.valueOf(photo.c), this.i);
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.o;
        if (str == null) {
            return null;
        }
        UserId userId = this.m;
        Iterable iterable = (Iterable) rsg0.a0(yfb.x(zga0.k(this.n, str, null, fkq0.b(userId) ? fkq0.e(userId) : null, null, null, Boolean.TRUE, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE))).a();
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new PhotoAttachment(new Photo(new JSONObject(GsonHolder.a().toJson((PhotosPhotoDto) it.next())))));
        }
        return (PhotoAttachment) j5g.a0(arrayList);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        UserId userId = this.m;
        dz2 x = yfb.x(this.n.d(fkq0.b(userId) ? fkq0.e(userId) : null, Boolean.TRUE));
        this.g = x.b;
        return rsg0.a0(x).U(new hhj0(new mmw0(2), 12));
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        boolean b = ozg0.a().b();
        String str = this.i;
        if (!b) {
            return new o3u(str).a();
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new bwi(context, false).a(Uri.parse(str));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        VKApiExecutionException a2;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("files").getJSONObject("file1");
            if (!jSONObject.has("error_code")) {
                this.o = str;
            } else {
                int i = VKApiExecutionException.b;
                a2 = VKApiExecutionException.a.a(jSONObject, (r2 & 2) != 0 ? null : "/v2/bulk_upload", null);
                throw a2;
            }
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "WallPhotoUploadTask";
    }
}
