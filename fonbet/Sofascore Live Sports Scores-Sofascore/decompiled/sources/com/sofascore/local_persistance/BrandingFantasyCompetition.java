package com.sofascore.local_persistance;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.dmi;
import defpackage.duf;
import defpackage.gc2;
import defpackage.mz1;
import defpackage.wv8;
import defpackage.wx4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b\r\u0010+¨\u0006-"}, d2 = {"Lcom/sofascore/local_persistance/BrandingFantasyCompetition;", "Lcom/squareup/wire/Message;", "", "", "id", "brandingType", "", "termsAndConditionsUrl", "url", "Lcom/sofascore/local_persistance/Brand;", "brand", "oddsProviderId", "", "isTermsAndConditionsMandatory", "Lgc2;", "unknownFields", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/local_persistance/Brand;Ljava/lang/Integer;ZLgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/local_persistance/Brand;Ljava/lang/Integer;ZLgc2;)Lcom/sofascore/local_persistance/BrandingFantasyCompetition;", "I", "getId", "getBrandingType", "Ljava/lang/String;", "getTermsAndConditionsUrl", "getUrl", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/Integer;", "getOddsProviderId", "()Ljava/lang/Integer;", "Z", "()Z", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingFantasyCompetition extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingFantasyCompetition> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int brandingType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean isTermsAndConditionsMandatory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    @Nullable
    private final Integer oddsProviderId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    @NotNull
    private final String termsAndConditionsUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingFantasyCompetition.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingFantasyCompetition>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingFantasyCompetition$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingFantasyCompetition decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = null;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                Brand brand = null;
                Integer num = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingFantasyCompetition(i, i2, str, str2, brand, num, z, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            i = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 2:
                            i2 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 3:
                            str = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            brand = Brand.ADAPTER.decode(reader);
                            break;
                        case 6:
                            num = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingFantasyCompetition value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrandingType() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBrandingType()));
                }
                if (!Intrinsics.c(value.getTermsAndConditionsUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTermsAndConditionsUrl());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 5, (int) value.getBrand());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) value.getOddsProviderId());
                if (value.getIsTermsAndConditionsMandatory()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIsTermsAndConditionsMandatory()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingFantasyCompetition value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrandingType() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getBrandingType()));
                }
                if (!Intrinsics.c(value.getTermsAndConditionsUrl(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTermsAndConditionsUrl());
                }
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUrl()) + h;
                if (value.getBrand() != null) {
                    encodedSizeWithTag += Brand.ADAPTER.encodedSizeWithTag(5, value.getBrand());
                }
                int encodedSizeWithTag2 = ProtoAdapter.INT32.encodedSizeWithTag(6, value.getOddsProviderId()) + encodedSizeWithTag;
                return value.getIsTermsAndConditionsMandatory() ? ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIsTermsAndConditionsMandatory())) + encodedSizeWithTag2 : encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingFantasyCompetition redact(BrandingFantasyCompetition value) {
                value.getClass();
                Brand brand = value.getBrand();
                return BrandingFantasyCompetition.copy$default(value, 0, 0, null, null, brand != null ? Brand.ADAPTER.redact(brand) : null, null, false, gc2.d, 111, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingFantasyCompetition value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getIsTermsAndConditionsMandatory()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIsTermsAndConditionsMandatory()));
                }
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getOddsProviderId());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 5, (int) value.getBrand());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getUrl());
                if (!Intrinsics.c(value.getTermsAndConditionsUrl(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getTermsAndConditionsUrl());
                }
                if (value.getBrandingType() != 0) {
                    protoAdapter.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBrandingType()));
                }
                if (value.getId() != 0) {
                    protoAdapter.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingFantasyCompetition(int i, int i2, String str, String str2, Brand brand, Integer num, boolean z, gc2 gc2Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : brand, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingFantasyCompetition copy$default(BrandingFantasyCompetition brandingFantasyCompetition, int i, int i2, String str, String str2, Brand brand, Integer num, boolean z, gc2 gc2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = brandingFantasyCompetition.id;
        }
        if ((i3 & 2) != 0) {
            i2 = brandingFantasyCompetition.brandingType;
        }
        if ((i3 & 4) != 0) {
            str = brandingFantasyCompetition.termsAndConditionsUrl;
        }
        if ((i3 & 8) != 0) {
            str2 = brandingFantasyCompetition.url;
        }
        if ((i3 & 16) != 0) {
            brand = brandingFantasyCompetition.brand;
        }
        if ((i3 & 32) != 0) {
            num = brandingFantasyCompetition.oddsProviderId;
        }
        if ((i3 & 64) != 0) {
            z = brandingFantasyCompetition.isTermsAndConditionsMandatory;
        }
        if ((i3 & 128) != 0) {
            gc2Var = brandingFantasyCompetition.unknownFields();
        }
        boolean z2 = z;
        gc2 gc2Var2 = gc2Var;
        Brand brand2 = brand;
        Integer num2 = num;
        return brandingFantasyCompetition.copy(i, i2, str, str2, brand2, num2, z2, gc2Var2);
    }

    @NotNull
    public final BrandingFantasyCompetition copy(int id, int brandingType, @NotNull String termsAndConditionsUrl, @Nullable String url, @Nullable Brand brand, @Nullable Integer oddsProviderId, boolean isTermsAndConditionsMandatory, @NotNull gc2 unknownFields) {
        termsAndConditionsUrl.getClass();
        unknownFields.getClass();
        return new BrandingFantasyCompetition(id, brandingType, termsAndConditionsUrl, url, brand, oddsProviderId, isTermsAndConditionsMandatory, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingFantasyCompetition)) {
            return false;
        }
        BrandingFantasyCompetition brandingFantasyCompetition = (BrandingFantasyCompetition) other;
        return Intrinsics.c(unknownFields(), brandingFantasyCompetition.unknownFields()) && this.id == brandingFantasyCompetition.id && this.brandingType == brandingFantasyCompetition.brandingType && Intrinsics.c(this.termsAndConditionsUrl, brandingFantasyCompetition.termsAndConditionsUrl) && Intrinsics.c(this.url, brandingFantasyCompetition.url) && Intrinsics.c(this.brand, brandingFantasyCompetition.brand) && Intrinsics.c(this.oddsProviderId, brandingFantasyCompetition.oddsProviderId) && this.isTermsAndConditionsMandatory == brandingFantasyCompetition.isTermsAndConditionsMandatory;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    public final int getBrandingType() {
        return this.brandingType;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @NotNull
    public final String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
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
        int c = dmi.c(wv8.a(this.brandingType, wv8.a(this.id, unknownFields().hashCode() * 37, 37), 37), 37, this.termsAndConditionsUrl);
        String str = this.url;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 37;
        Brand brand = this.brand;
        int hashCode2 = (hashCode + (brand != null ? brand.hashCode() : 0)) * 37;
        Integer num = this.oddsProviderId;
        int hashCode3 = Boolean.hashCode(this.isTermsAndConditionsMandatory) + ((hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    /* renamed from: isTermsAndConditionsMandatory, reason: from getter */
    public final boolean getIsTermsAndConditionsMandatory() {
        return this.isTermsAndConditionsMandatory;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m682newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("brandingType=" + this.brandingType);
        mz1.A(arrayList, "termsAndConditionsUrl=", Internal.sanitize(this.termsAndConditionsUrl));
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        Brand brand = this.brand;
        if (brand != null) {
            arrayList.add("brand=" + brand);
        }
        Integer num = this.oddsProviderId;
        if (num != null) {
            arrayList.add("oddsProviderId=" + num);
        }
        arrayList.add("isTermsAndConditionsMandatory=" + this.isTermsAndConditionsMandatory);
        return CollectionsKt.f0(arrayList, ", ", "BrandingFantasyCompetition{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m682newBuilder();
    }

    public BrandingFantasyCompetition() {
        this(0, 0, null, null, null, null, false, null, 255, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingFantasyCompetition(int i, int i2, @NotNull String str, @Nullable String str2, @Nullable Brand brand, @Nullable Integer num, boolean z, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        str.getClass();
        gc2Var.getClass();
        this.id = i;
        this.brandingType = i2;
        this.termsAndConditionsUrl = str;
        this.url = str2;
        this.brand = brand;
        this.oddsProviderId = num;
        this.isTermsAndConditionsMandatory = z;
    }
}
