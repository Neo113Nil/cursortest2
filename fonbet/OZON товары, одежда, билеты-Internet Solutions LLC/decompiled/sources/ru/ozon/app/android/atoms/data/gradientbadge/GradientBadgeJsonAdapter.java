package ru.ozon.app.android.atoms.data.gradientbadge;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadgeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;", "nullableThemeTypeAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GradientBadgeJsonAdapter extends JsonAdapter<GradientBadge> {
    private volatile Constructor<GradientBadge> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<GradientBadge.ThemeType> nullableThemeTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GradientBadgeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("primaryText", "primaryTextColor", "primaryTextBackgroundColor", "secondaryText", "secondaryTextColor", "tertiaryText", "tertiaryTextColor", "gradientStart", "gradientEnd", "theme", "context", "testInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "primaryText");
        this.nullableStringAdapter = moshi.f(String.class, m11, "primaryTextBackgroundColor");
        this.nullableThemeTypeAdapter = moshi.f(GradientBadge.ThemeType.class, m11, "theme");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(GradientBadge)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GradientBadge fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        GradientBadge.ThemeType themeType = null;
        String str10 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            String str11 = str;
            String str12 = str2;
            if (!reader.hasNext()) {
                String str13 = str3;
                reader.endObject();
                if (i12 == -7261) {
                    if (str11 == null) {
                        throw c.j("primaryText", "primaryText", reader);
                    }
                    if (str12 == null) {
                        throw c.j("primaryTextColor", "primaryTextColor", reader);
                    }
                    Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
                    if (str8 == null) {
                        throw c.j("gradientStart", "gradientStart", reader);
                    }
                    if (str9 == null) {
                        throw c.j("gradientEnd", "gradientEnd", reader);
                    }
                    String str14 = str9;
                    String str15 = str8;
                    String str16 = str7;
                    return new GradientBadge(str11, str12, str13, str4, str5, str6, str16, str15, str14, themeType, str10, testInfo, map);
                }
                Constructor<GradientBadge> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = GradientBadge.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, GradientBadge.ThemeType.class, String.class, TestInfo.class, Map.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<GradientBadge> constructor2 = constructor;
                if (str11 == null) {
                    throw c.j("primaryText", "primaryText", reader);
                }
                if (str12 == null) {
                    throw c.j("primaryTextColor", "primaryTextColor", reader);
                }
                if (str8 == null) {
                    throw c.j("gradientStart", "gradientStart", reader);
                }
                if (str9 == null) {
                    throw c.j("gradientEnd", "gradientEnd", reader);
                }
                GradientBadge newInstance = constructor2.newInstance(str11, str12, str13, str4, str5, str6, str7, str8, str9, themeType, str10, testInfo, map, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str17 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("primaryText", "primaryText", reader);
                    }
                    str3 = str17;
                    str2 = str12;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("primaryTextColor", "primaryTextColor", reader);
                    }
                    str3 = str17;
                    str = str11;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    str = str11;
                    str2 = str12;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("secondaryText", "secondaryText", reader);
                    }
                    i12 &= -9;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 7:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("gradientStart", "gradientStart", reader);
                    }
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 8:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw c.q("gradientEnd", "gradientEnd", reader);
                    }
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 9:
                    themeType = this.nullableThemeTypeAdapter.fromJson(reader);
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 10:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 11:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -2049;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -4097;
                    str3 = str17;
                    str = str11;
                    str2 = str12;
                default:
                    str3 = str17;
                    str = str11;
                    str2 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GradientBadge value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("primaryText");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrimaryText());
        writer.w("primaryTextColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrimaryTextColor());
        writer.w("primaryTextBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPrimaryTextBackgroundColor());
        writer.w("secondaryText");
        this.stringAdapter.mo44toJson(writer, (x) value.getSecondaryText());
        writer.w("secondaryTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSecondaryTextColor());
        writer.w("tertiaryText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTertiaryText());
        writer.w("tertiaryTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTertiaryTextColor());
        writer.w("gradientStart");
        this.stringAdapter.mo44toJson(writer, (x) value.getGradientStart());
        writer.w("gradientEnd");
        this.stringAdapter.mo44toJson(writer, (x) value.getGradientEnd());
        writer.w("theme");
        this.nullableThemeTypeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
