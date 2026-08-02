package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146f7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0069c7 f13719a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0146f7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C0120e7 c0120e7) {
        ContentValues contentValues = new ContentValues();
        Long l6 = c0120e7.f13642a;
        if (l6 != null) {
            contentValues.put("session_id", Long.valueOf(l6.longValue()));
        }
        Vk vk = c0120e7.f13643b;
        if (vk != null) {
            contentValues.put("session_type", Integer.valueOf(vk.f13072a));
        }
        Long l10 = c0120e7.f13644c;
        if (l10 != null) {
            contentValues.put("number_in_session", Long.valueOf(l10.longValue()));
        }
        EnumC0047bb enumC0047bb = c0120e7.f13645d;
        if (enumC0047bb != null) {
            contentValues.put("type", Integer.valueOf(enumC0047bb.f13440a));
        }
        Long l11 = c0120e7.f13646e;
        if (l11 != null) {
            contentValues.put("global_number", Long.valueOf(l11.longValue()));
        }
        Long l12 = c0120e7.f13647f;
        if (l12 != null) {
            contentValues.put("time", Long.valueOf(l12.longValue()));
        }
        C0069c7 c0069c7 = this.f13719a;
        contentValues.put("event_description", MessageNano.toByteArray(c0069c7.f13502a.fromModel(c0120e7.f13648g)));
        return contentValues;
    }

    public C0146f7(@NotNull C0069c7 c0069c7) {
        this.f13719a = c0069c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0146f7(C0069c7 c0069c7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0069c7(null, 1, 0 == true ? 1 : 0) : c0069c7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0120e7 toModel(@NotNull ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0120e7(asLong, vk, asLong2, asInteger2 != null ? EnumC0047bb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f13719a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
