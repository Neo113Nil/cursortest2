package com.appsonair.appsync.services;

import android.content.Context;
import com.appsonair.appsync.R;
import com.appsonair.appsync.interfaces.UpdateCallBack;
import com.appsonair.appsync.services.AppSyncService;
import com.appsonair.core.interfaces.UpdateNetwork;
import com.appsonair.core.services.CoreService;
import com.appsonair.core.services.NetworkService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppSyncService$Companion$sync$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UpdateCallBack $callBack;
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, Object> $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSyncService$Companion$sync$1(Context context, Map<String, ? extends Object> map, UpdateCallBack updateCallBack) {
        super(0);
        this.$context = context;
        this.$options = map;
        this.$callBack = updateCallBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m61invoke$lambda1(Context context, UpdateCallBack updateCallBack, boolean z10) {
        boolean z11;
        Intrinsics.checkNotNullParameter(context, "$context");
        AppSyncService.Companion companion = AppSyncService.INSTANCE;
        AppSyncService.isNetworkConnected = z10;
        if (z10) {
            z11 = AppSyncService.isResponseReceived;
            if (z11) {
                return;
            }
            companion.callCDNServiceApi(context, updateCallBack);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z10;
        boolean z11;
        AppSyncService.appId = CoreService.INSTANCE.getAppId(this.$context);
        if (AppSyncService.appId.length() == 0) {
            this.$context.getString(R.string.error_something_wrong);
            return;
        }
        if (!this.$options.isEmpty() && this.$options.containsKey("showNativeUI") && (this.$options.get("showNativeUI") instanceof Boolean)) {
            Object obj = this.$options.get("showNativeUI");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            AppSyncService.showNativeUI = ((Boolean) obj).booleanValue();
        }
        z10 = AppSyncService.isResponseReceived;
        if (z10) {
            z11 = AppSyncService.isNetworkConnected;
            if (z11) {
                AppSyncService.INSTANCE.callCDNServiceApi(this.$context, this.$callBack);
                return;
            }
            return;
        }
        NetworkService.Companion companion = NetworkService.INSTANCE;
        final Context context = this.$context;
        final UpdateCallBack updateCallBack = this.$callBack;
        companion.checkConnectivity(context, new UpdateNetwork() { // from class: com.appsonair.appsync.services.a
            @Override // com.appsonair.core.interfaces.UpdateNetwork
            public final void onUpdate(boolean z12) {
                AppSyncService$Companion$sync$1.m61invoke$lambda1(context, updateCallBack, z12);
            }
        });
    }
}
