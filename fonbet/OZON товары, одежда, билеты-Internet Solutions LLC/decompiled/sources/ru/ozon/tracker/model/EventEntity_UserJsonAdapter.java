package ru.ozon.tracker.model;

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
import ru.ozon.tracker.model.EventEntity;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/model/EventEntity_UserJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$User;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$User;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$User;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_UserJsonAdapter extends JsonAdapter<EventEntity.User> {
    private volatile Constructor<EventEntity.User> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public EventEntity_UserJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("abGroup", "regionId", "clientId", "companyId", "appBuildNumber", "googleId", "appsflyerId", "firebaseInstallId", "longCookie", "role", "marketplaceId", "achievement_id");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.class, m11, "abGroup");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableIntAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.class, m11, "regionId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLongAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "clientId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(EventEntity.User)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.User fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Integer num = null;
        Long l11 = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            String str9 = str5;
            String str10 = str4;
            String str11 = str3;
            String str12 = str2;
            Integer num4 = num3;
            Integer num5 = num2;
            return new EventEntity.User(num, l11, str, num5, num4, str12, str11, str10, str9, str6, str7, str8);
        }
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        String str16 = str2;
        Integer num6 = num3;
        Integer num7 = num2;
        String str17 = str;
        Long l12 = l11;
        Integer num8 = num;
        Constructor<EventEntity.User> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventEntity.User.class.getDeclaredConstructor(Integer.class, Long.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        EventEntity.User newInstance = constructor.newInstance(num8, l12, str17, num7, num6, str16, str15, str14, str13, str6, str7, str8, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.User value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("abGroup");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAbGroup());
        writer.w("regionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getRegionId());
        writer.w("clientId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getClientId());
        writer.w("companyId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCompanyId());
        writer.w("appBuildNumber");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAppBuildNumber());
        writer.w("googleId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getGoogleId());
        writer.w("appsflyerId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAppsflyerId());
        writer.w("firebaseInstallId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirebaseInstallId());
        writer.w("longCookie");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLongCookie());
        writer.w("role");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRole());
        writer.w("marketplaceId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMarketplaceId());
        writer.w("achievement_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAchievementId());
        writer.p();
    }
}
