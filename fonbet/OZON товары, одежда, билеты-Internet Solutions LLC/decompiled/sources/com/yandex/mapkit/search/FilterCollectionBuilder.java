package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public interface FilterCollectionBuilder {
    void addBooleanFilter(@NonNull String str);

    void addDateFilter(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void addEnumFilter(@NonNull String str, @NonNull List<String> list);

    void addRangeFilter(@NonNull String str, double d11, double d12);

    @NonNull
    FilterCollection build();
}
