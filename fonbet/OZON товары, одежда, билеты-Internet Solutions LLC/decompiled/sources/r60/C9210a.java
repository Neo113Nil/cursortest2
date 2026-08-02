package r60;

import Sc.s;
import android.net.Uri;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p60.C8865b;
import q60.AbstractC8994a;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.models.OpenFileResult;
import xe.M;

@e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.OpenFileBridgeInterface$handlePendingCallback$1", f = "OpenFileBridgeInterface.kt", l = {76}, m = "invokeSuspend")
/* renamed from: r60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9210a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83186d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9212c f83187e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC8994a.C1378a f83188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9210a(C9212c c9212c, AbstractC8994a.C1378a c1378a, d<? super C9210a> dVar) {
        super(2, dVar);
        this.f83187e = c9212c;
        this.f83188f = c1378a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C9210a(this.f83187e, this.f83188f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C9210a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Function1 function12;
        Moshi c11;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83186d;
        C9212c c9212c = this.f83187e;
        if (i11 == 0) {
            s.b(obj);
            C8865b h11 = C9212c.h(c9212c);
            List<Uri> a11 = this.f83188f.a();
            this.f83186d = 1;
            obj = h11.g(a11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            function1 = c9212c.f83197i;
            if (function1 != null) {
                ((U50.j) function1).invoke(new NativeResult.Error("Пользователь не выбрал ни одного файла", NativeResult.Error.a.USER_CANCELLED));
            }
        } else {
            function12 = c9212c.f83197i;
            if (function12 != null) {
                c11 = c9212c.c();
                try {
                    str = c11.c(OpenFileResult.class).toJson(new OpenFileResult(list));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str = "";
                }
                ((U50.j) function12).invoke(new NativeResult.Success(str));
            }
        }
        c9212c.f83197i = null;
        return Unit.f71690a;
    }
}
