package org.jacoco.core.analysis;

/* loaded from: classes10.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
