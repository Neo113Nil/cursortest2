package ru.ozon.app.android.commonwidgets.widgets.themeSelector;

import Ar.b;
import Ar.c;
import Ar.d;
import Sc.InterfaceC3999a;
import Sc.o;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.r;
import gk0.q;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.databinding.WidgetThemeSelectorBinding;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorViewMapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorViewMapper$StubVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "darkThemeManager", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/platform/theme/DarkThemeManager;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "bindForNewAndroids", "()V", "bindForOldAndroids", "Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "status", "showStatus", "(Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;)V", "setStatus", "Landroidx/fragment/app/r;", "activity", "setNavigationBarAppearance", "(Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;Landroidx/fragment/app/r;)V", "setNavigationBarAppearanceDeprecated", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorViewMapper$StubVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetThemeSelectorBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetThemeSelectorBinding;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ThemeSelectorWidgetViewHolder extends k<ThemeSelectorViewMapper.StubVO> {

    @NotNull
    private final WidgetThemeSelectorBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final DarkThemeManager darkThemeManager;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DarkThemeManager.Status.values().length];
            try {
                iArr[DarkThemeManager.Status.NIGHT_THEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DarkThemeManager.Status.DAY_THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DarkThemeManager.Status.BY_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSelectorWidgetViewHolder(@NotNull View containerView, @NotNull DarkThemeManager darkThemeManager, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(darkThemeManager, "darkThemeManager");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.darkThemeManager = darkThemeManager;
        this.refs = refs;
        WidgetThemeSelectorBinding bind = WidgetThemeSelectorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        int i11 = 0;
        Iterator it = C7714v.b0(bind.inSystemV, bind.inSystemTv).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new b(this, i11));
        }
        WidgetThemeSelectorBinding widgetThemeSelectorBinding = this.binding;
        Iterator it2 = C7714v.b0(widgetThemeSelectorBinding.lightV, widgetThemeSelectorBinding.lightTv).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setOnClickListener(new c(this, i11));
        }
        WidgetThemeSelectorBinding widgetThemeSelectorBinding2 = this.binding;
        Iterator it3 = C7714v.b0(widgetThemeSelectorBinding2.darkV, widgetThemeSelectorBinding2.darkTv).iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setOnClickListener(new d(this, i11));
        }
    }

    private final void bindForNewAndroids() {
        showStatus(this.darkThemeManager.getStatus());
    }

    private final void bindForOldAndroids() {
        Group inSystemG = this.binding.inSystemG;
        Intrinsics.checkNotNullExpressionValue(inSystemG, "inSystemG");
        ViewExtKt.gone(inSystemG);
        showStatus(this.darkThemeManager.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(ThemeSelectorWidgetViewHolder themeSelectorWidgetViewHolder, View view) {
        themeSelectorWidgetViewHolder.setStatus(DarkThemeManager.Status.BY_SYSTEM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ThemeSelectorWidgetViewHolder themeSelectorWidgetViewHolder, View view) {
        themeSelectorWidgetViewHolder.setStatus(DarkThemeManager.Status.DAY_THEME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(ThemeSelectorWidgetViewHolder themeSelectorWidgetViewHolder, View view) {
        themeSelectorWidgetViewHolder.setStatus(DarkThemeManager.Status.NIGHT_THEME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setNavigationBarAppearance(DarkThemeManager.Status status, r activity) {
        WindowInsetsController insetsController;
        int i11 = 0;
        boolean z11 = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        int i12 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new o();
                }
            }
            i11 = 16;
        }
        insetsController = activity.getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.setSystemBarsAppearance(i11, 16);
        }
    }

    @InterfaceC3999a
    private final void setNavigationBarAppearanceDeprecated(DarkThemeManager.Status status, r activity) {
        int systemUiVisibility;
        int i11;
        int systemUiVisibility2;
        boolean z11 = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int i12 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                systemUiVisibility2 = decorView.getSystemUiVisibility();
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                if (z11) {
                    systemUiVisibility = decorView.getSystemUiVisibility();
                } else {
                    systemUiVisibility2 = decorView.getSystemUiVisibility();
                }
            }
            i11 = systemUiVisibility2 | 16;
            decorView.setSystemUiVisibility(i11);
        }
        systemUiVisibility = decorView.getSystemUiVisibility();
        i11 = systemUiVisibility ^ 16;
        decorView.setSystemUiVisibility(i11);
    }

    private final void setStatus(DarkThemeManager.Status status) {
        if (status == this.darkThemeManager.getStatus()) {
            return;
        }
        q.f64554a.a();
        this.darkThemeManager.setStatus(status);
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                setNavigationBarAppearance(status, a11);
            } else if (i11 >= 27) {
                setNavigationBarAppearanceDeprecated(status, a11);
            }
            a11.recreate();
        }
    }

    private final void showStatus(DarkThemeManager.Status status) {
        this.binding.inSystemV.setSelected(status == DarkThemeManager.Status.BY_SYSTEM);
        this.binding.lightV.setSelected(status == DarkThemeManager.Status.DAY_THEME);
        this.binding.darkV.setSelected(status == DarkThemeManager.Status.NIGHT_THEME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ThemeSelectorViewMapper.StubVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (Build.VERSION.SDK_INT >= 29) {
            bindForNewAndroids();
        } else {
            bindForOldAndroids();
        }
    }
}
