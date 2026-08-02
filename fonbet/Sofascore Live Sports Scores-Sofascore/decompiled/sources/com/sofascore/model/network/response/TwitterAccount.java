package com.sofascore.model.network.response;

import defpackage.dmi;
import defpackage.gz1;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u001a¨\u00061"}, d2 = {"Lcom/sofascore/model/network/response/TwitterAccount;", "", "", "id", "name", "handle", "", "verified", "profilePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/TwitterAccount;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/network/response/TwitterAccount;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getHandle", "Ljava/lang/Boolean;", "getVerified", "getProfilePictureUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TwitterAccount {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String handle;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @Nullable
    private final String profilePictureUrl;

    @Nullable
    private final Boolean verified;

    public /* synthetic */ TwitterAccount(int i, String str, String str2, String str3, Boolean bool, String str4, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, TwitterAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.handle = str3;
        this.verified = bool;
        this.profilePictureUrl = str4;
    }

    public static /* synthetic */ TwitterAccount copy$default(TwitterAccount twitterAccount, String str, String str2, String str3, Boolean bool, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = twitterAccount.name;
        }
        if ((i & 4) != 0) {
            str3 = twitterAccount.handle;
        }
        if ((i & 8) != 0) {
            bool = twitterAccount.verified;
        }
        if ((i & 16) != 0) {
            str4 = twitterAccount.profilePictureUrl;
        }
        String str5 = str4;
        String str6 = str3;
        return twitterAccount.copy(str, str2, str6, bool, str5);
    }

    public static final /* synthetic */ void write$Self$model_release(TwitterAccount self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.id);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.handle);
        output.h(serialDesc, 3, gz1.a, self.verified);
        output.h(serialDesc, 4, uhi.a, self.profilePictureUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHandle() {
        return this.handle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getVerified() {
        return this.verified;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    @NotNull
    public final TwitterAccount copy(@NotNull String id, @NotNull String name, @NotNull String handle, @Nullable Boolean verified, @Nullable String profilePictureUrl) {
        id.getClass();
        name.getClass();
        handle.getClass();
        return new TwitterAccount(id, name, handle, verified, profilePictureUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwitterAccount)) {
            return false;
        }
        TwitterAccount twitterAccount = (TwitterAccount) other;
        return Intrinsics.c(this.id, twitterAccount.id) && Intrinsics.c(this.name, twitterAccount.name) && Intrinsics.c(this.handle, twitterAccount.handle) && Intrinsics.c(this.verified, twitterAccount.verified) && Intrinsics.c(this.profilePictureUrl, twitterAccount.profilePictureUrl);
    }

    @NotNull
    public final String getHandle() {
        return this.handle;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    @Nullable
    public final Boolean getVerified() {
        return this.verified;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.id.hashCode() * 31, 31, this.name), 31, this.handle);
        Boolean bool = this.verified;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.profilePictureUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.handle;
        Boolean bool = this.verified;
        String str4 = this.profilePictureUrl;
        StringBuilder s = mz1.s("TwitterAccount(id=", str, ", name=", str2, ", handle=");
        s.append(str3);
        s.append(", verified=");
        s.append(bool);
        s.append(", profilePictureUrl=");
        return mz1.o(s, str4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/TwitterAccount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/TwitterAccount;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TwitterAccount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TwitterAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Boolean bool, @Nullable String str4) {
        me4.p(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.handle = str3;
        this.verified = bool;
        this.profilePictureUrl = str4;
    }
}
