package ru.ozon.app.android.storefront.stories.story.data;

import Sc.o;
import kotlin.Metadata;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "getDefaultSoundControl", "()Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "", "mapToGravity", "(Lru/ozon/app/android/storefront/stories/story/data/Alignment;)I", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryCommonMoleculeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorySoundControlDTO getDefaultSoundControl() {
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        AtomActionDTO atomActionDTO = new AtomActionDTO(behavior, null, "mute", null, 10, null);
        ButtonV3Atom.SmallIconButtonStyle smallIconButtonStyle = ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR;
        return new StorySoundControlDTO(null, new ButtonV3Atom.SmallIconButton("ic_m_volume", atomActionDTO, "ozTextPrimaryNegative", smallIconButtonStyle, null, null, null, 112, null), new ButtonV3Atom.SmallIconButton("ic_m_volume_no", new AtomActionDTO(behavior, null, "unmute", null, 10, null), "ozTextPrimaryNegative", smallIconButtonStyle, null, null, null, 112, null), 1, null);
    }

    public static final int mapToGravity(Alignment alignment) {
        if (alignment == null) {
            return 17;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1) {
            return 48;
        }
        if (i11 == 2) {
            return 80;
        }
        if (i11 == 3) {
            return 17;
        }
        throw new o();
    }
}
