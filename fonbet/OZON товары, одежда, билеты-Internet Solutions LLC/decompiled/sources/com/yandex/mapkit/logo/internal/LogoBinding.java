package com.yandex.mapkit.logo.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.logo.Alignment;
import com.yandex.mapkit.logo.Logo;
import com.yandex.mapkit.logo.Padding;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class LogoBinding implements Logo {
    private final NativeObject nativeObject;

    protected LogoBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.logo.Logo
    public native boolean isValid();

    @Override // com.yandex.mapkit.logo.Logo
    public native void setAlignment(@NonNull Alignment alignment);

    @Override // com.yandex.mapkit.logo.Logo
    public native void setPadding(@NonNull Padding padding);
}
