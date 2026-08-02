package s60;

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

@e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.gallery.OpenGalleryBridgeInterface$handlePendingCallback$1", f = "OpenGalleryBridgeInterface.kt", l = {71}, m = "invokeSuspend")
/* renamed from: s60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9603a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f98218d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9605c f98219e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC8994a.b f98220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9603a(C9605c c9605c, AbstractC8994a.b bVar, d<? super C9603a> dVar) {
        super(2, dVar);
        this.f98219e = c9605c;
        this.f98220f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C9603a(this.f98219e, this.f98220f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C9603a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Function1 function12;
        Moshi moshi;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98218d;
        C9605c c9605c = this.f98219e;
        if (i11 == 0) {
            s.b(obj);
            C8865b e11 = C9605c.e(c9605c);
            List<Uri> a11 = this.f98220f.a();
            this.f98218d = 1;
            obj = e11.g(a11, this);
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
            function1 = c9605c.f98229h;
            if (function1 != null) {
                ((U50.j) function1).invoke(new NativeResult.Error("Пользователь не выбрал ни одного фото", NativeResult.Error.a.USER_CANCELLED));
            }
        } else {
            function12 = c9605c.f98229h;
            if (function12 != null) {
                moshi = c9605c.f98228g;
                try {
                    str = moshi.c(OpenFileResult.class).toJson(new OpenFileResult(list));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str = "";
                }
                ((U50.j) function12).invoke(new NativeResult.Success(str));
            }
        }
        c9605c.f98229h = null;
        return Unit.f71690a;
    }
}
