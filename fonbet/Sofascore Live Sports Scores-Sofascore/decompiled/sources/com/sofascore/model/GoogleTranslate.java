package com.sofascore.model;

import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import defpackage.joa;
import defpackage.mz1;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0013J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u00100R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010-\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u00100R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010#R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/sofascore/model/GoogleTranslate;", "", "", "targetLang", "src", "translation", "", "Lcom/sofascore/model/Sentence;", "sentences", "Lcom/sofascore/model/GoogleTranslateResult;", "ldResult", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/GoogleTranslateResult;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/GoogleTranslateResult;Lt5h;)V", "component3", "()Ljava/lang/String;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/GoogleTranslate;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getTranslation", "component1", "component2", "component4", "()Ljava/util/List;", "component5", "()Lcom/sofascore/model/GoogleTranslateResult;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/GoogleTranslateResult;)Lcom/sofascore/model/GoogleTranslate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTargetLang", "setTargetLang", "(Ljava/lang/String;)V", "getSrc", "setSrc", "Ljava/util/List;", "getSentences", "Lcom/sofascore/model/GoogleTranslateResult;", "getLdResult", "getLdResult$annotations", "()V", "", "getConfidence", "()F", "confidence", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GoogleTranslate {

    @Nullable
    private final GoogleTranslateResult ldResult;

    @Nullable
    private final List<Sentence> sentences;

    @NotNull
    private String src;

    @Nullable
    private String targetLang;

    @Nullable
    private String translation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new xt8(16)), null};

    public /* synthetic */ GoogleTranslate(int i, String str, String str2, String str3, List list, GoogleTranslateResult googleTranslateResult, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.targetLang = null;
        } else {
            this.targetLang = str;
        }
        if ((i & 2) == 0) {
            this.src = "";
        } else {
            this.src = str2;
        }
        if ((i & 4) == 0) {
            this.translation = null;
        } else {
            this.translation = str3;
        }
        if ((i & 8) == 0) {
            this.sentences = null;
        } else {
            this.sentences = list;
        }
        if ((i & 16) == 0) {
            this.ldResult = null;
        } else {
            this.ldResult = googleTranslateResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Sentence$$serializer.INSTANCE, 0);
    }

    /* renamed from: component3, reason: from getter */
    private final String getTranslation() {
        return this.translation;
    }

    public static /* synthetic */ GoogleTranslate copy$default(GoogleTranslate googleTranslate, String str, String str2, String str3, List list, GoogleTranslateResult googleTranslateResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleTranslate.targetLang;
        }
        if ((i & 2) != 0) {
            str2 = googleTranslate.src;
        }
        if ((i & 4) != 0) {
            str3 = googleTranslate.translation;
        }
        if ((i & 8) != 0) {
            list = googleTranslate.sentences;
        }
        if ((i & 16) != 0) {
            googleTranslateResult = googleTranslate.ldResult;
        }
        GoogleTranslateResult googleTranslateResult2 = googleTranslateResult;
        String str4 = str3;
        return googleTranslate.copy(str, str2, str4, list, googleTranslateResult2);
    }

    public static final /* synthetic */ void write$Self$model_release(GoogleTranslate self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.targetLang != null) {
            output.h(serialDesc, 0, uhi.a, self.targetLang);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.src, "")) {
            output.y(serialDesc, 1, self.src);
        }
        if (output.o(serialDesc) || self.translation != null) {
            output.h(serialDesc, 2, uhi.a, self.translation);
        }
        if (output.o(serialDesc) || self.sentences != null) {
            output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.sentences);
        }
        if (!output.o(serialDesc) && self.ldResult == null) {
            return;
        }
        output.h(serialDesc, 4, GoogleTranslateResult$$serializer.INSTANCE, self.ldResult);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTargetLang() {
        return this.targetLang;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final List<Sentence> component4() {
        return this.sentences;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final GoogleTranslateResult getLdResult() {
        return this.ldResult;
    }

    @NotNull
    public final GoogleTranslate copy(@Nullable String targetLang, @NotNull String src, @Nullable String translation, @Nullable List<Sentence> sentences, @Nullable GoogleTranslateResult ldResult) {
        src.getClass();
        return new GoogleTranslate(targetLang, src, translation, sentences, ldResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleTranslate)) {
            return false;
        }
        GoogleTranslate googleTranslate = (GoogleTranslate) other;
        return Intrinsics.c(this.targetLang, googleTranslate.targetLang) && Intrinsics.c(this.src, googleTranslate.src) && Intrinsics.c(this.translation, googleTranslate.translation) && Intrinsics.c(this.sentences, googleTranslate.sentences) && Intrinsics.c(this.ldResult, googleTranslate.ldResult);
    }

    public final float getConfidence() {
        List<Float> srcLangsConfidences;
        GoogleTranslateResult googleTranslateResult = this.ldResult;
        return (googleTranslateResult == null || (srcLangsConfidences = googleTranslateResult.getSrcLangsConfidences()) == null || srcLangsConfidences.isEmpty()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : srcLangsConfidences.get(0).floatValue();
    }

    @Nullable
    public final GoogleTranslateResult getLdResult() {
        return this.ldResult;
    }

    @Nullable
    public final List<Sentence> getSentences() {
        return this.sentences;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final String getTargetLang() {
        return this.targetLang;
    }

    @Nullable
    public final String getTranslation() {
        List<Sentence> list;
        if (this.translation == null && (list = this.sentences) != null) {
            String str = "";
            for (Sentence sentence : list) {
                if (sentence.getTranslation() != null) {
                    str = dmi.y(str, sentence.getTranslation());
                }
            }
            if (str.length() != 0) {
                this.translation = str;
            }
        }
        return this.translation;
    }

    public int hashCode() {
        String str = this.targetLang;
        int c = dmi.c((str == null ? 0 : str.hashCode()) * 31, 31, this.src);
        String str2 = this.translation;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Sentence> list = this.sentences;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        GoogleTranslateResult googleTranslateResult = this.ldResult;
        return hashCode2 + (googleTranslateResult != null ? googleTranslateResult.hashCode() : 0);
    }

    public final void setSrc(@NotNull String str) {
        str.getClass();
        this.src = str;
    }

    public final void setTargetLang(@Nullable String str) {
        this.targetLang = str;
    }

    @NotNull
    public String toString() {
        String str = this.targetLang;
        String str2 = this.src;
        String str3 = this.translation;
        List<Sentence> list = this.sentences;
        GoogleTranslateResult googleTranslateResult = this.ldResult;
        StringBuilder s = mz1.s("GoogleTranslate(targetLang=", str, ", src=", str2, ", translation=");
        s.append(str3);
        s.append(", sentences=");
        s.append(list);
        s.append(", ldResult=");
        s.append(googleTranslateResult);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/GoogleTranslate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/GoogleTranslate;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GoogleTranslate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("ld_result")
    public static /* synthetic */ void getLdResult$annotations() {
    }

    public GoogleTranslate() {
        this((String) null, (String) null, (String) null, (List) null, (GoogleTranslateResult) null, 31, (DefaultConstructorMarker) null);
    }

    public GoogleTranslate(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable List<Sentence> list, @Nullable GoogleTranslateResult googleTranslateResult) {
        str2.getClass();
        this.targetLang = str;
        this.src = str2;
        this.translation = str3;
        this.sentences = list;
        this.ldResult = googleTranslateResult;
    }

    public /* synthetic */ GoogleTranslate(String str, String str2, String str3, List list, GoogleTranslateResult googleTranslateResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : googleTranslateResult);
    }
}
