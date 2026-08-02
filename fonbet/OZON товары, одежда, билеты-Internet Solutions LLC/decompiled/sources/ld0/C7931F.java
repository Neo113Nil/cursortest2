package ld0;

import Kb0.K;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import dc0.C6146J;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import td0.C9864d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/F;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ld0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7931F extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.l f73196a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f73197b;

    /* renamed from: ld0.F$a */
    static final class a extends AbstractC7737t implements Function1<AccountSignatureData, CharSequence> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(AccountSignatureData accountSignatureData) {
            AccountSignatureData it = accountSignatureData;
            Intrinsics.checkNotNullParameter(it, "it");
            StringBuilder sb2 = new StringBuilder();
            Fj.c.f("<b>appName</b> = ", it.getAppName(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("<b>userId</b> = " + it.getUserId() + "<br>");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            Fj.c.f("<b>publicKey</b> = ", it.getPublicKey(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            long createdAt = it.getCreatedAt();
            C7931F.this.getClass();
            String format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS", Locale.getDefault()).format(new Date(createdAt));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            Fj.c.f("<b>createdAt</b> = ", format, "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    /* renamed from: ld0.F$b */
    static final class b extends AbstractC7737t implements Function1<C6146J, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f73199b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(C6146J c6146j) {
            C6146J it = c6146j;
            Intrinsics.checkNotNullParameter(it, "it");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(V.e.a("<b>appName</b> = ", it.a(), "  [", it.d() ? "old format" : "new format", "]<br>"));
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("<b>userId</b> = " + it.c().h() + "<br>");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            Fj.c.f("<b>package</b> = ", it.b(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            Fj.c.f("<b>accessToken</b> = ", it.c().a(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            Fj.c.f("<b>refreshToken</b> = ", it.c().e(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            Fj.c.f("<b>idpToken</b> = ", it.c().b(), "<br>", sb2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    /* renamed from: ld0.F$c */
    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C7931F c7931f = C7931F.this;
            Jb0.l lVar = c7931f.f73196a;
            if (lVar != null) {
                c7931f.z(lVar);
            }
            return Unit.f71690a;
        }
    }

    public C7931F() {
        super(R.layout.fragment_ozon_id_debug_shared_credentials);
        this.f73197b = new c();
    }

    public static void t(C7931F c7931f) {
        C9864d.a(c7931f, y());
    }

    public static void u(C7931F c7931f) {
        C9864d.a(c7931f, c7931f.x());
    }

    private final Spanned x() {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        Spanned a11 = androidx.core.text.b.a(C7714v.V(k11.v().i().getValue().c(), "<br><br>", null, null, new a(), 30), 63);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return a11;
    }

    private static Spanned y() {
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        Spanned a11 = androidx.core.text.b.a(C7714v.V(k11.v().m().getValue().c(), "<br><br>", null, null, b.f73199b, 30), 63);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Jb0.l lVar) {
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).O();
        lVar.f14495c.setText(y());
        lVar.f14494b.setText(x());
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        lVar.f14499g.setText(String.valueOf(k11.v().n().getValue().c()));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).Q(this.f73197b);
        this.f73196a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity");
        ((OzonIdDebugActivity) requireActivity).N(this.f73197b);
        Jb0.l a11 = Jb0.l.a(view);
        a11.f14496d.setOnClickListener(new FM.a(this, 13));
        a11.f14497e.setOnClickListener(new Ar.b(this, 7));
        z(a11);
        this.f73196a = a11;
    }
}
