package ru.ozon.app.android.composer.di.modules;

import jk0.g;
import jk0.h;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a \u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005j\f\u0012\b\u0012\u00060\u0006j\u0002`\u0007`\b0\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/di/modules/WidgetLifecycleModule;", "", "<init>", "()V", "Ljk0/g;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "provideLifecycleAdapterDelegateFactory", "()Ljk0/g;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetLifecycleModule {

    @NotNull
    public static final WidgetLifecycleModule INSTANCE = new WidgetLifecycleModule();

    private WidgetLifecycleModule() {
    }

    @NotNull
    public final g<k<c>> provideLifecycleAdapterDelegateFactory() {
        return new h();
    }
}
