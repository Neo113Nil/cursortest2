package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bb7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7d b;

    public /* synthetic */ bb7(k7d k7dVar, int i) {
        this.a = i;
        this.b = k7dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle c;
        Intent intent;
        int i = this.a;
        int i2 = 0;
        r1 = false;
        boolean z = false;
        k7d k7dVar = this.b;
        switch (i) {
            case 0:
                k6d k6dVar = k7dVar.b;
                Activity activity = k7dVar.d;
                if (k7dVar.b() == 1) {
                    Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
                    if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
                        s6d f = k6dVar.f();
                        f.getClass();
                        int i3 = f.b.b;
                        g7d g7dVar = f.c;
                        while (true) {
                            if (g7dVar != null) {
                                i3d i3dVar = g7dVar.b;
                                if (g7dVar.g.b != i3) {
                                    lm5.a.getClass();
                                    Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                                        Intent intent2 = activity.getIntent();
                                        intent2.getClass();
                                        E.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                                        g7d i4 = k6dVar.i();
                                        Intent intent3 = activity.getIntent();
                                        intent3.getClass();
                                        r6d r = i4.r(new x6k(14, intent3.getData(), intent3.getAction(), intent3.getType()), i4);
                                        if ((r != null ? r.b : null) != null && (c = r.a.c(r.b)) != null) {
                                            E.putAll(c);
                                        }
                                    }
                                    ox9 ox9Var = new ox9(k7dVar);
                                    int i5 = i3dVar.b;
                                    ArrayList arrayList = (ArrayList) ox9Var.g;
                                    arrayList.clear();
                                    arrayList.add(new q6d(i5, null));
                                    ox9Var.t();
                                    ((Intent) ox9Var.e).putExtra("android-support-nav:controller:deepLinkExtras", E);
                                    ox9Var.g().c();
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                } else {
                                    i3 = i3dVar.b;
                                    g7dVar = g7dVar.c;
                                }
                            }
                        }
                    } else if (k7dVar.e) {
                        activity.getClass();
                        Intent intent4 = activity.getIntent();
                        Bundle extras2 = intent4.getExtras();
                        extras2.getClass();
                        int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                        intArray.getClass();
                        ArrayList arrayList2 = new ArrayList(intArray.length);
                        int length = intArray.length;
                        for (int i6 = 0; i6 < length; i6 = lnb.f(intArray[i6], arrayList2, i6, 1)) {
                        }
                        ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        int i7 = 2;
                        if (arrayList2.size() >= 2) {
                            int intValue = ((Number) o13.D(arrayList2)).intValue();
                            if (parcelableArrayList != null) {
                            }
                            s6d d = k6d.d(intValue, k6dVar.g(), null, false);
                            if (d instanceof g7d) {
                                int i8 = g7d.h;
                                intValue = ((s6d) i5h.m(e5h.e((g7d) d, new a7d(i7)))).b.b;
                            }
                            s6d f2 = k6dVar.f();
                            if (f2 != null && intValue == f2.b.b) {
                                ox9 ox9Var2 = new ox9(k7dVar);
                                lm5.a.getClass();
                                Bundle E2 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                E2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                                Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (bundle != null) {
                                    E2.putAll(bundle);
                                }
                                ((Intent) ox9Var2.e).putExtra("android-support-nav:controller:deepLinkExtras", E2);
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i9 = i2 + 1;
                                    if (i2 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    ((ArrayList) ox9Var2.g).add(new q6d(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i2) : null));
                                    ox9Var2.t();
                                    i2 = i9;
                                }
                                ox9Var2.g().c();
                                activity.finish();
                            }
                        }
                    }
                } else {
                    k7dVar.d();
                }
                return Unit.a;
            case 1:
                k7d.c(k7dVar, FantasyOnboardingStepsNavigation.CreateTeam.INSTANCE);
                return Unit.a;
            case 2:
                px0 px0Var = k7dVar.f;
                if (k7dVar.g && k7dVar.b() > 1) {
                    z = true;
                }
                px0Var.f(z);
                return Unit.a;
            default:
                return new q7d(k7dVar.a, k7dVar.b.s);
        }
    }
}
