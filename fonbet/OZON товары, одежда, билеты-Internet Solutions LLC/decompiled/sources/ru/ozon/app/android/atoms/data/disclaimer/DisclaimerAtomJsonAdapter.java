package ru.ozon.app.android.atoms.data.disclaimer;

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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtomJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header;", "nullableHeaderAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Body;", "bodyAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "nullableStringAdapter", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableListOfSmallBorderlessButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DisclaimerAtomJsonAdapter extends JsonAdapter<DisclaimerAtom> {

    @NotNull
    private final JsonAdapter<DisclaimerAtom.Body> bodyAdapter;
    private volatile Constructor<DisclaimerAtom> constructorRef;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom.Header> nullableHeaderAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.SmallBorderlessButton>> nullableListOfSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public DisclaimerAtomJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "body", "icon", "backgroundColor", "buttons", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableHeaderAdapter = moshi.f(DisclaimerAtom.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.bodyAdapter = moshi.f(DisclaimerAtom.Body.class, m11, "body");
        this.iconAdapter = moshi.f(Icon.class, m11, "icon");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableListOfSmallBorderlessButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.SmallBorderlessButton.class), m11, "buttons");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(DisclaimerAtom)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DisclaimerAtom fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        DisclaimerAtom.Header header = null;
        DisclaimerAtom.Body body = null;
        Icon icon = null;
        String str = null;
        List<ButtonV3Atom.SmallBorderlessButton> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    header = this.nullableHeaderAdapter.fromJson(reader);
                    break;
                case 1:
                    body = this.bodyAdapter.fromJson(reader);
                    if (body == null) {
                        throw c.q("body", "body", reader);
                    }
                    break;
                case 2:
                    icon = this.iconAdapter.fromJson(reader);
                    if (icon == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfSmallBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            List<ButtonV3Atom.SmallBorderlessButton> list2 = list;
            String str2 = str;
            Icon icon2 = icon;
            DisclaimerAtom.Body body2 = body;
            DisclaimerAtom.Header header2 = header;
            if (body2 == null) {
                throw c.j("body", "body", reader);
            }
            if (icon2 != null) {
                return new DisclaimerAtom(header2, body2, icon2, str2, list2, map2);
            }
            throw c.j("icon", "icon", reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        List<ButtonV3Atom.SmallBorderlessButton> list3 = list;
        String str3 = str;
        Icon icon3 = icon;
        DisclaimerAtom.Body body3 = body;
        DisclaimerAtom.Header header3 = header;
        Constructor<DisclaimerAtom> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DisclaimerAtom.class.getDeclaredConstructor(DisclaimerAtom.Header.class, DisclaimerAtom.Body.class, Icon.class, String.class, List.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (body3 == null) {
            throw c.j("body", "body", reader);
        }
        if (icon3 == null) {
            throw c.j("icon", "icon", reader);
        }
        DisclaimerAtom newInstance = constructor.newInstance(header3, body3, icon3, str3, list3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DisclaimerAtom value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("body");
        this.bodyAdapter.mo44toJson(writer, (x) value.getBody());
        writer.w("icon");
        this.iconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("buttons");
        this.nullableListOfSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
