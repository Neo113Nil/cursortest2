package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cio extends n53 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fio g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cio(fio fioVar, int i) {
        super(fioVar);
        this.f = i;
        this.g = fioVar;
    }

    @Override // defpackage.n53
    public final Object b(int i) {
        int i2 = this.f;
        fio fioVar = this.g;
        switch (i2) {
            case 0:
                return fioVar.g()[i];
            case 1:
                return new eio(fioVar, i);
            default:
                return fioVar.h()[i];
        }
    }
}
