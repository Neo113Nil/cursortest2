package defpackage;

import android.content.Context;
import android.os.Build;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xrd implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ysd b;
    public final /* synthetic */ OnboardingViewModel c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ BaseActivity f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xrd(c6d c6dVar, ysd ysdVar, Context context, BaseActivity baseActivity, OnboardingViewModel onboardingViewModel, boolean z) {
        this.b = ysdVar;
        this.c = onboardingViewModel;
        this.d = context;
        this.g = c6dVar;
        this.e = z;
        this.f = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.a;
        ard ardVar = ard.a;
        BaseActivity baseActivity = this.f;
        boolean z = this.e;
        Object obj2 = this.g;
        Context context = this.d;
        OnboardingViewModel onboardingViewModel = this.c;
        ysd ysdVar = this.b;
        switch (i) {
            case 0:
                int i2 = ysdVar.a;
                ((e1d) obj2).setValue(Boolean.FALSE);
                Iterator<E> it = xsd.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((xsd) obj).a == i2) {
                        }
                    } else {
                        obj = null;
                    }
                }
                xsd xsdVar = (xsd) obj;
                if (xsdVar == null) {
                    xsdVar = xsd.d;
                }
                String str = xsdVar.b;
                zsd zsdVar = zsd.Continue;
                nv.d0(context, str, "sign_in", i2);
                fsd.b(onboardingViewModel, z, context, baseActivity, ardVar);
                break;
            default:
                c6d c6dVar = (c6d) obj2;
                int i3 = ysdVar.a;
                zic zicVar = xsd.c;
                if (i3 == 2) {
                    onboardingViewModel.x(new brd(zsd.Continue));
                    context.getClass();
                    if (Build.VERSION.SDK_INT >= 33 ? eq3.b(context, "android.permission.POST_NOTIFICATIONS") == 0 : new fgd(context).b.areNotificationsEnabled()) {
                        fsd.b(onboardingViewModel, z, context, baseActivity, ardVar);
                    } else {
                        c6dVar.a.add(isd.INSTANCE);
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xrd(Context context, ysd ysdVar, e1d e1dVar, OnboardingViewModel onboardingViewModel, boolean z, BaseActivity baseActivity) {
        this.d = context;
        this.b = ysdVar;
        this.g = e1dVar;
        this.c = onboardingViewModel;
        this.e = z;
        this.f = baseActivity;
    }
}
