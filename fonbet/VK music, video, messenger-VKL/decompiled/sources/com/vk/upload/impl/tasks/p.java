package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import java.util.List;
import org.json.JSONObject;
import xsna.c220;
import xsna.dz2;
import xsna.f9t;
import xsna.j5g;
import xsna.je40;
import xsna.ncq0;
import xsna.ny90;
import xsna.o25;
import xsna.oda0;
import xsna.rsg0;
import xsna.xy2;
import xsna.yfb;
import xsna.zga0;

/* compiled from: PhotoEditorPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class p extends oda0<PhotosPhotoDto> {
    public final UserId m;
    public final UserId n;
    public c.C1938c o;

    /* compiled from: PhotoEditorPhotoUploadTask.kt */
    public static final class a extends k.a<p> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            p pVar = new p(new UserId(ny90Var.e("user_id")), new UserId(ny90Var.e("owner_id")), ny90Var.f(DownloadModel.FILE_NAME));
            pVar.d = ny90Var.c("task_id");
            return pVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            p pVar = (p) instantJob;
            super.b(pVar, ny90Var);
            ny90Var.n("user_id", pVar.m.b);
            ny90Var.n("owner_id", pVar.n.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(p pVar, ny90 ny90Var) {
            p pVar2 = pVar;
            super.b(pVar2, ny90Var);
            ny90Var.n("user_id", pVar2.m.b);
            ny90Var.n("owner_id", pVar2.n.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "PhotoEditorPhotoUploadTask";
        }
    }

    public p(UserId userId, UserId userId2, String str) {
        super(str, null, 6);
        this.m = userId;
        this.n = userId2;
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.o;
        if (c1938c == null) {
            return null;
        }
        dz2 x = yfb.x(zga0.k(f9t.d(), c1938c.b, this.n, null, Integer.valueOf(Integer.parseInt(c1938c.a)), c1938c.c, Boolean.FALSE, 460));
        String s = o25.a().s(this.m);
        if (s != null) {
            x.l = s;
            x.m = "";
        }
        return (PhotosPhotoDto) j5g.a0((List) rsg0.a0(x).a());
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        xy2 d;
        d = f9t.d().d(null, Boolean.FALSE);
        dz2 x = yfb.x(d);
        String s = o25.a().s(this.m);
        if (s != null) {
            x.l = s;
            x.m = "";
        }
        this.g = x.b;
        return rsg0.a0(x).U(new je40(new c220(11), 3));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.o = new c.C1938c(jSONObject.getString(Hb.a), jSONObject.getString("photo"), jSONObject.getString("hash"));
        } catch (Exception e) {
            if (str == null) {
                str = "";
            }
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "PhotoEditorPhotoUploadTask";
    }
}
