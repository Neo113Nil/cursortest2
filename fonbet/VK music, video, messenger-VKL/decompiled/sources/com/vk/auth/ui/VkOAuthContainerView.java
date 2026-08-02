package com.vk.auth.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.common.R$styleable;
import com.vk.auth.oauth.VkOAuthService;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import xsna.hnj;
import xsna.izs;
import xsna.s3q0;

/* compiled from: VkOAuthContainerView.kt */
/* loaded from: classes15.dex */
public final class VkOAuthContainerView extends LinearLayout {
    public final LinearLayout b;
    public izs<? super VkOAuthService, s3q0> c;
    public c d;

    public VkOAuthContainerView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_oauth_container_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.oauth_container_layout_header);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.oauth_container_layout_container);
        this.b = linearLayout;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.g, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            string = string == null ? getContext().getString(R.string.vk_connect_exteranl_login_header) : string;
            obtainStyledAttributes.recycle();
            textView.setText(string);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        LinearLayout linearLayout = this.b;
        linearLayout.setEnabled(z);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }

    public final void setOAuthServiceClickListener(izs<? super VkOAuthService, s3q0> izsVar) {
        this.c = izsVar;
    }
}
