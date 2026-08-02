package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredDocViewModelExt.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b*\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"CAPTURE", "", "UPLOAD", "supportedFileTypes", "", "getSupportedFileTypes", "()Ljava/util/Map;", "toMimeTypes", "", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;)[Ljava/lang/String;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;Ljava/util/Map;)[Ljava/lang/String;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocViewModelExtKt {
    public static final String CAPTURE = "capture";
    public static final String UPLOAD = "upload";
    private static final Map<String, String> supportedFileTypes = MapsKt.mapOf(TuplesKt.to(".pdf", "application/pdf"), TuplesKt.to(".jpg", "image/jpeg"), TuplesKt.to(".jpeg", "image/jpeg"), TuplesKt.to(".png", MimeTypes.IMAGE_PNG));

    public static final Map<String, String> getSupportedFileTypes() {
        return supportedFileTypes;
    }

    public static final String[] toMimeTypes(IUnstructuredDocUploadViewModel.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        return toMimeTypes(state, supportedFileTypes);
    }

    public static final String[] toMimeTypes(IUnstructuredDocUploadViewModel.State state, Map<String, String> supportedFileTypes2) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        Intrinsics.checkNotNullParameter(supportedFileTypes2, "supportedFileTypes");
        List<String> uploadFileTypes = state.getUploadFileTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = uploadFileTypes.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String str = supportedFileTypes2.get(lowerCase);
            if (str != null) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) CollectionsKt.distinct(arrayList).toArray(new String[0]);
        if (strArr.length == 0) {
            return null;
        }
        return strArr;
    }
}
