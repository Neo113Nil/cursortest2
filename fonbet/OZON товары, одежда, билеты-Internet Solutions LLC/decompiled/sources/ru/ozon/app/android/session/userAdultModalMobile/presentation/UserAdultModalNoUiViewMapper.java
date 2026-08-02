package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import Pc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.g;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import j10.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.datePicker.DatePickerViewModel;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.databinding.AdultConfirmationWidgetLayoutBinding;
import ru.ozon.app.android.session.userAdultModalMobile.ViewAnalyticSenderDelegate;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.UserAdultModalDTO;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.ToolbarInfo;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.UserAdultModalVO;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010#J'\u0010*\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010-\u001a\u00060\u0011j\u0002`,2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b1\u00102J3\u0010:\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00032\n\u00106\u001a\u000604j\u0002`52\u000e\u00109\u001a\n\u0018\u000107j\u0004\u0018\u0001`8H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;", "Lru/ozon/app/android/session/userAdultModalMobile/ViewAnalyticSenderDelegate;", "viewAnalyticDelegate", "LPc/a;", "Lru/ozon/app/android/datePicker/DatePickerViewModel;", "datePickerViewModel", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewModel;", "adultConfirmationViewModelProvider", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper;", "mapper", "<init>", "(Lru/ozon/app/android/session/userAdultModalMobile/ViewAnalyticSenderDelegate;LPc/a;LPc/a;Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper;)V", "Landroidx/appcompat/widget/Toolbar;", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "modifyToolbar", "(Landroidx/appcompat/widget/Toolbar;Lj10/h;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/navBar/NavBarVO;", "navBarVO", "", "getColorForToolbar", "(Landroid/content/Context;Lru/ozon/app/android/storefront/navBar/NavBarVO;)I", "Landroid/view/ViewGroup;", "composerRootView", "onRemove", "(Landroid/view/ViewGroup;)V", "removeImageButton", "(Landroidx/appcompat/widget/Toolbar;)V", "resetToolbarInfo", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "viewItem", "constructLayout", "(Ll10/i;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/session/userAdultModalMobile/ViewAnalyticSenderDelegate;", "LPc/a;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper;", "getMapper", "()Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/ToolbarInfo;", "oldToolbarInfo", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/ToolbarInfo;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewHolder;", "viewHolder", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewHolder;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAdultModalNoUiViewMapper extends SingleNoUiViewMapper<UserAdultModalDTO, UserAdultModalVO> {

    @NotNull
    private final a<AdultConfirmationViewModel> adultConfirmationViewModelProvider;

    @NotNull
    private final a<DatePickerViewModel> datePickerViewModel;

    @NotNull
    private final UserAdultModalMapper mapper;
    private ToolbarInfo oldToolbarInfo;

    @NotNull
    private final ViewAnalyticSenderDelegate viewAnalyticDelegate;
    private AdultConfirmationViewHolder viewHolder;

    public UserAdultModalNoUiViewMapper(@NotNull ViewAnalyticSenderDelegate viewAnalyticDelegate, @NotNull a<DatePickerViewModel> datePickerViewModel, @NotNull a<AdultConfirmationViewModel> adultConfirmationViewModelProvider, @NotNull UserAdultModalMapper mapper) {
        Intrinsics.checkNotNullParameter(viewAnalyticDelegate, "viewAnalyticDelegate");
        Intrinsics.checkNotNullParameter(datePickerViewModel, "datePickerViewModel");
        Intrinsics.checkNotNullParameter(adultConfirmationViewModelProvider, "adultConfirmationViewModelProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.viewAnalyticDelegate = viewAnalyticDelegate;
        this.datePickerViewModel = datePickerViewModel;
        this.adultConfirmationViewModelProvider = adultConfirmationViewModelProvider;
        this.mapper = mapper;
    }

    private final int getColorForToolbar(Context context, NavBarVO navBarVO) {
        Object obj;
        String backgroundColor;
        Iterator<T> it = navBarVO.getStates().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NavBarVO.State) obj) instanceof NavBarVO.State.Default) {
                break;
            }
        }
        NavBarVO.State state = (NavBarVO.State) obj;
        return (state == null || (backgroundColor = state.getBackgroundColor()) == null) ? ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary) : StyleParser.INSTANCE.parseColor(context, backgroundColor, R$color.oz_semantic_bg_secondary);
    }

    private final void modifyToolbar(Toolbar toolbar, h<l> hVar) {
        l lVar;
        ArrayList a11 = hVar.a(NavBarVO.class);
        if (a11 == null || (lVar = (l) C7714v.M(a11)) == null) {
            return;
        }
        ViewExtKt.show(toolbar);
        c d11 = lVar.d();
        Drawable drawable = null;
        NavBarVO navBarVO = d11 instanceof NavBarVO ? (NavBarVO) d11 : null;
        if (navBarVO != null) {
            Context context = toolbar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            toolbar.setBackgroundColor(getColorForToolbar(context, navBarVO));
        }
        toolbar.setTag(Boolean.TRUE);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        Object tag = toolbar.getTag();
        this.oldToolbarInfo = new ToolbarInfo(navigationIcon, tag instanceof Boolean ? (Boolean) tag : null);
        Drawable d12 = g.d(toolbar.getContext().getResources(), R$drawable.ic_arrow_back_black, toolbar.getContext().getTheme());
        if (d12 != null) {
            d12.setTint(g.b(toolbar.getContext().getResources(), R$color.oz_semantic_text_primary, toolbar.getContext().getTheme()));
            drawable = d12;
        }
        toolbar.setNavigationIcon(drawable);
        removeImageButton(toolbar);
    }

    private final void onRemove(ViewGroup composerRootView) {
        composerRootView.removeView(composerRootView.findViewById(R$id.adultWidget));
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(composerRootView);
        if (composerToolbar != null) {
            resetToolbarInfo(composerToolbar);
        }
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
        if (composerSwipeRefresh != null) {
            ViewExtKt.show(composerSwipeRefresh);
        }
        this.viewHolder = null;
    }

    private final void removeImageButton(Toolbar toolbar) {
        View view;
        Iterator<View> it = ViewGroupExtKt.children(toolbar).iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            } else {
                view = it.next();
                if (view instanceof AppCompatImageButton) {
                    break;
                }
            }
        }
        View view2 = view;
        if (view2 == null) {
            return;
        }
        toolbar.removeView(view2);
    }

    private final void resetToolbarInfo(Toolbar toolbar) {
        ToolbarInfo toolbarInfo = this.oldToolbarInfo;
        if (toolbarInfo == null) {
            return;
        }
        toolbar.setTag(toolbarInfo != null ? toolbarInfo.getTag() : null);
        ToolbarInfo toolbarInfo2 = this.oldToolbarInfo;
        toolbar.setNavigationIcon(toolbarInfo2 != null ? toolbarInfo2.getIcon() : null);
        removeImageButton(toolbar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        AdultConfirmationViewHolder adultConfirmationViewHolder = this.viewHolder;
        if (adultConfirmationViewHolder != null) {
            c d11 = viewObject.d();
            UserAdultModalVO userAdultModalVO = d11 instanceof UserAdultModalVO ? (UserAdultModalVO) d11 : null;
            if (userAdultModalVO == null) {
                return;
            }
            adultConfirmationViewHolder.bind(userAdultModalVO);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull i container, @NotNull ComposerReferences references, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        ViewGroup Z11 = container.Z();
        h.a<l> q11 = container.J().q();
        this.viewAnalyticDelegate.setComposerReferences(references);
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(Z11);
        if (composerSwipeRefresh != null) {
            ViewExtKt.gone(composerSwipeRefresh);
        }
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(Z11);
        if (composerToolbar != null) {
            modifyToolbar(composerToolbar, q11);
        }
        AdultConfirmationWidgetLayoutBinding inflate = AdultConfirmationWidgetLayoutBinding.inflate(LayoutInflater.from(Z11.getContext()), Z11, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        w0 a11 = new z0(references.getContainer().i(), new z0.c() { // from class: ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalNoUiViewMapper$constructLayout$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = UserAdultModalNoUiViewMapper.this.datePickerViewModel;
                DatePickerViewModel datePickerViewModel = (DatePickerViewModel) aVar.get();
                Intrinsics.g(datePickerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return datePickerViewModel;
            }
        }).a(DatePickerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        DatePickerViewModel datePickerViewModel = (DatePickerViewModel) a11;
        w0 a12 = new z0(references.getContainer().i(), new z0.c() { // from class: ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalNoUiViewMapper$constructLayout$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = UserAdultModalNoUiViewMapper.this.adultConfirmationViewModelProvider;
                AdultConfirmationViewModel adultConfirmationViewModel = (AdultConfirmationViewModel) aVar.get();
                Intrinsics.g(adultConfirmationViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return adultConfirmationViewModel;
            }
        }).a(AdultConfirmationViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        this.viewHolder = new AdultConfirmationViewHolder(inflate, references, datePickerViewModel, (AdultConfirmationViewModel) a12, q11);
        final View b11 = C10183a.b(Z11);
        if (b11 != null) {
            AdultConfirmationViewHolder adultConfirmationViewHolder = this.viewHolder;
            if (adultConfirmationViewHolder != null) {
                adultConfirmationViewHolder.updateButtonBottomMargin(b11);
            }
            b11.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalNoUiViewMapper$constructLayout$lambda$3$$inlined$doOnEachNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    AdultConfirmationViewHolder adultConfirmationViewHolder2;
                    Intrinsics.f(view);
                    adultConfirmationViewHolder2 = UserAdultModalNoUiViewMapper.this.viewHolder;
                    if (adultConfirmationViewHolder2 != null) {
                        adultConfirmationViewHolder2.updateButtonBottomMargin(b11);
                    }
                }
            });
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.viewAnalyticDelegate.setComposerReferences(null);
        onRemove(composerRootView);
        return true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public UserAdultModalMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void trackView(@NotNull UserAdultModalVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.viewAnalyticDelegate.trackViewScreen(item, trackingData, viewedPond, item.getTrackingInfo());
    }
}
