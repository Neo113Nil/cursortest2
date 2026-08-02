package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.tasks.k;
import xsna.bpn0;
import xsna.bwi;
import xsna.e43;
import xsna.ncq0;
import xsna.nd6;
import xsna.ny90;
import xsna.o3u;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.tvj;
import xsna.vu50;
import xsna.w8i;

/* compiled from: HighlightCustomCoverUploadTask.kt */
/* loaded from: classes11.dex */
public final class l extends oda0<Photo> implements w8i {
    public final UserId m;
    public volatile String n;
    public final bpn0 o;

    /* compiled from: HighlightCustomCoverUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class a extends nd6 {
        public a(UserId userId) {
            super("narratives.getCustomCoverUploadServer");
            F(userId, "owner_id");
        }
    }

    /* compiled from: HighlightCustomCoverUploadTask.kt */
    public static final class b extends k.a<l> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            l lVar = new l(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            lVar.d = ny90Var.c("task_id");
            return lVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            l lVar = (l) instantJob;
            super.b(lVar, ny90Var);
            ny90Var.n("owner_id", lVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(l lVar, ny90 ny90Var) {
            l lVar2 = lVar;
            super.b(lVar2, ny90Var);
            ny90Var.n("owner_id", lVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "HighlightCustomCoverUploadTask";
        }
    }

    public l(String str, UserId userId) {
        super(str, X3.i.b, 2);
        this.m = userId;
        this.o = new bpn0(new tvj(this, 13));
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.n;
        if (str != null) {
            return ((vu50) this.o.getValue()).e(str).a();
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        a aVar = new a(this.m);
        this.g = aVar.b;
        return rsg0.a0(aVar);
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        boolean b2 = ozg0.a().b();
        String str = this.i;
        if (!b2) {
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
        this.n = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "HighlightCustomCoverUploadTask";
    }
}
