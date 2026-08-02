package com.vk.upload.impl.tasks;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import io.reactivex.rxjava3.internal.operators.observable.w0;
import xsna.ncq0;
import xsna.ny90;

/* compiled from: DocumentUploadDirectUrlTask.kt */
/* loaded from: classes11.dex */
public final class h extends i {
    public final String p;
    public volatile String q;

    /* compiled from: DocumentUploadDirectUrlTask.kt */
    public static final class a extends k.a<h> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            h hVar = new h(new UserId(ny90Var.e("owner_id")), ny90Var.f(DownloadModel.FILE_NAME), ny90Var.f("direct_url"));
            hVar.d = ny90Var.c("task_id");
            return hVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            h hVar = (h) instantJob;
            super.b(hVar, ny90Var);
            ny90Var.n("owner_id", hVar.l.b);
            ny90Var.o("direct_url", hVar.p);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(h hVar, ny90 ny90Var) {
            h hVar2 = hVar;
            super.b(hVar2, ny90Var);
            ny90Var.n("owner_id", hVar2.l.b);
            ny90Var.o("direct_url", hVar2.p);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DocumentUploadDirectUrlTask";
        }
    }

    public h(UserId userId, String str, String str2) {
        super(str, userId, false, false);
        this.p = str2;
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        return new w0(new io.reactivex.rxjava3.functions.n() { // from class: xsna.oun
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return new ncq0(com.vk.upload.impl.tasks.h.this.p, null, null, null, null, 30);
            }
        });
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        this.q = str;
        super.g0(str);
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.instantjobs.InstantJob
    public final String s() {
        return "DocumentUploadDirectUrlTask";
    }
}
