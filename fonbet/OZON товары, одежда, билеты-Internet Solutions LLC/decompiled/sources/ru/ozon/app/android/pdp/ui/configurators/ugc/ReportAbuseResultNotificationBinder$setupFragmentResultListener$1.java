package ru.ozon.app.android.pdp.ui.configurators.ugc;

import Sc.s;
import a00.C4911f;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder$setupFragmentResultListener$1;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder$setupFragmentResultListener$1", f = "ReportResultNotificationBinder.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReportAbuseResultNotificationBinder$setupFragmentResultListener$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $withRefresh;
    int label;
    final /* synthetic */ ReportAbuseResultNotificationBinder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder$setupFragmentResultListener$1$1", f = "ReportResultNotificationBinder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder$setupFragmentResultListener$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ boolean $withRefresh;
        int label;
        final /* synthetic */ ReportAbuseResultNotificationBinder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReportAbuseResultNotificationBinder reportAbuseResultNotificationBinder, boolean z11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = reportAbuseResultNotificationBinder;
            this.$withRefresh = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(boolean z11, ReportAbuseResultNotificationBinder reportAbuseResultNotificationBinder, String str, Bundle bundle) {
            Object obj;
            ConfiguratorReferences configuratorReferences;
            if (z11) {
                configuratorReferences = reportAbuseResultNotificationBinder.refs;
                InterfaceC7851b.a.e(configuratorReferences.getController(), null, null, null, 7);
            }
            Intrinsics.f(bundle);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = bundle.getSerializable("report_abuse_action_result_key", ReportAbuseResult.class);
            } else {
                Object serializable = bundle.getSerializable("report_abuse_action_result_key");
                obj = (ReportAbuseResult) (serializable instanceof ReportAbuseResult ? serializable : null);
            }
            reportAbuseResultNotificationBinder.showNotification((ReportAbuseResult) obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$withRefresh, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ConfiguratorReferences configuratorReferences;
            C4911f ownerContainer;
            r a11;
            G supportFragmentManager;
            J j11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            configuratorReferences = this.this$0.refs;
            if (configuratorReferences != null && (ownerContainer = configuratorReferences.getOwnerContainer()) != null && (a11 = ownerContainer.a()) != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null) {
                j11 = this.this$0.owner;
                final boolean z11 = this.$withRefresh;
                final ReportAbuseResultNotificationBinder reportAbuseResultNotificationBinder = this.this$0;
                supportFragmentManager.n1("report_abuse_report_key", j11, new androidx.fragment.app.M() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.a
                    @Override // androidx.fragment.app.M
                    public final void f(Bundle bundle, String str) {
                        ReportAbuseResultNotificationBinder$setupFragmentResultListener$1.AnonymousClass1.invokeSuspend$lambda$0(z11, reportAbuseResultNotificationBinder, str, bundle);
                    }
                });
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportAbuseResultNotificationBinder$setupFragmentResultListener$1(ReportAbuseResultNotificationBinder reportAbuseResultNotificationBinder, boolean z11, d<? super ReportAbuseResultNotificationBinder$setupFragmentResultListener$1> dVar) {
        super(2, dVar);
        this.this$0 = reportAbuseResultNotificationBinder;
        this.$withRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReportAbuseResultNotificationBinder$setupFragmentResultListener$1(this.this$0, this.$withRefresh, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        J j11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.this$0.owner;
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$withRefresh, null);
            this.label = 1;
            if (C5412d0.b(j11, bVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReportAbuseResultNotificationBinder$setupFragmentResultListener$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
