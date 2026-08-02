package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vm6 extends o8 {
    public final e92 d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm6(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.label_bottom_divider;
        View B = nq8.B(R.id.label_bottom_divider, root);
        if (B != null) {
            i = R.id.label_card_group;
            if (((Group) nq8.B(R.id.label_card_group, root)) != null) {
                i = R.id.label_link_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.label_link_container, root);
                if (linearLayout != null) {
                    i = R.id.label_red_cards;
                    if (((TextView) nq8.B(R.id.label_red_cards, root)) != null) {
                        i = R.id.label_start_icon;
                        ImageView imageView = (ImageView) nq8.B(R.id.label_start_icon, root);
                        if (imageView != null) {
                            i = R.id.label_start_text;
                            TextView textView = (TextView) nq8.B(R.id.label_start_text, root);
                            if (textView != null) {
                                i = R.id.label_yellow_cards;
                                if (((TextView) nq8.B(R.id.label_yellow_cards, root)) != null) {
                                    this.d = new e92((ViewGroup) root, (Object) B, (ViewGroup) linearLayout, (Object) imageView, (View) textView, 10);
                                    this.e = ao2.s(16, context);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.list_item_label_cards;
    }

    public final void j(String str, w1i w1iVar, boolean z) {
        str.getClass();
        e92 e92Var = this.d;
        ((TextView) e92Var.f).setText(str);
        if (w1iVar != null) {
            if (z) {
                haa.G((TextView) e92Var.f);
                ((ImageView) e92Var.c).setVisibility(0);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
            constraintLayout.getClass();
            z8e.a0(constraintLayout, 1000L, new v61(19, w1iVar));
        }
    }

    public final void l(wm6 wm6Var) {
        String str;
        Drawable drawable;
        Function0 function0 = wm6Var.e;
        boolean z = function0 != null;
        MaterialTextView materialTextView = new MaterialTextView(getContext(), null);
        materialTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        materialTextView.setTextAppearance(R.style.BodyMedium);
        materialTextView.setEllipsize(TextUtils.TruncateAt.END);
        Drawable drawable2 = wm6Var.b;
        if (drawable2 == null) {
            drawable2 = z ? materialTextView.getContext().getDrawable(R.drawable.ic_chevron_right_large_16) : null;
        }
        if (z && drawable2 != null) {
            drawable2.setTintList(ColorStateList.valueOf(materialTextView.getContext().getColor(R.color.primary_default)));
        }
        String str2 = wm6Var.c;
        if (str2 != null) {
            str = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str2, "/flag");
        } else {
            str = "";
        }
        ua5 ua5Var = ua5.a;
        int i = this.e;
        t25.a(i);
        haa.q(materialTextView, str, ua5Var, new t25(i));
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setBounds(0, 0, i, i);
        }
        haa.K(materialTextView, drawable, ua5.b, null, null);
        Context context = materialTextView.getContext();
        context.getClass();
        materialTextView.setCompoundDrawablePadding(ao2.s(8, context));
        materialTextView.setGravity(8388613);
        materialTextView.setText(wm6Var.a);
        Integer num = wm6Var.d;
        if (num != null) {
            materialTextView.setTextColor(num.intValue());
        } else if (z) {
            haa.G(materialTextView);
        }
        e92 e92Var = this.d;
        if (function0 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
            constraintLayout.getClass();
            z8e.a0(constraintLayout, 1000L, new h63(wm6Var, 29));
        }
        ((LinearLayout) e92Var.b).addView(materialTextView);
    }

    public final void setLabelValue(@NotNull String str) {
        str.getClass();
        l(new wm6(str, null, null, null, null, 62));
    }
}
