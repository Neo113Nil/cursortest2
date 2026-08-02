package com.imagepicker;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public class ImagePickerModule extends NativeImagePickerSpec {
    final d imagePickerModuleImpl;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.imagePickerModuleImpl = new d(reactApplicationContext);
    }

    @Override // com.imagepicker.NativeImagePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeImagePickerSpec.NAME;
    }

    @Override // com.imagepicker.NativeImagePickerSpec
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        this.imagePickerModuleImpl.c(readableMap, callback);
    }

    @Override // com.imagepicker.NativeImagePickerSpec
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        this.imagePickerModuleImpl.d(readableMap, callback);
    }
}
