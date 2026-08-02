package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.SendButtonModeDTO;
import ru.ozon.android.messenger.blocks.input.e;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<List<? extends q>, List<? extends q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f89861b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f89862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, boolean z11) {
        super(1);
        this.f89861b = kVar;
        this.f89862c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<? extends q> invoke(List<? extends q> list) {
        Object obj;
        ru.ozon.android.messenger.blocks.input.e eVar;
        List<? extends q> current = list;
        Intrinsics.checkNotNullParameter(current, "current");
        List<? extends q> list2 = current;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (q qVar : list2) {
            if (k.g(this.f89861b, qVar)) {
                List<u> b11 = qVar.b();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : b11) {
                    if (!(((u) obj2).c() instanceof ru.ozon.android.messenger.blocks.replyInputBlock.e)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar = (u) it.next();
                    ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar.c();
                    if (c11 instanceof ru.ozon.android.messenger.blocks.input.d) {
                        ru.ozon.android.messenger.blocks.input.d dVar = (ru.ozon.android.messenger.blocks.input.d) c11;
                        Iterator<T> it2 = dVar.j().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.d(((SendButtonModeDTO) obj).getModeName(), "DEFAULT")) {
                                break;
                            }
                        }
                        SendButtonModeDTO sendButtonModeDTO = (SendButtonModeDTO) obj;
                        ru.ozon.android.messenger.blocks.input.e eVar2 = e.a.f85533a;
                        if (sendButtonModeDTO != null) {
                            String modeName = sendButtonModeDTO.getModeName();
                            ru.ozon.android.messenger.blocks.input.e eVar3 = Intrinsics.d(modeName, "DEFAULT") ? eVar2 : Intrinsics.d(modeName, "EDIT") ? e.b.f85534a : Intrinsics.d(modeName, "REPLY") ? e.c.f85535a : null;
                            if (eVar3 != null) {
                                eVar = eVar3;
                                boolean z11 = this.f89862c;
                                uVar = u.a(uVar, ru.ozon.android.messenger.blocks.input.d.a(dVar, !z11 ? dVar.k() : "", z11 ? dVar.f() : null, eVar, false, null, 4973));
                            }
                        }
                        eVar = eVar2;
                        boolean z112 = this.f89862c;
                        uVar = u.a(uVar, ru.ozon.android.messenger.blocks.input.d.a(dVar, !z112 ? dVar.k() : "", z112 ? dVar.f() : null, eVar, false, null, 4973));
                    }
                    arrayList3.add(uVar);
                }
                qVar = q.a(qVar, arrayList3, null, 2);
            }
            arrayList.add(qVar);
        }
        return arrayList;
    }
}
