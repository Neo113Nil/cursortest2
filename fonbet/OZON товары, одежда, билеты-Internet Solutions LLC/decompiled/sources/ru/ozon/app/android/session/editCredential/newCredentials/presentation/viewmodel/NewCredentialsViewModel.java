package ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel;

import Ib0.c;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.newCredentials.data.ResponseModel;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModel;", "", "", "input", "", "onTextChanged", "(Ljava/lang/String;)V", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "item", "onButtonClick", "(Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;Ljava/lang/String;)V", "newCredentialsVO", "LIb0/c$a;", "otpFlowResult", "onOtpFlowResult", "(Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;LIb0/c$a;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;", "getLiveData", "()Landroidx/lifecycle/P;", "liveData", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NewCredentialsViewModel {
    @NotNull
    P<ResponseModel> getLiveData();

    void onButtonClick(@NotNull NewCredentialsVO item, @NotNull String input);

    void onOtpFlowResult(@NotNull NewCredentialsVO newCredentialsVO, @NotNull c.a otpFlowResult);

    void onTextChanged(@NotNull String input);
}
