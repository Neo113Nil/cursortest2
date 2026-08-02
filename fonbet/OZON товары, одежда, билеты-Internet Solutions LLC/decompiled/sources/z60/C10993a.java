package z60;

import Sc.s;
import android.net.Uri;
import android.util.Base64InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface$copyFileToDownloads$2", f = "ShareFileBridgeInterface.kt", l = {}, m = "invokeSuspend")
/* renamed from: z60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10993a extends j implements Function2<M, kotlin.coroutines.d<? super Uri>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f107270d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f107271e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Base64InputStream f107272f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ U30.d f107273g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f107274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10993a(e eVar, String str, Base64InputStream base64InputStream, U30.d dVar, String str2, kotlin.coroutines.d<? super C10993a> dVar2) {
        super(2, dVar2);
        this.f107270d = eVar;
        this.f107271e = str;
        this.f107272f = base64InputStream;
        this.f107273g = dVar;
        this.f107274h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10993a(this.f107270d, this.f107271e, this.f107272f, this.f107273g, this.f107274h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Uri> dVar) {
        return ((C10993a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        e eVar = this.f107270d;
        aVar = eVar.f107296d;
        Base64InputStream base64InputStream = this.f107272f;
        String str = this.f107271e;
        Uri r11 = aVar.r(base64InputStream, str);
        if (r11 == null) {
            return null;
        }
        e.l(eVar, str);
        e.m(eVar, true, this.f107273g, this.f107274h);
        return r11;
    }
}
