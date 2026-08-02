package ru.ozon.uni.android.atom.notification.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig;
import ru.ozon.uni.android.atom.notification.utils.MappersKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fromDto", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig;", "dto", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarViewConfigKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationDTO.Preset.values().length];
            try {
                iArr[NotificationDTO.Preset.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationDTO.Preset.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationDTO.Preset.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final NotificationBarViewConfig fromDto(@NotNull NotificationDTO dto) {
        NotificationDTO.Alignment alignment;
        NotificationDTO.LeftContent leftContent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        NotificationDTO.Preset preset = dto.getPreset();
        if (preset == null) {
            preset = NotificationDTO.Preset.CUSTOM;
        }
        if (preset == NotificationDTO.Preset.CUSTOM) {
            leftContent = dto.getLeftContent();
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
            String str = i11 != 1 ? i11 != 2 ? i11 != 3 ? "ic_notification_info" : "ic_notification_negative" : "ic_notification_warning" : "ic_notification_success";
            NotificationDTO.LeftContent leftContent2 = dto.getLeftContent();
            if (leftContent2 == null || (alignment = leftContent2.getAlignment()) == null) {
                alignment = NotificationDTO.Alignment.TOP;
            }
            leftContent = new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE, null, null, str, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FILL_CENTER, 65434, null), alignment);
        }
        String title = dto.getTitle();
        String subtitle = dto.getSubtitle();
        Integer titleMaxLines = dto.getTitleMaxLines();
        int intValue = titleMaxLines != null ? titleMaxLines.intValue() : 2;
        Integer subtitleMaxLines = dto.getSubtitleMaxLines();
        int intValue2 = subtitleMaxLines != null ? subtitleMaxLines.intValue() : 2;
        NotificationBarViewConfig.LeftContent configLeftContent = leftContent != null ? MappersKt.toConfigLeftContent(leftContent) : null;
        NotificationDTO.RightContent rightContent = dto.getRightContent();
        return new NotificationBarViewConfig(title, intValue, subtitle, intValue2, configLeftContent, rightContent != null ? MappersKt.toConfigRightContent(rightContent) : null);
    }
}
