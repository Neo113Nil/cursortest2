package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rrn extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final AtomicReference d;
    public final AtomicBoolean e;
    public final ExecutorService f;
    public final avn g;

    public rrn(Handler handler, Context context, avn avnVar) {
        super(handler);
        this.d = new AtomicReference(Float.valueOf(-1.0f));
        this.e = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.g = avnVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f.submit(new f2n(this, 27));
    }
}
