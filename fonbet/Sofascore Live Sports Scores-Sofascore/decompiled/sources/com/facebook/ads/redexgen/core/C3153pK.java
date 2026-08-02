package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.pK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3153pK implements C4W {
    public Message A00;
    public C3152pJ A01;

    public C3153pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C3152pJ.A01(this);
    }

    public final C3153pK A01(Message message, C3152pJ c3152pJ) {
        this.A00 = message;
        this.A01 = c3152pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC14363y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC14363y.A01(this.A00));
        A00();
        return success;
    }
}
