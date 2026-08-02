package com.vk.pin.views.status;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.au;
import xsna.baf0;
import xsna.dzk0;
import xsna.krv0;
import xsna.ug;

/* compiled from: StatusView.kt */
/* loaded from: classes3.dex */
public final class StatusView extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public StatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.pin_status_view, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.status_info_icon);
        this.c = (TextView) findViewById(R.id.status_info_title);
        this.d = (TextView) findViewById(R.id.status_info_message);
        this.e = (TextView) findViewById(R.id.status_info_action);
    }

    private final void setAction(au auVar) {
        if (auVar == null) {
            TextView textView = this.e;
            (textView != null ? textView : null).setVisibility(8);
            return;
        }
        TextView textView2 = this.e;
        TextView textView3 = textView2 != null ? textView2 : null;
        textView3.setText(auVar.a);
        textView3.setOnClickListener(new ug(auVar, 6));
        textView3.setVisibility(0);
    }

    private final void setMessage(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(charSequence);
    }

    public final void setStatus(dzk0 dzk0Var) {
        baf0 f2 = krv0.f(dzk0Var.a, dzk0Var.b, getContext());
        ImageView imageView = this.b;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(f2);
        setTitle(dzk0Var.c);
        setMessage(dzk0Var.d);
        setAction(dzk0Var.e);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusView(Context context) {
        this(context, null);
    }
}
