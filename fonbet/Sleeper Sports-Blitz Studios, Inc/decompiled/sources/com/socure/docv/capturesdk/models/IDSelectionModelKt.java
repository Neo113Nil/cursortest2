package com.socure.docv.capturesdk.models;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IDSelectionModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"licenseButton", "Lcom/socure/docv/capturesdk/models/IDSelectionModel$Button;", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "passportButton", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IDSelectionModelKt {
    public static final IDSelectionModel.Button licenseButton(IDSelectionModel iDSelectionModel) {
        Object obj;
        Intrinsics.checkNotNullParameter(iDSelectionModel, "<this>");
        Iterator<T> it = iDSelectionModel.getButtons().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((IDSelectionModel.Button) obj).getValue(), ApiConstant.DOCUMENT_TYPE_LICENSE)) {
                break;
            }
        }
        return (IDSelectionModel.Button) obj;
    }

    public static final IDSelectionModel.Button passportButton(IDSelectionModel iDSelectionModel) {
        Object obj;
        Intrinsics.checkNotNullParameter(iDSelectionModel, "<this>");
        Iterator<T> it = iDSelectionModel.getButtons().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((IDSelectionModel.Button) obj).getValue(), "passport")) {
                break;
            }
        }
        return (IDSelectionModel.Button) obj;
    }
}
