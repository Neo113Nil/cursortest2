package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.Colors;
import com.sofascore.model.Colors$$serializer;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.oea;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0000HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0000HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010&Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010$J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b<\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b=\u0010&R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/sofascore/model/odds/OddsProvider;", "Ljava/io/Serializable;", "", "id", "", "name", "slug", "Lcom/sofascore/model/Colors;", "colors", "defaultBetSlipLink", "country", "oddsFrom", "liveOddsFrom", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Colors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;Lcom/sofascore/model/odds/OddsProvider;)V", "seen0", "fallbackOddsId", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Colors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;Lcom/sofascore/model/odds/OddsProvider;Ljava/lang/Integer;Lt5h;)V", "component7", "()Lcom/sofascore/model/odds/OddsProvider;", "component8", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/odds/OddsProvider;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "statusType", "getOddsDisplayProviderId", "(Ljava/lang/String;)I", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/Colors;", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Colors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;Lcom/sofascore/model/odds/OddsProvider;)Lcom/sofascore/model/odds/OddsProvider;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getSlug", "Lcom/sofascore/model/Colors;", "getColors", "getDefaultBetSlipLink", "getCountry", "Lcom/sofascore/model/odds/OddsProvider;", "Ljava/lang/Integer;", "getFallbackOddsId", "()Ljava/lang/Integer;", "setFallbackOddsId", "(Ljava/lang/Integer;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OddsProvider implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Colors colors;

    @Nullable
    private final String country;

    @Nullable
    private final String defaultBetSlipLink;

    @Nullable
    private Integer fallbackOddsId;
    private final int id;

    @Nullable
    private final OddsProvider liveOddsFrom;

    @NotNull
    private final String name;

    @Nullable
    private final OddsProvider oddsFrom;

    @NotNull
    private final String slug;

    public /* synthetic */ OddsProvider(int i, int i2, String str, String str2, Colors colors, String str3, String str4, OddsProvider oddsProvider, OddsProvider oddsProvider2, Integer num, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, OddsProvider$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.colors = colors;
        this.defaultBetSlipLink = str3;
        this.country = str4;
        this.oddsFrom = oddsProvider;
        this.liveOddsFrom = oddsProvider2;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.fallbackOddsId = null;
        } else {
            this.fallbackOddsId = num;
        }
    }

    /* renamed from: component7, reason: from getter */
    private final OddsProvider getOddsFrom() {
        return this.oddsFrom;
    }

    /* renamed from: component8, reason: from getter */
    private final OddsProvider getLiveOddsFrom() {
        return this.liveOddsFrom;
    }

    public static /* synthetic */ OddsProvider copy$default(OddsProvider oddsProvider, int i, String str, String str2, Colors colors, String str3, String str4, OddsProvider oddsProvider2, OddsProvider oddsProvider3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oddsProvider.id;
        }
        if ((i2 & 2) != 0) {
            str = oddsProvider.name;
        }
        if ((i2 & 4) != 0) {
            str2 = oddsProvider.slug;
        }
        if ((i2 & 8) != 0) {
            colors = oddsProvider.colors;
        }
        if ((i2 & 16) != 0) {
            str3 = oddsProvider.defaultBetSlipLink;
        }
        if ((i2 & 32) != 0) {
            str4 = oddsProvider.country;
        }
        if ((i2 & 64) != 0) {
            oddsProvider2 = oddsProvider.oddsFrom;
        }
        if ((i2 & 128) != 0) {
            oddsProvider3 = oddsProvider.liveOddsFrom;
        }
        OddsProvider oddsProvider4 = oddsProvider2;
        OddsProvider oddsProvider5 = oddsProvider3;
        String str5 = str3;
        String str6 = str4;
        return oddsProvider.copy(i, str, str2, colors, str5, str6, oddsProvider4, oddsProvider5);
    }

    public static /* synthetic */ int getOddsDisplayProviderId$default(OddsProvider oddsProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return oddsProvider.getOddsDisplayProviderId(str);
    }

    public static final /* synthetic */ void write$Self$model_release(OddsProvider self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.h(serialDesc, 3, Colors$$serializer.INSTANCE, self.colors);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 4, uhiVar, self.defaultBetSlipLink);
        output.h(serialDesc, 5, uhiVar, self.country);
        OddsProvider$$serializer oddsProvider$$serializer = OddsProvider$$serializer.INSTANCE;
        output.h(serialDesc, 6, oddsProvider$$serializer, self.oddsFrom);
        output.h(serialDesc, 7, oddsProvider$$serializer, self.liveOddsFrom);
        if (!output.o(serialDesc) && self.fallbackOddsId == null) {
            return;
        }
        output.h(serialDesc, 8, a7a.a, self.fallbackOddsId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
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

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDefaultBetSlipLink() {
        return this.defaultBetSlipLink;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final OddsProvider copy(int id, @NotNull String name, @NotNull String slug, @Nullable Colors colors, @Nullable String defaultBetSlipLink, @Nullable String country, @Nullable OddsProvider oddsFrom, @Nullable OddsProvider liveOddsFrom) {
        name.getClass();
        slug.getClass();
        return new OddsProvider(id, name, slug, colors, defaultBetSlipLink, country, oddsFrom, liveOddsFrom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsProvider)) {
            return false;
        }
        OddsProvider oddsProvider = (OddsProvider) other;
        return this.id == oddsProvider.id && Intrinsics.c(this.name, oddsProvider.name) && Intrinsics.c(this.slug, oddsProvider.slug) && Intrinsics.c(this.colors, oddsProvider.colors) && Intrinsics.c(this.defaultBetSlipLink, oddsProvider.defaultBetSlipLink) && Intrinsics.c(this.country, oddsProvider.country) && Intrinsics.c(this.oddsFrom, oddsProvider.oddsFrom) && Intrinsics.c(this.liveOddsFrom, oddsProvider.liveOddsFrom);
    }

    @Nullable
    public final Colors getColors() {
        return this.colors;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDefaultBetSlipLink() {
        return this.defaultBetSlipLink;
    }

    @Nullable
    public final Integer getFallbackOddsId() {
        return this.fallbackOddsId;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r4, com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getOddsDisplayProviderId(@Nullable String statusType) {
        Integer num;
        Integer num2 = this.fallbackOddsId;
        if (num2 != null) {
            return num2.intValue();
        }
        OddsProvider oddsProvider = this.liveOddsFrom;
        if (oddsProvider != null) {
            num = Integer.valueOf(oddsProvider.id);
        }
        num = null;
        if (num != null) {
            return num.intValue();
        }
        OddsProvider oddsProvider2 = this.oddsFrom;
        Integer valueOf = oddsProvider2 != null ? Integer.valueOf(oddsProvider2.id) : null;
        return valueOf != null ? valueOf.intValue() : this.id;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug);
        Colors colors = this.colors;
        int hashCode = (c + (colors == null ? 0 : colors.hashCode())) * 31;
        String str = this.defaultBetSlipLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OddsProvider oddsProvider = this.oddsFrom;
        int hashCode4 = (hashCode3 + (oddsProvider == null ? 0 : oddsProvider.hashCode())) * 31;
        OddsProvider oddsProvider2 = this.liveOddsFrom;
        return hashCode4 + (oddsProvider2 != null ? oddsProvider2.hashCode() : 0);
    }

    public final void setFallbackOddsId(@Nullable Integer num) {
        this.fallbackOddsId = num;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        Colors colors = this.colors;
        String str3 = this.defaultBetSlipLink;
        String str4 = this.country;
        OddsProvider oddsProvider = this.oddsFrom;
        OddsProvider oddsProvider2 = this.liveOddsFrom;
        StringBuilder t = dmi.t(i, "OddsProvider(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", colors=");
        t.append(colors);
        t.append(", defaultBetSlipLink=");
        bf3.v(t, str3, ", country=", str4, ", oddsFrom=");
        t.append(oddsProvider);
        t.append(", liveOddsFrom=");
        t.append(oddsProvider2);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/OddsProvider$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/odds/OddsProvider;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OddsProvider$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OddsProvider(int i, @NotNull String str, @NotNull String str2, @Nullable Colors colors, @Nullable String str3, @Nullable String str4, @Nullable OddsProvider oddsProvider, @Nullable OddsProvider oddsProvider2) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.colors = colors;
        this.defaultBetSlipLink = str3;
        this.country = str4;
        this.oddsFrom = oddsProvider;
        this.liveOddsFrom = oddsProvider2;
    }
}
