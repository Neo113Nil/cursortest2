package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class uz1 implements kpd, qdb, pdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ uz1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        view.getClass();
        int i = x9lVar.a.i(2).d;
        int i2 = kik.s ? 84 : 56;
        Context context = view.getContext();
        context.getClass();
        int s = ao2.s(i2, context);
        Context context2 = view.getContext();
        context2.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i + s + ao2.s(this.b, context2));
        return x9lVar;
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 1:
                sv svVar = (sv) obj;
                svVar.getClass();
                s6c s6cVar = (s6c) svVar;
                if (i2 == 1) {
                    s6cVar.v = true;
                }
                s6cVar.l = i2;
                break;
            case 2:
                r6c r6cVar = (r6c) ((rv) obj);
                if (i2 == 1) {
                    r6cVar.u = true;
                }
                r6cVar.k = i2;
                break;
            case 3:
                int i3 = vg6.r0;
                ((wke) obj).onRepeatModeChanged(i2);
                break;
            case 4:
                ((vke) obj).onRepeatModeChanged(i2);
                break;
            case 5:
                int i4 = vg6.r0;
                ((wke) obj).onAudioSessionIdChanged(i2);
                break;
            case 6:
                ((wke) obj).onPlaybackStateChanged(i2);
                break;
            default:
                ((wke) obj).onRepeatModeChanged(i2);
                break;
        }
    }

    public /* synthetic */ uz1(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = i;
    }
}
