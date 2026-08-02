package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes13.dex */
public final class Zd implements InterfaceC4679zg {
    private final Cb a;

    public static final class a extends Lambda implements gzs<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.d("Load task config is null");
        }
    }

    public Zd(Cb cb) {
        this.a = cb;
    }

    @Override // com.ironsource.InterfaceC4679zg
    public void a() {
        a(this.a != null, a.a);
    }
}
