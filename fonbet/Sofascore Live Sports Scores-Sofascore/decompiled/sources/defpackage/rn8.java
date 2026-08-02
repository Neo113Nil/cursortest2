package defpackage;

import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rn8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rn8(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                fragment.startPostponedEnterTransition();
                break;
            default:
                fragment.callStartTransitionListener(false);
                break;
        }
    }
}
