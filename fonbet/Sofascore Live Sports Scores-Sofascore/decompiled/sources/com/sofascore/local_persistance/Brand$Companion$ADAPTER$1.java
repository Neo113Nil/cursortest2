package com.sofascore.local_persistance;

import com.ironsource.U3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.gc2;
import defpackage.joa;
import defpackage.vs1;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"com/sofascore/local_persistance/Brand$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/sofascore/local_persistance/Brand;", U3.i.X, "", "encodedSize", "(Lcom/sofascore/local_persistance/Brand;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "encode", "(Lcom/squareup/wire/ProtoWriter;Lcom/sofascore/local_persistance/Brand;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/sofascore/local_persistance/Brand;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lcom/sofascore/local_persistance/Brand;", "redact", "(Lcom/sofascore/local_persistance/Brand;)Lcom/sofascore/local_persistance/Brand;", "", "", "standingsTextAdapter$delegate", "Ljoa;", "getStandingsTextAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "standingsTextAdapter", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Brand$Companion$ADAPTER$1 extends ProtoAdapter<Brand> {

    /* renamed from: standingsTextAdapter$delegate, reason: from kotlin metadata */
    private final joa standingsTextAdapter;

    public Brand$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<Brand> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/Brand", syntax, (Object) null, "branding_config.proto");
        this.standingsTextAdapter = ypa.b(new vs1(19));
    }

    private final ProtoAdapter<Map<String, String>> getStandingsTextAdapter() {
        return (ProtoAdapter) this.standingsTextAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter standingsTextAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Brand decode(ProtoReader reader) {
        reader.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        int i = 0;
        String str = "";
        BrandColors brandColors = null;
        BrandColors brandColors2 = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = "";
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new Brand(i, str, str3, brandColors, brandColors2, linkedHashMap, bool, str2, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    i = ProtoAdapter.INT32.decode(reader).intValue();
                    break;
                case 2:
                    str = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    str3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    brandColors = BrandColors.ADAPTER.decode(reader);
                    break;
                case 5:
                    brandColors2 = BrandColors.ADAPTER.decode(reader);
                    break;
                case 6:
                    linkedHashMap.putAll(getStandingsTextAdapter().decode(reader));
                    break;
                case 7:
                    bool = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 8:
                    str2 = ProtoAdapter.STRING.decode(reader);
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Brand value) {
        writer.getClass();
        value.getClass();
        if (value.getId() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
        }
        if (!Intrinsics.c(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (!Intrinsics.c(value.getSlug(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSlug());
        }
        if (value.getColor() != null) {
            BrandColors.ADAPTER.encodeWithTag(writer, 4, (int) value.getColor());
        }
        if (value.getTextColor() != null) {
            BrandColors.ADAPTER.encodeWithTag(writer, 5, (int) value.getTextColor());
        }
        getStandingsTextAdapter().encodeWithTag(writer, 6, (int) value.getStandingsText());
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) value.getShowBettingAge());
        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getUrl());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Brand value) {
        value.getClass();
        int h = value.unknownFields().h();
        if (value.getId() != 0) {
            h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
        }
        if (!Intrinsics.c(value.getName(), "")) {
            h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
        }
        if (!Intrinsics.c(value.getSlug(), "")) {
            h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSlug());
        }
        if (value.getColor() != null) {
            h += BrandColors.ADAPTER.encodedSizeWithTag(4, value.getColor());
        }
        if (value.getTextColor() != null) {
            h += BrandColors.ADAPTER.encodedSizeWithTag(5, value.getTextColor());
        }
        return ProtoAdapter.STRING.encodedSizeWithTag(8, value.getUrl()) + ProtoAdapter.BOOL.encodedSizeWithTag(7, value.getShowBettingAge()) + getStandingsTextAdapter().encodedSizeWithTag(6, value.getStandingsText()) + h;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Brand redact(Brand value) {
        value.getClass();
        BrandColors color = value.getColor();
        BrandColors redact = color != null ? BrandColors.ADAPTER.redact(color) : null;
        BrandColors textColor = value.getTextColor();
        return Brand.copy$default(value, 0, null, null, redact, textColor != null ? BrandColors.ADAPTER.redact(textColor) : null, null, null, null, gc2.d, 231, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Brand value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 8, (int) value.getUrl());
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) value.getShowBettingAge());
        getStandingsTextAdapter().encodeWithTag(writer, 6, (int) value.getStandingsText());
        if (value.getTextColor() != null) {
            BrandColors.ADAPTER.encodeWithTag(writer, 5, (int) value.getTextColor());
        }
        if (value.getColor() != null) {
            BrandColors.ADAPTER.encodeWithTag(writer, 4, (int) value.getColor());
        }
        if (!Intrinsics.c(value.getSlug(), "")) {
            protoAdapter.encodeWithTag(writer, 3, (int) value.getSlug());
        }
        if (!Intrinsics.c(value.getName(), "")) {
            protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
        }
        if (value.getId() != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
        }
    }
}
