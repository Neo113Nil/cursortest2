package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import AF.b;
import AF.d;
import Bc.r;
import Fn.C3055d;
import Fn.C3056e;
import Lm0.a;
import androidx.lifecycle.w0;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.session.userAdultModalMobile.data.AdultConfirmationRepository;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.BirthdayActionRequest;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetAdultConfirmationRequest;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.SetBirthdayResponse;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewModel;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.AdultConfirmationAction;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.BirthdayActionParams;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import uc.i;
import vc.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/userAdultModalMobile/data/AdultConfirmationRepository;", "repo", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/BirthdayModelBuilder;", "modelBuilder", "<init>", "(Lru/ozon/app/android/session/userAdultModalMobile/data/AdultConfirmationRepository;Lru/ozon/app/android/session/userAdultModalMobile/presentation/BirthdayModelBuilder;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "composerAction", "", "birthday", "", "processSetBirthdayAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;)V", "processSetAdultConfirmation", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/AdultConfirmationAction;", "mapToAction", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/SetBirthdayResponse;)Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/AdultConfirmationAction;", "hideLoader", "()V", "", "throwable", "onCallError", "(Ljava/lang/Throwable;)V", "onCleared", "executeInvokeRefresh", "executeBack", "Lru/ozon/app/android/session/userAdultModalMobile/data/AdultConfirmationRepository;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/BirthdayModelBuilder;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "setDateFormat", "(Ljava/text/SimpleDateFormat;)V", "Ljava/lang/String;", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdultConfirmationViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<AdultConfirmationAction> action;
    private String birthday;
    private SimpleDateFormat dateFormat;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final BirthdayModelBuilder modelBuilder;

    @NotNull
    private final AdultConfirmationRepository repo;
    public static final int $stable = 8;

    public AdultConfirmationViewModel(@NotNull AdultConfirmationRepository repo, @NotNull BirthdayModelBuilder modelBuilder) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(modelBuilder, "modelBuilder");
        this.repo = repo;
        this.modelBuilder = modelBuilder;
        this.action = new SingleLiveEvent<>();
        this.disposables = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoader() {
        this.action.setValue(AdultConfirmationAction.HideLoader.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdultConfirmationAction mapToAction(SetBirthdayResponse setBirthdayResponse) {
        return !h.K(setBirthdayResponse.getLink()) ? AdultConfirmationAction.Refresh.INSTANCE.createInstance(setBirthdayResponse.getLink()) : !h.K(setBirthdayResponse.getValidationMessage()) ? new AdultConfirmationAction.ShowErrorState(setBirthdayResponse.getValidationMessage()) : AdultConfirmationAction.Refresh.Companion.createInstance$default(AdultConfirmationAction.Refresh.INSTANCE, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCallError(Throwable throwable) {
        hideLoader();
        this.action.setValue(new AdultConfirmationAction.ShowErrorNotification(null, 1, 0 == true ? 1 : 0));
        a.f17149a.e(throwable);
    }

    private final void processSetAdultConfirmation(AtomAction.ComposerAction composerAction) {
        this.action.setValue(AdultConfirmationAction.ShowLoader.INSTANCE);
        C8486a c8486a = this.disposables;
        l lVar = new l(this.repo.setAdultConfirmation(new SetAdultConfirmationRequest(composerAction.getActionName())).k(Mc.a.b()), C8125a.a());
        i iVar = new i(new b(new AdultConfirmationViewModel$processSetAdultConfirmation$2(this), 3), new InterfaceC9019a() { // from class: KJ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                AdultConfirmationViewModel.processSetAdultConfirmation$lambda$6(AdultConfirmationViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processSetAdultConfirmation$lambda$6(AdultConfirmationViewModel adultConfirmationViewModel) {
        adultConfirmationViewModel.action.setValue(AdultConfirmationAction.Refresh.Companion.createInstance$default(AdultConfirmationAction.Refresh.INSTANCE, null, 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void processSetBirthdayAction(AtomAction.ComposerAction composerAction, String birthday) {
        Long l11;
        SimpleDateFormat simpleDateFormat;
        Date parse;
        String str = null;
        Object[] objArr = 0;
        if (birthday != null) {
            if (h.K(birthday)) {
                birthday = null;
            }
            if (birthday != null) {
                try {
                    simpleDateFormat = this.dateFormat;
                } catch (Exception unused) {
                }
                if (simpleDateFormat != null && (parse = simpleDateFormat.parse(birthday)) != null) {
                    l11 = Long.valueOf(parse.getTime());
                    if (l11 != null) {
                        BirthdayActionRequest buildRequest = this.modelBuilder.buildRequest(new BirthdayActionParams(composerAction, l11.longValue()));
                        this.action.setValue(AdultConfirmationAction.ShowLoader.INSTANCE);
                        C8486a c8486a = this.disposables;
                        InterfaceC8487b h11 = new r(this.repo.setBirthday(buildRequest).j(Mc.a.b()).g(C8125a.a()), new C3055d(new AdultConfirmationViewModel$processSetBirthdayAction$1(this), 4)).h(new d(new AdultConfirmationViewModel$processSetBirthdayAction$2(this), 2), new C3056e(new AdultConfirmationViewModel$processSetBirthdayAction$3(this), 2));
                        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
                        RxExtKt.plusAssign(c8486a, h11);
                        return;
                    }
                }
                l11 = null;
                if (l11 != null) {
                }
            }
        }
        this.action.setValue(new AdultConfirmationAction.ShowErrorNotification(str, 1, objArr == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdultConfirmationAction processSetBirthdayAction$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AdultConfirmationAction) function1.invoke(p02);
    }

    public final void executeBack() {
        this.action.setValue(AdultConfirmationAction.Back.INSTANCE);
    }

    public final void executeInvokeRefresh(@NotNull AtomAction.ComposerAction composerAction, String birthday) {
        Intrinsics.checkNotNullParameter(composerAction, "composerAction");
        String actionName = composerAction.getActionName();
        if (Intrinsics.d(actionName, "setBirthdate")) {
            processSetBirthdayAction(composerAction, birthday);
        } else if (Intrinsics.d(actionName, "setAdultConfirmation")) {
            processSetAdultConfirmation(composerAction);
        }
    }

    @NotNull
    public final SingleLiveEvent<AdultConfirmationAction> getAction() {
        return this.action;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.dispose();
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public final void setDateFormat(SimpleDateFormat simpleDateFormat) {
        this.dateFormat = simpleDateFormat;
    }
}
