package com.apm.insight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ICrashCallback {
    void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread);
}
