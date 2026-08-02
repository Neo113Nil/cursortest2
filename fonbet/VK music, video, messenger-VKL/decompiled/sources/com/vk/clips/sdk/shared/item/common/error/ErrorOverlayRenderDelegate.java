package com.vk.clips.sdk.shared.item.common.error;

import com.vk.clips.sdk.shared.item.common.error.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.asp;
import xsna.gzs;
import xsna.izs;
import xsna.krh;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.zrp;

/* compiled from: ErrorOverlayRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class ErrorOverlayRenderDelegate {
    public final VkPlaceholder a;
    public final izs<ErrorOverlayAction, s3q0> b;
    public b.C0670b c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorOverlayRenderDelegate.kt */
    public static final class ErrorOverlayAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorOverlayAction[] $VALUES;
        public static final ErrorOverlayAction ButtonClick;

        static {
            ErrorOverlayAction errorOverlayAction = new ErrorOverlayAction("ButtonClick", 0);
            ButtonClick = errorOverlayAction;
            ErrorOverlayAction[] errorOverlayActionArr = {errorOverlayAction};
            $VALUES = errorOverlayActionArr;
            $ENTRIES = new asp(errorOverlayActionArr);
        }

        public ErrorOverlayAction() {
            throw null;
        }

        public static ErrorOverlayAction valueOf(String str) {
            return (ErrorOverlayAction) Enum.valueOf(ErrorOverlayAction.class, str);
        }

        public static ErrorOverlayAction[] values() {
            return (ErrorOverlayAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorOverlayRenderDelegate(VkPlaceholder vkPlaceholder, izs<? super ErrorOverlayAction, s3q0> izsVar) {
        this.a = vkPlaceholder;
        this.b = izsVar;
    }

    public final void a(b bVar) {
        if ((bVar instanceof b.C0670b) && !bVar.equals(this.c)) {
            b.C0670b c0670b = (b.C0670b) bVar;
            VkPlaceholder.b bVar2 = new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, c0670b.b)), null, 2);
            VkPlaceholder vkPlaceholder = this.a;
            vkPlaceholder.setMiddle(bVar2);
            vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_common_retry), (gzs) new krh(this, 13), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Primary, VkButton.Appearance.Overlay, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), null, null, null, 8));
            this.c = c0670b;
        }
    }
}
