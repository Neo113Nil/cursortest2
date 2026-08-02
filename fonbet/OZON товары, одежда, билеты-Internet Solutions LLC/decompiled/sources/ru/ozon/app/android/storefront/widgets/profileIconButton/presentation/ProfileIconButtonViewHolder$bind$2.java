package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "key", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonViewHolder$bind$2 extends AbstractC7737t implements Function2<AtomAction, String, Unit> {
    final /* synthetic */ ProfileIconButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonViewHolder$bind$2(ProfileIconButtonViewHolder profileIconButtonViewHolder) {
        super(2);
        this.this$0 = profileIconButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, String str) {
        invoke2(atomAction, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ProfileIconButtonView profileIconButtonView;
        SharedPreferences sharedPreferences3;
        if (str == null || (atomAction instanceof AtomAction.ViewAction)) {
            return;
        }
        sharedPreferences = this.this$0.sharedPreferences;
        if (sharedPreferences.contains("indicator_key")) {
            sharedPreferences3 = this.this$0.sharedPreferences;
            if (Intrinsics.d(sharedPreferences3.getString("indicator_key", null), str)) {
                return;
            }
        }
        sharedPreferences2 = this.this$0.sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putString("indicator_key", str);
        edit.commit();
        profileIconButtonView = this.this$0.containerView;
        profileIconButtonView.toggleIndicatorVisibility(false);
    }
}
