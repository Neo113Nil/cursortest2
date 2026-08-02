package defpackage;

import android.content.Context;
import android.util.TypedValue;
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
/* loaded from: classes2.dex */
public final class xeg extends RelativeLayout implements yeg {
    public final ad2 a;
    public final ks8 b;
    public final xeg c;
    public Function1 d;
    public boolean e;

    public xeg(Context context) {
        super(context);
        hs4 hs4Var = z45.a;
        this.a = s9a.c(rob.a.f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.mute_button_layout, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.imageContainer;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.imageContainer, inflate);
        if (constraintLayout2 != null) {
            i = R.id.mute_image_view;
            ImageView imageView = (ImageView) nq8.B(R.id.mute_image_view, inflate);
            if (imageView != null) {
                i = R.id.unmute_image_view;
                ImageView imageView2 = (ImageView) nq8.B(R.id.unmute_image_view, inflate);
                if (imageView2 != null) {
                    this.b = new ks8(constraintLayout, constraintLayout, constraintLayout2, imageView, imageView2);
                    this.c = this;
                    this.e = true;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(11);
                    layoutParams.addRule(12);
                    setLayoutParams(layoutParams);
                    constraintLayout.setOnClickListener(new cne(this, 17));
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        xw3.L(this.a, null, null, new weg(this, null, 0), 3);
    }

    public final void b() {
        xw3.L(this.a, null, null, new weg(this, null, 1), 3);
    }

    @Nullable
    public Function1<Boolean, Unit> getMuteControllerListener() {
        return this.d;
    }

    @NotNull
    public View getView() {
        return this.c;
    }

    public void setMuteButtonSize(@NotNull gig gigVar) {
        gigVar.getClass();
        rq3 rq3Var = null;
        xw3.L(this.a, null, null, new w9g(this, (int) TypedValue.applyDimension(1, gigVar.a, getView().getContext().getResources().getDisplayMetrics()), rq3Var, 4), 3);
    }

    public void setMuteControllerListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    public void setMuted(boolean z) {
        if (this.e != z) {
            ok3.J(new j92(this, z, null, 2));
        }
    }
}
