package com.plaid.internal;

import com.plaid.internal.I2;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class G {
    public void a() {
    }

    public void a(@NotNull LinkEvent event, @NotNull I2.d options) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(options, "options");
    }

    public void a(@NotNull LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    public void a(@NotNull Channel$Message.SDKResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    public void a(@NotNull AbstractC3648h7 requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
    }
}
