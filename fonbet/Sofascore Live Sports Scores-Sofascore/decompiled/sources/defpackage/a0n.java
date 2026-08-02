package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.inmobi.media.C3930z7;
import com.inmobi.media.Fi;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0n implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a0n(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                uxm uxmVar = (uxm) obj;
                boolean z = e0n.n;
                uxmVar.getClass();
                BlazeTextView blazeTextView = uxmVar.C;
                int parseColor = Color.parseColor("#66000000");
                GradientDrawable b = w1l.b(0);
                b.setCornerRadii(new float[]{32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f});
                b.setColor(parseColor);
                b.setStroke(0, 0);
                blazeTextView.setBackground(b);
                return Unit.a;
            case 1:
                uxm uxmVar2 = (uxm) obj;
                boolean z2 = e0n.n;
                uxmVar2.getClass();
                BlazeTextView blazeTextView2 = uxmVar2.C;
                blazeTextView2.getClass();
                evl.q(blazeTextView2);
                return Unit.a;
            case 2:
                boolean z3 = e0n.n;
                ((uxm) obj).getClass();
                return Unit.a;
            case 3:
                uxm uxmVar3 = (uxm) obj;
                boolean z4 = e0n.n;
                uxmVar3.getClass();
                View view = uxmVar3.f;
                view.getClass();
                evl.q(view);
                return Unit.a;
            case 4:
                boolean z5 = e0n.n;
                ((uxm) obj).getClass();
                return Unit.a;
            case 5:
                uxm uxmVar4 = (uxm) obj;
                boolean z6 = e0n.n;
                uxmVar4.getClass();
                ImageView imageView = uxmVar4.r;
                imageView.getClass();
                evl.q(imageView);
                return Unit.a;
            case 6:
                boolean z7 = e0n.n;
                ((uxm) obj).getClass();
                return Unit.a;
            case 7:
                boolean z8 = e0n.n;
                ((uxm) obj).getClass();
                return Unit.a;
            case 8:
                return GestureDetectorOnGestureListenerC3889xi.a((Fi) obj);
            case 9:
                return GestureDetectorOnGestureListenerC3889xi.b((Fi) obj);
            case 10:
                return GestureDetectorOnGestureListenerC3889xi.c((Fi) obj);
            case 11:
                return GestureDetectorOnGestureListenerC3889xi.a((JSONObject) obj);
            default:
                return C3930z7.a((GestureDetectorOnGestureListenerC3889xi) obj);
        }
    }
}
