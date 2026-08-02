package com.socure.docv.capturesdk.feature.consent.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.network.model.stepup.Content;
import com.socure.docv.capturesdk.models.BodyComponentModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentViewModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\u0019R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel;", "Landroidx/lifecycle/ViewModel;", "shim", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentShim;", "model", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "(Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentShim;Lcom/socure/docv/capturesdk/models/ConsentModuleModel;)V", "isAllSelected", "", "()Z", "onConsentPosted", "Landroidx/lifecycle/MutableLiveData;", "getOnConsentPosted", "()Landroidx/lifecycle/MutableLiveData;", "onError", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error;", "getOnError", "selected", "", "", "selectedIds", "", "getSelectedIds", "()Ljava/util/List;", "onAcceptClick", "", "onCheckboxClick", "componentId", "isChecked", "onDeclineClick", "Error", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentViewModel extends ViewModel {
    private final ConsentModuleModel model;
    private final MutableLiveData<Boolean> onConsentPosted;
    private final MutableLiveData<Error> onError;
    private final Map<String, Boolean> selected;
    private final ConsentShim shim;

    public ConsentViewModel(ConsentShim shim, ConsentModuleModel model) {
        Intrinsics.checkNotNullParameter(shim, "shim");
        Intrinsics.checkNotNullParameter(model, "model");
        this.shim = shim;
        this.model = model;
        this.onConsentPosted = new MutableLiveData<>();
        this.onError = new MutableLiveData<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<BodyComponentModel> bodyComponents = model.getBodyComponents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : bodyComponents) {
            BodyComponentModel bodyComponentModel = (BodyComponentModel) obj;
            if (Intrinsics.areEqual((Object) bodyComponentModel.getMandatory(), (Object) true) && Intrinsics.areEqual(bodyComponentModel.getType(), Content.CHECKBOX.getLabel())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = TuplesKt.to(((BodyComponentModel) it.next()).getId(), false);
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        linkedHashMap.putAll(MapsKt.toMap(arrayList2));
        this.selected = linkedHashMap;
    }

    public final MutableLiveData<Boolean> getOnConsentPosted() {
        return this.onConsentPosted;
    }

    public final MutableLiveData<Error> getOnError() {
        return this.onError;
    }

    public final List<String> getSelectedIds() {
        Map<String, Boolean> map = this.selected;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }

    public final boolean isAllSelected() {
        List<BodyComponentModel> bodyComponents = this.model.getBodyComponents();
        if ((bodyComponents instanceof Collection) && bodyComponents.isEmpty()) {
            return true;
        }
        for (BodyComponentModel bodyComponentModel : bodyComponents) {
            if (Intrinsics.areEqual((Object) bodyComponentModel.getMandatory(), (Object) true) && !Intrinsics.areEqual((Object) this.selected.get(bodyComponentModel.getId()), (Object) true)) {
                return false;
            }
        }
        return true;
    }

    public final void onCheckboxClick(String componentId, boolean isChecked) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.selected.put(componentId, Boolean.valueOf(isChecked));
    }

    public final void onAcceptClick() {
        this.shim.onFinished(true);
    }

    public final void onDeclineClick() {
        this.shim.onFinished(false);
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error;", "", "()V", "FailedToPostConsent", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error$FailedToPostConsent;", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error$Unknown;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error {
        public static final int $stable = 0;

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error$Unknown;", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error;", "error", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;)V", "getError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Unknown extends Error {
            public static final int $stable = 0;
            private final SocureDocVError error;

            public static /* synthetic */ Unknown copy$default(Unknown unknown, SocureDocVError socureDocVError, int i, Object obj) {
                if ((i & 1) != 0) {
                    socureDocVError = unknown.error;
                }
                return unknown.copy(socureDocVError);
            }

            /* renamed from: component1, reason: from getter */
            public final SocureDocVError getError() {
                return this.error;
            }

            public final Unknown copy(SocureDocVError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Unknown(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && this.error == ((Unknown) other).error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Unknown(error=" + this.error + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(SocureDocVError error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final SocureDocVError getError() {
                return this.error;
            }
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error$FailedToPostConsent;", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel$Error;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToPostConsent extends Error {
            public static final int $stable = 0;
            public static final FailedToPostConsent INSTANCE = new FailedToPostConsent();

            private FailedToPostConsent() {
                super(null);
            }
        }
    }
}
