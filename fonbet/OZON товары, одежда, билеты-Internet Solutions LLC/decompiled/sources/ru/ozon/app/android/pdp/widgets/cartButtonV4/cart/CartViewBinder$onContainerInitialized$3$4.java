package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import android.content.SharedPreferences;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartViewBinder$onContainerInitialized$3$4 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ CartViewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartViewBinder$onContainerInitialized$3$4(CartViewBinder cartViewBinder) {
        super(1);
        this.this$0 = cartViewBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String deeplink) {
        SharedPreferences sharedPreferences;
        ComposerNavigator composerNavigator;
        SharedPreferences sharedPreferences2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        int i11 = Calendar.getInstance().get(6);
        sharedPreferences = this.this$0.sharedPreferences;
        if (i11 > sharedPreferences.getInt(deeplink, 0)) {
            composerNavigator = this.this$0.composerNavigator;
            ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, deeplink, null, 2, null);
            sharedPreferences2 = this.this$0.sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putInt(deeplink, i11);
            edit.apply();
        }
    }
}
