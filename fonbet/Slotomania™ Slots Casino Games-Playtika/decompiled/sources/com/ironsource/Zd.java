package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Zd implements InterfaceC2675tg {
    private final Bb a;

    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.d("Load task config is null");
        }
    }

    public Zd(Bb bb) {
        this.a = bb;
    }

    @Override // com.ironsource.InterfaceC2675tg
    public void a() {
        a(this.a != null, a.a);
    }
}
