package com.sofascore.model.newNetwork.post;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJp\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u00104R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00101\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00104R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u00104R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u00104R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010@R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010DR$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010A\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010D¨\u0006I"}, d2 = {"Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;", "Ljava/io/Serializable;", "", "name", "imageUrl", "nickname", "nationality", "fightingStyle", "", "dateOfBirthTimestamp", "", "height", "reach", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Ljava/lang/Integer;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "getNickname", "setNickname", "getNationality", "setNationality", "getFightingStyle", "setFightingStyle", "Ljava/lang/Long;", "getDateOfBirthTimestamp", "setDateOfBirthTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Integer;", "getHeight", "setHeight", "(Ljava/lang/Integer;)V", "getReach", "setReach", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FighterSuggestPostBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long dateOfBirthTimestamp;

    @Nullable
    private String fightingStyle;

    @Nullable
    private Integer height;

    @Nullable
    private String imageUrl;

    @Nullable
    private String name;

    @Nullable
    private String nationality;

    @Nullable
    private String nickname;

    @Nullable
    private Integer reach;

    public /* synthetic */ FighterSuggestPostBody(int i, String str, String str2, String str3, String str4, String str5, Long l, Integer num, Integer num2, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str3;
        }
        if ((i & 8) == 0) {
            this.nationality = null;
        } else {
            this.nationality = str4;
        }
        if ((i & 16) == 0) {
            this.fightingStyle = null;
        } else {
            this.fightingStyle = str5;
        }
        if ((i & 32) == 0) {
            this.dateOfBirthTimestamp = null;
        } else {
            this.dateOfBirthTimestamp = l;
        }
        if ((i & 64) == 0) {
            this.height = null;
        } else {
            this.height = num;
        }
        if ((i & 128) == 0) {
            this.reach = null;
        } else {
            this.reach = num2;
        }
    }

    public static /* synthetic */ FighterSuggestPostBody copy$default(FighterSuggestPostBody fighterSuggestPostBody, String str, String str2, String str3, String str4, String str5, Long l, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fighterSuggestPostBody.name;
        }
        if ((i & 2) != 0) {
            str2 = fighterSuggestPostBody.imageUrl;
        }
        if ((i & 4) != 0) {
            str3 = fighterSuggestPostBody.nickname;
        }
        if ((i & 8) != 0) {
            str4 = fighterSuggestPostBody.nationality;
        }
        if ((i & 16) != 0) {
            str5 = fighterSuggestPostBody.fightingStyle;
        }
        if ((i & 32) != 0) {
            l = fighterSuggestPostBody.dateOfBirthTimestamp;
        }
        if ((i & 64) != 0) {
            num = fighterSuggestPostBody.height;
        }
        if ((i & 128) != 0) {
            num2 = fighterSuggestPostBody.reach;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str6 = str5;
        Long l2 = l;
        return fighterSuggestPostBody.copy(str, str2, str3, str4, str6, l2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$model_release(FighterSuggestPostBody self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.name != null) {
            output.h(serialDesc, 0, uhi.a, self.name);
        }
        if (output.o(serialDesc) || self.imageUrl != null) {
            output.h(serialDesc, 1, uhi.a, self.imageUrl);
        }
        if (output.o(serialDesc) || self.nickname != null) {
            output.h(serialDesc, 2, uhi.a, self.nickname);
        }
        if (output.o(serialDesc) || self.nationality != null) {
            output.h(serialDesc, 3, uhi.a, self.nationality);
        }
        if (output.o(serialDesc) || self.fightingStyle != null) {
            output.h(serialDesc, 4, uhi.a, self.fightingStyle);
        }
        if (output.o(serialDesc) || self.dateOfBirthTimestamp != null) {
            output.h(serialDesc, 5, lkb.a, self.dateOfBirthTimestamp);
        }
        if (output.o(serialDesc) || self.height != null) {
            output.h(serialDesc, 6, a7a.a, self.height);
        }
        if (!output.o(serialDesc) && self.reach == null) {
            return;
        }
        output.h(serialDesc, 7, a7a.a, self.reach);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getFightingStyle() {
        return this.fightingStyle;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getReach() {
        return this.reach;
    }

    @NotNull
    public final FighterSuggestPostBody copy(@Nullable String name, @Nullable String imageUrl, @Nullable String nickname, @Nullable String nationality, @Nullable String fightingStyle, @Nullable Long dateOfBirthTimestamp, @Nullable Integer height, @Nullable Integer reach) {
        return new FighterSuggestPostBody(name, imageUrl, nickname, nationality, fightingStyle, dateOfBirthTimestamp, height, reach);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FighterSuggestPostBody)) {
            return false;
        }
        FighterSuggestPostBody fighterSuggestPostBody = (FighterSuggestPostBody) other;
        return Intrinsics.c(this.name, fighterSuggestPostBody.name) && Intrinsics.c(this.imageUrl, fighterSuggestPostBody.imageUrl) && Intrinsics.c(this.nickname, fighterSuggestPostBody.nickname) && Intrinsics.c(this.nationality, fighterSuggestPostBody.nationality) && Intrinsics.c(this.fightingStyle, fighterSuggestPostBody.fightingStyle) && Intrinsics.c(this.dateOfBirthTimestamp, fighterSuggestPostBody.dateOfBirthTimestamp) && Intrinsics.c(this.height, fighterSuggestPostBody.height) && Intrinsics.c(this.reach, fighterSuggestPostBody.reach);
    }

    @Nullable
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    public final String getFightingStyle() {
        return this.fightingStyle;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Integer getReach() {
        return this.reach;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nationality;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fightingStyle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.dateOfBirthTimestamp;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.height;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reach;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setDateOfBirthTimestamp(@Nullable Long l) {
        this.dateOfBirthTimestamp = l;
    }

    public final void setFightingStyle(@Nullable String str) {
        this.fightingStyle = str;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNationality(@Nullable String str) {
        this.nationality = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setReach(@Nullable Integer num) {
        this.reach = num;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.imageUrl;
        String str3 = this.nickname;
        String str4 = this.nationality;
        String str5 = this.fightingStyle;
        Long l = this.dateOfBirthTimestamp;
        Integer num = this.height;
        Integer num2 = this.reach;
        StringBuilder s = mz1.s("FighterSuggestPostBody(name=", str, ", imageUrl=", str2, ", nickname=");
        bf3.v(s, str3, ", nationality=", str4, ", fightingStyle=");
        s.append(str5);
        s.append(", dateOfBirthTimestamp=");
        s.append(l);
        s.append(", height=");
        return fc6.l(num, num2, ", reach=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FighterSuggestPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FighterSuggestPostBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, 255, (DefaultConstructorMarker) null);
    }

    public FighterSuggestPostBody(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2) {
        this.name = str;
        this.imageUrl = str2;
        this.nickname = str3;
        this.nationality = str4;
        this.fightingStyle = str5;
        this.dateOfBirthTimestamp = l;
        this.height = num;
        this.reach = num2;
    }

    public /* synthetic */ FighterSuggestPostBody(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2);
    }
}
