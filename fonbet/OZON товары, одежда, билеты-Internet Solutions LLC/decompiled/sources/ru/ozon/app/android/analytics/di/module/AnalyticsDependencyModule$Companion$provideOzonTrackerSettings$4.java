package ru.ozon.app.android.analytics.di.module;

import fi0.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfi0/v$a;", "", "invoke", "(Lfi0/v$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4 extends AbstractC7737t implements Function1<v.a, Unit> {
    final /* synthetic */ boolean $delayedSendingAnalyticsEnabled;
    final /* synthetic */ boolean $delayedSendingPerfAnalyticsEnabled;
    final /* synthetic */ boolean $forceSendingEventsOnMinimizeEnabled;
    final /* synthetic */ boolean $forceSendingPerfEventsOnMinimize;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ boolean $delayedSendingAnalyticsEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z11) {
            super(0);
            this.$delayedSendingAnalyticsEnabled = z11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$delayedSendingAnalyticsEnabled);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ boolean $delayedSendingPerfAnalyticsEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z11) {
            super(0);
            this.$delayedSendingPerfAnalyticsEnabled = z11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$delayedSendingPerfAnalyticsEnabled);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ boolean $forceSendingEventsOnMinimizeEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(boolean z11) {
            super(0);
            this.$forceSendingEventsOnMinimizeEnabled = z11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$forceSendingEventsOnMinimizeEnabled);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ boolean $forceSendingPerfEventsOnMinimize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(boolean z11) {
            super(0);
            this.$forceSendingPerfEventsOnMinimize = z11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$forceSendingPerfEventsOnMinimize);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4(boolean z11, boolean z12, boolean z13, boolean z14) {
        super(1);
        this.$delayedSendingAnalyticsEnabled = z11;
        this.$delayedSendingPerfAnalyticsEnabled = z12;
        this.$forceSendingEventsOnMinimizeEnabled = z13;
        this.$forceSendingPerfEventsOnMinimize = z14;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(v.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(v.a trackerBackgroundModeConfig) {
        Intrinsics.checkNotNullParameter(trackerBackgroundModeConfig, "$this$trackerBackgroundModeConfig");
        trackerBackgroundModeConfig.b(new AnonymousClass1(this.$delayedSendingAnalyticsEnabled));
        trackerBackgroundModeConfig.c(new AnonymousClass2(this.$delayedSendingPerfAnalyticsEnabled));
        trackerBackgroundModeConfig.d(new AnonymousClass3(this.$forceSendingEventsOnMinimizeEnabled));
        trackerBackgroundModeConfig.e(new AnonymousClass4(this.$forceSendingPerfEventsOnMinimize));
    }
}
