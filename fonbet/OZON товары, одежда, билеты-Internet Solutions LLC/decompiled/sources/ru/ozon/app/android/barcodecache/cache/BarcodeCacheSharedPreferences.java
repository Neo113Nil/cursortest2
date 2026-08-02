package ru.ozon.app.android.barcodecache.cache;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R!\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/barcodecache/cache/BarcodeCacheSharedPreferences;", "", "Landroid/content/Context;", "context", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;)V", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "barcode", "teenBarcode", "", "timestamp", "", "saveBarcode", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;J)V", "", "isTeenMode", "getBarcode", "(Z)Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "getCommonBarcode", "()Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "getTeenBarcode", "getTimestamp", "()J", "clearStorage", "()V", "Landroid/content/Context;", "Lcom/squareup/moshi/Moshi;", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "LSc/j;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/squareup/moshi/JsonAdapter;", "moshiAdapter$delegate", "getMoshiAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "moshiAdapter", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getErrorRefreshIntervalInSeconds", "()I", "setErrorRefreshIntervalInSeconds", "(I)V", "errorRefreshIntervalInSeconds", "getErrorOccurred", "()Z", "errorOccurred", "Companion", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCacheSharedPreferences {

    @NotNull
    private final Context context;

    @NotNull
    private final Moshi moshi;

    /* renamed from: moshiAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j moshiAdapter;

    /* renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sharedPreferences;

    public BarcodeCacheSharedPreferences(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.context = context;
        this.moshi = moshi;
        this.sharedPreferences = k.b(new BarcodeCacheSharedPreferences$sharedPreferences$2(this));
        this.moshiAdapter = k.b(new BarcodeCacheSharedPreferences$moshiAdapter$2(this));
    }

    private final JsonAdapter<BarcodeCacheDTO> getMoshiAdapter() {
        return (JsonAdapter) this.moshiAdapter.getValue();
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final void clearStorage() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.clear();
        edit.apply();
    }

    public final BarcodeCacheDTO getBarcode(boolean isTeenMode) {
        return isTeenMode ? getTeenBarcode() : getCommonBarcode();
    }

    public final BarcodeCacheDTO getCommonBarcode() {
        String string = getSharedPreferences().getString("barcodeCache", null);
        if (string != null) {
            return getMoshiAdapter().fromJson(string);
        }
        return null;
    }

    public final boolean getErrorOccurred() {
        return getErrorRefreshIntervalInSeconds() != -1;
    }

    public final int getErrorRefreshIntervalInSeconds() {
        return getSharedPreferences().getInt("errorRefreshInterval", -1);
    }

    public final BarcodeCacheDTO getTeenBarcode() {
        String string = getSharedPreferences().getString("teenBarcodeCache", null);
        if (string != null) {
            return getMoshiAdapter().fromJson(string);
        }
        return null;
    }

    public final long getTimestamp() {
        return getSharedPreferences().getLong("timestampCache", 0L);
    }

    public final void saveBarcode(@NotNull BarcodeCacheDTO barcode, BarcodeCacheDTO teenBarcode, long timestamp) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString("barcodeCache", getMoshiAdapter().toJson(barcode));
        if (teenBarcode != null) {
            edit.putString("teenBarcodeCache", getMoshiAdapter().toJson(teenBarcode));
        }
        edit.putLong("timestampCache", timestamp);
        setErrorRefreshIntervalInSeconds(-1);
        edit.apply();
    }

    public final void setErrorRefreshIntervalInSeconds(int i11) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putInt("errorRefreshInterval", i11);
        edit.apply();
    }
}
