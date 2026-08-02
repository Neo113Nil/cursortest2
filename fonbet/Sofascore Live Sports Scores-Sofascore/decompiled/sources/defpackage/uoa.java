package defpackage;

import com.google.android.gms.internal.auth.zzhe;
import com.google.android.gms.internal.cast.zzys;
import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.pal.zzafn;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.protobuf.LazyField;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uoa implements Iterator {
    public final /* synthetic */ int a;
    public Iterator b;

    public uoa(zzbf zzbfVar) {
        this.a = 4;
        this.b = zzbfVar.a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                toa toaVar = new toa();
                toaVar.a = entry;
                return toaVar;
            case 1:
                return (String) this.b.next();
            case 2:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                return entry2.getValue() instanceof zzael ? new rbn(entry2) : entry2;
            case 3:
                return (String) this.b.next();
            case 4:
                return (String) this.b.next();
            case 5:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                return entry3.getValue() instanceof n0o ? new d0o(entry3) : entry3;
            case 6:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                return entry4.getValue() instanceof fjo ? new vho(entry4) : entry4;
            case 7:
                return (String) this.b.next();
            case 8:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                return entry5.getValue() instanceof zpo ? new ypo(entry5) : entry5;
            case 9:
                Map.Entry entry6 = (Map.Entry) this.b.next();
                return entry6.getValue() instanceof zzqz ? new l3p(entry6) : entry6;
            default:
                Map.Entry entry7 = (Map.Entry) this.b.next();
                return entry7.getValue() instanceof zzys ? new eep(entry7) : entry7;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                this.b.remove();
                return;
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException("Remove not supported");
            case 5:
                this.b.remove();
                return;
            case 6:
                this.b.remove();
                return;
            case 7:
                throw new UnsupportedOperationException();
            case 8:
                this.b.remove();
                return;
            case 9:
                this.b.remove();
                return;
            default:
                this.b.remove();
                return;
        }
    }

    public /* synthetic */ uoa(Iterator it, int i) {
        this.a = i;
        this.b = it;
    }

    public uoa(zzhe zzheVar) {
        this.a = 7;
        this.b = zzheVar.a.iterator();
    }

    public uoa(zzafn zzafnVar) {
        this.a = 3;
        this.b = zzafnVar.a.iterator();
    }

    public /* synthetic */ uoa() {
        this.a = 1;
    }
}
