package com.socure.docv.capturesdk.core.extractor;

import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import kotlin.Metadata;

/* compiled from: IExtractor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/IReader;", "", "onRead", "", "data", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "found", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IReader {
    void onRead(BaseExtractedData data, boolean found);

    /* compiled from: IExtractor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onRead$default(IReader iReader, BaseExtractedData baseExtractedData, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRead");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            iReader.onRead(baseExtractedData, z);
        }
    }
}
