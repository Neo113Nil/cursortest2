package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kyb implements OnBackAnimationCallback {
    public final /* synthetic */ iyb a;
    public final /* synthetic */ lyb b;

    public kyb(lyb lybVar, iyb iybVar) {
        this.b = lybVar;
        this.a = iybVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.b();
        }
    }

    public final void onBackInvoked() {
        this.a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.d(new nx0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.a(new nx0(backEvent));
        }
    }
}
