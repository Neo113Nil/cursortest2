package q0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import q0.C8952g;
import r0.C9115P;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {53, 56}, m = "invokeSuspend")
/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8953h extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81317d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f81318e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<C7459e, Unit> f81319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8953h(Function1<? super C7459e, Unit> function1, kotlin.coroutines.d<? super C8953h> dVar) {
        super(2, dVar);
        this.f81319f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C8953h c8953h = new C8953h(this.f81319f, dVar);
        c8953h.f81318e = obj;
        return c8953h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8953h) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81317d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f81318e;
            this.f81318e = interfaceC10628c;
            this.f81317d = 1;
            obj = C8954i.a(interfaceC10628c, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                x1.x xVar = (x1.x) obj;
                if (xVar != null) {
                    xVar.a();
                }
                return Unit.f71690a;
            }
            interfaceC10628c = (InterfaceC10628c) this.f81318e;
            Sc.s.b(obj);
        }
        x1.x xVar2 = (x1.x) obj;
        xVar2.a();
        ((C8952g.a) this.f81319f).invoke(C7459e.a(xVar2.f()));
        this.f81318e = null;
        this.f81317d = 2;
        obj = C9115P.h(interfaceC10628c, EnumC10640o.Main, this);
    }
}
