package com.vk.id.auth;

import com.vk.id.auth.VKIDAuthParams;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B+\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/vk/id/auth/VKIDAuthUiParams;", "", "", "state", "codeChallenge", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "Lkotlin/Function1;", "Lcom/vk/id/auth/VKIDAuthUiParams$Builder;", "", "initializer", "newBuilder", "(Lkotlin/jvm/functions/Function1;)Lcom/vk/id/auth/VKIDAuthUiParams;", "Lcom/vk/id/auth/VKIDAuthParams$Builder;", "asParamsBuilder", "(Lkotlin/jvm/functions/Function1;)Lcom/vk/id/auth/VKIDAuthParams$Builder;", "Ljava/lang/String;", "getState$vkid_release", "()Ljava/lang/String;", "getCodeChallenge$vkid_release", "Ljava/util/Set;", "getScopes$vkid_release", "()Ljava/util/Set;", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDAuthUiParams {
    public static final int $stable = 8;
    private final String codeChallenge;

    @NotNull
    private final Set<String> scopes;
    private final String state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/vk/id/auth/VKIDAuthUiParams$Builder;", "", "<init>", "()V", "Lcom/vk/id/auth/VKIDAuthUiParams;", "build", "()Lcom/vk/id/auth/VKIDAuthUiParams;", "", "state", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "codeChallenge", "getCodeChallenge", "setCodeChallenge", "", "scopes", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private String codeChallenge;

        @NotNull
        private Set<String> scopes = M.f71699a;
        private String state;

        @NotNull
        public final VKIDAuthUiParams build() {
            return new VKIDAuthUiParams(this.state, this.codeChallenge, this.scopes, null);
        }

        @NotNull
        public final Set<String> getScopes() {
            return this.scopes;
        }

        public final void setCodeChallenge(String str) {
            this.codeChallenge = str;
        }

        public final void setScopes(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.scopes = set;
        }

        public final void setState(String str) {
            this.state = str;
        }
    }

    public /* synthetic */ VKIDAuthUiParams(String str, String str2, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, set);
    }

    @NotNull
    public final VKIDAuthParams.Builder asParamsBuilder(@NotNull Function1<? super VKIDAuthParams.Builder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        VKIDAuthParams.Builder builder = new VKIDAuthParams.Builder();
        builder.setState(this.state);
        builder.setCodeChallenge(this.codeChallenge);
        builder.setScopes(this.scopes);
        builder.setInternalUse(true);
        initializer.invoke(builder);
        return builder;
    }

    @NotNull
    public final VKIDAuthUiParams newBuilder(@NotNull Function1<? super Builder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Builder builder = new Builder();
        builder.setState(this.state);
        builder.setCodeChallenge(this.codeChallenge);
        builder.setScopes(this.scopes);
        initializer.invoke(builder);
        return builder.build();
    }

    private VKIDAuthUiParams(String str, String str2, Set<String> set) {
        this.state = str;
        this.codeChallenge = str2;
        this.scopes = set;
    }
}
