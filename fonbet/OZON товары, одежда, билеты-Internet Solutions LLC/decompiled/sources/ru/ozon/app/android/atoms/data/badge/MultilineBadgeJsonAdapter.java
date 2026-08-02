package ru.ozon.app.android.atoms.data.badge;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/MultilineBadgeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/badge/MultilineBadge;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/badge/MultilineBadge;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/badge/MultilineBadge;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;", "nullableThemeTypeAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "nullableBooleanAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultilineBadgeJsonAdapter extends JsonAdapter<MultilineBadge> {
    private volatile Constructor<MultilineBadge> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<MultilineBadge.ThemeType> nullableThemeTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MultilineBadgeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "maxLines", "theme", "backgroundColor", "action", "isFullWidth", "icon", "iconTintColor", "textStyle", "context", "testInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "text");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxLines");
        this.nullableThemeTypeAdapter = moshi.f(MultilineBadge.ThemeType.class, m11, "theme");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isFullWidth");
        this.stringAdapter = moshi.f(String.class, m11, "textStyle");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MultilineBadge fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        OzonSpannableString ozonSpannableString = null;
        MultilineBadge.ThemeType themeType = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str5 = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("maxLines", "maxLines", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    themeType = this.nullableThemeTypeAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textStyle", "textStyle", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3843) {
            Boolean bool2 = bool;
            MultilineBadge.ThemeType themeType2 = themeType;
            if (ozonSpannableString == null) {
                throw c.j("text", "text", reader);
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            int intValue = a11.intValue();
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            return new MultilineBadge(ozonSpannableString, intValue, themeType2, str, atomActionDTO2, bool2, str3, str4, str2, str5, testInfo, map);
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Boolean bool3 = bool;
        Map<String, TokenizedTrackingInfo> map2 = map;
        MultilineBadge.ThemeType themeType3 = themeType;
        String str6 = str2;
        Constructor<MultilineBadge> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = MultilineBadge.class.getDeclaredConstructor(OzonSpannableString.class, cls2, MultilineBadge.ThemeType.class, String.class, AtomActionDTO.class, Boolean.class, String.class, String.class, String.class, String.class, TestInfo.class, Map.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        MultilineBadge newInstance = constructor.newInstance(ozonSpannableString, a11, themeType3, str, atomActionDTO3, bool3, str3, str4, str6, str5, testInfo, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(MultilineBadge)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MultilineBadge value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("maxLines");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxLines()));
        writer.w("theme");
        this.nullableThemeTypeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("isFullWidth");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isFullWidth());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("textStyle");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextStyle());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
