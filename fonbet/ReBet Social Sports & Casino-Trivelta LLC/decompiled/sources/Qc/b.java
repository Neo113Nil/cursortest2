package Qc;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.ReactRootView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9621a = new b();

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentManager a(ViewGroup view) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        ReactRootView reactRootView = view;
        while (true) {
            z10 = reactRootView instanceof ReactRootView;
            if (z10 || (reactRootView instanceof Oc.a) || reactRootView.getParent() == null) {
                break;
            }
            ViewParent parent = reactRootView.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            reactRootView = parent;
        }
        if (!(reactRootView instanceof Oc.a)) {
            if (z10) {
                return b(reactRootView);
            }
            throw new IllegalStateException(("[RNScreens] Expected parent to be a ReactRootView, instead found: " + reactRootView.getClass().getName()).toString());
        }
        Fragment associatedFragment = ((Oc.a) reactRootView).getAssociatedFragment();
        if (associatedFragment != null) {
            return associatedFragment.getChildFragmentManager();
        }
        throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + reactRootView + " returned nullish fragment").toString());
    }

    public final FragmentManager b(ReactRootView reactRootView) {
        boolean z10;
        Context context = reactRootView.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC2168s;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) context;
        if (abstractActivityC2168s.getSupportFragmentManager().C0().isEmpty()) {
            return abstractActivityC2168s.getSupportFragmentManager();
        }
        try {
            return FragmentManager.n0(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return abstractActivityC2168s.getSupportFragmentManager();
        }
    }
}
