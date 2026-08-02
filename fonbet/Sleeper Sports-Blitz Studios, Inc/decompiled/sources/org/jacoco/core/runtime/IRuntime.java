package org.jacoco.core.runtime;

/* loaded from: classes10.dex */
public interface IRuntime extends IExecutionDataAccessorGenerator {
    void shutdown();

    void startup(RuntimeData runtimeData) throws Exception;
}
