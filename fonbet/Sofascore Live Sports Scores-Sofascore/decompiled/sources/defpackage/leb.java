package defpackage;

import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class leb implements skd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ leb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.skd
    public final void h(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((e1d) obj2).setValue(obj);
                break;
            default:
                dlm dlmVar = (dlm) obj2;
                n4m n4mVar = dlmVar.g;
                if (n4mVar != null) {
                    BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = dlmVar.f;
                    dlmVar.j(n4mVar, blazeMomentsPlayerStyle != null ? blazeMomentsPlayerStyle.getFollowEntity() : null);
                    break;
                }
                break;
        }
    }
}
