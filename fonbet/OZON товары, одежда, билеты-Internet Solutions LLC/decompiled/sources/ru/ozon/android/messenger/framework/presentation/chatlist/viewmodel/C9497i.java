package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Sc.r;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9497i extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90631b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90632c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.input.b f90633d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9490b f90634e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Boolean f90635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9497i(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.presentation.models.q qVar2, ru.ozon.android.messenger.blocks.input.b bVar, C9490b c9490b, Boolean bool) {
        super(1);
        this.f90631b = qVar;
        this.f90632c = qVar2;
        this.f90633d = bVar;
        this.f90634e = c9490b;
        this.f90635f = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        Integer num;
        Object obj;
        Object a11;
        ru.ozon.android.messenger.blocks.chat.common.m d11;
        Object obj2;
        ru.ozon.android.messenger.blocks.chat.common.m d12;
        ru.ozon.android.messenger.blocks.chat.common.m d13;
        ru.ozon.android.messenger.framework.data.repository.H h11;
        List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        ru.ozon.android.messenger.blocks.input.b bVar = this.f90633d;
        C9490b c9490b = this.f90634e;
        ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f90632c;
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = this.f90631b;
        if ((qVar2 != null && qVar.c().c() <= qVar2.c().c()) || !bVar.e()) {
            h11 = c9490b.f90618d;
            qVar = h11.d(qVar, qVar2, bVar);
        }
        Iterator<T> it = qVar.b().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ru.ozon.android.messenger.framework.presentation.models.u) obj).c() instanceof ru.ozon.android.messenger.blocks.chat.common.b) {
                break;
            }
        }
        if (!(obj instanceof ru.ozon.android.messenger.blocks.chat.common.b)) {
            obj = null;
        }
        ru.ozon.android.messenger.blocks.chat.common.b bVar2 = (ru.ozon.android.messenger.blocks.chat.common.b) obj;
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it2 = transform.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it2.next()), ru.ozon.android.messenger.framework.presentation.models.r.d(qVar))) {
                break;
            }
            i11++;
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ru.ozon.android.messenger.framework.presentation.models.q qVar3 = transform.get(intValue);
            transform.remove(qVar3);
            Integer valueOf2 = Integer.valueOf(intValue);
            Iterator<T> it3 = qVar3.b().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((ru.ozon.android.messenger.framework.presentation.models.u) obj2).c() instanceof ru.ozon.android.messenger.blocks.chat.common.b) {
                    break;
                }
            }
            ru.ozon.android.messenger.blocks.chat.common.b bVar3 = (ru.ozon.android.messenger.blocks.chat.common.b) (obj2 instanceof ru.ozon.android.messenger.blocks.chat.common.b ? obj2 : null);
            c9490b.getClass();
            if ((bVar3 == null || (d13 = bVar3.d()) == null || d13.b() != 0) && bVar2 != null && (d12 = bVar2.d()) != null && d12.b() == 0) {
                InterfaceC9460a.f90044l0.getClass();
                InterfaceC9460a.C1664a.a().remove(bVar2.getBlockId().a());
            }
            num = valueOf2;
        }
        Boolean bool = this.f90635f;
        try {
            r.Companion companion = Sc.r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (Intrinsics.d(bool, Boolean.TRUE) && bVar2 != null && (d11 = bVar2.d()) != null && d11.b() == 0) {
            return Unit.f71690a;
        }
        C9490b.f(c9490b, transform, qVar, num);
        a11 = Unit.f71690a;
        if (Sc.r.b(a11) != null) {
            Lm0.a.f17149a.d("Block " + qVar + " was removed", new Object[0]);
        }
        return Unit.f71690a;
    }
}
