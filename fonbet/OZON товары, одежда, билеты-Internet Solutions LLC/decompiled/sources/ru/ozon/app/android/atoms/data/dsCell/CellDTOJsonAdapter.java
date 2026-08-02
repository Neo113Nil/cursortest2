package ru.ozon.app.android.atoms.data.dsCell;

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
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/dsCell/CellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/dsCell/CellDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/dsCell/CellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$CenterBlock;", "centerBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$Settings;", "nullableSettingsAdapter", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$LeftBlock;", "nullableLeftBlockAdapter", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$RightBlock;", "nullableRightBlockAdapter", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellDTOJsonAdapter extends JsonAdapter<CellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.CenterBlock> centerBlockAdapter;
    private volatile Constructor<CellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.LeftBlock> nullableLeftBlockAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.RightBlock> nullableRightBlockAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.Settings> nullableSettingsAdapter;

    @NotNull
    private final n.a options;

    public CellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("centerBlock", "settings", "leftBlock", "rightBlock", "common", "tagSupported");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CellDTO.CenterBlock> f7 = moshi.f(CellDTO.CenterBlock.class, m11, "centerBlock");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.centerBlockAdapter = f7;
        JsonAdapter<CellDTO.Settings> f11 = moshi.f(CellDTO.Settings.class, m11, "settings");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSettingsAdapter = f11;
        JsonAdapter<CellDTO.LeftBlock> f12 = moshi.f(CellDTO.LeftBlock.class, m11, "leftBlock");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLeftBlockAdapter = f12;
        JsonAdapter<CellDTO.RightBlock> f13 = moshi.f(CellDTO.RightBlock.class, m11, "rightBlock");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableRightBlockAdapter = f13;
        JsonAdapter<CommonControlSettings> f14 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.TYPE, m11, "tagSupported");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.booleanAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(CellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO fromJson(@NotNull n reader) {
        CellDTO newInstance;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        int i11 = -1;
        CellDTO.CenterBlock centerBlock = null;
        CellDTO.Settings settings = null;
        CellDTO.LeftBlock leftBlock = null;
        CellDTO.RightBlock rightBlock = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    centerBlock = this.centerBlockAdapter.fromJson(reader);
                    if (centerBlock == null) {
                        throw c.q("centerBlock", "centerBlock", reader);
                    }
                    break;
                case 1:
                    settings = this.nullableSettingsAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    leftBlock = this.nullableLeftBlockAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    rightBlock = this.nullableRightBlockAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("tagSupported", "tagSupported", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -31) {
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            CellDTO.RightBlock rightBlock2 = rightBlock;
            CellDTO.LeftBlock leftBlock2 = leftBlock;
            CellDTO.Settings settings2 = settings;
            CellDTO.CenterBlock centerBlock2 = centerBlock;
            if (centerBlock2 == null) {
                throw c.j("centerBlock", "centerBlock", reader);
            }
            newInstance = new CellDTO(centerBlock2, settings2, leftBlock2, rightBlock2, commonControlSettings2);
        } else {
            CommonControlSettings commonControlSettings3 = commonControlSettings;
            CellDTO.RightBlock rightBlock3 = rightBlock;
            CellDTO.LeftBlock leftBlock3 = leftBlock;
            CellDTO.Settings settings3 = settings;
            CellDTO.CenterBlock centerBlock3 = centerBlock;
            Constructor<CellDTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = CellDTO.class.getDeclaredConstructor(CellDTO.CenterBlock.class, CellDTO.Settings.class, CellDTO.LeftBlock.class, CellDTO.RightBlock.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor<CellDTO> constructor2 = constructor;
            if (centerBlock3 == null) {
                throw c.j("centerBlock", "centerBlock", reader);
            }
            newInstance = constructor2.newInstance(centerBlock3, settings3, leftBlock3, rightBlock3, commonControlSettings3, Integer.valueOf(i11), null);
        }
        newInstance.setTagSupported(bool != null ? bool.booleanValue() : newInstance.getTagSupported());
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("centerBlock");
        this.centerBlockAdapter.mo44toJson(writer, (x) value_.getCenterBlock());
        writer.w("settings");
        this.nullableSettingsAdapter.mo44toJson(writer, (x) value_.getSettings());
        writer.w("leftBlock");
        this.nullableLeftBlockAdapter.mo44toJson(writer, (x) value_.getLeftBlock());
        writer.w("rightBlock");
        this.nullableRightBlockAdapter.mo44toJson(writer, (x) value_.getRightBlock());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("tagSupported");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getTagSupported()));
        writer.p();
    }
}
