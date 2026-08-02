package com.blaze.blazesdk.shared;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.search.models.BlazeSearchScreenParams;
import com.blaze.blazesdk.features.search.ui.SearchActivity;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.a;
import defpackage.evl;
import defpackage.j1m;
import defpackage.sx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00050\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/shared/BlazeScreens;", "", "<init>", "()V", "showSearchScreen", "", "searchParams", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchScreenParams;", "completionBlock", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeScreens {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSearchScreen$default(BlazeScreens blazeScreens, BlazeSearchScreenParams blazeSearchScreenParams, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new sx1(22);
        }
        blazeScreens.showSearchScreen(blazeSearchScreenParams, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSearchScreen$lambda$0(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    @Keep
    public final void showSearchScreen(@NotNull BlazeSearchScreenParams searchParams, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        searchParams.getClass();
        completionBlock.getClass();
        try {
            Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
            if (currActivityOrApplicationContext$blazesdk_release == null) {
                j1m j1mVar = j1m.a;
                a aVar = new a();
                j1m.a(aVar);
                evl.l(aVar.d(), completionBlock);
                return;
            }
            SearchActivity.a aVar2 = SearchActivity.c;
            BlazeDataSourceType suggestionsDataSource = searchParams.getSuggestionsDataSource();
            aVar2.getClass();
            SearchActivity.a.a(currActivityOrApplicationContext$blazesdk_release, suggestionsDataSource);
            evl.l(new BlazeResult.Success(Unit.a), completionBlock);
        } catch (Throwable th) {
            j1m j1mVar2 = j1m.a;
            a aVar3 = new a();
            aVar3.f = th;
            j1m.a(aVar3);
            evl.l(aVar3.d(), completionBlock);
        }
    }

    @Keep
    public final void showSearchScreen(@NotNull BlazeSearchScreenParams blazeSearchScreenParams) {
        blazeSearchScreenParams.getClass();
        showSearchScreen$default(this, blazeSearchScreenParams, null, 2, null);
    }
}
