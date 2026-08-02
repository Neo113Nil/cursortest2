package x1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f25371a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f25372b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25373c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25374d;

    public a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f25371a = intentFilter;
        this.f25372b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f25372b);
        sb2.append(" filter=");
        sb2.append(this.f25371a);
        if (this.f25374d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
