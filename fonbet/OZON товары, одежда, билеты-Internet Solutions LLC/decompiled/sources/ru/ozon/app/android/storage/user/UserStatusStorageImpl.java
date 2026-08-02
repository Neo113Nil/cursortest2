package ru.ozon.app.android.storage.user;

import C.C2702w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lru/ozon/app/android/storage/user/UserStatusStorageImpl;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Landroid/content/SharedPreferences;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isAutoTestUser", "Z", "()Z", "setAutoTestUser", "(Z)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isOzonEmployee$delegate", "LSc/j;", "get_isOzonEmployee", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "_isOzonEmployee", "_isOzonQa$delegate", "get_isOzonQa", "_isOzonQa", "autoTestUserChanged", "", "Lru/ozon/app/android/storage/user/UserStatusStorage$OnAutoTestUserChanged;", "autoTestUserListeners", "Ljava/util/List;", "isOzonEmployee", "setOzonEmployee", "isOzonQa", "setOzonQa", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes7.dex */
public final class UserStatusStorageImpl implements UserStatusStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: _isOzonEmployee$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j _isOzonEmployee;

    /* renamed from: _isOzonQa$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j _isOzonQa;
    private boolean autoTestUserChanged;

    @NotNull
    private List<UserStatusStorage.OnAutoTestUserChanged> autoTestUserListeners;
    private boolean isAutoTestUser;

    @NotNull
    private final SharedPreferences preferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storage/user/UserStatusStorageImpl$Companion;", "", "<init>", "()V", "PREF_IS_OZON_EMPLOYEE", "", "PREF_IS_OZON_QA", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UserStatusStorageImpl(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this._isOzonEmployee = k.b(new UserStatusStorageImpl$_isOzonEmployee$2(this));
        this._isOzonQa = k.b(new UserStatusStorageImpl$_isOzonQa$2(this));
        this.autoTestUserListeners = new ArrayList();
    }

    private final AtomicBoolean get_isOzonEmployee() {
        return (AtomicBoolean) this._isOzonEmployee.getValue();
    }

    private final AtomicBoolean get_isOzonQa() {
        return (AtomicBoolean) this._isOzonQa.getValue();
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    /* renamed from: isAutoTestUser, reason: from getter */
    public boolean getIsAutoTestUser() {
        return this.isAutoTestUser;
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    public boolean isOzonEmployee() {
        return get_isOzonEmployee().get();
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    public boolean isOzonQa() {
        return get_isOzonQa().get();
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    public void setAutoTestUser(boolean z11) {
        this.autoTestUserChanged = true;
        this.isAutoTestUser = z11;
        Iterator<T> it = this.autoTestUserListeners.iterator();
        while (it.hasNext()) {
            ((UserStatusStorage.OnAutoTestUserChanged) it.next()).onChanged(z11);
        }
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    public void setOzonEmployee(boolean z11) {
        get_isOzonEmployee().set(z11);
        C2702w.e(this.preferences, "ru.ozon.app.android.storage.user.UserStatusStorage.IS_OZON_EMPLOYEE", z11);
    }

    @Override // ru.ozon.app.android.storage.user.UserStatusStorage
    public void setOzonQa(boolean z11) {
        get_isOzonQa().set(z11);
        C2702w.e(this.preferences, "ru.ozon.app.android.storage.user.UserStatusStorage.IS_OZON_QA", z11);
    }
}
