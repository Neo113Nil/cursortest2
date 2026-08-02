package ru.ozon.app.android.permission.extension;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/m;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "", "buildPermissionRequest", "requestPermission", "(Landroidx/fragment/app/m;Lkotlin/jvm/functions/Function1;)V", "permission_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FragmentsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void requestPermission(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequester permissionRequester = componentCallbacksC5392m instanceof PermissionRequester ? (PermissionRequester) componentCallbacksC5392m : null;
        if (permissionRequester != null) {
            permissionRequester.requestPermission(buildPermissionRequest);
        }
    }
}
