package ru.ozon.app.android.ugc.widgets.profileHeader.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.profileHeader.data.ProfileHeaderDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;", "profileHeaderStatDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "nullableIconButtonV3DTOAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileHeaderDTOJsonAdapter extends JsonAdapter<ProfileHeaderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProfileHeaderDTO.ProfileHeaderStatDTO> profileHeaderStatDTOAdapter;

    public ProfileHeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("avatar", "avatarAction", "avatarTrackingInfo", "leftCount", "middleCount", "rightCount", "shareButton", "settingsButton", "isActionPositive", "positiveActionButton", "negativeActionButton", "trackingInfo");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "avatar");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "avatarAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "avatarTrackingInfo");
        this.profileHeaderStatDTOAdapter = moshi.f(ProfileHeaderDTO.ProfileHeaderStatDTO.class, m11, "leftCount");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "shareButton");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "settingsButton");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isActionPositive");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "positiveActionButton");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(ProfileHeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProfileHeaderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        IconDTO iconDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO = null;
        ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO2 = null;
        ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO3 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (true) {
            Boolean bool2 = bool;
            IconDTO iconDTO2 = iconDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map<String, TokenizedTrackingInfo> map3 = map;
            ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO4 = profileHeaderStatDTO;
            ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO5 = profileHeaderStatDTO2;
            if (!reader.hasNext()) {
                ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO6 = profileHeaderStatDTO3;
                reader.endObject();
                if (iconDTO2 == null) {
                    throw c.j("avatar", "avatar", reader);
                }
                if (profileHeaderStatDTO4 == null) {
                    throw c.j("leftCount", "leftCount", reader);
                }
                if (profileHeaderStatDTO5 == null) {
                    throw c.j("middleCount", "middleCount", reader);
                }
                if (profileHeaderStatDTO6 == null) {
                    throw c.j("rightCount", "rightCount", reader);
                }
                if (iconButtonV3DTO == null) {
                    throw c.j("shareButton", "shareButton", reader);
                }
                if (bool2 == null) {
                    throw c.j("isActionPositive", "isActionPositive", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (buttonV3DTO == null) {
                    throw c.j("positiveActionButton", "positiveActionButton", reader);
                }
                if (buttonV3DTO2 != null) {
                    return new ProfileHeaderDTO(iconDTO2, atomActionDTO2, map3, profileHeaderStatDTO4, profileHeaderStatDTO5, profileHeaderStatDTO6, iconButtonV3DTO, iconButtonV3DTO2, booleanValue, buttonV3DTO, buttonV3DTO2, map2);
                }
                throw c.j("negativeActionButton", "negativeActionButton", reader);
            }
            ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO7 = profileHeaderStatDTO3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("avatar", "avatar", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 1:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 2:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 3:
                    profileHeaderStatDTO = this.profileHeaderStatDTOAdapter.fromJson(reader);
                    if (profileHeaderStatDTO == null) {
                        throw c.q("leftCount", "leftCount", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 4:
                    profileHeaderStatDTO2 = this.profileHeaderStatDTOAdapter.fromJson(reader);
                    if (profileHeaderStatDTO2 == null) {
                        throw c.q("middleCount", "middleCount", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                case 5:
                    profileHeaderStatDTO3 = this.profileHeaderStatDTOAdapter.fromJson(reader);
                    if (profileHeaderStatDTO3 == null) {
                        throw c.q("rightCount", "rightCount", reader);
                    }
                    bool = bool2;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 6:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("shareButton", "shareButton", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 7:
                    iconButtonV3DTO2 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 8:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isActionPositive", "isActionPositive", reader);
                    }
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 9:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("positiveActionButton", "positiveActionButton", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 10:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("negativeActionButton", "negativeActionButton", reader);
                    }
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                case 11:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
                default:
                    bool = bool2;
                    profileHeaderStatDTO3 = profileHeaderStatDTO7;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                    map = map3;
                    profileHeaderStatDTO = profileHeaderStatDTO4;
                    profileHeaderStatDTO2 = profileHeaderStatDTO5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProfileHeaderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("avatar");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getAvatar());
        writer.w("avatarAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAvatarAction());
        writer.w("avatarTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getAvatarTrackingInfo());
        writer.w("leftCount");
        this.profileHeaderStatDTOAdapter.mo44toJson(writer, (x) value.getLeftCount());
        writer.w("middleCount");
        this.profileHeaderStatDTOAdapter.mo44toJson(writer, (x) value.getMiddleCount());
        writer.w("rightCount");
        this.profileHeaderStatDTOAdapter.mo44toJson(writer, (x) value.getRightCount());
        writer.w("shareButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getShareButton());
        writer.w("settingsButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSettingsButton());
        writer.w("isActionPositive");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isActionPositive()));
        writer.w("positiveActionButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getPositiveActionButton());
        writer.w("negativeActionButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNegativeActionButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
