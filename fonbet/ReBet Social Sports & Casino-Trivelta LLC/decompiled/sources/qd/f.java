package qd;

import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import rd.C6218a;

/* loaded from: classes4.dex */
public class f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f63477a = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a() {
        if (LiveChatUtil.canConnectToWMS() && C6218a.W()) {
            c.n(false);
            f63477a.post(new Runnable() { // from class: qd.e
                @Override // java.lang.Runnable
                public final void run() {
                    rd.b.b();
                }
            });
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras() != null) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getExtras().get("networkInfo");
            if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                Boolean bool = Boolean.FALSE;
                if (intent.getBooleanExtra("noConnectivity", false) && rd.b.d() != null) {
                    rd.b.d().a("networkstatus", bool);
                }
            } else {
                LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: qd.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a();
                    }
                });
                if (rd.b.d() != null) {
                    rd.b.d().a("networkstatus", Boolean.TRUE);
                }
            }
            Intent intent2 = new Intent("receivelivechat");
            intent2.putExtra("message", "networkstatus");
            C1908a.b(MobilistenInitProvider.k()).d(intent2);
        }
    }
}
