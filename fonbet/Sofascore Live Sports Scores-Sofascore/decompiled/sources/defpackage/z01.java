package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z01 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z01(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((u11) obj2).r((View) obj);
                break;
            default:
                BaseModalBottomSheetDialog baseModalBottomSheetDialog = (BaseModalBottomSheetDialog) obj;
                float y = (baseModalBottomSheetDialog.y() * ((NestedScrollView) obj2).getScrollY()) / 100.0f;
                float y2 = baseModalBottomSheetDialog.y();
                if (y > y2) {
                    y = y2;
                }
                if (y < 0.01f) {
                    y = 0.01f;
                }
                ((LinearLayout) baseModalBottomSheetDialog.v().f).setElevation(y);
                ((LinearLayout) baseModalBottomSheetDialog.v().n).setElevation(y);
                break;
        }
    }
}
