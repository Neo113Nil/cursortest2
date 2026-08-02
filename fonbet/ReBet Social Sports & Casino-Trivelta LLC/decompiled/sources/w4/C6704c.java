package w4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import u4.W;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6704c extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final a f67402c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final W f67403a;

    /* renamed from: b, reason: collision with root package name */
    public final ThemedReactContext f67404b;

    /* renamed from: w4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6704c(W view, ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67403a = view;
        this.f67404b = context;
    }

    public final PendingIntent a(boolean z10) {
        int i10 = z10 ? 1 : 2;
        Intent putExtra = new Intent("rnv_media_control").putExtra("rnv_control_type", z10 ? 1 : 2);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        putExtra.setPackage(this.f67404b.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f67404b, i10, putExtra, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void b() {
        try {
            this.f67404b.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        AbstractC5338c.registerReceiver(this.f67404b, this, new IntentFilter("rnv_media_control"), 4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && Intrinsics.areEqual(intent.getAction(), "rnv_media_control")) {
            int intExtra = intent.getIntExtra("rnv_control_type", 0);
            if (intExtra == 1) {
                this.f67403a.setPausedModifier(false);
            } else {
                if (intExtra != 2) {
                    return;
                }
                this.f67403a.setPausedModifier(true);
            }
        }
    }
}
