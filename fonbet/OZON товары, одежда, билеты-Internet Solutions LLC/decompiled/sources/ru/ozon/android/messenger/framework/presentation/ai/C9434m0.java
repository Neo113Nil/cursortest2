package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.c;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$handleAction$6$1", f = "AiAssistantViewModel.kt", l = {548}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9434m0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89637d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89638e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f89639f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f89640g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89641h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9434m0(C9414c0 c9414c0, int i11, String str, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9434m0> dVar) {
        super(2, dVar);
        this.f89638e = c9414c0;
        this.f89639f = i11;
        this.f89640g = str;
        this.f89641h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9434m0(this.f89638e, this.f89639f, this.f89640g, this.f89641h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9434m0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89637d;
        String str = this.f89640g;
        int i12 = this.f89639f;
        C9414c0 c9414c0 = this.f89638e;
        if (i11 == 0) {
            Sc.s.b(obj);
            c9414c0.getController().v(new c.a.b(i12, str));
            aVar = c9414c0.f89502e;
            this.f89637d = 1;
            obj = ((C9351a) aVar).o(this.f89641h, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        if (((ru.ozon.android.messenger.utils.i) obj) instanceof i.a) {
            c9414c0.getController().v(new c.a.C1453a(i12, str));
            C9414c0.G0(c9414c0, j.s.f89885a);
        }
        return Unit.f71690a;
    }
}
