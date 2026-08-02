package uk.co.workingedge.phonegap.plugin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class LaunchReview extends CordovaPlugin {
    private static final String LOG_TAG = "LaunchReview";

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, BuildConfig.APPLICATION_ID);
        p0.startActivity(p1);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        String packageName;
        boolean z = true;
        if ("launch".equals(str)) {
            try {
                if (!jSONArray.isNull(0)) {
                    packageName = jSONArray.getString(0);
                } else {
                    packageName = this.f3354cordova.getActivity().getPackageName();
                }
                Log.d(LOG_TAG, "Opening market for ".concat(packageName));
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
                intent.addFlags(1545601024);
                intent.setPackage("com.android.vending");
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), intent);
                try {
                    callbackContext.success();
                    return true;
                } catch (JSONException e) {
                    e = e;
                    lambda$execute$3(e, callbackContext);
                    return z;
                }
            } catch (JSONException e2) {
                e = e2;
                z = false;
            }
        } else {
            if ("rating".equals(str)) {
                final ReviewManager create = ReviewManagerFactory.create(this.f3354cordova.getContext());
                create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: uk.co.workingedge.phonegap.plugin.LaunchReview$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        LaunchReview.this.lambda$execute$2(create, callbackContext, task);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: uk.co.workingedge.phonegap.plugin.LaunchReview$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        LaunchReview.this.lambda$execute$3(callbackContext, exc);
                    }
                });
                return true;
            }
            callbackContext.error("Invalid action");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$2(ReviewManager reviewManager, final CallbackContext callbackContext, Task task) {
        try {
            if (taskWasSuccessful(task)) {
                reviewManager.launchReviewFlow(this.f3354cordova.getActivity(), (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() { // from class: uk.co.workingedge.phonegap.plugin.LaunchReview$$ExternalSyntheticLambda2
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        LaunchReview.this.lambda$execute$0(callbackContext, task2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: uk.co.workingedge.phonegap.plugin.LaunchReview$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        LaunchReview.this.lambda$execute$1(callbackContext, exc);
                    }
                });
            } else {
                handleTaskFailed(task, callbackContext);
            }
        } catch (Exception e) {
            lambda$execute$3(e, callbackContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(CallbackContext callbackContext, Task task) {
        try {
            if (taskWasSuccessful(task)) {
                callbackContext.success("requested");
            } else {
                handleTaskFailed(task, callbackContext);
            }
        } catch (Exception e) {
            lambda$execute$3(e, callbackContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleException, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$execute$3(Exception exc, CallbackContext callbackContext) {
        callbackContext.error("Exception occurred: ".concat(exc.getMessage()));
    }

    private boolean taskWasSuccessful(Task task) {
        return task.isSuccessful() || task.getException() == null;
    }

    private void handleTaskFailed(Task task, CallbackContext callbackContext) {
        callbackContext.error("Task failed: ".concat(task.getException().getMessage()));
    }
}
