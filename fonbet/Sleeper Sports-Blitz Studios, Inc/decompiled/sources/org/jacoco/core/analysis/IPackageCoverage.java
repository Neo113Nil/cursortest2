package org.jacoco.core.analysis;

import java.util.Collection;

/* loaded from: classes10.dex */
public interface IPackageCoverage extends ICoverageNode {
    Collection<IClassCoverage> getClasses();

    Collection<ISourceFileCoverage> getSourceFiles();
}
