package com.vk.core.compose.component.datetime;

import java.util.Iterator;
import xsna.dli0;
import xsna.hf7;
import xsna.kf7;
import xsna.rli0;
import xsna.w65;
import xsna.wh50;
import xsna.zak0;

/* compiled from: StableBlockInput.kt */
/* loaded from: classes17.dex */
public final class m {
    public final wh50 a;

    public m(b bVar) {
        this.a = androidx.compose.runtime.k.a(bVar, w65.e);
    }

    public final b a() {
        return (b) ((zak0) this.a).getValue();
    }

    public final String b() {
        return rli0.r(dli0.e(a().b, hf7.b), "", new com.vk.movika.sdk.base.logic.interactor.f(4), 30);
    }

    public final boolean c() {
        for (a aVar : dli0.e(a().b, hf7.b)) {
            Iterator it = dli0.e(aVar.e, new com.vk.movika.sdk.base.logic.interactor.d(aVar, 14)).iterator();
            while (it.hasNext()) {
                if (!((kf7) it.next()).i()) {
                    return false;
                }
            }
        }
        return true;
    }
}
