package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n94 extends o8 implements yp3 {
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final m94 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n94(Context context, String str, int i, int i2, String str2, boolean z) {
        super(context, null, 0);
        context.getClass();
        str.getClass();
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = str2;
        View root = getRoot();
        int i3 = R.id.action_btn;
        TextView textView = (TextView) nq8.B(R.id.action_btn, root);
        if (textView != null) {
            i3 = R.id.icon;
            ImageView imageView = (ImageView) nq8.B(R.id.icon, root);
            if (imageView != null) {
                i3 = R.id.snack_bar_message;
                TextView textView2 = (TextView) nq8.B(R.id.snack_bar_message, root);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) root;
                    this.h = new m94(linearLayout, textView, imageView, textView2);
                    if (z) {
                        hkg.s(16, this);
                    }
                    textView2.setText(str);
                    textView2.setTextColor(i);
                    linearLayout.getClass();
                    z8e.V(i2, linearLayout);
                    if (str2 != null) {
                        imageView.setVisibility(0);
                        imageView.setImageTintList(null);
                        apf a = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = str2;
                        vt9.f(ht9Var, imageView);
                        vt9.a(ht9Var, R.drawable.ic_sofascore_2);
                        a.a(ht9Var.a());
                        return;
                    }
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i3)));
        throw null;
    }

    public final int getBackgroundColor() {
        return this.f;
    }

    @NotNull
    public final m94 getBinding() {
        return this.h;
    }

    @Nullable
    public final Integer getIconRes() {
        return null;
    }

    @Nullable
    public final String getImageUrl() {
        return this.g;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.custom_snackbar;
    }

    @NotNull
    public final String getMessage() {
        return this.d;
    }

    public final int getTextColor() {
        return this.e;
    }

    public final void setActionListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        m94 m94Var = this.h;
        m94Var.b.setVisibility(0);
        m94Var.b.setOnClickListener(new s61(1, function0));
    }

    @Override // defpackage.yp3
    public final void c(int i) {
    }

    @Override // defpackage.yp3
    public final void b(int i, int i2) {
    }
}
