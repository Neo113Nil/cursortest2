package z60;

import Sc.s;
import android.util.Base64InputStream;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface$saveFile$savedFile$1", f = "ShareFileBridgeInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super File>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f107290d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Base64InputStream f107291e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ U30.d f107292f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f107293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, Base64InputStream base64InputStream, U30.d dVar, String str, kotlin.coroutines.d<? super d> dVar2) {
        super(2, dVar2);
        this.f107290d = eVar;
        this.f107291e = base64InputStream;
        this.f107292f = dVar;
        this.f107293g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f107290d, this.f107291e, this.f107292f, this.f107293g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super File> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        aVar = this.f107290d.f107296d;
        return aVar.a(this.f107291e, this.f107292f, this.f107293g, "tmp");
    }
}
