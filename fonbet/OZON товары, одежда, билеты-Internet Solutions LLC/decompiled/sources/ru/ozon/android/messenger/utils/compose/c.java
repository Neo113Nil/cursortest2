package ru.ozon.android.messenger.utils.compose;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    static final class a extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f91864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(3);
            this.f91864b = function0;
        }

        @Override // fd.InterfaceC6511n
        public final e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
            e composed = eVar;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC3967k2.o(1877248434);
            interfaceC3967k2.o(1769590360);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(1769592888);
            Function0<Unit> function0 = this.f91864b;
            boolean n11 = interfaceC3967k2.n(function0);
            Object C12 = interfaceC3967k2.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b(function0, interfaceC3978p0);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            e a11 = androidx.compose.ui.layout.c.a(composed, (Function1) C12);
            interfaceC3967k2.k();
            return a11;
        }
    }

    @NotNull
    public static final e a(@NotNull e eVar, @NotNull Function0<Unit> callback) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b11 = androidx.compose.ui.c.b(eVar, C5236c1.a(), new a(callback));
        return b11;
    }
}
