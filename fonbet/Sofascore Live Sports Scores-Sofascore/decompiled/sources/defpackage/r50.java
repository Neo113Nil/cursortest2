package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r50 extends t01 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(List list, int i) {
        super(list, 0);
        this.c = i;
    }

    @Override // defpackage.z50
    public final o41 g() {
        switch (this.c) {
            case 0:
                return new x13((List) this.b, 0);
            case 1:
                return new y19((List) this.b, 0);
            case 2:
                return new x13((List) this.b, 1);
            case 3:
                return new y19((List) this.b, 1);
            case 4:
                return new y19((List) this.b, 2);
            case 5:
                return new ibh((List) this.b);
            default:
                return new x13((List) this.b, 2);
        }
    }
}
