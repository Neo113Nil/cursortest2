package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class esk implements krk {
    public final ComposeView a;
    public final ComposeView b;

    public esk(ComposeView composeView, ComposeView composeView2) {
        this.a = composeView;
        this.b = composeView2;
    }

    public static esk a(View view) {
        if (view != null) {
            ComposeView composeView = (ComposeView) view;
            return new esk(composeView, composeView);
        }
        yhk.s("rootView");
        return null;
    }

    public static esk b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(R.layout.view_compose_view, viewGroup, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
