package com.socure.docv.capturesdk.common.upload;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.core.processor.model.Output;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: UploadStatusState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/ImageUploadResponse;", "", "uploadImage", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "faces", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;Lcom/socure/docv/capturesdk/core/processor/model/Output;Ljava/util/ArrayList;)V", "getFaces", "()Ljava/util/ArrayList;", "getOutput", "()Lcom/socure/docv/capturesdk/core/processor/model/Output;", "getUploadImage", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ImageUploadResponse {
    private final ArrayList<Face> faces;
    private final Output output;
    private final UploadImage uploadImage;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageUploadResponse copy$default(ImageUploadResponse imageUploadResponse, UploadImage uploadImage, Output output, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            uploadImage = imageUploadResponse.uploadImage;
        }
        if ((i & 2) != 0) {
            output = imageUploadResponse.output;
        }
        if ((i & 4) != 0) {
            arrayList = imageUploadResponse.faces;
        }
        return imageUploadResponse.copy(uploadImage, output, arrayList);
    }

    /* renamed from: component1, reason: from getter */
    public final UploadImage getUploadImage() {
        return this.uploadImage;
    }

    /* renamed from: component2, reason: from getter */
    public final Output getOutput() {
        return this.output;
    }

    public final ArrayList<Face> component3() {
        return this.faces;
    }

    public final ImageUploadResponse copy(UploadImage uploadImage, Output output, ArrayList<Face> faces) {
        Intrinsics.checkNotNullParameter(uploadImage, "uploadImage");
        Intrinsics.checkNotNullParameter(output, "output");
        return new ImageUploadResponse(uploadImage, output, faces);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUploadResponse)) {
            return false;
        }
        ImageUploadResponse imageUploadResponse = (ImageUploadResponse) other;
        return Intrinsics.areEqual(this.uploadImage, imageUploadResponse.uploadImage) && Intrinsics.areEqual(this.output, imageUploadResponse.output) && Intrinsics.areEqual(this.faces, imageUploadResponse.faces);
    }

    public int hashCode() {
        int hashCode = ((this.uploadImage.hashCode() * 31) + this.output.hashCode()) * 31;
        ArrayList<Face> arrayList = this.faces;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "ImageUploadResponse(uploadImage=" + this.uploadImage + ", output=" + this.output + ", faces=" + this.faces + ")";
    }

    public ImageUploadResponse(UploadImage uploadImage, Output output, ArrayList<Face> arrayList) {
        Intrinsics.checkNotNullParameter(uploadImage, "uploadImage");
        Intrinsics.checkNotNullParameter(output, "output");
        this.uploadImage = uploadImage;
        this.output = output;
        this.faces = arrayList;
    }

    public final UploadImage getUploadImage() {
        return this.uploadImage;
    }

    public final Output getOutput() {
        return this.output;
    }

    public final ArrayList<Face> getFaces() {
        return this.faces;
    }
}
