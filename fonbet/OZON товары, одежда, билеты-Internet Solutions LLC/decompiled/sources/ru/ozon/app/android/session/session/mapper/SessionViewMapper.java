package ru.ozon.app.android.session.session.mapper;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import j10.h;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.session.data.SessionDTO;
import ru.ozon.app.android.session.session.di.DaggerSessionComponent;
import ru.ozon.app.android.session.session.di.SessionComponent;
import ru.ozon.app.android.session.session.presentation.SessionVO;
import ru.ozon.app.android.session.session.presentation.SessionViewHolder;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\t0\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/session/session/mapper/SessionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/session/session/di/SessionComponent;", "Lru/ozon/app/android/session/session/data/SessionDTO;", "Lru/ozon/app/android/session/session/presentation/SessionVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/session/session/presentation/SessionViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/session/session/mapper/SessionMapper;", "getMapper", "()Lru/ozon/app/android/session/session/mapper/SessionMapper;", "mapper", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionViewMapper extends WidgetViewMapper2<SessionComponent, SessionDTO, SessionVO> {
    private final int layout = R$layout.session;

    @NotNull
    private final Function2<View, ComposerReferences, SessionViewHolder> holderProducer = new SessionViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSessionComponent.factory().create((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(composerRootView);
        composerContainer.setBackgroundColor(a.getColor(composerContainer.getContext(), R$color.oz_semantic_bg_secondary));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SessionViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SessionComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SessionComponent.class), new AQ.a(storage, 2));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SessionMapper getMapper() {
        return component().getMapper();
    }
}
