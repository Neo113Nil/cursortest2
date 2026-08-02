package ru.ozon.app.android.session.sessionList.mapper;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.session.sessionList.data.SessionListDTO;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/sessionList/mapper/SessionListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "", "stateId", "", "index", "", "isLast", "toVO", "(Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;Ljava/lang/String;IZ)Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/sessionList/data/SessionListDTO;Ll20/d;)Ljava/util/List;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListMapper implements Function2<SessionListDTO, d, List<? extends SessionListVO.Item>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/sessionList/mapper/SessionListMapper$Companion;", "", "<init>", "()V", "createCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "session", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "hideSeparator", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault createCell(@NotNull SessionListDTO.SessionDTO session, boolean hideSeparator) {
            Intrinsics.checkNotNullParameter(session, "session");
            return new CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault(false, StyleParser.OzColor.OZ_SEMANTIC_COLOR_SEPARATOR.getValue(), OzonSpannableStringKt.toOzonSpannableString(session.getTitle()), null, OzonSpannableStringKt.toOzonSpannableString(session.getSubtitle()), null, CellAtom.Align.ALIGN_TYPE_CENTER, null, session.getAction(), hideSeparator, false, null, null, null, 15528, null);
        }

        private Companion() {
        }
    }

    private final SessionListVO.Item toVO(SessionListDTO.SessionDTO sessionDTO, String str, int i11, boolean z11) {
        return new SessionListVO.Item(b.a(i11, str, " item "), INSTANCE.createCell(sessionDTO, z11), i11 == 0, z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SessionListVO.Item> invoke(@NotNull SessionListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SessionListDTO.SessionDTO> sessions = state.getSessions();
        if (sessions == null) {
            return K.f71697a;
        }
        int P11 = C7714v.P(sessions);
        List<SessionListDTO.SessionDTO> list = sessions;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((SessionListDTO.SessionDTO) obj, widgetInfo.d(), i11, i11 == P11));
            i11 = i12;
        }
        return arrayList;
    }
}
