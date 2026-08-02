package com.vungle.ads.internal.ui;

import android.content.Intent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k implements com.vungle.ads.internal.presenter.y {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public final Pair a(Intent intent) {
        Object u2gVar;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        intent.getClass();
        l lVar = this.a;
        try {
            p2g p2gVar = w2g.b;
            atomicBoolean2 = lVar.g;
            atomicBoolean2.set(true);
            lVar.startActivityForResult(intent, Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        l lVar2 = this.a;
        Throwable a = w2g.a(u2gVar);
        if (a == null) {
            return new Pair(Boolean.TRUE, null);
        }
        atomicBoolean = lVar2.g;
        atomicBoolean.set(false);
        return new Pair(Boolean.FALSE, a.getLocalizedMessage());
    }
}
