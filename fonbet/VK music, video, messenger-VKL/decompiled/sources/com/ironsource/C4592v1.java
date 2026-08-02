package com.ironsource;

import android.os.OutcomeReceiver;
import kotlin.Result;
import xsna.s3q0;
import xsna.spj;

/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4592v1 {

    /* renamed from: com.ironsource.v1$a */
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ spj<s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(spj<? super s3q0> spjVar) {
            this.a = spjVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            this.a.resumeWith(new Result.Failure(exc));
        }

        public void onResult(Object obj) {
            this.a.resumeWith(s3q0.a);
        }
    }

    public static final OutcomeReceiver a(spj<? super s3q0> spjVar) {
        return new a(spjVar);
    }
}
