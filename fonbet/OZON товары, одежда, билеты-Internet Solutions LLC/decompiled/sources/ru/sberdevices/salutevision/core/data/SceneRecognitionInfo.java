package ru.sberdevices.salutevision.core.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/sberdevices/salutevision/core/data/SceneRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "documents", "", "Lru/sberdevices/salutevision/core/data/DocumentType;", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SceneRecognitionInfo implements SaluteVisionRecognition.Info {

    @NotNull
    private final List<DocumentType> documents;

    /* JADX WARN: Multi-variable type inference failed */
    public SceneRecognitionInfo(@NotNull List<? extends DocumentType> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.documents = documents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SceneRecognitionInfo copy$default(SceneRecognitionInfo sceneRecognitionInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sceneRecognitionInfo.documents;
        }
        return sceneRecognitionInfo.copy(list);
    }

    @NotNull
    public final List<DocumentType> component1() {
        return this.documents;
    }

    @NotNull
    public final SceneRecognitionInfo copy(@NotNull List<? extends DocumentType> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new SceneRecognitionInfo(documents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SceneRecognitionInfo) && Intrinsics.d(this.documents, ((SceneRecognitionInfo) other).documents);
    }

    @NotNull
    public final List<DocumentType> getDocuments() {
        return this.documents;
    }

    public int hashCode() {
        return this.documents.hashCode();
    }

    @NotNull
    public String toString() {
        return "SceneRecognitionInfo(documents=" + this.documents + ')';
    }
}
