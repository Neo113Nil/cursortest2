package com.sofascore.model.chat;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003()'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/chat/BanReason;", "", "Lcom/sofascore/model/chat/BanReason$Type;", "reason", "", "description", "<init>", "(Lcom/sofascore/model/chat/BanReason$Type;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/chat/BanReason$Type;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/chat/BanReason;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/chat/BanReason$Type;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/sofascore/model/chat/BanReason$Type;Ljava/lang/String;)Lcom/sofascore/model/chat/BanReason;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/chat/BanReason$Type;", "getReason", "Ljava/lang/String;", "getDescription", "Companion", "Type", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BanReason {

    @NotNull
    private final String description;

    @NotNull
    private final Type reason;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new tv0(4)), null};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/chat/BanReason$Type;", "", "<init>", "(Ljava/lang/String;I)V", "FAKE", "CURSE", "INSULT", "ADVERTISE", NativeAdContent.ViewTag.OTHER, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type FAKE = new Type("FAKE", 0);
        public static final Type CURSE = new Type("CURSE", 1);
        public static final Type INSULT = new Type("INSULT", 2);
        public static final Type ADVERTISE = new Type("ADVERTISE", 3);
        public static final Type OTHER = new Type(NativeAdContent.ViewTag.OTHER, 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{FAKE, CURSE, INSULT, ADVERTISE, OTHER};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BanReason(int i, Type type, String str, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, BanReason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.reason = type;
        this.description = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        Type[] values = Type.values();
        values.getClass();
        return new qq3("com.sofascore.model.chat.BanReason.Type", (Enum[]) values);
    }

    public static /* synthetic */ BanReason copy$default(BanReason banReason, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = banReason.reason;
        }
        if ((i & 2) != 0) {
            str = banReason.description;
        }
        return banReason.copy(type, str);
    }

    public static final /* synthetic */ void write$Self$model_release(BanReason self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.reason);
        output.y(serialDesc, 1, self.description);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Type getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final BanReason copy(@NotNull Type reason, @NotNull String description) {
        reason.getClass();
        description.getClass();
        return new BanReason(reason, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BanReason)) {
            return false;
        }
        BanReason banReason = (BanReason) other;
        return this.reason == banReason.reason && Intrinsics.c(this.description, banReason.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Type getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.reason.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BanReason(reason=" + this.reason + ", description=" + this.description + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/chat/BanReason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/chat/BanReason;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BanReason$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BanReason(@NotNull Type type, @NotNull String str) {
        type.getClass();
        str.getClass();
        this.reason = type;
        this.description = str;
    }
}
