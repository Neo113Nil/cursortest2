package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarColors;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "", "isSelect", "Z", "()Z", "", "textCancelButton$delegate", "LSc/j;", "getTextCancelButton", "()I", "textCancelButton", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarColors {

    @NotNull
    private final Context context;
    private final boolean isSelect;

    /* renamed from: textCancelButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textCancelButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int textCancelButtonSelect = UniColors.TEXT_LIGHT_KEY.getResId();
    private static final int textCancelButtonBx = R$attr.textAction;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarColors$Companion;", "", "<init>", "()V", "textCancelButtonSelect", "", "getTextCancelButtonSelect", "()I", "textCancelButtonBx", "getTextCancelButtonBx", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTextCancelButtonBx() {
            return NavBarColors.textCancelButtonBx;
        }

        public final int getTextCancelButtonSelect() {
            return NavBarColors.textCancelButtonSelect;
        }

        private Companion() {
        }
    }

    public NavBarColors(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isSelect = SelectUtilsKt.isSelect(context);
        this.textCancelButton = LazyUtilsKt.unsafeLazy(new NavBarColors$textCancelButton$2(this));
    }

    public final int getTextCancelButton() {
        return ((Number) this.textCancelButton.getValue()).intValue();
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }
}
