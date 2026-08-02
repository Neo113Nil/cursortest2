package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import B4.V;
import Pk0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarMetrics;", "", "", "left", "right", "centerY", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getLeft", "()F", "getRight", "getCenterY", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarMetrics {
    private final float centerY;
    private final float left;
    private final float right;

    public SlimTimeBarMetrics(float f7, float f11, float f12) {
        this.left = f7;
        this.right = f11;
        this.centerY = f12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarMetrics)) {
            return false;
        }
        SlimTimeBarMetrics slimTimeBarMetrics = (SlimTimeBarMetrics) other;
        return Float.compare(this.left, slimTimeBarMetrics.left) == 0 && Float.compare(this.right, slimTimeBarMetrics.right) == 0 && Float.compare(this.centerY, slimTimeBarMetrics.centerY) == 0;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public int hashCode() {
        return Float.hashCode(this.centerY) + b.a(this.right, Float.hashCode(this.left) * 31, 31);
    }

    @NotNull
    public String toString() {
        float f7 = this.left;
        float f11 = this.right;
        float f12 = this.centerY;
        StringBuilder sb2 = new StringBuilder("SlimTimeBarMetrics(left=");
        sb2.append(f7);
        sb2.append(", right=");
        sb2.append(f11);
        sb2.append(", centerY=");
        return V.b(f12, ")", sb2);
    }
}
