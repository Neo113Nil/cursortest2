package ei0;

import Hj0.C3151h;
import Hj0.M;
import Qj0.C3905z;
import Qj0.U;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import androidx.work.c;
import fi0.e;
import fi0.g;
import fi0.x;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8331a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* renamed from: ei0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6371d implements InterfaceC6369b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f62355b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f62356c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f62357d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3905z f62358e;

    /* renamed from: ei0.d$a */
    static final class a extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f62359b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f62360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, x xVar) {
            super(0);
            this.f62359b = xVar;
            this.f62360c = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return C3151h.a().a(this.f62360c, this.f62359b);
        }
    }

    public C6371d(@NotNull Context context, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        InterfaceC4008j b11 = k.b(new a(context, settings));
        this.f62355b = b11;
        this.f62356c = new g();
        this.f62357d = DeviceInfoManager.INSTANCE.invoke(context, settings.u());
        this.f62358e = new C3905z();
        if (settings.p().e()) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!(context.getApplicationContext() instanceof c.b)) {
                throw new IllegalArgumentException("The Application must implement androidx.work.Configuration.Provider");
            }
            ek0.b.a(settings, (M) b11.getValue());
        }
    }

    @Override // ei0.InterfaceC6369b
    public final void a() {
        this.f62358e.getClass();
    }

    @Override // ei0.InterfaceC6369b
    public final void b(boolean z11) {
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f62358e.beginTrace(name);
    }

    @Override // ei0.InterfaceC6369b
    public final void c(Function1<? super Integer, Unit> function1) {
        this.f62358e.getClass();
    }

    @Override // ei0.InterfaceC6369b
    public final void d(String str) {
    }

    @Override // ei0.InterfaceC6369b
    public final void e() {
        this.f62358e.getClass();
    }

    @Override // ei0.InterfaceC6369b
    public final void endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f62358e.endTrace(name);
    }

    @Override // ei0.InterfaceC6369b
    public final void f(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
    }

    @Override // ei0.InterfaceC6369b
    public final void g() {
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final e getCustomPropertyTracker() {
        return this.f62356c;
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final DeviceInfoManager getDeviceHardwareInfoProvider() {
        return this.f62357d;
    }

    @Override // ei0.InterfaceC6369b
    public final void h(@NotNull ActionType.Custom actionType, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, boolean z11) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
    }

    @Override // ei0.InterfaceC6369b
    public final boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f62358e.hasTrace(name);
        return true;
    }

    @Override // ei0.InterfaceC6369b
    public final boolean i() {
        return false;
    }

    @Override // ei0.InterfaceC6369b
    public final InterfaceC8331a j() {
        return null;
    }

    @Override // ei0.InterfaceC6369b
    public final void k(@NotNull Ll.a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    @Override // ei0.InterfaceC6369b
    public final U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f62358e.removeTrace(name);
        return null;
    }

    @Override // ei0.InterfaceC6369b
    public final void sendCustomEvent(String str, Map<String, ? extends Object> map) {
    }

    @Override // ei0.InterfaceC6369b
    public final void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, String str, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
    }

    @Override // ei0.InterfaceC6369b
    public final void sendPageView(@NotNull Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
    }

    @Override // ei0.InterfaceC6369b
    @NotNull
    public final U beginTrace(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return this.f62358e.beginTrace(trace);
    }
}
