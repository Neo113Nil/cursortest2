package ru.ozon.uni.atoms.data;

import Sc.InterfaceC3999a;
import Sc.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aK\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "toAtomAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/AtomDTO;", "dto", "params", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "parseScrollTypePrams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "parseBottomSheetParams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "parseScrollToWidget", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomActionMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.INVALID_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionDTO.Behavior.REDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtomActionDTO.Behavior.NESTED_PAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_AND_SCROLL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REDIRECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REFRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AtomActionDTO.Behavior.SCROLL_TO_WIDGET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AtomActionDTO.Behavior.COMPOSER_ACTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AtomActionDTO.Behavior.BEHAVIOR_TYPE_ACTION_SHEET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AtomAction.CurtainShowConfig parseBottomSheetParams(AtomActionDTO atomActionDTO) {
        AtomAction.CurtainShowConfig.Wrap wrap;
        AtomAction.CurtainShowConfig curtainShowConfig;
        Float v02;
        Map<String, String> params = atomActionDTO.getParams();
        if (params != null) {
            String str = params.get("minimumHeight");
            Integer w02 = str != null ? h.w0(str) : null;
            String str2 = params.get("screenSizeType");
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != 3154575) {
                    if (hashCode != 3657802) {
                        if (hashCode == 108285963 && str2.equals("ratio")) {
                            String str3 = params.get("ratio");
                            if (str3 == null || (v02 = h.v0(str3)) == null) {
                                wrap = new AtomAction.CurtainShowConfig.Wrap(w02);
                                curtainShowConfig = wrap;
                            } else {
                                curtainShowConfig = new AtomAction.CurtainShowConfig.Ratio(v02.floatValue());
                            }
                        }
                    } else if (str2.equals("wrap")) {
                        wrap = new AtomAction.CurtainShowConfig.Wrap(w02);
                        curtainShowConfig = wrap;
                    }
                } else if (str2.equals("full")) {
                    curtainShowConfig = AtomAction.CurtainShowConfig.Full.INSTANCE;
                }
                if (curtainShowConfig != null) {
                    return curtainShowConfig;
                }
            }
            wrap = new AtomAction.CurtainShowConfig.Wrap(w02);
            curtainShowConfig = wrap;
            if (curtainShowConfig != null) {
            }
        }
        return AtomAction.CurtainShowConfig.None.INSTANCE;
    }

    private static final AtomAction parseScrollToWidget(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
        String link = atomActionDTO.getLink();
        if (link != null) {
            return Intrinsics.d(map2 != null ? map2.get("linkType") : null, "scrollWidgetKey") ? new AtomAction.ScrollToWidgetByKey(atomActionDTO.getId(), link.hashCode(), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2) : new AtomAction.ScrollToWidget(atomActionDTO.getId(), link, map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
        }
        return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
    }

    private static final AtomAction.ScrollPosition parseScrollTypePrams(AtomActionDTO atomActionDTO) {
        Map<String, String> params = atomActionDTO.getParams();
        if (params != null) {
            AtomAction.ScrollPosition scrollPosition = Intrinsics.d(params.get("scrollPosition"), "top") ? AtomAction.ScrollPosition.Top.INSTANCE : AtomAction.ScrollPosition.None.INSTANCE;
            if (scrollPosition != null) {
                return scrollPosition;
            }
        }
        return AtomAction.ScrollPosition.None.INSTANCE;
    }

    @NotNull
    public static final AtomAction toAtomAction(@NotNull AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(atomActionDTO, "<this>");
        return toAtomAction(atomActionDTO, null, map, atomActionDTO.getParams());
    }

    public static /* synthetic */ AtomAction toAtomAction$default(AtomActionDTO atomActionDTO, AtomDTO atomDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map2 = null;
        }
        return toAtomAction(atomActionDTO, atomDTO, map, map2);
    }

    @InterfaceC3999a
    @NotNull
    public static final AtomAction toAtomAction(@NotNull AtomActionDTO atomActionDTO, AtomDTO atomDTO, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
        String str;
        Intrinsics.checkNotNullParameter(atomActionDTO, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[atomActionDTO.getBehavior().ordinal()]) {
            case 1:
                return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 2:
                return new AtomAction.Click(atomActionDTO.getId(), atomActionDTO.getLink(), atomDTO, map2, map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 3:
                return new AtomAction.Move(atomActionDTO.getLink(), map2, map, atomActionDTO.getId(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 4:
                return new AtomAction.Refresh(atomActionDTO.getLink(), parseScrollTypePrams(atomActionDTO), atomActionDTO.getId(), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
            case 5:
                String link = atomActionDTO.getLink();
                if (link != null) {
                    return new AtomAction.OpenNestedPage(atomActionDTO.getId(), link, parseBottomSheetParams(atomActionDTO), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
                }
                return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 6:
                String link2 = atomActionDTO.getLink();
                if (link2 != null) {
                    return new AtomAction.OpenComposerNestedPage(atomActionDTO.getId(), link2, parseBottomSheetParams(atomActionDTO), (map2 == null || (str = map2.get("isPullToDismissEnabled")) == null) ? true : Boolean.parseBoolean(str), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
                }
                return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 7:
                return new AtomAction.Dismiss(atomActionDTO.getId(), map, map2, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 8:
                return new AtomAction.DismissAndScroll(atomActionDTO.getId(), atomActionDTO.getLink(), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
            case 9:
                return new AtomAction.DismissRedirect(atomActionDTO.getId(), atomActionDTO.getLink(), map, map2, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 10:
                return new AtomAction.DismissRefresh(atomActionDTO.getId(), atomActionDTO.getLink(), parseScrollTypePrams(atomActionDTO), map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()), map2);
            case 11:
                return parseScrollToWidget(atomActionDTO, map, map2);
            case 12:
                String link3 = atomActionDTO.getLink();
                if (link3 != null) {
                    return new AtomAction.ComposerAction(atomActionDTO.getId(), link3, map2, map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
                }
                return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            case 13:
                String link4 = atomActionDTO.getLink();
                if (link4 != null) {
                    return new AtomAction.ActionSheet(atomActionDTO.getId(), link4, map2, map, AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
                }
                return new AtomAction.InvalidAction(atomActionDTO.getId(), atomActionDTO.getLink(), AtomAction.HasUsageAnalytics.UsageAnalytics.INSTANCE.create(atomActionDTO.getRawBehavior$uni_release()));
            default:
                throw new o();
        }
    }
}
