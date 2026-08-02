package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.FilterCollectionBuilder;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class FilterCollectionBuilderBinding implements FilterCollectionBuilder {
    private final NativeObject nativeObject;

    protected FilterCollectionBuilderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addBooleanFilter(@NonNull String str);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addDateFilter(@NonNull String str, @NonNull String str2, @NonNull String str3);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addEnumFilter(@NonNull String str, @NonNull List<String> list);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addRangeFilter(@NonNull String str, double d11, double d12);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    @NonNull
    public native FilterCollection build();
}
