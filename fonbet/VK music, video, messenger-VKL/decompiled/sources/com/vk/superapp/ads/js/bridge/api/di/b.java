package com.vk.superapp.ads.js.bridge.api.di;

import android.os.Bundle;
import xsna.gwf;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ClosingBannerAdsDelegateFactory.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: ClosingBannerAdsDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1854a();

        /* compiled from: ClosingBannerAdsDelegateFactory.kt */
        /* renamed from: com.vk.superapp.ads.js.bridge.api.di.b$a$a, reason: collision with other inner class name */
        public static final class C1854a implements b {
            @Override // com.vk.superapp.ads.js.bridge.api.di.b
            public final gwf a(izs<? super Bundle, s3q0> izsVar, gzs<Boolean> gzsVar, gwf.a aVar) {
                return gwf.b.a.getSTUB();
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    gwf a(izs<? super Bundle, s3q0> izsVar, gzs<Boolean> gzsVar, gwf.a aVar);
}
