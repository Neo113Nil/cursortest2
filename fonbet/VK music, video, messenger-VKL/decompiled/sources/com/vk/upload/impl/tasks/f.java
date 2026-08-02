package com.vk.upload.impl.tasks;

import android.content.Context;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bfa0;
import xsna.e43;
import xsna.mmq;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;

/* compiled from: CustomVirtualBackgroundUploadTask.kt */
/* loaded from: classes11.dex */
public final class f extends oda0<Photo> {
    public final UserId m;
    public String n;

    /* compiled from: CustomVirtualBackgroundUploadTask.kt */
    public static final class a extends k.a<f> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            f fVar = new f(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            fVar.d = ny90Var.c("task_id");
            return fVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            f fVar = (f) instantJob;
            super.b(fVar, ny90Var);
            ny90Var.n("owner_id", fVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(f fVar, ny90 ny90Var) {
            f fVar2 = fVar;
            super.b(fVar2, ny90Var);
            ny90Var.n("owner_id", fVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CustomVirtualBackgroundUploadTask";
        }
    }

    public f(String str, UserId userId) {
        super(str, null, 6);
        this.m = userId;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.n;
        if (str == null) {
            return null;
        }
        List list = (List) rsg0.a0(new mmq(str, 1)).a();
        if (list.isEmpty()) {
            return null;
        }
        return (Photo) list.get(0);
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
        bfa0 bfa0Var = new bfa0(this.m);
        this.g = bfa0Var.b;
        return rsg0.a0(bfa0Var);
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        return null;
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        this.n = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CustomVirtualBackgroundUploadTask";
    }
}
