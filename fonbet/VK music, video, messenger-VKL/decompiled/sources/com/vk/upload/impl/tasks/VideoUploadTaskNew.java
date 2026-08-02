package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.video.VideoSave;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.instantjobs.InstantJob;
import com.vk.media.ext.VideoEncoderSettings;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.g;
import com.vkontakte.android.R;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.adq0;
import xsna.b6l;
import xsna.baq0;
import xsna.bh10;
import xsna.bjm0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cwr0;
import xsna.e43;
import xsna.ewi;
import xsna.fxc0;
import xsna.gzs;
import xsna.i6n0;
import xsna.jeq0;
import xsna.jz30;
import xsna.kdq0;
import xsna.kvf;
import xsna.l5m;
import xsna.l960;
import xsna.laq;
import xsna.ldq0;
import xsna.mdq0;
import xsna.mvc0;
import xsna.myc0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oeq0;
import xsna.ozg0;
import xsna.pyr0;
import xsna.qcq0;
import xsna.r6m;
import xsna.rsg0;
import xsna.s3q0;
import xsna.shy;
import xsna.sot0;
import xsna.spj;
import xsna.tft0;
import xsna.uft0;
import xsna.wjs0;
import xsna.wzs;
import xsna.x2r0;
import xsna.yfb;
import xsna.yvj;
import xsna.znk0;

/* compiled from: VideoUploadTaskNew.kt */
/* loaded from: classes11.dex */
public final class VideoUploadTaskNew extends com.vk.upload.impl.b<VideoFile> {
    public final ewi A;
    public int B;
    public String C;
    public int D;
    public boolean E;
    public final ReentrantLock F;
    public final Condition G;
    public final bpn0 H;
    public Long I;
    public d J;
    public int K;
    public String L;
    public File M;
    public final laq N;
    public final String i;
    public final String j;
    public final String k;
    public final VideoSave.Target l;
    public final UserId m;
    public final String n;
    public final String o;
    public final boolean p;
    public final List<Integer> q;
    public final String r;
    public final String s;
    public final OrdData t;
    public final List<VideoFile> u;
    public final Integer v;
    public final long w;
    public final String x;
    public final boolean y;
    public final boolean z;

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public static final class UploadFileException extends IOException {
        public UploadFileException(String str) {
            super(str, null);
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    @b6l(c = "com.vk.upload.impl.tasks.VideoUploadTaskNew$1", f = "VideoUploadTaskNew.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        int label;

        public a() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(2, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            baq0 a = ozg0.a();
            this.label = 1;
            Object i2 = a.i(this);
            return i2 == coroutineSingletons ? coroutineSingletons : i2;
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public final class b {
        public b() {
        }

        public final void a(int i) {
            int i2 = (int) (i * 0.75d);
            VideoUploadTaskNew videoUploadTaskNew = VideoUploadTaskNew.this;
            if (videoUploadTaskNew.D != i2) {
                videoUploadTaskNew.D = i2;
                fxc0.B().E().f(videoUploadTaskNew.d, videoUploadTaskNew.B, i2, videoUploadTaskNew.m);
                VideoUploadTaskNew.e0(videoUploadTaskNew, i2);
            }
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    public static final class c extends b.a<VideoUploadTaskNew> {
        public static void c(ny90 ny90Var, String str, String str2) {
            if (str2 != null) {
                ny90Var.o(str, str2);
            }
        }

        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            ArrayList arrayList;
            String str = new String();
            String i = ny90Var.i("ord_info", str);
            if (i == str) {
                i = null;
            }
            OrdData ordData = i != null ? new OrdData(new JSONObject(i)) : null;
            String i2 = ny90Var.i("attached_clips", str);
            if (i2 == str) {
                i2 = null;
            }
            if (i2 != null) {
                JSONArray jSONArray = new JSONArray(i2);
                ArrayList arrayList2 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    arrayList2.add(VideoFile.a.d(jSONArray.getJSONObject(i3)));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            String f = ny90Var.f(DownloadModel.FILE_NAME);
            String i4 = ny90Var.i("name", str);
            String str2 = i4 == str ? null : i4;
            String i5 = ny90Var.i("description", str);
            String str3 = i5 == str ? null : i5;
            VideoSave.Target a = VideoSave.Target.a(ny90Var.f("target"));
            UserId userId = new UserId(ny90Var.e("owner_id"));
            String i6 = ny90Var.i("creation_entry_point", str);
            String str4 = i6 == str ? null : i6;
            boolean a2 = ny90Var.a("notify");
            ArrayList d = ny90Var.d("albums_ids");
            String i7 = ny90Var.i("privacy_view", str);
            String str5 = i7 == str ? null : i7;
            String i8 = ny90Var.i("privacy_comment", str);
            String str6 = i8 == str ? null : i8;
            int c = ny90Var.c("donut_level_id");
            Integer valueOf = c != -1 ? Integer.valueOf(c) : null;
            long e = ny90Var.e("publication_date");
            boolean a3 = ny90Var.a("is_video_upload_in_progress_enabled");
            boolean a4 = ny90Var.a("post_to_wall");
            String i9 = ny90Var.i("from", str);
            String str7 = i9 != str ? i9 : null;
            VideoUploadTaskNew videoUploadTaskNew = new VideoUploadTaskNew(f, str2, str3, a, userId, str7 == null ? str : str7, str4, a2, d, str5, str6, ordData, arrayList, valueOf, e, null, a3, false, a4, 163840);
            videoUploadTaskNew.K = ny90Var.c("deserialization_count") + 1;
            videoUploadTaskNew.d = ny90Var.c("task_id");
            return videoUploadTaskNew;
        }

        @Override // xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            VideoUploadTaskNew videoUploadTaskNew = (VideoUploadTaskNew) instantJob;
            ny90Var.l("task_id", videoUploadTaskNew.d);
            c(ny90Var, DownloadModel.FILE_NAME, videoUploadTaskNew.i);
            OrdData ordData = videoUploadTaskNew.t;
            if (ordData != null) {
                ny90Var.o("ord_info", ordData.e5().toString());
            }
            List<VideoFile> list = videoUploadTaskNew.u;
            if (list != null) {
                ny90Var.o("attached_clips", kvf.a(list).toString());
            }
            c(ny90Var, "name", videoUploadTaskNew.j);
            c(ny90Var, "description", videoUploadTaskNew.k);
            c(ny90Var, "privacy_view", videoUploadTaskNew.r);
            c(ny90Var, "privacy_comment", videoUploadTaskNew.s);
            ny90Var.o("target", videoUploadTaskNew.l.h());
            ny90Var.n("owner_id", videoUploadTaskNew.m.b);
            String str = videoUploadTaskNew.o;
            if (str != null) {
                ny90Var.o("creation_entry_point", str);
            }
            ny90Var.j("notify", videoUploadTaskNew.p);
            ny90Var.m("albums_ids", videoUploadTaskNew.q);
            Integer num = videoUploadTaskNew.v;
            ny90Var.l("donut_level_id", num != null ? num.intValue() : -1);
            ny90Var.n("publication_date", videoUploadTaskNew.w);
            ny90Var.j("is_video_upload_in_progress_enabled", videoUploadTaskNew.y);
            ny90Var.j("post_to_wall", videoUploadTaskNew.z);
            c(ny90Var, "from", videoUploadTaskNew.n);
            ny90Var.l("deserialization_count", videoUploadTaskNew.K);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "VideoUploadTaskNew";
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public static final class d {
        public static final a g = new a();
        public static final d h = new d(-1, 4, 3000, 60000, 1.5f, true);
        public final int a;
        public final int b;
        public final long c;
        public final long d;
        public final float e;
        public final boolean f;

        /* compiled from: VideoUploadTaskNew.kt */
        public static final class a {
            public static d a(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new d(jSONObject.optInt("max_retry_count", -1), jSONObject.optInt("channels_count", 4), jSONObject.optLong("min_delay", 3000L), jSONObject.optLong("max_delay", 60000L), (float) jSONObject.optDouble("factor", 1.5d), jSONObject.optBoolean("reset_on_progress", true));
                } catch (Throwable unused) {
                    return d.h;
                }
            }

            public static d b() {
                return d.h;
            }
        }

        public d(int i, int i2, long j, long j2, float f, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = j2;
            this.e = f;
            this.f = z;
        }

        public final float a() {
            return this.e;
        }

        public final long b() {
            return this.d;
        }

        public final long c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public final int e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && Float.compare(this.e, dVar.e) == 0 && this.f == dVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, bh10.a(bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadParams(retryCount=");
            sb.append(this.a);
            sb.append(", uploadChannelsCount=");
            sb.append(this.b);
            sb.append(", minDelayMs=");
            sb.append(this.c);
            sb.append(", maxDelayMs=");
            sb.append(this.d);
            sb.append(", factor=");
            sb.append(this.e);
            sb.append(", resetOnProgress=");
            return q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public static final class e implements mdq0 {
        public final /* synthetic */ Ref$BooleanRef a;
        public final /* synthetic */ Ref$FloatRef b;
        public final /* synthetic */ VideoUploadTaskNew c;
        public final /* synthetic */ d d;
        public final /* synthetic */ laq e;

        public e(Ref$BooleanRef ref$BooleanRef, Ref$FloatRef ref$FloatRef, VideoUploadTaskNew videoUploadTaskNew, d dVar, laq laqVar) {
            this.a = ref$BooleanRef;
            this.b = ref$FloatRef;
            this.c = videoUploadTaskNew;
            this.d = dVar;
            this.e = laqVar;
        }

        @Override // xsna.mdq0
        public final void a(long j, long j2) {
            this.a.element = false;
            float f = j / j2;
            this.b.element = f;
            this.c.c0((int) (f * 100), 100, false);
            if (this.d.f) {
                this.e.c();
            }
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public static final class f implements kdq0 {
        public final /* synthetic */ qcq0 a;
        public final /* synthetic */ Ref$IntRef b;
        public final /* synthetic */ VideoUploadTaskNew c;

        public f(qcq0 qcq0Var, Ref$IntRef ref$IntRef, VideoUploadTaskNew videoUploadTaskNew) {
            this.a = qcq0Var;
            this.b = ref$IntRef;
            this.c = videoUploadTaskNew;
        }

        @Override // xsna.kdq0
        public final void a(long j) {
            int i = this.b.element;
            VideoUploadTaskNew videoUploadTaskNew = this.c;
            SchemeStat$TypeDevNullItem a = SchemeStat$TypeDevNullItem.a(com.vk.upload.impl.tasks.g.a(g.b.CONNECTION_ESTABLISHED, new g.a(this.a, i, videoUploadTaskNew.n, videoUploadTaskNew.K, com.vk.core.utils.newtork.b.c().d().name())), null, null, null, null, null, Integer.valueOf((int) j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 3);
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = a;
            l5mVar.q();
        }
    }

    /* compiled from: VideoUploadTaskNew.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<Boolean> {
        public g(Object obj) {
            super(0, obj, r6m.class, "isConnectionOverVPN", "isConnectionOverVPN()Z", 0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(r6m.i());
        }
    }

    public VideoUploadTaskNew(String str, String str2, String str3, VideoSave.Target target, UserId userId, String str4, String str5, boolean z, List list, String str6, String str7, OrdData ordData, List list2, Integer num, long j, String str8, boolean z2, boolean z3, boolean z4, int i) {
        this(str, str2, str3, target, userId, str4, (i & 64) != 0 ? null : str5, z, (i & 256) != 0 ? EmptyList.b : list, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : ordData, (i & 4096) != 0 ? null : list2, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? 0L : j, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? false : z2, (131072 & i) != 0 ? true : z3, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z4);
    }

    public static final void e0(VideoUploadTaskNew videoUploadTaskNew, int i) {
        super.c0(i, 100, false);
    }

    public static d g0() {
        b.d i = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_UPLOAD_PARAMS);
        if (i != null) {
            if (!i.a) {
                i = null;
            }
            if (i != null) {
                d.a aVar = d.g;
                String obj = i.c.toString();
                aVar.getClass();
                d a2 = d.a.a(obj);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        d.g.getClass();
        return d.a.b();
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        VideoFile videoFile = (VideoFile) parcelable;
        this.A.a();
        fxc0.B().E().h(this.d);
        StringBuilder sb = new StringBuilder();
        UserId userId = this.m;
        sb.append(userId);
        sb.append("_0");
        wjs0.a(new cwr0(videoFile, sb.toString(), this.o, this.z));
        if (!this.q.isEmpty() && videoFile != null) {
            List<Integer> list = this.q;
            io.reactivex.rxjava3.core.t U = !list.isEmpty() ? rsg0.y0(yfb.x(tft0.B(new uft0(), videoFile.I0(), videoFile.o0(), this.m, list, null, null, videoFile.r(), 488)), null, null, 3).U(new l960(new jz30(18), 13)) : io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
            Context context = e43.a;
            U.subscribe(new sot0(this, videoFile, videoFile, context != null ? context : null));
        }
        File file = this.M;
        if (file != null) {
            com.vk.core.files.a.e(file);
        }
        String str = this.x;
        if (str != null) {
            com.vk.upload.impl.a.i(new w(userId, this.B, str));
        }
    }

    @Override // xsna.sp6
    public final void M() {
        String str;
        String str2;
        if (this.L == null) {
            if (!this.E || (str2 = this.i) == null) {
                str = null;
            } else {
                str = this.A.b(Uri.parse(str2));
                if (str == null) {
                    this.E = false;
                }
            }
            this.L = str;
        }
    }

    @Override // xsna.sp6
    public final laq N() {
        return this.N;
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.p;
    }

    @Override // xsna.sp6
    public final void X() {
        try {
            super.X();
        } catch (Throwable th) {
            fxc0.B().E().i(this.d, th, true);
            throw th;
        }
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        VideoFile videoFile = (VideoFile) rsg0.a0(znk0.K(this.B, this.m, null)).a();
        String str = this.C;
        if (str == null) {
            str = "";
        }
        videoFile.E(str);
        VideoUrlStorage.a aVar = new VideoUrlStorage.a(videoFile.w9());
        aVar.a(VideoUrl.EXTERNAL_URL, this.i);
        videoFile.ua(aVar.b());
        return videoFile;
    }

    @Override // xsna.sp6
    public final void Z(String str) {
        Ref$BooleanRef ref$BooleanRef;
        String str2 = this.L;
        if (str2 == null) {
            str2 = this.i;
        }
        String str3 = str2;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        g gVar = new g(r6m.a);
        d dVar = this.J;
        if (dVar == null) {
            dVar = g0();
        }
        d dVar2 = dVar;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int d2 = dVar2.d();
        Integer valueOf = Integer.valueOf(d2);
        RandomAccessFile randomAccessFile = null;
        if (d2 < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() + 1 : Integer.MAX_VALUE;
        laq laqVar = new laq(24, dVar2.c(), dVar2.a(), dVar2.b());
        while (true) {
            qcq0 qcq0Var = new qcq0(str, ((Number) this.H.getValue()).longValue(), gVar);
            try {
                if (ref$BooleanRef2.element) {
                    try {
                        long j = laqVar.g;
                        try {
                            ReentrantLock reentrantLock = this.F;
                            reentrantLock.lock();
                            try {
                                ref$BooleanRef = ref$BooleanRef2;
                                try {
                                    this.G.await(j, TimeUnit.MILLISECONDS);
                                    try {
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        th = th;
                                        ref$BooleanRef2 = ref$BooleanRef;
                                        try {
                                            com.vk.upload.impl.tasks.g.c(new g.a(qcq0Var, ref$IntRef.element, this.n, this.K, com.vk.core.utils.newtork.b.c().d().name()), th, ref$FloatRef.element);
                                            ref$BooleanRef2.element = true;
                                            int i = ref$IntRef.element;
                                            if ((th instanceof FileNotFoundException) || (th instanceof UploadFileException) || (th instanceof InterruptedException) || (th instanceof ClosedByInterruptException) || (th instanceof ClosedChannelException) || !(th instanceof IOException) || i >= intValue) {
                                                throw th;
                                            }
                                            ref$IntRef.element = i + 1;
                                            laqVar.b();
                                            if (randomAccessFile != null) {
                                                x2r0.c(randomAccessFile);
                                            }
                                        } catch (Throwable th2) {
                                            if (randomAccessFile != null) {
                                                x2r0.c(randomAccessFile);
                                            }
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    reentrantLock.unlock();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ref$BooleanRef = ref$BooleanRef2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            ref$BooleanRef = ref$BooleanRef2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    ref$BooleanRef = ref$BooleanRef2;
                }
                float f2 = ref$FloatRef.element;
                if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    c0((int) (f2 * 100), 100, true);
                }
                com.vk.upload.impl.tasks.g.d(new g.a(qcq0Var, ref$IntRef.element, this.n, this.K, com.vk.core.utils.newtork.b.c().d().name()));
                randomAccessFile = f0(str3);
                ref$BooleanRef2 = ref$BooleanRef;
                com.vk.upload.impl.tasks.g.b(new g.a(qcq0Var, ref$IntRef.element, this.n, this.K, com.vk.core.utils.newtork.b.c().d().name()), ldq0.a(Uri.parse(str), randomAccessFile, dVar2.e(), new e(ref$BooleanRef2, ref$FloatRef, this, dVar2, laqVar), new f(qcq0Var, ref$IntRef, this)), ref$FloatRef.element);
                x2r0.c(randomAccessFile);
                return;
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_video);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        ?? r2;
        Long valueOf = Long.valueOf(((Number) this.H.getValue()).longValue());
        List<VideoFile> list = this.u;
        if (list != null) {
            List<VideoFile> list2 = list;
            r2 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r2.add(((VideoFile) it.next()).a1());
            }
        } else {
            r2 = EmptyList.b;
        }
        List list3 = r2;
        Integer num = this.v;
        VideoSave videoSave = new VideoSave(this.m, this.j, this.k, this.l, true, true, this.r, this.s, this.t, valueOf, list3, num != null ? num.intValue() : -1, Long.valueOf(this.w), this.z);
        this.g = videoSave.b;
        return rsg0.a0(videoSave).U(new mvc0(new bjm0(this, 13), 10));
    }

    @Override // com.vk.upload.impl.b
    public final void c0(int i, int i2, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.I;
        if (l == null) {
            this.I = Long.valueOf(elapsedRealtime);
        } else {
            if (elapsedRealtime - l.longValue() <= 500) {
                return;
            }
            this.I = Long.valueOf((((elapsedRealtime - l.longValue()) / 500) * 500) + l.longValue());
        }
        boolean z2 = this.E;
        UserId userId = this.m;
        if (!z2) {
            fxc0.B().E().f(this.d, this.B, i, userId);
            super.c0(i, 100, z);
        } else {
            int i3 = ((int) ((i / 100) * 0.25f * 100.0f)) + 75;
            fxc0.B().E().f(this.d, this.B, i3, userId);
            super.c0(i3, 100, z);
        }
    }

    public final RandomAccessFile f0(String str) {
        String path;
        Uri g2;
        Uri parse = Uri.parse(str);
        if (oeq0.e(parse)) {
            String n = com.vk.core.files.a.n(parse);
            Uri f2 = (n == null || (g2 = jeq0.g(n)) == null) ? parse : oeq0.f(parse, g2);
            if (oeq0.e(f2)) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                File h = com.vk.core.files.a.h(context, f2, System.currentTimeMillis() + "." + com.vk.core.files.a.E(f2));
                path = h.getPath();
                this.M = h;
            } else {
                path = f2.getPath();
            }
        } else {
            path = parse.getPath();
        }
        if (path == null) {
            throw new UploadFileException(i6n0.a(parse, "actualFilePath is null "));
        }
        File file = new File(path);
        if (file.exists()) {
            return new RandomAccessFile(file, "r");
        }
        throw new UploadFileException(i6n0.a(parse, "file does not exist "));
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "VideoUploadTaskNew";
    }

    @Override // com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        this.A.a();
        super.u(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUploadTaskNew(String str, String str2, String str3, VideoSave.Target target, UserId userId, String str4, String str5, boolean z, List<Integer> list, String str6, String str7, OrdData ordData, List<? extends VideoFile> list2, Integer num, long j, String str8, boolean z2, boolean z3, boolean z4) {
        Uri parse;
        String path;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = target;
        this.m = userId;
        this.n = str4;
        this.o = str5;
        this.p = z;
        this.q = list;
        this.r = str6;
        this.s = str7;
        this.t = ordData;
        this.u = list2;
        this.v = num;
        this.w = j;
        this.x = str8;
        this.y = z2;
        this.z = z4;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.F = reentrantLock;
        this.G = reentrantLock.newCondition();
        this.H = new bpn0(new pyr0(this, 9));
        boolean z5 = false;
        boolean a2 = (str == null || (parse = Uri.parse(str)) == null || (path = parse.getPath()) == null) ? false : adq0.a(path);
        if (((Boolean) myc0.i(EmptyCoroutineContext.b, new a())).booleanValue() && a2) {
            z5 = true;
        }
        this.E = z5;
        Context context = e43.a;
        context = context == null ? null : context;
        VideoEncoderSettings videoEncoderSettings = VideoEncoderSettings.d;
        this.A = new ewi(context, VideoEncoderSettings.b.a(), new b());
        this.N = new laq(24, 500L, 1.5f, 60000L);
    }
}
