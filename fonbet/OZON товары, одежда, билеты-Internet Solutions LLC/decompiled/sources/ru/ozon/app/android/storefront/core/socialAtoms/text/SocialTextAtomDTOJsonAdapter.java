package ru.ozon.app.android.storefront.core.socialAtoms.text;

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
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/storefront/core/socialAtoms/text/TextTag;", "nullableListOfTextTagAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "iconPositionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SocialTextAtomDTOJsonAdapter extends JsonAdapter<SocialTextAtomDTO> {
    private volatile Constructor<SocialTextAtomDTO> constructorRef;

    @NotNull
    private final JsonAdapter<SocialTextAtomDTO.IconPosition> iconPositionAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<TextTag>> nullableListOfTextTagAdapter;

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

    public SocialTextAtomDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "textStyle", "textColor", "textTags", "maxLines", "icon", "iconTintColor", "iconPosition", "trackingInfo", "testInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "text");
        this.nullableListOfTextTagAdapter = moshi.f(D.e(List.class, TextTag.class), m11, "textTags");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLines");
        this.nullableStringAdapter = moshi.f(String.class, m11, "icon");
        this.iconPositionAdapter = moshi.f(SocialTextAtomDTO.IconPosition.class, m11, "iconPosition");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(SocialTextAtomDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SocialTextAtomDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<TextTag> list = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        SocialTextAtomDTO.IconPosition iconPosition = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
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
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textStyle", "textStyle", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("textColor", "textColor", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    list = this.nullableListOfTextTagAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    iconPosition = this.iconPositionAdapter.fromJson(reader);
                    if (iconPosition == null) {
                        throw c.q("iconPosition", "iconPosition", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 != -767) {
            String str6 = str;
            Constructor<SocialTextAtomDTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = SocialTextAtomDTO.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, Integer.class, String.class, String.class, SocialTextAtomDTO.IconPosition.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            if (str6 == null) {
                throw c.j("text", "text", reader);
            }
            SocialTextAtomDTO newInstance = constructor.newInstance(str6, str2, str3, list, num, str4, str5, iconPosition, map, testInfo, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        String str7 = str;
        if (str7 == null) {
            throw c.j("text", "text", reader);
        }
        Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(iconPosition, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO.IconPosition");
        Map<String, TokenizedTrackingInfo> map2 = map;
        SocialTextAtomDTO.IconPosition iconPosition2 = iconPosition;
        String str8 = str5;
        String str9 = str4;
        Integer num2 = num;
        return new SocialTextAtomDTO(str7, str2, str3, list, num2, str9, str8, iconPosition2, map2, testInfo);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SocialTextAtomDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("textStyle");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextStyle());
        writer.w("textColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("textTags");
        this.nullableListOfTextTagAdapter.mo44toJson(writer, (x) value.getTextTags());
        writer.w("maxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLines());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("iconPosition");
        this.iconPositionAdapter.mo44toJson(writer, (x) value.getIconPosition());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
