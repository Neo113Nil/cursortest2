package com.socure.docv.capturesdk.models;

import com.facebook.appevents.AppEventsConstants;
import com.socure.docv.capturesdk.common.network.model.stepup.Content;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentModuleModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"selectedArray", "", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "selectedIds", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentModuleModelKt {
    public static final String selectedArray(ConsentModuleModel consentModuleModel, List<String> selectedIds) {
        Intrinsics.checkNotNullParameter(consentModuleModel, "<this>");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        StringBuilder sb = new StringBuilder();
        List<BodyComponentModel> bodyComponents = consentModuleModel.getBodyComponents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : bodyComponents) {
            if (Intrinsics.areEqual(((BodyComponentModel) obj).getType(), Content.CHECKBOX.getLabel())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(selectedIds.contains(((BodyComponentModel) it.next()).getId()) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
