package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xm4 implements qdb, pdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ xm4(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                ((sv) obj).getClass();
                break;
            case 1:
                break;
            case 2:
                ((vke) obj).onCues(list);
                break;
            default:
                ((wke) obj).onCues(list);
                break;
        }
    }

    public /* synthetic */ xm4(List list, int i, Object obj) {
        this.a = i;
        this.b = list;
    }
}
