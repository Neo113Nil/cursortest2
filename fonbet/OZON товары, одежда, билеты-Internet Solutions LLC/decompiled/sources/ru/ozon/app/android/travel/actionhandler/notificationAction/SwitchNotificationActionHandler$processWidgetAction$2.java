package ru.ozon.app.android.travel.actionhandler.notificationAction;

import He.b;
import Sc.s;
import Vg.f;
import Wc.a;
import android.os.Build;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.utils.extensions.PermissionExtKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2", f = "SwitchNotificationActionHandler.kt", l = {53, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwitchNotificationActionHandler$processWidgetAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ f.a $widgetInfo;
    Object L$0;
    int label;
    final /* synthetic */ SwitchNotificationActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$1", f = "SwitchNotificationActionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ SwitchNotificationActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwitchNotificationActionHandler switchNotificationActionHandler, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = switchNotificationActionHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            enableNotificationsSuggestingHandler = this.this$0.enableNotificationsSuggestingHandler;
            enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$2$1, reason: invalid class name */
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
        /* renamed from: ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler$processWidgetAction$2$2$2, reason: invalid class name and collision with other inner class name */
        static final class C18832 extends AbstractC7737t implements Function0<Unit> {
            public static final C18832 INSTANCE = new C18832();

            C18832() {
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

        AnonymousClass2() {
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
            requestPermission.onPermissionDenied(C18832.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchNotificationActionHandler$processWidgetAction$2(f.a aVar, SwitchNotificationActionHandler switchNotificationActionHandler, d<? super SwitchNotificationActionHandler$processWidgetAction$2> dVar) {
        super(2, dVar);
        this.$widgetInfo = aVar;
        this.this$0 = switchNotificationActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwitchNotificationActionHandler$processWidgetAction$2(this.$widgetInfo, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a2  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar;
        r rVar2;
        G d11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            r a11 = this.$widgetInfo.a().a();
            if (a11 == null) {
                return Unit.f71690a;
            }
            if (Build.VERSION.SDK_INT < 33) {
                PermissionExtKt.openAppNotificationSettings(a11);
                G d12 = this.$widgetInfo.a().d();
                if (d12 != null) {
                    this.this$0.closeBottomSheet(d12);
                }
                return Unit.f71690a;
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1 switchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1 = new SwitchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1(this.this$0, null);
            this.L$0 = a11;
            this.label = 1;
            Object f7 = C10727i.f(bVar, switchNotificationActionHandler$processWidgetAction$2$isAlreadyRequested$1, this);
            if (f7 != aVar) {
                rVar = a11;
                obj = f7;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar2 = (r) this.L$0;
            s.b(obj);
            ActivitiesKt.requestPermission(rVar2, AnonymousClass2.INSTANCE);
            d11 = this.$widgetInfo.a().d();
            if (d11 != null) {
                this.this$0.closeBottomSheet(d11);
            }
            return Unit.f71690a;
        }
        rVar = (r) this.L$0;
        s.b(obj);
        if (((Boolean) obj).booleanValue()) {
            PermissionExtKt.openAppNotificationSettings(rVar);
            d11 = this.$widgetInfo.a().d();
            if (d11 != null) {
            }
            return Unit.f71690a;
        }
        C10720e0 c10720e02 = C10720e0.f105451a;
        b bVar2 = b.f10879b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.L$0 = rVar;
        this.label = 2;
        if (C10727i.f(bVar2, anonymousClass1, this) != aVar) {
            rVar2 = rVar;
            ActivitiesKt.requestPermission(rVar2, AnonymousClass2.INSTANCE);
            d11 = this.$widgetInfo.a().d();
            if (d11 != null) {
            }
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SwitchNotificationActionHandler$processWidgetAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
