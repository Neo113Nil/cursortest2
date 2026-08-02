package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gwa extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 20);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((ProfileData) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.league_editors_item, viewGroup, false);
        int i2 = R.id.editor_name;
        TextView textView = (TextView) nq8.B(R.id.editor_name, inflate);
        if (textView != null) {
            i2 = R.id.editor_profile_image;
            ImageView imageView = (ImageView) nq8.B(R.id.editor_profile_image, inflate);
            if (imageView != null) {
                return new ja9(new gh5((LinearLayout) inflate, textView, imageView, 5));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
