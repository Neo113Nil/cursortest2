package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class a7d implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a7d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Drawable mutate;
        nlg V0;
        switch (this.a) {
            case 0:
                return new e70((trg) obj);
            case 1:
                return Unit.a;
            case 2:
                s6d s6dVar = (s6d) obj;
                s6dVar.getClass();
                if (!(s6dVar instanceof g7d)) {
                    return null;
                }
                gtj gtjVar = ((g7d) s6dVar).g;
                return gtjVar.h(gtjVar.b);
            case 3:
                return uo5.e(s02.h0(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, null, 6), 2);
            case 4:
                s6d s6dVar2 = ((d6d) ((r60) obj).a()).b;
                s6dVar2.getClass();
                int i = s6d.f;
                for (s6d s6dVar3 : l4a.t((ne3) s6dVar2)) {
                }
                return null;
            case 5:
                return uo5.f(s02.h0(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, null, 6), 2);
            case 6:
                return ((d6d) obj).f;
            case 7:
                vv2 vv2Var = (vv2) obj;
                g7f g7fVar = uhi.b;
                km5 km5Var = km5.a;
                vv2Var.a("type", g7fVar, km5Var, false);
                vv2Var.a(U3.i.X, aik.v("Any", new SerialDescriptor[0]), km5Var, false);
                return Unit.a;
            case 8:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 9:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (k7d) ((WeakReference) tag).get();
                }
                if (tag instanceof k7d) {
                    return (k7d) tag;
                }
                return null;
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Boolean.valueOf(zu3.V.hasMcc(Integer.valueOf(ke0.c)) && sharedPreferences.getBoolean("SHOULD_ASK_AGE_VERIFICATION", true));
            case 11:
                hv7 hv7Var = ((fcd) obj).a;
                if (hv7Var != null) {
                    hv7Var.invoke();
                }
                return Unit.a;
            case 12:
                ((Long) obj).getClass();
                return Unit.a;
            case 13:
                Context context = (Context) obj;
                context.getClass();
                Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                if ((4 & 2) != 0) {
                    valueOf = null;
                }
                Drawable drawable = context.getDrawable(R.drawable.ic_swap_16);
                if (drawable == null || (mutate = drawable.mutate()) == null) {
                    return null;
                }
                if (valueOf != null) {
                    mutate.setTint(context.getColor(valueOf.intValue()));
                }
                return mutate;
            case 14:
                vfd vfdVar = (vfd) obj;
                vfdVar.getClass();
                return vfd.a(vfdVar, null, false, true, false, 0L, 25);
            case 15:
                vfd vfdVar2 = (vfd) obj;
                vfdVar2.getClass();
                return vfd.a(vfdVar2, null, true, false, false, 0L, 25);
            case 16:
                hhd hhdVar = (hhd) obj;
                hhdVar.getClass();
                return hhd.a(hhdVar, false, 0L, null, false, true, 15);
            case 17:
                return hhd.a((hhd) obj, false, 0L, null, false, false, 15);
            case 18:
                return hhd.a((hhd) obj, false, 0L, null, true, false, 7);
            case 19:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT * FROM notification_settings");
                try {
                    int r = w1a.r(V0, "group");
                    int r2 = w1a.r(V0, "name");
                    int r3 = w1a.r(V0, "enabled");
                    int r4 = w1a.r(V0, "channelId");
                    int r5 = w1a.r(V0, "groupInSettingsScreen");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new NotificationSetting(V0.F0(r), V0.F0(r2), ((int) V0.getLong(r3)) != 0, V0.F0(r4), V0.F0(r5)));
                    }
                    return arrayList;
                } finally {
                }
            case 20:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT * FROM notification_settings");
                try {
                    int r6 = w1a.r(V0, "group");
                    int r7 = w1a.r(V0, "name");
                    int r8 = w1a.r(V0, "enabled");
                    int r9 = w1a.r(V0, "channelId");
                    int r10 = w1a.r(V0, "groupInSettingsScreen");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new NotificationSetting(V0.F0(r6), V0.F0(r7), ((int) V0.getLong(r8)) != 0, V0.F0(r9), V0.F0(r10)));
                    }
                    return arrayList2;
                } finally {
                }
            case 21:
                throw fn0.h(obj);
            case 22:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2));
            case 23:
                Context context2 = (Context) obj;
                context2.getClass();
                vjk[] vjkVarArr = vjk.a;
                Uri parse = Uri.parse("https://www.sofascore.com/terms-and-conditions");
                parse.getClass();
                Uri parse2 = Uri.parse("https://www.sofascore.com/privacy-policy");
                parse2.getClass();
                String string = context2.getString(R.string.privacy_terms, parse, parse2);
                string.getClass();
                TextView textView = new TextView(context2);
                mqi mqiVar = qhi.a;
                textView.setText(qhi.a(string));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextAppearance(R.style.BodySmall);
                textView.setLinkTextColor(context2.getColor(R.color.primary_default));
                textView.setTextColor(context2.getColor(R.color.n_lv_1));
                textView.setTextAlignment(4);
                return textView;
            case 24:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(600, 0, null, 6), 2), uo5.f(s02.h0(600, 0, null, 6), 2));
            case 25:
                OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) obj;
                onboardingItemUiModel.getClass();
                return onboardingItemUiModel.a();
            case 26:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.b));
            case 27:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.b));
            case 28:
                ((Integer) obj).getClass();
                return "OnboardingFavoriteComponent";
            default:
                ((OnboardingItemUiModel) obj).getClass();
                return "OnboardingAddedItemComponent";
        }
    }
}
