package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bwl extends ot8 implements Function1 {
    public static final bwl b = new bwl();

    public bwl() {
        super(1, sim.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/blaze/blazesdk/databinding/BlazeLayoutPlayerActivityBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.blaze_layout_player_activity, (ViewGroup) null, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new sim(frameLayout, frameLayout);
        }
        yhk.s("rootView");
        return null;
    }
}
