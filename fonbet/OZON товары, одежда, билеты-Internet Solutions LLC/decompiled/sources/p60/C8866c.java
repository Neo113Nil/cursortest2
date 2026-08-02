package p60;

import Sc.C4001c;
import Sc.s;
import android.net.Uri;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.common.models.OpenBridgeResultData;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.M;

@e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.common.OpenBridgeInteractor$processUris$2", f = "OpenBridgeInteractor.kt", l = {}, m = "invokeSuspend")
/* renamed from: p60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8866c extends j implements Function2<M, kotlin.coroutines.d<? super List<? extends OpenBridgeResultData>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8865b f80295d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<Uri> f80296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8866c(C8865b c8865b, List<? extends Uri> list, kotlin.coroutines.d<? super C8866c> dVar) {
        super(2, dVar);
        this.f80295d = c8865b;
        this.f80296e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8866c(this.f80295d, this.f80296e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends OpenBridgeResultData>> dVar) {
        return ((C8866c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q90.c cVar;
        U30.a aVar;
        InterfaceC6618a interfaceC6618a;
        OpenBridgeResultData openBridgeResultData;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        C8865b c8865b = this.f80295d;
        cVar = c8865b.f80288d;
        FeatureValue b11 = cVar.q(S90.c.MOB_PHOTO_COMPRESS_PERCENT).b();
        aVar = c8865b.f80287c;
        aVar.g(TimeUnit.HOURS.toMillis(1L), "base64", true);
        List<Uri> list = this.f80296e;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                openBridgeResultData = C8865b.d(c8865b, (Uri) it.next(), b11);
            } catch (Exception e11) {
                L80.a.b("OpenBridgeInteractor", String.valueOf(e11.getMessage()));
                interfaceC6618a = c8865b.f80286b;
                interfaceC6618a.J1(String.valueOf(e11.getMessage()), C4001c.b(e11));
                openBridgeResultData = new OpenBridgeResultData(null, null, null, String.valueOf(e11.getMessage()));
            }
            arrayList.add(openBridgeResultData);
        }
        return arrayList;
    }
}
