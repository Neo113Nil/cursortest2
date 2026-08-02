package com.vk.superapp.vkpay.checkout.api.dto.response;

import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.rl3;
import xsna.xou0;
import xsna.zrp;

/* compiled from: TransactionStatusResponse.kt */
/* loaded from: classes6.dex */
public final class TransactionStatusResponse extends VkCheckoutResponse {
    public final VkCheckoutTransactionStatus b;
    public final String c;
    public final xou0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactionStatusResponse.kt */
    public static final class VkCheckoutTransactionStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkCheckoutTransactionStatus[] $VALUES;
        public static final VkCheckoutTransactionStatus CANCELLED;
        public static final a Companion;
        public static final VkCheckoutTransactionStatus DONE;
        public static final VkCheckoutTransactionStatus ENROLLED_3DS;
        public static final VkCheckoutTransactionStatus FAILED;
        public static final VkCheckoutTransactionStatus PROCESSING;
        private static final Set<VkCheckoutTransactionStatus> TERMINAL_STATUS_STATES;

        /* compiled from: TransactionStatusResponse.kt */
        public static final class a {
            public static VkCheckoutTransactionStatus a(VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus, String str) {
                if (str.equals("3DS_ENROLLED")) {
                    return VkCheckoutTransactionStatus.ENROLLED_3DS;
                }
                if (str.equals("PROCESSING")) {
                    return VkCheckoutTransactionStatus.PROCESSING;
                }
                VkCheckoutTransactionStatus[] values = VkCheckoutTransactionStatus.values();
                ArrayList arrayList = new ArrayList(values.length);
                for (VkCheckoutTransactionStatus vkCheckoutTransactionStatus : values) {
                    arrayList.add(vkCheckoutTransactionStatus.name());
                }
                return arrayList.contains(str.toUpperCase(Locale.ROOT)) ? VkCheckoutTransactionStatus.valueOf(str) : vkCheckoutResponseStatus == VkCheckoutResponse.VkCheckoutResponseStatus.OK ? VkCheckoutTransactionStatus.PROCESSING : VkCheckoutTransactionStatus.FAILED;
            }
        }

        static {
            VkCheckoutTransactionStatus vkCheckoutTransactionStatus = new VkCheckoutTransactionStatus("PROCESSING", 0);
            PROCESSING = vkCheckoutTransactionStatus;
            VkCheckoutTransactionStatus vkCheckoutTransactionStatus2 = new VkCheckoutTransactionStatus("DONE", 1);
            DONE = vkCheckoutTransactionStatus2;
            VkCheckoutTransactionStatus vkCheckoutTransactionStatus3 = new VkCheckoutTransactionStatus("CANCELLED", 2);
            CANCELLED = vkCheckoutTransactionStatus3;
            VkCheckoutTransactionStatus vkCheckoutTransactionStatus4 = new VkCheckoutTransactionStatus(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = vkCheckoutTransactionStatus4;
            VkCheckoutTransactionStatus vkCheckoutTransactionStatus5 = new VkCheckoutTransactionStatus("ENROLLED_3DS", 4);
            ENROLLED_3DS = vkCheckoutTransactionStatus5;
            VkCheckoutTransactionStatus[] vkCheckoutTransactionStatusArr = {vkCheckoutTransactionStatus, vkCheckoutTransactionStatus2, vkCheckoutTransactionStatus3, vkCheckoutTransactionStatus4, vkCheckoutTransactionStatus5};
            $VALUES = vkCheckoutTransactionStatusArr;
            $ENTRIES = new asp(vkCheckoutTransactionStatusArr);
            Companion = new a();
            TERMINAL_STATUS_STATES = rl3.y0(new VkCheckoutTransactionStatus[]{vkCheckoutTransactionStatus2, vkCheckoutTransactionStatus4, vkCheckoutTransactionStatus3});
        }

        public VkCheckoutTransactionStatus() {
            throw null;
        }

        public static VkCheckoutTransactionStatus valueOf(String str) {
            return (VkCheckoutTransactionStatus) Enum.valueOf(VkCheckoutTransactionStatus.class, str);
        }

        public static VkCheckoutTransactionStatus[] values() {
            return (VkCheckoutTransactionStatus[]) $VALUES.clone();
        }

        public final boolean h() {
            return TERMINAL_STATUS_STATES.contains(this);
        }
    }

    public TransactionStatusResponse(JSONObject jSONObject) {
        super(jSONObject);
        VkCheckoutTransactionStatus.a aVar = VkCheckoutTransactionStatus.Companion;
        String optString = jSONObject.optString("status");
        VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus = this.a;
        aVar.getClass();
        this.b = VkCheckoutTransactionStatus.a.a(vkCheckoutResponseStatus, optString);
        this.c = jSONObject.optString("acs_url");
        JSONObject optJSONObject = jSONObject.optJSONObject("data3ds");
        this.d = optJSONObject != null ? new xou0(optJSONObject.optString("MD"), optJSONObject.optString("PaReq"), optJSONObject.optString("TermUrl")) : null;
    }
}
