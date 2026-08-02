package gj;

import Ld0.c;
import ei0.InterfaceC6369b;
import hj.C6960a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pj.C8938a;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;

/* renamed from: gj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6743a {

    /* renamed from: a, reason: collision with root package name */
    private static c f64495a;

    public static void a(c cVar) {
        f64495a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ActionType actionType, String str) {
        Function1 c11;
        c cVar = f64495a;
        InterfaceC6369b interfaceC6369b = null;
        if (cVar != null && (c11 = C6960a.c()) != null) {
            interfaceC6369b = (InterfaceC6369b) c11.invoke(cVar);
        }
        InterfaceC6369b interfaceC6369b2 = interfaceC6369b;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        if (interfaceC6369b2 == null) {
            int i11 = C8938a.f81237c;
            C8938a.b("Analytics cannot be sent because the passed ozonTracker instance is null. Make sure it's passed into OzonInAppUpdateSdkManagerFactory.Params.Builder.setOzonTracker method.");
            return;
        }
        int i12 = C8938a.f81237c;
        C8938a.b("Analytics was send. ActionType: " + actionType + ". Title: " + str);
        Long l11 = null;
        Long l12 = null;
        String str2 = null;
        String str3 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        Long l16 = null;
        Long l17 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        interfaceC6369b2.sendEvent(actionType, (r27 & 2) != 0 ? null : new EventEntity.Obj("ui", "in_app_update", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l11, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l12, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l13, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l14, l15, l16, l17, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str4, str5, str6, 2147483644, 0 == true ? 1 : 0), (r27 & 4) != 0 ? null : new EventEntity.Properties(null, null, null, null, null, null, null, l11, null, null, l12, null, str2, null, str3, null, null, null, l13, null, null, l14, l15, l16, l17, null, null, null, str4, str5, str6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Ozon", null, null, null, null, null, null, null, null, null, null, null, null, -1, -262145, 16381, null), (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : null, null, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
    }
}
