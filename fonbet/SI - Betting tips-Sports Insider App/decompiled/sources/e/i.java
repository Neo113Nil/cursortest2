package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.IntentSenderRequest;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends g.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f8416h;

    public i(j jVar) {
        this.f8416h = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.g
    public final void b(int i5, h.a contract, Object obj) {
        Bundle bundle;
        int i10;
        Intrinsics.checkNotNullParameter(contract, "contract");
        j jVar = this.f8416h;
        c4.k b10 = contract.b(jVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new h(i5, 0, this, b10));
            return;
        }
        Intent a7 = contract.a(jVar, obj);
        if (a7.getExtras() != null) {
            Bundle extras = a7.getExtras();
            Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                a7.setExtrasClassLoader(jVar.getClassLoader());
            }
        }
        if (a7.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a7.getAction())) {
            if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a7.getAction())) {
                jVar.startActivityForResult(a7, i5, bundle2);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a7.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i10 = i5;
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i10 = i5;
            }
            try {
                jVar.startIntentSenderForResult(intentSenderRequest.f196a, i10, intentSenderRequest.f197b, intentSenderRequest.f198c, intentSenderRequest.f199d, 0, bundle2);
                Unit unit = Unit.f19194a;
                return;
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                new Handler(Looper.getMainLooper()).post(new h(i10, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = a7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
            if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                throw new IllegalArgumentException(d9.e.l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr[i12] = stringArrayExtra[i13];
                    i12++;
                }
            }
        }
        if (jVar instanceof c0.a) {
        }
        jVar.requestPermissions(stringArrayExtra, i5);
    }
}
