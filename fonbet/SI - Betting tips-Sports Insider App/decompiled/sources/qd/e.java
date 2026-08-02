package qd;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.h0;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import b3.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import g6.v;
import gf.k;
import gf.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqd/e;", "Lb3/a;", "T", "Lrd/a;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e<T extends b3.a> extends rd.a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final String f22106b = "failure";

    /* renamed from: c, reason: collision with root package name */
    public final g.b f22107c;

    /* renamed from: d, reason: collision with root package name */
    public final t f22108d;

    /* renamed from: e, reason: collision with root package name */
    public b7.f f22109e;

    public e() {
        g.b registerForActivityResult = registerForActivityResult(new e1(4), new io.sentry.android.core.internal.gestures.c(19, this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f22107c = registerForActivityResult;
        this.f22108d = k.b(new me.a(12, this));
    }

    public static void I(h0 h0Var) {
        StringBuilder sb2 = new StringBuilder("Unexpected type of credential");
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER.concat(h0Var.getClass().getSimpleName()));
        sb2.append(" type:" + ((String) h0Var.f257a));
        String message = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(message, "toString(...)");
        Intrinsics.checkNotNullParameter(message, "message");
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        c0.t(dVar, lg.d.f20063c, null, new hd.b(2, message, null), 2);
    }

    public final void G() {
        GoogleSignInAccount googleSignInAccount;
        String str;
        Intent a7;
        Continuation continuation = null;
        if (Build.VERSION.SDK_INT >= 34) {
            c0.t(d1.g(this), null, null, new c(this, continuation, 1), 3);
            return;
        }
        x5.h o3 = x5.h.o(requireContext());
        synchronized (o3) {
            googleSignInAccount = (GoogleSignInAccount) o3.f25410b;
        }
        if (googleSignInAccount == null || (str = googleSignInAccount.f4387b) == null || System.currentTimeMillis() / 1000 >= googleSignInAccount.f4392g - 300) {
            str = null;
        }
        if (str != null) {
            H(str);
            return;
        }
        if (this.f22109e == null) {
            p0 requireActivity = requireActivity();
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) this.f22108d.getValue();
            v.h(googleSignInOptions);
            this.f22109e = new b7.f(requireActivity, s5.a.f22623a, googleSignInOptions, new m3.f(12));
        }
        b7.f fVar = this.f22109e;
        if (fVar != null) {
            g.b bVar = this.f22107c;
            d6.b bVar2 = fVar.f8253e;
            Context context = fVar.f8249a;
            int e7 = fVar.e();
            int i5 = e7 - 1;
            if (e7 == 0) {
                throw null;
            }
            if (i5 == 2) {
                x5.g.f25407a.c("getFallbackSignInIntent()", new Object[0]);
                a7 = x5.g.a(context, (GoogleSignInOptions) bVar2);
                a7.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            } else if (i5 != 3) {
                x5.g.f25407a.c("getNoImplementationSignInIntent()", new Object[0]);
                a7 = x5.g.a(context, (GoogleSignInOptions) bVar2);
                a7.setAction("com.google.android.gms.auth.NO_IMPL");
            } else {
                a7 = x5.g.a(context, (GoogleSignInOptions) bVar2);
            }
            bVar.a(a7);
        }
        if (fVar == null) {
            H(this.f22106b);
        }
    }

    public abstract void H(String str);
}
