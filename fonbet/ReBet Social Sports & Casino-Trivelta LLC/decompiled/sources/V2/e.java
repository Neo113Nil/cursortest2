package V2;

import Q2.AbstractC1508t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e extends h {

    /* renamed from: f, reason: collision with root package name */
    public final BroadcastReceiver f12369f;

    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Z2.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f12369f = new a();
    }

    @Override // V2.h
    public void h() {
        String str;
        AbstractC1508t e10 = AbstractC1508t.e();
        str = f.f12371a;
        e10.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f12369f, j());
    }

    @Override // V2.h
    public void i() {
        String str;
        AbstractC1508t e10 = AbstractC1508t.e();
        str = f.f12371a;
        e10.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f12369f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
