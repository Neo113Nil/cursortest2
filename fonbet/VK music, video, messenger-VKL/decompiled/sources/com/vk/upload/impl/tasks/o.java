package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.attachments.PhotoAttachment;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dfa0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.tga0;

/* compiled from: MessagesPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class o extends oda0<PhotoAttachment> {
    public c.C1938c m;

    /* compiled from: MessagesPhotoUploadTask.kt */
    public static final class a extends k.a<o> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            o oVar = new o(ny90Var.f(DownloadModel.FILE_NAME));
            oVar.d = ny90Var.c("task_id");
            return oVar;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MessagesPhotoUploadTask";
        }
    }

    public o(String str) {
        super(str, null, 6);
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo;
        PhotoAttachment photoAttachment = (PhotoAttachment) parcelable;
        ozg0.a().p((photoAttachment == null || (photo = photoAttachment.l) == null) ? null : Integer.valueOf(photo.c), this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.m;
        if (c1938c != null) {
            return (PhotoAttachment) rsg0.a0(new tga0(c1938c.a, c1938c.b, c1938c.c)).a();
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dfa0 dfa0Var = new dfa0();
        this.g = dfa0Var.b;
        return rsg0.a0(dfa0Var);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.m = new c.C1938c(jSONObject.getString(Hb.a), jSONObject.getString("photo"), jSONObject.getString("hash"));
        } catch (JSONException e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MessagesPhotoUploadTask";
    }
}
