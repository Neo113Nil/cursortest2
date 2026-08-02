package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\u0004\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "setLifecycleOwner", "(Landroidx/lifecycle/J;)V", "Landroid/content/Context;", "context", "setContext", "(Landroid/content/Context;)V", "Landroid/view/View;", "T", "Lkotlin/reflect/d;", "type", "acquire", "(Lkotlin/reflect/d;)Landroid/view/View;", "view", "release", "(Lkotlin/reflect/d;Landroid/view/View;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AviaSearchResultViewPool {
    @NotNull
    <T extends View> T acquire(@NotNull d<T> type);

    <T extends View> void release(@NotNull d<T> type, @NotNull T view);

    void setContext(@NotNull Context context);

    void setLifecycleOwner(@NotNull J lifecycleOwner);
}
