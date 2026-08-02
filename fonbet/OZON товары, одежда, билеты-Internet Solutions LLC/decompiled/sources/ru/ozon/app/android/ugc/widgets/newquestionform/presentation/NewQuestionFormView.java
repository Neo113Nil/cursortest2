package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;", "", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "vo", "", "bind", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;)V", "onSuccess", "()V", "onShowProgress", "onHideProgress", "", "message", "onInputError", "(Ljava/lang/String;)V", "onNetworkError", "onUnknownError", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/Function2;", "", "getOnSubmit", "()Lkotlin/jvm/functions/Function2;", "setOnSubmit", "(Lkotlin/jvm/functions/Function2;)V", "onSubmit", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NewQuestionFormView {
    void bind(@NotNull NewQuestionFormVO vo);

    @NotNull
    View getContainerView();

    void onHideProgress();

    void onInputError(String message);

    void onNetworkError();

    void onShowProgress();

    void onSuccess();

    void onUnknownError();

    void setOnSubmit(Function2<? super String, ? super Boolean, Unit> function2);
}
