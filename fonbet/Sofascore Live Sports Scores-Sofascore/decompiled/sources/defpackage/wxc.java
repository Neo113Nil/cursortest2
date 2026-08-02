package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wxc implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ComposeView c;
    public final ComposeView d;
    public final ComposeView e;

    public wxc(ConstraintLayout constraintLayout, ImageView imageView, ComposeView composeView, ComposeView composeView2, ComposeView composeView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = composeView;
        this.d = composeView2;
        this.e = composeView3;
    }

    public static wxc a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View inflate = layoutInflater.inflate(R.layout.multi_dropdown_with_filter_layout, (ViewGroup) recyclerView, false);
        int i = R.id.filter;
        ImageView imageView = (ImageView) nq8.B(R.id.filter, inflate);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = R.id.spinner_first;
            ComposeView composeView = (ComposeView) nq8.B(R.id.spinner_first, inflate);
            if (composeView != null) {
                i = R.id.spinner_second;
                ComposeView composeView2 = (ComposeView) nq8.B(R.id.spinner_second, inflate);
                if (composeView2 != null) {
                    i = R.id.tournament_picker;
                    ComposeView composeView3 = (ComposeView) nq8.B(R.id.tournament_picker, inflate);
                    if (composeView3 != null) {
                        return new wxc(constraintLayout, imageView, composeView, composeView2, composeView3);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
