package e;

import S0.InterfaceC3967k;
import S0.O;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.M;
import androidx.activity.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6235j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final O f61702a = new O(a.f61703b);

    /* renamed from: e.j$a */
    static final class a extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61703b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ M invoke() {
            return null;
        }
    }

    public static M a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.B(-2068013981);
        M m11 = (M) interfaceC3967k.m(f61702a);
        interfaceC3967k.B(1680121597);
        if (m11 == null) {
            m11 = Q.a((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h()));
        }
        interfaceC3967k.K();
        if (m11 == null) {
            Object obj = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof M) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            m11 = (M) obj;
        }
        interfaceC3967k.K();
        return m11;
    }
}
