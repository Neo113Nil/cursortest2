package ai.verisoul.sdk.helpers.location;

import V9.InterfaceC1749e;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lai/verisoul/sdk/helpers/location/LocationHelperImpl;", "Lai/verisoul/sdk/helpers/location/LocationHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logTag", "", "collect", "", "onResult", "Lkotlin/Function1;", "Lai/verisoul/sdk/helpers/location/LocationData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocationHelperImpl implements LocationHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String logTag;

    public LocationHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + LocationHelperImpl.class.getSimpleName() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collect$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collect$lambda$1(LocationHelperImpl this$0, Function1 onResult, long j10, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Logger logger = Logger.INSTANCE;
        logger.error(this$0.logTag, "Failed to getlast known location: " + exception.getMessage());
        onResult.invoke(new LocationData(null, null, null, null, null, null, "Failed to get last known location: " + exception.getMessage(), null, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null));
        logger.metricLog(this$0.logTag, "location_collection_duration", System.currentTimeMillis() - j10);
    }

    @Override // ai.verisoul.sdk.helpers.location.LocationHelper
    public void collect(@NotNull final Function1<? super LocationData, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        final long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = AbstractC5338c.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean z11 = AbstractC5338c.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (!z10 && !z11) {
            onResult.invoke(new LocationData(null, null, null, null, null, null, "No location permissions granted. Limited data returned.", null, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null));
            Logger.INSTANCE.error(this.logTag, "No location permissions granted. Limited data returned.");
            return;
        }
        InterfaceC1749e a10 = LocationServices.a(this.context);
        Intrinsics.checkNotNullExpressionValue(a10, "getFusedLocationProviderClient(...)");
        Task lastLocation = a10.getLastLocation();
        final Function1<Location, Unit> function1 = new Function1<Location, Unit>() { // from class: ai.verisoul.sdk.helpers.location.LocationHelperImpl$collect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Location location) {
                String str;
                String str2;
                Boolean bool;
                String str3;
                boolean isMock;
                if (location == null) {
                    onResult.invoke(new LocationData(null, null, null, null, null, null, "Location is unavailable (null). Ensure location services are enabled.", null, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null));
                    Logger logger = Logger.INSTANCE;
                    str = this.logTag;
                    logger.error(str, "Location is unavailable (null). Ensure location services are enabled.");
                    str2 = this.logTag;
                    logger.metricLog(str2, "location_collection_duration", System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    isMock = location.isMock();
                    bool = Boolean.valueOf(isMock);
                } else {
                    bool = null;
                }
                onResult.invoke(new LocationData(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), null, null, null, null, null, bool, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
                Logger logger2 = Logger.INSTANCE;
                str3 = this.logTag;
                logger2.metricLog(str3, "location_collection_duration", System.currentTimeMillis() - currentTimeMillis);
            }
        };
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: ai.verisoul.sdk.helpers.location.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                LocationHelperImpl.collect$lambda$0(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ai.verisoul.sdk.helpers.location.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LocationHelperImpl.collect$lambda$1(LocationHelperImpl.this, onResult, currentTimeMillis, exc);
            }
        });
    }
}
