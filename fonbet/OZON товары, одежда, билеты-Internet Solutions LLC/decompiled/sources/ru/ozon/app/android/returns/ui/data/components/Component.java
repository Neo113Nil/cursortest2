package ru.ozon.app.android.returns.ui.data.components;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/ui/data/components/Component;", "", "isRequired", "", "isRequired$annotations", "()V", "()Z", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName$annotations", "getName", "()Ljava/lang/String;", "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Component {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
        public static /* synthetic */ void getName$annotations() {
        }

        @i(name = "isRequired")
        public static /* synthetic */ void isRequired$annotations() {
        }
    }

    String getName();

    boolean isRequired();
}
