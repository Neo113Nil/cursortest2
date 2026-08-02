package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

import Ae.M0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/M0;", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/InputResult;", "observeResultFlow", "()LAe/M0;", "", "str", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "inputField", "", "checkInputLocally", "(Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "inputText", "changePublicName", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProfileInputsViewModel extends w0 {
    public abstract void changePublicName(@NotNull AtomAction.Click action, @NotNull String inputText);

    public abstract void checkInputLocally(@NotNull String str, @NotNull ProfileInputsDTO.InputField inputField);

    @NotNull
    public abstract M0<InputResult> observeResultFlow();
}
