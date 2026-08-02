package pd;

import android.content.Context;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.ui.activities.MainActivity;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21755b;

    public /* synthetic */ e(MainActivity mainActivity, int i5) {
        this.f21754a = i5;
        this.f21755b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.google.android.play.core.appupdate.f fVar;
        switch (this.f21754a) {
            case 0:
                MainActivity mainActivity = this.f21755b;
                Set set = MainActivity.J0;
                return new sd.o(mainActivity);
            case 1:
                MainActivity owner = this.f21755b;
                Set set2 = MainActivity.J0;
                Intrinsics.checkNotNullParameter(owner, "activity");
                Intrinsics.checkNotNullParameter(owner, "owner");
                o1 store = owner.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner, "owner");
                m1 factory = owner.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner, "owner");
                t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(t.class, "modelClass");
                ag.c modelClass = u6.h.m(t.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                String r5 = d5.r(modelClass);
                if (r5 != null) {
                    return (t) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 2:
                MainActivity owner2 = this.f21755b;
                Set set3 = MainActivity.J0;
                mc.a aVar = pe.s.F;
                Intrinsics.checkNotNullParameter(owner2, "activity");
                ge.n factory2 = pe.s.H;
                Intrinsics.checkNotNullParameter(owner2, "owner");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                o1 store2 = owner2.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner2, "owner");
                t1.c defaultCreationExtras2 = owner2.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store2, "store");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar2 = new com.google.firebase.messaging.x(store2, factory2, defaultCreationExtras2);
                Intrinsics.checkNotNullParameter(pe.s.class, "modelClass");
                ag.c modelClass2 = u6.h.m(pe.s.class);
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                String r6 = d5.r(modelClass2);
                if (r6 != null) {
                    return (pe.s) xVar2.x(modelClass2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r6));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 3:
                MainActivity owner3 = this.f21755b;
                Set set4 = MainActivity.J0;
                Intrinsics.checkNotNullParameter(owner3, "activity");
                ge.n factory3 = new ge.n(6);
                Intrinsics.checkNotNullParameter(owner3, "owner");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                o1 store3 = owner3.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner3, "owner");
                t1.c defaultCreationExtras3 = owner3.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store3, "store");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras3, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar3 = new com.google.firebase.messaging.x(store3, factory3, defaultCreationExtras3);
                Intrinsics.checkNotNullParameter(c.class, "modelClass");
                ag.c modelClass3 = u6.h.m(c.class);
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                String r10 = d5.r(modelClass3);
                if (r10 != null) {
                    return (c) xVar3.x(modelClass3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r10));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 4:
                MainActivity owner4 = this.f21755b;
                Set set5 = MainActivity.J0;
                Intrinsics.checkNotNullParameter(owner4, "activity");
                ge.n factory4 = new ge.n(7);
                Intrinsics.checkNotNullParameter(owner4, "owner");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                o1 store4 = owner4.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner4, "owner");
                t1.c defaultCreationExtras4 = owner4.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store4, "store");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras4, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar4 = new com.google.firebase.messaging.x(store4, factory4, defaultCreationExtras4);
                Intrinsics.checkNotNullParameter(x.class, "modelClass");
                ag.c modelClass4 = u6.h.m(x.class);
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                String r11 = d5.r(modelClass4);
                if (r11 != null) {
                    return (x) xVar4.x(modelClass4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r11));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                Context context = this.f21755b;
                synchronized (com.google.android.play.core.appupdate.b.class) {
                    try {
                        if (com.google.android.play.core.appupdate.b.f5994a == null) {
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            com.google.android.play.core.appupdate.b.f5994a = new com.google.android.play.core.appupdate.f(new b2.e(context, (char) 0));
                        }
                        fVar = com.google.android.play.core.appupdate.b.f5994a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                com.google.android.play.core.appupdate.e eVar = (com.google.android.play.core.appupdate.e) fVar.f6000a.a();
                Intrinsics.checkNotNullExpressionValue(eVar, "create(...)");
                return eVar;
        }
    }
}
