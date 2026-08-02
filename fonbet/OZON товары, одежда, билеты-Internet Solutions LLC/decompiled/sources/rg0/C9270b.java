package rg0;

import Od0.a;
import Sc.InterfaceC4008j;
import Sc.o;
import android.app.Application;
import android.net.Uri;
import android.widget.Toast;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg0.EnumC9269a;
import xe.C10727i;
import xe.J;
import xe.M;
import yg0.C10900c;

/* renamed from: rg0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9270b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10900c> f83493a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Application> f83494b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<M> f83495c;

    /* renamed from: rg0.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83496a;

        static {
            int[] iArr = new int[EnumC9269a.values().length];
            try {
                iArr[EnumC9269a.SEND_STG_FATAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9269a.SEND_STG_NONFATAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83496a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9270b(@NotNull InterfaceC4008j<C10900c> sendTestSentryEventUseCase, @NotNull InterfaceC4008j<? extends Application> applicationLazy, @NotNull InterfaceC4008j<? extends M> coroutineScopeLazy) {
        Intrinsics.checkNotNullParameter(sendTestSentryEventUseCase, "sendTestSentryEventUseCase");
        Intrinsics.checkNotNullParameter(applicationLazy, "applicationLazy");
        Intrinsics.checkNotNullParameter(coroutineScopeLazy, "coroutineScopeLazy");
        this.f83493a = sendTestSentryEventUseCase;
        this.f83494b = applicationLazy;
        this.f83495c = coroutineScopeLazy;
    }

    public static final void b(C9270b c9270b, String str) {
        Toast.makeText(c9270b.f83494b.getValue(), str, 0).show();
    }

    @NotNull
    public final Od0.a c(@NotNull Uri link, boolean z11) {
        Intrinsics.checkNotNullParameter(link, "link");
        List<String> pathSegments = link.getPathSegments();
        if (pathSegments == null) {
            pathSegments = K.f71697a;
        }
        String V11 = C7714v.V(pathSegments, "/", null, null, null, 62);
        EnumC9269a.Companion.getClass();
        EnumC9269a a11 = EnumC9269a.C1426a.a(V11);
        if (a11 == null) {
            return new a.c();
        }
        if (!z11) {
            return new a.b("Невозможно выполнить действие с диплинком, так как действие не разрешено для данного типа пользователя", null);
        }
        int i11 = a.f83496a[a11.ordinal()];
        InterfaceC4008j<M> interfaceC4008j = this.f83495c;
        if (i11 == 1) {
            C10727i.c(interfaceC4008j.getValue(), new C9271c(J.f105405n0), null, new C9272d(this, null), 2);
            return new a.C0408a();
        }
        if (i11 != 2) {
            throw new o();
        }
        C10727i.c(interfaceC4008j.getValue(), new e(J.f105405n0), null, new f(this, null), 2);
        return new a.C0408a();
    }
}
