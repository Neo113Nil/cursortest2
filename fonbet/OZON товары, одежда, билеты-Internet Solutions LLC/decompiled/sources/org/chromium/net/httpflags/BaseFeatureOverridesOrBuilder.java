package org.chromium.net.httpflags;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.Map;
import org.chromium.net.httpflags.BaseFeatureOverrides;

/* loaded from: classes6.dex */
public interface BaseFeatureOverridesOrBuilder extends A {
    boolean containsFeatureStates(String str);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStates();

    int getFeatureStatesCount();

    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStatesMap();

    BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(String str, BaseFeatureOverrides.FeatureState featureState);

    BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(String str);

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
