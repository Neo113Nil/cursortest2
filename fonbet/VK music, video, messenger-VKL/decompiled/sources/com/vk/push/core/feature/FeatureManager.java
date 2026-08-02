package com.vk.push.core.feature;

import com.vk.push.core.feature.Feature;
import xsna.spj;

/* compiled from: FeatureManager.kt */
/* loaded from: classes.dex */
public interface FeatureManager {
    Object getFeatureValue(Feature.BooleanFeature booleanFeature, spj<? super Boolean> spjVar);

    Object getFeatureValue(Feature.IntFeature intFeature, spj<? super Integer> spjVar);

    Object getFeatureValue(Feature.StringFeature stringFeature, spj<? super String> spjVar);

    String getSegments();
}
