package ru.ozon.app.android.debugmenu.ozondebugmenu.support;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Ob0.a;
import Pb0.b;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/support/OzonDebugMenuEvents;", "", "LOb0/a;", "ozonIdAppApi", "<init>", "(LOb0/a;)V", "", "onClearCookie", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "LOb0/a;", "LAe/w0;", "_clearCookieEvents", "LAe/w0;", "LAe/h;", "clearCookieEvents", "LAe/h;", "getClearCookieEvents", "()LAe/h;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonDebugMenuEvents {

    @NotNull
    private final w0<Unit> _clearCookieEvents;

    @NotNull
    private final InterfaceC2395h<Unit> clearCookieEvents;

    @NotNull
    private final a ozonIdAppApi;

    public OzonDebugMenuEvents(@NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.ozonIdAppApi = ozonIdAppApi;
        C0 b11 = E0.b(0, 0, null, 7);
        this._clearCookieEvents = b11;
        this.clearCookieEvents = C2399j.a(b11);
    }

    @NotNull
    public final InterfaceC2395h<Unit> getClearCookieEvents() {
        return this.clearCookieEvents;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r6.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onClearCookie(@NotNull d<? super Unit> dVar) {
        OzonDebugMenuEvents$onClearCookie$1 ozonDebugMenuEvents$onClearCookie$1;
        int i11;
        OzonDebugMenuEvents ozonDebugMenuEvents;
        if (dVar instanceof OzonDebugMenuEvents$onClearCookie$1) {
            ozonDebugMenuEvents$onClearCookie$1 = (OzonDebugMenuEvents$onClearCookie$1) dVar;
            int i12 = ozonDebugMenuEvents$onClearCookie$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ozonDebugMenuEvents$onClearCookie$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ozonDebugMenuEvents$onClearCookie$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ozonDebugMenuEvents$onClearCookie$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    a aVar2 = this.ozonIdAppApi;
                    b bVar = new b() { // from class: ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents$onClearCookie$2
                        private final boolean clearAccountManager = true;
                        private final boolean restoreRequiredCookie;

                        @Override // Pb0.b
                        public boolean getClearAccountManager() {
                            return this.clearAccountManager;
                        }

                        @Override // Pb0.b
                        public boolean getRestoreRequiredCookie() {
                            return this.restoreRequiredCookie;
                        }
                    };
                    ozonDebugMenuEvents$onClearCookie$1.L$0 = this;
                    ozonDebugMenuEvents$onClearCookie$1.label = 1;
                    if (aVar2.K(bVar, ozonDebugMenuEvents$onClearCookie$1) != aVar) {
                        ozonDebugMenuEvents = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                ozonDebugMenuEvents = (OzonDebugMenuEvents) ozonDebugMenuEvents$onClearCookie$1.L$0;
                s.b(obj);
                w0<Unit> w0Var = ozonDebugMenuEvents._clearCookieEvents;
                Unit unit = Unit.f71690a;
                ozonDebugMenuEvents$onClearCookie$1.L$0 = null;
                ozonDebugMenuEvents$onClearCookie$1.label = 2;
            }
        }
        ozonDebugMenuEvents$onClearCookie$1 = new OzonDebugMenuEvents$onClearCookie$1(this, dVar);
        Object obj2 = ozonDebugMenuEvents$onClearCookie$1.result;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ozonDebugMenuEvents$onClearCookie$1.label;
        if (i11 != 0) {
        }
        w0<Unit> w0Var2 = ozonDebugMenuEvents._clearCookieEvents;
        Unit unit2 = Unit.f71690a;
        ozonDebugMenuEvents$onClearCookie$1.L$0 = null;
        ozonDebugMenuEvents$onClearCookie$1.label = 2;
    }
}
