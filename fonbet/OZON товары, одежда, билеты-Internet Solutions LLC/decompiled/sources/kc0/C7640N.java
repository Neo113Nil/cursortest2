package kc0;

import fd.InterfaceC6511n;
import kotlin.Unit;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$submitButtonEnabledFlow$1", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: kc0.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7640N extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<CharSequence, ru.ozon.id.nativeauth.data.models.b, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ CharSequence f71301d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ ru.ozon.id.nativeauth.data.models.b f71302e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(CharSequence charSequence, ru.ozon.id.nativeauth.data.models.b bVar, kotlin.coroutines.d<? super Boolean> dVar) {
        C7640N c7640n = new C7640N(3, dVar);
        c7640n.f71301d = charSequence;
        c7640n.f71302e = bVar;
        return c7640n.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        CharSequence charSequence = this.f71301d;
        ru.ozon.id.nativeauth.data.models.b bVar = this.f71302e;
        return Boolean.valueOf(bVar.g() != null && (bVar.e() == null || charSequence.length() > 0));
    }
}
