package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.SaveCustomPosterResponse;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.tasks.k;
import xsna.ffa0;
import xsna.mns0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.rsg0;

/* compiled from: PosterImageUploadTask.kt */
/* loaded from: classes11.dex */
public final class s extends oda0<SaveCustomPosterResponse> {
    public final UserId m;
    public final int n;
    public String o;

    /* compiled from: PosterImageUploadTask.kt */
    public static final class a extends k.a<s> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            s sVar = new s(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("ownerId")), ny90Var.c("textColor"), ny90Var.f("serverString"));
            sVar.d = ny90Var.c("task_id");
            return sVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(s sVar, ny90 ny90Var) {
            super.b(sVar, ny90Var);
            ny90Var.n("ownerId", sVar.m.b);
            ny90Var.l("textColor", sVar.n);
            String str = sVar.o;
            if (str == null) {
                str = "";
            }
            ny90Var.o("serverString", str);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "PosterImageUploadTask";
        }
    }

    public s(String str, UserId userId, int i, String str2) {
        super(str, null, 6);
        this.m = userId;
        this.n = i;
        this.o = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.o;
        if (str == null || str.length() == 0) {
            return null;
        }
        return (SaveCustomPosterResponse) rsg0.a0(new mns0(this.n, this.m, str)).a();
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        ffa0 ffa0Var = new ffa0(this.m);
        this.g = ffa0Var.b;
        return rsg0.a0(ffa0Var);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.o = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "PosterImageUploadTask";
    }
}
