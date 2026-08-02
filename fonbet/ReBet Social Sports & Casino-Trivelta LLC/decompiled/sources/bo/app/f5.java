package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2989c;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f5 implements h9 {

    /* renamed from: a, reason: collision with root package name */
    public final C2989c f25452a;

    public f5(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f25452a = new C2989c(context, apiKey);
    }

    public final String a() {
        C2989c c2989c = this.f25452a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String readString = c2989c.readString(dataStoreKey, null);
        if (readString == null) {
            C2989c c2989c2 = this.f25452a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            readString = c2989c2.readString(dataStoreKey2, null);
            this.f25452a.clearData(dataStoreKey2);
        }
        C2989c c2989c3 = this.f25452a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if ((c2989c3.contains(dataStoreKey3) ? !Intrinsics.areEqual(this.f25452a.readString(dataStoreKey3, null), String.valueOf(722989291)) : false) || readString == null) {
            readString = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(readString, "toString(...)");
        }
        this.f25452a.writeData(dataStoreKey, readString);
        this.f25452a.writeData(dataStoreKey3, String.valueOf(722989291));
        return readString;
    }
}
