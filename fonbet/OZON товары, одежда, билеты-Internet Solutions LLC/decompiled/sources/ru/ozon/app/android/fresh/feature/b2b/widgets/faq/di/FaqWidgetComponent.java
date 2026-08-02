package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di;

import WZ.l;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\fJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/di/FaqWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqMapper;", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqMapper;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqViewModel;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Factory", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FaqWidgetComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/di/FaqWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/di/FaqWidgetComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        FaqWidgetComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull RetainComposerComponentApi retainComposerComponentApi);
    }

    @NotNull
    FaqMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    FaqViewModel getViewModel();
}
