package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4672z9 implements InterfaceC4679zg {
    private final Cb a;

    /* renamed from: com.ironsource.z9$a */
    public static final class a extends Lambda implements gzs<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.b("Load task config is null");
        }
    }

    public C4672z9(Cb cb) {
        this.a = cb;
    }

    @Override // com.ironsource.InterfaceC4679zg
    public void a() {
        a(this.a != null, a.a);
    }
}
