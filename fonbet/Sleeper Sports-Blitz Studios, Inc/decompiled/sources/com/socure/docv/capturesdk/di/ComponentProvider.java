package com.socure.docv.capturesdk.di;

import androidx.exifinterface.media.ExifInterface;
import com.socure.docv.capturesdk.di.DependencyComponent;
import kotlin.Metadata;

/* compiled from: ComponentProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/di/ComponentProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/di/DependencyComponent;", "", "component", "getComponent", "()Lcom/socure/docv/capturesdk/di/DependencyComponent;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ComponentProvider<T extends DependencyComponent> {
    T getComponent();
}
