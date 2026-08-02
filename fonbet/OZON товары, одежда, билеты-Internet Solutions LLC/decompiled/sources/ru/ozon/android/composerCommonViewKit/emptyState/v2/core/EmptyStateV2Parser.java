package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import Tc.b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2ButtonsModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122$\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005:\u0001\u0012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser;", "Lkotlin/Function1;", "Lj20/b;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParser", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "extractTopPart", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;)Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "state", "invoke", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2Parser implements Function1<C7244b, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonParser;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int IMAGE_TOP_MARGIN = UiExtKt.toPx(32);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser$Companion;", "", "<init>", "()V", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "configureLegacyImage", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/image/ImageDTO;", "", "ZERO_MARGIN", "I", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImageDTO configureLegacyImage(String image) {
            return new ImageDTO(image, null, null, false, null, null, null, null, null, null, null, null, 80, null, ImageDTO.FitType.FIT_CENTER, null, 45054, null);
        }

        private Companion() {
        }
    }

    public EmptyStateV2Parser(@NotNull JsonParser jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
    }

    private final EmptyStateV2TopPartModel extractTopPart(EmptyStateV2DTO emptyStateV2DTO) {
        TextDTO messageAtom = emptyStateV2DTO.getMessageAtom();
        TextDTO titleAtom = emptyStateV2DTO.getTitleAtom();
        ImageDTO imageAtom = emptyStateV2DTO.getImageAtom();
        if (imageAtom == null) {
            String image = emptyStateV2DTO.getImage();
            imageAtom = image != null ? INSTANCE.configureLegacyImage(image) : null;
        }
        return new EmptyStateV2TopPartModel(messageAtom, titleAtom, imageAtom, (emptyStateV2DTO.getImageAtom() == null && emptyStateV2DTO.getSize() == EmptyStateV2DTO.EmptyStateSize.WRAP) ? IMAGE_TOP_MARGIN : 0, emptyStateV2DTO.getSize(), emptyStateV2DTO.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public List<Object> invoke(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b builder = C7714v.B();
        EmptyStateV2DTO emptyStateV2DTO = (EmptyStateV2DTO) this.jsonParser.fromJson(state.b(), EmptyStateV2DTO.class);
        builder.add(extractTopPart(emptyStateV2DTO));
        List<AtomDTO> buttons = emptyStateV2DTO.getButtons();
        if (buttons != null) {
            builder.add(new EmptyStateV2ButtonsModel(buttons, StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL, emptyStateV2DTO.getSize() == EmptyStateV2DTO.EmptyStateSize.FULLSCREEN, emptyStateV2DTO.getBackgroundColor()));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
