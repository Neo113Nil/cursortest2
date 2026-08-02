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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0015\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006&"}, d2 = {"Lcom/sofascore/local_persistance/BrandingOddsTab;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "", "oddsTab", "", "url", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/BrandingOddsTab;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/Boolean;", "getOddsTab", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getUrl", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingOddsTab extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingOddsTab> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    @Nullable
    private final Boolean oddsTab;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingOddsTab.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingOddsTab>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingOddsTab$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingOddsTab decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Brand brand = null;
                int i = 0;
                Boolean bool = null;
                String str = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingOddsTab(i, brand, bool, str, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (nextTag == 2) {
                        brand = Brand.ADAPTER.decode(reader);
                    } else if (nextTag == 3) {
                        bool = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingOddsTab value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getOddsTab());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingOddsTab value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUrl()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getOddsTab()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingOddsTab redact(BrandingOddsTab value) {
                value.getClass();
                Brand brand = value.getBrand();
                return BrandingOddsTab.copy$default(value, 0, brand != null ? Brand.ADAPTER.redact(brand) : null, null, null, gc2.d, 13, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingOddsTab value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getOddsTab());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingOddsTab(int i, Brand brand, Boolean bool, String str, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingOddsTab copy$default(BrandingOddsTab brandingOddsTab, int i, Brand brand, Boolean bool, String str, gc2 gc2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = brandingOddsTab.id;
        }
        if ((i2 & 2) != 0) {
            brand = brandingOddsTab.brand;
        }
        if ((i2 & 4) != 0) {
            bool = brandingOddsTab.oddsTab;
        }
        if ((i2 & 8) != 0) {
            str = brandingOddsTab.url;
        }
        if ((i2 & 16) != 0) {
            gc2Var = brandingOddsTab.unknownFields();
        }
        gc2 gc2Var2 = gc2Var;
        Boolean bool2 = bool;
        return brandingOddsTab.copy(i, brand, bool2, str, gc2Var2);
    }

    @NotNull
    public final BrandingOddsTab copy(int id, @Nullable Brand brand, @Nullable Boolean oddsTab, @Nullable String url, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingOddsTab(id, brand, oddsTab, url, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingOddsTab)) {
            return false;
        }
        BrandingOddsTab brandingOddsTab = (BrandingOddsTab) other;
        return Intrinsics.c(unknownFields(), brandingOddsTab.unknownFields()) && this.id == brandingOddsTab.id && Intrinsics.c(this.brand, brandingOddsTab.brand) && Intrinsics.c(this.oddsTab, brandingOddsTab.oddsTab) && Intrinsics.c(this.url, brandingOddsTab.url);
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getOddsTab() {
        return this.oddsTab;
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
        Boolean bool = this.oddsTab;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m684newBuilder() {
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
        Boolean bool = this.oddsTab;
        if (bool != null) {
            mz1.y("oddsTab=", bool, arrayList);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingOddsTab{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m684newBuilder();
    }

    public BrandingOddsTab() {
        this(0, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingOddsTab(int i, @Nullable Brand brand, @Nullable Boolean bool, @Nullable String str, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.oddsTab = bool;
        this.url = str;
    }
}
