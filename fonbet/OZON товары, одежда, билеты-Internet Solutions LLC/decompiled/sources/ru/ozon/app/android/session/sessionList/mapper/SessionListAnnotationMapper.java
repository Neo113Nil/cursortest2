package ru.ozon.app.android.session.sessionList.mapper;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.session.sessionList.data.SessionListDTO;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/sessionList/mapper/SessionListAnnotationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Annotation;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "", "stateId", "toVO", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;)Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Annotation;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/sessionList/data/SessionListDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListAnnotationMapper implements Function2<SessionListDTO, d, List<? extends SessionListVO.Annotation>> {
    private final SessionListVO.Annotation toVO(DisclaimerAtom disclaimerAtom, String str) {
        return new SessionListVO.Annotation(c.a(str, "annotation"), disclaimerAtom);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SessionListVO.Annotation> invoke(@NotNull SessionListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DisclaimerAtom annotation = state.getAnnotation();
        return C7714v.c0(annotation != null ? toVO(annotation, widgetInfo.d()) : null);
    }
}
