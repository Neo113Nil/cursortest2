package ru.ozon.app.android.uikit.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002#$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "updateReason", "", "isUpdateAllowed", "(Landroidx/fragment/app/m;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;)Z", "Landroid/content/Context;", "context", "isDarkStatusBarForced", "(Landroid/content/Context;)Z", "isBgColorDark", "forceBgColor", "setStatusBarContentColor", "(Landroidx/fragment/app/m;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;ZZ)Z", "", "color", "setStatusBarBackgroundColor", "(Landroidx/fragment/app/m;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;I)Z", "colorAttr", "setStatusBarColorByTheme", "Landroid/view/Window;", "window", "enabled", "", "setFullScreenWindow", "(Landroid/view/Window;Z)V", "Ljava/util/WeakHashMap;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateInfo;", "windowUpdateInfo", "Ljava/util/WeakHashMap;", "UpdateReason", "UpdateInfo", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatusBarController {

    @NotNull
    public static final StatusBarController INSTANCE = new StatusBarController();

    @NotNull
    private static WeakHashMap<Window, UpdateInfo> windowUpdateInfo = new WeakHashMap<>();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateInfo;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/m;", "fragmentRef", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "updateReason", "<init>", "(Ljava/lang/ref/WeakReference;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/ref/WeakReference;", "getFragmentRef", "()Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "getUpdateReason", "()Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class UpdateInfo {

        @NotNull
        private final WeakReference<ComponentCallbacksC5392m> fragmentRef;

        @NotNull
        private final UpdateReason updateReason;

        public UpdateInfo(@NotNull WeakReference<ComponentCallbacksC5392m> fragmentRef, @NotNull UpdateReason updateReason) {
            Intrinsics.checkNotNullParameter(fragmentRef, "fragmentRef");
            Intrinsics.checkNotNullParameter(updateReason, "updateReason");
            this.fragmentRef = fragmentRef;
            this.updateReason = updateReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInfo)) {
                return false;
            }
            UpdateInfo updateInfo = (UpdateInfo) other;
            return Intrinsics.d(this.fragmentRef, updateInfo.fragmentRef) && Intrinsics.d(this.updateReason, updateInfo.updateReason);
        }

        @NotNull
        public final WeakReference<ComponentCallbacksC5392m> getFragmentRef() {
            return this.fragmentRef;
        }

        @NotNull
        public final UpdateReason getUpdateReason() {
            return this.updateReason;
        }

        public int hashCode() {
            return this.updateReason.hashCode() + (this.fragmentRef.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateInfo(fragmentRef=" + this.fragmentRef + ", updateReason=" + this.updateReason + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "", "priority", "", "<init>", "(I)V", "getPriority", "()I", "Initial", "Recovery", "NewState", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$Initial;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$NewState;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$Recovery;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UpdateReason {
        private final int priority;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$Initial;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Initial extends UpdateReason {

            @NotNull
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(0, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$NewState;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NewState extends UpdateReason {

            @NotNull
            public static final NewState INSTANCE = new NewState();

            private NewState() {
                super(2, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason$Recovery;", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Recovery extends UpdateReason {

            @NotNull
            public static final Recovery INSTANCE = new Recovery();

            private Recovery() {
                super(1, null);
            }
        }

        public /* synthetic */ UpdateReason(int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11);
        }

        public final int getPriority() {
            return this.priority;
        }

        private UpdateReason(int i11) {
            this.priority = i11;
        }
    }

    private StatusBarController() {
    }

    private final boolean isDarkStatusBarForced(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R$attr.isDarkStatusBar, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    private final boolean isUpdateAllowed(ComponentCallbacksC5392m fragment, UpdateReason updateReason) {
        Window window;
        UpdateReason updateReason2;
        WeakReference<ComponentCallbacksC5392m> fragmentRef;
        r activity = fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            UpdateInfo updateInfo = windowUpdateInfo.get(window);
            if (updateInfo == null || (updateReason2 = updateInfo.getUpdateReason()) == null) {
                updateReason2 = UpdateReason.Initial.INSTANCE;
            }
            r1 = updateReason.getPriority() >= updateReason2.getPriority() || Intrinsics.d((updateInfo == null || (fragmentRef = updateInfo.getFragmentRef()) == null) ? null : fragmentRef.get(), fragment);
            if (r1) {
                windowUpdateInfo.put(window, new UpdateInfo(new WeakReference(fragment), updateReason));
            }
        }
        return r1;
    }

    public static /* synthetic */ boolean setStatusBarColorByTheme$default(StatusBarController statusBarController, ComponentCallbacksC5392m componentCallbacksC5392m, UpdateReason updateReason, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = ru.ozon.uni.R$attr.layerFloor1;
        }
        return statusBarController.setStatusBarColorByTheme(componentCallbacksC5392m, updateReason, i11);
    }

    public static /* synthetic */ boolean setStatusBarContentColor$default(StatusBarController statusBarController, ComponentCallbacksC5392m componentCallbacksC5392m, UpdateReason updateReason, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return statusBarController.setStatusBarContentColor(componentCallbacksC5392m, updateReason, z11, z12);
    }

    public final void setFullScreenWindow(@NotNull Window window, boolean enabled) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (enabled) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | UserVerificationMethods.USER_VERIFY_ALL);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-1025));
        }
        if (systemUiVisibility != decorView.getSystemUiVisibility()) {
            decorView.dispatchSystemUiVisibilityChanged(decorView.getSystemUiVisibility());
        }
    }

    public final boolean setStatusBarBackgroundColor(ComponentCallbacksC5392m fragment, @NotNull UpdateReason updateReason, int color) {
        r activity;
        Window window;
        Intrinsics.checkNotNullParameter(updateReason, "updateReason");
        if (fragment == null || (activity = fragment.getActivity()) == null || (window = activity.getWindow()) == null || !isUpdateAllowed(fragment, updateReason)) {
            return false;
        }
        window.setStatusBarColor(color);
        return true;
    }

    public final boolean setStatusBarColorByTheme(@NotNull ComponentCallbacksC5392m fragment, @NotNull UpdateReason updateReason, int colorAttr) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(updateReason, "updateReason");
        r activity = fragment.getActivity();
        if (activity == null || !isUpdateAllowed(fragment, updateReason)) {
            return false;
        }
        Window window = activity.getWindow();
        setStatusBarContentColor$default(this, fragment, updateReason, ThemeExtKt.isDarkThemeActive(activity), false, 8, null);
        window.setStatusBarColor(ThemeExtKt.themeColor(activity, colorAttr));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r7 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setStatusBarContentColor(ComponentCallbacksC5392m fragment, @NotNull UpdateReason updateReason, boolean isBgColorDark, boolean forceBgColor) {
        r activity;
        Window window;
        Intrinsics.checkNotNullParameter(updateReason, "updateReason");
        boolean z11 = false;
        if (fragment == null || (activity = fragment.getActivity()) == null || (window = activity.getWindow()) == null || !isUpdateAllowed(fragment, updateReason)) {
            return false;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Context context = decorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean isDarkStatusBarForced = isDarkStatusBarForced(context);
        if (!forceBgColor) {
            Context context2 = decorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (!ThemeExtKt.isDarkThemeActive(context2)) {
                if (!isDarkStatusBarForced) {
                }
            }
            new Q0(decorView, window).e(z11);
            return true;
        }
    }
}
