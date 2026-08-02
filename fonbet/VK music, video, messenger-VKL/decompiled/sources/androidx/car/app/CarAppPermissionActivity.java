package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.ArrayList;
import java.util.Map;
import xsna.bb0;
import xsna.ua0;

/* loaded from: classes11.dex */
public class CarAppPermissionActivity extends ComponentActivity {
    public static final /* synthetic */ int f = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                createConfigurationContext.setTheme(i);
            }
            int identifier = createConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = createConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb.append(intent == null ? "null Intent" : intent.getAction());
            Log.e("CarApp", sb.toString());
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        final IOnRequestPermissionsListener asInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (asInterface != null && stringArray != null) {
            registerForActivityResult(new bb0(), new ua0() { // from class: xsna.ks9
                @Override // xsna.ua0
                public final void onActivityResult(Object obj) {
                    IOnRequestPermissionsListener iOnRequestPermissionsListener = asInterface;
                    int i2 = CarAppPermissionActivity.f;
                    CarAppPermissionActivity carAppPermissionActivity = CarAppPermissionActivity.this;
                    carAppPermissionActivity.getClass();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Boolean bool = (Boolean) entry.getValue();
                        if (bool == null || !bool.booleanValue()) {
                            arrayList2.add((String) entry.getKey());
                        } else {
                            arrayList.add((String) entry.getKey());
                        }
                    }
                    try {
                        iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
                    } catch (RemoteException e) {
                        Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
                    }
                    carAppPermissionActivity.finish();
                }
            }).a(stringArray);
        } else {
            Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
        }
    }
}
