package ru.ozon.app.android.storefront.core.socialAtoms.badge;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "styleAdapter", "", "listOfStringAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;", "gradientAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialBadgeAtomDTOJsonAdapter extends JsonAdapter<SocialBadgeAtomDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SocialBadgeAtomDTO> constructorRef;

    @NotNull
    private final JsonAdapter<SocialBadgeAtomDTO.Gradient> gradientAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<SocialBadgeAtomDTO.Style> styleAdapter;

    public SocialBadgeAtomDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "textColor", "icon", "iconTintColor", "showArrow", "arrowColor", "style", "backgroundColors", "gradientStyle", "action", "trackingInfo", "testInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "text");
        this.nullableStringAdapter = moshi.f(String.class, m11, "icon");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showArrow");
        this.styleAdapter = moshi.f(SocialBadgeAtomDTO.Style.class, m11, "style");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "backgroundColors");
        this.gradientAdapter = moshi.f(SocialBadgeAtomDTO.Gradient.class, m11, "gradientStyle");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(SocialBadgeAtomDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SocialBadgeAtomDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        SocialBadgeAtomDTO.Style style = null;
        List<String> list = null;
        SocialBadgeAtomDTO.Gradient gradient = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            String str6 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("text", "text", reader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textColor", "textColor", reader);
                    }
                    i12 &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("showArrow", "showArrow", reader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    style = this.styleAdapter.fromJson(reader);
                    if (style == null) {
                        throw c.q("style", "style", reader);
                    }
                    i12 &= -65;
                    break;
                case 7:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("backgroundColors", "backgroundColors", reader);
                    }
                    i12 &= -129;
                    break;
                case 8:
                    gradient = this.gradientAdapter.fromJson(reader);
                    if (gradient == null) {
                        throw c.q("gradientStyle", "gradientStyle", reader);
                    }
                    i12 &= -257;
                    break;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 11:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
            }
            str = str6;
        }
        String str7 = str;
        reader.endObject();
        if (i12 == -3055) {
            if (str7 == null) {
                throw c.j("text", "text", reader);
            }
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            if (bool == null) {
                throw c.j("showArrow", "showArrow", reader);
            }
            String str8 = str5;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.g(style, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Style");
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Intrinsics.g(gradient, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Gradient");
            return new SocialBadgeAtomDTO(str7, str2, str3, str4, booleanValue, str8, style, list, gradient, atomActionDTO, map, testInfo);
        }
        Constructor<SocialBadgeAtomDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = SocialBadgeAtomDTO.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, SocialBadgeAtomDTO.Style.class, List.class, SocialBadgeAtomDTO.Gradient.class, AtomActionDTO.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<SocialBadgeAtomDTO> constructor2 = constructor;
        if (str7 == null) {
            throw c.j("text", "text", reader);
        }
        if (bool == null) {
            throw c.j("showArrow", "showArrow", reader);
        }
        SocialBadgeAtomDTO newInstance = constructor2.newInstance(str7, str2, str3, str4, bool, str5, style, list, gradient, atomActionDTO, map, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SocialBadgeAtomDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("textColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("showArrow");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowArrow()));
        writer.w("arrowColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getArrowColor());
        writer.w("style");
        this.styleAdapter.mo44toJson(writer, (x) value.getStyle());
        writer.w("backgroundColors");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getBackgroundColors());
        writer.w("gradientStyle");
        this.gradientAdapter.mo44toJson(writer, (x) value.getGradientStyle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
