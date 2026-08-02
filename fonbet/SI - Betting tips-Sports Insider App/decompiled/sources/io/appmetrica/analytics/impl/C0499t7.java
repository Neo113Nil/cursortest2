package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499t7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0425q7 f14669a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0499t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C0474s7 c0474s7) {
        ContentValues contentValues = new ContentValues();
        Long l6 = c0474s7.f14616a;
        if (l6 != null) {
            contentValues.put("id", Long.valueOf(l6.longValue()));
        }
        Vk vk = c0474s7.f14617b;
        if (vk != null) {
            contentValues.put("type", Integer.valueOf(vk.f13072a));
        }
        String str = c0474s7.f14618c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0425q7 c0425q7 = this.f14669a;
        contentValues.put("session_description", MessageNano.toByteArray(c0425q7.f14503a.fromModel(c0474s7.f14619d)));
        return contentValues;
    }

    public C0499t7(@NotNull C0425q7 c0425q7) {
        this.f14669a = c0425q7;
    }

    public /* synthetic */ C0499t7(C0425q7 c0425q7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0425q7(null, 1, null) : c0425q7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0474s7 toModel(@NotNull ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        return new C0474s7(asLong, vk, contentValues.getAsString("report_request_parameters"), this.f14669a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
