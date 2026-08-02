package com.vungle.ads.internal.ui;

import android.content.Intent;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c extends xka implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, Intent intent) {
        super(0);
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onActivityResult: ");
        a.append(this.a);
        a.append(", ");
        a.append(this.b);
        a.append(", ");
        a.append(this.c);
        return a.toString();
    }
}
