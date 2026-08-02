package com.facebook.react.modules.fresco;

import A8.a;
import J7.a;
import android.util.Pair;
import com.facebook.imagepipeline.request.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\rJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R,\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lcom/facebook/react/modules/fresco/SystraceRequestListener;", "LJ7/a;", "<init>", "()V", "", "requestId", "producerName", "", "onProducerStart", "(Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "onProducerFinishWithSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "onProducerFinishWithFailure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "onProducerFinishWithCancellation", "eventName", "onProducerEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/b;", "request", "", "callerContext", "", "isPrefetch", "onRequestStart", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/Object;Ljava/lang/String;Z)V", "onRequestSuccess", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/String;Z)V", "throwable", "onRequestFailure", "(Lcom/facebook/imagepipeline/request/b;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "onRequestCancellation", "(Ljava/lang/String;)V", "requiresExtraMap", "(Ljava/lang/String;)Z", "", "currentId", "I", "", "Landroid/util/Pair;", "producerId", "Ljava/util/Map;", "requestsId", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystraceRequestListener extends a {
    private int currentId;

    @NotNull
    private final Map<String, Pair<Integer, String>> producerId = new LinkedHashMap();

    @NotNull
    private final Map<String, Pair<Integer, String>> requestsId = new LinkedHashMap();

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public void onProducerEvent(@NotNull String requestId, @NotNull String producerName, @NotNull String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (A8.a.j(0L)) {
            A8.a.n(0L, "FRESCO_PRODUCER_EVENT_" + StringsKt.replace$default(requestId, ':', '_', false, 4, (Object) null) + "_" + StringsKt.replace$default(producerName, ':', '_', false, 4, (Object) null) + "_" + StringsKt.replace$default(eventName, ':', '_', false, 4, (Object) null), a.EnumC0007a.f276b);
        }
    }

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithCancellation(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (A8.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithFailure(@NotNull String requestId, @NotNull String producerName, @NotNull Throwable t10, @Nullable Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t10, "t");
        if (A8.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public void onProducerFinishWithSuccess(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (A8.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public void onProducerStart(@NotNull String requestId, @NotNull String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (A8.a.j(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.currentId), "FRESCO_PRODUCER_" + StringsKt.replace$default(producerName, ':', '_', false, 4, (Object) null));
            Object second = create.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            A8.a.a(0L, (String) second, this.currentId);
            this.producerId.put(requestId, create);
            this.currentId++;
        }
    }

    @Override // J7.e
    public void onRequestCancellation(@NotNull String requestId) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (A8.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // J7.e
    public void onRequestFailure(@NotNull b request, @NotNull String requestId, @NotNull Throwable throwable, boolean isPrefetch) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (A8.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // J7.e
    public void onRequestStart(@NotNull b request, @NotNull Object callerContext, @NotNull String requestId, boolean isPrefetch) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (A8.a.j(0L)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String uri = request.getSourceUri().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            sb2.append(StringsKt.replace$default(uri, ':', '_', false, 4, (Object) null));
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.currentId), sb2.toString());
            Object second = create.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            A8.a.a(0L, (String) second, this.currentId);
            this.requestsId.put(requestId, create);
            this.currentId++;
        }
    }

    @Override // J7.e
    public void onRequestSuccess(@NotNull b request, @NotNull String requestId, boolean isPrefetch) {
        Pair<Integer, String> pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (A8.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            A8.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // J7.a, com.facebook.imagepipeline.producers.h0
    public boolean requiresExtraMap(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }
}
