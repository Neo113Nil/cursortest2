package com.vk.im.ui.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.j03;
import xsna.z23;

/* loaded from: classes2.dex */
public class ErrorView extends LinearLayout {
    public View.OnClickListener b;
    public long c;
    public final a d;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ErrorView errorView;
            View.OnClickListener onClickListener;
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || intent.getBooleanExtra("noConnectivity", false) || (onClickListener = (errorView = ErrorView.this).b) == null) {
                return;
            }
            onClickListener.onClick(errorView.findViewById(R.id.error_button));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            ErrorView errorView = ErrorView.this;
            if (currentTimeMillis - errorView.c < 400) {
                return;
            }
            View.OnClickListener onClickListener = errorView.b;
            if (onClickListener != null) {
                onClickListener.onClick(errorView.findViewById(R.id.error_button));
            }
            errorView.c = System.currentTimeMillis();
        }
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0L;
        this.d = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() == 0) {
            try {
                getContext().unregisterReceiver(this.d);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            com.vk.typography.b.f((TextView) findViewById(R.id.error_text), FontFamily.LIGHT);
        }
        findViewById(R.id.error_button).setOnClickListener(new b());
    }

    public void setErrorInfo(VKApiExecutionException vKApiExecutionException) {
        setMessage(j03.d(getContext(), new VKApiExecutionException(vKApiExecutionException.s(), "", false, vKApiExecutionException.getMessage())));
    }

    public void setIsInline(boolean z) {
        findViewById(R.id.error_icon).setVisibility(z ? 8 : 4);
    }

    public void setMessage(String str) {
        ((TextView) findViewById(R.id.error_text)).setText(str);
    }

    public void setOnRetryListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        a aVar = this.d;
        if (i == 0 && visibility != 0) {
            getContext().registerReceiver(aVar, z23.a("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            if (i == 0 || visibility != 0) {
                return;
            }
            try {
                getContext().unregisterReceiver(aVar);
            } catch (Exception unused) {
            }
        }
    }
}
