package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import GZ.g;
import Ob0.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.editCredential.newCredentials.data.NewCredentialsDTO;
import ru.ozon.app.android.session.editCredential.newCredentials.data.NewCredentialsMapper;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModelImpl;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R6\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "LPc/a;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModelImpl;", "vm", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LOb0/a;", "ozonIdApi", "LGZ/g;", "ozonRouter", "<init>", "(LPc/a;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LOb0/a;LGZ/g;)V", "LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "LOb0/a;", "LGZ/g;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsViewHolder;", "holderProducer", "getHolderProducer", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewCredentialsViewMapper extends WidgetViewMapper<NewCredentialsDTO, NewCredentialsVO> {

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final Function2<View, ComposerReferences, NewCredentialsViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<NewCredentialsDTO, d, List<NewCredentialsVO>> mapper;

    @NotNull
    private final a ozonIdApi;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final Pc.a<NewCredentialsViewModelImpl> vm;

    public NewCredentialsViewMapper(@NotNull Pc.a<NewCredentialsViewModelImpl> vm, @NotNull HandlersInhibitor handlersInhibitor, @NotNull a ozonIdApi, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(ozonIdApi, "ozonIdApi");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.vm = vm;
        this.handlersInhibitor = handlersInhibitor;
        this.ozonIdApi = ozonIdApi;
        this.ozonRouter = ozonRouter;
        this.mapper = new NewCredentialsMapper();
        this.layout = R$layout.widget_edit_credentials;
        this.holderProducer = new NewCredentialsViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NewCredentialsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NewCredentialsDTO, d, List<NewCredentialsVO>> getMapper() {
        return this.mapper;
    }
}
