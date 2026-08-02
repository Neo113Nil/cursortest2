package com.orkestapay.orkestapay.core.clicktopay;

import android.webkit.JavascriptInterface;
import androidx.activity.ComponentActivity;
import com.orkestapay.orkestapay.client.enums.ClickToPayEvent;
import com.orkestapay.orkestapay.client.model.PaymentMethodResponse;
import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/orkestapay/orkestapay/core/clicktopay/JsInterface;", "", "callback", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "activity", "Landroidx/activity/ComponentActivity;", "(Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;Landroidx/activity/ComponentActivity;)V", "getActivity", "()Landroidx/activity/ComponentActivity;", "receiveMessage", "", EventKeys.VALUE_KEY, "", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewActivity.kt\ncom/orkestapay/orkestapay/core/clicktopay/JsInterface\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,264:1\n96#2:265\n*S KotlinDebug\n*F\n+ 1 WebviewActivity.kt\ncom/orkestapay/orkestapay/core/clicktopay/JsInterface\n*L\n245#1:265\n*E\n"})
/* loaded from: classes3.dex */
public final class JsInterface {

    @NotNull
    private final ComponentActivity activity;

    @NotNull
    private final ClickToPayListener callback;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickToPayEvent.values().length];
            try {
                iArr[ClickToPayEvent.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickToPayEvent.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClickToPayEvent.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JsInterface(@NotNull ClickToPayListener callback, @NotNull ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.callback = callback;
        this.activity = activity;
    }

    @NotNull
    public final ComponentActivity getActivity() {
        return this.activity;
    }

    @JavascriptInterface
    public final void receiveMessage(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            JSONObject jSONObject = new JSONObject(value);
            Object obj = jSONObject.get("status");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[ClickToPayEvent.valueOf(str).ordinal()];
            if (i10 == 1) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(EventKeys.DATA);
                AbstractC4212b b10 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.core.clicktopay.JsInterface$receiveMessage$json$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                        invoke2(c4214d);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C4214d Json) {
                        Intrinsics.checkNotNullParameter(Json, "$this$Json");
                        Json.e(true);
                    }
                }, 1, null);
                String jSONObject3 = jSONObject2.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
                b10.a();
                this.callback.onSuccess((PaymentMethodResponse) b10.d(PaymentMethodResponse.INSTANCE.serializer(), jSONObject3));
                this.activity.finish();
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.callback.onClosed();
                this.activity.finish();
                return;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("error");
            ClickToPayListener clickToPayListener = this.callback;
            String jSONObject5 = jSONObject4.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
            clickToPayListener.onError(jSONObject5);
        } catch (Exception e10) {
            e10.toString();
        }
    }
}
