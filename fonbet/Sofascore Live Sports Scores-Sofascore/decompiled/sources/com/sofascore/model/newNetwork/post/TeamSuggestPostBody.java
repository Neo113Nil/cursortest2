package com.sofascore.model.newNetwork.post;

import defpackage.a7a;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/post/TeamSuggestPostBody;", "Ljava/io/Serializable;", "", "name", "imageUrl", "country", "shortName", "", "managerId", "venueId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/TeamSuggestPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "getCountry", "setCountry", "getShortName", "setShortName", "Ljava/lang/Integer;", "getManagerId", "()Ljava/lang/Integer;", "setManagerId", "(Ljava/lang/Integer;)V", "getVenueId", "setVenueId", "", "getEmpty", "()Z", "empty", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamSuggestPostBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String country;

    @Nullable
    private String imageUrl;

    @Nullable
    private Integer managerId;

    @Nullable
    private String name;

    @Nullable
    private String shortName;

    @Nullable
    private Integer venueId;

    public /* synthetic */ TeamSuggestPostBody(int i, String str, String str2, String str3, String str4, Integer num, Integer num2, t5h t5hVar) {
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
            this.country = null;
        } else {
            this.country = str3;
        }
        if ((i & 8) == 0) {
            this.shortName = null;
        } else {
            this.shortName = str4;
        }
        if ((i & 16) == 0) {
            this.managerId = null;
        } else {
            this.managerId = num;
        }
        if ((i & 32) == 0) {
            this.venueId = null;
        } else {
            this.venueId = num2;
        }
    }

    public static final /* synthetic */ void write$Self$model_release(TeamSuggestPostBody self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.name != null) {
            output.h(serialDesc, 0, uhi.a, self.name);
        }
        if (output.o(serialDesc) || self.imageUrl != null) {
            output.h(serialDesc, 1, uhi.a, self.imageUrl);
        }
        if (output.o(serialDesc) || self.country != null) {
            output.h(serialDesc, 2, uhi.a, self.country);
        }
        if (output.o(serialDesc) || self.shortName != null) {
            output.h(serialDesc, 3, uhi.a, self.shortName);
        }
        if (output.o(serialDesc) || self.managerId != null) {
            output.h(serialDesc, 4, a7a.a, self.managerId);
        }
        if (!output.o(serialDesc) && self.venueId == null) {
            return;
        }
        output.h(serialDesc, 5, a7a.a, self.venueId);
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final boolean getEmpty() {
        return ((ArrayList) ph0.x(new Object[]{this.name, this.shortName, this.managerId, this.venueId, this.imageUrl})).isEmpty();
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final Integer getManagerId() {
        return this.managerId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    public final Integer getVenueId() {
        return this.venueId;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setManagerId(@Nullable Integer num) {
        this.managerId = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setShortName(@Nullable String str) {
        this.shortName = str;
    }

    public final void setVenueId(@Nullable Integer num) {
        this.venueId = num;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/TeamSuggestPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/TeamSuggestPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamSuggestPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamSuggestPostBody() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public TeamSuggestPostBody(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2) {
        this.name = str;
        this.imageUrl = str2;
        this.country = str3;
        this.shortName = str4;
        this.managerId = num;
        this.venueId = num2;
    }

    public /* synthetic */ TeamSuggestPostBody(String str, String str2, String str3, String str4, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
