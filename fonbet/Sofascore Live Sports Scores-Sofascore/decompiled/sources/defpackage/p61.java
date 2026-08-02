package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.slider.RangeSlider;
import com.vungle.ads.internal.ui.view.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p61 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ p61(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                ((RangeSlider) view).H();
                break;
            case 1:
                geb gebVar = (geb) view;
                if (!gebVar.h || gebVar.o != null) {
                    gebVar.l();
                    gebVar.t();
                    break;
                }
                break;
            default:
                d.b((d) view);
                break;
        }
    }
}
