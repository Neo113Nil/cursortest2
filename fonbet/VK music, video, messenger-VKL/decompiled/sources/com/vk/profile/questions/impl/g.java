package com.vk.profile.questions.impl;

import android.content.Context;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.b;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.dw20;
import xsna.jqe0;
import xsna.sw50;

/* compiled from: QuestionsImpl.kt */
/* loaded from: classes5.dex */
public final class g implements sw50.p {
    @Override // xsna.sw50.p
    public final void a(Context context, ExtendedUserProfile extendedUserProfile, boolean z) {
        new b.a(context, extendedUserProfile, z).I0(null);
    }

    @Override // xsna.sw50.p
    public final void b(Context context) {
        new QuestionsListFragment.a().k(context);
    }

    @Override // xsna.sw50.p
    public final void c(Context context) {
        ((dw20.b) dw20.a.Q(new dw20.b(context, null).M(R.drawable.vk_icon_question_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.questions_bottom_sheet_title), R.string.questions_bottom_sheet_message)).h0(R.string.questions_bottom_sheet_action, new jqe0(context, 0)).I0(null);
    }
}
