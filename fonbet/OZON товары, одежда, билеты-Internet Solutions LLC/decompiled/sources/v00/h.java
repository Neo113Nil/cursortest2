package v00;

import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f101626a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.submit.SubmitFlagViewModel$1$invokeSuspend$$inlined$map$1$2", f = "SubmitFlagViewModel.kt", l = {223}, m = "emit")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f101627d;

        /* renamed from: e, reason: collision with root package name */
        int f101628e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f101627d = obj;
            this.f101628e |= LinearLayoutManager.INVALID_OFFSET;
            return h.this.emit(null, this);
        }
    }

    public h(InterfaceC2397i interfaceC2397i) {
        this.f101626a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f101628e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f101628e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f101627d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f101628e;
                if (i11 != 0) {
                    s.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((C8029a) obj).e());
                    aVar.f101628e = 1;
                    if (this.f101626a.emit(valueOf, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f101627d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f101628e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
