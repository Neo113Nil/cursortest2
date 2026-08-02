package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.video.dto.VideoGetPlaylistThumbUploadUrlTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.tasks.k;
import xsna.cd10;
import xsna.dz2;
import xsna.ful0;
import xsna.khc0;
import xsna.ncq0;
import xsna.nft0;
import xsna.ny90;
import xsna.oda0;
import xsna.rsg0;
import xsna.tfx;
import xsna.uft0;
import xsna.w8i;
import xsna.yfb;
import xsna.yga0;
import xsna.yul0;

/* compiled from: VideoAlbumCoverUploadTask.kt */
/* loaded from: classes11.dex */
public final class v extends oda0<Parcelable> implements w8i {
    public final UserId m;
    public final VideoGetPlaylistThumbUploadUrlTypeDto n;
    public final uft0 o;
    public String p;

    /* compiled from: VideoAlbumCoverUploadTask.kt */
    public static final class a extends k.a<v> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            v vVar = new v(new UserId(ny90Var.e("KEY_OWNER_ID")), ny90Var.f(DownloadModel.FILE_NAME));
            vVar.d = ny90Var.c("task_id");
            return vVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            v vVar = (v) instantJob;
            super.b(vVar, ny90Var);
            ny90Var.n("KEY_OWNER_ID", vVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(v vVar, ny90 ny90Var) {
            v vVar2 = vVar;
            super.b(vVar2, ny90Var);
            ny90Var.n("KEY_OWNER_ID", vVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "VideoAlbumCoverUploadTask";
        }
    }

    public v() {
        throw null;
    }

    public v(UserId userId, String str) {
        super(str, null, 4);
        this.m = userId;
        this.n = VideoGetPlaylistThumbUploadUrlTypeDto.DEFAULT;
        this.o = new uft0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.p;
        if (str == null) {
            return null;
        }
        this.o.getClass();
        tfx tfxVar = new tfx("video.savePlaylistThumb", new yul0(3), new ful0(4));
        tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
        tfx.o(tfxVar, "thumb_json", str, 0, 0, 12);
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        this.o.getClass();
        tfx tfxVar = new tfx("video.getPlaylistThumbUploadUrl", new yga0(8), new nft0(1));
        tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
        tfx.l(tfxVar, "type", this.n.i(), 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        this.g = x.b;
        return rsg0.a0(x).U(new khc0(new cd10(23), 11));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.p = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "VideoAlbumCoverUploadTask";
    }

    @Override // xsna.sp6
    public final void U(Exception exc) {
    }
}
