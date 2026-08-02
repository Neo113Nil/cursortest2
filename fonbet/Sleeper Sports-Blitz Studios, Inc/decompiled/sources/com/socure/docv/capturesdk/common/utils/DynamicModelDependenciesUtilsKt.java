package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.config.model.ModelConfig;
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicModelDependenciesUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u0000\u001a\u00020\u0001*2\u0012\u0004\u0012\u00020\u0003\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00040\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006\u001aJ\u0010\u0000\u001a\u00020\u0001*2\u0012\u0004\u0012\u00020\u0003\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00040\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007\u001aB\u0010\f\u001a\u00020\u0007*2\u0012\u0004\u0012\u00020\u0003\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00040\u00022\u0006\u0010\t\u001a\u00020\u0003*j\u0010\r\"2\u0012\u0004\u0012\u00020\u0003\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00040\u000222\u0012\u0004\u0012\u00020\u0003\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00040\u0002¨\u0006\u000e"}, d2 = {"cache", "", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "type", "model", "confidence", "getConfidence", "DynamicModelDependencies", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DynamicModelDependenciesUtilsKt {
    public static final void cache(Map<ModelConfig.Type, ? extends Triple<? extends Cache<Model>, ? extends Cache<Float>, ? extends Provider<Float>>> map, ModelConfig.Type type, float f) {
        Cache<Float> second;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Triple<? extends Cache<Model>, ? extends Cache<Float>, ? extends Provider<Float>> triple = map.get(type);
        if (triple == null || (second = triple.getSecond()) == null) {
            return;
        }
        second.set(Float.valueOf(f));
    }

    public static final void cache(Map<ModelConfig.Type, ? extends Triple<? extends Cache<Model>, ? extends Cache<Float>, ? extends Provider<Float>>> map, ModelConfig.Type type, Model model) {
        Cache<Model> first;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(model, "model");
        Triple<? extends Cache<Model>, ? extends Cache<Float>, ? extends Provider<Float>> triple = map.get(type);
        if (triple == null || (first = triple.getFirst()) == null) {
            return;
        }
        first.set(model);
    }

    public static final float getConfidence(Map<ModelConfig.Type, ? extends Triple<? extends Cache<Model>, ? extends Cache<Float>, ? extends Provider<Float>>> map, ModelConfig.Type type) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return ((Number) ((Provider) ((Triple) MapsKt.getValue(map, type)).getThird()).get()).floatValue();
    }
}
