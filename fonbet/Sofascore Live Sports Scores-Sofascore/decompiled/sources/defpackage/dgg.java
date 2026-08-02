package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dgg extends RelativeLayout {
    public final dgg a;
    public fgg b;
    public final ad2 c;

    public dgg(Context context, boolean z) {
        super(context);
        this.a = this;
        hs4 hs4Var = z45.a;
        this.c = s9a.c(rob.a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.post_video_layout, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.call_to_action_layout;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.call_to_action_layout, inflate);
        if (linearLayout != null) {
            i = R.id.replay_button_layout;
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.replay_button_layout, inflate);
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: bgg
                    public final /* synthetic */ dgg b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = r2;
                        dgg dggVar = this.b;
                        switch (i2) {
                            case 0:
                                fgg postVideoLayoutControllerListener = dggVar.getPostVideoLayoutControllerListener();
                                if (postVideoLayoutControllerListener != null) {
                                    egg[] eggVarArr = egg.a;
                                    ((tfg) postVideoLayoutControllerListener).k();
                                    break;
                                }
                                break;
                            default:
                                fgg postVideoLayoutControllerListener2 = dggVar.getPostVideoLayoutControllerListener();
                                if (postVideoLayoutControllerListener2 != null) {
                                    egg[] eggVarArr2 = egg.a;
                                    ((tfg) postVideoLayoutControllerListener2).j();
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i2 = 1;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bgg
                    public final /* synthetic */ dgg b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i22 = i2;
                        dgg dggVar = this.b;
                        switch (i22) {
                            case 0:
                                fgg postVideoLayoutControllerListener = dggVar.getPostVideoLayoutControllerListener();
                                if (postVideoLayoutControllerListener != null) {
                                    egg[] eggVarArr = egg.a;
                                    ((tfg) postVideoLayoutControllerListener).k();
                                    break;
                                }
                                break;
                            default:
                                fgg postVideoLayoutControllerListener2 = dggVar.getPostVideoLayoutControllerListener();
                                if (postVideoLayoutControllerListener2 != null) {
                                    egg[] eggVarArr2 = egg.a;
                                    ((tfg) postVideoLayoutControllerListener2).j();
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.setVisibility(z ? 0 : 8);
                setVisibility(8);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        xw3.L(this.c, null, null, new cgg(this, null, 0), 3);
    }

    @NotNull
    public ViewGroup getPostVideoLayout() {
        return this.a;
    }

    @Nullable
    public fgg getPostVideoLayoutControllerListener() {
        return this.b;
    }

    public void setPostVideoLayoutControllerListener(@Nullable fgg fggVar) {
        this.b = fggVar;
    }
}
