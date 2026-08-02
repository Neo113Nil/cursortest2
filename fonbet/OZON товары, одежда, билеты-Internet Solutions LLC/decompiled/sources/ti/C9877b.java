package ti;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;
import si.C9698a;
import ui.C10060a;

/* renamed from: ti.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9877b extends AbstractC7737t implements Function1<C9698a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9876a f99553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9877b(C9876a c9876a) {
        super(1);
        this.f99553b = c9876a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C9698a c9698a) {
        C10060a c10060a;
        C9698a c9698a2 = c9698a;
        C9876a c9876a = this.f99553b;
        c10060a = c9876a.f99549d;
        c10060a.submitList(c9698a2.b());
        if (c9698a2.c() != null) {
            Toast.makeText(c9876a.requireContext(), R.string.gallery_media_load_error_android, 0).show();
            C9876a.u(c9876a).g0();
        }
        return Unit.f71690a;
    }
}
