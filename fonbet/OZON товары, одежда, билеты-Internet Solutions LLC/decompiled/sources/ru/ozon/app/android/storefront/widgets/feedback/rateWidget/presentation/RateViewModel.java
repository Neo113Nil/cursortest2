package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "onElementCheckboxClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "sectionKey", "text", "onTextInput", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "sections", "onBindList", "(Ljava/util/List;)V", "onNextButtonClick", "Landroidx/lifecycle/P;", "getActionTrigger", "()Landroidx/lifecycle/P;", "actionTrigger", "getNewList", "newList", "", "isButtonEnable", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RateViewModel {
    @NotNull
    P<AtomAction> getActionTrigger();

    @NotNull
    P<List<RateSection>> getNewList();

    @NotNull
    P<Boolean> isButtonEnable();

    void onBindList(@NotNull List<? extends RateSection> sections);

    void onElementCheckboxClick(@NotNull AtomAction action);

    void onNextButtonClick(@NotNull AtomAction action);

    void onTextInput(@NotNull String sectionKey, @NotNull String text);
}
