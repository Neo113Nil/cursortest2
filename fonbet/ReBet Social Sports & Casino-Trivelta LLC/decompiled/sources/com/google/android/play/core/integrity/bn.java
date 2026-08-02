package com.google.android.play.core.integrity;

import Qa.C1516f;
import Qa.G;
import Qa.N;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final C1516f f36608a;

    /* renamed from: b, reason: collision with root package name */
    private final G f36609b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36610c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f36611d;

    /* renamed from: e, reason: collision with root package name */
    private final at f36612e;

    /* renamed from: f, reason: collision with root package name */
    private final k f36613f;

    public bn(Context context, G g10, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36611d = taskCompletionSource;
        this.f36610c = context.getPackageName();
        this.f36609b = g10;
        this.f36612e = atVar;
        this.f36613f = kVar;
        C1516f c1516f = new C1516f(context, g10, "ExpressIntegrityService", bo.f36614a, new N() { // from class: com.google.android.play.core.integrity.bd
            @Override // Qa.N
            public final Object a(IBinder iBinder) {
                return Qa.v.c(iBinder);
            }
        }, null);
        this.f36608a = c1516f;
        c1516f.c().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f36610c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        Qa.r.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Qa.r.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f36610c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        Qa.r.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Qa.r.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f36611d.getTask().isSuccessful() && ((Integer) bnVar.f36611d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f36609b.d("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36608a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j10, long j11, int i10) {
        this.f36609b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36608a.t(new bg(this, taskCompletionSource, 0, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f36609b.d("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36608a.t(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
