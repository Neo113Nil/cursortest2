package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.playcore_hsdp.zzb;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kto extends zzb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ eg9 f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ y0p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kto(y0p y0pVar, String str, String str2, IBinder iBinder, int i, int i2, eg9 eg9Var, Map map) {
        super("com.google.android.play.core.hsdp.protocol.IHpoaServiceListener");
        this.a = str;
        this.b = str2;
        this.c = iBinder;
        this.d = i;
        this.e = i2;
        this.f = eg9Var;
        this.g = map;
        this.h = y0pVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.playcore_hsdp.zzb
    public final boolean J(Parcel parcel, int i) {
        int i2 = 0;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzc.a(parcel);
        zzc.b(parcel);
        int i3 = bundle.getInt("statusCode", 9270);
        if (i3 != 9281) {
            String str = this.b;
            String str2 = this.a;
            y0p y0pVar = this.h;
            if (i3 != 9282) {
                eg9 eg9Var = this.f;
                switch (i3) {
                    case 9271:
                        i1k i1kVar = y0pVar.a;
                        if (i1kVar != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("appId", str2);
                            bundle2.putString("callerId", str);
                            bundle2.putBinder("windowToken", this.c);
                            bundle2.putInt("clientWindowWidthPx", this.d);
                            bundle2.putInt("clientWindowHeightPx", this.e);
                            i1kVar.k(new bnn(24, y0pVar, bundle2));
                            return true;
                        }
                        break;
                    case 9272:
                        i1k i1kVar2 = y0pVar.a;
                        if (i1kVar2 != null) {
                            i1kVar2.m(new fmn(i1kVar2, i2));
                            return true;
                        }
                        break;
                    case 9273:
                    case 9275:
                        break;
                    case 9274:
                        eg9Var.onAffordanceStarted();
                        return true;
                    case 9276:
                        eg9Var.onAffordanceEnded();
                        return true;
                    case 9277:
                        i1k i1kVar3 = y0pVar.a;
                        if (i1kVar3 != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("appId", str2);
                            bundle3.putString("callerId", str);
                            i1kVar3.k(new wjn(27, y0pVar, bundle3));
                            return true;
                        }
                        break;
                    default:
                        Bundle bundle4 = new Bundle();
                        if (i3 == 9278) {
                            bundle4.putString("errorMessage", "HPOA internal error");
                        } else if (i3 == 9279) {
                            bundle4.putString("errorMessage", "HPOA authentication error");
                        } else if (i3 == 9280) {
                            bundle4.putString("errorMessage", "HPOA invalid parameter");
                        } else {
                            bundle4.putString("errorMessage", "HPOA unknown error");
                        }
                        eg9Var.onError(bundle4);
                        i1k i1kVar4 = y0pVar.a;
                        if (i1kVar4 != null) {
                            i1kVar4.m(new fmn(i1kVar4, i2));
                            return true;
                        }
                        break;
                }
            } else {
                Activity activity = y0pVar.b;
                String packageName = activity.getPackageName();
                Map map = this.g;
                Intent X = hda.X(str2, str, packageName, map);
                X.addFlags(536870912);
                if (activity.getPackageManager().resolveActivity(X, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                    activity.startActivityForResult(X, 0);
                    return true;
                }
                activity.startActivity(hda.V(str2, str, map));
            }
        }
        return true;
    }
}
