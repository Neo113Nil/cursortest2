package ru.ozon.app.android.storage.adult;

import H30.i;
import NJ.a;
import Nc.C3667a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storage/adult/AdultStateImpl;", "Lru/ozon/app/android/storage/adult/AdultState;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "save", "()V", "clear", "Lio/reactivex/p;", "", "observeUserAdultState", "()Lio/reactivex/p;", "isUserAnAdult", "()Z", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "LNc/a;", "adultState", "LNc/a;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "adultTime", "J", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdultStateImpl implements AdultState {

    @NotNull
    private final C3667a<Boolean> adultState;
    private long adultTime;

    @NotNull
    private final Handler handler;

    @NotNull
    private final SharedPreferences preferences;

    public AdultStateImpl(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        SharedPreferences sharedPreferences = appContext.getSharedPreferences("adult_preference", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.preferences = sharedPreferences;
        this.handler = new Handler(Looper.getMainLooper());
        this.adultTime = sharedPreferences.getLong("adult_save_time", -1L);
        this.adultState = C3667a.e(Boolean.valueOf(isUserAnAdult()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clear$lambda$1(AdultStateImpl adultStateImpl) {
        adultStateImpl.adultState.onNext(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save$lambda$0(AdultStateImpl adultStateImpl) {
        adultStateImpl.adultState.onNext(Boolean.TRUE);
    }

    @Override // ru.ozon.app.android.storage.adult.AdultState
    public void clear() {
        this.adultTime = -1L;
        if (Intrinsics.d(this.adultState.f(), Boolean.FALSE)) {
            return;
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.remove("adult_save_time");
        edit.apply();
        this.handler.post(new a(this));
    }

    @Override // ru.ozon.app.android.storage.adult.AdultState
    public boolean isUserAnAdult() {
        return this.adultTime != -1;
    }

    @Override // ru.ozon.app.android.storage.adult.AdultState
    @NotNull
    public p<Boolean> observeUserAdultState() {
        return this.adultState;
    }

    @Override // ru.ozon.app.android.storage.adult.AdultState
    public void save() {
        this.adultTime = System.currentTimeMillis();
        if (Intrinsics.d(this.adultState.f(), Boolean.TRUE)) {
            return;
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putLong("adult_save_time", this.adultTime);
        edit.apply();
        this.handler.post(new i(this, 2));
    }
}
