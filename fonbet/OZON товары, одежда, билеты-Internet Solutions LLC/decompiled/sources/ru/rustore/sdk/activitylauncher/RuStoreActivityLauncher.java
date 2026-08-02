package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl0.C8601a;
import ru.rustore.sdk.activitylauncher.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher;", "Landroid/app/Activity;", "<init>", "()V", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuStoreActivityLauncher extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f97944c = 0;

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f97945a;

    /* renamed from: b, reason: collision with root package name */
    private C8601a f97946b;

    private final void a(int i11, Bundle bundle) {
        ResultReceiver resultReceiver = this.f97945a;
        if (resultReceiver == null) {
            Intrinsics.n("resultReceiver");
            throw null;
        }
        resultReceiver.send(i11, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 0) {
            a(i12, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        Object parcelableExtra2;
        RuStoreActivityLauncher ruStoreActivityLauncher;
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        this.f97946b = new C8601a(applicationContext);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER", ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra = intent.getParcelableExtra("RESULT_RECEIVER");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.f97945a = (ResultReceiver) parcelableExtra;
        if (bundle != null) {
            return;
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
        if (i11 >= 33) {
            parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
            if (parcelableExtra2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
            if (parcelableExtra2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        try {
            ruStoreActivityLauncher = this;
            try {
                ruStoreActivityLauncher.startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException e11) {
                e = e11;
                ActivityNotFoundException activityNotFoundException = e;
                C8601a c8601a = ruStoreActivityLauncher.f97946b;
                if (c8601a == null) {
                    Intrinsics.n("activityLauncherAnalytics");
                    throw null;
                }
                c8601a.a(activityNotFoundException);
                a(a.C2157a.f97948b.a(), null);
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                IntentSender.SendIntentException sendIntentException = e;
                C8601a c8601a2 = ruStoreActivityLauncher.f97946b;
                if (c8601a2 == null) {
                    Intrinsics.n("activityLauncherAnalytics");
                    throw null;
                }
                c8601a2.a(sendIntentException);
                a(a.e.f97952b.a(), null);
            } catch (Exception e13) {
                e = e13;
                Exception exc = e;
                C8601a c8601a3 = ruStoreActivityLauncher.f97946b;
                if (c8601a3 == null) {
                    Intrinsics.n("activityLauncherAnalytics");
                    throw null;
                }
                c8601a3.a(exc);
                a(a.f.f97953b.a(), null);
            }
        } catch (ActivityNotFoundException e14) {
            e = e14;
            ruStoreActivityLauncher = this;
        } catch (IntentSender.SendIntentException e15) {
            e = e15;
            ruStoreActivityLauncher = this;
        } catch (Exception e16) {
            e = e16;
            ruStoreActivityLauncher = this;
        }
    }
}
