package com.yandex.runtime.config;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ExperimentData implements Serializable {
    private int testId;
    private int userBucket;
    private int userGroup;

    public ExperimentData(int i11, int i12, int i13) {
        this.testId = i11;
        this.userGroup = i12;
        this.userBucket = i13;
    }

    public int getTestId() {
        return this.testId;
    }

    public int getUserBucket() {
        return this.userBucket;
    }

    public int getUserGroup() {
        return this.userGroup;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.testId = archive.add(this.testId);
        this.userGroup = archive.add(this.userGroup);
        this.userBucket = archive.add(this.userBucket);
    }

    public ExperimentData() {
    }
}
