package defpackage;

import com.google.android.gms.internal.ads.zzide;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xoo extends lbb {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoo(zzide zzideVar, int i) {
        super(zzideVar);
        this.f = i;
    }

    @Override // defpackage.lbb, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return b().b;
            default:
                return super.next();
        }
    }
}
