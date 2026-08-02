package ru.ozon.app.android.session.logoutonall.presentation;

import GZ.g;
import Pc.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesDTO;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R6\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;", "LPc/a;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModelImpl;", "viewModelProvider", "LGZ/g;", "screenRouter", "<init>", "(LPc/a;LGZ/g;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "LPc/a;", "LGZ/g;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewHolder;", "holderProducer", "getHolderProducer", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutOnAllDevicesViewMapper extends WidgetViewMapper<LogoutOnAllDevicesDTO, LogoutOnAllDevicesVO> {

    @NotNull
    private final Function2<View, ComposerReferences, LogoutOnAllDevicesViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<LogoutOnAllDevicesDTO, d, List<LogoutOnAllDevicesVO>> mapper;

    @NotNull
    private final g screenRouter;

    @NotNull
    private final a<LogoutOnAllDevicesViewModelImpl> viewModelProvider;

    public LogoutOnAllDevicesViewMapper(@NotNull a<LogoutOnAllDevicesViewModelImpl> viewModelProvider, @NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.viewModelProvider = viewModelProvider;
        this.screenRouter = screenRouter;
        this.layout = R$layout.widget_logout_on_all_devices;
        this.mapper = LogoutOnAllDevicesViewMapper$mapper$1.INSTANCE;
        this.holderProducer = new LogoutOnAllDevicesViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new LogoutOnAllDevicesSeparatorDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<LogoutOnAllDevicesVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<LogoutOnAllDevicesDTO, d, List<LogoutOnAllDevicesVO>> getMapper() {
        return this.mapper;
    }
}
