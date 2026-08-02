package com.vk.upload.impl.tasks;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.core.utils.WrongFileUploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import org.json.JSONObject;
import xsna.e43;
import xsna.fun;
import xsna.ncq0;
import xsna.ny90;
import xsna.rsg0;
import xsna.vtn;
import xsna.wtn;

/* compiled from: DocumentUploadTask.kt */
/* loaded from: classes11.dex */
public class i extends k<DocumentAttachment> {
    public final UserId l;
    public final boolean m;
    public final boolean n;
    public String o;

    /* compiled from: DocumentUploadTask.kt */
    public static final class a extends k.a<i> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            i iVar = new i(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")), ny90Var.a("need_wall"), ny90Var.a("do_notify"));
            iVar.d = ny90Var.c("task_id");
            return iVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            i iVar = (i) instantJob;
            super.b(iVar, ny90Var);
            ny90Var.n("owner_id", iVar.l.b);
            ny90Var.j("need_wall", iVar.m);
            ny90Var.j("do_notify", iVar.n);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(i iVar, ny90 ny90Var) {
            i iVar2 = iVar;
            super.b(iVar2, ny90Var);
            ny90Var.n("owner_id", iVar2.l.b);
            ny90Var.j("need_wall", iVar2.m);
            ny90Var.j("do_notify", iVar2.n);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DocumentUploadTask";
        }
    }

    public i(String str, UserId userId, boolean z, boolean z2) {
        super(str);
        this.l = userId;
        this.m = z;
        this.n = z2;
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.n;
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
    public io.reactivex.rxjava3.core.q<ncq0> b0() {
        vtn vtnVar = new vtn(this.l, this.m);
        this.g = vtnVar.b;
        return rsg0.a0(vtnVar);
    }

    @Override // com.vk.upload.impl.tasks.k
    public void g0(String str) throws UploadException {
        WrongFileUploadException wrongFileUploadException = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("error");
            if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "wrong_file")) {
                wrongFileUploadException = new WrongFileUploadException("can't parse upload response " + optString);
            }
            this.o = jSONObject.getString(X3.i.b);
        } catch (Exception e) {
            if (wrongFileUploadException == null) {
                throw new UploadException("can't parse upload response", str, e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public DocumentAttachment Y() {
        String str = this.o;
        if (str == null) {
            return null;
        }
        return new DocumentAttachment(((fun) rsg0.a0(wtn.b.b(str)).a()).a());
    }

    @Override // com.vk.instantjobs.InstantJob
    public String s() {
        return "DocumentUploadTask";
    }
}
