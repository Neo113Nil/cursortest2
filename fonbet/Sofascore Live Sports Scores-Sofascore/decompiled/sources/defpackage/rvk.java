package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.mma.fightNight.view.MmaFightNightItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rvk implements krk {
    public final /* synthetic */ int a;
    public final FrameLayout b;
    public final o8 c;

    public /* synthetic */ rvk(FrameLayout frameLayout, o8 o8Var, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = o8Var;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
            case 1:
                return frameLayout;
            default:
                return (MmaFightNightItem) frameLayout;
        }
    }
}
