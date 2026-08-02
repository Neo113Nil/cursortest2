package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.sofascore.results.chat.view.ChatMessageInputView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hr2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hr2(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                View view = (View) obj2;
                View view2 = (View) obj;
                int[] iArr = new int[2];
                js2 js2Var = ((ChatMessageInputView) viewGroup).d;
                ((ImageView) js2Var.b).getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view2.getLocationOnScreen(iArr2);
                int width = (((ImageView) js2Var.b).getWidth() / 2) + iArr[0];
                int width2 = view.getWidth() / 2;
                int width3 = view.getLayoutDirection() == 1 ? ((view2.getWidth() + iArr2[0]) - width) - width2 : (width - iArr2[0]) - width2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                tl3 tl3Var = layoutParams instanceof tl3 ? (tl3) layoutParams : null;
                if (tl3Var != null && tl3Var.getMarginStart() != width3) {
                    tl3Var.setMarginStart(width3);
                    view.setLayoutParams(tl3Var);
                    break;
                }
                break;
            default:
                GestureDetectorOnGestureListenerC3889xi.a((GestureDetectorOnGestureListenerC3889xi) viewGroup, (byte[]) obj2, (WatermarkData) obj);
                break;
        }
    }
}
