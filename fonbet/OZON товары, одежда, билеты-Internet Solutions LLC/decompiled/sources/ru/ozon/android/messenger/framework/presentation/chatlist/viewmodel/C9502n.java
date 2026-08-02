package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9502n extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9500l f90676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9502n(C9500l c9500l) {
        super(1);
        this.f90676b = c9500l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        C9396m c9396m;
        ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
        Intrinsics.checkNotNullParameter(it, "it");
        c9396m = this.f90676b.f90640d;
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, ru.ozon.android.messenger.utils.b.f(it.k(), new C9501m(c9396m.a(new Pair(f.b.PAGINATION_ERROR, new PaginationErrorDTO(PaginationErrorDTO.a.BOTTOM))))), null, null, new w.a(false), null, null, null, null, null, 2038);
    }
}
