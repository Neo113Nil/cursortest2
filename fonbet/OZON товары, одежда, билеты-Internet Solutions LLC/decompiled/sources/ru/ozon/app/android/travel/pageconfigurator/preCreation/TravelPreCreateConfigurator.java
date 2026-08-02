package ru.ozon.app.android.travel.pageconfigurator.preCreation;

import B90.C2618u;
import Ib.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gk0.n;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.precreation.PreCreateWidgetsFacade;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\n !*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/preCreation/TravelPreCreateConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LIb/a;", "Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "preCreateWidgetsFacade", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "featureFlag", "<init>", "(LIb/a;Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)V", "", "fillPreCreationViewPool", "()V", "clearPreCreationViewPool", "", "Lgk0/n;", "preCreateInfos", "logPreCreation", "(Ljava/util/List;)V", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "LIb/a;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "Lxe/M;", "getLifecycleScope", "()Lxe/M;", "lifecycleScope", "", "getPreCreatePoolTag", "()Ljava/lang/String;", "preCreatePoolTag", "kotlin.jvm.PlatformType", "getFacade", "()Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "facade", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TravelPreCreateConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FeatureFlag featureFlag;

    @NotNull
    private final a<PreCreateWidgetsFacade> preCreateWidgetsFacade;

    public TravelPreCreateConfigurator(@NotNull a<PreCreateWidgetsFacade> preCreateWidgetsFacade, @NotNull FeatureFlag featureFlag) {
        Intrinsics.checkNotNullParameter(preCreateWidgetsFacade, "preCreateWidgetsFacade");
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        this.preCreateWidgetsFacade = preCreateWidgetsFacade;
        this.featureFlag = featureFlag;
    }

    private final void clearPreCreationViewPool() {
        String preCreatePoolTag = getPreCreatePoolTag();
        if (preCreatePoolTag != null) {
            q.f64554a.c(preCreatePoolTag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillPreCreationViewPool() {
        String preCreatePoolTag;
        r a11 = getContainer().a();
        if (a11 == null) {
            return;
        }
        List<n> preCreateInfos = getFacade().getPreCreateInfos(a11, this.featureFlag);
        if (preCreateInfos.isEmpty() || (preCreatePoolTag = getPreCreatePoolTag()) == null) {
            return;
        }
        q.f64554a.e(a11, preCreatePoolTag, preCreateInfos);
        logPreCreation(preCreateInfos);
    }

    private final PreCreateWidgetsFacade getFacade() {
        return this.preCreateWidgetsFacade.get();
    }

    private final M getLifecycleScope() {
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            return K.a(c11);
        }
        return null;
    }

    private final String getPreCreatePoolTag() {
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            return c11.toString();
        }
        return null;
    }

    private final void logPreCreation(List<? extends n> preCreateInfos) {
        Lm0.a.f17149a.i(C2618u.f(preCreateInfos.size(), "View pool initialized for ", getPreCreatePoolTag(), ": ", " widgets pre-created."), new Object[0]);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        M lifecycleScope = getLifecycleScope();
        if (lifecycleScope != null) {
            C10727i.c(lifecycleScope, C10720e0.a(), null, new TravelPreCreateConfigurator$onComposerInitialized$1(this, null), 2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        clearPreCreationViewPool();
        super.onDestroy(owner);
    }
}
