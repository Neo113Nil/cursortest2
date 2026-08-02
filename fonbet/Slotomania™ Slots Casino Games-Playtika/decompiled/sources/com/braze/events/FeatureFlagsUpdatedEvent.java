package com.braze.events;

import com.braze.models.FeatureFlag;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/braze/events/FeatureFlagsUpdatedEvent;", "", "featureFlags", "", "Lcom/braze/models/FeatureFlag;", "(Ljava/util/List;)V", "getFeatureFlags", "()Ljava/util/List;", "flagCount", "", "getFlagCount", "()I", "isEmpty", "", "()Z", "getFeatureFlag", "id", "", "toString", k.M, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureFlagsUpdatedEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<FeatureFlag> featureFlags;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braze/events/FeatureFlagsUpdatedEvent$Companion;", "", "()V", "emptyUpdate", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "getEmptyUpdate$annotations", "getEmptyUpdate", "()Lcom/braze/events/FeatureFlagsUpdatedEvent;", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final FeatureFlagsUpdatedEvent getEmptyUpdate() {
            return new FeatureFlagsUpdatedEvent(CollectionsKt.emptyList());
        }
    }

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
    }

    public static final FeatureFlagsUpdatedEvent getEmptyUpdate() {
        return INSTANCE.getEmptyUpdate();
    }

    public final FeatureFlag getFeatureFlag(String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.featureFlags.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), id)) {
                break;
            }
        }
        FeatureFlag featureFlag = (FeatureFlag) obj;
        return featureFlag == null ? FeatureFlag.INSTANCE.a(id) : featureFlag;
    }

    public final List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public final int getFlagCount() {
        return this.featureFlags.size();
    }

    public final boolean isEmpty() {
        return this.featureFlags.isEmpty();
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.featureFlags.size() + AbstractJsonLexerKt.END_OBJ;
    }
}
