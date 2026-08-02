package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1230Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f, int i);

    public abstract void A0D(C0953Na c0953Na, boolean z);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1229Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C0965Nm c0965Nm, String str, int i, C0971Ns c0971Ns);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC1229Ya interfaceC1229Ya);

    public AbstractC1230Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
