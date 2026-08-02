package ru.ozon.app.android.session.userSocialsMobile.data.item;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO_SocialDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "avatarAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO$SocialDTO$UnbindButtonDTO;", "nullableUnbindButtonDTOAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSocialsMobileDTO_SocialDTOJsonAdapter extends JsonAdapter<UserSocialsMobileDTO.SocialDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Avatar> avatarAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO> nullableUnbindButtonDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public UserSocialsMobileDTO_SocialDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "logo", "description", "unbindButton");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.avatarAdapter = moshi.f(Avatar.class, m11, "logo");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.nullableUnbindButtonDTOAdapter = moshi.f(UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO.class, m11, "unbindButton");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(UserSocialsMobileDTO.SocialDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UserSocialsMobileDTO.SocialDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        Avatar avatar = null;
        TextAtom textAtom2 = null;
        UserSocialsMobileDTO.SocialDTO.UnbindButtonDTO unbindButtonDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                avatar = this.avatarAdapter.fromJson(reader);
                if (avatar == null) {
                    throw c.q("logo", "logo", reader);
                }
            } else if (v11 == 2) {
                textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 3) {
                unbindButtonDTO = this.nullableUnbindButtonDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (avatar != null) {
            return new UserSocialsMobileDTO.SocialDTO(textAtom, avatar, textAtom2, unbindButtonDTO);
        }
        throw c.j("logo", "logo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UserSocialsMobileDTO.SocialDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("logo");
        this.avatarAdapter.mo44toJson(writer, (x) value.getLogo());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("unbindButton");
        this.nullableUnbindButtonDTOAdapter.mo44toJson(writer, (x) value.getUnbindButton());
        writer.p();
    }
}
