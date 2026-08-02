package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class idg extends RelativeLayout {
    public final ad2 a;
    public final ks8 b;
    public final idg c;
    public Function1 d;
    public boolean e;

    public idg(Context context) {
        super(context);
        hs4 hs4Var = z45.a;
        this.a = s9a.c(rob.a.f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fullscreen_button_layout, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.fullscreen_exit_image_view;
        ImageView imageView = (ImageView) nq8.B(R.id.fullscreen_exit_image_view, inflate);
        if (imageView != null) {
            i = R.id.fullscreen_image_view;
            ImageView imageView2 = (ImageView) nq8.B(R.id.fullscreen_image_view, inflate);
            if (imageView2 != null) {
                i = R.id.imageContainer;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.imageContainer, inflate);
                if (constraintLayout2 != null) {
                    this.b = new ks8(constraintLayout, constraintLayout, imageView, imageView2, constraintLayout2);
                    this.c = this;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(11);
                    layoutParams.addRule(12);
                    setLayoutParams(layoutParams);
                    constraintLayout.setOnClickListener(new cne(this, 16));
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public View getFullscreenButtonView() {
        return this.c;
    }

    @Nullable
    public Function1<Boolean, Unit> getFullscreenControllerListener() {
        return this.d;
    }

    public void setFullscreen(boolean z) {
        xw3.L(this.a, null, null, new mp1(this, z, null, 6), 3);
        this.e = z;
    }

    public void setFullscreenControllerListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }
}
