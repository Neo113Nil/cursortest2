package com.vk.id.network;

import Sc.r;
import Sc.s;
import We.InterfaceC4865g;
import We.L;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "LWe/g;", "Lkotlin/Function1;", "LWe/L;", "LSc/r;", "responseMapping", "Lcom/vk/id/network/InternalVKIDCall;", "internalVKIDWrapToVKIDCall", "(LWe/g;Lkotlin/jvm/functions/Function1;)Lcom/vk/id/network/InternalVKIDCall;", "network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDCallKt {
    @NotNull
    public static final <T> InternalVKIDCall<T> internalVKIDWrapToVKIDCall(@NotNull final InterfaceC4865g interfaceC4865g, @NotNull final Function1<? super L, ? extends r<? extends T>> responseMapping) {
        Intrinsics.checkNotNullParameter(interfaceC4865g, "<this>");
        Intrinsics.checkNotNullParameter(responseMapping, "responseMapping");
        return new InternalVKIDCall<T>() { // from class: com.vk.id.network.InternalVKIDCallKt$internalVKIDWrapToVKIDCall$1
            @Override // com.vk.id.network.InternalVKIDCall
            /* renamed from: execute-d1pmJ48 */
            public Object mo52executed1pmJ48() {
                try {
                    return responseMapping.invoke(InterfaceC4865g.this.execute()).getF26106a();
                } catch (IOException e11) {
                    r.Companion companion = r.INSTANCE;
                    return s.a(e11);
                } catch (JSONException e12) {
                    r.Companion companion2 = r.INSTANCE;
                    return s.a(e12);
                }
            }
        };
    }
}
