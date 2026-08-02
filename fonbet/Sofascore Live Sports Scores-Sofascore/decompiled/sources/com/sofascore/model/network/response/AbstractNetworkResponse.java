package com.sofascore.model.network.response;

import defpackage.a0f;
import defpackage.c0;
import defpackage.duf;
import defpackage.joa;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b'\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Ljava/io/Serializable;", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "<init>", "(Lcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/network/response/AbstractNetworkResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/sofascore/model/network/response/HeadResponse;", "getHead", "()Lcom/sofascore/model/network/response/HeadResponse;", "getError", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractNetworkResponse implements Serializable {

    @Nullable
    private final HeadResponse error;

    @Nullable
    private final HeadResponse head;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa $cachedSerializer$delegate = ypa.a(ysa.b, new c0(7));

    public /* synthetic */ AbstractNetworkResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.head = null;
        } else {
            this.head = headResponse;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = headResponse2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        return new a0f(duf.a.getOrCreateKotlinClass(AbstractNetworkResponse.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(AbstractNetworkResponse self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.head != null) {
            output.h(serialDesc, 0, HeadResponse$$serializer.INSTANCE, self.head);
        }
        if (!output.o(serialDesc) && self.error == null) {
            return;
        }
        output.h(serialDesc, 1, HeadResponse$$serializer.INSTANCE, self.error);
    }

    @Nullable
    public final HeadResponse getError() {
        return this.error;
    }

    @Nullable
    public final HeadResponse getHead() {
        return this.head;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/AbstractNetworkResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AbstractNetworkResponse.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractNetworkResponse() {
        this((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public AbstractNetworkResponse(@Nullable HeadResponse headResponse, @Nullable HeadResponse headResponse2) {
        this.head = headResponse;
        this.error = headResponse2;
    }

    public /* synthetic */ AbstractNetworkResponse(HeadResponse headResponse, HeadResponse headResponse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : headResponse, (i & 2) != 0 ? null : headResponse2);
    }
}
