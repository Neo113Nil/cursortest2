package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rol implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ lof c;
    public final /* synthetic */ fsf d;
    public final /* synthetic */ fsf e;

    public /* synthetic */ rol(lof lofVar, fsf fsfVar, fsf fsfVar2, fsf fsfVar3) {
        this.c = lofVar;
        this.b = fsfVar;
        this.d = fsfVar2;
        this.e = fsfVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        fsf fsfVar = this.e;
        fsf fsfVar2 = this.d;
        lof lofVar = this.c;
        fsf fsfVar3 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        is8.e("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte readByte = lofVar.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue < j) {
                            is8.e("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                fsfVar3.a = Integer.valueOf(lofVar.K0());
                            }
                            if (z2) {
                                fsfVar2.a = Integer.valueOf(lofVar.K0());
                            }
                            if (z3) {
                                fsfVar.a = Integer.valueOf(lofVar.K0());
                            }
                        }
                    }
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (fsfVar3.a != null) {
                        is8.e("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue2 != 24) {
                        is8.e("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        fsfVar3.a = Long.valueOf(lofVar.b0());
                        fsfVar2.a = Long.valueOf(lofVar.b0());
                        fsfVar.a = Long.valueOf(lofVar.b0());
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rol(fsf fsfVar, lof lofVar, fsf fsfVar2, fsf fsfVar3) {
        this.b = fsfVar;
        this.c = lofVar;
        this.d = fsfVar2;
        this.e = fsfVar3;
    }
}
