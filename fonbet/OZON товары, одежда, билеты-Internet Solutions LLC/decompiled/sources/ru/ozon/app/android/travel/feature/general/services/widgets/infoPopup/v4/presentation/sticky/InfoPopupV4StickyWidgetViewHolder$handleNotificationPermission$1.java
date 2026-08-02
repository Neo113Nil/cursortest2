package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
    public static final InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1 INSTANCE = new InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }
    }

    InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
        invoke2(builder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionRequest.Builder requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        requestPermission.permissions("android.permission.POST_NOTIFICATIONS");
        requestPermission.onPermissionGranted(AnonymousClass1.INSTANCE);
        requestPermission.onPermissionDenied(AnonymousClass2.INSTANCE);
    }
}
