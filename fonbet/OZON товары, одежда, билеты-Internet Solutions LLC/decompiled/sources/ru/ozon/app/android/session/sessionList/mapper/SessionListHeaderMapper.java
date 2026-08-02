package ru.ozon.app.android.session.sessionList.mapper;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.sessionList.data.SessionListDTO;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/sessionList/mapper/SessionListHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Header;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/session/sessionList/data/SessionListDTO;Ljava/lang/String;)Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Header;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "createTitleTextAtom", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "createSubtitleTextAtom", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/sessionList/data/SessionListDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListHeaderMapper implements Function2<SessionListDTO, d, List<? extends SessionListVO.Header>> {
    private final TextAtom createSubtitleTextAtom(String subtitle) {
        return new TextAtom(OzonSpannableStringKt.toOzonSpannableString(subtitle), StyleParser.TextStyle.BODY_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue(), Integer.MAX_VALUE, null, null, null, 112, null);
    }

    private final TextAtom createTitleTextAtom(String title) {
        return new TextAtom(OzonSpannableStringKt.toOzonSpannableString(title), StyleParser.TextStyle.HEAD_M.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), Integer.MAX_VALUE, null, null, null, 112, null);
    }

    private final SessionListVO.Header toVO(SessionListDTO sessionListDTO, String str) {
        return new SessionListVO.Header(c.a(str, CommentV3DTO.HEADER_FIELD_NAME), createTitleTextAtom(sessionListDTO.getListTitle()), createSubtitleTextAtom(sessionListDTO.getListSubtitle()), sessionListDTO.getCurrentSession() == null && sessionListDTO.getSessionsTitle() == null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SessionListVO.Header> invoke(@NotNull SessionListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
