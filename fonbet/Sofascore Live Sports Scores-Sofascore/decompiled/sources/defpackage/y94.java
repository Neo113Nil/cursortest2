package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.OverScroller;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y94 implements Runnable {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final Object d;
    public final /* synthetic */ Object e;

    public y94(zfe zfeVar, Context context) {
        this.e = zfeVar;
        this.d = new OverScroller(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((aa4) obj2).b.onActivityResized(this.b, this.c, (Bundle) obj);
                break;
            default:
                zfe zfeVar = (zfe) obj2;
                OverScroller overScroller = (OverScroller) obj;
                if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    zfeVar.m.postTranslate(this.b - currX, this.c - currY);
                    zfeVar.a();
                    this.b = currX;
                    this.c = currY;
                    zfeVar.h.postOnAnimation(this);
                    break;
                }
                break;
        }
    }

    public y94(aa4 aa4Var, int i, int i2, Bundle bundle) {
        this.e = aa4Var;
        this.b = i;
        this.c = i2;
        this.d = bundle;
    }
}
