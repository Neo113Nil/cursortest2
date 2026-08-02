package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f84706b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(m mVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84706b = mVar;
        this.f84707c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            List<q> b11 = this.f84706b.b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = b11.iterator();
            while (it.hasNext()) {
                C7714v.p(ru.ozon.android.messenger.framework.presentation.models.f.b((q) it.next()), arrayList);
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ru.ozon.android.messenger.framework.presentation.models.e) it2.next()).b());
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof ru.ozon.android.messenger.blocks.chatGroups.a) {
                    arrayList3.add(next);
                }
            }
            interfaceC3967k2.o(-1320186524);
            boolean n11 = interfaceC3967k2.n(arrayList3);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                boolean z11 = true;
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (!((ru.ozon.android.messenger.blocks.chatGroups.a) it4.next()).h()) {
                            z11 = false;
                            break;
                        }
                    }
                }
                C11 = n1.f(Boolean.valueOf(z11), D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            boolean booleanValue = ((Boolean) ((InterfaceC3978p0) C11).getValue()).booleanValue();
            interfaceC3967k2.o(-1320177900);
            ru.ozon.android.messenger.framework.core.d dVar = this.f84707c;
            boolean F11 = interfaceC3967k2.F(dVar);
            Object C12 = interfaceC3967k2.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new e(dVar);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.blocks.chatGroups.compose.e.a(aVar, arrayList3, booleanValue, (Function1) C12, interfaceC3967k2, 6);
        }
        return Unit.f71690a;
    }
}
