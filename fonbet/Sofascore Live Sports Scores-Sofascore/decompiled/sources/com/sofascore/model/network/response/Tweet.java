package com.sofascore.model.network.response;

import com.ironsource.U3;
import defpackage.dmi;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uzj;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJV\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b7\u0010\u001d¨\u0006:"}, d2 = {"Lcom/sofascore/model/network/response/Tweet;", "", "", "id", "Lcom/sofascore/model/network/response/TwitterAccount;", "account", "text", "", "Lcom/sofascore/model/network/response/TweetMedia;", U3.i.I0, "", "createdAtTimestamp", "externalUrl", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/network/response/TwitterAccount;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/network/response/TwitterAccount;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Tweet;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/network/response/TwitterAccount;", "component3", "component4", "()Ljava/util/List;", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Lcom/sofascore/model/network/response/TwitterAccount;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)Lcom/sofascore/model/network/response/Tweet;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/sofascore/model/network/response/TwitterAccount;", "getAccount", "getText", "Ljava/util/List;", "getMedia", "I", "getCreatedAtTimestamp", "getExternalUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Tweet {

    @Nullable
    private final TwitterAccount account;
    private final int createdAtTimestamp;

    @NotNull
    private final String externalUrl;

    @NotNull
    private final String id;

    @Nullable
    private final List<TweetMedia> media;

    @NotNull
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new uzj(13)), null, null};

    public /* synthetic */ Tweet(int i, String str, TwitterAccount twitterAccount, String str2, List list, int i2, String str3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, Tweet$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.account = twitterAccount;
        this.text = str2;
        this.media = list;
        this.createdAtTimestamp = i2;
        this.externalUrl = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TweetMedia$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ Tweet copy$default(Tweet tweet, String str, TwitterAccount twitterAccount, String str2, List list, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tweet.id;
        }
        if ((i2 & 2) != 0) {
            twitterAccount = tweet.account;
        }
        if ((i2 & 4) != 0) {
            str2 = tweet.text;
        }
        if ((i2 & 8) != 0) {
            list = tweet.media;
        }
        if ((i2 & 16) != 0) {
            i = tweet.createdAtTimestamp;
        }
        if ((i2 & 32) != 0) {
            str3 = tweet.externalUrl;
        }
        int i3 = i;
        String str4 = str3;
        return tweet.copy(str, twitterAccount, str2, list, i3, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(Tweet self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.id);
        output.h(serialDesc, 1, TwitterAccount$$serializer.INSTANCE, self.account);
        output.y(serialDesc, 2, self.text);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.media);
        output.u(4, self.createdAtTimestamp, serialDesc);
        output.y(serialDesc, 5, self.externalUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TwitterAccount getAccount() {
        return this.account;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final List<TweetMedia> component4() {
        return this.media;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @NotNull
    public final Tweet copy(@NotNull String id, @Nullable TwitterAccount account, @NotNull String text, @Nullable List<TweetMedia> media, int createdAtTimestamp, @NotNull String externalUrl) {
        id.getClass();
        text.getClass();
        externalUrl.getClass();
        return new Tweet(id, account, text, media, createdAtTimestamp, externalUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tweet)) {
            return false;
        }
        Tweet tweet = (Tweet) other;
        return Intrinsics.c(this.id, tweet.id) && Intrinsics.c(this.account, tweet.account) && Intrinsics.c(this.text, tweet.text) && Intrinsics.c(this.media, tweet.media) && this.createdAtTimestamp == tweet.createdAtTimestamp && Intrinsics.c(this.externalUrl, tweet.externalUrl);
    }

    @Nullable
    public final TwitterAccount getAccount() {
        return this.account;
    }

    public final int getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<TweetMedia> getMedia() {
        return this.media;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        TwitterAccount twitterAccount = this.account;
        int c = dmi.c((hashCode + (twitterAccount == null ? 0 : twitterAccount.hashCode())) * 31, 31, this.text);
        List<TweetMedia> list = this.media;
        return this.externalUrl.hashCode() + wv8.a(this.createdAtTimestamp, (c + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Tweet(id=" + this.id + ", account=" + this.account + ", text=" + this.text + ", media=" + this.media + ", createdAtTimestamp=" + this.createdAtTimestamp + ", externalUrl=" + this.externalUrl + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Tweet$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Tweet;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Tweet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Tweet(@NotNull String str, @Nullable TwitterAccount twitterAccount, @NotNull String str2, @Nullable List<TweetMedia> list, int i, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.id = str;
        this.account = twitterAccount;
        this.text = str2;
        this.media = list;
        this.createdAtTimestamp = i;
        this.externalUrl = str3;
    }
}
