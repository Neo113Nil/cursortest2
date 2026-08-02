package com.google.android.play.core.integrity;

import Qa.A;
import Qa.AbstractC1520j;
import Qa.C1516f;
import Qa.G;
import Qa.N;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final C1516f f36545a;

    /* renamed from: b, reason: collision with root package name */
    private final G f36546b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36547c;

    /* renamed from: d, reason: collision with root package name */
    private final at f36548d;

    /* renamed from: e, reason: collision with root package name */
    private final k f36549e;

    public aj(Context context, G g10, at atVar, k kVar) {
        this.f36547c = context.getPackageName();
        this.f36546b = g10;
        this.f36548d = atVar;
        this.f36549e = kVar;
        if (AbstractC1520j.b(context)) {
            this.f36545a = new C1516f(context, g10, "IntegrityService", ak.f36550a, new N() { // from class: com.google.android.play.core.integrity.ae
                @Override // Qa.N
                public final Object a(IBinder iBinder) {
                    return A.c(iBinder);
                }
            }, null);
        } else {
            g10.b("Phonesky is not installed.", new Object[0]);
            this.f36545a = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f36547c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        Qa.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Qa.r.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f36545a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f36546b.d("requestAndShowDialog(%s, %s)", this.f36547c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36545a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f36545a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f36546b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f36545a.t(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
