package ru.ozon.tracker.debug.menu.presentation;

import Am.C2438a;
import Ci0.g;
import Di0.b;
import Mi0.n;
import Ri0.q;
import S0.InterfaceC3967k;
import a1.C4912a;
import af0.C5018a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ActivityC5043j;
import androidx.activity.t;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.Y;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import df0.C6195b;
import f3.AbstractC6409a;
import if0.C7071a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import mf0.C8140b;
import oi0.f;
import org.jetbrains.annotations.NotNull;
import pi0.h;
import ru.ozon.tracker.debug.menu.presentation.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/tracker/debug/menu/presentation/TrackerDebugMenuActivity;", "Landroidx/activity/j;", "<init>", "()V", "", "hasShowMenu", "debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackerDebugMenuActivity extends ActivityC5043j {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f97738k = {C2438a.c(TrackerDebugMenuActivity.class, "navigationBuilder", "getNavigationBuilder()Lkotlin/jvm/functions/Function1;", 0)};

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f97739h = new y0(N.b(ru.ozon.tracker.debug.menu.presentation.a.class), new c(), new e(), new d());

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Di0.c f97740i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C8140b f97741j;

    static final class a extends AbstractC7737t implements Function1<kf0.c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97742b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kf0.c cVar) {
            kf0.c debugMenuNavigationBuilder = cVar;
            Intrinsics.checkNotNullParameter(debugMenuNavigationBuilder, "$this$debugMenuNavigationBuilder");
            b.a aVar = b.a.f6731d;
            kotlin.reflect.d b11 = N.b(q.class);
            C5018a c5018a = new C5018a();
            Ei0.a.f7993b.invoke(c5018a);
            debugMenuNavigationBuilder.a(new C6195b(aVar, b11, c5018a));
            b.e eVar = b.e.f6735d;
            kotlin.reflect.d b12 = N.b(Vi0.c.class);
            C5018a c5018a2 = new C5018a();
            Ei0.b.f7994b.invoke(c5018a2);
            debugMenuNavigationBuilder.a(new C6195b(eVar, b12, c5018a2));
            b.f fVar = b.f.f6736d;
            kotlin.reflect.d b13 = N.b(n.class);
            C5018a c5018a3 = new C5018a();
            Ei0.c.f7995b.invoke(c5018a3);
            debugMenuNavigationBuilder.a(new C6195b(fVar, b13, c5018a3));
            b.c cVar2 = b.c.f6733d;
            kotlin.reflect.d b14 = N.b(Ui0.c.class);
            C5018a c5018a4 = new C5018a();
            Ei0.d.f7996b.invoke(c5018a4);
            debugMenuNavigationBuilder.a(new C6195b(cVar2, b14, c5018a4));
            b.d dVar = b.d.f6734d;
            kotlin.reflect.d b15 = N.b(Wi0.a.class);
            C5018a c5018a5 = new C5018a();
            Ei0.e.f7997b.invoke(c5018a5);
            debugMenuNavigationBuilder.a(new C6195b(dVar, b15, c5018a5));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f97744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(2);
            this.f97744c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Zi0.a.a(false, a1.c.c(-502728670, new ru.ozon.tracker.debug.menu.presentation.d(TrackerDebugMenuActivity.this, this.f97744c), interfaceC3967k2), interfaceC3967k2, 48);
            }
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return TrackerDebugMenuActivity.this.getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return TrackerDebugMenuActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    static final class e extends AbstractC7737t implements Function0<z0.b> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            Intent intent = TrackerDebugMenuActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intent intent2 = new Intent(intent);
            h.a aVar = new h.a(intent2);
            f fVar = new f(intent2);
            g gVar = g.f5125a;
            gVar.getClass();
            return new a.b(aVar, g.b(), gVar.d(), fVar);
        }
    }

    public TrackerDebugMenuActivity() {
        a builder = a.f97742b;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f97740i = new Di0.c(builder);
        this.f97741j = new C8140b();
    }

    public static final Function1 F(TrackerDebugMenuActivity trackerDebugMenuActivity) {
        return (Function1) trackerDebugMenuActivity.f97740i.getValue(trackerDebugMenuActivity, f97738k[0]);
    }

    public static final ru.ozon.tracker.debug.menu.presentation.a H(TrackerDebugMenuActivity trackerDebugMenuActivity) {
        return (ru.ozon.tracker.debug.menu.presentation.a) trackerDebugMenuActivity.f97739h.getValue();
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String uri;
        Uri.Builder buildUpon;
        Uri.Builder scheme;
        super.onCreate(bundle);
        t.a(this);
        ru.ozon.tracker.debug.menu.presentation.a aVar = (ru.ozon.tracker.debug.menu.presentation.a) this.f97739h.getValue();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        Uri build = (data == null || (buildUpon = data.buildUpon()) == null || (scheme = buildUpon.scheme("trackerDebugMenu")) == null) ? null : scheme.build();
        if (build != null && (uri = build.toString()) != null) {
            Set a11 = Di0.b.a();
            if (!(a11 instanceof Collection) || !a11.isEmpty()) {
                Iterator it = a11.iterator();
                while (it.hasNext()) {
                    ((C7071a) it.next()).getClass();
                    if ("trackerDebugMenu://trackerSDK/productTracker".equals(uri)) {
                        break;
                    }
                }
            }
        }
        build = null;
        String uri2 = build != null ? build.toString() : null;
        ComposeView composeView = new ComposeView(this, null, 6, 0);
        composeView.a(new C4912a(true, -1273933597, new b(uri2)));
        setContentView(composeView);
        Y.J(composeView, new ru.ozon.tracker.debug.menu.presentation.b());
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        Intrinsics.checkNotNullParameter(intent2, "<this>");
        intent2.setData(null);
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            extras.clear();
        }
    }
}
