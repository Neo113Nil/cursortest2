package com.sofascore.model.network.response;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00063"}, d2 = {"Lcom/sofascore/model/network/response/SkillRadar;", "", "", "coverage", "depth", "frequency", TtmlNode.TAG_STYLE, "popularity", "", "title", "<init>", "(IIIIILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIIIILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/SkillRadar;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "copy", "(IIIIILjava/lang/String;)Lcom/sofascore/model/network/response/SkillRadar;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCoverage", "getDepth", "getFrequency", "getStyle", "getPopularity", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SkillRadar {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int coverage;
    private final int depth;
    private final int frequency;
    private final int popularity;
    private final int style;

    @NotNull
    private final String title;

    public /* synthetic */ SkillRadar(int i, int i2, int i3, int i4, int i5, int i6, String str, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, SkillRadar$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.coverage = i2;
        this.depth = i3;
        this.frequency = i4;
        this.style = i5;
        this.popularity = i6;
        this.title = str;
    }

    public static /* synthetic */ SkillRadar copy$default(SkillRadar skillRadar, int i, int i2, int i3, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = skillRadar.coverage;
        }
        if ((i6 & 2) != 0) {
            i2 = skillRadar.depth;
        }
        if ((i6 & 4) != 0) {
            i3 = skillRadar.frequency;
        }
        if ((i6 & 8) != 0) {
            i4 = skillRadar.style;
        }
        if ((i6 & 16) != 0) {
            i5 = skillRadar.popularity;
        }
        if ((i6 & 32) != 0) {
            str = skillRadar.title;
        }
        int i7 = i5;
        String str2 = str;
        return skillRadar.copy(i, i2, i3, i4, i7, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(SkillRadar self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.coverage, serialDesc);
        output.u(1, self.depth, serialDesc);
        output.u(2, self.frequency, serialDesc);
        output.u(3, self.style, serialDesc);
        output.u(4, self.popularity, serialDesc);
        output.y(serialDesc, 5, self.title);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCoverage() {
        return this.coverage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPopularity() {
        return this.popularity;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final SkillRadar copy(int coverage, int depth, int frequency, int style, int popularity, @NotNull String title) {
        title.getClass();
        return new SkillRadar(coverage, depth, frequency, style, popularity, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkillRadar)) {
            return false;
        }
        SkillRadar skillRadar = (SkillRadar) other;
        return this.coverage == skillRadar.coverage && this.depth == skillRadar.depth && this.frequency == skillRadar.frequency && this.style == skillRadar.style && this.popularity == skillRadar.popularity && Intrinsics.c(this.title, skillRadar.title);
    }

    public final int getCoverage() {
        return this.coverage;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getPopularity() {
        return this.popularity;
    }

    public final int getStyle() {
        return this.style;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + wv8.a(this.popularity, wv8.a(this.style, wv8.a(this.frequency, wv8.a(this.depth, Integer.hashCode(this.coverage) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.coverage;
        int i2 = this.depth;
        int i3 = this.frequency;
        int i4 = this.style;
        int i5 = this.popularity;
        String str = this.title;
        StringBuilder s = lnb.s(i, i2, "SkillRadar(coverage=", ", depth=", ", frequency=");
        me4.q(s, i3, ", style=", i4, ", popularity=");
        s.append(i5);
        s.append(", title=");
        s.append(str);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/SkillRadar$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SkillRadar;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SkillRadar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SkillRadar(int i, int i2, int i3, int i4, int i5, @NotNull String str) {
        str.getClass();
        this.coverage = i;
        this.depth = i2;
        this.frequency = i3;
        this.style = i4;
        this.popularity = i5;
        this.title = str;
    }
}
