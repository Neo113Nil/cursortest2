package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aha0;
import xsna.bwi;
import xsna.dz2;
import xsna.e43;
import xsna.f9t;
import xsna.fj1;
import xsna.fkq0;
import xsna.ncq0;
import xsna.ny90;
import xsna.o25;
import xsna.o3u;
import xsna.oda0;
import xsna.ozg0;
import xsna.r41;
import xsna.rsg0;
import xsna.ve0;
import xsna.yfb;
import xsna.zga0;

/* compiled from: AlbumPhotoUploadTaskGU.kt */
/* loaded from: classes11.dex */
public final class b extends oda0<Photo> {
    public final UserId m;
    public final int n;
    public final UserId o;
    public final String p;
    public final boolean q;
    public final aha0 r;
    public String s;

    /* compiled from: AlbumPhotoUploadTaskGU.kt */
    public static final class a extends k.a<b> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            b bVar = new b(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("user_id")), ny90Var.c("video_id"), new UserId(ny90Var.e("owner_id")), ny90Var.f("description"), ny90Var.a("notify"));
            bVar.d = ny90Var.c("task_id");
            return bVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(b bVar, ny90 ny90Var) {
            super.b(bVar, ny90Var);
            ny90Var.n("user_id", bVar.m.b);
            ny90Var.o("description", bVar.p);
            ny90Var.n("owner_id", bVar.o.b);
            ny90Var.l("video_id", bVar.n);
            ny90Var.j("notify", bVar.q);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "AlbumPhotoUploadTask";
        }
    }

    public b(String str, UserId userId, int i, UserId userId2, String str2, boolean z) {
        super(str, "file1", 2);
        this.m = userId;
        this.n = i;
        this.o = userId2;
        this.p = str2;
        this.q = z;
        this.r = f9t.d();
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        c.b.a(photo);
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        if (this.s == null) {
            return null;
        }
        UserId userId = this.o;
        UserId e = fkq0.b(userId) ? fkq0.e(userId) : null;
        dz2 x = yfb.x(zga0.e(this.r, Integer.valueOf(this.n), e, this.s));
        String s = o25.a().s(this.m);
        if (s != null) {
            x.l = s;
            x.m = "";
        }
        return (Photo) rsg0.a0(x).U(new com.vk.movika.sdk.base.ui.j(new fj1(0), 2)).a();
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_photo);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        Integer valueOf = Integer.valueOf(this.n);
        UserId userId = this.o;
        dz2 x = yfb.x(this.r.t(fkq0.b(userId) ? fkq0.e(userId) : null, valueOf));
        String s = o25.a().s(this.m);
        if (s != null) {
            x.l = s;
            x.m = "";
        }
        this.g = x.b;
        return rsg0.a0(x).U(new r41(new ve0(1), 1));
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
                this.s = str;
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
        return "AlbumPhotoUploadTask";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean x() {
        return false;
    }
}
