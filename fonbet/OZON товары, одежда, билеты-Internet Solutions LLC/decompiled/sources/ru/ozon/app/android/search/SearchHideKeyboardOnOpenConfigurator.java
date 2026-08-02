package ru.ozon.app.android.search;

import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.utils.KeyboardUtils;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/SearchHideKeyboardOnOpenConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchHideKeyboardOnOpenConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references != null) {
            final C4911f ownerContainer = references.getOwnerContainer();
            final AbstractC5434v lifecycle = ownerContainer.g().getLifecycle();
            if (!lifecycle.b().a(AbstractC5434v.b.CREATED)) {
                lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.SearchHideKeyboardOnOpenConfigurator$onCreate$lambda$1$$inlined$whenCreated$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onCreate(J owner2) {
                        Intrinsics.checkNotNullParameter(owner2, "owner");
                        ComponentCallbacksC5392m c11 = ownerContainer.c();
                        if (c11 != null) {
                            KeyboardUtilsKt.hideKeyboard(c11);
                        } else {
                            r a11 = ownerContainer.a();
                            if (a11 != null) {
                                KeyboardUtils.INSTANCE.hideKeyboard(a11);
                            }
                        }
                        AbstractC5434v.this.e(this);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner2) {
                        Intrinsics.checkNotNullParameter(owner2, "owner");
                        AbstractC5434v.this.e(this);
                    }
                });
                return;
            }
            ComponentCallbacksC5392m c11 = ownerContainer.c();
            if (c11 != null) {
                KeyboardUtilsKt.hideKeyboard(c11);
                return;
            }
            r a11 = ownerContainer.a();
            if (a11 != null) {
                KeyboardUtils.INSTANCE.hideKeyboard(a11);
            }
        }
    }
}
