package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nb3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ nb3(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.a;
                componentActivity.reportFullyDrawn();
                return Unit.a;
            case 1:
                return ComponentActivity.i(componentActivity);
            case 2:
                int i3 = ComponentActivity.a;
                i35 i35Var = new i35();
                componentActivity.getNavigationEventDispatcher().b(i35Var);
                return i35Var;
            case 3:
                int i4 = ComponentActivity.a;
                return new sqg(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i5 = ComponentActivity.a;
                upd updVar = new upd(new mb3(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.getLifecycle().a(new ob3(0, updVar, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new r0(28, componentActivity, updVar));
                    }
                }
                return updVar;
        }
    }
}
