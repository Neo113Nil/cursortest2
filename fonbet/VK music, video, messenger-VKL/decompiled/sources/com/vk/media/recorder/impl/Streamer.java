package com.vk.media.recorder.impl;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.vk.media.recorder.impl.c;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.byi;
import xsna.cyi;
import xsna.d830;
import xsna.g4j;
import xsna.jn4;
import xsna.lms0;
import xsna.nhf0;
import xsna.qom0;
import xsna.wb6;
import xsna.xb6;
import xsna.zip;

/* loaded from: classes3.dex */
public abstract class Streamer {
    public g4j a;
    public qom0 b;
    public com.vk.media.recorder.impl.a c;
    public j d;
    public com.vk.media.recorder.impl.c e;
    public b f;
    public com.vk.media.recorder.impl.b g;
    public zip h;
    public ExtraAudioSupplier i;
    public byi j;
    public cyi k;
    public d830 l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AUTH {
        private static final /* synthetic */ AUTH[] $VALUES;
        public static final AUTH DEFAULT;
        public static final AUTH LLNW;
        public static final AUTH PERISCOPE;

        static {
            AUTH auth = new AUTH("DEFAULT", 0);
            DEFAULT = auth;
            AUTH auth2 = new AUTH("LLNW", 1);
            LLNW = auth2;
            AUTH auth3 = new AUTH("PERISCOPE", 2);
            PERISCOPE = auth3;
            $VALUES = new AUTH[]{auth, auth2, auth3};
        }

        public AUTH() {
            throw null;
        }

        public static AUTH valueOf(String str) {
            return (AUTH) Enum.valueOf(AUTH.class, str);
        }

        public static AUTH[] values() {
            return (AUTH[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CAPTURE_STATE {
        private static final /* synthetic */ CAPTURE_STATE[] $VALUES;
        public static final CAPTURE_STATE ENCODER_FAIL;
        public static final CAPTURE_STATE FAILED;
        public static final CAPTURE_STATE STARTED;
        public static final CAPTURE_STATE STOPPED;

        static {
            CAPTURE_STATE capture_state = new CAPTURE_STATE(SignalingProtocol.STATE_STARTED, 0);
            STARTED = capture_state;
            CAPTURE_STATE capture_state2 = new CAPTURE_STATE("STOPPED", 1);
            STOPPED = capture_state2;
            CAPTURE_STATE capture_state3 = new CAPTURE_STATE("ENCODER_FAIL", 2);
            ENCODER_FAIL = capture_state3;
            CAPTURE_STATE capture_state4 = new CAPTURE_STATE(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = capture_state4;
            $VALUES = new CAPTURE_STATE[]{capture_state, capture_state2, capture_state3, capture_state4};
        }

        public CAPTURE_STATE() {
            throw null;
        }

        public static CAPTURE_STATE valueOf(String str) {
            return (CAPTURE_STATE) Enum.valueOf(CAPTURE_STATE.class, str);
        }

        public static CAPTURE_STATE[] values() {
            return (CAPTURE_STATE[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CONNECTION_STATE {
        private static final /* synthetic */ CONNECTION_STATE[] $VALUES;
        public static final CONNECTION_STATE CONNECTED;
        public static final CONNECTION_STATE DISCONNECTED;
        public static final CONNECTION_STATE INITIALIZED;
        public static final CONNECTION_STATE RECORD;
        public static final CONNECTION_STATE SETUP;

        static {
            CONNECTION_STATE connection_state = new CONNECTION_STATE("INITIALIZED", 0);
            INITIALIZED = connection_state;
            CONNECTION_STATE connection_state2 = new CONNECTION_STATE("CONNECTED", 1);
            CONNECTED = connection_state2;
            CONNECTION_STATE connection_state3 = new CONNECTION_STATE("SETUP", 2);
            SETUP = connection_state3;
            CONNECTION_STATE connection_state4 = new CONNECTION_STATE("RECORD", 3);
            RECORD = connection_state4;
            CONNECTION_STATE connection_state5 = new CONNECTION_STATE("DISCONNECTED", 4);
            DISCONNECTED = connection_state5;
            $VALUES = new CONNECTION_STATE[]{connection_state, connection_state2, connection_state3, connection_state4, connection_state5};
        }

        public CONNECTION_STATE() {
            throw null;
        }

        public static CONNECTION_STATE valueOf(String str) {
            return (CONNECTION_STATE) Enum.valueOf(CONNECTION_STATE.class, str);
        }

        public static CONNECTION_STATE[] values() {
            return (CONNECTION_STATE[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MODE {
        private static final /* synthetic */ MODE[] $VALUES;
        public static final MODE AUDIO_ONLY;
        public static final MODE AUDIO_VIDEO;
        public static final MODE VIDEO_ONLY;

        static {
            MODE mode = new MODE("AUDIO_VIDEO", 0);
            AUDIO_VIDEO = mode;
            MODE mode2 = new MODE("VIDEO_ONLY", 1);
            VIDEO_ONLY = mode2;
            MODE mode3 = new MODE("AUDIO_ONLY", 2);
            AUDIO_ONLY = mode3;
            $VALUES = new MODE[]{mode, mode2, mode3};
        }

        public MODE() {
            throw null;
        }

        public static MODE valueOf(String str) {
            return (MODE) Enum.valueOf(MODE.class, str);
        }

        public static MODE[] values() {
            return (MODE[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RECORD_STATE {
        private static final /* synthetic */ RECORD_STATE[] $VALUES;
        public static final RECORD_STATE FAILED;
        public static final RECORD_STATE INITIALIZED;
        public static final RECORD_STATE STARTED;
        public static final RECORD_STATE STOPPED;

        static {
            RECORD_STATE record_state = new RECORD_STATE("INITIALIZED", 0);
            INITIALIZED = record_state;
            RECORD_STATE record_state2 = new RECORD_STATE(SignalingProtocol.STATE_STARTED, 1);
            STARTED = record_state2;
            RECORD_STATE record_state3 = new RECORD_STATE("STOPPED", 2);
            STOPPED = record_state3;
            RECORD_STATE record_state4 = new RECORD_STATE(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = record_state4;
            $VALUES = new RECORD_STATE[]{record_state, record_state2, record_state3, record_state4};
        }

        public RECORD_STATE() {
            throw null;
        }

        public static RECORD_STATE valueOf(String str) {
            return (RECORD_STATE) Enum.valueOf(RECORD_STATE.class, str);
        }

        public static RECORD_STATE[] values() {
            return (RECORD_STATE[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class STATUS {
        private static final /* synthetic */ STATUS[] $VALUES;
        public static final STATUS AUTH_FAIL;
        public static final STATUS CONN_FAIL;
        public static final STATUS SUCCESS;
        public static final STATUS UNKNOWN_FAIL;

        static {
            STATUS status = new STATUS("SUCCESS", 0);
            SUCCESS = status;
            STATUS status2 = new STATUS("CONN_FAIL", 1);
            CONN_FAIL = status2;
            STATUS status3 = new STATUS("AUTH_FAIL", 2);
            AUTH_FAIL = status3;
            STATUS status4 = new STATUS("UNKNOWN_FAIL", 3);
            UNKNOWN_FAIL = status4;
            $VALUES = new STATUS[]{status, status2, status3, status4};
        }

        public STATUS() {
            throw null;
        }

        public static STATUS valueOf(String str) {
            return (STATUS) Enum.valueOf(STATUS.class, str);
        }

        public static STATUS[] values() {
            return (STATUS[]) $VALUES.clone();
        }
    }

    public static class a {
        public AUTH a;
    }

    public interface b {
        void a(CAPTURE_STATE capture_state);

        void b(CAPTURE_STATE capture_state);

        void c(long j);

        void d(int i, CONNECTION_STATE connection_state, STATUS status);

        void e(@NonNull nhf0 nhf0Var);

        void f();

        void g(RECORD_STATE record_state);

        Handler getHandler();
    }

    public static class c {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a == cVar.a && this.b == cVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(Locale.ENGLISH, "%1$dx%2$d", Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    public final long a(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.l;
    }

    public final long b(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.k;
    }

    public final long c(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return (long) wb6Var.q.d.get().doubleValue();
    }

    public final long d(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.h;
    }

    public final long e(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.g;
    }

    public final long f(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.n;
    }

    public final long g(int i) {
        g4j g4jVar = this.a;
        if (g4jVar == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
        if (wb6Var == null) {
            return 0L;
        }
        return wb6Var.m;
    }

    public abstract void h();

    public final void i(int i) {
        g4j g4jVar = this.a;
        if (g4jVar != null) {
            xb6 xb6Var = (xb6) g4jVar.k.get(Integer.valueOf(i));
            if (xb6Var != null) {
                xb6Var.a = null;
            }
            wb6 wb6Var = (wb6) g4jVar.b.get(Integer.valueOf(i));
            if (wb6Var != null) {
                wb6Var.r = null;
            }
        }
    }

    public final void j(Float f, Float f2) {
        if (this.b == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        if (this.h == null) {
            jn4 jn4Var = new jn4();
            jn4Var.b = this.j;
            zip b2 = jn4Var.b();
            this.h = b2;
            if (b2 == null) {
                throw new IllegalStateException("EncoderAudio is null, check if streamer was built with VIDEO_ONLY mode");
            }
        }
        if (this.c == null) {
            Integer.toString(this.j.a);
            com.vk.media.recorder.impl.a aVar = new com.vk.media.recorder.impl.a(this.b, this.j.a, this.h, this.f, this.i, f != null ? f.floatValue() : 1.0f, f2 != null ? f2.floatValue() : 1.0f);
            this.c = aVar;
            aVar.start();
        }
    }

    @TargetApi(18)
    public final void k(@NonNull File file, float f, float f2) {
        if (this.b == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        if (file == null) {
            throw new IllegalArgumentException("Function parameter is null");
        }
        j jVar = this.d;
        if (jVar == null && this.c == null) {
            throw new IllegalStateException("start audio or video capture first");
        }
        MODE mode = MODE.AUDIO_VIDEO;
        if (jVar == null) {
            mode = MODE.AUDIO_ONLY;
        } else if (this.c == null) {
            mode = MODE.VIDEO_ONLY;
        }
        MODE mode2 = mode;
        com.vk.media.recorder.impl.c cVar = new com.vk.media.recorder.impl.c(this.b, this.f, file, mode2, new nhf0());
        this.e = cVar;
        try {
            cVar.c = new MediaMuxer(cVar.d.toString(), 0);
            cVar.d(RECORD_STATE.INITIALIZED);
        } catch (IOException e) {
            Log.e("c", Log.getStackTraceString(e));
            cVar.d(RECORD_STATE.FAILED);
        }
        if (cVar.l == RECORD_STATE.FAILED) {
            this.e = null;
            return;
        }
        MODE mode3 = MODE.AUDIO_VIDEO;
        if (mode2 == mode3 || mode2 == MODE.AUDIO_ONLY) {
            this.c.h = null;
            l();
            j(Float.valueOf(f), Float.valueOf(f2));
            com.vk.media.recorder.impl.a aVar = this.c;
            com.vk.media.recorder.impl.c cVar2 = this.e;
            if (aVar.k == null) {
                aVar.k = cVar2;
                MediaFormat mediaFormat = aVar.l;
                if (mediaFormat != null) {
                    cVar2.b(mediaFormat);
                }
            }
        }
        if (mode2 == mode3 || mode2 == MODE.VIDEO_ONLY) {
            h();
            j jVar2 = this.d;
            com.vk.media.recorder.impl.c cVar3 = this.e;
            if (jVar2.f == null) {
                jVar2.f = cVar3;
                MediaFormat mediaFormat2 = jVar2.g;
                if (mediaFormat2 != null) {
                    cVar3.c(mediaFormat2);
                    jVar2.h = new lms0(jVar2.g);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        if (this.b == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        com.vk.media.recorder.impl.a aVar = this.c;
        if (aVar != null) {
            try {
                try {
                    aVar.b.set(false);
                    this.c.interrupt();
                    this.c.join();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } finally {
                this.c = null;
                this.h = null;
            }
        }
        zip zipVar = this.h;
        if (zipVar != null) {
            zipVar.a();
            this.h = null;
        }
    }

    @TargetApi(18)
    public final void m() {
        if (this.b == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        j jVar = this.d;
        if (jVar != null) {
            jVar.f = null;
            jVar.h = null;
        }
        com.vk.media.recorder.impl.a aVar = this.c;
        if (aVar != null) {
            aVar.k = null;
        }
        com.vk.media.recorder.impl.c cVar = this.e;
        if (cVar != null) {
            synchronized (cVar.a) {
                try {
                    c.a aVar2 = cVar.h;
                    if (aVar2 != null) {
                        aVar2.interrupt();
                        cVar.h = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e = null;
        }
    }

    public final void n() {
        if (this.b == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        j jVar = this.d;
        if (jVar != null) {
            jVar.a.set(true);
            try {
                try {
                    qom0 qom0Var = jVar.c;
                    if (qom0Var != null) {
                        qom0Var.e = null;
                    }
                    jVar.g = null;
                    jVar.f = null;
                    jVar.h = null;
                    jVar.a();
                    Surface surface = jVar.q;
                    if (surface != null) {
                        surface.release();
                        jVar.q = null;
                    }
                } catch (Exception e) {
                    Log.e(com.mbridge.msdk.foundation.same.report.j.b, Log.getStackTraceString(e));
                }
                this.d = null;
                this.g = null;
            } finally {
                jVar.b(CAPTURE_STATE.STOPPED);
            }
        }
        com.vk.media.recorder.impl.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
            this.g = null;
        }
    }
}
