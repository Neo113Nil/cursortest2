package ru.ozon.app.android.storage.railwaymock;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001b\u0010\u000b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storage/railwaymock/RailwayMockStorageImpl;", "Lru/ozon/app/android/storage/railwaymock/RailwayMockStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "", "isEnabled", "", "set", "(Z)V", "()Z", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$delegate", "LSc/j;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RailwayMockStorageImpl implements RailwayMockStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    /* renamed from: isEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isEnabled;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storage/railwaymock/RailwayMockStorageImpl$Companion;", "", "<init>", "()V", "RAILWAY_MOCK_PREFERENCES", "", "IS_ENABLED", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RailwayMockStorageImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isEnabled = k.b(new RailwayMockStorageImpl$isEnabled$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPrefs() {
        return this.context.getSharedPreferences("railway_mock_preference", 0);
    }

    private final AtomicBoolean isEnabled() {
        return (AtomicBoolean) this.isEnabled.getValue();
    }

    @Override // ru.ozon.app.android.storage.railwaymock.RailwayMockStorage
    public void set(boolean isEnabled) {
        isEnabled().set(isEnabled);
        SharedPreferences sharedPrefs = getSharedPrefs();
        Intrinsics.checkNotNullExpressionValue(sharedPrefs, "getSharedPrefs(...)");
        SharedPreferences.Editor edit = sharedPrefs.edit();
        edit.clear();
        edit.putBoolean("is_enabled", isEnabled);
        edit.apply();
    }

    @Override // ru.ozon.app.android.storage.railwaymock.RailwayMockStorage
    /* renamed from: isEnabled, reason: collision with other method in class */
    public boolean mo1019isEnabled() {
        return isEnabled().get();
    }
}
