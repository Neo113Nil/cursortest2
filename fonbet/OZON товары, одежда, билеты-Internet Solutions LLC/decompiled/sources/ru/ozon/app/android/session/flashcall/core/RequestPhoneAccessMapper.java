package ru.ozon.app.android.session.flashcall.core;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.flashcall.data.RequestPhoneAccessWidgetDTO;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessVO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u0013\u0010\u000b\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0018J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;Ll20/d;)Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;)Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;)Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$PermissionDTO;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$PermissionVO;", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$PermissionDTO;)Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$PermissionVO;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$AlignmentDTO;)Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$AlignmentVO;", "state", "invoke", "(Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestPhoneAccessMapper implements Function2<RequestPhoneAccessWidgetDTO, d, List<? extends RequestPhoneAccessVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestPhoneAccessWidgetDTO.AlignmentDTO.values().length];
            try {
                iArr[RequestPhoneAccessWidgetDTO.AlignmentDTO.ALIGNMENT_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestPhoneAccessWidgetDTO.AlignmentDTO.ALIGNMENT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestPhoneAccessWidgetDTO.AlignmentDTO.ALIGNMENT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final RequestPhoneAccessVO toVO(RequestPhoneAccessWidgetDTO requestPhoneAccessWidgetDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        RequestPhoneAccessVO.TitleVO vo = toVO(requestPhoneAccessWidgetDTO.getTitle());
        RequestPhoneAccessWidgetDTO.SubtitleDTO subtitle = requestPhoneAccessWidgetDTO.getSubtitle();
        ArrayList arrayList = null;
        RequestPhoneAccessVO.SubtitleVO vo2 = subtitle != null ? toVO(subtitle) : null;
        List<RequestPhoneAccessWidgetDTO.PermissionDTO> permissions = requestPhoneAccessWidgetDTO.getPermissions();
        if (permissions != null) {
            List<RequestPhoneAccessWidgetDTO.PermissionDTO> list = permissions;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((RequestPhoneAccessWidgetDTO.PermissionDTO) it.next()));
            }
        }
        return new RequestPhoneAccessVO(hashCode, vo, vo2, arrayList, requestPhoneAccessWidgetDTO.getAllowButton(), requestPhoneAccessWidgetDTO.getDisallowButton(), requestPhoneAccessWidgetDTO.getHelp());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RequestPhoneAccessVO> invoke(@NotNull RequestPhoneAccessWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }

    private final RequestPhoneAccessVO.TitleVO toVO(RequestPhoneAccessWidgetDTO.TitleDTO titleDTO) {
        return new RequestPhoneAccessVO.TitleVO(titleDTO.getText(), toVO(titleDTO.getAlignment()));
    }

    private final RequestPhoneAccessVO.SubtitleVO toVO(RequestPhoneAccessWidgetDTO.SubtitleDTO subtitleDTO) {
        return new RequestPhoneAccessVO.SubtitleVO(subtitleDTO.getText(), subtitleDTO.getIcon(), subtitleDTO.getAction());
    }

    private final RequestPhoneAccessVO.PermissionVO toVO(RequestPhoneAccessWidgetDTO.PermissionDTO permissionDTO) {
        return new RequestPhoneAccessVO.PermissionVO(permissionDTO.getIcon(), permissionDTO.getText());
    }

    private final RequestPhoneAccessVO.AlignmentVO toVO(RequestPhoneAccessWidgetDTO.AlignmentDTO alignmentDTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignmentDTO.ordinal()];
        if (i11 == 1) {
            return RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_LEFT;
        }
        if (i11 == 2) {
            return RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_CENTER;
        }
        if (i11 == 3) {
            return RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_RIGHT;
        }
        throw new o();
    }
}
