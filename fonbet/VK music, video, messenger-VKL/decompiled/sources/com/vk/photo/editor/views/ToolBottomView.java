package com.vk.photo.editor.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.photo.editor.api.R$styleable;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.s3q0;
import xsna.v16;
import xsna.w16;
import xsna.w4a;
import xsna.yn3;

/* compiled from: ToolBottomView.kt */
/* loaded from: classes4.dex */
public final class ToolBottomView extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final TextView b;
    public final ImageView c;
    public gzs<s3q0> d;
    public gzs<s3q0> e;
    public gzs<s3q0> f;
    public gzs<s3q0> g;

    public ToolBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.tool_bottom_view, this);
        setOrientation(0);
        setGravity(16);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.e, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            TextView textView = (TextView) findViewById(R.id.tool_name_text_view);
            this.b = textView;
            textView.setText(string == null ? "" : string);
            ImageView imageView = (ImageView) findViewById(R.id.button_help);
            imageView.setVisibility(8);
            imageView.setOnClickListener(new v16(this, 10));
            this.c = imageView;
            findViewById(R.id.button_cancel).setOnClickListener(new w16(this, 12));
            findViewById(R.id.button_apply).setOnClickListener(new yn3(this, 17));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final gzs<s3q0> getOnCancelClickListener() {
        return this.e;
    }

    public final gzs<s3q0> getOnDoneClickListener() {
        return this.d;
    }

    public final gzs<s3q0> getOnHelpClickListener() {
        return this.g;
    }

    public final gzs<s3q0> getOnToolNameClickListener() {
        return this.f;
    }

    public final void setOnCancelClickListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setOnDoneClickListener(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setOnHelpClickListener(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
        this.c.setVisibility(gzsVar != null ? 0 : 8);
    }

    public final void setOnToolNameClickListener(gzs<s3q0> gzsVar) {
        this.b.setOnClickListener(new w4a(1, gzsVar));
        this.f = gzsVar;
    }
}
