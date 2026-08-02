package com.vk.movika.sdk.android.defaultplayer.container;

import xsna.gzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ d(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.invoke();
                break;
            default:
                this.c.invoke();
                break;
        }
    }
}
