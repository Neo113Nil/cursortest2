package com.vk.upload.impl.tasks;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.bdu;
import xsna.drm0;
import xsna.e43;
import xsna.ncq0;
import xsna.ny90;
import xsna.rsg0;
import xsna.vhk0;
import xsna.vtn;
import xsna.wtn;

/* compiled from: GraffitiUploadTask.kt */
/* loaded from: classes11.dex */
public final class j extends k<GraffitiAttachment> {
    public final UserId l;
    public String m;
    public final int n;

    /* compiled from: GraffitiUploadTask.kt */
    public static final class a extends k.a<j> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            j jVar = new j(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            jVar.d = ny90Var.c("task_id");
            return jVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            j jVar = (j) instantJob;
            super.b(jVar, ny90Var);
            ny90Var.n("owner_id", jVar.l.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(j jVar, ny90 ny90Var) {
            j jVar2 = jVar;
            super.b(jVar2, ny90Var);
            ny90Var.n("owner_id", jVar2.l.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "GraffitiUploadTask";
        }
    }

    public j(String str, UserId userId) {
        super(str);
        this.l = userId;
        this.n = 3;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        String str = this.i;
        if (TextUtils.isEmpty(str) || !drm0.D(str, ".vkontakte/GRAF_", false)) {
            return;
        }
        Regex regex = com.vk.core.files.a.a;
        vhk0.c(str);
    }

    @Override // xsna.sp6
    public final int O() {
        return this.n;
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.m;
        if (str == null) {
            return null;
        }
        Document a2 = ((bdu) rsg0.a0(wtn.b.c(str)).a()).a();
        GraffitiAttachment.Db(a2.b, a2.h, this.i);
        return new GraffitiAttachment(a2);
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_document);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        vtn vtnVar = new vtn(this.l, "graffiti");
        this.g = vtnVar.b;
        return rsg0.a0(vtnVar);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            this.m = new JSONObject(str).getString(X3.i.b);
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "GraffitiUploadTask";
    }
}
