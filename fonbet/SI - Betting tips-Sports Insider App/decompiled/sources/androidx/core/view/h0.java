package androidx.core.view;

import android.app.job.JobScheduler;
import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.sports.insider.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static u0.f a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        Intrinsics.checkNotNullExpressionValue(type, "ex.type");
        return m4.g.A(getCredentialException.getMessage(), type);
    }

    public static t0.q b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
        Intrinsics.checkNotNullParameter(credential, "credential");
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "credential.type");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "credential.data");
        return new t0.q(rh.g.f(data, type));
    }

    public static JobScheduler c(JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "jobScheduler");
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        Intrinsics.checkNotNullExpressionValue(forNamespace, "forNamespace(...)");
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float e(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getAxisVelocity(i5);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int h(ViewConfiguration viewConfiguration, int i5, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i5, i10, i11);
    }

    public static int i(ViewConfiguration viewConfiguration, int i5, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i5, i10, i11);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void k(e.j jVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            jVar.overrideActivityTransition(0, R.anim.alpha_in, R.anim.alpha_out);
        } else {
            jVar.overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
        }
    }

    public static float l(DisplayMetrics displayMetrics, float f6) {
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        return Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics) : displayMetrics.scaledDensity * f6;
    }

    public static void m(TextView textView, int i5, float f6) {
        textView.setLineHeight(i5, f6);
    }
}
