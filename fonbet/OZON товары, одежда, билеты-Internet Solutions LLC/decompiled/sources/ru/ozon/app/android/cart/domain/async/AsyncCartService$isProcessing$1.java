package ru.ozon.app.android.cart.domain.async;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "pending", "", "Lru/ozon/app/android/cart/domain/async/UiAction;", "isProc"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService$isProcessing$1", f = "AsyncCartService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartService$isProcessing$1 extends j implements InterfaceC6511n<List<? extends UiAction>, Boolean, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$isProcessing$1(AsyncCartService asyncCartService, d<? super AsyncCartService$isProcessing$1> dVar) {
        super(3, dVar);
        this.this$0 = asyncCartService;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UiAction> list, Boolean bool, d<? super Boolean> dVar) {
        return invoke((List<UiAction>) list, bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z11;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        boolean z12 = this.Z$0;
        List list2 = list;
        AsyncCartService asyncCartService = this.this$0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String pageUrl = ((UiAction) it.next()).getPageUrl();
                str = asyncCartService.currentUrl;
                if (Intrinsics.d(pageUrl, str)) {
                    break;
                }
            }
        }
        if (!z12) {
            z11 = false;
            return Boolean.valueOf(z11);
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }

    public final Object invoke(List<UiAction> list, boolean z11, d<? super Boolean> dVar) {
        AsyncCartService$isProcessing$1 asyncCartService$isProcessing$1 = new AsyncCartService$isProcessing$1(this.this$0, dVar);
        asyncCartService$isProcessing$1.L$0 = list;
        asyncCartService$isProcessing$1.Z$0 = z11;
        return asyncCartService$isProcessing$1.invokeSuspend(Unit.f71690a);
    }
}
