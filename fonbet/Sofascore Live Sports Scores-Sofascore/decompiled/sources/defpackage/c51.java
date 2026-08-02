package defpackage;

import android.widget.LinearLayout;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c51 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseModalBottomSheetDialog b;

    public /* synthetic */ c51(BaseModalBottomSheetDialog baseModalBottomSheetDialog, int i) {
        this.a = i;
        this.b = baseModalBottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        BaseModalBottomSheetDialog baseModalBottomSheetDialog = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((LinearLayout) baseModalBottomSheetDialog.v().f).setElevation(floatValue);
                ((LinearLayout) baseModalBottomSheetDialog.v().n).setElevation(floatValue);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = (LinearLayout) baseModalBottomSheetDialog.v().f;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                linearLayout.setElevation(booleanValue ? baseModalBottomSheetDialog.y() : 0.0f);
                LinearLayout linearLayout2 = (LinearLayout) baseModalBottomSheetDialog.v().n;
                if (booleanValue) {
                    f = baseModalBottomSheetDialog.y();
                }
                linearLayout2.setElevation(f);
                break;
        }
        return Unit.a;
    }
}
