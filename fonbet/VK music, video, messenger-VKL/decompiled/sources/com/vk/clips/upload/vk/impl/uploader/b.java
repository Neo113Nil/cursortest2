package com.vk.clips.upload.vk.impl.uploader;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.clips.upload.vk.impl.uploader.ClipsUploadException;
import com.vk.clips.upload.vk.impl.uploader.f;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ShortVideoCreationFeature;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;
import kotlin.text.Regex;
import xsna.aa6;
import xsna.an10;
import xsna.asp;
import xsna.bdd;
import xsna.bpn0;
import xsna.c5g;
import xsna.cub0;
import xsna.drm0;
import xsna.e43;
import xsna.fpf0;
import xsna.hed;
import xsna.i0q0;
import xsna.j5g;
import xsna.jed;
import xsna.k7m;
import xsna.kmv;
import xsna.l9f;
import xsna.lbk;
import xsna.ldq0;
import xsna.m7m;
import xsna.mdq0;
import xsna.med;
import xsna.ncq0;
import xsna.nt;
import xsna.ny90;
import xsna.ozl;
import xsna.ple;
import xsna.q7;
import xsna.rsg0;
import xsna.rsu;
import xsna.s3q0;
import xsna.sf1;
import xsna.sl9;
import xsna.tgw;
import xsna.vhk0;
import xsna.w8i;
import xsna.wmi0;
import xsna.xdd;
import xsna.y8g0;
import xsna.ysg0;
import xsna.z4g;
import xsna.zgf;
import xsna.zrp;

/* compiled from: ClipUploadTask.kt */
@ozl
/* loaded from: classes.dex */
public final class b extends rsu<ClipVideoFile> implements kmv, w8i {
    public static final /* synthetic */ int P = 0;
    public final Object A;
    public d B;
    public volatile Integer C;
    public volatile String D;
    public volatile UserId E;
    public String F;
    public String G;
    public ClipUploadData H;
    public int I;
    public boolean J;
    public boolean K;
    public f.a L;
    public int M;
    public Long N;
    public volatile Throwable O;
    public final ClipsEncoderParameters u;
    public String v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final Object z;

    /* compiled from: ClipUploadTask.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static ClipUploadData a(int i) {
            bpn0 bpn0Var = i0q0.a;
            return (ClipUploadData) wmi0.a.k("ClipUploadTaskNew_" + i);
        }

        public static void b(int i, ClipUploadData clipUploadData) {
            bpn0 bpn0Var = i0q0.a;
            wmi0.a.n("ClipUploadTaskNew_" + i, clipUploadData);
        }
    }

    /* compiled from: ClipUploadTask.kt */
    /* renamed from: com.vk.clips.upload.vk.impl.uploader.b$b, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public final class C0699b implements hed {
        public C0699b() {
        }

        @Override // xsna.hed
        public final void c(boolean z) {
            StringBuilder sb = new StringBuilder("encoding task finished, result=");
            b bVar = b.this;
            f.a aVar = bVar.L;
            sb.append(aVar != null ? f.this.b.getName() : null);
            L.e("ClipUploadTaskNew", sb.toString());
            f.a aVar2 = bVar.L;
            bVar.v = aVar2 != null ? f.this.b.getAbsolutePath() : null;
            bVar.J = !z;
            bVar.L = null;
            bVar.l0(true);
            b.n0(bVar);
            String str = bVar.v;
            if (str != null) {
                ((lbk) bVar.w.getValue()).e(str);
            }
        }

        @Override // xsna.hed
        public final void onCancel() {
            L.e("ClipUploadTaskNew", "encoding task canceled");
            b bVar = b.this;
            bVar.l0(false);
            b.n0(bVar);
            f.a aVar = bVar.L;
            File file = aVar != null ? f.this.b : null;
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file);
            bVar.L = null;
        }

        @Override // xsna.hed
        public final void onError(Throwable th) {
            L.f("ClipUploadTaskNew", "encoding task failed", th);
            com.vk.metrics.eventtracking.b.a.a(th);
            b.this.l0(false);
            b.this.O = th;
            b.n0(b.this);
            f.a aVar = b.this.L;
            File file = aVar != null ? f.this.b : null;
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file);
            b.this.L = null;
        }

        @Override // xsna.hed
        public final void r(int i) {
            b bVar = b.this;
            bVar.M = i;
            bVar.c0(0, 100, false);
        }

        @Override // xsna.hed
        public final void s(int i) {
            b bVar = b.this;
            long j = i;
            synchronized (bVar) {
                bVar.q = j;
                bVar.j0();
            }
        }
    }

    /* compiled from: ClipUploadTask.kt */
    public static final class c extends rsu.b<b> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            boolean a = ny90Var.a("upload_available");
            if (!a) {
                throw new IllegalStateException("Upload is not available. This exception throws when there is not enough info about clip such as owner_id and description");
            }
            int c = ny90Var.c("params_id");
            String f = ny90Var.f(DownloadModel.FILE_NAME);
            int i = b.P;
            ClipUploadData a2 = a.a(c);
            String f2 = ny90Var.f("description_key");
            String i2 = ny90Var.i("audio_id", "");
            String i3 = ny90Var.i("rendered_file_path", "");
            if (i3.equals("")) {
                i3 = null;
            }
            b bVar = new b(f, a2.zb(), i3);
            bVar.p0(a);
            bVar.o0(a2);
            bVar.F = f2;
            bVar.G = i2;
            bVar.J = ny90Var.a("original_quality");
            bVar.d = ny90Var.c("task_id");
            return bVar;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            b bVar = (b) instantJob;
            ny90Var.l("task_id", bVar.d);
            ny90Var.o(DownloadModel.FILE_NAME, bVar.i);
            int i = bVar.I;
            if (i >= 0) {
                ny90Var.l("params_id", i);
                ClipUploadData clipUploadData = bVar.H;
                if (clipUploadData != null) {
                    int i2 = b.P;
                    a.b(bVar.I, clipUploadData);
                }
            }
            ny90Var.o("description_key", bVar.F);
            String str = bVar.G;
            if (str == null) {
                str = "";
            }
            ny90Var.o("audio_id", str);
            String str2 = bVar.v;
            ny90Var.o("rendered_file_path", str2 != null ? str2 : "");
            ny90Var.j("upload_available", bVar.K);
            ny90Var.j("original_quality", bVar.J);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ClipUploadTaskNew";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipUploadTask.kt */
    /* loaded from: classes17.dex */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d AFTER_UPLOAD;
        public static final d BEFORE_UPLOAD;
        public static final d GETTING_UPLOAD_SERVER;
        public static final d SAVING;
        public static final d TASK_CREATED;
        public static final d UPLOADING;

        static {
            d dVar = new d("TASK_CREATED", 0);
            TASK_CREATED = dVar;
            d dVar2 = new d("BEFORE_UPLOAD", 1);
            BEFORE_UPLOAD = dVar2;
            d dVar3 = new d("GETTING_UPLOAD_SERVER", 2);
            GETTING_UPLOAD_SERVER = dVar3;
            d dVar4 = new d("UPLOADING", 3);
            UPLOADING = dVar4;
            d dVar5 = new d("SAVING", 4);
            SAVING = dVar5;
            d dVar6 = new d("AFTER_UPLOAD", 5);
            AFTER_UPLOAD = dVar6;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
            $VALUES = dVarArr;
            $ENTRIES = new asp(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipUploadTask.kt */
    /* loaded from: classes17.dex */
    public static final class e implements mdq0 {
        public e() {
        }

        @Override // xsna.mdq0
        public final void a(long j, long j2) {
            b.this.c0((int) ((j / j2) * 100), 100, false);
        }
    }

    public b(String str, ClipsEncoderParameters clipsEncoderParameters, String str2) {
        super(str);
        this.u = clipsEncoderParameters;
        this.v = str2;
        this.w = new bpn0(new h(this, 16));
        this.x = new bpn0(new com.vk.movika.sdk.base.model.b(this, 20));
        this.y = new bpn0(new com.vk.movika.sdk.base.model.e(this, 17));
        this.z = new Object();
        this.A = new Object();
        this.B = d.TASK_CREATED;
        this.F = "";
        this.I = -1;
        this.K = true;
        L.p("ClipUploadTaskNew", "task created, ".concat(str));
    }

    public static final void n0(b bVar) {
        synchronized (bVar.A) {
            bVar.A.notifyAll();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.rsu, xsna.sp6
    public final void L(Parcelable parcelable) {
        ClipsEncoderParameters zb;
        File e2;
        ClipUploadParams Ab;
        ClipUploadParams Ab2;
        super.L((ClipVideoFile) parcelable);
        ClipUploadData clipUploadData = this.H;
        if (clipUploadData != null && (Ab = clipUploadData.Ab()) != null && Ab.W()) {
            bdd bddVar = (bdd) this.y.getValue();
            int i = this.d;
            String str = this.v;
            ClipUploadData clipUploadData2 = this.H;
            bddVar.a(i, str, (clipUploadData2 == null || (Ab2 = clipUploadData2.Ab()) == null) ? null : Ab2.p());
        }
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        int i2 = this.d;
        cVar.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.g(i2);
        ClipUploadData clipUploadData3 = this.H;
        if (clipUploadData3 == null || (zb = clipUploadData3.zb()) == null || (e2 = zb.e()) == null) {
            return;
        }
        String absolutePath = e2.getAbsolutePath();
        Integer num = this.C;
        UserId userId = this.E;
        if (num == null || userId == null) {
            return;
        }
        Regex regex = com.vk.core.files.a.a;
        if (vhk0.g(e2)) {
            com.vk.upload.impl.a.i(new l9f(absolutePath, userId, num.intValue(), null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b5, code lost:
    
        if (r0 == false) goto L23;
     */
    @Override // xsna.sp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        int j;
        ClipUploadParams Ab;
        L.p("ClipUploadTaskNew", "prepare clip upload, id=" + this.d);
        this.B = d.BEFORE_UPLOAD;
        this.O = null;
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        String str = this.i;
        int i = this.d;
        cVar.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.d();
        ClipsPersistentStore clipsPersistentStore = com.vk.clips.upload.vk.impl.uploader.c.e;
        clipsPersistentStore.b.await();
        ClipsPersistentStore.PersistedUpload c2 = clipsPersistentStore.c(str);
        if (c2 != null) {
            c2.Jb(this);
            com.vk.clips.upload.vk.impl.uploader.c.l(this, c2.Eb(), c2.q());
            clipsPersistentStore.e(c2, ClipsPersistentStore.PersistedUpload.State.STARTED);
            com.vk.clips.upload.vk.impl.uploader.c.d.append(i, c2.zb());
            ysg0.b.a(new med(c2.zb()));
        }
        L.e("ClipsController", tgw.b(i, "upload ", " appended"));
        if (com.vk.core.files.a.y(this.v)) {
            l0(true);
        } else {
            this.v = null;
            l0(false);
        }
        ClipsEncoderParameters.LicensedMusicInfo d2 = this.u.d();
        if (d2 != null && !vhk0.g(d2.d())) {
            g.subscribe(ple.a(d2.e(), d2.getId()));
        }
        if (this.L != null || this.v != null) {
            synchronized (this) {
                boolean z = this.j;
            }
        }
        L.e("ClipUploadTaskNew", "start encoding task for upload, id = " + this.d);
        l0(false);
        File u = com.vk.core.files.a.u();
        MediaPipelineComponent mediaPipelineComponent = (MediaPipelineComponent) ((k7m) m7m.f(this)).a(fpf0.a(MediaPipelineComponent.class));
        ClipsEncoderParameters clipsEncoderParameters = this.u;
        C0699b c0699b = new C0699b();
        ClipUploadData clipUploadData = this.H;
        if (clipUploadData == null || (Ab = clipUploadData.Ab()) == null) {
            Random.b.getClass();
            j = Random.c.j();
        } else {
            j = Ab.n();
        }
        this.L = new f(mediaPipelineComponent, u, clipsEncoderParameters, c0699b, j, ((CameraClipsComponent) this.x.getValue()).getLogger()).a();
        while (this.L != null) {
            synchronized (this.A) {
                this.A.wait(3000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        Throwable th = this.O;
        if (th != null) {
            throw new ClipsUploadException(ClipsUploadException.Type.TRANSCODER, th);
        }
        L.p("ClipUploadTaskNew", "clip upload file is processed, id=" + this.d + ", file=" + this.v);
        String str2 = this.v;
        if (str2 == null || !com.vk.core.files.a.y(str2)) {
            return;
        }
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        ClipsPersistentStore clipsPersistentStore2 = com.vk.clips.upload.vk.impl.uploader.c.e;
        ClipsPersistentStore.PersistedUpload c3 = clipsPersistentStore2.c(this.i);
        if (c3 != null) {
            synchronized (clipsPersistentStore2) {
                c3.Hb(str2);
                clipsPersistentStore2.a();
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    @Override // xsna.sp6
    public final /* bridge */ /* synthetic */ Parcelable Y() {
        return null;
    }

    @Override // xsna.rsu, xsna.sp6
    public final void Z(String str) {
        String path;
        while (!this.K) {
            synchronized (this.z) {
                this.z.wait(3000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        L.e("ClipUploadTaskNew", "starting upload to server, id=" + this.d);
        this.B = d.UPLOADING;
        Uri parse = Uri.parse(this.v);
        if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(parse.getScheme())) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Cursor query = context.getContentResolver().query(parse, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    path = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    s3q0 s3q0Var2 = s3q0.a;
                    query.close();
                } finally {
                }
            }
        } else {
            path = parse.getPath();
        }
        if (path == null) {
            throw new FileNotFoundException(parse.toString());
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException(parse.toString());
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            ldq0.a(Uri.parse(str), randomAccessFile, 4, new e(), null);
            randomAccessFile.close();
        } finally {
        }
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        return this.B.ordinal() < d.GETTING_UPLOAD_SERVER.ordinal() ? y8g0.e(R.string.clips_processing) : y8g0.e(R.string.clips_sending);
    }

    @Override // com.vk.upload.impl.b
    public final q<ncq0> b0() {
        String str;
        int i;
        ClipUploadParams Ab;
        ClipUploadParams Ab2;
        ClipUploadParams Ab3;
        ClipUploadParams Ab4;
        ClipUploadParams Ab5;
        ClipUploadParams Ab6;
        ClipUploadParams Ab7;
        ClipUploadParams Ab8;
        ClipUploadParams Ab9;
        ClipUploadParams Ab10;
        ClipUploadParams Ab11;
        ClipUploadParams Ab12;
        ClipUploadParams Ab13;
        ClipUploadParams Ab14;
        ClipUploadParams Ab15;
        ClipUploadParams Ab16;
        ClipUploadParams Ab17;
        ClipUploadParams Ab18;
        ClipUploadParams Ab19;
        ClipUploadParams Ab20;
        ClipUploadParams Ab21;
        ClipUploadParams Ab22;
        ClipUploadParams Ab23;
        ClipUploadParams Ab24;
        ClipTemplateInfo i2;
        ClipUploadParams Ab25;
        List<MaskLight> H2;
        while (!this.K) {
            synchronized (this.z) {
                this.z.wait(3000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        this.B = d.GETTING_UPLOAD_SERVER;
        String str2 = this.v;
        if (str2 == null) {
            str2 = "";
        }
        File file = new File(str2);
        long f = z4g.f(file);
        if (f == 0) {
            try {
                L.p("ClipUploadTaskNew", "upload file exists: " + file.exists());
                L.p("ClipUploadTaskNew", "upload file can read: " + file.canRead());
                L.p("ClipUploadTaskNew", "upload file size: " + com.vk.core.files.a.I(file));
            } catch (Throwable unused) {
            }
        }
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        ClipUploadData clipUploadData = this.H;
        String str3 = this.F;
        String str4 = this.G;
        boolean z = this.J;
        cVar.getClass();
        List<ShortVideoCreationFeature> list = null;
        if (clipUploadData != null && (Ab25 = clipUploadData.Ab()) != null && (H2 = Ab25.H2()) != null) {
            List<MaskLight> list2 = H2;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MaskLight) it.next()).zb());
            }
            String g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
            if (g0 != null) {
                if (drm0.N(g0)) {
                    g0 = null;
                }
                str = g0;
                if (clipUploadData != null && (Ab24 = clipUploadData.Ab()) != null) {
                    ClipUploadParams Ab26 = clipUploadData.Ab();
                    Ab24.D0((Ab26 != null || (i2 = Ab26.i()) == null) ? null : ClipTemplateInfo.a(i2, clipUploadData.Ab().a0()));
                }
                if (clipUploadData != null && (Ab23 = clipUploadData.Ab()) != null) {
                    Ab23.F0(z);
                }
                String b = (clipUploadData != null || (Ab22 = clipUploadData.Ab()) == null) ? null : zgf.b(Ab22);
                ClickableStickers g = (clipUploadData != null || (Ab21 = clipUploadData.Ab()) == null) ? null : Ab21.g();
                if (clipUploadData != null || (Ab20 = clipUploadData.Ab()) == null || (r3 = Ab20.u()) == null) {
                    UserId userId = UserId.d;
                }
                UserId userId2 = userId;
                i = 0;
                boolean K = (clipUploadData != null || (Ab19 = clipUploadData.Ab()) == null) ? false : Ab19.K();
                String R = (clipUploadData != null || (Ab18 = clipUploadData.Ab()) == null) ? null : Ab18.R();
                String M = (clipUploadData != null || (Ab17 = clipUploadData.Ab()) == null) ? null : Ab17.M();
                boolean f2 = (clipUploadData != null || (Ab16 = clipUploadData.Ab()) == null) ? false : Ab16.f();
                String o = (clipUploadData != null || (Ab15 = clipUploadData.Ab()) == null) ? null : Ab15.o();
                boolean k = (clipUploadData != null || (Ab14 = clipUploadData.Ab()) == null) ? false : Ab14.k();
                if (clipUploadData != null && (Ab13 = clipUploadData.Ab()) != null) {
                    i = Ab13.T();
                }
                int i3 = i;
                VideoToClipInfo w0 = (clipUploadData != null || (Ab12 = clipUploadData.Ab()) == null) ? null : Ab12.w0();
                ClipsLinkAttachment l = (clipUploadData != null || (Ab11 = clipUploadData.Ab()) == null) ? null : Ab11.l();
                ClipTemplateInfo i4 = (clipUploadData != null || (Ab10 = clipUploadData.Ab()) == null) ? null : Ab10.i();
                VideoTemplatePublishInfo v0 = (clipUploadData != null || (Ab9 = clipUploadData.Ab()) == null) ? null : Ab9.v0();
                OrdData F = (clipUploadData != null || (Ab8 = clipUploadData.Ab()) == null) ? null : Ab8.F();
                Boolean D = (clipUploadData != null || (Ab7 = clipUploadData.Ab()) == null) ? null : Ab7.D();
                Integer d2 = (clipUploadData != null || (Ab6 = clipUploadData.Ab()) == null) ? null : Ab6.d();
                Integer G = (clipUploadData != null || (Ab5 = clipUploadData.Ab()) == null) ? null : Ab5.G();
                List<UserId> P1 = (clipUploadData != null || (Ab4 = clipUploadData.Ab()) == null) ? null : Ab4.P1();
                String e2 = (clipUploadData != null || (Ab3 = clipUploadData.Ab()) == null) ? null : Ab3.e();
                Boolean valueOf = (clipUploadData != null || (Ab2 = clipUploadData.Ab()) == null) ? null : Boolean.valueOf(Ab2.y0());
                if (clipUploadData != null && (Ab = clipUploadData.Ab()) != null) {
                    list = Ab.j();
                }
                cub0 cub0Var = new cub0(f, str3, g, userId2, str4, b, str, K, R, M, f2, o, k, i3, w0, l, list, i4, v0, F, D, d2, G, P1, e2, valueOf);
                ((lbk) this.w.getValue()).f(cub0Var.j);
                this.g = cub0Var.b;
                return new o1(rsg0.a0(cub0Var).U(new q7(new sf1(this, 24), 9)), new aa6(new nt(16), 6));
            }
        }
        str = null;
        if (clipUploadData != null) {
            ClipUploadParams Ab262 = clipUploadData.Ab();
            Ab24.D0((Ab262 != null || (i2 = Ab262.i()) == null) ? null : ClipTemplateInfo.a(i2, clipUploadData.Ab().a0()));
        }
        if (clipUploadData != null) {
            Ab23.F0(z);
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        UserId userId3 = UserId.d;
        UserId userId22 = userId3;
        i = 0;
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
            i = Ab13.T();
        }
        int i32 = i;
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
        }
        if (clipUploadData != null) {
            list = Ab.j();
        }
        cub0 cub0Var2 = new cub0(f, str3, g, userId22, str4, b, str, K, R, M, f2, o, k, i32, w0, l, list, i4, v0, F, D, d2, G, P1, e2, valueOf);
        ((lbk) this.w.getValue()).f(cub0Var2.j);
        this.g = cub0Var2.b;
        return new o1(rsg0.a0(cub0Var2).U(new q7(new sf1(this, 24), 9)), new aa6(new nt(16), 6));
    }

    @Override // xsna.kmv
    public final void c(UserId userId) {
        this.E = userId;
    }

    @Override // com.vk.upload.impl.b
    public final void c0(int i, int i2, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.N;
        if (l == null) {
            this.N = Long.valueOf(elapsedRealtime);
        } else {
            if (elapsedRealtime - l.longValue() <= 500) {
                return;
            }
            this.N = Long.valueOf((((elapsedRealtime - l.longValue()) / 500) * 500) + l.longValue());
        }
        int min = Math.min(an10.b((0.85f * Math.max(i, 1)) + (this.M * 0.15f)), 100);
        int i3 = this.d;
        L.e("ClipUploadTaskNew", sl9.c(i3, min, "progress id=", ": ", " / 100"));
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        Integer num = this.C;
        UserId userId = this.E;
        String str = this.D;
        cVar.getClass();
        xdd xddVar = com.vk.clips.upload.vk.impl.uploader.c.d.get(i3);
        if (xddVar != null) {
            synchronized (xddVar) {
                if (!xddVar.h()) {
                    jed b = com.vk.clips.upload.vk.impl.uploader.c.b(i3);
                    if (b != null) {
                        b.a.n(num);
                        b.a.l(userId);
                        b.a.m(str);
                        b.e(min / 100);
                        ysg0.b.a(b);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        }
        this.h.d(this, min, 100, false);
    }

    @Override // xsna.rsu
    public final void e0(String str) {
        L.e("ClipUploadTaskNew", "response: ".concat(str));
    }

    @Override // xsna.kmv
    public final void f(String str) {
        this.G = str;
    }

    @Override // xsna.rsu
    public final long m0() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void o0(ClipUploadData clipUploadData) {
        this.I = this.d;
        this.H = clipUploadData;
    }

    @Override // com.vk.upload.impl.b, xsna.sp6, com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return this.K ? InstantJob.NotificationShowCondition.WHEN_STARTED : InstantJob.NotificationShowCondition.NEVER;
    }

    public final void p0(boolean z) {
        this.K = z;
        if (z) {
            synchronized (this.z) {
                this.z.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "clip-upload-queue";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ClipUploadTaskNew";
    }

    @Override // xsna.kmv
    public final void setDescription(String str) {
        this.F = str;
    }

    @Override // xsna.rsu, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        f.a aVar = this.L;
        if (aVar != null) {
            aVar.cancel();
        }
        this.L = null;
        this.p = null;
        k0();
        super.u(obj);
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        int i = this.d;
        String str = this.D;
        cVar.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.h(i, str, th, true);
    }
}
