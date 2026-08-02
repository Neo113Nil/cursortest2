package q00;

import Ld0.c;
import Nd0.b;
import O7.o;
import Od0.e;
import android.content.Intent;
import android.net.Uri;
import f00.InterfaceC6395a;
import j00.C7234a;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r00.InterfaceC9147a;

/* renamed from: q00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8970a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC9147a> f81374a;

    /* JADX WARN: Multi-variable type inference failed */
    public C8970a(@NotNull Set<? extends InterfaceC9147a> registeredDeeplinkResolvers, @NotNull o argumentsResolver) {
        Intrinsics.checkNotNullParameter(registeredDeeplinkResolvers, "registeredDeeplinkResolvers");
        Intrinsics.checkNotNullParameter(argumentsResolver, "argumentsResolver");
        this.f81374a = registeredDeeplinkResolvers;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e.a a(@NotNull c ozonLimbDiStore, @NotNull e.b deeplink) {
        boolean z11;
        Uri b11;
        Iterator<T> it;
        Object obj;
        InterfaceC9147a interfaceC9147a;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        boolean z12 = deeplink instanceof e.b.a;
        e.b.a aVar = z12 ? (e.b.a) deeplink : null;
        boolean z13 = false;
        if (aVar != null) {
            Intent intent = aVar.b();
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
            if (ozonLimbDiStore.c().b() == b.DEBUG && (intent.hasExtra("COMPOSER_LOGS_DISABLED") || intent.hasExtra("COMPOSER_ALERTS_DISABLED"))) {
                Ld0.e d11 = ozonLimbDiStore.d(InterfaceC6395a.class);
                C7234a composerDebugMenuSDK = d11 instanceof C7234a ? (C7234a) d11 : null;
                if (composerDebugMenuSDK != null) {
                    Intent intent2 = aVar.b();
                    Intrinsics.checkNotNullParameter(intent2, "intent");
                    Intrinsics.checkNotNullParameter(composerDebugMenuSDK, "composerDebugMenuSDK");
                    try {
                        if (intent2.hasExtra("COMPOSER_LOGS_DISABLED")) {
                            composerDebugMenuSDK.O("COMPOSER_LOGS_DISABLED", intent2.getBooleanExtra("COMPOSER_LOGS_DISABLED", false));
                        }
                        if (intent2.hasExtra("COMPOSER_ALERTS_DISABLED")) {
                            composerDebugMenuSDK.O("COMPOSER_ALERTS_DISABLED", intent2.getBooleanExtra("COMPOSER_ALERTS_DISABLED", false));
                        }
                    } catch (Exception unused) {
                    }
                    z11 = true;
                    b11 = !(deeplink instanceof e.b.C0410b) ? ((e.b.C0410b) deeplink).b() : z12 ? ((e.b.a) deeplink).b().getData() : null;
                    if (b11 != null && Intrinsics.d(b11.getAuthority(), "composerSDK")) {
                        it = this.f81374a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((InterfaceC9147a) obj).b(ozonLimbDiStore, b11)) {
                                break;
                            }
                        }
                        interfaceC9147a = (InterfaceC9147a) obj;
                        if (interfaceC9147a != null) {
                            Ld0.e d12 = ozonLimbDiStore.d(InterfaceC6395a.class);
                            C7234a c7234a = d12 instanceof C7234a ? (C7234a) d12 : null;
                            if (c7234a != null) {
                                interfaceC9147a.a(b11, c7234a);
                                z13 = true;
                            }
                        }
                    }
                    return (!z11 || z13) ? new e.a.C0409a() : new e.a.c();
                }
            }
        }
        z11 = false;
        if (!(deeplink instanceof e.b.C0410b)) {
        }
        if (b11 != null) {
            it = this.f81374a.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            interfaceC9147a = (InterfaceC9147a) obj;
            if (interfaceC9147a != null) {
            }
        }
        if (z11) {
        }
    }
}
