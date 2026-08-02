package ru.ozon.app.android.favorites.ui.actionhandler.utils;

import De.s;
import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/favorites/ui/actionhandler/utils/ActionsUtilsKt$actionExceptionHandlerInternal$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionsUtilsKt$actionExceptionHandlerInternal$$inlined$CoroutineExceptionHandler$1 extends a implements J {
    final /* synthetic */ InterfaceC7851b $composerController$inlined;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs$inlined;
    final /* synthetic */ B $lifecycleScope$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsUtilsKt$actionExceptionHandlerInternal$$inlined$CoroutineExceptionHandler$1(J.a aVar, InterfaceC7851b interfaceC7851b, B b11, CustomActionHandler.HandlerReferences handlerReferences) {
        super(aVar);
        this.$composerController$inlined = interfaceC7851b;
        this.$lifecycleScope$inlined = b11;
        this.$handlerRefs$inlined = handlerReferences;
    }

    @Override // xe.J
    public void handleException(CoroutineContext context, Throwable exception) {
        Lm0.a.f17149a.e(exception);
        this.$composerController$inlined.hideLoader();
        B b11 = this.$lifecycleScope$inlined;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(b11, s.f6650a.x(), null, new ActionsUtilsKt$actionExceptionHandlerInternal$1$1(this.$handlerRefs$inlined, null), 2);
    }
}
