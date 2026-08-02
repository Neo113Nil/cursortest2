package ru.ozon.app.android.composer.widgets.store.fast;

import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.C8425e;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B-\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;", "Ln20/e;", "Lm20/a;", "Ll20/c;", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "Ln20/i;", "sdkWidgets", "Lk20/g;", "widgetComponentStorage", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lk20/g;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FastWidgetStore extends C8425e<InterfaceC8046a<?, ? extends c>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastWidgetStore(@NotNull Set<Widget> widgets, @NotNull Set<i> sdkWidgets, @NotNull C7475g widgetComponentStorage) {
        super(e0.f(widgets, sdkWidgets), widgetComponentStorage);
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(sdkWidgets, "sdkWidgets");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
    }
}
