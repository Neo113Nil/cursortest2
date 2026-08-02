package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2340b3 implements InterfaceC2675tg {
    private final Bb a;
    private final AdSize b;

    /* renamed from: com.ironsource.b3$a */
    static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.a("Load task config is null");
        }
    }

    /* renamed from: com.ironsource.b3$b */
    static final class b extends Lambda implements Function0<IronSourceError> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C2682u5.a.l();
        }
    }

    public C2340b3(Bb bb, AdSize adSize) {
        this.a = bb;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC2675tg
    public void a() {
        a(this.a != null, a.a);
        a(this.b != null, b.a);
    }
}
