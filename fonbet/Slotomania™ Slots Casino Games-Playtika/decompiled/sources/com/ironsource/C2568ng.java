package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2568ng implements InterfaceC2532lg {
    public static final C2568ng a = new C2568ng();
    private static final Lazy b = LazyKt.lazy(a.a);

    /* renamed from: com.ironsource.ng$a */
    static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                Object invoke = Class.forName(C2550mg.a).getMethod("getVersion", null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                C2556n4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C2568ng() {
    }

    @Override // com.ironsource.InterfaceC2532lg
    public String a() {
        return (String) b.getValue();
    }
}
