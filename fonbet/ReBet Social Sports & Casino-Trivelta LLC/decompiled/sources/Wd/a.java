package Wd;

import android.app.Application;
import com.zoho.livechat.android.utils.LiveChatUtil;
import jg.InterfaceC5134b;
import kg.C5254a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lg.InterfaceC5465a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13230a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f13231b = LazyKt.lazy(b.f13233d);

    /* renamed from: Wd.a$a, reason: collision with other inner class name */
    public static final class C0273a implements InterfaceC5465a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f13232a;

        public C0273a(Application application) {
            this.f13232a = application;
        }

        public void a(InterfaceC5134b contract) {
            Intrinsics.checkNotNullParameter(contract, "contract");
            Ud.b.f12184a.b(contract);
            contract.a(this.f13232a, a.f13230a.b());
        }

        @Override // lg.InterfaceC5465a
        public void onFailure(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            LiveChatUtil.log(throwable);
        }

        @Override // lg.InterfaceC5465a
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f13233d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ud.a invoke() {
            return new Ud.a();
        }
    }

    public final Ud.a b() {
        return (Ud.a) f13231b.getValue();
    }

    public final void c(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Ud.b.f12184a.a();
        C5254a.f54485a.a(new C0273a(application));
    }
}
