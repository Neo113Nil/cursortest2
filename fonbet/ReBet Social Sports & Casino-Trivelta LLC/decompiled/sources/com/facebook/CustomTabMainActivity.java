package com.facebook;

import T7.C1666f;
import T7.E;
import T7.M;
import T7.Y;
import a1.C1908a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import d8.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "", "resultCode", "resultIntent", "a", "(ILandroid/content/Intent;)V", "", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", com.google.crypto.tink.integration.android.b.f37029b, "Landroid/content/BroadcastReceiver;", "redirectReceiver", "c", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f30278d = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: e, reason: collision with root package name */
    public static final String f30279e = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: f, reason: collision with root package name */
    public static final String f30280f = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: g, reason: collision with root package name */
    public static final String f30281g = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: h, reason: collision with root package name */
    public static final String f30282h = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: i, reason: collision with root package name */
    public static final String f30283i = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: j, reason: collision with root package name */
    public static final String f30284j = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCloseCustomTab = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver redirectReceiver;

    /* renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            Y y10 = Y.f11042a;
            Bundle p02 = Y.p0(parse.getQuery());
            p02.putAll(Y.p0(parse.getFragment()));
            return p02;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[y.valuesCustom().length];
            iArr[y.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f30283i);
            String str = CustomTabMainActivity.f30281g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    public final void a(int resultCode, Intent resultIntent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            C1908a.b(this).e(broadcastReceiver);
        }
        if (resultIntent != null) {
            String stringExtra = resultIntent.getStringExtra(f30281g);
            Bundle b10 = stringExtra != null ? INSTANCE.b(stringExtra) : new Bundle();
            M m10 = M.f11009a;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Intent n10 = M.n(intent, b10, null);
            if (n10 != null) {
                resultIntent = n10;
            }
            setResult(resultCode, resultIntent);
        } else {
            M m11 = M.f11009a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            setResult(resultCode, M.n(intent2, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        String str = CustomTabActivity.f30273c;
        if (Intrinsics.areEqual(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(f30278d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f30279e);
        boolean a10 = (b.$EnumSwitchMapping$0[y.f45146b.a(getIntent().getStringExtra(f30282h)).ordinal()] == 1 ? new E(stringExtra, bundleExtra) : new C1666f(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f30280f));
        this.shouldCloseCustomTab = false;
        if (!a10) {
            setResult(0, getIntent().putExtra(f30284j, true));
            finish();
        } else {
            c cVar = new c();
            this.redirectReceiver = cVar;
            C1908a.b(this).c(cVar, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.areEqual(f30283i, intent.getAction())) {
            C1908a.b(this).d(new Intent(CustomTabActivity.f30274d));
            a(-1, intent);
        } else if (Intrinsics.areEqual(CustomTabActivity.f30273c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            a(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
