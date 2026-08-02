package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbyp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hqn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbyp b;

    public /* synthetic */ hqn(zzbyp zzbypVar, int i) {
        this.a = i;
        this.b = zzbypVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        zzbyp zzbypVar = this.b;
        switch (i2) {
            case 0:
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", zzbypVar.e);
                data.putExtra("eventLocation", zzbypVar.i);
                data.putExtra("description", zzbypVar.h);
                long j = zzbypVar.f;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j2 = zzbypVar.g;
                if (j2 > -1) {
                    data.putExtra("endTime", j2);
                }
                data.setFlags(268435456);
                zzt.zzc();
                zzs.zzY(zzbypVar.d, data);
                break;
            default:
                zzbypVar.b("Operation denied by user.");
                break;
        }
    }
}
