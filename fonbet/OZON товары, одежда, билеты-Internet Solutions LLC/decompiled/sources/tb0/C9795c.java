package tb0;

import Sc.InterfaceC4008j;
import Sc.s;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$load$2", f = "AntibotJSChallengeManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: tb0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9795c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9796d f99335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f99336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9795c(String str, kotlin.coroutines.d dVar, C9796d c9796d) {
        super(2, dVar);
        this.f99335d = c9796d;
        this.f99336e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9795c(this.f99336e, dVar, this.f99335d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9795c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        C9796d c9796d = this.f99335d;
        webView = c9796d.f99340g;
        if (webView == null) {
            return null;
        }
        interfaceC4008j = c9796d.f99338e;
        webView.loadUrl(this.f99336e, ((yc0.c) interfaceC4008j.getValue()).e());
        return Unit.f71690a;
    }
}
