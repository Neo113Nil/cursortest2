package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.of;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends qf {
    private long pcc;
    private long sf;

    public ork(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.pcc == 0) {
            return 0L;
        }
        long j = this.sf;
        if (j == 0) {
            j = SystemClock.elapsedRealtime();
            this.sf = j;
        }
        return j - this.pcc;
    }

    public void gm() {
        setVisibility(8);
        if (this.pcc != 0) {
            this.sf = SystemClock.elapsedRealtime();
        }
    }

    public boolean oo() {
        return this.pcc > 0 && this.sf > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qf
    public boolean pcc() {
        return false;
    }

    public void sf(of ofVar, int i) {
        if (isShown()) {
            return;
        }
        sf();
        setVisibility(0);
        this.pcc = SystemClock.elapsedRealtime();
        pcc(ofVar, i);
    }
}
