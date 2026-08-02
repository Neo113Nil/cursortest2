package ru.ozon.app.android.product.utils;

import Vg.f;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Ljava/lang/Class;", "LVg/f;", "appendComposerActionAndRedirectActionHandler", "(Ljava/util/Set;)Ljava/util/Set;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionAndRedirectActionHandlerAppenderKt {
    @NotNull
    public static final Set<Class<? extends f>> appendComposerActionAndRedirectActionHandler(@NotNull Set<? extends Class<? extends f>> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet X02 = C7714v.X0(set);
        X02.add(ComposerActionAndRedirectActionHandler.class);
        return X02;
    }
}
