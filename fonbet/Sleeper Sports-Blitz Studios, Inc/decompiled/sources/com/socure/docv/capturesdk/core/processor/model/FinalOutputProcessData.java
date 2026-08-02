package com.socure.docv.capturesdk.core.processor.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scan.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010 \u001a\u00020!J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003JQ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001d¨\u0006."}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/FinalOutputProcessData;", "", "data", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", OptionalModuleUtils.FACE, "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "found", "", "faceFound", "duration", "", "(Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;Ljava/util/ArrayList;ZZJ)V", "getData", "()Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "setData", "(Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;)V", "getDuration", "()J", "setDuration", "(J)V", "getFace", "()Ljava/util/ArrayList;", "setFace", "(Ljava/util/ArrayList;)V", "getFaceFound", "()Z", "setFaceFound", "(Z)V", "getFound", "setFound", "clear", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FinalOutputProcessData {
    public static final int $stable = 8;
    private BaseExtractedData data;
    private long duration;
    private ArrayList<Face> face;
    private boolean faceFound;
    private boolean found;

    public FinalOutputProcessData() {
        this(null, null, false, false, 0L, 31, null);
    }

    public static /* synthetic */ FinalOutputProcessData copy$default(FinalOutputProcessData finalOutputProcessData, BaseExtractedData baseExtractedData, ArrayList arrayList, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            baseExtractedData = finalOutputProcessData.data;
        }
        if ((i & 2) != 0) {
            arrayList = finalOutputProcessData.face;
        }
        if ((i & 4) != 0) {
            z = finalOutputProcessData.found;
        }
        if ((i & 8) != 0) {
            z2 = finalOutputProcessData.faceFound;
        }
        if ((i & 16) != 0) {
            j = finalOutputProcessData.duration;
        }
        long j2 = j;
        return finalOutputProcessData.copy(baseExtractedData, arrayList, z, z2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final BaseExtractedData getData() {
        return this.data;
    }

    public final ArrayList<Face> component2() {
        return this.face;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFound() {
        return this.found;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFaceFound() {
        return this.faceFound;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final FinalOutputProcessData copy(BaseExtractedData data, ArrayList<Face> face, boolean found, boolean faceFound, long duration) {
        return new FinalOutputProcessData(data, face, found, faceFound, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalOutputProcessData)) {
            return false;
        }
        FinalOutputProcessData finalOutputProcessData = (FinalOutputProcessData) other;
        return Intrinsics.areEqual(this.data, finalOutputProcessData.data) && Intrinsics.areEqual(this.face, finalOutputProcessData.face) && this.found == finalOutputProcessData.found && this.faceFound == finalOutputProcessData.faceFound && this.duration == finalOutputProcessData.duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        BaseExtractedData baseExtractedData = this.data;
        int hashCode = (baseExtractedData == null ? 0 : baseExtractedData.hashCode()) * 31;
        ArrayList<Face> arrayList = this.face;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z = this.found;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.faceFound;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Long.hashCode(this.duration);
    }

    public String toString() {
        return "FinalOutputProcessData(data=" + this.data + ", face=" + this.face + ", found=" + this.found + ", faceFound=" + this.faceFound + ", duration=" + this.duration + ")";
    }

    public FinalOutputProcessData(BaseExtractedData baseExtractedData, ArrayList<Face> arrayList, boolean z, boolean z2, long j) {
        this.data = baseExtractedData;
        this.face = arrayList;
        this.found = z;
        this.faceFound = z2;
        this.duration = j;
    }

    public /* synthetic */ FinalOutputProcessData(BaseExtractedData baseExtractedData, ArrayList arrayList, boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseExtractedData, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? 0L : j);
    }

    public final BaseExtractedData getData() {
        return this.data;
    }

    public final void setData(BaseExtractedData baseExtractedData) {
        this.data = baseExtractedData;
    }

    public final ArrayList<Face> getFace() {
        return this.face;
    }

    public final void setFace(ArrayList<Face> arrayList) {
        this.face = arrayList;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final void setFound(boolean z) {
        this.found = z;
    }

    public final boolean getFaceFound() {
        return this.faceFound;
    }

    public final void setFaceFound(boolean z) {
        this.faceFound = z;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void clear() {
        this.data = null;
        this.face = null;
        this.found = false;
        this.faceFound = false;
    }
}
