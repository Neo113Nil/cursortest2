package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9503o extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9500l f90677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9503o(C9500l c9500l) {
        super(1);
        this.f90677b = c9500l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f old = fVar;
        Intrinsics.checkNotNullParameter(old, "old");
        w.a aVar = new w.a(false);
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(old, kotlin.collections.K.f71697a, this.f90677b.j(old.f()), null, aVar, null, null, null, null, null, 2036);
    }
}
