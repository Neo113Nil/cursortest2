package ru.ozon.app.android.partpayment.smssign.data;

import Bc.r;
import DM.g;
import Mc.a;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.view.vo.VerifySmsVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/data/SmsSignRepository;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "api", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;)V", "", ImagesContract.URL, "pin", "Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;", "validateSmsCode", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsSignRepository {

    @NotNull
    private final FormPageApiDataSource api;

    public SmsSignRepository(@NotNull FormPageApiDataSource api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifySmsVO validateSmsCode$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (VerifySmsVO) function1.invoke(p02);
    }

    @NotNull
    public final y<VerifySmsVO> validateSmsCode(@NotNull String url, @NotNull String pin) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pin, "pin");
        r rVar = new r(this.api.validateSmsCode(url, new ValidateSmsRequest(pin)).j(a.b()), new g(SmsSignRepository$validateSmsCode$1.INSTANCE, 4));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
