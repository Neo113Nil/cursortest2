package ei0;

import Hj0.C3151h;
import Hj0.M;
import Qj0.U;
import Qj0.V;
import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.work.c;
import fi0.b;
import fi0.e;
import fi0.s;
import fi0.x;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8331a;
import mi0.InterfaceC8333c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.EventManager;
import ru.ozon.tracker.sendEvent.Page;

/* renamed from: ei0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6370c implements InterfaceC6369b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M f62346b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EventManager f62347c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final V f62348d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final s f62349e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final e f62350f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC8333c f62351g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f62352h;

    /* renamed from: i, reason: collision with root package name */
    private Ll.a f62353i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f62354j;

    public C6370c(@NotNull Context context, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        bk0.c.b(settings.G());
        M a11 = C3151h.a().a(context, settings);
        this.f62346b = a11;
        if (settings.p().e()) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!(context.getApplicationContext() instanceof c.b)) {
                throw new IllegalArgumentException("The Application must implement androidx.work.Configuration.Provider");
            }
            ek0.b.a(settings, a11);
        }
        this.f62347c = a11.h();
        this.f62348d = a11.l();
        this.f62349e = a11.j();
        this.f62350f = a11.getCustomPropertyTracker();
        InterfaceC8333c i11 = a11.i();
        this.f62351g = i11;
        this.f62352h = a11.a();
        Oj0.a.b(i11);
        a11.m().b();
        a11.c().observe();
        a11.k().d();
        fi0.b m11 = settings.m();
        if (m11 instanceof b.C1028b) {
            new Zj0.b(this).c(((b.C1028b) m11).a());
        }
        this.f62354j = settings.D().a();
    }

    @Override // ei0.InterfaceC6369b
    public final void a() {
        this.f62348d.a();
    }

    @Override // ei0.InterfaceC6369b
    public final void b(boolean z11) {
        this.f62351g.b(z11);
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final U beginTrace(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return this.f62348d.beginTrace(trace);
    }

    @Override // ei0.InterfaceC6369b
    public final void c(Function1<? super Integer, Unit> function1) {
        this.f62348d.c(function1);
    }

    @Override // ei0.InterfaceC6369b
    public final void d(String str) {
        this.f62349e.d(str);
    }

    @Override // ei0.InterfaceC6369b
    public final void e() {
        this.f62348d.e();
    }

    @Override // ei0.InterfaceC6369b
    public final void endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f62348d.endTrace(name);
    }

    @Override // ei0.InterfaceC6369b
    @InterfaceC3999a
    public final void f(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f62347c.sendEvent(actionType, obj, properties, customCell, null, null, null, null, null, null, null, null, null);
    }

    @Override // ei0.InterfaceC6369b
    public final void g() {
        this.f62347c.forceSendEvents();
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final e getCustomPropertyTracker() {
        return this.f62350f;
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final DeviceInfoManager getDeviceHardwareInfoProvider() {
        return this.f62352h;
    }

    @Override // ei0.InterfaceC6369b
    public final void h(@NotNull ActionType.Custom actionType, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, boolean z11) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f62347c.sendTrinityEvent(actionType, customCell, page, str, str2, str3, str4, str5, str6, l11, z11);
    }

    @Override // ei0.InterfaceC6369b
    public final boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f62348d.hasTrace(name);
    }

    @Override // ei0.InterfaceC6369b
    public final boolean i() {
        return this.f62354j;
    }

    @Override // ei0.InterfaceC6369b
    public final InterfaceC8331a j() {
        return this.f62353i;
    }

    @Override // ei0.InterfaceC6369b
    public final void k(@NotNull Ll.a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f62353i = logger;
    }

    @Override // ei0.InterfaceC6369b
    public final U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f62348d.removeTrace(name);
    }

    @Override // ei0.InterfaceC6369b
    public final void sendCustomEvent(String str, Map<String, ? extends Object> map) {
        this.f62347c.sendCustomEvent(str, map);
    }

    @Override // ei0.InterfaceC6369b
    public final void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, String str, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f62347c.sendEvent(actionType, obj, properties, customCell, widget, page, str, form, eventError, posting, filter, sale, review, num, num2, courier);
    }

    @Override // ei0.InterfaceC6369b
    public final void sendPageView(@NotNull Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f62347c.sendPageView(page);
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f62348d.beginTrace(name);
    }
}
