package com.vk.superapp.miniapps.picker;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.ProgressButton;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vkontakte.android.R;
import java.util.Comparator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import xsna.bwt0;
import xsna.drm0;
import xsna.dw20;
import xsna.iah0;
import xsna.j5g;
import xsna.jw5;
import xsna.kn20;
import xsna.p21;

/* compiled from: PickerConfirmationSheetDialog.kt */
/* loaded from: classes6.dex */
public final class j extends dw20 {
    public static final int h1 = iah0.a(56);
    public static final float i1 = iah0.b(16.0f);
    public PickerItem.d f1;
    public a g1 = new b();

    /* compiled from: PickerConfirmationSheetDialog.kt */
    public interface a {
        void b();

        void c();
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((WebImageSize) t2).d), Integer.valueOf(((WebImageSize) t).d));
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Pair pair;
        LayoutInflater from = LayoutInflater.from(mo2getContext());
        PickerItem.d dVar = this.f1;
        WebApiApplication webApiApplication = dVar != null ? dVar.g : null;
        View inflate = from.inflate(R.layout.vk_picker_confirmation_sheet, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.dialog_icon);
        View findViewById = inflate.findViewById(R.id.dialog_dismiss);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(R.id.dialog_confirm);
        if (webApiApplication != null) {
            WebImage webImage = webApiApplication.d.b;
            WebImageSize f = webImage.f(h1);
            String str = f != null ? f.b : null;
            if (str == null || drm0.N(str)) {
                for (WebImageSize webImageSize : j5g.D0(new c(), webImage.b)) {
                    if (!drm0.N(webImageSize.b)) {
                        str = webImageSize.b;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            int i = webApiApplication.f() ? R.string.vk_picker_confirm_dialog_add_game_to_chat : R.string.vk_picker_confirm_dialog_add_service_to_chat;
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                PickerItem.d dVar2 = this.f1;
                r2 = mo2getContext.getString(i, dVar2 != null ? dVar2.d : null);
            }
            pair = new Pair(str, r2);
        } else {
            pair = new Pair("", "");
        }
        String str2 = (String) pair.d();
        String str3 = (String) pair.g();
        vKImageView.load(str2);
        bwt0.d(vKImageView, i1, (r4 & 2) != 0, (r4 & 4) != 0);
        textView.setText(str3);
        bwt0.i0(findViewById, new kn20(this, 19));
        bwt0.i0(progressButton, new p21(this, progressButton, findViewById, 2));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }

    /* compiled from: PickerConfirmationSheetDialog.kt */
    public static final class b implements a {
        @Override // com.vk.superapp.miniapps.picker.j.a
        public final void b() {
        }

        @Override // com.vk.superapp.miniapps.picker.j.a
        public final void c() {
        }
    }
}
