package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t54 implements krk {
    public final /* synthetic */ int a;
    public final FrameLayout b;

    public /* synthetic */ t54(FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = frameLayout;
    }

    public static t54 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.empty_frame, viewGroup, false);
        if (inflate != null) {
            return new t54((FrameLayout) inflate, 1);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
