package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bcp extends lbb {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcp(gcp gcpVar, int i) {
        super(gcpVar);
        this.f = i;
    }

    @Override // defpackage.lbb, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return d().b;
            default:
                return super.next();
        }
    }
}
