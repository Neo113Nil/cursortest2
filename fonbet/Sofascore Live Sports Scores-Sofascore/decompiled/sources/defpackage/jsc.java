package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jsc extends z5 {
    public final up9 u;
    public final TextView v;
    public final hrc w;
    public final ImageView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsc(Context context) {
        super(context, true);
        context.getClass();
        View root = getRoot();
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, root);
        if (textView != null) {
            i = R.id.text_layout;
            View B = nq8.B(R.id.text_layout, root);
            if (B != null) {
                hrc a = hrc.a(B);
                i = R.id.torso;
                ImageView imageView = (ImageView) nq8.B(R.id.torso, root);
                if (imageView != null) {
                    i = R.id.torso_outline;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.torso_outline, root);
                    if (imageView2 != null) {
                        this.u = new up9((ConstraintLayout) root, textView, a, imageView, imageView2);
                        setupLayoutTransitions(a.a);
                        this.v = textView;
                        this.w = a;
                        this.x = imageView;
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_torso_view;
    }

    @Override // defpackage.z5
    @NotNull
    public ImageView getPrimaryBodyPart() {
        return this.x;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.v;
    }

    @Override // defpackage.z5
    @NotNull
    public hrc getPrimaryTextLayout() {
        return this.w;
    }

    @Override // defpackage.z5
    public /* bridge */ /* synthetic */ ImageView getSecondaryBodyPart() {
        return (ImageView) m877getSecondaryBodyPart();
    }

    @Override // defpackage.r6
    public /* bridge */ /* synthetic */ TextView getSecondaryLabel() {
        return (TextView) m878getSecondaryLabel();
    }

    @Override // defpackage.z5
    public /* bridge */ /* synthetic */ hrc getSecondaryTextLayout() {
        return (hrc) m879getSecondaryTextLayout();
    }

    @Override // defpackage.z5
    public final void q() {
        Gender bodyGraphGender = getBodyGraphGender();
        Gender gender = Gender.Male;
        int i = bodyGraphGender == gender ? R.drawable.body_zone_men : R.drawable.body_zone_women;
        this.u.c.setImageResource(getBodyGraphGender() == gender ? R.drawable.men_body_outline : R.drawable.women_body_outline);
        getPrimaryBodyPart().setImageResource(i);
    }

    @Nullable
    /* renamed from: getSecondaryBodyPart, reason: collision with other method in class */
    public Void m877getSecondaryBodyPart() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryLabel, reason: collision with other method in class */
    public Void m878getSecondaryLabel() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryTextLayout, reason: collision with other method in class */
    public Void m879getSecondaryTextLayout() {
        return null;
    }
}
