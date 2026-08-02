package com.fyber.inneractive.sdk.activities;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i implements com.fyber.inneractive.sdk.click.o {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.a != com.fyber.inneractive.sdk.click.q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.a, bVar);
            this.a.finish();
        }
    }
}
