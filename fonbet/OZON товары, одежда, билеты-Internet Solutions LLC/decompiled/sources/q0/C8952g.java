package q0;

import com.google.protobuf.DescriptorProtos$FileOptions;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import q0.C8960o;
import r0.C9140t;
import x1.F;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1", f = "ContextMenuGestures.android.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8952g extends kotlin.coroutines.jvm.internal.j implements Function2<F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81313d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f81314e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8960o f81315f;

    /* renamed from: q0.g$a */
    static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8960o f81316b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8960o c8960o) {
            super(1);
            this.f81316b = c8960o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            this.f81316b.b(new C8960o.a.b(c7459e.n()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8952g(C8960o c8960o, kotlin.coroutines.d<? super C8952g> dVar) {
        super(2, dVar);
        this.f81315f = c8960o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C8952g c8952g = new C8952g(this.f81315f, dVar);
        c8952g.f81314e = obj;
        return c8952g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8952g) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81313d;
        if (i11 == 0) {
            Sc.s.b(obj);
            F f7 = (F) this.f81314e;
            a aVar = new a(this.f81315f);
            this.f81313d = 1;
            Object b11 = C9140t.b(f7, new C8953h(aVar, null), this);
            if (b11 != obj2) {
                b11 = Unit.f71690a;
            }
            if (b11 == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
