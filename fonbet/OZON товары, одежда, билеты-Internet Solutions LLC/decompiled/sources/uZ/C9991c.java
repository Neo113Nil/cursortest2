package uZ;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: uZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9991c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC9990b f100435a;

    public C9991c(@NotNull AbstractC9990b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f100435a = parent;
    }

    public final void a(int i11, int i12, Intent intent) {
        AbstractC9990b abstractC9990b = this.f100435a;
        ComponentCallbacksC5392m targetFragment = abstractC9990b.getTargetFragment();
        int targetRequestCode = abstractC9990b.getTargetRequestCode();
        if (targetRequestCode == 9002 && (targetFragment instanceof DialogInterfaceOnCancelListenerC5390k)) {
            ComponentCallbacksC5392m w02 = ((DialogInterfaceOnCancelListenerC5390k) targetFragment).getChildFragmentManager().w0();
            if (w02 != null) {
                w02.onActivityResult(i11, i12, intent);
                return;
            }
            return;
        }
        if (targetFragment != null) {
            Integer valueOf = Integer.valueOf(i11);
            if (i11 == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                targetRequestCode = valueOf.intValue();
            }
            targetFragment.onActivityResult(targetRequestCode, i12, intent);
        }
    }
}
