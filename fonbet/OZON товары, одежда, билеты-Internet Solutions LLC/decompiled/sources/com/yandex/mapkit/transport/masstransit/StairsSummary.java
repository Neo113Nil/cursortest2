package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class StairsSummary implements Serializable {
    private int numberOfStairs;
    private int numberOfStairsWithRamp;

    public StairsSummary(int i11, int i12) {
        this.numberOfStairs = i11;
        this.numberOfStairsWithRamp = i12;
    }

    public int getNumberOfStairs() {
        return this.numberOfStairs;
    }

    public int getNumberOfStairsWithRamp() {
        return this.numberOfStairsWithRamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.numberOfStairs = archive.add(this.numberOfStairs);
        this.numberOfStairsWithRamp = archive.add(this.numberOfStairsWithRamp);
    }

    public StairsSummary() {
    }
}
