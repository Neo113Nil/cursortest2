package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.dmi;
import defpackage.duf;
import defpackage.gc2;
import defpackage.lm5;
import defpackage.mz1;
import defpackage.wv8;
import defpackage.wx4;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010Bu\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ{\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b,\u0010\u001dR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/sofascore/local_persistance/Brand;", "Lcom/squareup/wire/Message;", "", "", "id", "", "name", "slug", "Lcom/sofascore/local_persistance/BrandColors;", "color", "textColor", "", "standingsText", "", "showBettingAge", "url", "Lgc2;", "unknownFields", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandColors;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandColors;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/Brand;", "I", "getId", "Ljava/lang/String;", "getName", "getSlug", "Lcom/sofascore/local_persistance/BrandColors;", "getColor", "()Lcom/sofascore/local_persistance/BrandColors;", "getTextColor", "Ljava/lang/Boolean;", "getShowBettingAge", "()Ljava/lang/Boolean;", "getUrl", "Ljava/util/Map;", "getStandingsText", "()Ljava/util/Map;", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Brand extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.BrandColors#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    @Nullable
    private final BrandColors color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @NotNull
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    @Nullable
    private final Boolean showBettingAge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    @NotNull
    private final String slug;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    @NotNull
    private final Map<String, String> standingsText;

    @WireField(adapter = "com.sofascore.local_persistance.BrandColors#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    @Nullable
    private final BrandColors textColor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    @Nullable
    private final String url;

    @NotNull
    public static final ProtoAdapter<Brand> ADAPTER = new Brand$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, duf.a.getOrCreateKotlinClass(Brand.class), Syntax.PROTO_3);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Brand(int i, String str, String str2, BrandColors brandColors, BrandColors brandColors2, Map map, Boolean bool, String str3, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, brandColors, brandColors2, map, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : str3, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? gc2.d : gc2Var);
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? "" : str;
        str2 = (i2 & 4) != 0 ? "" : str2;
        brandColors = (i2 & 8) != 0 ? null : brandColors;
        brandColors2 = (i2 & 16) != 0 ? null : brandColors2;
        if ((i2 & 32) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    public static /* synthetic */ Brand copy$default(Brand brand, int i, String str, String str2, BrandColors brandColors, BrandColors brandColors2, Map map, Boolean bool, String str3, gc2 gc2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = brand.id;
        }
        if ((i2 & 2) != 0) {
            str = brand.name;
        }
        if ((i2 & 4) != 0) {
            str2 = brand.slug;
        }
        if ((i2 & 8) != 0) {
            brandColors = brand.color;
        }
        if ((i2 & 16) != 0) {
            brandColors2 = brand.textColor;
        }
        if ((i2 & 32) != 0) {
            map = brand.standingsText;
        }
        if ((i2 & 64) != 0) {
            bool = brand.showBettingAge;
        }
        if ((i2 & 128) != 0) {
            str3 = brand.url;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            gc2Var = brand.unknownFields();
        }
        String str4 = str3;
        gc2 gc2Var2 = gc2Var;
        Map map2 = map;
        Boolean bool2 = bool;
        BrandColors brandColors3 = brandColors2;
        String str5 = str2;
        return brand.copy(i, str, str5, brandColors, brandColors3, map2, bool2, str4, gc2Var2);
    }

    @NotNull
    public final Brand copy(int id, @NotNull String name, @NotNull String slug, @Nullable BrandColors color, @Nullable BrandColors textColor, @NotNull Map<String, String> standingsText, @Nullable Boolean showBettingAge, @Nullable String url, @NotNull gc2 unknownFields) {
        name.getClass();
        slug.getClass();
        standingsText.getClass();
        unknownFields.getClass();
        return new Brand(id, name, slug, color, textColor, standingsText, showBettingAge, url, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand brand = (Brand) other;
        return Intrinsics.c(unknownFields(), brand.unknownFields()) && this.id == brand.id && Intrinsics.c(this.name, brand.name) && Intrinsics.c(this.slug, brand.slug) && Intrinsics.c(this.color, brand.color) && Intrinsics.c(this.textColor, brand.textColor) && Intrinsics.c(this.standingsText, brand.standingsText) && Intrinsics.c(this.showBettingAge, brand.showBettingAge) && Intrinsics.c(this.url, brand.url);
    }

    @Nullable
    public final BrandColors getColor() {
        return this.color;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getShowBettingAge() {
        return this.showBettingAge;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final Map<String, String> getStandingsText() {
        return this.standingsText;
    }

    @Nullable
    public final BrandColors getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int c = dmi.c(dmi.c(wv8.a(this.id, unknownFields().hashCode() * 37, 37), 37, this.name), 37, this.slug);
        BrandColors brandColors = this.color;
        int hashCode = (c + (brandColors != null ? brandColors.hashCode() : 0)) * 37;
        BrandColors brandColors2 = this.textColor;
        int g = dmi.g(this.standingsText, (hashCode + (brandColors2 != null ? brandColors2.hashCode() : 0)) * 37, 37);
        Boolean bool = this.showBettingAge;
        int hashCode2 = (g + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m675newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        mz1.A(arrayList, "name=", Internal.sanitize(this.name));
        mz1.A(arrayList, "slug=", Internal.sanitize(this.slug));
        BrandColors brandColors = this.color;
        if (brandColors != null) {
            arrayList.add("color=" + brandColors);
        }
        BrandColors brandColors2 = this.textColor;
        if (brandColors2 != null) {
            arrayList.add("textColor=" + brandColors2);
        }
        if (!this.standingsText.isEmpty()) {
            arrayList.add("standingsText=" + this.standingsText);
        }
        Boolean bool = this.showBettingAge;
        if (bool != null) {
            mz1.y("showBettingAge=", bool, arrayList);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        return CollectionsKt.f0(arrayList, ", ", "Brand{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m675newBuilder();
    }

    public Brand() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Brand(int i, @NotNull String str, @NotNull String str2, @Nullable BrandColors brandColors, @Nullable BrandColors brandColors2, @NotNull Map<String, String> map, @Nullable Boolean bool, @Nullable String str3, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        str.getClass();
        str2.getClass();
        map.getClass();
        gc2Var.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.color = brandColors;
        this.textColor = brandColors2;
        this.showBettingAge = bool;
        this.url = str3;
        this.standingsText = Internal.immutableCopyOf("standingsText", map);
    }
}
