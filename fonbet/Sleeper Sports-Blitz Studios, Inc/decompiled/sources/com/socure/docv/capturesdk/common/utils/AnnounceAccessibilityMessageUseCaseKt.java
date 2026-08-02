package com.socure.docv.capturesdk.common.utils;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.di.DependencyGraphExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: AnnounceAccessibilityMessageUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "queue", "", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "message", "interrupt", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnnounceAccessibilityMessageUseCaseKt {
    private static final String TAG = "AnnounceAccessibilityMessageUseCase";

    public static /* synthetic */ void queue$default(AnnounceAccessibilityMessageUseCase announceAccessibilityMessageUseCase, View view, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        queue(announceAccessibilityMessageUseCase, view, str, z);
    }

    public static final void queue(AnnounceAccessibilityMessageUseCase announceAccessibilityMessageUseCase, View view, String message, boolean z) {
        Intrinsics.checkNotNullParameter(announceAccessibilityMessageUseCase, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(message, "message");
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        BuildersKt__Builders_commonKt.launch$default(DependencyGraphExtKt.obtainApplicationComponent((Application) applicationContext).getApplicationScope(), null, null, new AnnounceAccessibilityMessageUseCaseKt$queue$1(announceAccessibilityMessageUseCase, view, message, z, null), 3, null);
    }
}
