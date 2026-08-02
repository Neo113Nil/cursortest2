package ei0;

import Qj0.U;
import Sc.InterfaceC3999a;
import android.content.Context;
import fi0.e;
import gi0.C6742a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mi0.InterfaceC8331a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* renamed from: ei0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC6369b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f62344a = a.f62345c;

    /* renamed from: ei0.b$a */
    public static final class a extends C6742a<InterfaceC6369b, Context> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ a f62345c = new a(C6368a.f62343b);
    }

    /* renamed from: ei0.b$b, reason: collision with other inner class name */
    public static final class C0979b {
        public static /* synthetic */ void b(InterfaceC6369b interfaceC6369b, ActionType.Custom custom, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, int i11) {
            if ((i11 & 2) != 0) {
                customCell = null;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            }
            if ((i11 & 256) != 0) {
                str6 = null;
            }
            interfaceC6369b.h(custom, customCell, page, str, str2, str3, str4, str5, str6, l11, false);
        }
    }

    void a();

    void b(boolean z11);

    @NotNull
    U beginTrace(@NotNull U u11);

    @NotNull
    U beginTrace(@NotNull String str);

    void c(Function1<? super Integer, Unit> function1);

    void d(String str);

    void e();

    void endTrace(@NotNull String str);

    @InterfaceC3999a
    void f(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell);

    void g();

    @NotNull
    e getCustomPropertyTracker();

    @NotNull
    DeviceInfoManager getDeviceHardwareInfoProvider();

    void h(@NotNull ActionType.Custom custom, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, boolean z11);

    boolean hasTrace(@NotNull String str);

    boolean i();

    InterfaceC8331a j();

    void k(@NotNull Ll.a aVar);

    U removeTrace(@NotNull String str);

    void sendCustomEvent(String str, Map<String, ? extends Object> map);

    void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, String str, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier);

    void sendPageView(@NotNull Page page);
}
