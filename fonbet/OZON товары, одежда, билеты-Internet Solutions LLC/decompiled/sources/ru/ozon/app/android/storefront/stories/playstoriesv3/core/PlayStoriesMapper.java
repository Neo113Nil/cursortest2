package ru.ozon.app.android.storefront.stories.playstoriesv3.core;

import Ih.a;
import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.Alignment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.PlayStoriesV3DTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3ContentDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3DTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3ItemAssetDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3ItemDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3MediaDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3SoundButtonDescriptionDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3TabBarDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3TypeDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3WithImageDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.StoryV3WithVideoDTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.PlayStoriesV3VO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Content;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3ItemAsset;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Media;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3TabBar;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithImage;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithVideo;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 -2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001-B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u000b\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0018J\u0013\u0010\u000b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u000b\u0010\u001bJ\u0013\u0010\u000b\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u000b\u0010\u001eJ\u0013\u0010\u000b\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b\u000b\u0010!J\u0013\u0010\u000b\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b\u000b\u0010$J\u0013\u0010\u000b\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b\u000b\u0010'J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020\u00022\n\u0010*\u001a\u00060\u0003j\u0002`)H\u0096\u0002¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3DTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "toVo", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3DTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3MediaDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3MediaDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "", "hasAnyBottomContent", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;)Z", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithImageDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithImageDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithVideoDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithVideo;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithVideoDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithVideo;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3SoundButtonDescriptionDTO;", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3SoundButtonDescriptionDTO;)Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;Ll20/d;)Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesMapper implements Function2<PlayStoriesV3DTO, d, List<? extends PlayStoriesV3VO>> {
    private final boolean hasAnyBottomContent(StoryV3ItemDTO storyV3ItemDTO) {
        boolean z11 = storyV3ItemDTO.getContent() != null && !(storyV3ItemDTO.getContent().getBadge() == null && storyV3ItemDTO.getContent().getTitle() == null && storyV3ItemDTO.getContent().getSubtitle() == null) && storyV3ItemDTO.getContent().getAlign() == Alignment.BOTTOM;
        boolean z12 = storyV3ItemDTO.getButton() != null;
        SocialProductListDTO productsList = storyV3ItemDTO.getProductsList();
        List<SocialProductListDTO.ProductListItemDTO> items = productsList != null ? productsList.getItems() : null;
        return z11 || z12 || !(items == null || items.isEmpty());
    }

    private final StoryV3 toVo(StoryV3DTO storyV3DTO) {
        StoryV3Media storyV3Media;
        int storyId = storyV3DTO.getStoryId();
        IconTitleSubtitleCellDTO authorBlock = storyV3DTO.getAuthorBlock();
        ButtonV3Atom.SmallIconButton closeButton = storyV3DTO.getCloseButton();
        StoryV3TypeDTO data = storyV3DTO.getData();
        StoryV3MediaDTO storyV3MediaDTO = data instanceof StoryV3MediaDTO ? (StoryV3MediaDTO) data : null;
        if (storyV3MediaDTO == null || (storyV3Media = toVo(storyV3MediaDTO)) == null) {
            storyV3Media = new StoryV3Media(K.f71697a);
        }
        return new StoryV3(storyId, authorBlock, closeButton, storyV3Media);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PlayStoriesV3VO> invoke(@NotNull PlayStoriesV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = a.a("PlayStoriesV3.", widgetInfo.d());
        Integer pointer = state.getPointer();
        Integer span = state.getSpan();
        Integer frame = state.getFrame();
        List<StoryV3DTO> stories = state.getStories();
        ArrayList arrayList = new ArrayList(C7714v.z(stories, 10));
        Iterator<T> it = stories.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((StoryV3DTO) it.next()));
        }
        return C7714v.a0(new PlayStoriesV3VO(a11, span, pointer, frame, arrayList));
    }

    private final StoryV3Media toVo(StoryV3MediaDTO storyV3MediaDTO) {
        List<StoryV3ItemDTO> items = storyV3MediaDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((StoryV3ItemDTO) it.next()));
        }
        return new StoryV3Media(arrayList);
    }

    private final StoryV3Item toVo(StoryV3ItemDTO storyV3ItemDTO) {
        StoryV3Content storyV3Content;
        StorySoundControlDTO storySoundControlDTO;
        AtomActionDTO action = storyV3ItemDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = storyV3ItemDTO.getTrackingInfo();
        StoryV3ItemAsset vo = toVo(storyV3ItemDTO.getAsset());
        StoryV3ContentDTO content = storyV3ItemDTO.getContent();
        if (content != null) {
            storyV3Content = toVo(content);
            storySoundControlDTO = null;
        } else {
            storyV3Content = null;
            storySoundControlDTO = null;
        }
        ButtonDTO button = storyV3ItemDTO.getButton();
        StorySoundControlDTO storySoundControlDTO2 = storySoundControlDTO;
        SocialProductListDTO productsList = storyV3ItemDTO.getProductsList();
        StoryV3TabBar vo2 = toVo(storyV3ItemDTO.getTabBar());
        StoryV3SoundButtonDescriptionDTO soundButtonDescription = storyV3ItemDTO.getTabBar().getSoundButtonDescription();
        if (soundButtonDescription != null) {
            storySoundControlDTO2 = toVo(soundButtonDescription);
        }
        return new StoryV3Item(action, trackingInfo, vo, storyV3Content, button, productsList, vo2, storySoundControlDTO2, hasAnyBottomContent(storyV3ItemDTO));
    }

    private final StoryV3ItemAsset toVo(StoryV3ItemAssetDTO storyV3ItemAssetDTO) {
        if (storyV3ItemAssetDTO instanceof StoryV3WithImageDTO) {
            return toVo((StoryV3WithImageDTO) storyV3ItemAssetDTO);
        }
        if (storyV3ItemAssetDTO instanceof StoryV3WithVideoDTO) {
            return toVo((StoryV3WithVideoDTO) storyV3ItemAssetDTO);
        }
        throw new o();
    }

    private final StoryV3WithImage toVo(StoryV3WithImageDTO storyV3WithImageDTO) {
        return new StoryV3WithImage(storyV3WithImageDTO.getImage());
    }

    private final StoryV3WithVideo toVo(StoryV3WithVideoDTO storyV3WithVideoDTO) {
        return new StoryV3WithVideo(storyV3WithVideoDTO.getLink(), storyV3WithVideoDTO.getTrackingInfo(), storyV3WithVideoDTO.getHasAudio());
    }

    private final StoryV3Content toVo(StoryV3ContentDTO storyV3ContentDTO) {
        ArrayList arrayList = new ArrayList();
        BadgeDTO badge = storyV3ContentDTO.getBadge();
        if (badge != null) {
            arrayList.add(badge);
        }
        TextDTO title = storyV3ContentDTO.getTitle();
        if (title != null) {
            arrayList.add(title);
        }
        TextDTO subtitle = storyV3ContentDTO.getSubtitle();
        if (subtitle != null) {
            arrayList.add(subtitle);
        }
        return new StoryV3Content(storyV3ContentDTO.getAlign(), arrayList);
    }

    private final StoryV3TabBar toVo(StoryV3TabBarDTO storyV3TabBarDTO) {
        return new StoryV3TabBar(storyV3TabBarDTO.getShareButton());
    }

    private final StorySoundControlDTO toVo(StoryV3SoundButtonDescriptionDTO storyV3SoundButtonDescriptionDTO) {
        String muteButtonIconName = storyV3SoundButtonDescriptionDTO.getMuteButtonIconName();
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        AtomActionDTO atomActionDTO = new AtomActionDTO(behavior, null, "mute", null, 10, null);
        ButtonV3Atom.SmallIconButtonStyle smallIconButtonStyle = ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR;
        UniColors uniColors = UniColors.TEXT_LIGHT_KEY;
        return new StorySoundControlDTO(null, new ButtonV3Atom.SmallIconButton(muteButtonIconName, atomActionDTO, uniColors.getToken(), smallIconButtonStyle, null, null, null, 112, null), new ButtonV3Atom.SmallIconButton(storyV3SoundButtonDescriptionDTO.getUnmuteButtonIconName(), new AtomActionDTO(behavior, null, "unmute", null, 10, null), uniColors.getToken(), smallIconButtonStyle, null, null, null, 112, null), 1, null);
    }
}
