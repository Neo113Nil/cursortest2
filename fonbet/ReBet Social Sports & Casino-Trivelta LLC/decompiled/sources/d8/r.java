package d8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import com.facebook.login.LoginClient;
import com.twilio.voice.EventKeys;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import z6.AbstractC6933c;
import z6.AbstractC6934d;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\u0003J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\t2\u0006\u00108\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u000bR0\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190=2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0006@BX\u0086.¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Ld8/r;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/facebook/login/LoginClient;", "h0", "()Lcom/facebook/login/LoginClient;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", EventKeys.DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "t0", "s0", "Landroidx/fragment/app/s;", "activity", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "m0", "(Landroidx/fragment/app/s;)Lkotlin/jvm/functions/Function1;", "Lcom/facebook/login/LoginClient$Result;", "outcome", "r0", "(Lcom/facebook/login/LoginClient$Result;)V", "u0", "n0", "Landroid/app/Activity;", "o0", "(Landroid/app/Activity;)V", "", X9.m.f13664a, "Ljava/lang/String;", "callingPackage", "Lcom/facebook/login/LoginClient$Request;", "n", "Lcom/facebook/login/LoginClient$Request;", "request", "<set-?>", "o", "Lcom/facebook/login/LoginClient;", "l0", "loginClient", "Lj/b;", "p", "Lj/b;", "j0", "()Lj/b;", "launcher", "q", "Landroid/view/View;", "progressBar", "k0", "()I", "layoutResId", "r", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class r extends Fragment {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String callingPackage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public LoginClient.Request request;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public LoginClient loginClient;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public AbstractC5086b launcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public View progressBar;

    public static final class b extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AbstractActivityC2168s f45109e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractActivityC2168s abstractActivityC2168s) {
            super(1);
            this.f45109e = abstractActivityC2168s;
        }

        public final void a(ActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.getResultCode() == -1) {
                r.this.l0().d0(LoginClient.INSTANCE.b(), result.getResultCode(), result.getData());
            } else {
                this.f45109e.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ActivityResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements LoginClient.a {
        public c() {
        }

        @Override // com.facebook.login.LoginClient.a
        public void a() {
            r.this.u0();
        }

        @Override // com.facebook.login.LoginClient.a
        public void b() {
            r.this.n0();
        }
    }

    public static final void p0(r this$0, LoginClient.Result outcome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.r0(outcome);
    }

    public static final void q0(Function1 tmp0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(activityResult);
    }

    public LoginClient h0() {
        return new LoginClient(this);
    }

    public final AbstractC5086b j0() {
        AbstractC5086b abstractC5086b = this.launcher;
        if (abstractC5086b != null) {
            return abstractC5086b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcher");
        throw null;
    }

    public int k0() {
        return AbstractC6934d.f68608c;
    }

    public final LoginClient l0() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    public final Function1 m0(AbstractActivityC2168s activity) {
        return new b(activity);
    }

    public final void n0() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        s0();
    }

    public final void o0(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        l0().d0(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        LoginClient loginClient = savedInstanceState == null ? null : (LoginClient) savedInstanceState.getParcelable("loginClient");
        if (loginClient != null) {
            loginClient.f0(this);
        } else {
            loginClient = h0();
        }
        this.loginClient = loginClient;
        l0().g0(new LoginClient.d() { // from class: d8.p
            @Override // com.facebook.login.LoginClient.d
            public final void a(LoginClient.Result result) {
                r.p0(r.this, result);
            }
        });
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            return;
        }
        o0(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        k.i iVar = new k.i();
        final Function1 m02 = m0(activity);
        AbstractC5086b registerForActivityResult = registerForActivityResult(iVar, new InterfaceC5085a() { // from class: d8.q
            @Override // j.InterfaceC5085a
            public final void a(Object obj) {
                r.q0(Function1.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.launcher = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(k0(), container, false);
        View findViewById = inflate.findViewById(AbstractC6933c.f68603d);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = findViewById;
        l0().e0(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        l0().c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(AbstractC6933c.f68603d);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            l0().h0(this.request);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", l0());
    }

    public final void r0(LoginClient.Result outcome) {
        this.request = null;
        int i10 = outcome.com.twilio.voice.EventKeys.ERROR_CODE java.lang.String == LoginClient.Result.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        AbstractActivityC2168s activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    public final void u0() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(0);
        t0();
    }

    public void s0() {
    }

    public void t0() {
    }
}
