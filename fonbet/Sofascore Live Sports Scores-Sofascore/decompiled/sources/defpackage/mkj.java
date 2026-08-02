package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.sofascore.common.mvvm.UnderlinedToolbar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mkj implements krk {
    public final UnderlinedToolbar a;
    public final LinearLayout b;
    public final ImageView c;
    public final AppCompatTextView d;

    public mkj(UnderlinedToolbar underlinedToolbar, LinearLayout linearLayout, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.a = underlinedToolbar;
        this.b = linearLayout;
        this.c = imageView;
        this.d = appCompatTextView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
