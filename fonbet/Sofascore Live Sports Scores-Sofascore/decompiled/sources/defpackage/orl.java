package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class orl extends ot8 implements Function1 {
    public static final orl b = new orl();

    public orl() {
        super(1, wql.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/blaze/blazesdk/databinding/BlazeLayoutActivityImaPresenterBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.blaze_layout_activity_ima_presenter, (ViewGroup) null, false);
        PlayerView playerView = (PlayerView) nq8.B(R.id.blaze_ima_player_view, inflate);
        if (playerView != null) {
            return new wql((ConstraintLayout) inflate, playerView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.blaze_ima_player_view)));
        return null;
    }
}
