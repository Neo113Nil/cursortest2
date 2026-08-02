package defpackage;

import android.graphics.Bitmap;
import androidx.media3.ui.PlayerView;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bnd implements InvocationHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bnd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object tapjoyPlacementListener$lambda$0;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tapjoyPlacementListener$lambda$0 = OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0((OfferwallAdapterBridge) obj2, obj, method, objArr);
                return tapjoyPlacementListener$lambda$0;
            default:
                PlayerView playerView = (PlayerView) obj2;
                int i2 = PlayerView.H;
                if (!method.getName().equals("onImageAvailable")) {
                    return null;
                }
                playerView.o.post(new gjc(17, playerView, (Bitmap) objArr[1]));
                return null;
        }
    }
}
