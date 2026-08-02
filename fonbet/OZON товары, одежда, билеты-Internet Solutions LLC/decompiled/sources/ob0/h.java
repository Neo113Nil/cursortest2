package ob0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import wb0.C10469a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler", f = "AntibotActionHandler.kt", l = {112, 114, 117, 119, 126, UserVerificationMethods.USER_VERIFY_PATTERN, 135, 136}, m = "runAntibotFlow")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f77941d;

    /* renamed from: e, reason: collision with root package name */
    C10469a f77942e;

    /* renamed from: f, reason: collision with root package name */
    s.e f77943f;

    /* renamed from: g, reason: collision with root package name */
    s.g f77944g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f77945h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ l f77946i;

    /* renamed from: j, reason: collision with root package name */
    int f77947j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f77946i = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f77945h = obj;
        this.f77947j |= LinearLayoutManager.INVALID_OFFSET;
        return l.g(this.f77946i, null, this);
    }
}
