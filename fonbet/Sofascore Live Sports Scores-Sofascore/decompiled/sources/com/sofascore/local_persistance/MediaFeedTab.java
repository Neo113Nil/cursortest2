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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Lcom/sofascore/local_persistance/MediaFeedTab;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "", "url", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/MediaFeedTab;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/String;", "getUrl", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaFeedTab extends Message {

    @NotNull
    public static final ProtoAdapter<MediaFeedTab> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(MediaFeedTab.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MediaFeedTab>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.MediaFeedTab$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MediaFeedTab decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                int i = 0;
                Brand brand = null;
                String str = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new MediaFeedTab(i, brand, str, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (nextTag == 2) {
                        brand = Brand.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MediaFeedTab value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MediaFeedTab value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUrl()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MediaFeedTab redact(MediaFeedTab value) {
                value.getClass();
                Brand brand = value.getBrand();
                return MediaFeedTab.copy$default(value, 0, brand != null ? Brand.ADAPTER.redact(brand) : null, null, gc2.d, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MediaFeedTab value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUrl());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ MediaFeedTab(int i, Brand brand, String str, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ MediaFeedTab copy$default(MediaFeedTab mediaFeedTab, int i, Brand brand, String str, gc2 gc2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mediaFeedTab.id;
        }
        if ((i2 & 2) != 0) {
            brand = mediaFeedTab.brand;
        }
        if ((i2 & 4) != 0) {
            str = mediaFeedTab.url;
        }
        if ((i2 & 8) != 0) {
            gc2Var = mediaFeedTab.unknownFields();
        }
        return mediaFeedTab.copy(i, brand, str, gc2Var);
    }

    @NotNull
    public final MediaFeedTab copy(int id, @Nullable Brand brand, @Nullable String url, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new MediaFeedTab(id, brand, url, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MediaFeedTab)) {
            return false;
        }
        MediaFeedTab mediaFeedTab = (MediaFeedTab) other;
        return Intrinsics.c(unknownFields(), mediaFeedTab.unknownFields()) && this.id == mediaFeedTab.id && Intrinsics.c(this.brand, mediaFeedTab.brand) && Intrinsics.c(this.url, mediaFeedTab.url);
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
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
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m687newBuilder() {
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
        return CollectionsKt.f0(arrayList, ", ", "MediaFeedTab{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m687newBuilder();
    }

    public MediaFeedTab() {
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFeedTab(int i, @Nullable Brand brand, @Nullable String str, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.url = str;
    }
}
