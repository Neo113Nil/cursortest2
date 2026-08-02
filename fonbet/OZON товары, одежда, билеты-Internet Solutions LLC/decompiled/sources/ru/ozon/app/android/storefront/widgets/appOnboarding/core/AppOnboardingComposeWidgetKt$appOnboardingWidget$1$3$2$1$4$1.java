package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import WZ.d;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$4$1 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYZ/a;", "payloadType", "", "invoke-kwQ5Lys", "(Ljava/lang/String;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<YZ.a, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(YZ.a aVar) {
            return m1035invokekwQ5Lys(aVar.b());
        }

        /* renamed from: invoke-kwQ5Lys, reason: not valid java name */
        public final Boolean m1035invokekwQ5Lys(String payloadType) {
            Intrinsics.checkNotNullParameter(payloadType, "payloadType");
            return Boolean.valueOf(Intrinsics.d(payloadType, "back"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$4$1(l lVar) {
        super(1);
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        this.$tokenizedAnalytics.f(tokenizedEvent, new d(AnonymousClass1.INSTANCE), null);
    }
}
