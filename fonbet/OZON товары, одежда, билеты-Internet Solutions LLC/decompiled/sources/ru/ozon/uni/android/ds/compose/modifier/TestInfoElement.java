package ru.ozon.uni.android.ds.compose.modifier;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/ds/compose/modifier/TestInfoElement;", "LD1/c0;", "Lru/ozon/uni/android/ds/compose/modifier/TestInfoNode;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "locator", "<init>", "(Lru/ozon/uni/android/ds/compose/modifier/Locator;)V", "create", "()Lru/ozon/uni/android/ds/compose/modifier/TestInfoNode;", "node", "", "update", "(Lru/ozon/uni/android/ds/compose/modifier/TestInfoNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "getLocator", "()Lru/ozon/uni/android/ds/compose/modifier/Locator;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class TestInfoElement extends AbstractC2794c0<TestInfoNode> {

    @NotNull
    private final Locator locator;

    public TestInfoElement(@NotNull Locator locator) {
        Intrinsics.checkNotNullParameter(locator, "locator");
        this.locator = locator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TestInfoElement) && Intrinsics.d(this.locator, ((TestInfoElement) other).locator);
    }

    public int hashCode() {
        return this.locator.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestInfoElement(locator=" + this.locator + ")";
    }

    @Override // D1.AbstractC2794c0
    @NotNull
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public TestInfoNode getF41119a() {
        return new TestInfoNode(this.locator);
    }

    @Override // D1.AbstractC2794c0
    public void update(@NotNull TestInfoNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setTag(this.locator);
    }
}
