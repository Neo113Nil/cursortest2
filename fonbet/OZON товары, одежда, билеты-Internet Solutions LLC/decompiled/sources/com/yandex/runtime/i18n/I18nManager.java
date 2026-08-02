package com.yandex.runtime.i18n;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface I18nManager {
    @NonNull
    CanonicalUnit canonicalSpeed(double d11);

    @NonNull
    I18nPrefs getPrefs();

    @NonNull
    SystemOfMeasurement getSom();

    @NonNull
    TimeFormat getTimeFormat();

    boolean isValid();

    @NonNull
    String localizeCanonicalUnit(@NonNull CanonicalUnit canonicalUnit);

    @NonNull
    String localizeDataSize(long j11);

    @NonNull
    String localizeDistance(int i11);

    @NonNull
    String localizeDuration(int i11);

    @NonNull
    String localizeSpeed(double d11);

    void setPrefs(@NonNull I18nPrefs i18nPrefs);

    void setSom(@NonNull SystemOfMeasurement systemOfMeasurement);

    void setTimeFormat(@NonNull TimeFormat timeFormat);
}
