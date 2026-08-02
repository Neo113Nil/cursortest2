package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qdm implements w0m {
    public final PlayerView a;
    public fam b;

    public qdm(LayoutInflater layoutInflater, vwl vwlVar, DefaultConstructorMarker defaultConstructorMarker) {
        PlayerView playerView;
        int ordinal = vwlVar.ordinal();
        if (ordinal == 0) {
            View inflate = layoutInflater.inflate(R.layout.blaze_layout_exo_player_surface_view, (ViewGroup) null, false);
            if (inflate == null) {
                yhk.s("rootView");
                throw null;
            }
            playerView = (PlayerView) inflate;
        } else {
            if (ordinal != 1) {
                zzl.b();
                throw null;
            }
            View inflate2 = layoutInflater.inflate(R.layout.blaze_layout_exo_player_texture_view, (ViewGroup) null, false);
            if (inflate2 == null) {
                yhk.s("rootView");
                throw null;
            }
            playerView = (PlayerView) inflate2;
        }
        this.a = playerView;
    }

    public final void a(fam famVar) {
        PlayerView playerView = this.a;
        try {
            if (Intrinsics.c(this.b, famVar)) {
                return;
            }
            this.b = famVar;
            playerView.setPlayer(null);
            playerView.setPlayer(famVar.d());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void b(boolean z) {
        ExoPlayer d;
        if (z) {
            try {
                fam famVar = this.b;
                if (famVar != null && (d = famVar.d()) != null) {
                    ((vg6) d).release();
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                return;
            }
        }
        this.b = null;
        this.a.setPlayer(null);
    }
}
