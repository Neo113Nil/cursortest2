package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newPlaceholderInfo", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasePlayerComposableControllerImpl$PlayerSurfaceComposable$3 extends AbstractC7737t implements Function1<PlaceholderInfo, Unit> {
    final /* synthetic */ M<PlaceholderInfo> $placeholderInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerComposableControllerImpl$PlayerSurfaceComposable$3(M<PlaceholderInfo> m11) {
        super(1);
        this.$placeholderInfo = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PlaceholderInfo placeholderInfo) {
        invoke2(placeholderInfo);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PlaceholderInfo newPlaceholderInfo) {
        Intrinsics.checkNotNullParameter(newPlaceholderInfo, "newPlaceholderInfo");
        this.$placeholderInfo.f71787a = newPlaceholderInfo;
    }
}
