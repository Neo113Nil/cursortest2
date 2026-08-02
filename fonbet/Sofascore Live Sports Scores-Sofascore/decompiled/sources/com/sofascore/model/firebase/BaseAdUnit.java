package com.sofascore.model.firebase;

import defpackage.duf;
import defpackage.fuf;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit;", "", "GamAdUnit", "EquativAdUnit", "AffiliateAdUnit", "Companion", "Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit;", "Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BaseAdUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/BaseAdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.firebase.BaseAdUnit", fufVar.getOrCreateKotlinClass(BaseAdUnit.class), new KClass[]{fufVar.getOrCreateKotlinClass(AffiliateAdUnit.class), fufVar.getOrCreateKotlinClass(EquativAdUnit.class), fufVar.getOrCreateKotlinClass(GamAdUnit.class)}, new KSerializer[]{BaseAdUnit$AffiliateAdUnit$$serializer.INSTANCE, BaseAdUnit$EquativAdUnit$$serializer.INSTANCE, BaseAdUnit$GamAdUnit$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit;", "Lcom/sofascore/model/firebase/BaseAdUnit;", "", "width", "height", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AffiliateAdUnit implements BaseAdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        public /* synthetic */ AffiliateAdUnit(int i, int i2, int i3, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, BaseAdUnit$AffiliateAdUnit$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.width = i2;
            this.height = i3;
        }

        public static /* synthetic */ AffiliateAdUnit copy$default(AffiliateAdUnit affiliateAdUnit, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = affiliateAdUnit.width;
            }
            if ((i3 & 2) != 0) {
                i2 = affiliateAdUnit.height;
            }
            return affiliateAdUnit.copy(i, i2);
        }

        public static final /* synthetic */ void write$Self$model_release(AffiliateAdUnit self, wf3 output, SerialDescriptor serialDesc) {
            output.u(0, self.width, serialDesc);
            output.u(1, self.height, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final AffiliateAdUnit copy(int width, int height) {
            return new AffiliateAdUnit(width, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AffiliateAdUnit)) {
                return false;
            }
            AffiliateAdUnit affiliateAdUnit = (AffiliateAdUnit) other;
            return this.width == affiliateAdUnit.width && this.height == affiliateAdUnit.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return lnb.j(this.width, this.height, "AffiliateAdUnit(width=", ", height=", ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/BaseAdUnit$AffiliateAdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return BaseAdUnit$AffiliateAdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AffiliateAdUnit(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0016¨\u0006)"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "Lcom/sofascore/model/firebase/BaseAdUnit;", "", "pageId", "formatId", "<init>", "(JJ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "copy", "(JJ)Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPageId", "getFormatId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EquativAdUnit implements BaseAdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long formatId;
        private final long pageId;

        public /* synthetic */ EquativAdUnit(int i, long j, long j2, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, BaseAdUnit$EquativAdUnit$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.pageId = j;
            this.formatId = j2;
        }

        public static /* synthetic */ EquativAdUnit copy$default(EquativAdUnit equativAdUnit, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = equativAdUnit.pageId;
            }
            if ((i & 2) != 0) {
                j2 = equativAdUnit.formatId;
            }
            return equativAdUnit.copy(j, j2);
        }

        public static final /* synthetic */ void write$Self$model_release(EquativAdUnit self, wf3 output, SerialDescriptor serialDesc) {
            output.E(serialDesc, 0, self.pageId);
            output.E(serialDesc, 1, self.formatId);
        }

        /* renamed from: component1, reason: from getter */
        public final long getPageId() {
            return this.pageId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getFormatId() {
            return this.formatId;
        }

        @NotNull
        public final EquativAdUnit copy(long pageId, long formatId) {
            return new EquativAdUnit(pageId, formatId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquativAdUnit)) {
                return false;
            }
            EquativAdUnit equativAdUnit = (EquativAdUnit) other;
            return this.pageId == equativAdUnit.pageId && this.formatId == equativAdUnit.formatId;
        }

        public final long getFormatId() {
            return this.formatId;
        }

        public final long getPageId() {
            return this.pageId;
        }

        public int hashCode() {
            return Long.hashCode(this.formatId) + (Long.hashCode(this.pageId) * 31);
        }

        @NotNull
        public String toString() {
            return lnb.l(this.formatId, ")", ljg.o("EquativAdUnit(pageId=", this.pageId, ", formatId="));
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return BaseAdUnit$EquativAdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public EquativAdUnit(long j, long j2) {
            this.pageId = j;
            this.formatId = j2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "Lcom/sofascore/model/firebase/BaseAdUnit;", "", "adUnitId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdUnitId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GamAdUnit implements BaseAdUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String adUnitId;

        public /* synthetic */ GamAdUnit(int i, String str, t5h t5hVar) {
            if (1 == (i & 1)) {
                this.adUnitId = str;
            } else {
                oea.z(i, 1, BaseAdUnit$GamAdUnit$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ GamAdUnit copy$default(GamAdUnit gamAdUnit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gamAdUnit.adUnitId;
            }
            return gamAdUnit.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAdUnitId() {
            return this.adUnitId;
        }

        @NotNull
        public final GamAdUnit copy(@NotNull String adUnitId) {
            adUnitId.getClass();
            return new GamAdUnit(adUnitId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GamAdUnit) && Intrinsics.c(this.adUnitId, ((GamAdUnit) other).adUnitId);
        }

        @NotNull
        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public int hashCode() {
            return this.adUnitId.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("GamAdUnit(adUnitId=", this.adUnitId, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return BaseAdUnit$GamAdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public GamAdUnit(@NotNull String str) {
            str.getClass();
            this.adUnitId = str;
        }
    }
}
