package com.blaze.blazesdk.interactions;

import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import defpackage.c2g;
import defpackage.h3e;
import defpackage.rq3;
import defpackage.vae;
import defpackage.yy1;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/interactions/q;", "", "", "interactionId", "interactionType", "interactionUserResponse", "Lc2g;", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q {
    @h3e("Interactions/Response/{type}/{id}")
    @AuthNeeded
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    Object a(@NotNull @vae("id") String str, @NotNull @vae("type") String str2, @yy1 @NotNull String str3, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
