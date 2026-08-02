package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.io.InputStream;
import java.io.OutputStream;
import xsna.qmi0;
import xsna.s3q0;
import xsna.spj;

/* compiled from: WebViewConfigurationStoreSerializer.kt */
/* loaded from: classes14.dex */
public final class WebViewConfigurationStoreSerializer implements qmi0<WebviewConfigurationStore.WebViewConfigurationStore> {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();

    @Override // xsna.qmi0
    public Object readFrom(InputStream inputStream, spj<? super WebviewConfigurationStore.WebViewConfigurationStore> spjVar) {
        try {
            return WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @Override // xsna.qmi0
    public /* bridge */ /* synthetic */ Object writeTo(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, spj spjVar) {
        return writeTo2(webViewConfigurationStore, outputStream, (spj<? super s3q0>) spjVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.qmi0
    public WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, spj<? super s3q0> spjVar) {
        webViewConfigurationStore.writeTo(outputStream);
        return s3q0.a;
    }
}
