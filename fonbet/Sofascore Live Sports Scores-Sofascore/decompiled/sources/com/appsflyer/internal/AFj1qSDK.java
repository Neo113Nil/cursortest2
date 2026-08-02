package com.appsflyer.internal;

import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import defpackage.zzl;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1qSDK implements OptionalFeaturesValidator {

    @NotNull
    private final Map<SupportedOptionalFeatures, AFj1sSDK> unregisterClient = new LinkedHashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] registerClient;

        static {
            int[] iArr = new int[AFj1sSDK.values().length];
            try {
                iArr[AFj1sSDK.UNDETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1sSDK.PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1sSDK.NOT_PRESENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            registerClient = iArr;
        }
    }

    private static boolean unregisterClient(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }

    @Override // com.appsflyer.sdk_base.util.OptionalFeaturesValidator
    public final boolean isOptionalFeaturePresent(@NotNull SupportedOptionalFeatures supportedOptionalFeatures) {
        supportedOptionalFeatures.getClass();
        AFj1sSDK aFj1sSDK = this.unregisterClient.get(supportedOptionalFeatures);
        if (aFj1sSDK == null) {
            aFj1sSDK = AFj1sSDK.UNDETERMINED;
        }
        int i = AFa1tSDK.registerClient[aFj1sSDK.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i == 3) {
                return false;
            }
            zzl.b();
            return false;
        }
        if (!OptionalFeaturesValidator.INSTANCE.getRegisteredFeatures().contains(supportedOptionalFeatures)) {
            this.unregisterClient.put(supportedOptionalFeatures, AFj1sSDK.NOT_PRESENT);
            return false;
        }
        boolean unregisterClient = unregisterClient(supportedOptionalFeatures.getClassName());
        this.unregisterClient.put(supportedOptionalFeatures, unregisterClient ? AFj1sSDK.PRESENT : AFj1sSDK.NOT_PRESENT);
        return unregisterClient;
    }
}
