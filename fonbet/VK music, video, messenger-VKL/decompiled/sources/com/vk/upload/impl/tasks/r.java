package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PhotoPoll;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import org.json.JSONObject;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.xvb0;
import xsna.yvb0;

/* compiled from: PollPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class r extends oda0<PhotoPoll> {
    public final UserId m;
    public c.C1938c n;

    /* compiled from: PollPhotoUploadTask.kt */
    public static final class a extends k.a<r> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            r rVar = new r(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            rVar.d = ny90Var.c("task_id");
            return rVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            r rVar = (r) instantJob;
            super.b(rVar, ny90Var);
            ny90Var.n("owner_id", rVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(r rVar, ny90 ny90Var) {
            r rVar2 = rVar;
            super.b(rVar2, ny90Var);
            ny90Var.n("owner_id", rVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "PollPhotoUploadTask";
        }
    }

    public r(String str, UserId userId) {
        super(str, null, 6);
        this.m = userId;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        PhotoPoll photoPoll = (PhotoPoll) parcelable;
        ozg0.a().p(photoPoll != null ? Integer.valueOf(photoPoll.getId()) : null, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.n;
        if (c1938c != null) {
            return (PhotoPoll) rsg0.a0(new yvb0(c1938c.b, c1938c.c)).a();
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        xvb0 xvb0Var = new xvb0(this.m);
        this.g = xvb0Var.b;
        return rsg0.a0(xvb0Var);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.n = new c.C1938c(null, jSONObject.getString("photo"), jSONObject.getString("hash"));
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "PollPhotoUploadTask";
    }
}
