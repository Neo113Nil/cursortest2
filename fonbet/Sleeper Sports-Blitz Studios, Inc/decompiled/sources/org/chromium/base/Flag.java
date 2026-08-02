package org.chromium.base;

import internal.org.chromium.build.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class Flag {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static HashMap<String, Flag> sFlagsCreatedForTesting = new HashMap<>();
    protected final FeatureMap mFeatureMap;
    protected final String mFeatureName;

    protected abstract void clearInMemoryCachedValueForTesting();

    public abstract boolean isEnabled();

    protected Flag(FeatureMap featureMap, String featureName) {
        this.mFeatureMap = featureMap;
        this.mFeatureName = featureName;
        if (BuildConfig.IS_FOR_TEST) {
            sFlagsCreatedForTesting.put(featureName, this);
        }
    }

    public String getFeatureName() {
        return this.mFeatureName;
    }

    public FeatureMap getFeatureMapForTesting() {
        return this.mFeatureMap;
    }

    public static void resetAllInMemoryCachedValuesForTesting() {
        Iterator<Flag> it = sFlagsCreatedForTesting.values().iterator();
        while (it.hasNext()) {
            it.next().clearInMemoryCachedValueForTesting();
        }
    }

    public static void useTemporaryFlagsCreatedForTesting() {
        final HashMap<String, Flag> hashMap = sFlagsCreatedForTesting;
        sFlagsCreatedForTesting = new HashMap<>();
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.Flag$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Flag.sFlagsCreatedForTesting = hashMap;
            }
        });
    }
}
