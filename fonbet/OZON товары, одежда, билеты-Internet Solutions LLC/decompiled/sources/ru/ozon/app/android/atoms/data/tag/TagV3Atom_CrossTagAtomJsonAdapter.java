package ru.ozon.app.android.atoms.data.tag;

import Ak.b;
import Y9.c;
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
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/data/tag/TagV3Atom_CrossTagAtomJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/tag/TagV3Atom$CrossTagAtom;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/tag/TagV3Atom$CrossTagAtom;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/tag/TagV3Atom$CrossTagAtom;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;", "nullableThemeTypeAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagV3Atom_CrossTagAtomJsonAdapter extends JsonAdapter<TagV3Atom.CrossTagAtom> {
    public static final int $stable = 8;
    private volatile Constructor<TagV3Atom.CrossTagAtom> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<TagV3Atom.CrossTagAtom.ThemeType> nullableThemeTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TagV3Atom_CrossTagAtomJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "icon", "action", "crossAction", "crossTrackingInfo", "theme", "context", "testInfo", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<AtomActionDTO> f12 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f12;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f13 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "crossTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f13;
        JsonAdapter<TagV3Atom.CrossTagAtom.ThemeType> f14 = moshi.f(TagV3Atom.CrossTagAtom.ThemeType.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableThemeTypeAdapter = f14;
        JsonAdapter<TestInfo> f15 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTestInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(TagV3Atom.CrossTagAtom)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TagV3Atom.CrossTagAtom fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TagV3Atom.CrossTagAtom.ThemeType themeType = null;
        String str3 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
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
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    themeType = this.nullableThemeTypeAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -497) {
            Map<String, TokenizedTrackingInfo> map3 = map2;
            TestInfo testInfo2 = testInfo;
            String str4 = str3;
            TagV3Atom.CrossTagAtom.ThemeType themeType2 = themeType;
            Map<String, TokenizedTrackingInfo> map4 = map;
            AtomActionDTO atomActionDTO3 = atomActionDTO2;
            AtomActionDTO atomActionDTO4 = atomActionDTO;
            String str5 = str2;
            String str6 = str;
            if (str6 != null) {
                return new TagV3Atom.CrossTagAtom(str6, str5, atomActionDTO4, atomActionDTO3, map4, themeType2, str4, testInfo2, map3);
            }
            throw c.j("text", "text", reader);
        }
        Map<String, TokenizedTrackingInfo> map5 = map2;
        TestInfo testInfo3 = testInfo;
        String str7 = str3;
        TagV3Atom.CrossTagAtom.ThemeType themeType3 = themeType;
        Map<String, TokenizedTrackingInfo> map6 = map;
        AtomActionDTO atomActionDTO5 = atomActionDTO2;
        AtomActionDTO atomActionDTO6 = atomActionDTO;
        String str8 = str2;
        String str9 = str;
        Constructor<TagV3Atom.CrossTagAtom> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TagV3Atom.CrossTagAtom.class.getDeclaredConstructor(String.class, String.class, AtomActionDTO.class, AtomActionDTO.class, Map.class, TagV3Atom.CrossTagAtom.ThemeType.class, String.class, TestInfo.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw c.j("text", "text", reader);
        }
        TagV3Atom.CrossTagAtom newInstance = constructor.newInstance(str9, str8, atomActionDTO6, atomActionDTO5, map6, themeType3, str7, testInfo3, map5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TagV3Atom.CrossTagAtom value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("crossAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getCrossAction());
        writer.w("crossTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getCrossTrackingInfo());
        writer.w("theme");
        this.nullableThemeTypeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
