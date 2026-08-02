package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"asFrameWrapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerBinderFrameWrapper;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductPropertyBinder;", "frameOrder", "", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OldHammerBinderFrameWrapperKt {
    @NotNull
    public static final OldHammerBinderFrameWrapper asFrameWrapper(@NotNull OldHammerProductPropertyBinder oldHammerProductPropertyBinder, int i11) {
        Intrinsics.checkNotNullParameter(oldHammerProductPropertyBinder, "<this>");
        return new OldHammerBinderFrameWrapper(i11, oldHammerProductPropertyBinder);
    }

    public static /* synthetic */ OldHammerBinderFrameWrapper asFrameWrapper$default(OldHammerProductPropertyBinder oldHammerProductPropertyBinder, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return asFrameWrapper(oldHammerProductPropertyBinder, i11);
    }
}
