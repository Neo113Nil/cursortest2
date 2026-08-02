package e;

import S0.InterfaceC3967k;
import S0.O;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g.InterfaceC6599k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6234i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final O f61700a = new O(a.f61701b);

    /* renamed from: e.i$a */
    static final class a extends AbstractC7737t implements Function0<InterfaceC6599k> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61701b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ InterfaceC6599k invoke() {
            return null;
        }
    }

    public static InterfaceC6599k a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.B(1418020823);
        InterfaceC6599k interfaceC6599k = (InterfaceC6599k) interfaceC3967k.m(f61700a);
        if (interfaceC6599k == null) {
            Object obj = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof InterfaceC6599k) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            interfaceC6599k = (InterfaceC6599k) obj;
        }
        interfaceC3967k.K();
        return interfaceC6599k;
    }
}
