package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomBaseComponentActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "localizedContext", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class IntercomBaseComponentActivity extends AppCompatActivity {
    public static final int $stable = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(localizedContext(newBase));
    }

    private final Context localizedContext(Context context) {
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.get().getActivityFinisher().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister(this);
    }
}
