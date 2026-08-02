package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.dmi;
import defpackage.lnb;
import defpackage.zzl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MemberSignature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String signature;

    private MemberSignature(String str) {
        this.signature = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.c(this.signature, ((MemberSignature) obj).signature);
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.q(new StringBuilder("MemberSignature(signature="), this.signature, ')');
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + '#' + str2, null);
        }

        @NotNull
        public final MemberSignature fromJvmMemberSignature(@NotNull JvmMemberSignature jvmMemberSignature) {
            jvmMemberSignature.getClass();
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                return fromMethodNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                return fromFieldNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            zzl.b();
            return null;
        }

        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            nameResolver.getClass();
            jvmMethodSignature.getClass();
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(dmi.y(str, str2), null);
        }

        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature memberSignature, int i) {
            memberSignature.getClass();
            return new MemberSignature(memberSignature.getSignature() + '@' + i, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
