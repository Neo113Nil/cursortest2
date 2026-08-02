package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yb3 extends je {
    public final /* synthetic */ ComponentActivity h;

    public yb3(ComponentActivity componentActivity) {
        this.h = componentActivity;
    }

    @Override // defpackage.je
    public final void b(int i, yd ydVar, Object obj, ok3 ok3Var) {
        Bundle bundle;
        int i2;
        ydVar.getClass();
        ComponentActivity componentActivity = this.h;
        t9d b = ydVar.b(componentActivity, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new uu1(this, i, b, 1));
            return;
        }
        Intent a = ydVar.a(componentActivity, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = ok3Var != null ? ((sd) ok3Var).r.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    a70.p(mz1.o(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            componentActivity.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            componentActivity.startActivityForResult(a, i, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            i2 = i;
            try {
                componentActivity.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle2);
                Unit unit = Unit.a;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new uu1(this, i2, e, 2));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
