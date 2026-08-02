package ru.ozon.android.messenger.blocks.emptystate;

import Sc.o;
import android.content.Context;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.v;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f85093a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f85094b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d.b f85095c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85096a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.CHAT_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.CHAT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85096a = iArr;
        }
    }

    public e(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull d.b blockCustomSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f85093a = context;
        this.f85094b = blockStore;
        this.f85095c = blockCustomSettings;
    }

    public static q d(e eVar) {
        String itemId = n.a();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return v.d(eVar.k(new ru.ozon.android.messenger.blocks.emptystate.v2.g(ru.ozon.android.messenger.framework.presentation.models.h.a(itemId), new ImageDTO(null, null, null, false, null, null, null, null, null, null, null, null, 104, ImageDTO.ImageType.FIX, null, null, 53247, null), new n.a(R$drawable.m_letter_blue_m), eVar.i(R$string.messenger_you_have_no_messages), null, Boolean.FALSE, null, null, null, null, 4016), f.c.EMPTY_STATE, e.a.f87374a), itemId);
    }

    public static ru.ozon.android.messenger.blocks.emptystate.v2.g h(e eVar) {
        String itemId = ru.ozon.android.messenger.utils.n.a();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new ru.ozon.android.messenger.blocks.emptystate.v2.g(ru.ozon.android.messenger.framework.presentation.models.h.a(itemId), null, new n.a(R$drawable.m_message_crack_lighting_m), eVar.f(R$string.messenger_error_smth_went_wrong_title), eVar.c(R$string.messenger_error_technical_error_description), null, C7714v.a0(eVar.a(R$string.messenger_action_update)), ru.ozon.android.messenger.blocks.emptystate.v2.a.VERTICAL, null, null, 3296);
    }

    public static /* synthetic */ u l(e eVar, ru.ozon.android.messenger.framework.presentation.models.g gVar, f.c cVar, int i11) {
        if ((i11 & 1) != 0) {
            cVar = f.c.EMPTY_STATE;
        }
        return eVar.k(gVar, cVar, e.b.f87375a);
    }

    @NotNull
    protected ButtonV3DTO a(int i11) {
        String d11 = ru.ozon.android.messenger.utils.c.d(i11, this.f85093a);
        return new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_600, d11, null, null, null, Boolean.FALSE, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, "", null, null, 12, null), null, null, 6, null), null, null, null, null, 253880, null);
    }

    @NotNull
    public final q b(@NotNull j emptyStatePlace) {
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        int i11 = ru.ozon.android.messenger.framework.data.a.f87377b;
        Context context = this.f85093a;
        Context c11 = ru.ozon.android.messenger.framework.data.a.c(context);
        ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(ru.ozon.android.messenger.utils.n.a());
        j jVar = j.CHAT_LIST;
        OzonSpannableString e11 = emptyStatePlace == jVar ? ru.ozon.android.messenger.utils.c.e(R$string.messenger_chat_list_header, context) : OzonSpannableStringKt.toOzonSpannableString("");
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        f.c.b bVar = new f.c.b(new TextDTO(e11, TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding, null, null, textPreset, "tsCompactControl500Medium", ru.ozon.android.messenger.utils.h.b(c11) ? "textPrimaryOnDark" : "textPrimary", null, null, null, null, false, null, null, null, null, 1, 261680, null));
        d.b bVar2 = this.f85095c;
        return v.d(l(this, new ru.ozon.android.messenger.blocks.chatlistheader.f(a11, K.f71697a, emptyStatePlace == jVar ? bVar2.b() : bVar2.a(), bVar), f.c.CHAT_LIST_HEADER, 2), a11.a());
    }

    @NotNull
    protected final TextDTO c(int i11) {
        OzonSpannableString e11 = ru.ozon.android.messenger.utils.c.e(i11, this.f85093a);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_300;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.NONE;
        return new TextDTO(e11, TextDTO.TextAlignment.CENTER, layoutPadding2, layoutPadding2, layoutPadding, layoutPadding2, textPreset, "tsBody400Small", "textSecondary", null, null, null, null, false, null, null, null, null, 0, 261632, null);
    }

    @NotNull
    public List<q> e(@NotNull NetworkInfo networkInfo, @NotNull j emptyStatePlace, g gVar) {
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        String a11 = ru.ozon.android.messenger.utils.n.a();
        if (!(networkInfo instanceof NetworkInfo.Available)) {
            return g(ru.ozon.android.messenger.framework.presentation.models.h.a(a11), emptyStatePlace);
        }
        int i11 = a.f85096a[emptyStatePlace.ordinal()];
        if (i11 == 1) {
            return j(ru.ozon.android.messenger.framework.presentation.models.h.a(a11), R$string.messenger_error_smth_went_wrong_title, R$string.messenger_error_chat_details_description, emptyStatePlace);
        }
        if (i11 != 2) {
            throw new o();
        }
        return j(ru.ozon.android.messenger.framework.presentation.models.h.a(a11), R$string.messenger_error_smth_went_wrong_title, R$string.messenger_error_chat_list_description, emptyStatePlace);
    }

    @NotNull
    protected final TextDTO f(int i11) {
        OzonSpannableString e11 = ru.ozon.android.messenger.utils.c.e(i11, this.f85093a);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_300;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.NONE;
        return new TextDTO(e11, TextDTO.TextAlignment.CENTER, layoutPadding2, layoutPadding2, layoutPadding, layoutPadding2, textPreset, "tsHeadline700XLarge", "textPrimary", null, null, null, null, false, null, null, null, null, 0, 261632, null);
    }

    @NotNull
    protected Tc.b g(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull j emptyStatePlace) {
        int i11;
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        Tc.b builder = C7714v.B();
        builder.add(b(emptyStatePlace));
        n.a aVar = new n.a(R$drawable.m_wifi_off_m);
        TextDTO f7 = f(R$string.messenger_error_no_connection_title);
        int i12 = a.f85096a[emptyStatePlace.ordinal()];
        if (i12 == 1) {
            i11 = R$string.messenger_error_chat_details_description;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = R$string.messenger_error_chat_list_description;
        }
        builder.add(v.d(l(this, new ru.ozon.android.messenger.blocks.emptystate.v2.g(blockId, null, aVar, f7, c(i11), Boolean.TRUE, C7714v.a0(a(R$string.messenger_action_update)), ru.ozon.android.messenger.blocks.emptystate.v2.a.VERTICAL, null, null, 3232), f.c.EMPTY_STATE, 2), blockId.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @NotNull
    protected final TextDTO i(int i11) {
        OzonSpannableString e11 = ru.ozon.android.messenger.utils.c.e(i11, this.f85093a);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_300;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.NONE;
        return new TextDTO(e11, TextDTO.TextAlignment.CENTER, layoutPadding2, layoutPadding2, layoutPadding, layoutPadding2, textPreset, "tsHeadline500Medium", "textPrimary", null, null, null, null, false, null, null, null, null, 0, 261632, null);
    }

    @NotNull
    protected Tc.b j(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, int i11, int i12, @NotNull j emptyStatePlace) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        Tc.b builder = C7714v.B();
        builder.add(b(emptyStatePlace));
        builder.add(v.d(l(this, new ru.ozon.android.messenger.blocks.emptystate.v2.g(blockId, null, new n.a(R$drawable.m_message_crack_lighting_m), f(i11), c(i12), null, C7714v.a0(a(R$string.messenger_action_update)), ru.ozon.android.messenger.blocks.emptystate.v2.a.VERTICAL, null, null, 3296), null, 3), blockId.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @NotNull
    protected final u k(@NotNull ru.ozon.android.messenger.framework.presentation.models.g gVar, @NotNull ru.ozon.android.messenger.framework.domain.f blockType, @NotNull ru.ozon.android.messenger.framework.core.viewmapper.e viewMapperType) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(blockType, "blockType");
        Intrinsics.checkNotNullParameter(viewMapperType, "viewMapperType");
        return new u(gVar, ru.ozon.android.messenger.framework.data.d.g(this.f85094b, blockType), viewMapperType);
    }
}
