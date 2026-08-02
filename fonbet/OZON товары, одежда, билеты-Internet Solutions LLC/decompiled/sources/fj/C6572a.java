package fj;

import androidx.activity.ActivityC5043j;
import ej.InterfaceC6374c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import ru.ozon.android.inAppUpdate.internal.ui.OzonInAppUpdateSdkActivity;
import ru.ozon.android.inAppUpdate.internal.ui.e;
import ru.ozon.android.inAppUpdate.internal.ui.h;

/* renamed from: fj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C6572a extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6573b f63586b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActivityC5043j f63587c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6374c f63588d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CheckUpdateResponseDTO f63589e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC6374c.InterfaceC0981c.a f63590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6572a(C6573b c6573b, ActivityC5043j activityC5043j, InterfaceC6374c interfaceC6374c, CheckUpdateResponseDTO checkUpdateResponseDTO, InterfaceC6374c.InterfaceC0981c.a aVar) {
        super(1);
        this.f63586b = c6573b;
        this.f63587c = activityC5043j;
        this.f63588d = interfaceC6374c;
        this.f63589e = checkUpdateResponseDTO;
        this.f63590f = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.getClass();
        ActivityC5043j context = this.f63587c;
        Intrinsics.checkNotNullParameter(context, "context");
        CheckUpdateResponseDTO response = this.f63589e;
        Intrinsics.checkNotNullParameter(response, "response");
        e.c cVar = new e.c(response);
        this.f63586b.getClass();
        int i11 = OzonInAppUpdateSdkActivity.f83815i;
        context.startActivity(OzonInAppUpdateSdkActivity.a.a(context, h.a(this.f63588d, cVar, this.f63590f)));
        return Unit.f71690a;
    }
}
