package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.input.b;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.ai.O;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleAction$3$1", f = "AiAssistantViewModel.kt", l = {452, 466, 474, 489, 490}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9424h0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f89607d;

    /* renamed from: e, reason: collision with root package name */
    Object f89608e;

    /* renamed from: f, reason: collision with root package name */
    Object f89609f;

    /* renamed from: g, reason: collision with root package name */
    Object f89610g;

    /* renamed from: h, reason: collision with root package name */
    ru.ozon.android.messenger.framework.navigation.action.a f89611h;

    /* renamed from: i, reason: collision with root package name */
    int f89612i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89613j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89614k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ d.f f89615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9424h0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, d.f fVar, kotlin.coroutines.d<? super C9424h0> dVar) {
        super(2, dVar);
        this.f89613j = c9414c0;
        this.f89614k = aVar;
        this.f89615l = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9424h0(this.f89613j, this.f89614k, this.f89615l, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9424h0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        if (xe.Y.b(500, r17) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (r2 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        ru.ozon.android.messenger.framework.presentation.mapper.a aVar;
        Object i11;
        String str;
        String str2;
        ru.ozon.android.messenger.framework.domain.usecases.P p12;
        ru.ozon.android.messenger.framework.presentation.mapper.a aVar2;
        Object i12;
        LinkedHashMap L02;
        ru.ozon.android.messenger.utils.i iVar;
        String str3;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3;
        ru.ozon.android.messenger.utils.i iVar2;
        String str4;
        ru.ozon.android.messenger.framework.domain.usecases.F f7;
        f.a aVar4;
        ru.ozon.android.messenger.framework.navigation.action.a aVar5;
        C9414c0 c9414c0;
        Wc.a aVar6 = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f89612i;
        ru.ozon.android.messenger.framework.navigation.action.a aVar7 = this.f89614k;
        C9414c0 c9414c02 = this.f89613j;
        if (i13 == 0) {
            Sc.s.b(obj);
            String k02 = C9414c0.k0(c9414c02, aVar7, "prefillMessage");
            String k03 = C9414c0.k0(c9414c02, aVar7, "text");
            String k04 = C9414c0.k0(c9414c02, aVar7, "send_type");
            if (k02 == null) {
                if (k03 == null) {
                    return Unit.f71690a;
                }
                k02 = k03;
            }
            String k05 = C9414c0.k0(c9414c02, aVar7, "chatId");
            if (k05 == null) {
                return Unit.f71690a;
            }
            C9414c0.E0(c9414c02, new O.a(k02));
            c9414c02.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING));
            if (Intrinsics.d(k04, "new")) {
                p12 = c9414c02.f89509l;
                aVar2 = c9414c02.f89511n;
                g.a a11 = aVar2.a(new z0.b(k02, this.f89615l.a().c().getParams()), k05, false);
                this.f89612i = 1;
                i12 = p12.i(a11, this);
            } else {
                p11 = c9414c02.f89509l;
                aVar = c9414c02.f89511n;
                g.a a12 = aVar.a(new z0.a(k02), k05, true);
                this.f89607d = k02;
                this.f89608e = k05;
                this.f89612i = 3;
                i11 = p11.i(a12, this);
                if (i11 != aVar6) {
                    str = k02;
                    str2 = k05;
                    iVar = (ru.ozon.android.messenger.utils.i) i11;
                    if (iVar instanceof i.b) {
                    }
                    if (iVar instanceof i.a) {
                    }
                    return Unit.f71690a;
                }
            }
            return aVar6;
        }
        if (i13 == 1) {
            Sc.s.b(obj);
            i12 = obj;
            ru.ozon.android.messenger.utils.i iVar3 = (ru.ozon.android.messenger.utils.i) i12;
            if (iVar3 instanceof i.b) {
                ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar8 = c9414c02.f89506i;
                L02 = c9414c02.L0(aVar7);
                a.C1665a.a(aVar8, L02);
            }
            if (iVar3 instanceof i.a) {
                this.f89607d = iVar3;
                this.f89608e = c9414c02;
                this.f89612i = 2;
            }
            return Unit.f71690a;
        }
        if (i13 == 2) {
            c9414c02 = (C9414c0) this.f89608e;
            Sc.s.b(obj);
            c9414c02.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT));
            return Unit.f71690a;
        }
        if (i13 == 3) {
            str2 = (String) this.f89608e;
            str = (String) this.f89607d;
            Sc.s.b(obj);
            i11 = obj;
            iVar = (ru.ozon.android.messenger.utils.i) i11;
            if (iVar instanceof i.b) {
                c9414c02.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY));
            }
            if (iVar instanceof i.a) {
                this.f89607d = str;
                this.f89608e = str2;
                this.f89609f = iVar;
                this.f89610g = c9414c02;
                this.f89611h = aVar7;
                this.f89612i = 4;
                if (xe.Y.b(500L, this) != aVar6) {
                    str3 = str2;
                    aVar3 = aVar7;
                    iVar2 = iVar;
                    str4 = str;
                    f7 = c9414c02.f89510m;
                    aVar4 = new f.a(str3);
                    this.f89607d = str4;
                    this.f89608e = iVar2;
                    this.f89609f = c9414c02;
                    this.f89610g = aVar3;
                    this.f89611h = null;
                    this.f89612i = 5;
                    if (f7.g(aVar4, this) != aVar6) {
                    }
                }
                return aVar6;
            }
            return Unit.f71690a;
        }
        if (i13 != 4) {
            if (i13 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar5 = (ru.ozon.android.messenger.framework.navigation.action.a) this.f89610g;
            c9414c0 = (C9414c0) this.f89609f;
            str4 = (String) this.f89607d;
            Sc.s.b(obj);
            c9414c0.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT));
            if (Intrinsics.d(C9414c0.k0(c9414c0, aVar5, "textRestoreStrategy"), "onError")) {
                c9414c0.getController().v(new b.C1460b(str4));
            }
            return Unit.f71690a;
        }
        ru.ozon.android.messenger.framework.navigation.action.a aVar9 = this.f89611h;
        c9414c02 = (C9414c0) this.f89610g;
        iVar2 = (ru.ozon.android.messenger.utils.i) this.f89609f;
        String str5 = (String) this.f89608e;
        String str6 = (String) this.f89607d;
        Sc.s.b(obj);
        aVar3 = aVar9;
        str4 = str6;
        str3 = str5;
        f7 = c9414c02.f89510m;
        aVar4 = new f.a(str3);
        this.f89607d = str4;
        this.f89608e = iVar2;
        this.f89609f = c9414c02;
        this.f89610g = aVar3;
        this.f89611h = null;
        this.f89612i = 5;
        if (f7.g(aVar4, this) != aVar6) {
            aVar5 = aVar3;
            c9414c0 = c9414c02;
            c9414c0.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT));
            if (Intrinsics.d(C9414c0.k0(c9414c0, aVar5, "textRestoreStrategy"), "onError")) {
            }
            return Unit.f71690a;
        }
        return aVar6;
    }
}
