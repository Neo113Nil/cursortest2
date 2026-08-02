package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eee implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ eee(int i) {
        this.a = 21;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Intrinsics.c(obj, obj2));
            case 1:
                return Boolean.valueOf(Intrinsics.c(obj, obj2));
            case 2:
                obb obbVar = (obb) obj2;
                obbVar.getClass();
                return Boolean.valueOf(Intrinsics.c(obj, obbVar.a));
            case 3:
                obb obbVar2 = (obb) obj2;
                obbVar2.getClass();
                return Boolean.valueOf(Intrinsics.c(obj, obbVar2.a));
            case 4:
                obb obbVar3 = (obb) obj;
                obb obbVar4 = (obb) obj2;
                obbVar3.getClass();
                obbVar4.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar3.a, obbVar4.a));
            case 5:
                obb obbVar5 = (obb) obj;
                obb obbVar6 = (obb) obj2;
                obbVar5.getClass();
                obbVar6.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar5.a, obbVar6.a));
            case 6:
                obb obbVar7 = (obb) obj;
                obbVar7.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar7.a, obj2));
            case 7:
                obb obbVar8 = (obb) obj;
                obbVar8.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar8.a, obj2));
            case 8:
                obb obbVar9 = (obb) obj;
                obb obbVar10 = (obb) obj2;
                obbVar9.getClass();
                obbVar10.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar9.a, obbVar10.a));
            case 9:
                obb obbVar11 = (obb) obj;
                obb obbVar12 = (obb) obj2;
                obbVar11.getClass();
                obbVar12.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar11.a, obbVar12.a));
            case 10:
                obb obbVar13 = (obb) obj;
                obbVar13.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar13.a, obj2));
            case 11:
                obb obbVar14 = (obb) obj;
                obbVar14.getClass();
                return Boolean.valueOf(Intrinsics.c(obbVar14.a, obj2));
            case 12:
                ((pbb) obj).getClass();
                ((pbb) obj2).getClass();
                return Boolean.TRUE;
            case 13:
                ((pbb) obj).getClass();
                ((pbb) obj2).getClass();
                return Boolean.TRUE;
            case 14:
                ((pbb) obj).getClass();
                ((pbb) obj2).getClass();
                return Boolean.TRUE;
            case 15:
                ((pbb) obj).getClass();
                ((pbb) obj2).getClass();
                return Boolean.TRUE;
            case 16:
                ((Integer) obj).intValue();
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj2;
                fantasyPlayerFixtureUiModel.getClass();
                return ljg.j(fantasyPlayerFixtureUiModel.a, "fixture_");
            case 17:
                ((Integer) obj).intValue();
                mi5 mi5Var = (mi5) obj2;
                mi5Var.getClass();
                return ljg.j(mi5Var.a, "event ");
            case 18:
                ((Integer) obj).intValue();
                ri5 ri5Var = (ri5) obj2;
                ri5Var.getClass();
                return ljg.j(ri5Var.a, "tournament ");
            case 19:
                return (Float) ((xhf) obj2).a.d();
            case 20:
                lpg lpgVar = (lpg) obj;
                e1d e1dVar = (e1d) obj2;
                if (e1dVar instanceof coh) {
                    coh cohVar = (coh) e1dVar;
                    Object invoke = ((Function2) wcj.d.b).invoke(lpgVar, cohVar.getValue());
                    if (invoke != null) {
                        foh b = cohVar.b();
                        b.getClass();
                        return e.e(invoke, b);
                    }
                } else {
                    a70.p("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                return null;
            case 21:
                ((Integer) obj2).getClass();
                jaa.k(aba.K(1), (of3) obj);
                return Unit.a;
            case 22:
                List list = (List) obj;
                list.getClass();
                return new hhg(new wm2(list, false), (String) obj2);
            case 23:
                Intent intent = (Intent) obj;
                Context context = (Context) obj2;
                intent.getClass();
                context.getClass();
                context.startActivity(intent);
                return Unit.a;
            case 24:
                Context context2 = (Context) obj;
                afg afgVar = (afg) obj2;
                Integer valueOf = Integer.valueOf(R.id.title_textview);
                Integer valueOf2 = Integer.valueOf(R.id.advertiser_textview);
                Integer valueOf3 = Integer.valueOf(R.id.rating_bar);
                Integer valueOf4 = Integer.valueOf(R.id.cta_button);
                Integer valueOf5 = Integer.valueOf(R.id.icon_container);
                context2.getClass();
                afgVar.getClass();
                zeg zegVar = afgVar.g;
                String str = afgVar.d;
                Double d = afgVar.e;
                String str2 = afgVar.c;
                zeg zegVar2 = afgVar.f;
                String str3 = afgVar.b;
                String str4 = afgVar.a;
                if (zegVar == null && str3 == null) {
                    efg efgVar = new efg(Integer.valueOf(R.layout.native_ad_small), str4 != null ? valueOf : null, null, str2 != null ? valueOf4 : null, str != null ? valueOf2 : null, d != null ? valueOf3 : null, zegVar2 != null ? valueOf5 : null, null);
                    ViewGroup a = efgVar.a(context2);
                    if (str4 == null) {
                        a.findViewById(R.id.title_textview).setVisibility(8);
                    }
                    if (str == null) {
                        a.findViewById(R.id.advertiser_textview).setVisibility(8);
                    }
                    if (d == null) {
                        a.findViewById(R.id.rating_bar).setVisibility(8);
                    }
                    if (str2 == null) {
                        a.findViewById(R.id.cta_button).setVisibility(8);
                    }
                    if (zegVar2 == null) {
                        a.findViewById(R.id.icon_container).setVisibility(8);
                    }
                    return efgVar;
                }
                Integer valueOf6 = Integer.valueOf(R.layout.native_ad_medium);
                Integer num = str4 != null ? valueOf : null;
                Integer num2 = str != null ? valueOf2 : null;
                Integer num3 = d != null ? valueOf3 : null;
                efg efgVar2 = new efg(valueOf6, num, str3 != null ? Integer.valueOf(R.id.body_textview) : null, str2 != null ? valueOf4 : null, num2, num3, zegVar2 != null ? valueOf5 : null, zegVar != null ? Integer.valueOf(R.id.cover_container) : null);
                ViewGroup a2 = efgVar2.a(context2);
                if (str4 == null) {
                    a2.findViewById(R.id.title_textview).setVisibility(8);
                }
                if (str == null) {
                    a2.findViewById(R.id.advertiser_textview).setVisibility(8);
                }
                if (d == null) {
                    a2.findViewById(R.id.rating_bar).setVisibility(8);
                }
                if (str2 == null) {
                    a2.findViewById(R.id.cta_button).setVisibility(8);
                }
                if (str3 == null) {
                    a2.findViewById(R.id.body_textview).setVisibility(8);
                }
                if (zegVar2 == null) {
                    a2.findViewById(R.id.icon_container).setVisibility(8);
                }
                if (zegVar == null) {
                    a2.findViewById(R.id.cover_container).setVisibility(8);
                }
                return efgVar2;
            case 25:
                eig eigVar = (eig) obj;
                tdg tdgVar = (tdg) obj2;
                eigVar.getClass();
                tdgVar.getClass();
                return new veg(eigVar, tdgVar);
            case 26:
                Context context3 = (Context) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                context3.getClass();
                return new dgg(context3, booleanValue);
            case 27:
                Context context4 = (Context) obj;
                lgg lggVar = (lgg) obj2;
                context4.getClass();
                lggVar.getClass();
                return new akg(context4, lggVar, ocg.a);
            case 28:
                Context context5 = (Context) obj;
                String str5 = (String) obj2;
                context5.getClass();
                str5.getClass();
                return new uig(context5, str5);
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }

    public /* synthetic */ eee(byte b, int i) {
        this.a = i;
    }
}
