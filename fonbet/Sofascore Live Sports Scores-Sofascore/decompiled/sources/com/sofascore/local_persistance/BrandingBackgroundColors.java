package com.sofascore.local_persistance;

import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.duf;
import defpackage.gc2;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "Lcom/squareup/wire/Message;", "", "Lcom/sofascore/local_persistance/BrandGradientColors;", WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY, "dark", "Lgc2;", "unknownFields", "<init>", "(Lcom/sofascore/local_persistance/BrandGradientColors;Lcom/sofascore/local_persistance/BrandGradientColors;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/sofascore/local_persistance/BrandGradientColors;Lcom/sofascore/local_persistance/BrandGradientColors;Lgc2;)Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "Lcom/sofascore/local_persistance/BrandGradientColors;", "getLight", "()Lcom/sofascore/local_persistance/BrandGradientColors;", "getDark", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingBackgroundColors extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingBackgroundColors> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.BrandGradientColors#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final BrandGradientColors dark;

    @WireField(adapter = "com.sofascore.local_persistance.BrandGradientColors#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    @Nullable
    private final BrandGradientColors light;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingBackgroundColors.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingBackgroundColors>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingBackgroundColors$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingBackgroundColors decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                BrandGradientColors brandGradientColors = null;
                BrandGradientColors brandGradientColors2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingBackgroundColors(brandGradientColors, brandGradientColors2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        brandGradientColors = BrandGradientColors.ADAPTER.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        brandGradientColors2 = BrandGradientColors.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingBackgroundColors value) {
                writer.getClass();
                value.getClass();
                if (value.getLight() != null) {
                    BrandGradientColors.ADAPTER.encodeWithTag(writer, 1, (int) value.getLight());
                }
                if (value.getDark() != null) {
                    BrandGradientColors.ADAPTER.encodeWithTag(writer, 2, (int) value.getDark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingBackgroundColors value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getLight() != null) {
                    h += BrandGradientColors.ADAPTER.encodedSizeWithTag(1, value.getLight());
                }
                return value.getDark() != null ? BrandGradientColors.ADAPTER.encodedSizeWithTag(2, value.getDark()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingBackgroundColors redact(BrandingBackgroundColors value) {
                value.getClass();
                BrandGradientColors light = value.getLight();
                BrandGradientColors redact = light != null ? BrandGradientColors.ADAPTER.redact(light) : null;
                BrandGradientColors dark = value.getDark();
                return value.copy(redact, dark != null ? BrandGradientColors.ADAPTER.redact(dark) : null, gc2.d);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingBackgroundColors value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getDark() != null) {
                    BrandGradientColors.ADAPTER.encodeWithTag(writer, 2, (int) value.getDark());
                }
                if (value.getLight() != null) {
                    BrandGradientColors.ADAPTER.encodeWithTag(writer, 1, (int) value.getLight());
                }
            }
        };
    }

    public /* synthetic */ BrandingBackgroundColors(BrandGradientColors brandGradientColors, BrandGradientColors brandGradientColors2, gc2 gc2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : brandGradientColors, (i & 2) != 0 ? null : brandGradientColors2, (i & 4) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingBackgroundColors copy$default(BrandingBackgroundColors brandingBackgroundColors, BrandGradientColors brandGradientColors, BrandGradientColors brandGradientColors2, gc2 gc2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            brandGradientColors = brandingBackgroundColors.light;
        }
        if ((i & 2) != 0) {
            brandGradientColors2 = brandingBackgroundColors.dark;
        }
        if ((i & 4) != 0) {
            gc2Var = brandingBackgroundColors.unknownFields();
        }
        return brandingBackgroundColors.copy(brandGradientColors, brandGradientColors2, gc2Var);
    }

    @NotNull
    public final BrandingBackgroundColors copy(@Nullable BrandGradientColors light, @Nullable BrandGradientColors dark, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingBackgroundColors(light, dark, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingBackgroundColors)) {
            return false;
        }
        BrandingBackgroundColors brandingBackgroundColors = (BrandingBackgroundColors) other;
        return Intrinsics.c(unknownFields(), brandingBackgroundColors.unknownFields()) && Intrinsics.c(this.light, brandingBackgroundColors.light) && Intrinsics.c(this.dark, brandingBackgroundColors.dark);
    }

    @Nullable
    public final BrandGradientColors getDark() {
        return this.dark;
    }

    @Nullable
    public final BrandGradientColors getLight() {
        return this.light;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrandGradientColors brandGradientColors = this.light;
        int hashCode2 = (hashCode + (brandGradientColors != null ? brandGradientColors.hashCode() : 0)) * 37;
        BrandGradientColors brandGradientColors2 = this.dark;
        int hashCode3 = hashCode2 + (brandGradientColors2 != null ? brandGradientColors2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m678newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BrandGradientColors brandGradientColors = this.light;
        if (brandGradientColors != null) {
            arrayList.add("light=" + brandGradientColors);
        }
        BrandGradientColors brandGradientColors2 = this.dark;
        if (brandGradientColors2 != null) {
            arrayList.add("dark=" + brandGradientColors2);
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingBackgroundColors{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m678newBuilder();
    }

    public BrandingBackgroundColors() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingBackgroundColors(@Nullable BrandGradientColors brandGradientColors, @Nullable BrandGradientColors brandGradientColors2, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.light = brandGradientColors;
        this.dark = brandGradientColors2;
    }
}
