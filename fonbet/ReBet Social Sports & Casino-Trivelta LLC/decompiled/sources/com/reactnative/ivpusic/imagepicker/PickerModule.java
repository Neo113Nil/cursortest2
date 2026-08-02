package com.reactnative.ivpusic.imagepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import kc.C5247g;

@ReactModule(name = NativeImageCropPickerSpec.NAME)
/* loaded from: classes4.dex */
public class PickerModule extends NativeImageCropPickerSpec {
    private final C5247g picker;

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.picker = new C5247g(reactApplicationContext);
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void clean(Promise promise) {
        this.picker.j(promise);
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void cleanSingle(String str, Promise promise) {
        this.picker.k(str, promise);
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openCamera(ReadableMap readableMap, Promise promise) {
        this.picker.I(readableMap, promise);
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openCropper(ReadableMap readableMap, Promise promise) {
        this.picker.J(readableMap, promise);
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openPicker(ReadableMap readableMap, Promise promise) {
        this.picker.K(readableMap, promise);
    }
}
