package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthPermissionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthPermissions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthPermissions;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthPermissions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthPermissionsJsonAdapter extends JsonAdapter<HealthPermissions> {
    private volatile Constructor<HealthPermissions> constructorRef;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HealthPermissionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("camera", "push", "calls", "geo", "bio", "contacts", "sms", "calendar", "motion", "gallery", "audio");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "camera");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "calendar");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(HealthPermissions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthPermissions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("calendar", "calendar", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw c.q("motion", "motion", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    str10 = this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw c.q("gallery", "gallery", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    str11 = this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw c.q("audio", "audio", reader);
                    }
                    i11 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1985) {
            String str12 = str7;
            String str13 = str6;
            String str14 = str5;
            String str15 = str4;
            String str16 = str3;
            String str17 = str2;
            Intrinsics.g(str8, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str9, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str10, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str11, "null cannot be cast to non-null type kotlin.String");
            return new HealthPermissions(str, str17, str16, str15, str14, str13, str12, str8, str9, str10, str11);
        }
        String str18 = str7;
        String str19 = str6;
        String str20 = str5;
        String str21 = str4;
        String str22 = str3;
        String str23 = str2;
        String str24 = str;
        Constructor<HealthPermissions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HealthPermissions.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HealthPermissions newInstance = constructor.newInstance(str24, str23, str22, str21, str20, str19, str18, str8, str9, str10, str11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthPermissions value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("camera");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCamera());
        writer.w("push");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPush());
        writer.w("calls");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCalls());
        writer.w("geo");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getGeo());
        writer.w("bio");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBio());
        writer.w("contacts");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContacts());
        writer.w("sms");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSms());
        writer.w("calendar");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCalendar());
        writer.w("motion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMotion());
        writer.w("gallery");
        this.stringAdapter.mo44toJson(writer, (x) value_.getGallery());
        writer.w("audio");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAudio());
        writer.p();
    }
}
