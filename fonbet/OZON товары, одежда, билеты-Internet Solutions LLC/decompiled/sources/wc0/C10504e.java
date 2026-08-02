package wc0;

import Sc.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callFastEntryAction$2", f = "ActionAuthRepositoryImpl.kt", l = {ModuleDescriptor.MODULE_VERSION, 78}, m = "invokeSuspend")
/* renamed from: wc0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10504e extends j implements Function2<M, kotlin.coroutines.d<? super FastEntryActionDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    String f104144d;

    /* renamed from: e, reason: collision with root package name */
    int f104145e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10503d f104146f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f104147g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f104148h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Map<String, Object> f104149i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f104150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10504e(C10503d c10503d, String str, boolean z11, Map<String, ? extends Object> map, boolean z12, kotlin.coroutines.d<? super C10504e> dVar) {
        super(2, dVar);
        this.f104146f = c10503d;
        this.f104147g = str;
        this.f104148h = z11;
        this.f104149i = map;
        this.f104150j = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10504e(this.f104146f, this.f104147g, this.f104148h, this.f104149i, this.f104150j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return ((C10504e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r7 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104145e;
        C10503d c10503d = this.f104146f;
        if (i11 == 0) {
            s.b(obj);
            t2 = c10503d.t(this.f104147g, this.f104148h);
            this.f104144d = t2;
            this.f104145e = 1;
            obj = C10503d.j(c10503d, this.f104149i, this.f104150j, true, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            t2 = this.f104144d;
            s.b(obj);
        }
        ActionApi l11 = C10503d.l(c10503d);
        this.f104144d = null;
        this.f104145e = 2;
        Object fastEntryAuth = l11.fastEntryAuth(t2, (Map) obj, this);
        return fastEntryAuth == aVar ? aVar : fastEntryAuth;
    }
}
