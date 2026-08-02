package defpackage;

import android.widget.ImageView;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class d30 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d30(pnd pndVar, boolean z, boolean z2) {
        this.d = pndVar;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle next;
        BlazeVideosPlayerButtonsStyle buttons2;
        BlazeVideosPlayerButtonStyle previous;
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.d;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                b4h b4hVar = (b4h) obj;
                long a = ((pnd) obj2).a();
                b4hVar.a(f3h.a, new e3h(z2 ? k69.b : k69.c, a, z ? d3h.a : d3h.c, (9223372034707292159L & a) != 9205357640488583168L));
                break;
            default:
                e0n e0nVar = (e0n) obj2;
                uxm uxmVar = (uxm) obj;
                boolean z3 = e0n.n;
                uxmVar.getClass();
                ImageView imageView = uxmVar.G;
                ImageView imageView2 = uxmVar.F;
                imageView.setSelected(z2);
                BlazeVideosPlayerStyle a2 = e0nVar.a();
                BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = null;
                ctl.b(imageView, (a2 == null || (buttons2 = a2.getButtons()) == null || (previous = buttons2.getPrevious()) == null) ? null : previous.getCustomImage());
                imageView2.setSelected(z);
                BlazeVideosPlayerStyle a3 = e0nVar.a();
                if (a3 != null && (buttons = a3.getButtons()) != null && (next = buttons.getNext()) != null) {
                    blazePlayerButtonCustomImageStates = next.getCustomImage();
                }
                ctl.b(imageView2, blazePlayerButtonCustomImageStates);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d30(boolean z, e0n e0nVar, boolean z2) {
        this.b = z;
        this.d = e0nVar;
        this.c = z2;
    }
}
