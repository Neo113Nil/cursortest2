package com.vk.superapp.multiaccount.api;

import xsna.h240;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MultiAccountId.kt */
/* loaded from: classes11.dex */
public interface c {
    public static final a a = a.a;

    void a(izs<? super h240, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    h240 getValue();

    /* compiled from: MultiAccountId.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final c STUB = new C1889a();

        public final c getSTUB() {
            return STUB;
        }

        /* compiled from: MultiAccountId.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.c$a$a, reason: collision with other inner class name */
        public static final class C1889a implements c {
            @Override // com.vk.superapp.multiaccount.api.c
            public final h240 getValue() {
                return h240.d;
            }

            @Override // com.vk.superapp.multiaccount.api.c
            public final void a(izs<? super h240, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
            }
        }
    }
}
