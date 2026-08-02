package cl.json;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RNShare extends NativeRNShareSpec {
    private final a delegate;

    public RNShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new a(reactApplicationContext);
    }

    @Override // cl.json.NativeRNShareSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeRNShareSpec.NAME;
    }

    @Override // cl.json.NativeRNShareSpec
    public Map<String, Object> getTypedExportedConstants() {
        return this.delegate.a();
    }

    @Override // cl.json.NativeRNShareSpec
    public void isBase64File(String str, Promise promise) {
        this.delegate.b(str, promise);
    }

    @Override // cl.json.NativeRNShareSpec
    public void isPackageInstalled(String str, Promise promise) {
        this.delegate.c(str, promise);
    }

    @Override // cl.json.NativeRNShareSpec
    public void open(ReadableMap readableMap, Promise promise) {
        this.delegate.e(readableMap, promise);
    }

    @Override // cl.json.NativeRNShareSpec
    public void shareSingle(ReadableMap readableMap, Promise promise) {
        this.delegate.f(readableMap, promise);
    }
}
