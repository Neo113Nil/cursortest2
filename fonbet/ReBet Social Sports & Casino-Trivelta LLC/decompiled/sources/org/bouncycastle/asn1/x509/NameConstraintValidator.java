package org.bouncycastle.asn1.x509;

/* loaded from: classes5.dex */
public interface NameConstraintValidator {
    void addExcludedSubtree(GeneralSubtree generalSubtree);

    void checkExcluded(GeneralName generalName);

    void checkPermitted(GeneralName generalName);

    void intersectEmptyPermittedSubtree(int i10);

    void intersectPermittedSubtree(GeneralSubtree generalSubtree);

    void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr);
}
