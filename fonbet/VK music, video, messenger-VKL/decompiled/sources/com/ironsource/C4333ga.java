package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4529ra;
import xsna.zcl;

/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4333ga extends WebView implements InterfaceC4547sa {
    private InterfaceC4529ra a;
    private Qc b;

    public /* synthetic */ C4333ga(Context context, InterfaceC4529ra interfaceC4529ra, int i, zcl zclVar) {
        this(context, (i & 2) != 0 ? new InterfaceC4529ra.a(0, 1, null) : interfaceC4529ra);
    }

    @Override // com.ironsource.InterfaceC4547sa
    public void a(String str) {
        InterfaceC4529ra interfaceC4529ra = this.a;
        if (interfaceC4529ra == null) {
            interfaceC4529ra = null;
        }
        if (!interfaceC4529ra.a()) {
            InterfaceC4529ra interfaceC4529ra2 = this.a;
            if (interfaceC4529ra2 == null) {
                interfaceC4529ra2 = null;
            }
            interfaceC4529ra2.a(this);
        }
        InterfaceC4529ra interfaceC4529ra3 = this.a;
        (interfaceC4529ra3 != null ? interfaceC4529ra3 : null).a(str);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Qc qc;
        if (i == 4 && (qc = this.b) != null && qc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public C4333ga(Context context, InterfaceC4529ra interfaceC4529ra) {
        this(context);
        this.a = interfaceC4529ra;
    }

    public final void a(Qc qc) {
        this.b = qc;
    }

    public C4333ga(Context context) {
        super(context);
    }

    public final void a() {
        this.b = null;
    }

    public C4333ga(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4333ga(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
