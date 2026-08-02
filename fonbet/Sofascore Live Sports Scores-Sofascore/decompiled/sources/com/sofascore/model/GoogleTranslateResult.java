package com.sofascore.model;

import com.appsflyer.internal.i;
import defpackage.c88;
import defpackage.joa;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xt8;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0006¨\u0006)"}, d2 = {"Lcom/sofascore/model/GoogleTranslateResult;", "", "", "", "srcLangsConfidences", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/GoogleTranslateResult;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/sofascore/model/GoogleTranslateResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSrcLangsConfidences", "setSrcLangsConfidences", "getSrcLangsConfidences$annotations", "()V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GoogleTranslateResult {

    @Nullable
    private List<Float> srcLangsConfidences;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new xt8(17))};

    public /* synthetic */ GoogleTranslateResult(int i, List list, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.srcLangsConfidences = null;
        } else {
            this.srcLangsConfidences = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(c88.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoogleTranslateResult copy$default(GoogleTranslateResult googleTranslateResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = googleTranslateResult.srcLangsConfidences;
        }
        return googleTranslateResult.copy(list);
    }

    public static final /* synthetic */ void write$Self$model_release(GoogleTranslateResult self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (!output.o(serialDesc) && self.srcLangsConfidences == null) {
            return;
        }
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.srcLangsConfidences);
    }

    @Nullable
    public final List<Float> component1() {
        return this.srcLangsConfidences;
    }

    @NotNull
    public final GoogleTranslateResult copy(@Nullable List<Float> srcLangsConfidences) {
        return new GoogleTranslateResult(srcLangsConfidences);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoogleTranslateResult) && Intrinsics.c(this.srcLangsConfidences, ((GoogleTranslateResult) other).srcLangsConfidences);
    }

    @Nullable
    public final List<Float> getSrcLangsConfidences() {
        return this.srcLangsConfidences;
    }

    public int hashCode() {
        List<Float> list = this.srcLangsConfidences;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setSrcLangsConfidences(@Nullable List<Float> list) {
        this.srcLangsConfidences = list;
    }

    @NotNull
    public String toString() {
        return i.i("GoogleTranslateResult(srcLangsConfidences=", ")", this.srcLangsConfidences);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/GoogleTranslateResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/GoogleTranslateResult;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GoogleTranslateResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("srclangs_confidences")
    public static /* synthetic */ void getSrcLangsConfidences$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleTranslateResult() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public GoogleTranslateResult(@Nullable List<Float> list) {
        this.srcLangsConfidences = list;
    }

    public /* synthetic */ GoogleTranslateResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
