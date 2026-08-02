package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x70 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x70(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 1;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((y2) obj).run();
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? c90.h(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new hb0((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ x70(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }
}
