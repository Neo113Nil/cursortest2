package com.socure.docv.capturesdk.common.view;

import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.view.model.BsCallbackType;
import kotlin.Metadata;

/* compiled from: ActionCallback.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/ActionCallback;", "", ViewProps.ON_CLICK, "", "bsCallbackType", "Lcom/socure/docv/capturesdk/common/view/model/BsCallbackType;", "cause", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ActionCallback {
    void onClick(BsCallbackType bsCallbackType, String cause);

    /* compiled from: ActionCallback.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onClick$default(ActionCallback actionCallback, BsCallbackType bsCallbackType, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            actionCallback.onClick(bsCallbackType, str);
        }
    }
}
