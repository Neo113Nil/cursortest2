package ru.ozon.app.android.partpayment.presentation;

import EZ.e;
import Lc.a;
import android.content.ComponentName;
import android.net.Uri;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import qZ.C9011c;
import rZ.C9237b;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.partpayment.routing.CompoundDestinationFactory;
import sZ.c;
import tZ.C9786a;
import xZ.j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/partpayment/presentation/HomeCreditNavigator;", "LxZ/j;", "Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "compoundDestinationFactory", "Landroidx/appcompat/app/g;", "activity", "<init>", "(Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;Landroidx/appcompat/app/g;)V", "LEZ/e;", "response", "", "requestCode", "", "wrapNavigate", "(LEZ/e;I)V", "wrapToFragment", "(LEZ/e;)LEZ/e;", "LpZ/a;", "destination", "", "canWrapDestination", "(LpZ/a;)Z", "attachToHolder", "()V", "navigate", "Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HomeCreditNavigator extends j {

    @NotNull
    private final CompoundDestinationFactory compoundDestinationFactory;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HomeCreditNavigator(@NotNull CompoundDestinationFactory compoundDestinationFactory, @NotNull g activity) {
        super(activity, r4, activity, R$id.container, "HomeCredit", new a(), new c.b(0, 0, 0, 15, 0));
        Intrinsics.checkNotNullParameter(compoundDestinationFactory, "compoundDestinationFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        G supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.compoundDestinationFactory = compoundDestinationFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m _init_$lambda$0() {
        return new ComponentCallbacksC5392m();
    }

    private final boolean canWrapDestination(C8880a destination) {
        return Intrinsics.d(destination.a().getComponent(), new ComponentName(getActivity(), (Class<?>) HomeCreditActivity.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pZ.f] */
    private final void wrapNavigate(final e<?> response, int requestCode) {
        final ?? b11 = response.b();
        if (!(b11 instanceof C9237b)) {
            if (!(b11 instanceof C9786a)) {
                super.navigate(response, requestCode);
                return;
            } else if (getFragmentManager().l0() >= 1) {
                safeTransaction(new HomeCreditNavigator$wrapNavigate$2(this));
                return;
            } else {
                getActivity().finish();
                return;
            }
        }
        C9237b c9237b = (C9237b) b11;
        c<C9011c> root = c9237b.getRoot();
        e<?> e11 = response.e(root);
        Integer requestCode2 = c9237b.getRequestCode();
        if (requestCode2 != null) {
            requestCode = requestCode2.intValue();
        }
        super.navigate(e11, requestCode);
        final C9011c fragment = root.getFragment();
        if (fragment.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            EZ.g.redirect$default(this, response.e(c9237b.getRedirect()), 0, 2, null);
        } else {
            fragment.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.partpayment.presentation.HomeCreditNavigator$wrapNavigate$$inlined$whenStarted$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    J.this.getLifecycle().e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    EZ.g.redirect$default(this, response.e(((C9237b) b11).getRedirect()), 0, 2, null);
                    J.this.getLifecycle().e(this);
                }
            });
        }
    }

    private final e<?> wrapToFragment(e<?> response) {
        Object b11 = response.b();
        if (!(b11 instanceof C8880a)) {
            return response;
        }
        C8880a c8880a = (C8880a) b11;
        if (!canWrapDestination(c8880a)) {
            return response;
        }
        String stringExtra = c8880a.a().getStringExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_DEEPLINK");
        CompoundDestinationFactory compoundDestinationFactory = this.compoundDestinationFactory;
        r activity = getActivity();
        Uri parse = Uri.parse(stringExtra);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return response.e(compoundDestinationFactory.createDestination(activity, parse));
    }

    @Override // xZ.j, EZ.g
    protected void attachToHolder() {
    }

    @Override // xZ.j, EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        wrapNavigate(wrapToFragment(response), requestCode);
    }
}
