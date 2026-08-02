package nl0;

import B0.C2454a;
import Bl0.b0;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import jm0.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import lm0.AbstractC7971a;
import lm0.p;
import lm0.q;
import lm0.t;
import org.jetbrains.annotations.NotNull;

/* renamed from: nl0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8601a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f77373a;

    /* renamed from: nl0.a$a, reason: collision with other inner class name */
    static final class C1300a extends AbstractC7737t implements Function0<Al0.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f77374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1300a(Context context) {
            super(0);
            this.f77374b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Al0.a invoke() {
            Context context = this.f77374b;
            Intrinsics.checkNotNullParameter(context, "context");
            return b0.f3963c.a(context).f3966b;
        }
    }

    /* renamed from: nl0.a$b */
    static final class b extends AbstractC7737t implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f77375b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    public C8601a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77373a = k.b(new C1300a(context));
    }

    public final void a(@NotNull Exception reason) {
        String str;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason instanceof ActivityNotFoundException) {
            str = "ActivityLauncher.ActivityNotFoundException";
        } else if (reason instanceof IntentSender.SendIntentException) {
            str = "ActivityLauncher.SendIntentException";
        } else {
            str = N.b(reason.getClass()).u() + " || " + reason.getMessage() + " ||| " + reason.getCause();
        }
        AbstractC7971a<Unit> a11 = ((Al0.a) this.f77373a.getValue()).a(new Al0.b("launchActivity.error", C2454a.b("errorDescription", str)));
        int i11 = jm0.e.f70218e;
        q.a(p.a(t.a(a11, jm0.e.c()), C8602b.f77376b), j.a(), b.f77375b);
    }
}
