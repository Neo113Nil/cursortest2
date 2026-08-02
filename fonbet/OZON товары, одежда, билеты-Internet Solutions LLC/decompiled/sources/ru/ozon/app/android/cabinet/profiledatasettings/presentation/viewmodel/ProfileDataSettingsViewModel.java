package ru.ozon.app.android.cabinet.profiledatasettings.presentation.viewmodel;

import B0.A0;
import BO.b;
import Gy.c;
import Mc.a;
import Sc.r;
import androidx.lifecycle.w0;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractor;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileDateMapper;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileUserViewMapper;
import ru.ozon.app.android.storage.user.model.User;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractor;", "interactor", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileUserViewMapper;", "userMapper", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileDateMapper;", "dateMapper", "<init>", "(Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractor;Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileUserViewMapper;Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileDateMapper;)V", "LSc/r;", "", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action;", "toAction", "(Ljava/lang/Object;)Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action;", "Lio/reactivex/y;", "Lnc/b;", "subscribeOnResult", "(Lio/reactivex/y;)Lnc/b;", "onCleared", "()V", "", "sex", "updateSex", "(Ljava/lang/String;)V", "", "dayOfMonth", "month", "year", "updateBirthday", "(III)V", "Lorg/joda/time/LocalDate;", "getUserBirthday", "()Lorg/joda/time/LocalDate;", "Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractor;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileUserViewMapper;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileDateMapper;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Action", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileDataSettingsViewModel extends w0 {

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final IProfileDateMapper dateMapper;

    @NotNull
    private final ProfileSettingsInteractor interactor;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @NotNull
    private final IProfileUserViewMapper userMapper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action;", "", "<init>", "()V", "Success", "Error", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action$Success;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(message=", this.message, ")");
            }

            public Error(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ Error(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action$Success;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 2124705248;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public ProfileDataSettingsViewModel(@NotNull ProfileSettingsInteractor interactor, @NotNull IProfileUserViewMapper userMapper, @NotNull IProfileDateMapper dateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userMapper, "userMapper");
        Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
        this.interactor = interactor;
        this.userMapper = userMapper;
        this.dateMapper = dateMapper;
        this.singleAction = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate getUserBirthday$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (LocalDate) function1.invoke(p02);
    }

    private final InterfaceC8487b subscribeOnResult(y<r<Unit>> yVar) {
        InterfaceC8487b h11 = yVar.j(a.b()).g(C8125a.a()).h(new b(new ProfileDataSettingsViewModel$subscribeOnResult$1(this), 4), new GJ.a(new ProfileDataSettingsViewModel$subscribeOnResult$2(this), 3));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Action toAction(Object obj) {
        r.Companion companion = r.INSTANCE;
        if (!(obj instanceof r.b)) {
            return Action.Success.INSTANCE;
        }
        Throwable b11 = r.b(obj);
        return new Action.Error(b11 != null ? b11.getMessage() : null);
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LocalDate getUserBirthday() {
        y<User> user = this.interactor.getUser();
        c cVar = new c(new ProfileDataSettingsViewModel$getUserBirthday$1(this), 3);
        user.getClass();
        T d11 = new Bc.r(user, cVar).j(a.b()).d();
        Intrinsics.checkNotNullExpressionValue(d11, "blockingGet(...)");
        return (LocalDate) d11;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void updateBirthday(int dayOfMonth, int month, int year) {
        RxExtKt.plusAssign(this.compositeDisposable, subscribeOnResult(this.interactor.updateUserBirthday(this.dateMapper.transformViewFormatToIsoForPatchUser(dayOfMonth, month, year))));
    }

    public final void updateSex(@NotNull String sex) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        RxExtKt.plusAssign(this.compositeDisposable, subscribeOnResult(this.interactor.updateUserSex(this.userMapper.transformSex(sex))));
    }
}
