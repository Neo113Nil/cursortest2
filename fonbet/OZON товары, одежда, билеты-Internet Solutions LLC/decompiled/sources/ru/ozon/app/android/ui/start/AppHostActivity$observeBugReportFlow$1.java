package ru.ozon.app.android.ui.start;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;
import ru.ozon.app.android.ui.start.bugReport.BugReportView;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ui.start.AppHostActivity$observeBugReportFlow$1", f = "AppHostActivity.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AppHostActivity$observeBugReportFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppHostActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ui.start.AppHostActivity$observeBugReportFlow$1$1", f = "AppHostActivity.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ui.start.AppHostActivity$observeBugReportFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ AppHostActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppHostActivity appHostActivity, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = appHostActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            BugReportCookieState bugReportCookieState;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                bugReportCookieState = this.this$0.bugReportCookieState;
                if (bugReportCookieState == null) {
                    Intrinsics.n("bugReportCookieState");
                    throw null;
                }
                M0<Boolean> bugReportModeFlow = bugReportCookieState.getBugReportModeFlow();
                final AppHostActivity appHostActivity = this.this$0;
                InterfaceC2397i<? super Boolean> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ui.start.AppHostActivity.observeBugReportFlow.1.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super Unit>) dVar);
                    }

                    public final Object emit(boolean z11, d<? super Unit> dVar) {
                        BugReportView bugReportView;
                        bugReportView = AppHostActivity.this.bugReportView;
                        if (bugReportView != null) {
                            bugReportView.setVisibility(z11 ? 0 : 8);
                            return Unit.f71690a;
                        }
                        Intrinsics.n("bugReportView");
                        throw null;
                    }
                };
                this.label = 1;
                if (bugReportModeFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppHostActivity$observeBugReportFlow$1(AppHostActivity appHostActivity, d<? super AppHostActivity$observeBugReportFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = appHostActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppHostActivity$observeBugReportFlow$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AppHostActivity appHostActivity = this.this$0;
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appHostActivity, null);
            this.label = 1;
            if (C5412d0.b(appHostActivity, bVar, anonymousClass1, this) == aVar) {
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
        return ((AppHostActivity$observeBugReportFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
