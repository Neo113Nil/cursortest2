package ru.ozon.app.android.partpayment.smssign.view;

import BF.a;
import DM.c;
import Fw.b;
import V.e;
import android.content.Context;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.m;
import org.joda.time.format.n;
import qc.InterfaceC9019a;
import ru.ozon.app.android.partpayment.R$string;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignRepository;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModelImpl;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000267B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel;", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/partpayment/smssign/data/SmsSignRepository;", "repository", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/partpayment/smssign/data/SmsSignRepository;)V", "", "durationSec", "", "resetTimer", "(I)V", "resendPin", "()V", "", ImagesContract.URL, "pin", "checkPin", "(Ljava/lang/String;Ljava/lang/String;)V", "retrySend", "onCleared", "Landroid/content/Context;", "Lru/ozon/app/android/partpayment/smssign/data/SmsSignRepository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction;", "noUiAction", "getNoUiAction", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$TimerInfoVO;", "timerInfo", "Landroidx/lifecycle/V;", "getTimerInfo", "()Landroidx/lifecycle/V;", "duration", "I", "Lnc/b;", "timerDisposable", "Lnc/b;", "Lnc/a;", "disposables", "Lnc/a;", "Lorg/joda/time/format/m;", "formatter", "Lorg/joda/time/format/m;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModelImpl$CheckInfo;", "lastCheckInfo", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModelImpl$CheckInfo;", "Companion", "CheckInfo", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsSignViewModelImpl extends w0 implements SmsSignViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<SmsSignViewModel.Action> action;

    @NotNull
    private final Context appContext;

    @NotNull
    private C8486a disposables;
    private int duration;

    @NotNull
    private final m formatter;
    private CheckInfo lastCheckInfo;

    @NotNull
    private final BroadcastSingleLiveEvent<SmsSignViewModel.NoUiAction> noUiAction;

    @NotNull
    private final SmsSignRepository repository;
    private InterfaceC8487b timerDisposable;

    @NotNull
    private final V<SmsSignViewModel.TimerInfoVO> timerInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModelImpl$CheckInfo;", "", "", "lastCheckedPin", "lastApproveUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastCheckedPin", "getLastApproveUrl", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckInfo {

        @NotNull
        private final String lastApproveUrl;

        @NotNull
        private final String lastCheckedPin;

        public CheckInfo(@NotNull String lastCheckedPin, @NotNull String lastApproveUrl) {
            Intrinsics.checkNotNullParameter(lastCheckedPin, "lastCheckedPin");
            Intrinsics.checkNotNullParameter(lastApproveUrl, "lastApproveUrl");
            this.lastCheckedPin = lastCheckedPin;
            this.lastApproveUrl = lastApproveUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckInfo)) {
                return false;
            }
            CheckInfo checkInfo = (CheckInfo) other;
            return Intrinsics.d(this.lastCheckedPin, checkInfo.lastCheckedPin) && Intrinsics.d(this.lastApproveUrl, checkInfo.lastApproveUrl);
        }

        @NotNull
        public final String getLastApproveUrl() {
            return this.lastApproveUrl;
        }

        @NotNull
        public final String getLastCheckedPin() {
            return this.lastCheckedPin;
        }

        public int hashCode() {
            return this.lastApproveUrl.hashCode() + (this.lastCheckedPin.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("CheckInfo(lastCheckedPin=", this.lastCheckedPin, ", lastApproveUrl=", this.lastApproveUrl, ")");
        }
    }

    public SmsSignViewModelImpl(@NotNull Context appContext, @NotNull SmsSignRepository repository) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.appContext = appContext;
        this.repository = repository;
        this.action = new BroadcastSingleLiveEvent<>();
        this.noUiAction = new BroadcastSingleLiveEvent<>();
        this.timerInfo = new V<>();
        this.duration = 60;
        this.disposables = new C8486a();
        n nVar = new n();
        nVar.r();
        nVar.q();
        nVar.f();
        nVar.j();
        nVar.r();
        nVar.q();
        nVar.h();
        m t2 = nVar.t();
        Intrinsics.checkNotNullExpressionValue(t2, "toFormatter(...)");
        this.formatter = t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetTimer$lambda$0(SmsSignViewModelImpl smsSignViewModelImpl) {
        smsSignViewModelImpl.getTimerInfo().postValue(new SmsSignViewModel.TimerInfoVO(StringProvider.getString(R$string.cabinet_retry_send), true, R$style.TextStyle_Body_L_Blue));
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    public void checkPin(@NotNull String url, @NotNull String pin) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.lastCheckInfo = new CheckInfo(pin, url);
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.repository.validateSmsCode(url, pin).g(C8125a.a()).h(new c(new SmsSignViewModelImpl$checkPin$1(this), 7), new b(new SmsSignViewModelImpl$checkPin$2(this), 8));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @NotNull
    public BroadcastSingleLiveEvent<SmsSignViewModel.NoUiAction> getNoUiAction() {
        return this.noUiAction;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    public void resendPin() {
        getNoUiAction().setValue(SmsSignViewModel.NoUiAction.ReSendPin.INSTANCE);
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    public void resetTimer(int durationSec) {
        this.duration = durationSec;
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        int i11 = 7;
        InterfaceC8487b subscribe = p.intervalRange(0L, durationSec + 1, 0L, 1L, TimeUnit.SECONDS).observeOn(C8125a.a()).doOnComplete(new InterfaceC9019a() { // from class: fC.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                SmsSignViewModelImpl.resetTimer$lambda$0(SmsSignViewModelImpl.this);
            }
        }).doOnSubscribe(new a(new SmsSignViewModelImpl$resetTimer$2(this), i11)).subscribe(new BF.b(new SmsSignViewModelImpl$resetTimer$3(durationSec, this), 11), new DM.b(new SmsSignViewModelImpl$resetTimer$4(Lm0.a.f17149a), i11));
        this.timerDisposable = subscribe;
        C8486a c8486a = this.disposables;
        Intrinsics.f(subscribe);
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    public void retrySend() {
        CheckInfo checkInfo = this.lastCheckInfo;
        if (checkInfo != null) {
            checkPin(checkInfo.getLastApproveUrl(), checkInfo.getLastCheckedPin());
        }
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    @NotNull
    public BroadcastSingleLiveEvent<SmsSignViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel
    @NotNull
    public V<SmsSignViewModel.TimerInfoVO> getTimerInfo() {
        return this.timerInfo;
    }
}
