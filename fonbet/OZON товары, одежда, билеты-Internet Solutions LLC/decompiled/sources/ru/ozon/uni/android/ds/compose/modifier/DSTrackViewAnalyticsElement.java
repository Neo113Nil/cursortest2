package ru.ozon.uni.android.ds.compose.modifier;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/ds/compose/modifier/DSTrackViewAnalyticsElement;", "LD1/c0;", "Lru/ozon/uni/android/ds/compose/modifier/DSTrackViewAnalyticsNode;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewAnalyticsInfo", "<init>", "(Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "create", "()Lru/ozon/uni/android/ds/compose/modifier/DSTrackViewAnalyticsNode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "", "update", "(Lru/ozon/uni/android/ds/compose/modifier/DSTrackViewAnalyticsNode;)V", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewAnalyticsInfo", "()Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DSTrackViewAnalyticsElement extends AbstractC2794c0<DSTrackViewAnalyticsNode> {

    @NotNull
    private final TokenizedTrackingInfo viewAnalyticsInfo;

    public DSTrackViewAnalyticsElement(@NotNull TokenizedTrackingInfo viewAnalyticsInfo) {
        Intrinsics.checkNotNullParameter(viewAnalyticsInfo, "viewAnalyticsInfo");
        this.viewAnalyticsInfo = viewAnalyticsInfo;
    }

    public boolean equals(Object other) {
        DSTrackViewAnalyticsElement dSTrackViewAnalyticsElement = other instanceof DSTrackViewAnalyticsElement ? (DSTrackViewAnalyticsElement) other : null;
        if (dSTrackViewAnalyticsElement == null) {
            return false;
        }
        return Intrinsics.d(this.viewAnalyticsInfo, dSTrackViewAnalyticsElement.viewAnalyticsInfo);
    }

    public int hashCode() {
        return this.viewAnalyticsInfo.hashCode();
    }

    @Override // D1.AbstractC2794c0
    @NotNull
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public DSTrackViewAnalyticsNode getF41119a() {
        return new DSTrackViewAnalyticsNode(this.viewAnalyticsInfo);
    }

    @Override // D1.AbstractC2794c0
    public void update(@NotNull DSTrackViewAnalyticsNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setViewAnalyticsInfo(this.viewAnalyticsInfo);
    }
}
