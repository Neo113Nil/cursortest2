package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tyn extends f5o {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zzez i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyn(zzez zzezVar, String str, String str2, Object obj, boolean z) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.j = obj;
        this.h = z;
        Objects.requireNonNull(zzezVar);
        this.i = zzezVar;
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = this.i.g;
                Preconditions.i(zzcpVar);
                zzcpVar.setUserProperty(this.f, this.g, new ObjectWrapper(this.j), this.h, this.a);
                break;
            case 1:
                zzcp zzcpVar2 = this.i.g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.getUserProperties(this.f, this.g, this.h, (zzcm) this.j);
                break;
            default:
                long j = this.a;
                long j2 = this.b;
                zzcp zzcpVar3 = this.i.g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.logEventWithElapsedTime(this.f, this.g, (Bundle) this.j, this.h, true, j, j2);
                break;
        }
    }

    @Override // defpackage.f5o
    public void b() {
        switch (this.e) {
            case 1:
                ((zzcm) this.j).F(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyn(zzez zzezVar, String str, String str2, Bundle bundle, boolean z) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.j = bundle;
        this.h = z;
        this.i = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyn(zzez zzezVar, String str, String str2, boolean z, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.i = zzezVar;
    }
}
