package com.ibits.react_native_in_app_review;

import Na.b;
import Na.c;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.ibits.react_native_in_app_review.AppReviewModule;
import java.util.Objects;

/* loaded from: classes3.dex */
public class AppReviewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private final ReactApplicationContext mContext;
    private Promise pendingInAppCommentPromise;
    private Promise pendingPromise;

    public AppReviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private boolean isGooglePlayServicesAvailable() {
        return GoogleApiAvailability.r().i(this.mContext) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0(Task task) {
        resolvePromise(task.isSuccessful());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$1(b bVar, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            rejectPromise("23", new Error(exception.getMessage()));
        } else {
            ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                rejectPromise("24", new Error("ACTIVITY_DOESN'T_EXIST"));
            } else {
                bVar.b(currentActivity, reviewInfo).addOnCompleteListener(new OnCompleteListener() { // from class: Wb.b
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        AppReviewModule.this.lambda$show$0(task2);
                    }
                });
            }
        }
    }

    private void rejectPromise(String str, Error error) {
        Promise promise = this.pendingPromise;
        if (promise != null) {
            promise.reject(str, error);
            this.pendingPromise = null;
        }
    }

    private void rejectPromiseHMS(String str, Error error) {
        Promise promise = this.pendingInAppCommentPromise;
        if (promise != null) {
            promise.reject(str, error);
            this.pendingInAppCommentPromise = null;
        }
    }

    private void resolvePromise(boolean z10) {
        Promise promise = this.pendingPromise;
        if (promise != null) {
            promise.resolve(Boolean.valueOf(z10));
            this.pendingPromise = null;
        }
    }

    private void resolvePromiseHMS(int i10) {
        Promise promise = this.pendingInAppCommentPromise;
        if (promise != null) {
            promise.resolve(Integer.valueOf(i10));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "InAppReviewModule";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (i10 == 1001) {
            if (i11 == 101) {
                Log.e("msg->101", isGooglePlayServicesAvailable() + "");
                rejectPromiseHMS("101", new Error("Ensure that your app has been correctly released on AppGallery"));
                return;
            }
            if (i11 == 0) {
                Log.e("msg->0", "Unknown error");
                rejectPromiseHMS("0", new Error("in app comment Unknown error"));
                return;
            }
            if (i11 == 102) {
                Log.e("msg->102", "rating done");
                resolvePromiseHMS(102);
                return;
            }
            if (i11 == 103) {
                Log.e("msg->103", "rating done");
                resolvePromiseHMS(103);
                return;
            }
            if (i11 == 104) {
                rejectPromiseHMS("104", new Error("check the HUAWEI ID sign-in status"));
                Log.e("msg->104", "");
                return;
            }
            if (i11 == 105) {
                rejectPromiseHMS("105", new Error("The user does not meet the conditions for displaying the comment pop-up"));
                Log.e("msg->105", "");
                return;
            }
            if (i11 == 106) {
                rejectPromiseHMS("106", new Error("The commenting function is disabled"));
                Log.e(" msg->106", "disabled");
            } else if (i11 == 107) {
                rejectPromiseHMS("107", new Error("The in-app commenting service is not supported. (Apps released in the Chinese mainland do not support this service.)"));
                Log.e("msg->107", "in-app commenting service is not supported");
            } else if (i11 == 108) {
                rejectPromiseHMS("108", new Error("The user canceled the comment"));
                Log.e("msg->108", "user canceled");
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void show(Promise promise) {
        this.pendingPromise = promise;
        if (!isGooglePlayServicesAvailable()) {
            Log.e("msg->GP", isGooglePlayServicesAvailable() + "");
            rejectPromise("22", new Error("GOOGLE_SERVICES_NOT_AVAILABLE"));
            return;
        }
        Log.e("msg->GP", isGooglePlayServicesAvailable() + "");
        final b a10 = c.a(this.mContext);
        a10.a().addOnCompleteListener(new OnCompleteListener() { // from class: Wb.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AppReviewModule.this.lambda$show$1(a10, task);
            }
        });
    }

    @ReactMethod
    public void showInAppCommentHMS(Promise promise) {
        this.pendingInAppCommentPromise = promise;
        Activity currentActivity = getCurrentActivity();
        Intent intent = new Intent("com.huawei.appmarket.intent.action.guidecomment");
        intent.setPackage("com.huawei.appmarket");
        if (currentActivity != null) {
            currentActivity.startActivityForResult(intent, 1001);
        } else {
            rejectPromiseHMS("24", new Error("ACTIVITY_DOESN'T_EXIST"));
        }
    }
}
