package com.ironsource;

import android.content.Context;
import com.ironsource.Ce;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ce implements Cc {
    public static final Ce a = new Ce();
    private static final Fe b = new Fe();

    public static final class a implements InterfaceC2673te {
        final /* synthetic */ InterfaceC2673te a;

        a(InterfaceC2673te interfaceC2673te) {
            this.a = interfaceC2673te;
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2566ne sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            Fe fe = Ce.b;
            final InterfaceC2673te interfaceC2673te = this.a;
            fe.c(new Runnable() { // from class: com.ironsource.Ce$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.a.a(C2566ne.this, interfaceC2673te);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C2566ne sdkConfig, InterfaceC2673te listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Ce.a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(final C2602pe error, final C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            Fe fe = Ce.b;
            final InterfaceC2673te interfaceC2673te = this.a;
            fe.b(new Runnable() { // from class: com.ironsource.Ce$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.a.a(InterfaceC2673te.this, error, c2364c9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC2673te listener, C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error, c2364c9);
        }
    }

    private Ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C2709ve initRequest, InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new T9().a(EnumC2691ue.LEVEL_PLAY_INIT);
        a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C2709ve initRequest, InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = h.a(context, d, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new T9().a(EnumC2691ue.EXTERNAL_MEDIATION_INIT);
        a.a(context, initRequest, listener, true);
    }

    public final void c(final Context context, final C2709ve initRequest, final InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Ce.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.Cc
    public void onInitFailed(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Ce.a(IronSourceError.this);
            }
        });
    }

    public final void a(final Context context, final C2709ve initRequest, final InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C2709ve c2709ve, final InterfaceC2673te interfaceC2673te, boolean z) {
        String f = c2709ve.f();
        if (f != null && f.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c2709ve.f());
        } else {
            c2709ve = new C2709ve(c2709ve.d(), com.ironsource.mediationsdk.p.h().j(), CollectionsKt.toMutableList((Collection) c2709ve.e()));
        }
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = c2709ve.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c2709ve.e().toArray(new IronSource.a[0]);
        final IronSourceError a2 = h.a(context, d, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 != null && a2.getErrorCode() != 2020) {
            if (a2.getErrorCode() == 2040) {
                Ve e = com.ironsource.mediationsdk.p.h().e();
                if (e != null) {
                    a(new C2566ne(new C2727we(e), null, null, 6, null), interfaceC2673te);
                    return;
                }
            } else if (a2.getErrorCode() == 2030) {
                Be.l.a().d();
                return;
            }
            b.b(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.a(InterfaceC2673te.this, a2);
                }
            });
            return;
        }
        Be.l.a().a(context, c2709ve, new a(interfaceC2673te));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ve serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Be.l.a().a(new C2727we(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC2673te listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        InterfaceC2673te.a(listener, new C2602pe(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C2566ne c2566ne, final InterfaceC2673te interfaceC2673te) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c2566ne.d())) {
            b.b(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.a(InterfaceC2673te.this);
                }
            });
        } else {
            b.b(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.a(InterfaceC2673te.this, c2566ne);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        InterfaceC2673te.a(listener, new C2602pe(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC2673te listener, C2566ne sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Cc
    public void a(final Ve serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(Ve.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Be.l.a().a(new C2602pe(error));
    }
}
