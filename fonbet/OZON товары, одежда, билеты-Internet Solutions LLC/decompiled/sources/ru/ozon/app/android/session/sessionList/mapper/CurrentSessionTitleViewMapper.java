package ru.ozon.app.android.session.sessionList.mapper;

import HJ.a;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.session.sessionList.data.SessionListDTO;
import ru.ozon.app.android.session.sessionList.di.CurrentSessionTitleComponent;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;
import ru.ozon.app.android.session.sessionList.presentation.viewHolder.SessionListTitleViewHolder;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/session/sessionList/di/CurrentSessionTitleComponent;", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Title;", "<init>", "()V", "Landroid/view/View;", "view", "Lru/ozon/app/android/session/sessionList/presentation/viewHolder/SessionListTitleViewHolder;", "createViewHolder", "(Landroid/view/View;)Lru/ozon/app/android/session/sessionList/presentation/viewHolder/SessionListTitleViewHolder;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "kotlin.jvm.PlatformType", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleMapper;", "getMapper", "()Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleMapper;", "mapper", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurrentSessionTitleViewMapper extends WidgetViewMapper2<CurrentSessionTitleComponent, SessionListDTO, SessionListVO.Title> {

    @NotNull
    private final Function2<View, ComposerReferences, SessionListTitleViewHolder> holderProducer = new CurrentSessionTitleViewMapper$holderProducer$1(this);
    private final Void layout;

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionListTitleViewHolder createViewHolder(View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView");
        return new SessionListTitleViewHolder((TextAtomView) view);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        SessionListDTO.CurrentSessionDTO currentSession;
        SessionListDTO sessionListDTO = state instanceof SessionListDTO ? (SessionListDTO) state : null;
        if (sessionListDTO == null || (currentSession = sessionListDTO.getCurrentSession()) == null) {
            return false;
        }
        return !h.K(currentSession.getTitle());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return component().getViewFactory().create(parent);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SessionListTitleViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CurrentSessionTitleComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CurrentSessionTitleComponent.class), new a(0));
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CurrentSessionTitleMapper getMapper() {
        return component().getMapper();
    }
}
