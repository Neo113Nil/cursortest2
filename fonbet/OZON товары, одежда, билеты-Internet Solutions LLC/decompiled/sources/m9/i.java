package m9;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f74659a;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f74663e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f74664f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74661c = false;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f74660b = new a();

    /* renamed from: d, reason: collision with root package name */
    private Handler f74662d = new Handler();

    private final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z11 = intent.getIntExtra("plugged", -1) <= 0;
                i.this.f74662d.post(new Runnable() { // from class: m9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b(i.this, z11);
                    }
                });
            }
        }
    }

    public i(Activity activity, Runnable runnable) {
        this.f74659a = activity;
        this.f74663e = runnable;
    }

    static void b(i iVar, boolean z11) {
        iVar.f74664f = z11;
        if (iVar.f74661c) {
            iVar.f74662d.removeCallbacksAndMessages(null);
            if (iVar.f74664f) {
                iVar.f74662d.postDelayed(iVar.f74663e, 300000L);
            }
        }
    }

    public final void c() {
        this.f74662d.removeCallbacksAndMessages(null);
        if (this.f74661c) {
            this.f74659a.unregisterReceiver(this.f74660b);
            this.f74661c = false;
        }
    }

    public final void d() {
        if (!this.f74661c) {
            this.f74659a.registerReceiver(this.f74660b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f74661c = true;
        }
        this.f74662d.removeCallbacksAndMessages(null);
        if (this.f74664f) {
            this.f74662d.postDelayed(this.f74663e, 300000L);
        }
    }
}
