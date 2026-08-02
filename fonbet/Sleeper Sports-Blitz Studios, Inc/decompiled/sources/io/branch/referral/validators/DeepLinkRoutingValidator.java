package io.branch.referral.validators;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.nimbusds.jose.jwk.JWKParameterNames;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.PrefHelper;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class DeepLinkRoutingValidator {
    private static final String BRANCH_VALIDATE_TEST_KEY = "_branch_validate";
    private static final int BRANCH_VALIDATE_TEST_VALUE = 60514;
    private static final int LAUNCH_TEST_TEMPLATE_DELAY = 500;
    private static final String URI_REDIRECT_KEY = "$uri_redirect_mode";
    private static final String URI_REDIRECT_MODE = "2";
    private static final String VALIDATE_LINK_PARAM_KEY = "validate";
    private static final String VALIDATE_SDK_LINK_PARAM_KEY = "bnc_validate";
    private static WeakReference<Activity> current_activity_reference;

    public static void validate(WeakReference<Activity> weakReference) {
        current_activity_reference = weakReference;
        if (TextUtils.isEmpty(getLatestReferringLink()) || weakReference == null) {
            return;
        }
        final JSONObject latestReferringParams = Branch.getInstance().getLatestReferringParams();
        if (latestReferringParams.optInt(BRANCH_VALIDATE_TEST_KEY) == BRANCH_VALIDATE_TEST_VALUE) {
            if (latestReferringParams.optBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey())) {
                validateDeeplinkRouting(latestReferringParams);
                return;
            } else {
                displayErrorMessage();
                return;
            }
        }
        if (latestReferringParams.optBoolean(VALIDATE_SDK_LINK_PARAM_KEY)) {
            new Handler().postDelayed(new Runnable() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.1
                @Override // java.lang.Runnable
                public void run() {
                    DeepLinkRoutingValidator.launchTestTemplate(DeepLinkRoutingValidator.getUpdatedLinkWithTestStat(latestReferringParams, ""));
                }
            }, 500L);
        }
    }

    private static void validateDeeplinkRouting(final JSONObject jSONObject) {
        if (current_activity_reference.get() != null) {
            new AlertDialog.Builder(current_activity_reference.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    DeepLinkRoutingValidator.launchTestTemplate(DeepLinkRoutingValidator.getUpdatedLinkWithTestStat(jSONObject, "g"));
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    DeepLinkRoutingValidator.launchTestTemplate(DeepLinkRoutingValidator.getUpdatedLinkWithTestStat(jSONObject, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR));
                }
            }).setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void launchTestTemplate(String str) {
        if (current_activity_reference.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter(URI_REDIRECT_KEY, "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            current_activity_reference.get().getPackageManager().queryIntentActivities(intent, 0);
            try {
                current_activity_reference.get().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                current_activity_reference.get().startActivity(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getUpdatedLinkWithTestStat(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        try {
            str8 = jSONObject.getString("~" + Defines.Jsonkey.ReferringLink.getKey());
            str2 = str8.split("\\?")[0];
        } catch (Exception unused) {
            PrefHelper.Debug("Failed to get referring link");
            str2 = str8;
        }
        String str9 = str2 + "?validate=true";
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str9);
                if (jSONObject.getString(UserDataStore.CITY).equals("t1")) {
                    str3 = "&t1=" + str;
                } else {
                    str3 = "&t1=" + jSONObject.getString("t1");
                }
                sb.append(str3);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (jSONObject.getString(UserDataStore.CITY).equals("t2")) {
                    str4 = "&t2=" + str;
                } else {
                    str4 = "&t2=" + jSONObject.getString("t2");
                }
                sb3.append(str4);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                if (jSONObject.getString(UserDataStore.CITY).equals("t3")) {
                    str5 = "&t3=" + str;
                } else {
                    str5 = "&t3=" + jSONObject.getString("t3");
                }
                sb5.append(str5);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (jSONObject.getString(UserDataStore.CITY).equals("t4")) {
                    str6 = "&t4=" + str;
                } else {
                    str6 = "&t4=" + jSONObject.getString("t4");
                }
                sb7.append(str6);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb8);
                if (jSONObject.getString(UserDataStore.CITY).equals("t5")) {
                    str7 = "&t5=" + str;
                } else {
                    str7 = "&t5=" + jSONObject.getString("t5");
                }
                sb9.append(str7);
                str9 = sb9.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str9 + "&os=android";
    }

    private static void displayErrorMessage() {
        if (current_activity_reference.get() != null) {
            new AlertDialog.Builder(current_activity_reference.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
        }
    }

    private static String getLatestReferringLink() {
        if (Branch.getInstance() != null && Branch.getInstance().getLatestReferringParams() != null) {
            return Branch.getInstance().getLatestReferringParams().optString("~" + Defines.Jsonkey.ReferringLink.getKey());
        }
        return "";
    }
}
