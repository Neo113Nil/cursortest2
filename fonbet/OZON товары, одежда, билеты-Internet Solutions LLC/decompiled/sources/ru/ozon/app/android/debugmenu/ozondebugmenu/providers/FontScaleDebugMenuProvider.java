package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import U20.a;
import U20.b;
import androidx.activity.ActivityC5043j;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/FontScaleDebugMenuProvider;", "Lr20/c;", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "fontScaleProvider", "<init>", "(Lru/ozon/app/android/analytics/startup/FontScaleProvider;)V", "LU20/a;", "provide", "()LU20/a;", "Landroidx/activity/j;", "activity", "", "onActivityCreated", "(Landroidx/activity/j;)V", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FontScaleDebugMenuProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FontScaleProvider fontScaleProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/FontScaleDebugMenuProvider$Companion;", "", "<init>", "()V", "FONT_SCALE", "", "GROUP", "FONT_SCALE_VALUE", "FONT_SCALE_COPY_COMMAND", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FontScaleDebugMenuProvider(@NotNull FontScaleProvider fontScaleProvider) {
        Intrinsics.checkNotNullParameter(fontScaleProvider, "fontScaleProvider");
        this.fontScaleProvider = fontScaleProvider;
    }

    @Override // r20.AbstractC9166c
    public void onActivityCreated(@NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AbstractC9166c.reloadGroup$default(this, null, 1, null);
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        return new a("fontScaleGroup", "Font Scale Information", C7714v.b0(new b.e("fontScaleValue", "Font Scale", String.valueOf(this.fontScaleProvider.getFontScale())), new b.c("fontScaleCopyCommand", "Скопировать команду для изменения коэффициента скейлинга шрифтов", null, FontScaleDebugMenuProvider$provide$1.INSTANCE)));
    }
}
