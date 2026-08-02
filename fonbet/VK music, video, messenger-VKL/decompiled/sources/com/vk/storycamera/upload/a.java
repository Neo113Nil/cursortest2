package com.vk.storycamera.upload;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.SystemClock;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.stories.d;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.storycamera.upload.VideoStoryUploadTask;
import defpackage.k0;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.l;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Map;
import kotlin.text.Regex;
import xsna.an10;
import xsna.asu0;
import xsna.brm0;
import xsna.e43;
import xsna.epx;
import xsna.i5s;
import xsna.ie40;
import xsna.itg0;
import xsna.k060;
import xsna.krl0;
import xsna.ny90;
import xsna.o7j0;
import xsna.qit0;
import xsna.rsu;
import xsna.s0q;
import xsna.s3q0;
import xsna.sdi;
import xsna.tsl0;
import xsna.uvl0;
import xsna.vdq;
import xsna.vhk0;
import xsna.vtg0;
import xsna.z6m0;

/* compiled from: StoryVideoUploadTask.kt */
/* loaded from: classes11.dex */
public final class a extends VideoStoryUploadTask {
    public static final /* synthetic */ int S = 0;
    public final boolean M;
    public volatile StoriesVideoEncoder.b N;
    public int O;
    public boolean P;
    public boolean Q;
    public final h R;

    /* compiled from: StoryVideoUploadTask.kt */
    /* renamed from: com.vk.storycamera.upload.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1849a extends RuntimeException {
        private final String message;

        public C1849a(String str) {
            super(str);
            this.message = str;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: StoryVideoUploadTask.kt */
    /* loaded from: classes6.dex */
    public final class b implements StoriesVideoEncoder.a {
        public final io.reactivex.rxjava3.disposables.c a;

        public b(io.reactivex.rxjava3.disposables.c cVar) {
            this.a = cVar;
        }

        @Override // com.vk.stories.StoriesVideoEncoder.a
        public final void c(boolean z) {
            File file;
            this.a.dispose();
            StringBuilder sb = new StringBuilder("encoding task finished, result=");
            StoriesVideoEncoder.b bVar = a.this.N;
            sb.append((bVar == null || (file = StoriesVideoEncoder.this.c) == null) ? null : file.getName());
            L.e("StoryVideoUploadTask", sb.toString());
            itg0.l(io.reactivex.rxjava3.core.a.l(new k060(a.this, z, this)).q(asu0.a.c()));
        }

        @Override // com.vk.stories.StoriesVideoEncoder.a
        public final void onCancel() {
            StoryTaskParams storyTaskParams;
            CameraVideoEncoderParameters cameraVideoEncoderParameters;
            File file;
            StoryUploadParams storyUploadParams;
            this.a.dispose();
            L.e("StoryVideoUploadTask", "encoding task canceled");
            a aVar = a.this;
            aVar.P = true;
            boolean z = false;
            aVar.l0(false);
            a.this.q0();
            StoriesVideoEncoder.b bVar = a.this.N;
            File file2 = bVar != null ? StoriesVideoEncoder.this.c : null;
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file2);
            a.this.N = null;
            StoryTaskParams storyTaskParams2 = a.this.z;
            if (storyTaskParams2 != null && (storyUploadParams = storyTaskParams2.f) != null) {
                z = epx.f(storyUploadParams.p, Boolean.TRUE);
            }
            if (!z || (storyTaskParams = a.this.z) == null || (cameraVideoEncoderParameters = storyTaskParams.c) == null || (file = cameraVideoEncoderParameters.r) == null) {
                return;
            }
            vhk0.d(file);
        }

        @Override // com.vk.stories.StoriesVideoEncoder.a
        public final void onError(Throwable th) {
            this.a.dispose();
            a.this.s0(th);
        }

        @Override // com.vk.stories.StoriesVideoEncoder.a
        public final void r(int i) {
            a aVar = a.this;
            aVar.O = i;
            aVar.R.onNext(Integer.valueOf(i));
            aVar.c0(0, 100, false);
        }

        @Override // com.vk.stories.StoriesVideoEncoder.a
        public final void s(int i) {
            a aVar = a.this;
            long j = i;
            synchronized (aVar) {
                aVar.q = j;
                aVar.j0();
            }
        }
    }

    /* compiled from: StoryVideoUploadTask.kt */
    public static final class c extends rsu.b<a> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            int c = ny90Var.c("params_id");
            String f = ny90Var.f(DownloadModel.FILE_NAME);
            String i = ny90Var.i("rendered_file_path", "");
            if (i.equals("")) {
                i = null;
            }
            StoryTaskParams b = tsl0.b(c, "StoryVideoUploadTask");
            a aVar = new a(f, b.c, i, true);
            aVar.y = c;
            aVar.z = b;
            aVar.d = ny90Var.c("task_id");
            return aVar;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            a aVar = (a) instantJob;
            ny90Var.l("task_id", aVar.d);
            ny90Var.o(DownloadModel.FILE_NAME, aVar.i);
            int i = aVar.y;
            if (i >= 0) {
                ny90Var.l("params_id", i);
                StoryTaskParams storyTaskParams = aVar.z;
                if (storyTaskParams != null) {
                    tsl0.c("StoryVideoUploadTask", aVar.y, storyTaskParams);
                }
            }
            String str = aVar.C;
            if (str == null) {
                str = "";
            }
            ny90Var.o("rendered_file_path", str);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "StoryVideoUploadTask";
        }
    }

    public a(String str, CameraVideoEncoderParameters cameraVideoEncoderParameters, String str2, boolean z) {
        super(str, cameraVideoEncoderParameters, str2);
        this.M = z;
        this.R = d.O0(0).M0();
    }

    @Override // xsna.sp6
    public final void M() {
        StoryUploadParams storyUploadParams;
        this.J = SystemClock.elapsedRealtime();
        String str = this.C;
        if (str != null) {
            if (com.vk.core.files.a.y(str)) {
                l0(true);
            } else {
                this.C = null;
                l0(false);
            }
        }
        VideoStoryUploadTask.State state = VideoStoryUploadTask.State.TASK_CREATED;
        t0(true);
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.C;
        if (str2 == null) {
            str2 = this.i;
        }
        StoryTaskParams storyTaskParams = this.z;
        if (storyTaskParams != null && (storyUploadParams = storyTaskParams.f) != null) {
            storyUploadParams.Wb(Boolean.valueOf(this.u.Hb() || MediaUtils.a.n(str2)));
        }
        s3q0 s3q0Var = s3q0.a;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{k0.a(currentTimeMillis2, "parse audio stream time: ")});
        }
        if (this.P || this.Q) {
            throw new InterruptedException("Encoding: canceled: " + this.P + " failed: " + this.Q);
        }
    }

    @Override // com.vk.upload.impl.b
    public final void c0(int i, int i2, boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = this.j;
        }
        ((uvl0) this.F.getValue()).o(this.d, Math.min(an10.b((0.25f * i) + (0.75f * (z2 ? 100 : this.O))), 100));
        this.h.d(this, i, 100, false);
    }

    @Override // xsna.rsu
    public final String i0() {
        if (this.C == null) {
            t0(false);
        }
        return this.C;
    }

    @Override // com.vk.storycamera.upload.VideoStoryUploadTask
    public final RandomAccessFile o0() {
        String str = this.C;
        if (str != null && str.length() != 0) {
            return sdi.h(this.C);
        }
        throw new C1849a("Task after deserialization: " + this.M);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "StoryVideoUploadTask";
    }

    public final void s0(Throwable th) {
        L.f("StoryVideoUploadTask", "encoding task failed", th);
        com.vk.metrics.eventtracking.b.a.a(th);
        this.Q = true;
        l0(false);
        q0();
        StoriesVideoEncoder.b bVar = this.N;
        File b2 = bVar != null ? bVar.b() : null;
        Regex regex = com.vk.core.files.a.a;
        vhk0.d(b2);
        this.N = null;
        u0(th);
        ((uvl0) this.F.getValue()).k(this.d, this.C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(boolean z) {
        boolean z2;
        d.a bVar;
        Context context;
        File file;
        String Cb;
        StoryUploadParams storyUploadParams;
        ClickableStickers Bb;
        if (this.N != null || this.C != null) {
            synchronized (this) {
                z2 = this.j;
            }
            if (z2) {
                return;
            }
        }
        L.e("StoryVideoUploadTask", "start encoding task for upload, id = " + this.d);
        int i = 0;
        l0(false);
        File v = com.vk.core.files.a.v();
        CameraVideoEncoderParameters cameraVideoEncoderParameters = this.u;
        StoryTaskParams storyTaskParams = this.z;
        boolean Db = (storyTaskParams == null || (storyUploadParams = storyTaskParams.f) == null || (Bb = storyUploadParams.Bb()) == null) ? false : Bb.Db();
        if (cameraVideoEncoderParameters.Gb() && Db) {
            File Ab = cameraVideoEncoderParameters.Ab();
            if (Ab != null && !vhk0.g(Ab)) {
                String Bb2 = cameraVideoEncoderParameters.Bb();
                if (Bb2 == null || Bb2.length() == 0 || (Cb = cameraVideoEncoderParameters.Cb()) == null || Cb.length() == 0) {
                    L.e("VideoStoryUploadTask", "cannot download music for story upload, id=" + this.d);
                    file = null;
                } else {
                    L.e("VideoStoryUploadTask", "downloading music for story upload, id=" + this.d);
                    krl0 a0 = n0().a0();
                    String Cb2 = cameraVideoEncoderParameters.Cb();
                    if (Cb2 == null) {
                        Cb2 = "";
                    }
                    String Bb3 = cameraVideoEncoderParameters.Bb();
                    file = (File) a0.p(Cb2, Bb3 != null ? Bb3 : "").l(new ie40(new qit0(i), 24)).c();
                    L.e("VideoStoryUploadTask", "music for story upload successfully downloaded, id=" + this.d);
                }
                cameraVideoEncoderParameters.Ib(file);
            }
        } else {
            L.e("VideoStoryUploadTask", "music for story is not needed, id=" + this.d);
        }
        if (this.u.zb() == null || !vhk0.g(this.u.zb())) {
            throw new FileNotFoundException(i5s.a(new StringBuilder(), this.i, " not exist. Abort story encoding task"));
        }
        String str = this.i;
        int i2 = 2;
        if (!brm0.v(str, ".jpg", true) && !brm0.v(str, ".jpeg", true) && com.vk.core.files.a.G(Uri.parse(str)) != 2) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                mediaExtractor.setDataSource(context2, Uri.fromFile(new File(str)), (Map<String, String>) null);
                mediaExtractor.release();
                bVar = new d.a.c(new File(this.i));
            } catch (Throwable unused) {
                mediaExtractor.release();
            }
            StoriesVideoEncoder.StoriesEncoderParameters a = new com.vk.stories.d(bVar, this.u).a();
            this.K = SystemClock.elapsedRealtime();
            h hVar = this.R;
            a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
            hVar.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = new l(new y(hVar, qVar, io.reactivex.rxjava3.internal.functions.b.a), new vtg0(new o7j0(3), i2)).subscribe(new vdq(this, 6));
            context = e43.a;
            if (context == null) {
                context = null;
            }
            this.N = new StoriesVideoEncoder(context, v, a, new b(subscribe), "story_upload", this.d).a();
            while (z && this.N != null) {
                synchronized (this.B) {
                    this.B.wait(3000L);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            return;
        }
        bVar = new d.a.b(new File(this.i));
        StoriesVideoEncoder.StoriesEncoderParameters a2 = new com.vk.stories.d(bVar, this.u).a();
        this.K = SystemClock.elapsedRealtime();
        h hVar2 = this.R;
        a.q qVar2 = io.reactivex.rxjava3.internal.functions.a.a;
        hVar2.getClass();
        io.reactivex.rxjava3.disposables.c subscribe2 = new l(new y(hVar2, qVar2, io.reactivex.rxjava3.internal.functions.b.a), new vtg0(new o7j0(3), i2)).subscribe(new vdq(this, 6));
        context = e43.a;
        if (context == null) {
        }
        this.N = new StoriesVideoEncoder(context, v, a2, new b(subscribe2), "story_upload", this.d).a();
        while (z) {
            synchronized (this.B) {
            }
        }
    }

    public final void u0(Throwable th) {
        CameraVideoEncoderParameters cameraVideoEncoderParameters;
        z6m0 z6m0Var = (z6m0) this.D.getValue();
        int i = this.d;
        s0q s0qVar = new s0q(this.K, th != null ? 0L : SystemClock.elapsedRealtime(), th != null ? SystemClock.elapsedRealtime() : 0L);
        StoryTaskParams storyTaskParams = this.z;
        z6m0Var.a(i, s0qVar, (storyTaskParams == null || (cameraVideoEncoderParameters = storyTaskParams.c) == null) ? null : Long.valueOf(cameraVideoEncoderParameters.Db()), th);
    }
}
