package ru.ozon.app.android.web;

import EZ.e;
import EZ.g;
import OZ.h;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.AbstractC9643a;
import tZ.C9786a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/web/WebViewBottomSheetNavigator;", "LEZ/g;", "Landroidx/fragment/app/k;", "fragment", "<init>", "(Landroidx/fragment/app/k;)V", "LEZ/e;", "response", "", "requestCode", "", "navigate", "(LEZ/e;I)V", "Landroidx/fragment/app/k;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewBottomSheetNavigator extends g {

    @NotNull
    private final DialogInterfaceOnCancelListenerC5390k fragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebViewBottomSheetNavigator(@NotNull DialogInterfaceOnCancelListenerC5390k fragment) {
        super(r2, null, r4, fragment, 2, null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.fragment = fragment;
    }

    @Override // EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof C9786a) {
            if (this.fragment.isAdded()) {
                this.fragment.dismissAllowingStateLoss();
                return;
            } else {
                next(response, requestCode);
                return;
            }
        }
        if (!(b11 instanceof AbstractC9643a) && !(b11 instanceof OZ.e) && !(b11 instanceof h)) {
            next(response, requestCode);
            return;
        }
        if (this.fragment.isAdded()) {
            this.fragment.dismissAllowingStateLoss();
        }
        next(response, requestCode);
    }
}
