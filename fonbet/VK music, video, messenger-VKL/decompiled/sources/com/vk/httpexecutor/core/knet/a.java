package com.vk.httpexecutor.core.knet;

import com.vk.toggle.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;
import xsna.xjy;

/* compiled from: KnetExecutorTypeProvider.kt */
/* loaded from: classes.dex */
public final class a {
    public final gzs<KnetExecutorType> a;
    public volatile KnetExecutorType b;

    /* compiled from: KnetExecutorTypeProvider.kt */
    /* renamed from: com.vk.httpexecutor.core.knet.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1088a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a aVar = (a) this.receiver;
            synchronized (aVar) {
                aVar.b = null;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(gzs<? extends KnetExecutorType> gzsVar) {
        this.a = gzsVar;
        b.A.u(new C1088a(0, this, a.class, "clearCache", "clearCache()V", 0), null);
    }

    public a() {
        this(xjy.b);
    }
}
