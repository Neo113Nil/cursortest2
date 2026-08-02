package com.vk.upload.impl.tasks;

import android.content.Context;
import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;
import xsna.hfa0;
import xsna.ncq0;
import xsna.ny90;
import xsna.o25;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.sf2;
import xsna.sga0;

/* compiled from: AlbumPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class a extends oda0<Photo> {
    public final UserId m;
    public final int n;
    public final UserId o;
    public final String p;
    public final boolean q;
    public c.C1938c r;

    /* compiled from: AlbumPhotoUploadTask.kt */
    /* renamed from: com.vk.upload.impl.tasks.a$a, reason: collision with other inner class name */
    public static final class C1939a extends k.a<a> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            a aVar = new a(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("user_id")), ny90Var.c("video_id"), new UserId(ny90Var.e("owner_id")), ny90Var.f("description"), ny90Var.a("notify"));
            aVar.d = ny90Var.c("task_id");
            return aVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(a aVar, ny90 ny90Var) {
            super.b(aVar, ny90Var);
            ny90Var.n("user_id", aVar.m.b);
            ny90Var.o("description", aVar.p);
            ny90Var.n("owner_id", aVar.o.b);
            ny90Var.l("video_id", aVar.n);
            ny90Var.j("notify", aVar.q);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "AlbumPhotoUploadTask";
        }
    }

    public a(String str, UserId userId, int i, UserId userId2, String str2, boolean z) {
        super(str, null, 6);
        this.m = userId;
        this.n = i;
        this.o = userId2;
        this.p = str2;
        this.q = z;
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

    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.r;
        if (c1938c == null) {
            return null;
        }
        sga0 sga0Var = new sga0(c1938c.a, c1938c.b, c1938c.c, this.n, this.o, this.p);
        String s = o25.a().s(this.m);
        if (s != null) {
            sga0Var.B(s, "");
        }
        List list = (List) rsg0.a0(sga0Var).a();
        if (list.size() > 0) {
            return (Photo) list.get(0);
        }
        return null;
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
        hfa0 hfa0Var = new hfa0(this.n, this.o);
        String s = o25.a().s(this.m);
        if (s != null) {
            hfa0Var.B(s, "");
        }
        this.g = hfa0Var.b;
        return rsg0.a0(hfa0Var);
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        return ozg0.a().b() ? super.f0() : new sf2(this.i).b();
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.r = new c.C1938c(jSONObject.getString(Hb.a), jSONObject.getString("photos_list"), jSONObject.getString("hash"));
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
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
