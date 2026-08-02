package com.vk.id.captcha.web.a;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import com.vk.id.captcha.R$drawable;
import com.vk.id.captcha.R$id;
import com.vk.id.captcha.R$layout;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.VKCaptcha;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f60591a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f60592b;

    /* renamed from: c, reason: collision with root package name */
    private Button f60593c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "");
        bVar.getActivity().finish();
        VKCaptcha.INSTANCE.closeCaptcha$captcha_release(a.c.INSTANCE);
    }

    @Override // android.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "");
        return new a(activity);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View inflate = layoutInflater != null ? layoutInflater.inflate(R$layout.vk_captcha_fragment, (ViewGroup) null) : null;
        this.f60591a = inflate != null ? (ImageView) inflate.findViewById(R$id.vkid_logo) : null;
        this.f60592b = inflate != null ? (ImageView) inflate.findViewById(R$id.antenna) : null;
        this.f60593c = inflate != null ? (Button) inflate.findViewById(R$id.retry_btn) : null;
        ImageView imageView = this.f60591a;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.logo_vkid);
        }
        ImageView imageView2 = this.f60592b;
        if (imageView2 != null) {
            imageView2.setImageResource(R$drawable.antenna);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Button button = this.f60593c;
        if (button != null) {
            button.setOnClickListener(new CG.a(this, 12));
        }
        return inflate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setGravity(80);
    }
}
