package ru.ozon.android.messenger.blocks.input.viewdelegates;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.Q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.views.PastePlainTextEditText;
import ru.ozon.app.android.messenger.databinding.MViewChatInputBinding;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

/* loaded from: classes10.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f85579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MViewChatInputBinding f85580b;

    public h(View view, MViewChatInputBinding mViewChatInputBinding) {
        this.f85579a = view;
        this.f85580b = mViewChatInputBinding;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        MViewChatInputBinding mViewChatInputBinding = this.f85580b;
        this.f85579a.removeOnAttachStateChangeListener(this);
        try {
            if (mViewChatInputBinding.inputEt.requestFocus()) {
                Context context = mViewChatInputBinding.inputEt.getContext();
                androidx.appcompat.app.g gVar = context instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) context : null;
                Window window = gVar != null ? gVar.getWindow() : null;
                if (window != null) {
                    new Q0(mViewChatInputBinding.inputEt, window).g(8);
                    return;
                }
                PastePlainTextEditText inputEt = mViewChatInputBinding.inputEt;
                Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
                ViewExtKt.showKeyboard(inputEt);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
    }
}
