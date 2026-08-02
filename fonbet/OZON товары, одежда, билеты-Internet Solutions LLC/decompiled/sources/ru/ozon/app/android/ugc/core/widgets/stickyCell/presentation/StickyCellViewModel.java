package ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "shownKey", "", "hideStickyCell", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "LAe/x0;", "", "_isVisible", "LAe/x0;", "LAe/M0;", "isVisible", "LAe/M0;", "()LAe/M0;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyCellViewModel extends w0 {
    private static boolean isShown;

    @NotNull
    private final x0<Boolean> _isVisible;

    @NotNull
    private final M0<Boolean> isVisible;

    @NotNull
    private final SharedPreferences sharedPreferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellViewModel$Companion;", "", "<init>", "()V", "", "isShown", "Z", "()Z", "setShown", "(Z)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isShown() {
            return StickyCellViewModel.isShown;
        }

        private Companion() {
        }
    }

    public StickyCellViewModel(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        x0<Boolean> a11 = O0.a(Boolean.valueOf(!isShown));
        this._isVisible = a11;
        this.isVisible = C2399j.b(a11);
    }

    public final void hideStickyCell(String shownKey) {
        isShown = true;
        if (shownKey != null) {
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putBoolean("stickyCell".concat(shownKey), true);
            edit.apply();
        }
        this._isVisible.setValue(Boolean.FALSE);
    }

    @NotNull
    public final M0<Boolean> isVisible() {
        return this.isVisible;
    }
}
