package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29941a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f29942b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(v vVar, boolean z10) {
        try {
            if (!this.f29941a && !z10) {
                this.f29941a = true;
                vVar.recycle();
                this.f29941a = false;
            }
            this.f29942b.obtainMessage(1, vVar).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
