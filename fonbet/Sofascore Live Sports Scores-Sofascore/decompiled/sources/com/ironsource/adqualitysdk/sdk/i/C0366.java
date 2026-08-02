package com.ironsource.adqualitysdk.sdk.i;

import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0366 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0358 f1096;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f1097;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1098;

    public C0366(C0358 c0358, String str, String str2) {
        this.f1096 = c0358;
        this.f1098 = str;
        this.f1097 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0358 c0358 = this.f1096;
        String str = this.f1098;
        c0358.m209(str, this.f1097);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String m662 = AbstractC1133.m662("ec8h3VvsQAw21yU=\n", "V6NAri+ZMGg=\n", sb);
        String str2 = AbstractC0370.f1112;
        c0358.m209(m662, Long.toString(Calendar.getInstance().getTimeInMillis()));
        this.f1096.getClass();
    }
}
