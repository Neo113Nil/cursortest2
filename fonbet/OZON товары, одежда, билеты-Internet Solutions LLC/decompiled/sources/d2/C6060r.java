package d2;

import androidx.compose.ui.platform.Z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {377}, m = "invokeSuspend")
/* renamed from: d2.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6060r extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61069d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f61070e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6034K f61071f;

    /* renamed from: d2.r$a */
    static final class a extends AbstractC7737t implements Function1<Long, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61072b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            l11.longValue();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6060r(C6034K c6034k, kotlin.coroutines.d<? super C6060r> dVar) {
        super(2, dVar);
        this.f61071f = c6034k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C6060r c6060r = new C6060r(this.f61071f, dVar);
        c6060r.f61070e = obj;
        return c6060r;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6060r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        xe.M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61069d;
        if (i11 == 0) {
            Sc.s.b(obj);
            m11 = (xe.M) this.f61070e;
            if (xe.N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (xe.M) this.f61070e;
            Sc.s.b(obj);
            this.f61071f.g();
            if (xe.N.f(m11)) {
                this.f61070e = m11;
                this.f61069d = 1;
                if (Z0.a(a.f61072b, this) == aVar) {
                    return aVar;
                }
                this.f61071f.g();
                if (xe.N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
