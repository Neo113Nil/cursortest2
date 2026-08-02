package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import xsna.dz2;
import xsna.f9t;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.tc;
import xsna.u5;
import xsna.vr0;
import xsna.yfb;
import xsna.zj0;

/* compiled from: CommunityReviewsPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class e extends oda0<Photo> {
    public final UserId m;
    public String n;

    /* compiled from: CommunityReviewsPhotoUploadTask.kt */
    public static final class a extends k.a<e> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            e eVar = new e(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("group_id")));
            eVar.d = ny90Var.c("task_id");
            return eVar;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CommunityReviewsPhotoUploadTask";
        }
    }

    public e(String str, UserId userId) {
        super(str, null, 6);
        this.m = userId;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        c.b.a(photo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.n;
        if (str != null) {
            return (Photo) rsg0.a0(yfb.x(f9t.d().u(this.m, str))).U(new zj0(new vr0(24), 9)).a();
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dz2 x = yfb.x(f9t.d().q());
        this.g = x.b;
        return rsg0.a0(x).U(new u5(new tc(17), 9));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.n = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CommunityReviewsPhotoUploadTask";
    }
}
