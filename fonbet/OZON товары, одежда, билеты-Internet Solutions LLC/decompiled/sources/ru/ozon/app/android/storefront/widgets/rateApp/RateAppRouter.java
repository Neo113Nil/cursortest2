package ru.ozon.app.android.storefront.widgets.rateApp;

import Fy.C3065c;
import GZ.g;
import HL.c;
import J7.d;
import J7.h;
import Lm0.a;
import Sc.o;
import Ve.C4286h1;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dj.C6208e;
import dj.f;
import dj.i;
import dj.j;
import dj.k;
import dj.l;
import jm0.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import lm0.b;
import lm0.t;
import nm0.C8607B;
import nm0.C8609D;
import nm0.m;
import nm0.x;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.RateInAppEnabledFlag;
import ru.ozon.app.android.domain.flags.InAppReviewSdkFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.rateApp.RateAppRouter;
import ru.rustore.sdk.review.model.ReviewInfo;
import yl0.C10923h;
import yl0.InterfaceC10920e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001b\u0010\u0014\u001a\u00020\n*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\n*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\n*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/RateAppRouter;", "", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LGZ/g;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/app/Activity;", "activity", "", "localInAppReview", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "marketIntent", "tryInAppReview", "(Landroid/app/Activity;Landroid/content/Intent;)V", "commonInAppReviewSDK", "Ldj/k;", "storeType", "getStoreSuccess", "(Landroid/app/Activity;Ldj/k;)V", "openStoreApp", "openMarketPage", "openGooglePlay", "LGZ/g;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppRouter {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final g ozonRouter;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.RU_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RateAppRouter(@NotNull g ozonRouter, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ozonRouter = ozonRouter;
        this.featureChecker = featureChecker;
    }

    private final void commonInAppReviewSDK(Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName()));
        k b11 = i.b(activity);
        if (b11 != k.OTHER) {
            getStoreSuccess(activity, b11);
        } else if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }

    private final void getStoreSuccess(final Activity context, k ozonInAppReviewStoreType) {
        int i11 = 1;
        if (!this.featureChecker.isEnabled(RateInAppEnabledFlag.INSTANCE)) {
            openStoreApp(context, ozonInAppReviewStoreType);
            return;
        }
        int i12 = i.f61647b;
        final RateAppRouter$getStoreSuccess$1 rateAppRouter$getStoreSuccess$1 = new RateAppRouter$getStoreSuccess$1(this, context, ozonInAppReviewStoreType);
        Intrinsics.checkNotNullParameter(context, "activity");
        if (ozonInAppReviewStoreType == null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ozonInAppReviewStoreType = i.b(applicationContext);
        }
        Intrinsics.checkNotNullParameter(context, "activity");
        Intrinsics.checkNotNullParameter(ozonInAppReviewStoreType, "ozonInAppReviewStoreType");
        int i13 = C6208e.f61645a[ozonInAppReviewStoreType.ordinal()];
        if (i13 == 1) {
            final h a11 = d.a(context);
            Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
            a11.b().addOnCompleteListener(new OnCompleteListener() { // from class: dj.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task reviewInfo) {
                    Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                    boolean isSuccessful = reviewInfo.isSuccessful();
                    Function1 function1 = rateAppRouter$getStoreSuccess$1;
                    if (isSuccessful) {
                        J7.h.this.a(context, (J7.b) reviewInfo.getResult()).addOnCompleteListener(new BN.b(function1, reviewInfo));
                        return;
                    }
                    if (reviewInfo.isCanceled()) {
                        function1.invoke(new j.a(0));
                        return;
                    }
                    Exception error = reviewInfo.getException();
                    if (error == null) {
                        error = new IllegalStateException("Не смогли получить ReviewInfo для " + k.GOOGLE_PLAY);
                    }
                    Intrinsics.checkNotNullParameter(error, "error");
                    function1.invoke(new j.b(new g(error)));
                }
            });
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 != 4) {
                    throw new o();
                }
                rateAppRouter$getStoreSuccess$1.invoke((RateAppRouter$getStoreSuccess$1) new j.b(new l("Не смогли определить магазин установки")));
                return;
            }
            Intent intent = new Intent("com.huawei.appmarket.intent.action.guidecomment");
            intent.setPackage("com.huawei.appmarket");
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                i.a().b(intent, rateAppRouter$getStoreSuccess$1);
                return;
            }
            ActivityNotFoundException error = new ActivityNotFoundException();
            Intrinsics.checkNotNullParameter(error, "error");
            rateAppRouter$getStoreSuccess$1.invoke((RateAppRouter$getStoreSuccess$1) new j.b(new f(error)));
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        final nm0.i iVar = new nm0.i(applicationContext2);
        C8609D c8609d = iVar.f77400a;
        c8609d.getClass();
        C4286h1 source = new C4286h1(c8609d, i11);
        Intrinsics.checkNotNullParameter(source, "source");
        b bVar = new b(source);
        int i14 = e.f70218e;
        C10923h a12 = m.a(t.a(bVar, e.c()));
        a12.i(new InterfaceC10920e() { // from class: dj.c
            @Override // yl0.InterfaceC10920e
            public final void onSuccess(Object obj) {
                ReviewInfo reviewInfo = (ReviewInfo) obj;
                Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                nm0.i iVar2 = nm0.i.this;
                Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                C8609D c8609d2 = iVar2.f77400a;
                c8609d2.getClass();
                Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                x source2 = new x(c8609d2, reviewInfo);
                Intrinsics.checkNotNullParameter(source2, "source");
                AbstractC7971a a13 = lm0.h.a(new lm0.b(source2), new C8607B(c8609d2, reviewInfo));
                int i15 = jm0.e.f70218e;
                C10923h a14 = m.a(t.a(a13, jm0.e.c()));
                Function1 function1 = rateAppRouter$getStoreSuccess$1;
                a14.i(new C3065c(function1, 10));
                a14.h(new Gy.a(function1, 6));
            }
        });
        a12.h(new BO.b(rateAppRouter$getStoreSuccess$1, 6));
    }

    private final void localInAppReview(Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + activity.getPackageName()));
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName()));
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            if (intent2.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent2);
            }
        } else if (this.featureChecker.isEnabled(RateInAppEnabledFlag.INSTANCE)) {
            tryInAppReview(activity, intent);
        } else {
            openMarketPage(activity, intent);
        }
    }

    private final void openMarketPage(Activity activity, Intent intent) {
        try {
            activity.startActivity(intent);
        } catch (Exception e11) {
            a.f17149a.e("Не удалось открыть intent магазина приложений", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openStoreApp(Activity activity, k kVar) {
        String str;
        int i11 = WhenMappings.$EnumSwitchMapping$0[kVar.ordinal()];
        if (i11 == 1) {
            str = "market://details?id=";
        } else if (i11 == 2) {
            str = "rustore://apps.rustore.ru/app/";
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new o();
                }
                return;
            }
            str = "appmarket://details?id=";
        }
        openMarketPage(activity, new Intent("android.intent.action.VIEW", Uri.parse(str + activity.getPackageName())));
    }

    private final void tryInAppReview(Activity activity, Intent marketIntent) {
        h a11 = d.a(activity);
        Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
        Task<J7.b> b11 = a11.b();
        Intrinsics.checkNotNullExpressionValue(b11, "requestReviewFlow(...)");
        b11.addOnCompleteListener(new c(a11, activity, this, marketIntent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInAppReview$lambda$2(J7.c cVar, final Activity activity, final RateAppRouter rateAppRouter, final Intent intent, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            rateAppRouter.openMarketPage(activity, intent);
            return;
        }
        Task<Void> a11 = cVar.a(activity, (J7.b) task.getResult());
        Intrinsics.checkNotNullExpressionValue(a11, "launchReviewFlow(...)");
        a11.addOnCompleteListener(new OnCompleteListener() { // from class: HL.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                RateAppRouter.tryInAppReview$lambda$2$lambda$1(RateAppRouter.this, activity, intent, task2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInAppReview$lambda$2$lambda$1(RateAppRouter rateAppRouter, Activity activity, Intent intent, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            return;
        }
        rateAppRouter.openMarketPage(activity, intent);
    }

    public final void openGooglePlay(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.featureChecker.isEnabled(InAppReviewSdkFlag.INSTANCE)) {
            commonInAppReviewSDK(activity);
        } else {
            localInAppReview(activity);
        }
    }
}
