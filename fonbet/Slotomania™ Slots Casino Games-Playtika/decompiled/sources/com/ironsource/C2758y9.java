package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2758y9 implements InterfaceC2675tg {
    private final Bb a;

    /* renamed from: com.ironsource.y9$a */
    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.b("Load task config is null");
        }
    }

    public C2758y9(Bb bb) {
        this.a = bb;
    }

    @Override // com.ironsource.InterfaceC2675tg
    public void a() {
        a(this.a != null, a.a);
    }
}
