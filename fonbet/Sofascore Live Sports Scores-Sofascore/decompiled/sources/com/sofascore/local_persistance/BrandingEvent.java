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
import com.vungle.ads.internal.protos.Sdk;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001c\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b/\u0010\u001c¨\u00061"}, d2 = {"Lcom/sofascore/local_persistance/BrandingEvent;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "", "url", "Lcom/sofascore/local_persistance/BrandingBoostedOdds;", "boostedOdds", "", "bettorsOnly", "oddsProviderId", "offerType", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/String;Lcom/sofascore/local_persistance/BrandingBoostedOdds;ZLjava/lang/Integer;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/String;Lcom/sofascore/local_persistance/BrandingBoostedOdds;ZLjava/lang/Integer;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/BrandingEvent;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/String;", "getUrl", "Lcom/sofascore/local_persistance/BrandingBoostedOdds;", "getBoostedOdds", "()Lcom/sofascore/local_persistance/BrandingBoostedOdds;", "Z", "getBettorsOnly", "()Z", "Ljava/lang/Integer;", "getOddsProviderId", "()Ljava/lang/Integer;", "getOfferType", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingEvent extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final boolean bettorsOnly;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingBoostedOdds#ADAPTER", schemaIndex = 3, tag = 5)
    @Nullable
    private final BrandingBoostedOdds boostedOdds;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 7)
    @Nullable
    private final Integer oddsProviderId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 8)
    @Nullable
    private final String offerType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 4)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingEvent$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingEvent decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Brand brand = null;
                int i = 0;
                boolean z = false;
                String str = null;
                BrandingBoostedOdds brandingBoostedOdds = null;
                Integer num = null;
                String str2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingEvent(i, brand, str, brandingBoostedOdds, z, num, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            i = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 2:
                            brand = Brand.ADAPTER.decode(reader);
                            break;
                        case 3:
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                        case 4:
                            str = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            brandingBoostedOdds = BrandingBoostedOdds.ADAPTER.decode(reader);
                            break;
                        case 6:
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 7:
                            num = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 8:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingEvent value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getUrl());
                BrandingBoostedOdds.ADAPTER.encodeWithTag(writer, 5, (int) value.getBoostedOdds());
                if (value.getBettorsOnly()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getBettorsOnly()));
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) value.getOddsProviderId());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getOfferType());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingEvent value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag = BrandingBoostedOdds.ADAPTER.encodedSizeWithTag(5, value.getBoostedOdds()) + protoAdapter.encodedSizeWithTag(4, value.getUrl()) + h;
                if (value.getBettorsOnly()) {
                    encodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getBettorsOnly()));
                }
                return protoAdapter.encodedSizeWithTag(8, value.getOfferType()) + ProtoAdapter.INT32.encodedSizeWithTag(7, value.getOddsProviderId()) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingEvent redact(BrandingEvent value) {
                value.getClass();
                Brand brand = value.getBrand();
                Brand redact = brand != null ? Brand.ADAPTER.redact(brand) : null;
                BrandingBoostedOdds boostedOdds = value.getBoostedOdds();
                return BrandingEvent.copy$default(value, 0, redact, null, boostedOdds != null ? BrandingBoostedOdds.ADAPTER.redact(boostedOdds) : null, false, null, null, gc2.d, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingEvent value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getOfferType());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getOddsProviderId());
                if (value.getBettorsOnly()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getBettorsOnly()));
                }
                BrandingBoostedOdds.ADAPTER.encodeWithTag(writer, 5, (int) value.getBoostedOdds());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getUrl());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    protoAdapter2.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingEvent(int i, Brand brand, String str, BrandingBoostedOdds brandingBoostedOdds, boolean z, Integer num, String str2, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : brandingBoostedOdds, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingEvent copy$default(BrandingEvent brandingEvent, int i, Brand brand, String str, BrandingBoostedOdds brandingBoostedOdds, boolean z, Integer num, String str2, gc2 gc2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = brandingEvent.id;
        }
        if ((i2 & 2) != 0) {
            brand = brandingEvent.brand;
        }
        if ((i2 & 4) != 0) {
            str = brandingEvent.url;
        }
        if ((i2 & 8) != 0) {
            brandingBoostedOdds = brandingEvent.boostedOdds;
        }
        if ((i2 & 16) != 0) {
            z = brandingEvent.bettorsOnly;
        }
        if ((i2 & 32) != 0) {
            num = brandingEvent.oddsProviderId;
        }
        if ((i2 & 64) != 0) {
            str2 = brandingEvent.offerType;
        }
        if ((i2 & 128) != 0) {
            gc2Var = brandingEvent.unknownFields();
        }
        String str3 = str2;
        gc2 gc2Var2 = gc2Var;
        boolean z2 = z;
        Integer num2 = num;
        return brandingEvent.copy(i, brand, str, brandingBoostedOdds, z2, num2, str3, gc2Var2);
    }

    @NotNull
    public final BrandingEvent copy(int id, @Nullable Brand brand, @Nullable String url, @Nullable BrandingBoostedOdds boostedOdds, boolean bettorsOnly, @Nullable Integer oddsProviderId, @Nullable String offerType, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingEvent(id, brand, url, boostedOdds, bettorsOnly, oddsProviderId, offerType, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingEvent)) {
            return false;
        }
        BrandingEvent brandingEvent = (BrandingEvent) other;
        return Intrinsics.c(unknownFields(), brandingEvent.unknownFields()) && this.id == brandingEvent.id && Intrinsics.c(this.brand, brandingEvent.brand) && Intrinsics.c(this.url, brandingEvent.url) && Intrinsics.c(this.boostedOdds, brandingEvent.boostedOdds) && this.bettorsOnly == brandingEvent.bettorsOnly && Intrinsics.c(this.oddsProviderId, brandingEvent.oddsProviderId) && Intrinsics.c(this.offerType, brandingEvent.offerType);
    }

    public final boolean getBettorsOnly() {
        return this.bettorsOnly;
    }

    @Nullable
    public final BrandingBoostedOdds getBoostedOdds() {
        return this.boostedOdds;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    public final String getOfferType() {
        return this.offerType;
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
        int a = wv8.a(this.id, unknownFields().hashCode() * 37, 37);
        Brand brand = this.brand;
        int hashCode = (a + (brand != null ? brand.hashCode() : 0)) * 37;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BrandingBoostedOdds brandingBoostedOdds = this.boostedOdds;
        int e = dmi.e((hashCode2 + (brandingBoostedOdds != null ? brandingBoostedOdds.hashCode() : 0)) * 37, 37, this.bettorsOnly);
        Integer num = this.oddsProviderId;
        int hashCode3 = (e + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str2 = this.offerType;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m681newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        Brand brand = this.brand;
        if (brand != null) {
            arrayList.add("brand=" + brand);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        BrandingBoostedOdds brandingBoostedOdds = this.boostedOdds;
        if (brandingBoostedOdds != null) {
            arrayList.add("boostedOdds=" + brandingBoostedOdds);
        }
        arrayList.add("bettorsOnly=" + this.bettorsOnly);
        Integer num = this.oddsProviderId;
        if (num != null) {
            arrayList.add("oddsProviderId=" + num);
        }
        String str2 = this.offerType;
        if (str2 != null) {
            mz1.A(arrayList, "offerType=", Internal.sanitize(str2));
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingEvent{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m681newBuilder();
    }

    public BrandingEvent() {
        this(0, null, null, null, false, null, null, null, 255, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingEvent(int i, @Nullable Brand brand, @Nullable String str, @Nullable BrandingBoostedOdds brandingBoostedOdds, boolean z, @Nullable Integer num, @Nullable String str2, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.url = str;
        this.boostedOdds = brandingBoostedOdds;
        this.bettorsOnly = z;
        this.oddsProviderId = num;
        this.offerType = str2;
    }
}
