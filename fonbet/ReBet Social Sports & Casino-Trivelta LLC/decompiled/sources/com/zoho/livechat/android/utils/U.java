package com.zoho.livechat.android.utils;

import android.animation.Animator;
import android.app.Activity;
import android.media.AudioRecord;
import android.util.Log;
import android.widget.RelativeLayout;
import com.twilio.voice.AudioFormat;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class U {
    private static final int[] SAMPLERATES = {AudioFormat.AUDIO_SAMPLE_RATE_44100, 22050, 11025, AudioFormat.AUDIO_SAMPLE_RATE_8000};

    /* renamed from: a, reason: collision with root package name */
    public RelativeLayout f44475a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f44476b;
    private byte[] buffer;

    /* renamed from: d, reason: collision with root package name */
    public AudioRecord f44478d;

    /* renamed from: e, reason: collision with root package name */
    public String f44479e;

    /* renamed from: f, reason: collision with root package name */
    public b f44480f;

    /* renamed from: k, reason: collision with root package name */
    public RandomAccessFile f44485k;

    /* renamed from: l, reason: collision with root package name */
    public short f44486l;

    /* renamed from: m, reason: collision with root package name */
    public int f44487m;

    /* renamed from: n, reason: collision with root package name */
    public short f44488n;

    /* renamed from: o, reason: collision with root package name */
    public int f44489o;

    /* renamed from: p, reason: collision with root package name */
    public int f44490p;

    /* renamed from: q, reason: collision with root package name */
    public int f44491q;

    /* renamed from: r, reason: collision with root package name */
    public int f44492r;

    /* renamed from: s, reason: collision with root package name */
    public int f44493s;

    /* renamed from: t, reason: collision with root package name */
    public c f44494t;

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f44477c = new ThreadPoolExecutor(5, 30, 10, TimeUnit.SECONDS, new C3936e());

    /* renamed from: g, reason: collision with root package name */
    public boolean f44481g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44482h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44483i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44484j = false;

    /* renamed from: u, reason: collision with root package name */
    public AudioRecord.OnRecordPositionUpdateListener f44495u = new a();

    public class a implements AudioRecord.OnRecordPositionUpdateListener {
        public a() {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
            if (b.STOPPED == U.this.f44480f) {
                return;
            }
            U u10 = U.this;
            u10.f44477c.submit(u10.f44494t);
        }
    }

    public enum b {
        INITIALIZING,
        READY,
        RECORDING,
        ERROR,
        STOPPED
    }

    public class c extends Thread {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ double f44498a;

            /* renamed from: com.zoho.livechat.android.utils.U$c$a$a, reason: collision with other inner class name */
            public class C0644a implements Animator.AnimatorListener {
                public C0644a() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = true;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = true;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }

            public class b implements Animator.AnimatorListener {
                public b() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = true;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = true;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }

            /* renamed from: com.zoho.livechat.android.utils.U$c$a$c, reason: collision with other inner class name */
            public class C0645c implements Animator.AnimatorListener {
                public C0645c() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = false;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = false;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }

            public class d implements Animator.AnimatorListener {
                public d() {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = false;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!U.this.f44482h) {
                        U.this.f44482h = true;
                        return;
                    }
                    U.this.f44481g = false;
                    U.this.f44483i = false;
                    U.this.f44482h = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }

            public a(double d10) {
                this.f44498a = d10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f44498a > 2800.0d) {
                    if (U.this.f44481g || U.this.f44483i) {
                        return;
                    }
                    U.this.f44483i = true;
                    U.this.f44475a.animate().scaleXBy(0.85f).setDuration(150L).setListener(new C0644a()).start();
                    U.this.f44475a.animate().scaleYBy(0.85f).setDuration(150L).setListener(new b()).start();
                    return;
                }
                if (!U.this.f44481g || U.this.f44483i) {
                    return;
                }
                U.this.f44483i = true;
                U.this.f44475a.animate().scaleX(1.0f).setDuration(250L).setListener(new C0645c()).start();
                U.this.f44475a.animate().scaleY(1.0f).setDuration(250L).setListener(new d()).start();
            }
        }

        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            int read = U.this.f44478d.read(U.this.buffer, 0, U.this.buffer.length);
            try {
                U.this.f44485k.write(U.this.buffer);
                U u10 = U.this;
                U.h(u10, u10.buffer.length);
            } catch (IOException unused) {
            }
            double d10 = 0.0d;
            for (int i10 = 0; i10 < read; i10++) {
                try {
                    d10 += U.this.buffer[i10] * U.this.buffer[i10];
                } catch (Exception unused2) {
                    return;
                }
            }
            if (read > 0) {
                double d11 = d10 / read;
                if (U.this.f44484j) {
                    U.this.f44476b.runOnUiThread(new a(d11));
                }
            }
        }
    }

    public U(int i10, int i11, int i12, int i13, RelativeLayout relativeLayout, Activity activity) {
        this.f44478d = null;
        this.f44479e = null;
        try {
            this.f44476b = activity;
            this.f44475a = relativeLayout;
            if (i13 == 2) {
                this.f44488n = (short) 16;
            } else {
                this.f44488n = (short) 8;
            }
            if (i12 == 16) {
                this.f44486l = (short) 1;
            } else {
                this.f44486l = (short) 2;
            }
            this.f44490p = i10;
            this.f44487m = i11;
            this.f44491q = i13;
            this.f44494t = new c();
            int i14 = (i11 * 120) / 1000;
            this.f44492r = i14;
            int i15 = (((i14 * 2) * this.f44486l) * this.f44488n) / 8;
            this.f44489o = i15;
            if (i15 < AudioRecord.getMinBufferSize(i11, i12, i13)) {
                int minBufferSize = AudioRecord.getMinBufferSize(i11, i12, i13);
                this.f44489o = minBufferSize;
                this.f44492r = minBufferSize / (((this.f44488n * 2) * this.f44486l) / 8);
            }
            AudioRecord audioRecord = new AudioRecord(i10, i11, i12, i13, this.f44489o);
            this.f44478d = audioRecord;
            if (audioRecord.getState() != 1) {
                throw new Exception("AudioRecord initialization failed");
            }
            this.f44478d.setRecordPositionUpdateListener(this.f44495u);
            this.f44478d.setPositionNotificationPeriod(this.f44492r);
            this.f44479e = null;
            this.f44480f = b.INITIALIZING;
        } catch (Exception e10) {
            if (e10.getMessage() != null) {
                Log.e(U.class.getName(), e10.getMessage());
            }
            this.f44480f = b.ERROR;
        }
    }

    public static /* synthetic */ int h(U u10, int i10) {
        int i11 = u10.f44493s + i10;
        u10.f44493s = i11;
        return i11;
    }

    public static U p(RelativeLayout relativeLayout, Activity activity) {
        int i10 = 3;
        while (true) {
            int[] iArr = SAMPLERATES;
            RelativeLayout relativeLayout2 = relativeLayout;
            Activity activity2 = activity;
            U u10 = new U(1, iArr[i10], 16, 2, relativeLayout2, activity2);
            i10++;
            if (!(u10.q() != b.INITIALIZING) || !(i10 < iArr.length)) {
                return u10;
            }
            relativeLayout = relativeLayout2;
            activity = activity2;
        }
    }

    public b q() {
        return this.f44480f;
    }

    public void r() {
        try {
            if (this.f44480f != b.INITIALIZING) {
                s();
                this.f44480f = b.ERROR;
                return;
            }
            if (!(this.f44478d.getState() == 1) || !(this.f44479e != null)) {
                this.f44480f = b.ERROR;
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f44479e, "rw");
            this.f44485k = randomAccessFile;
            randomAccessFile.setLength(0L);
            this.f44485k.writeBytes("RIFF");
            this.f44485k.writeInt(0);
            this.f44485k.writeBytes("WAVE");
            this.f44485k.writeBytes("fmt ");
            this.f44485k.writeInt(Integer.reverseBytes(16));
            this.f44485k.writeShort(Short.reverseBytes((short) 1));
            this.f44485k.writeShort(Short.reverseBytes(this.f44486l));
            this.f44485k.writeInt(Integer.reverseBytes(this.f44487m));
            this.f44485k.writeInt(Integer.reverseBytes(((this.f44487m * this.f44486l) * this.f44488n) / 8));
            this.f44485k.writeShort(Short.reverseBytes((short) ((this.f44486l * this.f44488n) / 8)));
            this.f44485k.writeShort(Short.reverseBytes(this.f44488n));
            this.f44485k.writeBytes(EventKeys.DATA);
            this.f44485k.writeInt(0);
            this.buffer = new byte[((this.f44492r * this.f44488n) / 8) * this.f44486l];
            this.f44480f = b.READY;
        } catch (Exception e10) {
            if (e10.getMessage() != null) {
                Log.e(U.class.getName(), e10.getMessage());
            }
            this.f44480f = b.ERROR;
        }
    }

    public void s() {
        b bVar = this.f44480f;
        if (bVar == b.RECORDING) {
            w();
        } else if (bVar == b.READY) {
            try {
                this.f44485k.close();
            } catch (IOException unused) {
            }
            new File(this.f44479e).delete();
        }
        AudioRecord audioRecord = this.f44478d;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }

    public void t(boolean z10) {
        this.f44484j = z10;
    }

    public void u(String str) {
        try {
            if (this.f44480f == b.INITIALIZING) {
                this.f44479e = str;
            }
        } catch (Exception e10) {
            if (e10.getMessage() != null) {
                Log.e(U.class.getName(), e10.getMessage());
            }
            this.f44480f = b.ERROR;
        }
    }

    public void v() {
        if (this.f44480f != b.READY) {
            this.f44480f = b.ERROR;
            return;
        }
        this.f44493s = 0;
        this.f44478d.startRecording();
        AudioRecord audioRecord = this.f44478d;
        byte[] bArr = this.buffer;
        audioRecord.read(bArr, 0, bArr.length);
        this.f44480f = b.RECORDING;
    }

    public void w() {
        if (this.f44480f != b.RECORDING) {
            this.f44480f = b.ERROR;
            return;
        }
        this.f44478d.stop();
        try {
            this.f44485k.seek(4L);
            this.f44485k.writeInt(Integer.reverseBytes(this.f44493s + 36));
            this.f44485k.seek(40L);
            this.f44485k.writeInt(Integer.reverseBytes(this.f44493s));
            this.f44485k.close();
        } catch (IOException unused) {
            this.f44480f = b.ERROR;
        }
        this.f44480f = b.STOPPED;
    }
}
