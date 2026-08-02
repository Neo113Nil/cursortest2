package com.vk.upload.impl.tasks.cover;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.instantjobs.InstantJob;
import com.vk.media.MediaUtils;
import com.vk.upload.core.utils.UploadException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.io.File;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.abt0;
import xsna.drm0;
import xsna.e43;
import xsna.mul0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oeq0;
import xsna.ozg0;
import xsna.qsl0;
import xsna.rsg0;
import xsna.rsu;
import xsna.s3q0;
import xsna.vhk0;
import xsna.w8i;

/* compiled from: CoverVideoUploadTask.kt */
/* loaded from: classes11.dex */
public final class CoverVideoUploadTask extends rsu<Parcelable> implements w8i {
    public static final int y = 1280;
    public final UserId u;
    public final Uri v;
    public String w;
    public JSONObject x;

    /* compiled from: CoverVideoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class VideoCompressException extends RuntimeException {
        public VideoCompressException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: CoverVideoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static String a(Uri uri) {
            if (drm0.D(uri.toString(), "com.android.providers.media.documents", false)) {
                Context context = e43.a;
                return com.vk.core.files.a.i(context != null ? context : null, uri).getPath();
            }
            if (drm0.D(uri.toString(), "com.android.providers.media.photopicker", false)) {
                return uri.toString();
            }
            if (!oeq0.e(uri)) {
                return uri.getPath();
            }
            Context context2 = e43.a;
            Context context3 = context2 != null ? context2 : null;
            Regex regex = com.vk.core.files.a.a;
            return com.vk.core.files.a.h(context3, uri, System.currentTimeMillis() + "." + com.vk.core.files.a.E(uri)).getPath();
        }
    }

    /* compiled from: CoverVideoUploadTask.kt */
    public static final class b extends rsu.b<CoverVideoUploadTask> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            CoverVideoUploadTask coverVideoUploadTask = new CoverVideoUploadTask(Uri.parse(ny90Var.f(X3.i.b)), new UserId(ny90Var.e("gid")));
            coverVideoUploadTask.d = ny90Var.c("task_id");
            return coverVideoUploadTask;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            CoverVideoUploadTask coverVideoUploadTask = (CoverVideoUploadTask) instantJob;
            int i = CoverVideoUploadTask.y;
            ny90Var.o(X3.i.b, coverVideoUploadTask.i.toString());
            ny90Var.n("gid", coverVideoUploadTask.u.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CoverVideoUploadTask";
        }
    }

    public CoverVideoUploadTask(Uri uri, UserId userId) {
        super(a.a(uri));
        this.u = userId;
        this.v = uri;
    }

    @Override // xsna.rsu, xsna.sp6
    public final void L(Parcelable parcelable) {
        super.L(parcelable);
        ozg0.a().v(this.x);
        com.vk.core.files.a.e(new File(this.i));
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        mul0 mul0Var = new mul0(this.w);
        StoryEntry storyEntry = (StoryEntry) rsg0.a0(mul0Var).a();
        this.x = mul0Var.F0();
        return storyEntry;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.live_cover_sending);
    }

    @Override // com.vk.upload.impl.b
    public final q<ncq0> b0() {
        CommonUploadParams commonUploadParams = new CommonUploadParams(null, false, null, this.u, null, null, null, null, null, null, null, false, null, false, null, null, 65527, null);
        StoryUploadParams storyUploadParams = new StoryUploadParams();
        storyUploadParams.Vb();
        s3q0 s3q0Var = s3q0.a;
        qsl0 b2 = qsl0.a.b(storyUploadParams, commonUploadParams, null);
        this.g = b2.b;
        return rsg0.a0(b2);
    }

    @Override // com.vk.upload.impl.b
    public final void c0(int i, int i2, boolean z) {
        super.c0(i, 100, false);
        ozg0.a().w(i / 100);
    }

    @Override // xsna.rsu
    public final void e0(String str) throws UploadException {
        try {
            this.w = new JSONObject(str).getJSONObject("response").optString("upload_result");
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // xsna.rsu
    public final String i0() {
        File u = com.vk.core.files.a.u();
        try {
            return n0(u);
        } catch (Throwable th) {
            vhk0.b(u);
            v(null, new VideoCompressException(th));
            this.e = true;
            return null;
        }
    }

    @Override // xsna.rsu
    public final long m0() {
        return 0L;
    }

    public final String n0(File file) {
        MediaUtils.f e = MediaUtils.a.e(this.i, true);
        Number valueOf = e != null ? Float.valueOf(e.e()) : 30;
        int c2 = e != null ? e.c() : 0;
        int a2 = e != null ? e.a() : 0;
        int i = y;
        if (a2 > i) {
            float f = a2;
            float f2 = i / f;
            c2 = (int) (c2 * f2);
            a2 = (int) (f * f2);
        }
        int i2 = a2;
        int i3 = c2;
        int b2 = MediaUtils.a.b(valueOf.floatValue(), i3, i2, 4);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        abt0 abt0Var = new abt0(com.vk.core.files.a.i(context, this.v).getAbsolutePath(), file.getAbsolutePath(), i3, i2, b2, new c());
        abt0Var.a();
        abt0Var.b();
        return file.getAbsolutePath();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CoverVideoUploadTask";
    }

    @Override // xsna.rsu, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        super.u(obj);
        ozg0.a().d();
        com.vk.core.files.a.e(new File(this.i));
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        ozg0.a().f(th);
        super.v(obj, th);
        com.vk.core.files.a.e(new File(this.i));
    }

    /* compiled from: CoverVideoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class c implements abt0.a {
        @Override // xsna.abt0.a
        public final void onSuccess() {
        }

        @Override // xsna.abt0.a
        public final void onFailure(Throwable th) {
            throw th;
        }

        @Override // xsna.abt0.a
        public final void onProgress(float f) {
        }
    }
}
