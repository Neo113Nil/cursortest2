package com.appsonair.core.services;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.appsonair.core.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/appsonair/core/services/CoreService;", "", "()V", "Companion", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CoreService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/appsonair/core/services/CoreService$Companion;", "", "()V", "getAppId", "", "context", "Landroid/content/Context;", "getDeviceInfo", "Lorg/json/JSONObject;", "additionalInfo", "", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JSONObject getDeviceInfo$default(Companion companion, Context context, Map map, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.getDeviceInfo(context, map);
        }

        @JvmStatic
        @NotNull
        public final String getAppId(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    context.getString(R.string.error_add_meta_data);
                    return "";
                }
                String string = bundle.getString("AppsonairAppId");
                if (string == null && (string = bundle.getString("appId")) == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    return string;
                }
                context.getString(R.string.error_add_app_id);
                return "";
            } catch (Exception e10) {
                e10.printStackTrace();
                context.getString(R.string.error_something_wrong);
                return "";
            }
        }

        @JvmStatic
        @NotNull
        public final JSONObject getDeviceInfo(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            DeviceInfoService companion = DeviceInfoService.INSTANCE.getInstance(context);
            return !additionalInfo.isEmpty() ? companion.getDeviceInfo(additionalInfo) : companion.getDeviceInfo();
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final String getAppId(@NotNull Context context) {
        return INSTANCE.getAppId(context);
    }

    @JvmStatic
    @NotNull
    public static final JSONObject getDeviceInfo(@NotNull Context context, @NotNull Map<String, ? extends Object> map) {
        return INSTANCE.getDeviceInfo(context, map);
    }
}
