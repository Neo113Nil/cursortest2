package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0644z2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(C0644z2.f14985g),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final String f11654a;

    ApplicationState(String str) {
        this.f11654a = str;
    }

    @NonNull
    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f11654a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f11654a;
    }
}
