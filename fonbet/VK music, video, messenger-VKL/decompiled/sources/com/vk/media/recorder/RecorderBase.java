package com.vk.media.recorder;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.recorder.f;
import java.io.File;
import java.util.Objects;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.jhu0;
import xsna.mo9;
import xsna.oj9;
import xsna.oom0;
import xsna.pj9;
import xsna.sk9;
import xsna.yk9;

/* loaded from: classes3.dex */
public abstract class RecorderBase {
    public RecordingType A;

    @Nullable
    public String B;
    public boolean C;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final c b = new c();
    public final oj9 c;
    public f.a d;
    public yk9 e;
    public mo9.b f;

    @Nullable
    public mo9.b g;
    public pj9 h;
    public d i;
    public volatile mo9.b j;
    public boolean k;
    public volatile File l;
    public volatile File m;
    public String n;
    public String o;
    public String p;
    public volatile boolean q;
    public State r;
    public int s;
    public long t;
    public long u;
    public ExtraAudioSupplier v;
    public float w;
    public float x;
    public float y;
    public volatile long z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RecordingType {
        private static final /* synthetic */ RecordingType[] $VALUES;
        public static final RecordingType CLIP;
        public static final RecordingType LIVE;
        public static final RecordingType LOOP;
        public static final RecordingType ORIGINAL;

        static {
            RecordingType recordingType = new RecordingType("ORIGINAL", 0);
            ORIGINAL = recordingType;
            RecordingType recordingType2 = new RecordingType("LOOP", 1);
            LOOP = recordingType2;
            RecordingType recordingType3 = new RecordingType("LIVE", 2);
            LIVE = recordingType3;
            RecordingType recordingType4 = new RecordingType("CLIP", 3);
            CLIP = recordingType4;
            $VALUES = new RecordingType[]{recordingType, recordingType2, recordingType3, recordingType4};
        }

        public RecordingType() {
            throw null;
        }

        public static RecordingType valueOf(String str) {
            return (RecordingType) Enum.valueOf(RecordingType.class, str);
        }

        public static RecordingType[] values() {
            return (RecordingType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE;
        public static final State PREPARED;
        public static final State PREPARING;
        public static final State RECORDING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("PREPARING", 1);
            PREPARING = state2;
            State state3 = new State("PREPARED", 2);
            PREPARED = state3;
            State state4 = new State("RECORDING", 3);
            RECORDING = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecorderBase.this.b.onInfo(null, this.b, 0);
        }
    }

    public static class b {
        public final com.vk.media.recorder.d a;

        public b(com.vk.media.recorder.d dVar) {
            this.a = dVar;
        }
    }

    public class c implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
        public c() {
        }

        @Override // android.media.MediaRecorder.OnErrorListener
        public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
            RecorderBase recorderBase = RecorderBase.this;
            recorderBase.m();
            recorderBase.g(1000, true);
        }

        @Override // android.media.MediaRecorder.OnInfoListener
        public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
            mo9.b bVar = RecorderBase.this.f;
            if (bVar != null) {
                bVar.onInfo(mediaRecorder, i, i2);
            }
        }
    }

    public interface d {
        void a(File file, boolean z);
    }

    public RecorderBase() {
        oj9 oj9Var = new oj9();
        oj9Var.d = CameraObject$CameraMode.BACK;
        this.c = oj9Var;
        this.k = true;
        this.q = false;
        this.r = State.IDLE;
        this.s = Integer.MAX_VALUE;
        this.t = -1L;
        this.u = -1L;
        this.w = 1.0f;
        this.x = 1.0f;
        this.y = 30.0f;
        this.z = -1L;
        this.A = RecordingType.ORIGINAL;
        this.B = null;
        this.C = false;
    }

    public void A() {
        if (this.m == null) {
            return;
        }
        this.u = -1L;
        this.t = -1L;
        if (!this.k || this.i == null) {
            return;
        }
        File file = this.m;
        this.m = null;
        this.i.a(file, false);
    }

    public void B() {
        A();
    }

    public boolean C() {
        return this instanceof com.vk.media.recorder.d;
    }

    public boolean a(RecordingType recordingType) {
        return false;
    }

    @Nullable
    public oom0 d() {
        return null;
    }

    public final int e() {
        return this.A == RecordingType.CLIP ? 300 : 1000;
    }

    public final void f(int i) {
        this.a.post(new a(i));
    }

    public final void g(int i, boolean z) {
        mo9.b bVar = this.g;
        if (bVar != null) {
            bVar.onError(null, i, z ? 2 : 1);
        }
    }

    public boolean l() {
        return true;
    }

    public abstract void m();

    public void n(ExtraAudioSupplier extraAudioSupplier) {
        this.v = extraAudioSupplier;
    }

    public void o(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
        this.y = f;
    }

    public void p(int i) {
        this.s = i;
    }

    public void q(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
        this.x = f;
    }

    public boolean r(long j) {
        this.u = j;
        if (this.s == Integer.MAX_VALUE || this.t <= 0) {
            return true;
        }
        return this.z < 0 ? this.u - this.t < ((long) this.s) * 1000000 || this.A == RecordingType.LIVE : this.z < ((long) this.s) || this.A == RecordingType.LIVE;
    }

    public void s(MediaUtils.e eVar) {
        this.c.e = eVar;
    }

    public void t(sk9 sk9Var) {
        this.e = sk9Var.e0;
        f.a aVar = this.d;
        Objects.toString(sk9Var.d0);
        aVar.getClass();
        sk9Var.d0 = aVar;
        sk9Var.q(false, false);
    }

    public void v(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
        this.w = f;
    }

    public void w(Float f, Float f2) {
        v(f.floatValue());
        q(f2.floatValue());
    }

    public abstract boolean z();

    public void c() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void b(boolean z) {
    }

    public void h(jhu0 jhu0Var) {
    }

    public void u(boolean z) {
    }

    public void x(boolean z) {
    }

    public void y(long j) {
    }
}
