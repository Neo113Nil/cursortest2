package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/TOTWRound;", "", "", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "", "name", "slug", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TOTWRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/TOTWRound;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRound", "Ljava/lang/String;", "getName", "getSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TOTWRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String name;
    private final int round;

    @NotNull
    private final String slug;

    public /* synthetic */ TOTWRound(int i, int i2, String str, String str2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TOTWRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.round = i2;
        this.name = str;
        this.slug = str2;
    }

    public static /* synthetic */ TOTWRound copy$default(TOTWRound tOTWRound, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tOTWRound.round;
        }
        if ((i2 & 2) != 0) {
            str = tOTWRound.name;
        }
        if ((i2 & 4) != 0) {
            str2 = tOTWRound.slug;
        }
        return tOTWRound.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(TOTWRound self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.round, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRound() {
        return this.round;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final TOTWRound copy(int round, @NotNull String name, @NotNull String slug) {
        name.getClass();
        slug.getClass();
        return new TOTWRound(round, name, slug);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TOTWRound)) {
            return false;
        }
        TOTWRound tOTWRound = (TOTWRound) other;
        return this.round == tOTWRound.round && Intrinsics.c(this.name, tOTWRound.name) && Intrinsics.c(this.slug, tOTWRound.slug);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRound() {
        return this.round;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return this.slug.hashCode() + dmi.c(Integer.hashCode(this.round) * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        int i = this.round;
        String str = this.name;
        return mz1.o(dmi.t(i, "TOTWRound(round=", ", name=", str, ", slug="), this.slug, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TOTWRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TOTWRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TOTWRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TOTWRound(int i, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.round = i;
        this.name = str;
        this.slug = str2;
    }
}
