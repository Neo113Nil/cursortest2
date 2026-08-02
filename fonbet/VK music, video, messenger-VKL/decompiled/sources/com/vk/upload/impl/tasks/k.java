package com.vk.upload.impl.tasks;

import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.stats.StatsTrackUploadServerStateAPIRequest;
import com.vk.core.files.a;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.upload.core.utils.BadUploadServerException;
import com.vk.upload.core.utils.EmptyFileUploadException;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.b;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.p;
import xsna.asu0;
import xsna.d260;
import xsna.ef2;
import xsna.f8f0;
import xsna.hr80;
import xsna.jeq0;
import xsna.ny90;
import xsna.o260;
import xsna.ozg0;
import xsna.psu;
import xsna.raq0;
import xsna.vx2;

/* compiled from: HTTPFileUploadTask.java */
/* loaded from: classes11.dex */
public abstract class k<S extends Parcelable> extends com.vk.upload.impl.b<S> {
    public final String i;
    public final String j;
    public f8f0 k;

    /* compiled from: HTTPFileUploadTask.java */
    public static abstract class a<T extends k<?>> extends b.a<T> {
        @Override // xsna.s7x
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(T t, ny90 ny90Var) {
            ny90Var.l("task_id", t.d);
            ny90Var.o(DownloadModel.FILE_NAME, t.i);
        }
    }

    public k(String str) {
        this.i = str;
        this.j = X3.i.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Type inference failed for: r6v5, types: [okhttp3.d] */
    @Override // xsna.sp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z(@NonNull String str) throws Exception {
        okhttp3.u uVar;
        StatsTrackUploadServerStateAPIRequest.State state;
        Exception exc;
        String f0 = f0();
        if (this.e) {
            return;
        }
        if (f0 == null) {
            f0 = this.i;
        }
        Uri g = jeq0.g(f0);
        long v = hr80.v(g);
        if (v <= 0) {
            throw new EmptyFileUploadException();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Uri parse = Uri.parse(f0);
        raq0 raq0Var = new raq0(f0, TextUtils.equals(parse.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? com.vk.core.files.a.F(parse) : parse.getLastPathSegment(), this.j, new psu(this));
        if (!e0(raq0Var)) {
            if (vx2.d.u()) {
                L.e("vk", "Upload entity is invalid, terminating upload");
                return;
            }
            return;
        }
        p.a aVar = new p.a();
        aVar.i(str);
        aVar.f("POST", raq0Var);
        o260 o260Var = d260.a;
        Closeable closeable = null;
        if (o260Var == null) {
            o260Var = null;
        }
        aVar.c.h("User-Agent", o260Var.l.a());
        okhttp3.p b = aVar.b();
        o260 o260Var2 = d260.a;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        ?? a2 = o260Var2.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b);
        String str2 = b.a.d;
        this.k = (f8f0) a2;
        String str3 = "";
        int i = -1;
        try {
            try {
                uVar = ((f8f0) a2).execute();
                try {
                    i = uVar.o();
                    str3 = uVar.m().string();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 > 0) {
                        int i2 = (elapsedRealtime2 > 2147483647L ? 1 : (elapsedRealtime2 == 2147483647L ? 0 : -1));
                    }
                    if (vx2.d.u()) {
                        L.e("vk", str3);
                    }
                    if (i == 200) {
                        try {
                            g0(str3);
                            StatsTrackUploadServerStateAPIRequest.State state2 = StatsTrackUploadServerStateAPIRequest.State.SUCCESS;
                            raq0Var.contentLength();
                            state = state2;
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
                    String str4 = str3;
                    int i3 = i;
                    StatsTrackUploadServerStateAPIRequest.State state3 = state;
                    exc = e;
                    this.k = null;
                    d0(exc, str, v, !TextUtils.equals(g.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? com.vk.core.files.a.F(g) : g.getLastPathSegment(), state3, i3, str4);
                    if (exc != null) {
                    }
                } catch (IOException e3) {
                    e = e3;
                    state = ozg0.a().x() ? StatsTrackUploadServerStateAPIRequest.State.UNKNOWN : StatsTrackUploadServerStateAPIRequest.State.NO_NETWORK;
                    a.c.a(uVar);
                    String str42 = str3;
                    int i32 = i;
                    StatsTrackUploadServerStateAPIRequest.State state32 = state;
                    exc = e;
                    this.k = null;
                    d0(exc, str, v, !TextUtils.equals(g.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? com.vk.core.files.a.F(g) : g.getLastPathSegment(), state32, i32, str42);
                    if (exc != null) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    state = StatsTrackUploadServerStateAPIRequest.State.UNKNOWN;
                    a.c.a(uVar);
                    String str422 = str3;
                    int i322 = i;
                    StatsTrackUploadServerStateAPIRequest.State state322 = state;
                    exc = e;
                    this.k = null;
                    d0(exc, str, v, !TextUtils.equals(g.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? com.vk.core.files.a.F(g) : g.getLastPathSegment(), state322, i322, str422);
                    if (exc != null) {
                    }
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
        String str4222 = str3;
        int i3222 = i;
        StatsTrackUploadServerStateAPIRequest.State state3222 = state;
        exc = e;
        this.k = null;
        d0(exc, str, v, !TextUtils.equals(g.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? com.vk.core.files.a.F(g) : g.getLastPathSegment(), state3222, i3222, str4222);
        if (exc != null) {
            return;
        }
        L.C("vk", exc);
        throw exc;
    }

    public boolean e0(raq0 raq0Var) {
        return true;
    }

    public String f0() {
        return null;
    }

    @Override // com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public void u(Object obj) {
        super.u(obj);
        asu0.a.getClass();
        asu0.q().submit(new ef2(this, 11));
    }

    public k(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    public void g0(String str) throws UploadException {
    }
}
