package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$handleOtpCompleted$1 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ ChangeEmailViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$handleOtpCompleted$1(ChangeEmailViewHolder changeEmailViewHolder) {
        super(0);
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ChangeEmailView changeEmailView;
        changeEmailView = this.this$0.view;
        return changeEmailView.getEmail();
    }
}
