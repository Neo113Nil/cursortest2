package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gph extends AlertDialog {
    public final LinearLayout a;
    public final TextView b;
    public final ImageView c;

    public gph(Context context, int i) {
        super(context, i);
        Typeface typeface;
        int l = ok3.l(12, getContext());
        int l2 = ok3.l(20, getContext());
        int l3 = ok3.l(24, getContext());
        int l4 = ok3.l(40, getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.a.setPadding(l3, l3, l3, l2);
        this.a.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.c = imageView;
        imageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(l4, l4);
        layoutParams2.setMargins(0, 0, l, 0);
        this.c.setLayoutParams(layoutParams2);
        TextView textView = new TextView(getContext());
        this.b = textView;
        Context context2 = getContext();
        context2.getClass();
        try {
            typeface = z1g.a(R.font.sofascore_sans_medium, context2);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        this.b.setTextSize(2, 20.0f);
        this.b.setTextColor(getContext().getColor(R.color.sofaPrimaryText));
        this.b.setMaxLines(2);
        this.a.addView(this.c);
        this.a.addView(this.b);
    }

    @Override // android.app.AlertDialog
    public final void setIcon(int i) {
        this.c.setVisibility(0);
        this.c.setImageResource(i);
        setCustomTitle(this.a);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
        setCustomTitle(this.a);
    }

    @Override // android.app.AlertDialog
    public final void setIcon(Drawable drawable) {
        this.c.setVisibility(0);
        this.c.setImageDrawable(drawable);
        setCustomTitle(this.a);
    }
}
