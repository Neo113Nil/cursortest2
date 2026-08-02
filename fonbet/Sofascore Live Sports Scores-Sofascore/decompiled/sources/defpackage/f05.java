package defpackage;

import android.content.Context;
import com.inmobi.media.C3401em;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.MatchOfTheWeekCtaType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f05 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f05(fwb fwbVar, qwb qwbVar, Function1 function1, Context context, mwb mwbVar, Brand brand) {
        this.c = fwbVar;
        this.d = qwbVar;
        this.b = function1;
        this.e = context;
        this.f = mwbVar;
        this.g = brand;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MatchOfTheWeekCtaType matchOfTheWeekCtaType;
        boolean z;
        int i = this.a;
        boolean z2 = true;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((e1d) obj2).setValue((String) ((Function1) obj6).invoke(obj4));
                ((Function1) obj5).invoke(obj4);
                wd8.a((wd8) obj3);
                ((e1d) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                fwb fwbVar = (fwb) obj5;
                qwb qwbVar = (qwb) obj4;
                Function1 function1 = (Function1) obj6;
                Context context = (Context) obj3;
                int i2 = ((mwb) obj2).a;
                Brand brand = (Brand) obj;
                if (fwbVar instanceof ewb) {
                    if (Intrinsics.c(qwbVar, owb.a)) {
                        function1.invoke(awb.a);
                    } else {
                        if (!(qwbVar instanceof pwb)) {
                            zzl.b();
                            return null;
                        }
                        Integer valueOf = Integer.valueOf(i2);
                        BrandLocation brandLocation = BrandLocation.MatchOfTheWeek;
                        String slug = brand.getSlug();
                        pwb pwbVar = (pwb) qwbVar;
                        int i3 = lwb.a[pwbVar.a.ordinal()];
                        if (i3 == 1) {
                            matchOfTheWeekCtaType = MatchOfTheWeekCtaType.WatchLiveButton;
                        } else if (i3 == 2) {
                            matchOfTheWeekCtaType = MatchOfTheWeekCtaType.ShopNowButton;
                        } else if (i3 == 3) {
                            matchOfTheWeekCtaType = MatchOfTheWeekCtaType.GiveawayButton;
                        } else {
                            if (i3 != 4) {
                                zzl.b();
                                return null;
                            }
                            matchOfTheWeekCtaType = MatchOfTheWeekCtaType.SeeMoreButton;
                        }
                        nv.p(context, valueOf, brandLocation, slug, matchOfTheWeekCtaType);
                        bea.G(context, pwbVar.b);
                    }
                } else {
                    if (!(fwbVar instanceof dwb)) {
                        zzl.b();
                        return null;
                    }
                    nv.p(context, Integer.valueOf(i2), BrandLocation.MatchOfTheWeek, brand.getSlug(), MatchOfTheWeekCtaType.BetOnButton);
                    bea.G(context, ((dwb) fwbVar).c);
                }
                return Unit.a;
            case 2:
                lpg lpgVar = (lpg) obj6;
                uqg uqgVar = (uqg) obj5;
                spg spgVar = (spg) obj3;
                String str = (String) obj2;
                Object[] objArr = (Object[]) obj;
                if (lpgVar.b != spgVar) {
                    lpgVar.b = spgVar;
                    z = true;
                } else {
                    z = false;
                }
                if (Intrinsics.c(lpgVar.c, str)) {
                    z2 = z;
                } else {
                    lpgVar.c = str;
                }
                lpgVar.a = uqgVar;
                lpgVar.d = obj4;
                lpgVar.e = objArr;
                rpg rpgVar = lpgVar.f;
                if (rpgVar != null && z2) {
                    ((x6k) rpgVar).z();
                    lpgVar.f = null;
                    lpgVar.c();
                }
                return Unit.a;
            default:
                return C3401em.a((XmlPullParser) obj6, (asf) obj5, (C3401em) obj4, (fsf) obj3, (fsf) obj2, (ArrayList) obj);
        }
    }

    public /* synthetic */ f05(lpg lpgVar, uqg uqgVar, spg spgVar, String str, Object obj, Object[] objArr) {
        this.b = lpgVar;
        this.c = uqgVar;
        this.e = spgVar;
        this.f = str;
        this.d = obj;
        this.g = objArr;
    }

    public /* synthetic */ f05(Function1 function1, Object obj, Function1 function12, wd8 wd8Var, e1d e1dVar, e1d e1dVar2) {
        this.b = function1;
        this.d = obj;
        this.c = function12;
        this.e = wd8Var;
        this.f = e1dVar;
        this.g = e1dVar2;
    }

    public /* synthetic */ f05(XmlPullParser xmlPullParser, asf asfVar, C3401em c3401em, fsf fsfVar, fsf fsfVar2, ArrayList arrayList) {
        this.b = xmlPullParser;
        this.c = asfVar;
        this.d = c3401em;
        this.e = fsfVar;
        this.f = fsfVar2;
        this.g = arrayList;
    }
}
