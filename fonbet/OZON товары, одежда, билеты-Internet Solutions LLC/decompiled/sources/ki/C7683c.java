package ki;

import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: ki.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7683c<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f71610a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f71611b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1$2", f = "ButtonUtils.kt", l = {223}, m = "emit")
    /* renamed from: ki.c$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f71612d;

        /* renamed from: e, reason: collision with root package name */
        int f71613e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71612d = obj;
            this.f71613e |= LinearLayoutManager.INVALID_OFFSET;
            return C7683c.this.emit(null, this);
        }
    }

    public C7683c(InterfaceC2397i interfaceC2397i, InterfaceC3978p0 interfaceC3978p0) {
        this.f71610a = interfaceC2397i;
        this.f71611b = interfaceC3978p0;
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
            int i12 = aVar.f71613e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f71613e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f71612d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f71613e;
                if (i11 != 0) {
                    s.b(obj2);
                    if (((Boolean) obj).booleanValue() && ((Boolean) this.f71611b.getValue()).booleanValue()) {
                        aVar.f71613e = 1;
                        if (this.f71610a.emit(obj, aVar) == aVar2) {
                            return aVar2;
                        }
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
        Object obj22 = aVar.f71612d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f71613e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
