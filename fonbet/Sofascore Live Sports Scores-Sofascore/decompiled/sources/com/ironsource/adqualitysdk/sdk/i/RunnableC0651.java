package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC0651 implements Runnable {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0646 f2203;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2204;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2205;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2206;

    public RunnableC0651(AbstractC0646 abstractC0646, Object obj, ArrayList arrayList, JSONObject jSONObject) {
        this.f2203 = abstractC0646;
        this.f2206 = obj;
        this.f2205 = arrayList;
        this.f2204 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2203.m392(this.f2206, this.f2205);
        AbstractC0646.m389(this.f2203, this.f2204, (WebView) this.f2205.get(0), this.f2206);
    }
}
