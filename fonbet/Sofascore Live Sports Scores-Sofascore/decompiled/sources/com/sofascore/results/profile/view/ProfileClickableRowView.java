package com.sofascore.results.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.aba;
import defpackage.ao2;
import defpackage.ed;
import defpackage.nq8;
import defpackage.ujf;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/profile/view/ProfileClickableRowView;", "Landroid/widget/LinearLayout;", "", "text", "", "setInfoText", "(Ljava/lang/String;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileClickableRowView extends LinearLayout {
    public final ed a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileClickableRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_clickable_row, this);
        int i = R.id.icon;
        ImageView imageView = (ImageView) nq8.B(R.id.icon, this);
        if (imageView != null) {
            i = R.id.info_label;
            TextView textView = (TextView) nq8.B(R.id.info_label, this);
            if (textView != null) {
                i = R.id.label;
                TextView textView2 = (TextView) nq8.B(R.id.label, this);
                if (textView2 != null) {
                    this.a = new ed(26, imageView, textView, this, textView2);
                    aba.y(this, 0, 3);
                    int s = ao2.s(16, context);
                    int s2 = ao2.s(12, context);
                    setPaddingRelative(s, s2, s, s2);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.m, 0, 0);
                    textView2.setText(obtainStyledAttributes.getString(2));
                    Drawable drawable = obtainStyledAttributes.getDrawable(1);
                    imageView.setVisibility(drawable != null ? 0 : 8);
                    imageView.setImageDrawable(drawable);
                    imageView.setImageTintList(obtainStyledAttributes.getColorStateList(0));
                    if (!obtainStyledAttributes.getBoolean(3, true)) {
                        textView2.setCompoundDrawables(null, null, null, null);
                    }
                    obtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setInfoText(@NotNull String text) {
        text.getClass();
        ((TextView) this.a.c).setText(text);
    }
}
