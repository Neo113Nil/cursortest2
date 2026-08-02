package ru.ozon.app.android.composer.view.screenState;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import z00.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/view/screenState/PageIssueListener;", "Lru/ozon/composer/ui/view/issue/PageIssueStateView$a;", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "pageIssueStateView", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/composer/ui/view/issue/PageIssueStateView;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lz00/f;", "issue", "", "", "", "createErrorSummaryProperties", "(Lz00/f;)Ljava/util/Map;", "", "onErrorSummaryClick", "()V", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "Lru/ozon/app/android/composer/ComposerNavigator;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageIssueListener implements PageIssueStateView.a {

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final PageIssueStateView pageIssueStateView;

    public PageIssueListener(@NotNull PageIssueStateView pageIssueStateView, @NotNull ComposerNavigator navigator) {
        Intrinsics.checkNotNullParameter(pageIssueStateView, "pageIssueStateView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.pageIssueStateView = pageIssueStateView;
        this.navigator = navigator;
    }

    private final Map<String, Object> createErrorSummaryProperties(f issue) {
        return issue instanceof f.c ? U.i(new Pair("ERROR_SUMMARY_PARAMS_KEY", issue)) : U.c();
    }

    @Override // ru.ozon.composer.ui.view.issue.PageIssueStateView.a
    public void onErrorSummaryClick() {
        f f94850c = this.pageIssueStateView.getF94850c();
        ComposerNavigator composerNavigator = this.navigator;
        String uri = LinkGenerator.INSTANCE.errorSummary().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        composerNavigator.openDeeplink(uri, createErrorSummaryProperties(f94850c));
    }
}
