package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.tasks.k;
import xsna.ao90;
import xsna.b690;
import xsna.dz2;
import xsna.fyp0;
import xsna.l5r0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ohl0;
import xsna.rsg0;
import xsna.tfx;
import xsna.yfb;
import xsna.yul0;

/* compiled from: VideoCoverUploadTask.kt */
/* loaded from: classes11.dex */
public final class w extends oda0<Parcelable> {
    public final UserId m;
    public final int n;
    public String o;

    /* compiled from: VideoCoverUploadTask.kt */
    public static final class a extends k.a<w> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            w wVar = new w(new UserId(ny90Var.e("KEY_OWNER_ID")), ny90Var.c("KEY_VIDEO_ID"), ny90Var.f(DownloadModel.FILE_NAME));
            wVar.d = ny90Var.c("task_id");
            return wVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            w wVar = (w) instantJob;
            super.b(wVar, ny90Var);
            ny90Var.n("KEY_OWNER_ID", wVar.m.b);
            ny90Var.l("KEY_VIDEO_ID", wVar.n);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(w wVar, ny90 ny90Var) {
            w wVar2 = wVar;
            super.b(wVar2, ny90Var);
            ny90Var.n("KEY_OWNER_ID", wVar2.m.b);
            ny90Var.l("KEY_VIDEO_ID", wVar2.n);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "VideoCoverUploadTask";
        }
    }

    public w(UserId userId, int i, String str) {
        super(str, null, 6);
        this.m = userId;
        this.n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.o;
        if (str != null) {
            tfx tfxVar = new tfx("video.saveUploadedThumb", new b690(9), new ohl0(4));
            tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
            tfx.o(tfxVar, "thumb_json", str, 0, 0, 12);
            tfx.l(tfxVar, "video_id", this.n, 1, 0, 8);
            tfxVar.j("set_thumb", true);
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        tfx tfxVar = new tfx("video.getThumbUploadUrl", new yul0(4), new fyp0(4));
        tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
        dz2 x = yfb.x(tfxVar);
        this.g = x.b;
        return rsg0.a0(x).U(new ao90(new l5r0(3), 8));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.o = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "VideoCoverUploadTask";
    }
}
