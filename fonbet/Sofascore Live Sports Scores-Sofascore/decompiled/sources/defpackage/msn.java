package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcj;
import java.util.AbstractMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class msn extends zzcc {
    public final /* synthetic */ usn c;

    public msn(usn usnVar) {
        this.c = usnVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcj zzcjVar = this.c.d;
        return new AbstractMap.SimpleImmutableEntry(zzcjVar.c.f.get(i), zzcjVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
