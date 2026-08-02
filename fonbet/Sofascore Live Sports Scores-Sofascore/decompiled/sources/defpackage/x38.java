package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x38 implements View.OnClickListener {
    public final /* synthetic */ wa a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ b48 c;

    public x38(b48 b48Var, wa waVar, Activity activity) {
        this.c = b48Var;
        this.a = waVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String scheme;
        wa waVar = this.a;
        String str = waVar.a;
        b48 b48Var = this.c;
        e48 e48Var = b48Var.k;
        if (e48Var != null) {
            d55 d55Var = (d55) e48Var;
            if (!((z41) d55Var.h).s()) {
                d55Var.d();
                new TaskCompletionSource().getTask();
            } else if (str == null) {
                d55Var.g(c48.c);
            } else {
                sa3 sa3Var = new sa3(new o3(19, d55Var, waVar), 0);
                if (!d55Var.a) {
                    d55Var.c();
                }
                d55.f(sa3Var.e(), ((qsg) d55Var.d).a);
            }
        }
        Uri parse = Uri.parse(str);
        Activity activity = this.b;
        if (parse != null && (scheme = parse.getScheme()) != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME))) {
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            intent.setPackage("com.android.chrome");
            List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ea4 a = new da4().a();
                Intent intent2 = a.a;
                intent2.addFlags(1073741824);
                intent2.addFlags(268435456);
                a.a(activity, parse);
                b48Var.a(activity);
                b48Var.j = null;
                b48Var.k = null;
            }
        }
        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent3, 0);
        intent3.addFlags(1073741824);
        intent3.addFlags(268435456);
        if (resolveActivity != null) {
            activity.startActivity(intent3);
        }
        b48Var.a(activity);
        b48Var.j = null;
        b48Var.k = null;
    }
}
