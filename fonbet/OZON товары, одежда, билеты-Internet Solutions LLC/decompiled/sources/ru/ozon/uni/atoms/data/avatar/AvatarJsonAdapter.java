package ru.ozon.uni.atoms.data.avatar;

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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/uni/atoms/data/avatar/AvatarJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/avatar/Avatar;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;", "themeAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AvatarJsonAdapter extends JsonAdapter<Avatar> {
    public static final int $stable = 8;
    private volatile Constructor<Avatar> constructorRef;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

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
    private final JsonAdapter<Avatar.Theme> themeAdapter;

    public AvatarJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("backgroundColor", "initials", "icon", "theme", "context", "testInfo", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "initials");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Icon> f12 = moshi.f(Icon.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIconAdapter = f12;
        JsonAdapter<Avatar.Theme> f13 = moshi.f(Avatar.Theme.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.themeAdapter = f13;
        JsonAdapter<TestInfo> f14 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTestInfoAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(28, "GeneratedJsonAdapter(Avatar)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Avatar fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        Icon icon = null;
        Avatar.Theme theme = null;
        String str3 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 3:
                    theme = this.themeAdapter.fromJson(reader);
                    if (theme == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -122) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(theme, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.avatar.Avatar.Theme");
            Map<String, TokenizedTrackingInfo> map2 = map;
            TestInfo testInfo2 = testInfo;
            String str4 = str3;
            Avatar.Theme theme2 = theme;
            return new Avatar(str, str2, icon, theme2, str4, testInfo2, map2);
        }
        Constructor<Avatar> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Avatar.class.getDeclaredConstructor(String.class, String.class, Icon.class, Avatar.Theme.class, String.class, TestInfo.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Avatar newInstance = constructor.newInstance(str, str2, icon, theme, str3, testInfo, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Avatar value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("initials");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInitials());
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("theme");
        this.themeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
