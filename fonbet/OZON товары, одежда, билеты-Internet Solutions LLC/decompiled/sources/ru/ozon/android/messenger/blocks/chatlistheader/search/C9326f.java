package ru.ozon.android.messenger.blocks.chatlistheader.search;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.layout.T;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9326f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatlistheader.f f84803b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f84804c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9326f(ru.ozon.android.messenger.blocks.chatlistheader.f fVar, float f7, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84803b = fVar;
        this.f84804c = f7;
        this.f84805d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.blocks.chatlistheader.f fVar = this.f84803b;
            Object obj = (f.c.a) fVar.d();
            interfaceC3967k2.o(935895851);
            boolean n11 = interfaceC3967k2.n(obj);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.valueOf(((f.c.a) fVar.d()).l()), D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(935901113);
            boolean n12 = interfaceC3967k2.n(fVar);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.valueOf(fVar.b()), D1.f25195a);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.framework.navigation.action.a aVar = new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, null, ru.ozon.android.messenger.framework.navigation.action.d.OPEN_SEARCH.a(), null, 10, null), null, null, 6);
            androidx.compose.ui.e j11 = T.j(androidx.compose.ui.e.f40358c0, 16, 0.0f, this.f84804c, 0.0f, 10);
            f.c.a aVar2 = (f.c.a) fVar.d();
            List<f.b> c11 = fVar.c();
            boolean booleanValue = ((Boolean) ((InterfaceC3978p0) C12).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
            interfaceC3967k2.o(935926754);
            boolean F11 = interfaceC3967k2.F(fVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f84805d;
            boolean F12 = F11 | interfaceC3967k2.F(dVar) | interfaceC3967k2.F(aVar);
            Object C13 = interfaceC3967k2.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C9321a(fVar, dVar, aVar);
                interfaceC3967k2.x(C13);
            }
            Function0 function0 = (Function0) C13;
            interfaceC3967k2.k();
            interfaceC3967k2.o(935935104);
            boolean F13 = interfaceC3967k2.F(fVar) | interfaceC3967k2.F(dVar);
            Object C14 = interfaceC3967k2.C();
            if (F13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C9322b(fVar, dVar);
                interfaceC3967k2.x(C14);
            }
            Function0 function02 = (Function0) C14;
            interfaceC3967k2.k();
            interfaceC3967k2.o(935951605);
            boolean F14 = interfaceC3967k2.F(fVar) | interfaceC3967k2.F(dVar);
            Object C15 = interfaceC3967k2.C();
            if (F14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C9323c(fVar, dVar);
                interfaceC3967k2.x(C15);
            }
            Function0 function03 = (Function0) C15;
            interfaceC3967k2.k();
            interfaceC3967k2.o(935971749);
            boolean F15 = interfaceC3967k2.F(dVar);
            Object C16 = interfaceC3967k2.C();
            if (F15 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C9324d(dVar);
                interfaceC3967k2.x(C16);
            }
            Function1 function1 = (Function1) C16;
            interfaceC3967k2.k();
            interfaceC3967k2.o(935990461);
            boolean F16 = interfaceC3967k2.F(dVar);
            Object C17 = interfaceC3967k2.C();
            if (F16 || C17 == InterfaceC3967k.a.a()) {
                C17 = new C9325e(dVar);
                interfaceC3967k2.x(C17);
            }
            interfaceC3967k2.k();
            G.a(j11, aVar2, c11, booleanValue, booleanValue2, function0, function02, function03, function1, (Function1) C17, interfaceC3967k2, (IconDTO.$stable | IconTitleSubtitleCellDTO.$stable) << 6);
        }
        return Unit.f71690a;
    }
}
