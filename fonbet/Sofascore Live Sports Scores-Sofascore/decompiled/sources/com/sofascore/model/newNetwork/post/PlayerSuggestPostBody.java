package com.sofascore.model.newNetwork.post;

import defpackage.a7a;
import defpackage.lkb;
import defpackage.ph0;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody;", "Ljava/io/Serializable;", "", "name", "imageUrl", "", "dateOfBirthTimestamp", "", "height", "jerseyNumber", "preferredFoot", "position", "nationality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "Ljava/lang/Long;", "getDateOfBirthTimestamp", "()Ljava/lang/Long;", "setDateOfBirthTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Integer;", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "getJerseyNumber", "setJerseyNumber", "getPreferredFoot", "setPreferredFoot", "getPosition", "setPosition", "getNationality", "setNationality", "", "getEmpty", "()Z", "empty", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerSuggestPostBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long dateOfBirthTimestamp;

    @Nullable
    private Integer height;

    @Nullable
    private String imageUrl;

    @Nullable
    private String jerseyNumber;

    @Nullable
    private String name;

    @Nullable
    private String nationality;

    @Nullable
    private String position;

    @Nullable
    private String preferredFoot;

    public /* synthetic */ PlayerSuggestPostBody(int i, String str, String str2, Long l, Integer num, String str3, String str4, String str5, String str6, t5h t5hVar) {
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
            this.dateOfBirthTimestamp = null;
        } else {
            this.dateOfBirthTimestamp = l;
        }
        if ((i & 8) == 0) {
            this.height = null;
        } else {
            this.height = num;
        }
        if ((i & 16) == 0) {
            this.jerseyNumber = null;
        } else {
            this.jerseyNumber = str3;
        }
        if ((i & 32) == 0) {
            this.preferredFoot = null;
        } else {
            this.preferredFoot = str4;
        }
        if ((i & 64) == 0) {
            this.position = null;
        } else {
            this.position = str5;
        }
        if ((i & 128) == 0) {
            this.nationality = null;
        } else {
            this.nationality = str6;
        }
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerSuggestPostBody self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.name != null) {
            output.h(serialDesc, 0, uhi.a, self.name);
        }
        if (output.o(serialDesc) || self.imageUrl != null) {
            output.h(serialDesc, 1, uhi.a, self.imageUrl);
        }
        if (output.o(serialDesc) || self.dateOfBirthTimestamp != null) {
            output.h(serialDesc, 2, lkb.a, self.dateOfBirthTimestamp);
        }
        if (output.o(serialDesc) || self.height != null) {
            output.h(serialDesc, 3, a7a.a, self.height);
        }
        if (output.o(serialDesc) || self.jerseyNumber != null) {
            output.h(serialDesc, 4, uhi.a, self.jerseyNumber);
        }
        if (output.o(serialDesc) || self.preferredFoot != null) {
            output.h(serialDesc, 5, uhi.a, self.preferredFoot);
        }
        if (output.o(serialDesc) || self.position != null) {
            output.h(serialDesc, 6, uhi.a, self.position);
        }
        if (!output.o(serialDesc) && self.nationality == null) {
            return;
        }
        output.h(serialDesc, 7, uhi.a, self.nationality);
    }

    @Nullable
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    public final boolean getEmpty() {
        return ((ArrayList) ph0.x(new Object[]{this.name, this.imageUrl, this.dateOfBirthTimestamp, this.height, this.jerseyNumber, this.preferredFoot, this.position, this.nationality})).isEmpty();
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
    public final String getJerseyNumber() {
        return this.jerseyNumber;
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
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final String getPreferredFoot() {
        return this.preferredFoot;
    }

    public final void setDateOfBirthTimestamp(@Nullable Long l) {
        this.dateOfBirthTimestamp = l;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setJerseyNumber(@Nullable String str) {
        this.jerseyNumber = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNationality(@Nullable String str) {
        this.nationality = str;
    }

    public final void setPosition(@Nullable String str) {
        this.position = str;
    }

    public final void setPreferredFoot(@Nullable String str) {
        this.preferredFoot = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerSuggestPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerSuggestPostBody() {
        this((String) null, (String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public PlayerSuggestPostBody(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.name = str;
        this.imageUrl = str2;
        this.dateOfBirthTimestamp = l;
        this.height = num;
        this.jerseyNumber = str3;
        this.preferredFoot = str4;
        this.position = str5;
        this.nationality = str6;
    }

    public /* synthetic */ PlayerSuggestPostBody(String str, String str2, Long l, Integer num, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }
}
