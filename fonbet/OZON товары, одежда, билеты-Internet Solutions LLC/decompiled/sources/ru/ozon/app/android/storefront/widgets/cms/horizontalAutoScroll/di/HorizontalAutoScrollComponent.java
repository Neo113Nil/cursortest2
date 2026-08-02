package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.di;

import WZ.l;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0015\u0010\f\u001a\u00060\bj\u0002`\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/di/HorizontalAutoScrollComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HorizontalAutoScrollComponent implements InterfaceC6958a {

    @NotNull
    private final C7475g storage;

    public HorizontalAutoScrollComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    @NotNull
    public final Context getContext() {
        return ((ContextComponentDependencies) this.storage.getComponent(ContextComponentDependencies.class)).getContext();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
