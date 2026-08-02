package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.IUrlSharing;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.hz8;
import defpackage.joa;
import defpackage.khk;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0002hgB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB«\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b;\u0010<Jª\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b?\u0010&J\u001a\u0010B\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bT\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bZ\u00101R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\b_\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010`\u001a\u0004\ba\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010b\u001a\u0004\bc\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\be\u0010<R\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bf\u0010$¨\u0006i"}, d2 = {"Lcom/sofascore/model/mvvm/model/Venue;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "", "id", "", "slug", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/City;", "city", "Lcom/sofascore/model/mvvm/model/Stadium;", "stadium", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "Lcom/sofascore/model/mvvm/model/LatLonCoordinates;", "venueCoordinates", "", "Lcom/sofascore/model/mvvm/model/Team;", "mainTeams", "", "hidden", "name", "capacity", "", "openedAtTimestamp", "Lcom/sofascore/model/mvvm/model/StadiumType;", "stadiumType", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/City;Lcom/sofascore/model/mvvm/model/Stadium;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/LatLonCoordinates;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StadiumType;)V", "seen0", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/City;Lcom/sofascore/model/mvvm/model/Stadium;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/LatLonCoordinates;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StadiumType;Ljava/lang/String;Lt5h;)V", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Country;", "component4", "()Lcom/sofascore/model/mvvm/model/City;", "component5", "()Lcom/sofascore/model/mvvm/model/Stadium;", "component6", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component7", "()Lcom/sofascore/model/mvvm/model/LatLonCoordinates;", "component8", "()Ljava/util/List;", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Ljava/lang/Integer;", "component12", "()Ljava/lang/Long;", "component13", "()Lcom/sofascore/model/mvvm/model/StadiumType;", "copy", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/City;Lcom/sofascore/model/mvvm/model/Stadium;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/LatLonCoordinates;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StadiumType;)Lcom/sofascore/model/mvvm/model/Venue;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Venue;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getSlug", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/mvvm/model/City;", "getCity", "Lcom/sofascore/model/mvvm/model/Stadium;", "getStadium", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Lcom/sofascore/model/mvvm/model/LatLonCoordinates;", "getVenueCoordinates", "Ljava/util/List;", "getMainTeams", "Ljava/lang/Boolean;", "getHidden", "getName", "Ljava/lang/Integer;", "getCapacity", "Ljava/lang/Long;", "getOpenedAtTimestamp", "Lcom/sofascore/model/mvvm/model/StadiumType;", "getStadiumType", "getWebUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Venue implements Serializable, IUrlSharing {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer capacity;

    @NotNull
    private final City city;

    @Nullable
    private final Country country;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Boolean hidden;
    private final int id;

    @Nullable
    private final List<Team> mainTeams;

    @Nullable
    private final String name;

    @Nullable
    private final Long openedAtTimestamp;

    @NotNull
    private final String slug;

    @NotNull
    private final Stadium stadium;

    @Nullable
    private final StadiumType stadiumType;

    @Nullable
    private final LatLonCoordinates venueCoordinates;

    @NotNull
    private final String webUrl;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, ypa.a(ysaVar, new khk(19)), null, null, null, null, ypa.a(ysaVar, new khk(20)), null};
    }

    public /* synthetic */ Venue(int i, int i2, String str, Country country, City city, Stadium stadium, FieldTranslations fieldTranslations, LatLonCoordinates latLonCoordinates, List list, Boolean bool, String str2, Integer num, Long l, StadiumType stadiumType, String str3, t5h t5hVar) {
        String str4;
        if (4063 != (i & 4063)) {
            oea.z(i, 4063, Venue$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.slug = str;
        this.country = country;
        this.city = city;
        this.stadium = stadium;
        if ((i & 32) == 0) {
            this.fieldTranslations = null;
        } else {
            this.fieldTranslations = fieldTranslations;
        }
        this.venueCoordinates = latLonCoordinates;
        this.mainTeams = list;
        this.hidden = bool;
        this.name = str2;
        this.capacity = num;
        this.openedAtTimestamp = l;
        if ((i & 4096) == 0) {
            this.stadiumType = null;
        } else {
            this.stadiumType = stadiumType;
        }
        if ((i & 8192) == 0) {
            StringBuilder s = mz1.s("/venue/", country != null ? country.getSlug() : null, "/", str, "/");
            s.append(i2);
            str4 = s.toString();
        } else {
            str4 = str3;
        }
        this.webUrl = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return hz8.F("com.sofascore.model.mvvm.model.StadiumType", StadiumType.values(), new String[]{"indoor", "outdoor", "retractable"}, new Annotation[][]{null, null, null});
    }

    public static /* synthetic */ Venue copy$default(Venue venue, int i, String str, Country country, City city, Stadium stadium, FieldTranslations fieldTranslations, LatLonCoordinates latLonCoordinates, List list, Boolean bool, String str2, Integer num, Long l, StadiumType stadiumType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = venue.id;
        }
        return venue.copy(i, (i2 & 2) != 0 ? venue.slug : str, (i2 & 4) != 0 ? venue.country : country, (i2 & 8) != 0 ? venue.city : city, (i2 & 16) != 0 ? venue.stadium : stadium, (i2 & 32) != 0 ? venue.fieldTranslations : fieldTranslations, (i2 & 64) != 0 ? venue.venueCoordinates : latLonCoordinates, (i2 & 128) != 0 ? venue.mainTeams : list, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? venue.hidden : bool, (i2 & 512) != 0 ? venue.name : str2, (i2 & 1024) != 0 ? venue.capacity : num, (i2 & a.o) != 0 ? venue.openedAtTimestamp : l, (i2 & 4096) != 0 ? venue.stadiumType : stadiumType);
    }

    public static final /* synthetic */ void write$Self$model_release(Venue self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.slug);
        output.h(serialDesc, 2, Country$$serializer.INSTANCE, self.country);
        output.f(serialDesc, 3, City$$serializer.INSTANCE, self.city);
        output.f(serialDesc, 4, Stadium$$serializer.INSTANCE, self.stadium);
        if (output.o(serialDesc) || self.fieldTranslations != null) {
            output.h(serialDesc, 5, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        }
        output.h(serialDesc, 6, LatLonCoordinates$$serializer.INSTANCE, self.venueCoordinates);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.mainTeams);
        output.h(serialDesc, 8, gz1.a, self.hidden);
        output.h(serialDesc, 9, uhi.a, self.name);
        output.h(serialDesc, 10, a7a.a, self.capacity);
        output.h(serialDesc, 11, lkb.a, self.openedAtTimestamp);
        if (output.o(serialDesc) || self.stadiumType != null) {
            output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.stadiumType);
        }
        if (!output.o(serialDesc)) {
            String webUrl = self.getWebUrl();
            Country country = self.country;
            String slug = country != null ? country.getSlug() : null;
            String str = self.slug;
            int i = self.id;
            StringBuilder s = mz1.s("/venue/", slug, "/", str, "/");
            s.append(i);
            if (Intrinsics.c(webUrl, s.toString())) {
                return;
            }
        }
        output.y(serialDesc, 13, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getCapacity() {
        return this.capacity;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getOpenedAtTimestamp() {
        return this.openedAtTimestamp;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final StadiumType getStadiumType() {
        return this.stadiumType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final City getCity() {
        return this.city;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Stadium getStadium() {
        return this.stadium;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final LatLonCoordinates getVenueCoordinates() {
        return this.venueCoordinates;
    }

    @Nullable
    public final List<Team> component8() {
        return this.mainTeams;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @NotNull
    public final Venue copy(int id, @NotNull String slug, @Nullable Country country, @NotNull City city, @NotNull Stadium stadium, @Nullable FieldTranslations fieldTranslations, @Nullable LatLonCoordinates venueCoordinates, @Nullable List<Team> mainTeams, @Nullable Boolean hidden, @Nullable String name, @Nullable Integer capacity, @Nullable Long openedAtTimestamp, @Nullable StadiumType stadiumType) {
        slug.getClass();
        city.getClass();
        stadium.getClass();
        return new Venue(id, slug, country, city, stadium, fieldTranslations, venueCoordinates, mainTeams, hidden, name, capacity, openedAtTimestamp, stadiumType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Venue)) {
            return false;
        }
        Venue venue = (Venue) other;
        return this.id == venue.id && Intrinsics.c(this.slug, venue.slug) && Intrinsics.c(this.country, venue.country) && Intrinsics.c(this.city, venue.city) && Intrinsics.c(this.stadium, venue.stadium) && Intrinsics.c(this.fieldTranslations, venue.fieldTranslations) && Intrinsics.c(this.venueCoordinates, venue.venueCoordinates) && Intrinsics.c(this.mainTeams, venue.mainTeams) && Intrinsics.c(this.hidden, venue.hidden) && Intrinsics.c(this.name, venue.name) && Intrinsics.c(this.capacity, venue.capacity) && Intrinsics.c(this.openedAtTimestamp, venue.openedAtTimestamp) && this.stadiumType == venue.stadiumType;
    }

    @Nullable
    public final Integer getCapacity() {
        return this.capacity;
    }

    @NotNull
    public final City getCity() {
        return this.city;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final List<Team> getMainTeams() {
        return this.mainTeams;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getOpenedAtTimestamp() {
        return this.openedAtTimestamp;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final Stadium getStadium() {
        return this.stadium;
    }

    @Nullable
    public final StadiumType getStadiumType() {
        return this.stadiumType;
    }

    @Nullable
    public final LatLonCoordinates getVenueCoordinates() {
        return this.venueCoordinates;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.slug);
        Country country = this.country;
        int hashCode = (this.stadium.hashCode() + ((this.city.hashCode() + ((c + (country == null ? 0 : country.hashCode())) * 31)) * 31)) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        int hashCode2 = (hashCode + (fieldTranslations == null ? 0 : fieldTranslations.hashCode())) * 31;
        LatLonCoordinates latLonCoordinates = this.venueCoordinates;
        int hashCode3 = (hashCode2 + (latLonCoordinates == null ? 0 : latLonCoordinates.hashCode())) * 31;
        List<Team> list = this.mainTeams;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hidden;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.name;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.capacity;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.openedAtTimestamp;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        StadiumType stadiumType = this.stadiumType;
        return hashCode8 + (stadiumType != null ? stadiumType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return this.stadium.getName();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Venue$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Venue;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Venue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Venue(int i, @NotNull String str, @Nullable Country country, @NotNull City city, @NotNull Stadium stadium, @Nullable FieldTranslations fieldTranslations, @Nullable LatLonCoordinates latLonCoordinates, @Nullable List<Team> list, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num, @Nullable Long l, @Nullable StadiumType stadiumType) {
        str.getClass();
        city.getClass();
        stadium.getClass();
        this.id = i;
        this.slug = str;
        this.country = country;
        this.city = city;
        this.stadium = stadium;
        this.fieldTranslations = fieldTranslations;
        this.venueCoordinates = latLonCoordinates;
        this.mainTeams = list;
        this.hidden = bool;
        this.name = str2;
        this.capacity = num;
        this.openedAtTimestamp = l;
        this.stadiumType = stadiumType;
        StringBuilder s = mz1.s("/venue/", country != null ? country.getSlug() : null, "/", str, "/");
        s.append(i);
        this.webUrl = s.toString();
    }

    public /* synthetic */ Venue(int i, String str, Country country, City city, Stadium stadium, FieldTranslations fieldTranslations, LatLonCoordinates latLonCoordinates, List list, Boolean bool, String str2, Integer num, Long l, StadiumType stadiumType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, country, city, stadium, (i2 & 32) != 0 ? null : fieldTranslations, latLonCoordinates, list, bool, str2, num, l, (i2 & 4096) != 0 ? null : stadiumType);
    }
}
