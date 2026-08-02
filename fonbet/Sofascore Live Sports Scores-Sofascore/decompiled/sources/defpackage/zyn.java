package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zyn extends f5o {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ zzez h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyn(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.i = zzddVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(zzezVar);
        this.h = zzezVar;
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = this.h.g;
                Preconditions.i(zzcpVar);
                zzcpVar.clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 1:
                zzcp zzcpVar2 = this.h.g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.getConditionalUserProperties(this.f, this.g, (zzcm) this.i);
                break;
            default:
                zzcp zzcpVar3 = this.h.g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.setCurrentScreenByScionActivityInfo((zzdd) this.i, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.f5o
    public void b() {
        switch (this.e) {
            case 1:
                ((zzcm) this.i).F(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyn(zzez zzezVar, String str, String str2, Bundle bundle) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.i = bundle;
        Objects.requireNonNull(zzezVar);
        this.h = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyn(zzez zzezVar, String str, String str2, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.i = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.h = zzezVar;
    }
}
