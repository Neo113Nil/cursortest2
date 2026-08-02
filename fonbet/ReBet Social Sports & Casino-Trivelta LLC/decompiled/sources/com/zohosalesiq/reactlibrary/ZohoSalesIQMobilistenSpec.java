package com.zohosalesiq.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0014¨\u0006\n"}, d2 = {"Lcom/zohosalesiq/reactlibrary/ZohoSalesIQMobilistenSpec;", "Lcom/zohosalesiq/reactlibrary/NativeRNZohoSalesIQSpec;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "react-native-zohosalesiq_mobilisten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ZohoSalesIQMobilistenSpec extends NativeRNZohoSalesIQSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZohoSalesIQMobilistenSpec(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.zohosalesiq.reactlibrary.NativeRNZohoSalesIQSpec
    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        C0 g10 = C0.f44680a.g();
        if (g10 != null) {
            return g10.O1();
        }
        return null;
    }
}
