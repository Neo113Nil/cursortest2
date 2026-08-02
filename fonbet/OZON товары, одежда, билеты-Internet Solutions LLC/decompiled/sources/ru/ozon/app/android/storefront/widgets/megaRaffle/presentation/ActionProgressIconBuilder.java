package ru.ozon.app.android.storefront.widgets.megaRaffle.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressIconBuilder;", "", "<init>", "()V", "buildActionProgressIcons", "Lru/ozon/uni/android/atom/icon/IconView;", "context", "Landroid/content/Context;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionProgressIconBuilder {

    @NotNull
    public static final ActionProgressIconBuilder INSTANCE = new ActionProgressIconBuilder();

    private ActionProgressIconBuilder() {
    }

    @NotNull
    public final IconView buildActionProgressIcons(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new IconView(context, null, 0, 6, null);
    }
}
