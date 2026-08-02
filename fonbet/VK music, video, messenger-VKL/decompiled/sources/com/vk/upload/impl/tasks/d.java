package com.vk.upload.impl.tasks;

import android.content.Context;
import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.music.MusicTrack;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.e43;
import xsna.kp4;
import xsna.ncq0;
import xsna.ny90;
import xsna.rsg0;
import xsna.yw4;

/* compiled from: AudioUploadTask.kt */
/* loaded from: classes11.dex */
public final class d extends k<MusicTrack> {
    public final boolean l;
    public c.C1938c m;

    /* compiled from: AudioUploadTask.kt */
    public static final class a extends k.a<d> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            d dVar = new d(ny90Var.f(DownloadModel.FILE_NAME), ny90Var.a("notify"));
            dVar.d = ny90Var.c("task_id");
            return dVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            d dVar = (d) instantJob;
            super.b(dVar, ny90Var);
            ny90Var.j("notify", dVar.l);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(d dVar, ny90 ny90Var) {
            d dVar2 = dVar;
            super.b(dVar2, ny90Var);
            ny90Var.j("notify", dVar2.l);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "AudioUploadTask";
        }
    }

    public d(String str, boolean z) {
        super(str);
        this.l = z;
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.m;
        if (c1938c != null) {
            return (MusicTrack) rsg0.a0(new yw4(c1938c.b, c1938c.c, c1938c.a)).a();
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_audio);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        kp4 kp4Var = new kp4();
        this.g = kp4Var.b;
        return rsg0.a0(kp4Var);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.m = new c.C1938c(jSONObject.getString(Hb.a), jSONObject.getString("audio"), jSONObject.getString("hash"));
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "AudioUploadTask";
    }
}
