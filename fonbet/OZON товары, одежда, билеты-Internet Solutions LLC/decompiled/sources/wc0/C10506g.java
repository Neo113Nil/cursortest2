package wc0;

import Sc.InterfaceC4008j;
import Sc.s;
import android.net.Uri;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.action.ActionAuthRepositoryImpl$callVkIdAuthRedirectAction$2", f = "ActionAuthRepositoryImpl.kt", l = {131, 134}, m = "invokeSuspend")
/* renamed from: wc0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10506g extends j implements Function2<M, kotlin.coroutines.d<? super FastEntryActionDTO>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Uri.Builder f104154d;

    /* renamed from: e, reason: collision with root package name */
    String f104155e;

    /* renamed from: f, reason: collision with root package name */
    int f104156f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10503d f104157g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f104158h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Map<String, Object> f104159i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10506g(C10503d c10503d, String str, Map<String, ? extends Object> map, kotlin.coroutines.d<? super C10506g> dVar) {
        super(2, dVar);
        this.f104157g = c10503d;
        this.f104158h = str;
        this.f104159i = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10506g(this.f104157g, this.f104158h, this.f104159i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return ((C10506g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Uri.Builder builder;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104156f;
        C10503d c10503d = this.f104157g;
        if (i11 == 0) {
            s.b(obj);
            Uri.Builder appendQueryParameter = Uri.parse(C10503d.u(c10503d, this.f104158h)).buildUpon().appendQueryParameter("hasBiometrics", String.valueOf(C10503d.n(c10503d).available()));
            interfaceC4008j = c10503d.f104120e;
            vc0.c cVar = (vc0.c) interfaceC4008j.getValue();
            this.f104154d = appendQueryParameter;
            this.f104155e = "device_id";
            this.f104156f = 1;
            Object b11 = cVar.b(this);
            if (b11 != aVar) {
                builder = appendQueryParameter;
                obj = b11;
                str = "device_id";
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        str = this.f104155e;
        builder = this.f104154d;
        s.b(obj);
        String uri = builder.appendQueryParameter(str, (String) obj).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ActionApi l11 = C10503d.l(c10503d);
        this.f104154d = null;
        this.f104155e = null;
        this.f104156f = 2;
        Object ozonIdSocialAuthRedirect = l11.ozonIdSocialAuthRedirect(uri, this.f104159i, this);
        return ozonIdSocialAuthRedirect == aVar ? aVar : ozonIdSocialAuthRedirect;
    }
}
