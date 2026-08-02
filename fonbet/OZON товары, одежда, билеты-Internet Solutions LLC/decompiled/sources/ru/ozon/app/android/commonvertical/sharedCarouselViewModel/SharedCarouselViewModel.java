package ru.ozon.app.android.commonvertical.sharedCarouselViewModel;

import UZ.a;
import WZ.g;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "id", "", "setPageViewId", "(Ljava/lang/String;)V", "Lkotlin/Function2;", "LUZ/a;", "LWZ/g;", "pageIdModifier", "()Lkotlin/jvm/functions/Function2;", "pageViewId", "Ljava/lang/String;", "shared-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SharedCarouselViewModel extends w0 {

    @NotNull
    private String pageViewId = "";

    @NotNull
    public final Function2<a, g, g> pageIdModifier() {
        return new SharedCarouselViewModel$pageIdModifier$1(this);
    }

    public final void setPageViewId(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.pageViewId = id2;
    }
}
