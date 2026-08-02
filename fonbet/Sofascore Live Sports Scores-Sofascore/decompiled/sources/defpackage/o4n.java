package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.playcore_hsdp.zzb;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o4n extends zzb {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rfn b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4n(rfn rfnVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener");
        this.c = rfnVar;
        this.b = rfnVar;
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzb
    public final boolean J(Parcel parcel, int i) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                if (i == 1) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) zzc.a(parcel);
                    zzc.b(parcel);
                    fg9 fg9Var = (fg9) this.c;
                    int i3 = bundle.getInt("hsdpPrewarmStatusCode", 1);
                    bundle.containsKey("hsdpPrewarmStatusCode");
                    String string = bundle.getString("errorMessage", "");
                    if (i3 != 2) {
                        if (i3 == 6) {
                            fg9Var.onCompleted(new Bundle());
                            break;
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt(IronSourceConstants.EVENTS_ERROR_CODE, i3);
                            bundle2.putString("errorMessage", string);
                            fg9Var.onError(bundle2);
                            break;
                        }
                    }
                } else if (i == 2) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    zzc.b(parcel);
                    i1k i1kVar = this.b.b;
                    i1kVar.m(new fmn(i1kVar, i2));
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) zzc.a(parcel);
                    zzc.b(parcel);
                    rfn rfnVar = (rfn) this.c;
                    int i4 = bundle3.getInt("hsdpStatusCode", 1);
                    bundle3.containsKey("hsdpStatusCode");
                    String string2 = bundle3.getString("targetPackage", "");
                    if (!string2.isEmpty()) {
                        switch (i4) {
                            case 1:
                                rfn.b(rfnVar, string2, 4, new g6n(this, string2, i4, bundle3.getString("errorMessage", "HSDP service unknown status"), 0));
                                break;
                            case 3:
                                rfn.b(rfnVar, string2, 2, null);
                                break;
                            case 4:
                                rfn.b(rfnVar, string2, 3, null);
                                break;
                            case 5:
                                rfn.b(rfnVar, string2, 4, new pyn(26, this, string2));
                                break;
                            case 6:
                                rfn.b(rfnVar, string2, 4, new g6n(this, string2, i4, bundle3.getString("errorMessage", "HSDP service error"), 0));
                                break;
                            case 7:
                                rfn.b(rfnVar, string2, 5, new vlo(28, this, string2));
                                break;
                            case 8:
                                rfn.b(rfnVar, string2, 4, new g6n(this, string2, i4, bundle3.getString("errorMessage", "HSDP service cancelled"), 0));
                                break;
                        }
                    }
                } else if (i == 2) {
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    zzc.b(parcel);
                    i1k i1kVar2 = this.b.b;
                    i1kVar2.m(new fmn(i1kVar2, i2));
                    break;
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4n(rfn rfnVar, fg9 fg9Var) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener");
        this.c = fg9Var;
        this.b = rfnVar;
    }
}
