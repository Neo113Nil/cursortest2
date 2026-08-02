package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.playcore_hsdp.zzg;

/* loaded from: classes3.dex */
public final class k02 implements pjd, xid, zzg, zzfpi {
    public final String a;

    public /* synthetic */ k02(String str) {
        this.a = str;
    }

    @Override // defpackage.xid
    public String e() {
        return lnb.q(new StringBuilder("expected '"), this.a, '\'');
    }

    @Override // defpackage.pjd
    public Object n() {
        throw new zfa(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        int i = zzele.c;
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.a, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public Object zza() {
        HandlerThread handlerThread = new HandlerThread(this.a, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
