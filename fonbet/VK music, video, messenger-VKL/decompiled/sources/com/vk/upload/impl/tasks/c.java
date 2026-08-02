package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.stats.StatsTrackUploadServerStateAPIRequest;
import com.vk.core.files.a;
import com.vk.dto.common.id.UserId;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.upload.core.utils.BadUploadServerException;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.attachments.AudioMessageAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.text.Regex;
import okhttp3.m;
import okhttp3.n;
import okhttp3.p;
import xsna.d1h0;
import xsna.d260;
import xsna.f8f0;
import xsna.ncq0;
import xsna.ny90;
import xsna.o260;
import xsna.ozg0;
import xsna.rsg0;
import xsna.vhk0;
import xsna.vtn;
import xsna.vx2;
import xsna.wtn;

/* compiled from: AudioMessageUploadTask.java */
/* loaded from: classes11.dex */
public final class c extends i {
    public final String p;

    /* compiled from: AudioMessageUploadTask.java */
    public static class a extends k.a<c> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            c cVar = new c(ny90Var.f(DownloadModel.FILE_NAME), ny90Var.f("wave_form"), new UserId(ny90Var.e("album_id")));
            cVar.d = ny90Var.c("task_id");
            return cVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            c cVar = (c) instantJob;
            super.b(cVar, ny90Var);
            ny90Var.n("album_id", cVar.l.b);
            ny90Var.o("wave_form", cVar.p);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(c cVar, ny90 ny90Var) {
            c cVar2 = cVar;
            super.b(cVar2, ny90Var);
            ny90Var.n("album_id", cVar2.l.b);
            ny90Var.o("wave_form", cVar2.p);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "AudioMessageUploadTask";
        }
    }

    public c(String str, @NonNull String str2, UserId userId) {
        super(str, userId, false, false);
        this.p = str2;
    }

    @Override // xsna.sp6
    public final int O() {
        return 3;
    }

    @Override // com.vk.upload.impl.tasks.i, xsna.sp6
    public final Parcelable Y() throws Exception {
        return new AudioMessageAttachment(((d1h0) rsg0.T(wtn.b.a(this.o)).a()).a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [okhttp3.d] */
    @Override // com.vk.upload.impl.tasks.k, xsna.sp6
    public final void Z(@NonNull String str) {
        okhttp3.m mVar;
        okhttp3.u uVar;
        StatsTrackUploadServerStateAPIRequest.State state;
        if (this.e) {
            return;
        }
        File file = new File(this.i);
        String str2 = this.p;
        n.a aVar = new n.a();
        aVar.d(okhttp3.n.h);
        aVar.a("waveform", str2);
        Closeable closeable = null;
        try {
            mVar = m.a.a("audio/ogg");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar.b(X3.i.b, "Audio Message", okhttp3.t.create(mVar, new File(this.i)));
        okhttp3.n c = aVar.c();
        p.a aVar2 = new p.a();
        aVar2.i(str);
        aVar2.f("POST", c);
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        aVar2.c.h("User-Agent", o260Var.l.a());
        okhttp3.p b = aVar2.b();
        o260 o260Var2 = d260.a;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        ?? a2 = o260Var2.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b);
        this.k = (f8f0) a2;
        String str3 = "";
        int i = -1;
        try {
            try {
                uVar = ((f8f0) a2).execute();
                try {
                    i = uVar.o();
                    str3 = uVar.m().string();
                    if (vx2.d.u()) {
                        L.e("vk", str3);
                    }
                    if (i == 200) {
                        try {
                            g0(str3);
                            state = StatsTrackUploadServerStateAPIRequest.State.SUCCESS;
                            e = null;
                        } catch (UploadException e) {
                            e = e;
                            state = StatsTrackUploadServerStateAPIRequest.State.BAD_RESPONSE;
                        }
                    } else {
                        state = StatsTrackUploadServerStateAPIRequest.State.BAD_SERVER;
                        e = new BadUploadServerException("Incorrect httpStatus = " + i, str3);
                    }
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    state = StatsTrackUploadServerStateAPIRequest.State.TIMEOUT;
                    a.c.a(uVar);
                    StatsTrackUploadServerStateAPIRequest.State state2 = state;
                    int i2 = i;
                    String str4 = str3;
                    this.k = null;
                    d0(e, str, file.length(), file.getName(), state2, i2, str4);
                } catch (IOException e3) {
                    e = e3;
                    state = ozg0.a().x() ? StatsTrackUploadServerStateAPIRequest.State.UNKNOWN : StatsTrackUploadServerStateAPIRequest.State.NO_NETWORK;
                    a.c.a(uVar);
                    StatsTrackUploadServerStateAPIRequest.State state22 = state;
                    int i22 = i;
                    String str42 = str3;
                    this.k = null;
                    d0(e, str, file.length(), file.getName(), state22, i22, str42);
                } catch (Exception e4) {
                    e = e4;
                    state = StatsTrackUploadServerStateAPIRequest.State.UNKNOWN;
                    a.c.a(uVar);
                    StatsTrackUploadServerStateAPIRequest.State state222 = state;
                    int i222 = i;
                    String str422 = str3;
                    this.k = null;
                    d0(e, str, file.length(), file.getName(), state222, i222, str422);
                }
            } catch (Throwable th) {
                th = th;
                closeable = a2;
                a.c.a(closeable);
                throw th;
            }
        } catch (SocketTimeoutException e5) {
            e = e5;
            uVar = null;
        } catch (IOException e6) {
            e = e6;
            uVar = null;
        } catch (Exception e7) {
            e = e7;
            uVar = null;
        } catch (Throwable th2) {
            th = th2;
            a.c.a(closeable);
            throw th;
        }
        a.c.a(uVar);
        StatsTrackUploadServerStateAPIRequest.State state2222 = state;
        int i2222 = i;
        String str4222 = str3;
        this.k = null;
        d0(e, str, file.length(), file.getName(), state2222, i2222, str4222);
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.upload.impl.b
    @NonNull
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        vtn vtnVar = new vtn(this.l, "audio_message");
        this.g = vtnVar.b;
        return rsg0.a0(vtnVar);
    }

    @Override // com.vk.upload.impl.tasks.i
    /* renamed from: h0 */
    public final DocumentAttachment Y() {
        return new AudioMessageAttachment(((d1h0) rsg0.T(wtn.b.a(this.o)).a()).a());
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.instantjobs.InstantJob
    @NonNull
    public final String s() {
        return "AudioMessageUploadTask";
    }

    @Override // com.vk.upload.impl.tasks.k, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        super.u(obj);
        Regex regex = com.vk.core.files.a.a;
        vhk0.c(this.i);
    }
}
