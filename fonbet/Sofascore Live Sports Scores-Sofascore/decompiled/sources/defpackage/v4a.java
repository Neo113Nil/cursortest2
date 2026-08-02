package defpackage;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v4a extends qo2 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public v4a(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.qo2
    public final void d(d9l d9lVar) {
        this.c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.qo2
    public final void e(d9l d9lVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.qo2
    public final x9l f(x9l x9lVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((d9l) it.next()).a.d() & 8) != 0) {
                this.c.setTranslationY(e80.c(r0.a.c(), this.e, 0));
                break;
            }
        }
        return x9lVar;
    }

    @Override // defpackage.qo2
    public final c0l g(d9l d9lVar, c0l c0lVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return c0lVar;
    }
}
