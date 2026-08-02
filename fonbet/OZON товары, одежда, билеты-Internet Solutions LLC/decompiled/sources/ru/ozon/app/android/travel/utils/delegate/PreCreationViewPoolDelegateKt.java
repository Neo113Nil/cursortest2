package ru.ozon.app.android.travel.utils.delegate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/d;", "viewClass", "", "unknownViewClassError", "(Lkotlin/reflect/d;)Ljava/lang/Void;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreCreationViewPoolDelegateKt {
    @NotNull
    public static final Void unknownViewClassError(@NotNull d<?> viewClass) {
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        throw new IllegalStateException("Unknown viewClass " + viewClass);
    }
}
