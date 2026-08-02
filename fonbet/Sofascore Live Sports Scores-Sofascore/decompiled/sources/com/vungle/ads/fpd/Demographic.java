package com.vungle.ads.fpd;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import defpackage.a7a;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "<init>", "()V", "", "seen1", "ageRange", InneractiveMediationDefs.KEY_GENDER, "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/fpd/Demographic;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/vungle/ads/fpd/LiftoffGender;", "setGender", "(Lcom/vungle/ads/fpd/LiftoffGender;)Lcom/vungle/ads/fpd/Demographic;", "age", "setAgeRange", "(I)Lcom/vungle/ads/fpd/Demographic;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class Demographic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Integer a;
    public Integer b;

    @wx4
    public /* synthetic */ Demographic(int i, @q5h("age_range") Integer num, @q5h("gender") Integer num2, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public static final void write$Self(@NotNull Demographic self, @NotNull wf3 output, @NotNull SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        if (output.o(serialDesc) || self.a != null) {
            output.h(serialDesc, 0, a7a.a, self.a);
        }
        if (!output.o(serialDesc) && self.b == null) {
            return;
        }
        output.h(serialDesc, 1, a7a.a, self.b);
    }

    @NotNull
    public final Demographic setAgeRange(int age) {
        this.a = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    @NotNull
    public final Demographic setGender(@NotNull LiftoffGender gender) {
        gender.getClass();
        this.b = Integer.valueOf(gender.getCom.ironsource.U3.i.X java.lang.String());
        return this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Demographic() {
    }

    @wx4
    @NotNull
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @wx4
    @NotNull
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @wx4
    @NotNull
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }
}
