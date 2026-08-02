package com.vk.id.group.subscription.compose.ui;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/SubscriberCountFormatter;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "decimalSeparator", "", "formatForDisplay", "(FC)Ljava/lang/String;", "", "subscriberCount", "format", "(I)Ljava/lang/String;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubscriberCountFormatter {

    @NotNull
    public static final SubscriberCountFormatter INSTANCE = new SubscriberCountFormatter();

    private SubscriberCountFormatter() {
    }

    private final String formatForDisplay(float value, char decimalSeparator) {
        int i11;
        int c11 = C6915b.c(value * 10);
        int i12 = c11 % 10;
        if (i12 == 0 || (i11 = c11 / 10) > 10) {
            return String.valueOf(c11 / 10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(decimalSeparator);
        sb2.append(i12);
        return sb2.toString();
    }

    @NotNull
    public final String format(int subscriberCount) {
        return subscriberCount < 1000 ? String.valueOf(subscriberCount) : subscriberCount < 1000000 ? U7.d.e(formatForDisplay(subscriberCount / 1000.0f, ','), "K") : U7.d.e(formatForDisplay(subscriberCount / 1000000.0f, '.'), "M");
    }
}
