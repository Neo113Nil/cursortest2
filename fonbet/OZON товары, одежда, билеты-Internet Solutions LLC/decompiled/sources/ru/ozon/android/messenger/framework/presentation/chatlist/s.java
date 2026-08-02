package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MFragmentChatListBinding;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListViewDelegate$submitChatBlocks$1$1", f = "ChatListViewDelegate.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90549d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f90550e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f90551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(w wVar, k kVar, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f90550e = wVar;
        this.f90551f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f90550e, this.f90551f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MFragmentChatListBinding mFragmentChatListBinding;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90549d;
        w wVar = this.f90550e;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (!wVar.a()) {
                this.f90549d = 1;
                if (Y.b(200L, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        k kVar = this.f90551f;
        k.m(kVar, wVar);
        mFragmentChatListBinding = kVar.f90497f;
        FrameLayout constraintLayout = mFragmentChatListBinding.progressBar.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(wVar.a() ? 0 : 8);
        return Unit.f71690a;
    }
}
