package k00;

import Sc.r;
import Sc.s;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate$getSecondLevelDomains$2", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: k00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7448a extends j implements Function2<M, kotlin.coroutines.d<? super List<? extends URI>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f70248d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7451d f70249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7448a(C7451d c7451d, kotlin.coroutines.d<? super C7448a> dVar) {
        super(2, dVar);
        this.f70249e = c7451d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C7448a c7448a = new C7448a(this.f70249e, dVar);
        c7448a.f70248d = obj;
        return c7448a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends URI>> dVar) {
        return ((C7448a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Pc.a aVar;
        Object a11;
        URI uri;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        aVar = this.f70249e.f70255a;
        AbToolBaseApi abToolBaseApi = (AbToolBaseApi) aVar.get();
        String string = abToolBaseApi != null ? abToolBaseApi.getString("ozon_second_level_domains", "ozon_network", AbToolNamespace.PLATFORM_MOBILE) : null;
        if (string == null) {
            string = "";
        }
        List m11 = h.m(string, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            String obj2 = h.z0((String) it.next()).toString();
            if (h.K(obj2)) {
                uri = null;
            } else {
                try {
                    r.Companion companion = r.INSTANCE;
                    a11 = new URI("https://" + obj2);
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                }
                if (a11 instanceof r.b) {
                    a11 = null;
                }
                uri = (URI) a11;
            }
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }
}
