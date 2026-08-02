package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPreviewActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PreviewMediaContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", MetricTracker.Object.INPUT, "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PreviewMediaContract extends ActivityResultContract<IntercomPreviewArgs, List<Uri>> {
    public static final int $stable = 0;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, IntercomPreviewArgs input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return IntercomPreviewActivity.INSTANCE.createIntent(context, input);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public List<Uri> parseResult(int resultCode, Intent intent) {
        ArrayList emptyList;
        ArrayList parcelableArrayList;
        if (resultCode != -1) {
            intent = null;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && (parcelableArrayList = BundleCompat.getParcelableArrayList(extras, "MEDIA_RESULT_URIS", Uri.class)) != null) {
                emptyList = parcelableArrayList;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            if (emptyList != null) {
                return emptyList;
            }
        }
        return CollectionsKt.emptyList();
    }
}
