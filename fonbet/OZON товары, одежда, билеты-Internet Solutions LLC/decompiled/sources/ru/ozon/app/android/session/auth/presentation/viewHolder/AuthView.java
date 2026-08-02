package ru.ozon.app.android.session.auth.presentation.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.data.HintClickDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\nR*\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;", "", "Lru/ozon/app/android/session/auth/data/AuthVO;", "item", "", "silent", "", "bind", "(Lru/ozon/app/android/session/auth/data/AuthVO;Z)V", "onProgress", "()V", "onHideProgress", "", "message", "onError", "(Ljava/lang/String;)V", "onDestroyView", "Lkotlin/Function1;", "Lru/ozon/app/android/session/auth/data/FieldAction;", "getOnFieldAction", "()Lkotlin/jvm/functions/Function1;", "setOnFieldAction", "(Lkotlin/jvm/functions/Function1;)V", "onFieldAction", "Lru/ozon/app/android/session/auth/data/HintClickDTO;", "getOnHintClicked", "setOnHintClicked", "onHintClicked", "Lkotlin/Function0;", "getOnSubmitButtonClicked", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitButtonClicked", "(Lkotlin/jvm/functions/Function0;)V", "onSubmitButtonClicked", "getOnSberAuthClicked", "setOnSberAuthClicked", "onSberAuthClicked", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AuthView {
    void bind(@NotNull AuthVO item, boolean silent);

    void onDestroyView();

    void onError(String message);

    void onHideProgress();

    void onProgress();

    void setOnFieldAction(Function1<? super FieldAction, Unit> function1);

    void setOnHintClicked(Function1<? super HintClickDTO, Unit> function1);

    void setOnSberAuthClicked(Function0<Unit> function0);

    void setOnSubmitButtonClicked(Function0<Unit> function0);
}
