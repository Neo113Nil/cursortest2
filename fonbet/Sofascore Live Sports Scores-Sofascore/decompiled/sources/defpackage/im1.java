package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.results.base.BaseActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class im1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ im1(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        eqm d;
        String e;
        xyl xylVar;
        eqm d2;
        String e2;
        xyl xylVar2;
        eqm d3;
        String e3;
        xyl xylVar3;
        int i2 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                BaseballEvent baseballEvent = ((hm1) obj2).O;
                Team team = (Team) obj;
                gt8 gt8Var = (gt8) ((km1) obj3).f;
                if (gt8Var != null) {
                    gt8Var.invoke(Integer.valueOf(baseballEvent.getId()), team, baseballEvent.getStatusType(), Integer.valueOf(i3), null, Boolean.FALSE);
                }
                break;
            case 1:
                znh znhVar = (znh) obj;
                View view = ((l8l) obj3).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i4 = rect.top;
                int i5 = rect.bottom;
                dma dmaVar = (dma) ((e1d) obj2).getValue();
                oqf r = (dmaVar == null || !dmaVar.f()) ? oqf.e : jca.r(dmaVar.w(0L), d7a.I(dmaVar.e()));
                int i6 = i4 + i3;
                int i7 = i5 - i3;
                float f = r.b;
                if (f <= i5) {
                    float f2 = r.d;
                    if (f2 >= i4) {
                        i = wzb.b(Math.max(f - i6, i7 - f2));
                        znhVar.i(Math.max(i, 0));
                        break;
                    }
                }
                i = i7 - i6;
                znhVar.i(Math.max(i, 0));
                break;
            case 2:
                Activity activity = (Activity) obj2;
                Function1 function1 = (Function1) obj;
                nv.A((Context) obj3, "notifications_onboarding", "allow");
                if (activity instanceof BaseActivity) {
                    p4h.t((BaseActivity) activity, true, new ru5(i3, 1, function1), null, 40);
                }
                break;
            case 3:
                ct8 ct8Var = (ct8) obj3;
                cqk cqkVar = (cqk) obj2;
                ArrayList arrayList = (ArrayList) obj;
                MediaType mediaType = MediaType.VideoHighlight;
                String url = cqkVar.n.getUrl();
                Highlight highlight = cqkVar.n;
                String title = highlight.getTitle();
                boolean z = highlight.getMediaType() == 6;
                iy7 iy7Var = cqkVar.j;
                ct8Var.invoke(new ow7(mediaType, url, title, z, iy7Var != null ? iy7Var.b : null, arrayList), Integer.valueOf(i3), Integer.valueOf(cqkVar.g));
                break;
            case 4:
                xy9 xy9Var = (xy9) obj2;
                gz9 gz9Var = (gz9) obj;
                ct8 ct8Var2 = (ct8) ((yy9) obj3).a.d;
                if (ct8Var2 != null) {
                    FrameLayout frameLayout = (FrameLayout) xy9Var.c.b;
                    frameLayout.getClass();
                    ct8Var2.invoke(frameLayout, Integer.valueOf(i3), gz9Var);
                }
                break;
            case 5:
                ((o4b) obj3).t(new z3b(i3, (String) obj, (Integer) obj2));
                break;
            case 6:
                StringBuilder q = wt3.q("Can not interpret the string '", (String) obj3, "' as ");
                q.append(((vid) ((ajd) obj2).a.get(i3)).b);
                q.append(": ");
                q.append(((xid) obj).e());
                break;
            case 7:
                break;
            case 8:
                efm efmVar = (efm) obj2;
                n4m n4mVar = (n4m) obj;
                boolean z2 = efm.j;
                if (((xyl) obj3).getId() == i3) {
                    String str = n4mVar != null ? n4mVar.a : null;
                    n4m n4mVar2 = efmVar.f;
                    if (Intrinsics.c(str, n4mVar2 != null ? n4mVar2.a : null) && n4mVar != null && (d = fgm.d(n4mVar)) != null && (e = d.e()) != null && (xylVar = efmVar.i) != null) {
                        xylVar.c(e);
                    }
                    break;
                } else {
                    break;
                }
            case 9:
                dlm dlmVar = (dlm) obj2;
                n4m n4mVar3 = (n4m) obj;
                int i8 = dlm.o;
                if (((xyl) obj3).getId() == i3) {
                    String str2 = n4mVar3 != null ? n4mVar3.a : null;
                    n4m n4mVar4 = dlmVar.g;
                    if (Intrinsics.c(str2, n4mVar4 != null ? n4mVar4.a : null) && n4mVar3 != null && (d2 = fgm.d(n4mVar3)) != null && (e2 = d2.e()) != null && (xylVar2 = dlmVar.n) != null) {
                        xylVar2.c(e2);
                    }
                    break;
                } else {
                    break;
                }
            default:
                e0n e0nVar = (e0n) obj2;
                n4m n4mVar5 = (n4m) obj;
                boolean z3 = e0n.n;
                if (((xyl) obj3).getId() == i3) {
                    String str3 = n4mVar5 != null ? n4mVar5.a : null;
                    n4m n4mVar6 = e0nVar.d;
                    if (Intrinsics.c(str3, n4mVar6 != null ? n4mVar6.a : null) && n4mVar5 != null && (d3 = fgm.d(n4mVar5)) != null && (e3 = d3.e()) != null && (xylVar3 = e0nVar.i) != null) {
                        xylVar3.c(e3);
                    }
                    break;
                } else {
                    break;
                }
        }
        return Unit.a;
    }

    public /* synthetic */ im1(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ im1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
