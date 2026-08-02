package ru.ozon.android.messenger.blocks.messagetext.compose;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f85821a = new C4912a(false, -985198622, C1514a.f85822b);

    /* renamed from: ru.ozon.android.messenger.blocks.messagetext.compose.a$a, reason: collision with other inner class name */
    static final class C1514a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1514a f85822b = new C1514a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            }
            return Unit.f71690a;
        }
    }
}
