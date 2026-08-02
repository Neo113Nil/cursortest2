package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4236b3 implements InterfaceC4679zg {
    private final Cb a;
    private final AdSize b;

    /* renamed from: com.ironsource.b3$a */
    public static final class a extends Lambda implements gzs<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.a("Load task config is null");
        }
    }

    /* renamed from: com.ironsource.b3$b */
    public static final class b extends Lambda implements gzs<IronSourceError> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4578u5.a.l();
        }
    }

    public C4236b3(Cb cb, AdSize adSize) {
        this.a = cb;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC4679zg
    public void a() {
        a(this.a != null, a.a);
        a(this.b != null, b.a);
    }
}
