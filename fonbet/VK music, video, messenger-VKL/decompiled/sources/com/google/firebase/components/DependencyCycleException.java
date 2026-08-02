package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.i8i;

/* loaded from: classes13.dex */
public class DependencyCycleException extends DependencyException {
    private final List<i8i<?>> componentsInCycle;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.componentsInCycle = arrayList;
    }
}
