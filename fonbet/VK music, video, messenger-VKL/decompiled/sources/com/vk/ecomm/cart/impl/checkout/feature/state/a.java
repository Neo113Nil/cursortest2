package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import java.util.function.BiFunction;
import xsna.b7r;
import xsna.f060;
import xsna.wzs;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class a {

    /* compiled from: CheckoutFormStructure.kt */
    /* renamed from: com.vk.ecomm.cart.impl.checkout.feature.state.a$a, reason: collision with other inner class name */
    public static final class C0925a implements BiFunction {
        public final /* synthetic */ wzs a;

        public C0925a(wzs wzsVar) {
            this.a = wzsVar;
        }

        @Override // java.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.a.invoke(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(b7r b7rVar) {
        f060 f060Var = b7rVar instanceof f060 ? (f060) b7rVar : null;
        if (f060Var != null) {
            return f060Var.a() instanceof k.b;
        }
        return true;
    }
}
