package io.ably.lib.types;

/* loaded from: classes9.dex */
public enum AnnotationAction {
    ANNOTATION_CREATE,
    ANNOTATION_DELETE;

    static AnnotationAction tryFindByOrdinal(int i) {
        if (values().length <= i) {
            return null;
        }
        return values()[i];
    }
}
